/*
 * Copyright 2026 TB_J716F contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by law or agreed in writing, distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.android.server.display;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.UserHandle;
import android.provider.Settings;
import android.hardware.display.DisplayManagerInternal.DisplayPowerRequest;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemProperties;
import android.view.Display;
import android.view.SurfaceControlHdrLayerInfoListener;

import com.android.server.display.brightness.BrightnessReason;
import com.android.internal.display.BrightnessUtils;

import java.io.PrintWriter;

/** Default-off paired experiment for J716F's legacy composer. Handler-thread confined. */
final class LegacyHdrBrightnessController {
    // Private paired protocol with LegacyHdrDimming.h, not a public HAL capability.
    static final int FRAME_ANNOTATED = 1 << 28;
    static final int REAL_HDR_CONTENT = 1 << 29;
    static final int UNSUPPORTED_MIX = 1 << 30;
    private static final float RATIO_CAP = readRatioCap();
    private static final boolean ENABLED =
            SystemProperties.getBoolean("ro.surface_flinger.tb04_legacy_hdr_gpu", false)
            && "p11_pro_plus".equals(SystemProperties.get("ro.product.vendor.device", ""))
            && LegacyHdrBrightnessPolicy.validCap(RATIO_CAP);

    private final Handler mHandler;
    private final Runnable mOnChanged;
    private final boolean mPrimary;
    private final ContentResolver mResolver;
    private final boolean mHonorHdrSettings;
    private final ContentObserver mHdrSettingsObserver;
    private boolean mObservingSettings;
    private int mUserId = UserHandle.USER_CURRENT;
    private boolean mHdrBrightnessEnabled = true;
    private float mHdrBrightnessBoostLevel = 1f;
    private DisplayDeviceConfig mConfig;
    private IBinder mToken;
    private float mDesiredRatio = 1f;
    private int mFrameFlags;
    private float mLastSdr = Float.NaN;
    private float mLastDisplay = Float.NaN;
    private float mLastLimit = Float.NaN;

    private final SurfaceControlHdrLayerInfoListener mListener =
            new SurfaceControlHdrLayerInfoListener() {
                @Override
                public void onHdrInfoChanged(IBinder token, int count, int width, int height,
                        int flags, float desiredRatio) {
                    mHandler.post(() -> {
                        if (token != mToken) return;
                        final boolean eligible = count > 0 && width > 0 && height > 0
                                && (flags & FRAME_ANNOTATED) != 0
                                && (flags & REAL_HDR_CONTENT) != 0
                                && (flags & UNSUPPORTED_MIX) == 0;
                        final float next = eligible && desiredRatio > 1f ? desiredRatio : 1f;
                        if (Float.compare(next, mDesiredRatio) != 0 || flags != mFrameFlags) {
                            mDesiredRatio = next;
                            mFrameFlags = flags;
                            mOnChanged.run();
                        }
                    });
                }
            };

    LegacyHdrBrightnessController(Context context, Handler handler, Runnable onChanged,
            int displayId, boolean honorHdrSettings) {
        mHandler = handler;
        mOnChanged = onChanged;
        mPrimary = displayId == Display.DEFAULT_DISPLAY;
        mResolver = context.getContentResolver();
        mHonorHdrSettings = honorHdrSettings;
        mHdrSettingsObserver = new ContentObserver(handler) {
            @Override
            public void onChange(boolean selfChange, Uri uri) {
                updateHdrSettings(true);
            }
        };
    }

    private void updateHdrSettings(boolean notify) {
        final boolean enabled = Settings.Secure.getIntForUser(mResolver,
                Settings.Secure.HDR_BRIGHTNESS_ENABLED, 1, mUserId) != 0;
        final float level = Settings.Secure.getFloatForUser(mResolver,
                Settings.Secure.HDR_BRIGHTNESS_BOOST_LEVEL, 1f, mUserId);
        final boolean changed = enabled != mHdrBrightnessEnabled
                || Float.compare(level, mHdrBrightnessBoostLevel) != 0;
        mHdrBrightnessEnabled = enabled;
        mHdrBrightnessBoostLevel = level;
        if (notify && changed) mOnChanged.run();
    }

    void onUserSwitch(int userId) {
        mUserId = userId;
        if (mObservingSettings) updateHdrSettings(true);
    }

    private void unregisterHdrSettings() {
        if (mObservingSettings) mResolver.unregisterContentObserver(mHdrSettingsObserver);
        mObservingSettings = false;
        mHdrBrightnessEnabled = true;
        mHdrBrightnessBoostLevel = 1f;
    }

    static boolean isEnabledForDisplay(boolean primary, DisplayDeviceConfig config) {
        return ENABLED && primary && config.getHdrBrightnessData() == null
                && config.getHighBrightnessModeData() == null
                && !config.isEvenDimmerAvailable();
    }

    void onDisplayChanged(DisplayDeviceConfig config, IBinder token) {
        final boolean enabled = isEnabledForDisplay(mPrimary, config);
        mConfig = config;
        if (mToken == token && enabled) return;
        if (mToken != null) mListener.unregister(mToken);
        unregisterHdrSettings();
        mToken = null;
        mDesiredRatio = 1f;
        mFrameFlags = 0;
        if (enabled && token != null) {
            mToken = token;
            mListener.register(token);
            if (mHonorHdrSettings) {
                mResolver.registerContentObserver(Settings.Secure.getUriFor(
                        Settings.Secure.HDR_BRIGHTNESS_ENABLED), false,
                        mHdrSettingsObserver, UserHandle.USER_ALL);
                mResolver.registerContentObserver(Settings.Secure.getUriFor(
                        Settings.Secure.HDR_BRIGHTNESS_BOOST_LEVEL), false,
                        mHdrSettingsObserver, UserHandle.USER_ALL);
                mObservingSettings = true;
                updateHdrSettings(false);
            }
        }
    }

    float choose(float sdr, float limit, DisplayPowerRequest request,
            DisplayBrightnessState state, int displayState) {
        mLastSdr = sdr;
        mLastLimit = limit;
        final int modifiers = state.getBrightnessReason().getModifier();
        if (mToken == null || (mHonorHdrSettings && !mHdrBrightnessEnabled)
                || displayState != Display.STATE_ON || request.lowPowerMode
                || (modifiers & (BrightnessReason.MODIFIER_DIMMED
                        | BrightnessReason.MODIFIER_LOW_POWER)) != 0) {
            mLastDisplay = sdr;
            return sdr;
        }
        // Apply the same gamma-to-linear UI convention as HdrBrightnessModifier.
        // Scale only the extra headroom of the existing experiment cap; retain all limits.
        final float userCap = mHonorHdrSettings
                ? 1f + (RATIO_CAP - 1f)
                        * BrightnessUtils.convertGammaToLinear(mHdrBrightnessBoostLevel)
                : RATIO_CAP;
        mLastDisplay = LegacyHdrBrightnessPolicy.choose(sdr, limit, mDesiredRatio, userCap,
                new LegacyHdrBrightnessPolicy.Curve() {
                    @Override public float toNits(float value) {
                        return mConfig.getNitsFromBacklight(
                                mConfig.getBacklightFromBrightness(value));
                    }
                    @Override public float fromNits(float nits) {
                        return mConfig.getHdrBrightnessFromSdr(sdr,
                                nits / mConfig.getNitsFromBacklight(
                                        mConfig.getBacklightFromBrightness(sdr)));
                    }
                });
        return mLastDisplay;
    }

    boolean isRunning() { return mToken != null; }

    void stop() {
        unregisterHdrSettings();
        if (mToken != null) mListener.unregister(mToken);
        mToken = null;
        mDesiredRatio = 1f;
    }

    void dump(PrintWriter pw) {
        pw.println("LegacyHdrBrightnessController: enabled=" + ENABLED + " ratioCap=" + RATIO_CAP
                + " listening=" + (mToken != null) + " desired=" + mDesiredRatio
                + " flags=" + mFrameFlags + " S=" + mLastSdr + " D=" + mLastDisplay
                + " limit=" + mLastLimit + " settingsObserved=" + mObservingSettings
                + " userEnabled=" + mHdrBrightnessEnabled
                + " userBoostLevel=" + mHdrBrightnessBoostLevel);
    }

    private static float readRatioCap() {
        try {
            return Float.parseFloat(SystemProperties.get("persist.sys.tb04_hdr_ratio_cap", ""));
        } catch (NumberFormatException e) {
            // No experiment parameter supplied: disabled, never a product ratio default.
            return Float.NaN;
        }
    }
}
