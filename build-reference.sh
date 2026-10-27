#!/usr/bin/env bash
set -eo pipefail
TB=${TB03_ROOT:?set TB03_ROOT}
R=${R28_METADATA:?set R28_METADATA}
export PATH="$TB/tools/git-lfs-root/usr/bin:$PATH"
export TMPDIR="$TB/tmp"
export OUT_DIR="out-r28-beta-clean-20261027"
export USE_CCACHE=0 USE_RBE=false BUILD_USERNAME=tb03 BUILD_HOSTNAME=tb03
export GOCACHE="$TB/src/$OUT_DIR/.gocache"
export GOGC=20 GOMEMLIMIT=16GiB GOMAXPROCS=4 NINJA_HIGHMEM_NUM_JOBS=1
unset OVERRIDE_ENABLE_UFFD_GC RUSTC_WRAPPER CCACHE_EXEC
export NINJA_ARGS="-d keeprsp -d keepdepfile"
source "$R/build-identity.env"
cd "$TB/src"
source build/envsetup.sh
lunch pixelos_tb03_arm64_ext4-bp4a-userdebug
m systemimage apksigner deapexer dexdump idmap2 fsck.erofs -j8