# PixelOS 16.2 for Lenovo TB-J716F

**非官方 · 从源码构建 · TB-J716F 定向适配 GSI**

基于 PixelOS 与 Treble 兼容工程，为联想小新 Pad Pro 2021（TB-J716F）适配的 Android 16 系统。沿用 **ZUI15.0.485 的 vendor、底层固件和原厂 Recovery**，配套原厂 boot 的充电电流修补方案。目前仅验证 TB-J716F。

当前版本：**PixelOS-16.2_arm64_20261027.028 (Beta)**
发布范围：本仓库提供源码修改、构建与安装资料。**系统镜像附件暂未公开发布**；文件准备在维护者草稿中进行。Google/OEM 闭源依赖说明见 [第三方组件](THIRD-PARTY.md)。后续下载以 [Releases](https://github.com/Rowen-Nell/Lenovo-TB-J716F_PixelOS-16.2-GSI/releases) 为准。

> 当前为测试 Beta：SELinux **Permissive**，构建类型 **userdebug**，完整安全与长期稳定性验收尚未完成。不是 PixelOS、Lenovo 或 Google 官方发行版。

## 下载与安装

- [版本说明](RELEASE-NOTES.md) · [文件与 SHA256](SHA256SUMS)
- **首次安装前阅读 [安装与恢复指南](INSTALL.md)**：从匹配 ZUI15 底座全新安装，首次安装会清除用户数据。
- [充电 boot 复现](CHARGING-BOOT.md)：原厂和修补 boot 均不作为下载附件提供，请按安装指南从匹配原厂 boot 在电脑上生成。

系统以压缩的 `.img.zst` 形式作为 Release 附件候选提供，解压为 `system.img` 后刷入。源码下载 ZIP 不是刷机包。镜像不提交到 Git 历史。

## 已完成的适配

- TB-J716F 设备名称、型号及 USB/MTP 显示信息。
- 移除 TrebleApp 和电话、短信、通讯录等预装入口，清理测试残留。
- 平板相关默认项、Hall/双击等适配，壁纸界面修正及蜂窝快捷入口清理。
- 本机完成 ZUI 恢复后的全新安装、系统启动及锁屏重启解锁验证；Google 登录、Play 普通应用下载和 Chrome 基础使用通过。
- 配套充电修补：电流反馈恢复；本机亮屏 PPS 场景外部测得约 **18W**，未验证所有充电条件或 45W。

具体测试范围见 [已验证结果](VALIDATED-RESULTS.md)。

## 使用前了解

- [已知问题](KNOWN-ISSUES.md)：Permissive、HDR/热点限制、Google 认证及未覆盖的验收项。
- 当前是 **GSI 路线的机型适配版本**，尚未完成自编设备内核、配套 PixelOS Recovery 和完整 OTA 升级验收。
- 配套 boot 是原厂二进制修补，不是源码编译的内核。没有其他型号兼容性承诺，请勿重新锁定 Bootloader。

## 源码与构建

本仓库公开本版的修改与复现资料；完整上游源码由固定清单获取：

| 内容 | 入口 |
|---|---|
| 固定源码与修改集 | [manifest.xml](manifest.xml)、[source-lock.json](source-lock.json)、[series.json](series.json) |
| 构建与补丁应用 | [BUILD.md](BUILD.md)、[build-reference.sh](build-reference.sh)、[apply.py](apply.py) |
| boot 修补说明 | [CHARGING-BOOT.md](CHARGING-BOOT.md) |
| 来源和许可 | [LICENSES.md](LICENSES.md)、[LICENSE](LICENSE) |
| 公开内容范围 | [PRIVACY.md](PRIVACY.md) |

源码中的 `tb03_arm64` 等名称属于保留的构建目标，不能通过简单改名替换；对外版本使用上面的 PixelOS 名称。本仓库不包含私钥、设备独有资料、个人备份或 Google/OEM 大二进制。

感谢 [PixelOS](https://github.com/PixelOS-AOSP)、AOSP、TrebleDroid/phhusson 及相关上游贡献者。各组件保留原有版权和许可证，本项目的许可不授予 Google/OEM 二进制再分发权。
