/* Copyright 2026 The Android Open Source Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.android.settings.inputmethod;

import android.content.Context;
import android.os.SystemProperties;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.android.settings.core.BasePreferenceController;

/** Uses the existing persistent RRO selectors; never imports or resets legacy preferences. */
public class J716fPointerStylePreferenceController extends BasePreferenceController
        implements Preference.OnPreferenceChangeListener {
    private static final String PEN = "persist.sys.overlay.spen_pointer";
    private static final String TRANSPARENT = "persist.sys.overlay.trans_pointer";

    public J716fPointerStylePreferenceController(Context context, String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override public int getAvailabilityStatus() {
        return "p11_pro_plus".equals(SystemProperties.get("ro.product.vendor.device"))
                ? AVAILABLE : UNSUPPORTED_ON_DEVICE;
    }

    @Override public void updateState(Preference preference) {
        boolean pen = SystemProperties.getBoolean(PEN, false);
        boolean transparent = SystemProperties.getBoolean(TRANSPARENT, false);
        // Conflicting legacy flags remain unselected until the user explicitly chooses.
        ((ListPreference) preference).setValue(pen && transparent ? null
                : transparent ? "transparent" : pen ? "pen" : "mouse");
    }

    @Override public boolean onPreferenceChange(Preference preference, Object value) {
        if (!(value instanceof String)) return false;
        String selected = (String) value;
        if (!"mouse".equals(selected) && !"pen".equals(selected)
                && !"transparent".equals(selected)) return false;
        if ("pen".equals(selected)) {
            SystemProperties.set(TRANSPARENT, "false");
            SystemProperties.set(PEN, "true");
        } else {
            SystemProperties.set(PEN, "false");
            SystemProperties.set(TRANSPARENT, "transparent".equals(selected) ? "true" : "false");
        }
        ((ListPreference) preference).setValue(selected);
        return true;
    }
}
