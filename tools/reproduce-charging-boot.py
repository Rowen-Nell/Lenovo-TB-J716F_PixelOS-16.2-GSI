#!/usr/bin/env python3
# SPDX-License-Identifier: Apache-2.0
"""Reproduce the exact r28 CURRENT_NOW binary boot patch; never flash a device."""
import argparse
import hashlib
import json
from pathlib import Path
import struct

STOCK_SIZE = 100663296
STOCK_SHA256 = '84cba57ff27e34669fa34d0b78d776ad621960898cdfbca3c70bcd4645043105'
PATCHED_SHA256 = '7fc26675bf5f38c58ae4ff877508327dbe8c81671a5159e8f69a01089897a882'
STOCK_KERNEL_SHA256 = 'a60d6de51822a18358ad005991bb11c08b34e0e66f28589cdab738902eb7d46c'
PATCHED_KERNEL_SHA256 = '51fe3b7f48a4100f20336601b3c91452886dfafc458eb45543f680b8a9d7612f'
KERNEL_OFFSET = 4096
KERNEL_SIZE = 39528464
RAW_PATCH_OFFSET = 0x24a465c
PAYLOAD_SIZE = 42291200
AVB_DIGEST_OFFSET = 42291624
SALT = bytes.fromhex('62ac0f5467196b77aead127c1a4fcfb7dbaf2d642ce1d216b88f35d1640cce3b')


def sha256(data):
    return hashlib.sha256(data).hexdigest()


def require(condition, reason):
    if not condition:
        raise ValueError(reason)


def legacy_id(image):
    # Standard mkbootimg v2 SHA1: component bytes then little-endian size,
    # including the zero sizes for absent second and recovery_dtbo components.
    page = struct.unpack_from('<I', image, 36)[0]
    sizes = [struct.unpack_from('<I', image, off)[0] for off in (8, 16, 24, 1632, 1648)]
    pos = page
    h = hashlib.sha1()
    for size in sizes:
        h.update(image[pos:pos + size])
        h.update(struct.pack('<I', size))
        pos += (size + page - 1) // page * page
    require(pos == PAYLOAD_SIZE, 'Unexpected component boundaries')
    return h.digest()


def reproduce(stock):
    require(len(stock) == STOCK_SIZE and sha256(stock) == STOCK_SHA256,
            'Input is not the exact accepted stock boot; refusing to patch')
    require(stock[:8] == b'ANDROID!' and struct.unpack_from('<II', stock, 36) == (4096, 2),
            'Expected boot v2 with 4096-byte pages')
    require(sha256(stock[KERNEL_OFFSET:KERNEL_OFFSET + KERNEL_SIZE]) == STOCK_KERNEL_SHA256,
            'Stock kernel identity mismatch')
    require(stock[576:596] == legacy_id(stock), 'Stock legacy boot ID mismatch')
    footer = struct.unpack('>4sIIQQQ28s', stock[-64:])
    require(footer[:6] == (b'AVBf', 1, 0, PAYLOAD_SIZE, PAYLOAD_SIZE, 896),
            'Unexpected AVB layout')
    require(stock[PAYLOAD_SIZE:PAYLOAD_SIZE + 4] == b'AVB0'
            and struct.unpack_from('>I', stock, PAYLOAD_SIZE + 28)[0] == 0
            and struct.unpack_from('>Q', stock, PAYLOAD_SIZE + 12)[0] == 0,
            'Only the original unsigned NONE AVB scheme is supported')
    require(stock[AVB_DIGEST_OFFSET:AVB_DIGEST_OFFSET + 32]
            == hashlib.sha256(SALT + stock[:PAYLOAD_SIZE]).digest(),
            'Stock AVB payload hash mismatch')
    result = bytearray(stock)
    where = KERNEL_OFFSET + RAW_PATCH_OFFSET
    require(result[where] == 0x72, 'Unexpected original register')
    result[where] = 0x14
    require(sha256(result[KERNEL_OFFSET:KERNEL_OFFSET + KERNEL_SIZE]) == PATCHED_KERNEL_SHA256,
            'Patched kernel differs from the accepted one-byte candidate')
    result[576:596] = legacy_id(result)
    # Algorithm NONE has no authentication block/signature. Regenerate the
    # payload hash; preserve its salt, properties, header, footer and padding.
    result[AVB_DIGEST_OFFSET:AVB_DIGEST_OFFSET + 32] = hashlib.sha256(SALT + result[:PAYLOAD_SIZE]).digest()
    require(sha256(result) == PATCHED_SHA256, 'Result differs from the accepted complete boot')
    allowed = set(range(576, 596)) | {where} | set(range(AVB_DIGEST_OFFSET, AVB_DIGEST_OFFSET + 32))
    changes = []
    for start in range(0, len(stock), 65536):
        a, b = stock[start:start + 65536], result[start:start + 65536]
        if a != b:
            changes.extend(start + i for i, (x, y) in enumerate(zip(a, b)) if x != y)
    require(set(changes) == allowed, 'Unexpected differences outside the 53 accepted bytes')
    return result, dict(bytes=len(result), sha256=PATCHED_SHA256, kernel_sha256=PATCHED_KERNEL_SHA256,
                        kernel_data_changes=1, whole_boot_changed_bytes=len(changes),
                        avb_algorithm='NONE', source_built_kernel=False)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--stock-boot', required=True, type=Path)
    mode = parser.add_mutually_exclusive_group(required=True)
    mode.add_argument('--check-only', action='store_true', help='Compute and verify in RAM; create no image file')
    mode.add_argument('--output', type=Path, help='Write to a new, nonexistent file; existing files are never overwritten')
    args = parser.parse_args()
    try:
        result, report = reproduce(args.stock_boot.read_bytes())
        if args.output is not None:
            with args.output.open('xb') as target:
                target.write(result)
        report['image_file_created'] = args.output is not None
        print(json.dumps(report, indent=2))
    except (ValueError, OSError) as exc:
        parser.error(str(exc))


if __name__ == '__main__':
    main()
