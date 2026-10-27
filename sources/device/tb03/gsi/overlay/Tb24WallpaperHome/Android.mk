# SPDX-License-Identifier: Apache-2.0
LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_PACKAGE_NAME := Tb24WallpaperHomeTypographyOverlay
LOCAL_PRODUCT_MODULE := true
LOCAL_SDK_VERSION := current
LOCAL_CERTIFICATE := platform
LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res
# Use the unchanged Google prebuilt as an actual aapt include, not a fake resource stub.
tb24_wallpaper_apk := vendor/pixel/themepicker/common/proprietary/system_ext/priv-app/WallpaperPickerGoogleRelease/WallpaperPickerGoogleRelease.apk
LOCAL_AAPT_FLAGS += --package-id 0x7e --allow-reserved-package-id -I $(tb24_wallpaper_apk)
LOCAL_ADDITIONAL_DEPENDENCIES := $(tb24_wallpaper_apk)
include $(BUILD_RRO_PACKAGE)
# Track the private resource ABI on the real link edge as well as the signed APK.
$(call intermediates-dir-for,APPS,Tb24WallpaperHomeTypographyOverlay,,COMMON)/package-res.apk: $(tb24_wallpaper_apk)
