# Lenovo TB-J716F：PixelOS 16.2 首个测试 Beta 候选

版本保持 **PixelOS-16.2_arm64_20261027.028 (Beta)**。本次配套为现有 r28 system 加已实测 CURRENT_NOW 充电修补 boot，镜像字节不变。当前为待中枢核验的 GitHub 公开候选，尚未上传；不是最终日用版或官方 PixelOS/联想发行版。

**当前 SELinux 是 Permissive，保留 userdebug，安全验收未完成。** Enforcing 工作按用户决定暂停，不作为本次测试 Beta 的当前阻塞；不代表项目最终安全目标降低。

已实测：r28 全新安装与启动、Google 登录/Play 下载打开/Chrome 基础使用；充电修补 boot 经原厂 fastbootd 写入并首启通过；本机亮屏 PPS 场景电流反馈正确、外部表稳定约9V×2A=18W。不是全工况、45W或Google认证/Integrity结论。容量异常采用用户电池侧实测结论，不修改 ROM 容量。

本目录仅含源码增量、固定 manifest、公开证书、文档与复现脚本，不含 system/boot/Google APK 等大二进制、私钥或私人日志。完整配套文件名/大小/SHA见 release-files.json、SHA256SUMS；system、压缩件、修补 boot 和原厂 boot 恢复输入均在源码仓库外。

- INSTALL.md：原厂 fastbootd 安装和原厂 boot 回退；不要使用曾返回 unknown command 的 BL flash 路径。
- CHARGING-BOOT.md、tools/reproduce-charging-boot.py：对精确外部原厂 boot 做二进制修补与校验，不是自编内核。
- VALIDATED-RESULTS.md、KNOWN-ISSUES.md、TEST-CARD.md：已验结果、当前限制、后续接收边界；不重复已有设备试验。
- BUILD.md、build-reference.sh：system 的既有生产源码构建参考，本轮未运行构建。series.json 为最终增量；不要同时叠加 reviewed 历史补丁。
- LICENSES.md、PRIVACY.md：公开边界与仍需审定的二进制再分发条件。
