#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0
set -eo pipefail
CANDIDATE=$(cd -- "$(dirname -- "$0")" && pwd)
SRC=${ANDROID_SOURCE:?set ANDROID_SOURCE to the pinned patched source checkout}
cd "$SRC"
export OUT_DIR=${OUT_DIR:-out-r28-beta-reproduction}
case "$OUT_DIR" in /*) echo 'Use a relative independent OUT_DIR' >&2; exit 1;; esac
if [ -d "$OUT_DIR" ] && [ -n "$(find "$OUT_DIR" -mindepth 1 -print -quit)" ]; then
    echo 'OUT_DIR must be empty; no old outputs are copied or deleted by this script' >&2
    exit 1
fi
CUSTOM_BUILD_DATE=$(python3 -c 'import json,sys; print(json.load(open(sys.argv[1]))["stamp"])' "$CANDIDATE/build-identity.json")
BUILD_DATETIME=$(python3 -c 'import json,sys; print(json.load(open(sys.argv[1]))["incremental"])' "$CANDIDATE/build-identity.json")
export CUSTOM_BUILD_DATE BUILD_DATETIME
export USE_CCACHE=0 USE_RBE=false BUILD_USERNAME=tb03 BUILD_HOSTNAME=tb03
export TMPDIR="$PWD/.Codex/r28-build/tmp"
mkdir -p "$TMPDIR"
export GOCACHE="$PWD/$OUT_DIR/.gocache"
export GOGC=20 GOMEMLIMIT=16GiB GOMAXPROCS=4 NINJA_HIGHMEM_NUM_JOBS=1
unset OVERRIDE_ENABLE_UFFD_GC RUSTC_WRAPPER CCACHE_EXEC
export NINJA_ARGS='-d keeprsp -d keepdepfile'
# Before running: apply the final source delta, bind the fixed private signing
# authority, and make the documented build-only HDR true/cap2 edit. See BUILD.md.
source build/envsetup.sh
lunch pixelos_tb03_arm64_ext4-bp4a-userdebug
m systemimage apksigner deapexer dexdump idmap2 fsck.erofs -j"${BUILD_JOBS:-8}"
