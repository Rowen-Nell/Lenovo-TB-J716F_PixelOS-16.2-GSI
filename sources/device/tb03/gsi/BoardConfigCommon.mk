include build/make/target/board/generic_arm64/BoardConfig.mk
include device/phh/treble/board-base.mk
BOARD_EXT4_SHARE_DUP_BLOCKS := true
TARGET_SYSTEM_PROP := device/tb03/gsi/system.prop $(filter-out device/phh/treble/system.prop,$(TARGET_SYSTEM_PROP))

# Reviewed GSI properties: authenticated ADB and normal permission enforcement.
TARGET_SYSTEM_EXT_PROP := device/tb03/gsi/system_ext.prop

# Exact Repo-exported baseline; current project revisions checked before packaging.
BUILD_MANIFEST_XML_INPUT := device/tb03/gsi/manifest-pinned.xml

# Product values with spaces are parsed from the file without Make word splitting.
TARGET_PRODUCT_PROP += device/tb03/gsi/product.prop

# Fixed release authority for this product only.
include device/tb03/gsi/signing/BoardConfigRelease.mk
