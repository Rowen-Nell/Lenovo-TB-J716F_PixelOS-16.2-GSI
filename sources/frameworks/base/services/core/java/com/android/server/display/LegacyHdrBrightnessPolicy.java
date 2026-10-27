/*
 * Copyright 2026 TB_J716F contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by law or agreed in writing, distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.android.server.display;

/** Experimental ordinary-envelope arithmetic. No panel peak, HBM, or default boost. */
final class LegacyHdrBrightnessPolicy {
    interface Curve {
        float toNits(float brightness);
        float fromNits(float nits);
    }

    static boolean validCap(float cap) {
        return Float.isFinite(cap) && cap >= 1f;
    }

    static float choose(float sdr, float maxBrightness, float desiredRatio, float ratioCap,
            Curve curve) {
        if (!Float.isFinite(sdr) || sdr < 0f || sdr > 1f
                || !Float.isFinite(maxBrightness) || maxBrightness <= sdr
                || maxBrightness > 1f || !validCap(ratioCap) || ratioCap == 1f
                || !(desiredRatio > 1f)) {
            return sdr;
        }
        final float sdrNits = curve.toNits(sdr);
        final float maxNits = curve.toNits(maxBrightness);
        if (!(sdrNits > 0f) || !Float.isFinite(sdrNits)
                || !Float.isFinite(maxNits) || maxNits <= sdrNits) {
            return sdr;
        }
        final float targetNits = Math.min(maxNits,
                sdrNits * Math.min(desiredRatio, ratioCap));
        float mapped = curve.fromNits(targetNits);
        if (!Float.isFinite(mapped)) return sdr;
        mapped = Math.max(sdr, Math.min(maxBrightness, mapped));
        final float mappedNits = curve.toNits(mapped);
        if (!Float.isFinite(mappedNits) || mappedNits < sdrNits) return sdr;
        if (mappedNits > targetNits) {
            // Forward/inverse interpolating splines need not be exact inverses.
            // Refine against the existing forward calibration, never fabricate a curve.
            float low = sdr;
            float high = mapped;
            for (int i = 0; i < 24; i++) {
                final float mid = low + (high - low) * 0.5f;
                if (curve.toNits(mid) <= targetNits) low = mid;
                else high = mid;
            }
            mapped = low;
        }
        return mapped;
    }

    static boolean skipHdrRamp(boolean running, float display, float sdr,
            float previousDisplay, float previousSdr) {
        return running && (display > sdr || previousDisplay > previousSdr);
    }

    static float acceptedRatio(boolean accepted, float displayNits, float sdrNits) {
        if (!accepted || !Float.isFinite(displayNits) || !Float.isFinite(sdrNits)
                || !(sdrNits > 0f) || displayNits < sdrNits) return Float.NaN;
        final float ratio = displayNits / sdrNits;
        return Float.isFinite(ratio) ? ratio : Float.NaN;
    }
}
