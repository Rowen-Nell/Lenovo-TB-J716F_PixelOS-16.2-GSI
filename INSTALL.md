# Fresh-install acceptance route

Restore the documented ZUI15 baseline, then install this Beta with freshly initialized userdata under a separately authorized installation card. Alpha retained-data migration is not an acceptance requirement. Back up personal files first: the old critical-partition backup does not contain userdata. Keep the bootloader unlocked. Do not flash folded product/system_ext separately or relock. No device operation is performed by this build.

Before installation recheck hardware/vendor p11_pro_plus, actual slot, fastbootd/snapshots and dynamic-partition capacity. Verify raw-image SHA256 after decompression; compressed size is not flash size. Use the delivered INSTALL-TB02.md and existing reviewed ZUI15 procedure for the precise bounded write/wipe scope. Do not treat this source document as authorization to flash or erase anything.

Runtime name J716F is expected; build/output remains tb03_arm64. The image has normal ADB authorization and no local preauthorized public key. After first boot the owner unlocks, enables USB debugging and approves their own RSA prompt. Google sign-in/registration and certification remain separate fresh-install tests. A return to Alpha can require fresh userdata because the signing authority changed. Restore steps need a new device authorization.
