# PixelOS-16.2_arm64_20261027.028 (Beta)

2026-10-29配套整理：r28 system与已实测充电修补boot共同作为首个GitHub测试Beta候选，待中枢核验、未上传。版本号和所有镜像字节保持；不重新编译、压缩或复制大镜像。

文件、大小、SHA见release-files.json和SHA256SUMS；对应的既有二进制在源码仓库外，原厂boot是外部精确输入与回退材料。原先生成的源码ZIP是充电配套更新前的历史快照，不作为本次公开候选；当前以本Git目录及其新提交为准，本轮不重新压缩ZIP。

r28启动、Google基础使用、修补boot的fastbootd安装首启，以及本机亮屏PPS约18W/电流反馈已实测。当前Permissive、安全验收未完成、Enforcing暂停；完整范围见VALIDATED-RESULTS.md和KNOWN-ISSUES.md。安装和原厂boot回退仅用INSTALL.md中的原厂fastbootd路径。
