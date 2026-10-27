/*
 * Copyright 2026 TB_J716F contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#pragma once

#include <cmath>
#include <cstdint>

namespace android::compositionengine::impl::legacy_hdr {

inline constexpr int32_t kFrameAnnotated = 1 << 28;
inline constexpr int32_t kRealHdrContent = 1 << 29;
inline constexpr int32_t kUnsupportedMix = 1 << 30;

// Values are supplied by the real display brightness calibration, in cd/m^2.
// Invalid/off/unknown values must not turn an SDR scene into an HDR scene.
inline bool validWhitePoints(float sdr, float display) {
    return std::isfinite(sdr) && std::isfinite(display) && sdr > 0.f && display >= sdr;
}

inline bool forceClient(float sdr, float display, bool protectedContent, bool sideband) {
    return validWhitePoints(sdr, display) && display > sdr && !protectedContent && !sideband;
}

} // namespace android::compositionengine::impl::legacy_hdr
