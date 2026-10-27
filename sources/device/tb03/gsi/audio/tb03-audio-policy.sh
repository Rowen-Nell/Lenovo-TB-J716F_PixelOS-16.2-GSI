#!/system/bin/sh
# Exact ZUI15: preserve wired routes; use standard mixed output for communication.
# This HAL downmixes non-enhanced VoIP writes after configuring stereo PCM.
case "$(getprop ro.product.device)" in
    tb03_arm64|J716F) ;;
    *) exit 0 ;;
esac
[ "$(getprop ro.product.vendor.device)" = "p11_pro_plus" ] || exit 0
[ "$(getprop ro.vendor.build.version.sdk)" = "30" ] || exit 0
[ "$(getprop persist.sys.phh.caf.audio_policy)" != "1" ] || exit 0
policy=/vendor/etc/audio_policy_configuration.xml
digest=$(sha256sum "$policy")
digest=${digest%% *}
case "$digest" in
    1fd6a80388d25cfeb0f7d190ea249449219095f8e21930342b42b3d4d2dadd11) exit 0 ;;
    80204c1a3fa3c0f95e900f125595d7b290c35c4b9f640296fc4313d1a64fead3|f9ca1afe97e98be3270d527a0e6f2ff7e11f5d54f2c748370038f334d11fc39a) ;;
    *) log -t TB03-audio "Unrecognized vendor policy; leave it unchanged"; exit 1 ;;
esac
hal=/vendor/lib64/hw/audio.primary.kona.so
hal_digest=$(sha256sum "$hal")
hal_digest=${hal_digest%% *}
[ "$hal_digest" = "88141126b307223ed3f0d80495832154238a0cf0ed06acca8a7981fd8cc9f970" ] || {
    log -t TB03-audio "Unrecognized primary HAL; leave policy unchanged"
    exit 1
}
mount -o bind /system/etc/tb03_wired_audio_policy_configuration.xml "$policy" || exit 1
log -t TB03-audio "Applied exact ZUI15 wired routes and mixed communication output; VOIP_TX/SCO retained"
