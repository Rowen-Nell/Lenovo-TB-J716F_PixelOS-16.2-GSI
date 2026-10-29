# 充电修补boot：精确二进制复现

这是原厂预编译内核的二进制数据表修补，**不是源码编译内核成果**。原文件名中的experimental是封装时名称，现已通过本机限定场景，不改名或改字节。

外部输入必须是匹配ZUI15的完整boot：100,663,296字节，SHA256 84cba57ff27e34669fa34d0b78d776ad621960898cdfbca3c70bcd4645043105。它不包含在公开仓库中，由用户从合法匹配的原厂材料获得。其他boot、Magisk修补boot、截短文件均会拒绝；不要为绕过检查改SHA常量。

原始Image为39,528,464字节，SHA a60d6de51822a18358ad005991bb11c08b34e0e66f28589cdab738902eb7d46c。唯一内核数据修改：Image偏移0x24a465c，完整boot偏移0x24a565c，bq27541 CURRENT_NOW槽0x72→0x14。候选Image SHA 51fe3b7f48a4100f20336601b3c91452886dfafc458eb45543f680b8a9d7612f。

## 运行（仅主机离线）

Python3标准库即可。先仅在RAM中生成并校验，不写新镜像：

```sh
python3 tools/reproduce-charging-boot.py --stock-boot /path/to/stock/boot.img --check-only
```

未来需要实际复现文件时，明确指定一个不存在的输出路径：

```sh
python3 tools/reproduce-charging-boot.py --stock-boot /path/to/stock/boot.img --output /path/to/new/boot-r28-charging-current-reg14-experimental.img
```

脚本拒绝错误输入和覆盖已有文件，包括原输入；不会操作设备、下载数据或生成/读取密钥。输出必须是100,663,296字节、SHA256 7fc26675bf5f38c58ae4ff877508327dbe8c81671a5159e8f69a01089897a882。本轮只执行check-only及错误输入拒绝验证，未生成大镜像副本、未重跑既有48项ARM64模拟。

## 格式及完整性

保持Android boot v2/4096页、ramdisk、DTB、命令行、地址/OS字段和全部填充。完整boot仅53字节变化：内核数据1、legacy boot SHA1 ID20、AVB SHA256摘要32。脚本按AOSP mkbootimg v2次序重算ID，按原盐和42,291,200字节payload重算AVB哈希；新完整SHA与原来经avbtool正式封装且已经安装的文件一致。无需重编system或内核。

原/新boot均AVB Algorithm NONE/auth0，无OEM密码签名；本脚本不伪造签名。现有r28使用已实证安装的顶层vbmeta flags2且BL解锁；不能在恢复原厂强校验链或锁BL后声称此修改受OEM信任。本轮不改vbmeta。保留的原参数中含androidboot.selinux=permissive等，未纳入额外SELinux/显示/限流/温控修改。回退输入就是原厂完整boot，SHA同上述输入；它不是Recovery分区镜像。

机器证据表明电流反馈来源修正，真实亮屏PPS外部约18W；不宣称45W/全场景快充或完成内核项目目标。原厂boot/内核及Google/OEM大二进制不进入源码仓库，发布前仍须审定对应再分发/源码义务。
