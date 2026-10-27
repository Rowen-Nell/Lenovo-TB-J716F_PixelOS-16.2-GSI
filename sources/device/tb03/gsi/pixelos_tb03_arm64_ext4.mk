# TB03: PixelOS16.2/QPR2, ARM64+ARM32 binder64 GSI; no device boot/vendor output.
CUSTOM_BUILD := tb03_arm64
TARGET_SCREEN_WIDTH := 1080
TARGET_SUPPORTS_64_BIT_APPS := true
TARGET_GAPPS_ARCH := arm64
include build/make/target/product/aosp_arm64.mk
$(call inherit-product, device/phh/treble/base.mk)
$(call inherit-product, vendor/custom/config/common_full_tablet_wifionly.mk)
$(call inherit-product, device/lineage/sepolicy/common/sepolicy.mk)
$(call inherit-product, vendor/lineage/config/BoardConfigSoong.mk)

PRODUCT_NAME := pixelos_tb03_arm64_ext4
PRODUCT_DEVICE := tb03_arm64
# Runtime hardware identity; TARGET_DEVICE/output paths stay tb03_arm64.
PRODUCT_BUILD_PROP_OVERRIDES += DeviceName=J716F
PRODUCT_MODEL := Lenovo TB-J716F
PRODUCT_BRAND := Lenovo
PRODUCT_MANUFACTURER := Lenovo
PRODUCT_CHARACTERISTICS := tablet
CUSTOM_BUILD := tb03_arm64
GSI_FILE_SYSTEM_TYPE := ext4
TARGET_NO_KERNEL_OVERRIDE := true
TARGET_NO_KERNEL_IMAGE := true
PRODUCT_OTA_ENFORCE_VINTF_KERNEL_REQUIREMENTS := false
TARGET_USES_PREBUILT_VENDOR_SEPOLICY := true
TARGET_SCREEN_WIDTH := 1080
TARGET_BOOT_ANIMATION_RES := 1080
TARGET_SUPPORTS_64_BIT_APPS := true
PRODUCT_EXTRA_VNDK_VERSIONS := 30 31 32 33 34
# Make add_json_bool treats any nonempty value as true; leave this switch unset.
PRODUCT_NOT_DEBUGGABLE_IN_USERDEBUG :=
# Secure ADB and kernel/audit logging are supplied by the reviewed Treble base.
PRODUCT_PACKAGES_DEBUG := $(filter-out su,$(PRODUCT_PACKAGES_DEBUG))

# Exact optional stock ZUI15 HAL declarations; no kernel FCM/version relaxation.
DEVICE_FRAMEWORK_COMPATIBILITY_MATRIX_FILE += device/tb03/gsi/compatibility_matrix.zui15.xml

# TB03-r6: targeted stock wired delta plus the existing optional sysbta contract.
PRODUCT_COPY_FILES += \
    device/tb03/gsi/audio/audio_policy_configuration.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/tb03_wired_audio_policy_configuration.xml \
    device/tb03/gsi/audio/tb03-audio-policy.sh:$(TARGET_COPY_OUT_SYSTEM)/bin/tb03-audio-policy.sh

# TB04: honor observed driver regulatory events only on the stock J716F vendor.
PRODUCT_PACKAGES += Tb03WifiRegEventsOverlay

# TB04 BUG-006: clear stale composition override for all J716F color modes.
PRODUCT_PACKAGES += Tb03J716FColorPolicyOverlay

# J716F magnetic-cover adaptation; native framework and Settings own the other inputs.
$(call inherit-product, device/phh/treble/j716f_input_backend/product.mk)

# Native input ownership is complete for the r22 upgrade baseline.
# Inherited app retirement is enforced by J716fInputBackend.overrides;
# companion copy-files are gated in base.mk for this product.
PRODUCT_PACKAGES := $(filter-out TrebleApp,$(PRODUCT_PACKAGES))

# Remove only the old package's companion allowlist/power-save files on this product.
PRODUCT_COPY_FILES := $(filter-out \
    device/phh/treble/privapp-permissions-me.phh.treble.app.xml:system/etc/permissions/privapp-permissions-me.phh.treble.app.xml \
    device/phh/treble/sysconfig-me.phh.treble.app.xml:system/etc/sysconfig/sysconfig-me.phh.treble.app.xml,\
    $(PRODUCT_COPY_FILES))

# Use genuine GMS/Play identity and the platform attestation result on this product.
# Existing explicit persistent user choices still take precedence over defaults.
PRODUCT_SYSTEM_PROPERTIES += \
    persist.sys.pihooks.disable.gms_props=true \
    persist.sys.pihooks.disable.gms_key_attestation_block=true

# Wi-Fi tablet product: remove user-facing cellular apps, preserve providers/frameworks.
PRODUCT_PACKAGES := $(filter-out Dialer GoogleDialer Messaging messaging GoogleMessages GoogleContacts Contacts Stk GoogleDialerOverlayCustom DeviceDiagnostics Traceur,$(PRODUCT_PACKAGES))
PRODUCT_PACKAGES_DEBUG := $(filter-out DeviceDiagnostics Traceur,$(PRODUCT_PACKAGES_DEBUG))
# Retire the optional remote-debug auto-start service, its client and helper.
PRODUCT_COPY_FILES := $(filter-out device/phh/treble/remote/dbclient:system/bin/dbclient device/phh/treble/remote/phh-remotectl.rc:system/etc/init/phh-remotectl.rc device/phh/treble/remote/phh-remotectl.sh:system/bin/phh-remotectl.sh,$(PRODUCT_COPY_FILES))
# Names are defaults only. Existing user-selected settings are never rewritten.
PRODUCT_PACKAGE_OVERLAYS += device/tb03/gsi/overlay/product

# J716F uses the stock non-GKI 4.19 kernel and runtime CC, not UFFD/CMC.
# Match dexpreopt artifacts to this device; do not replace libart or the kernel.
PRODUCT_ENABLE_UFFD_GC := false

# Scoped Google wallpaper homepage titles; no shared style or subpage override.
PRODUCT_PACKAGES += Tb24WallpaperHomeTypographyOverlay

# r28 Beta: real local project release signing; PRESIGNED dependencies stay original.
include device/tb03/gsi/signing/product-release.mk
