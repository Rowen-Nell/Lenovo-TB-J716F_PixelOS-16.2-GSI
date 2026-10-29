# 第三方组件与非官方发布说明

本项目公开自己的修改、固定源码清单和复现脚本；并不把所有第三方软件重新许可为 Apache-2.0。

## PixelOS 项目身份

[PixelOS 官方 FAQ](https://blog.pixelos.net/docs/users/faqs/) 允许个人构建和分发非官方版本，并说明这些版本不由官方构建或审查。[官方 Legal](https://blog.pixelos.net/docs/users/legal/) 第9及11节要求清楚标注非官方身份、不得暗示官方背书。本项目使用“Unofficial / 非官方、TB-J716F 定向适配 GSI”标注，不声称官方设备支持。

## Google 与其他预编译依赖

r28 使用的 GMS 来源为 PixelOS-AOSP/proprietary_vendor_pixel_gms-16.2，固定提交 `3f9f9680febe2f2298bb5f50ec60d4cd4e1a1a51`，完整依赖见 manifest.xml 与 PREINSTALLED-APPS.md。[Google 的 GMS 页面](https://www.android.com/gms/) 说明 GMS 不属于 AOSP，适用独立许可；PixelOS Legal 第8及10节也将各组件的权利和许可留给其原权利人。

构建来源、公开可见的仓库或提取清单不是 Google/OEM 的统一再分发授权。本次核对未找到上游向所有非官方构建授予这些第三方二进制再分发权的条文；也不据此推断已确认任何特定发布被禁止。本版作为非官方测试 Beta 发布；发布本身不构成对第三方软件的重新许可或认证。保留各组件原有版权、许可和系统法律通知。

## 原厂内核与 boot

本版发布流程不附带完整原厂或修补 boot 二进制。用户自行取得匹配的原厂 boot，使用公开脚本在自己的电脑上生成修补文件，具体命令见 INSTALL.md。脚本不是完整内核源码；没有宣称已取得精确原厂内核的完整对应源码。今后若分发内核二进制，仍需按其适用许可证处理对应源码等事项。最终自编并验证设备内核的项目目标保持未完成。

## 发布签名

公开证书与 AVB 公钥仅用于识别签名。私钥不随仓库或镜像发布；私钥独立保管属于维护者的恢复和后续升级维护事项，不能由“已经上传附件”推导为完成。
