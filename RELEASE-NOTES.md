# PixelOS-16.2_arm64_20261027.028 (Beta)

适用设备：**Lenovo TB-J716F（小新 Pad Pro 2021）**。
固件基线：**ZUI15.0.485**。
系统构建日期：2026-10-27；配套发布资料更新：2026-10-29。
这是非官方测试 Beta，不是完整设备固件或官方认证系统。

## 本版内容

本版包含 PixelOS 16.2 系统的设备适配、应用精简、名称和 MTP 信息修正、壁纸界面及平板默认项修正。另提供从精确原厂 boot 复现充电电流修补的脚本和说明。本轮发布整理未重新构建或改变已测试镜像。

已完成本机全新安装和启动、有限锁屏重启解锁、Google 基础使用，以及修补 boot 的启动和亮屏 PPS 约18W充电验证。更多范围见 [VALIDATED-RESULTS.md](VALIDATED-RESULTS.md)。

## 安装文件

| 文件 | 用途 |
|---|---|
| `PixelOS-16.2_arm64_20261027.028-Beta.img.zst` | 系统镜像的压缩发布候选；解压后刷入 system_a |
| `SHA256SUMS` | 压缩系统、解压系统及配套 boot 的校验值；列出校验值不代表文件已提供下载 |
| 源码和 `tools/reproduce-charging-boot.py` | 公开修改及 boot 修补复现工具；与 GitHub 自动生成的源码 ZIP 一同可获取 |

原始 system 为 **4,337,688,576 B**，压缩件为 **2,059,450,674 B**。完整 boot 为 **100,663,296 B**。完整清单见 [release-files.json](release-files.json)。原厂 boot、修补 boot、教程 vbmeta 等外部输入的获取与校验见 [INSTALL.md](INSTALL.md)，不是源码 ZIP 的内容。

按 [安装与恢复指南](INSTALL.md) 操作。首发已验证路线是从匹配 ZUI15 全新安装，并清除用户数据；随后安装配套充电 boot。不能把本版当作已验证的 Alpha 保留数据更新或完整 OTA 包。

## 当前限制

- SELinux Permissive / userdebug；完整安全验收未完成。
- Google 基础服务可用不等于 Play 认证或 Play Integrity 通过。
- HDR 和热点仍有已知限制；完整硬件覆盖、长期稳定性及 Beta 间升级尚未验收。
- 内核沿用原厂二进制并修补，尚未完成自编内核与配套 PixelOS Recovery。
- 充电结论限于本次亮屏 PPS 场景，不代表45W或所有温度/电量场景。

完整限制见 [KNOWN-ISSUES.md](KNOWN-ISSUES.md)。

## 源码对应

上一个已核验配套提交：`2b5da5474845006cf1052da6617688ad9f2d8477`。发布库在此基础上整理文档，生产补丁、固定源码和镜像字节保持；发布标签绑定最终公开资料提交。

镜像附件仍需按 LICENSES.md 中的现有项目记录确定发布范围；本文件是发布说明，不表示尚未上传的附件已经可用。
