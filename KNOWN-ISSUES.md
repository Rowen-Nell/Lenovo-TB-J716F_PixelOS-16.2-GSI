# 当前限制与未完成项

**Permissive / userdebug；安全验收未完成。** Enforcing按用户决定暂停，不作为首个测试Beta的当前阻塞，最终日用版目标仍要求Enforcing及完整安全验收。没有合入SELinux候选或新增allow/豁免；本轮system和boot字节保持。

r28已安装并启动，Google登录/Play下载打开/Chrome基础使用通过；旧“r28未启动、Google基础使用待测”已过时。认证、Integrity、云端名称和全部Google场景未获通过结论。HDR实验true/cap2和热点既知限制保持，不重新排查。

充电电流反馈和亮屏PPS约18W已通过本机有界场景；不是45W/熄屏/全SOC/长期热安全结论。原厂内核仍为预编译二进制，修补一个寄存器表字节并重算完整性字段；未完成自编内核、配套设备Recovery或内核源码目标。

扩容电池容量异常按用户实测的电池侧问题收束；不改ROM容量、不把Scene统计当物理容量测定，具体电芯/计量板/配置分因未独立证实。充电反馈修正的有效结果不因此撤销。

boot实际安装路径为独立原厂Recovery中的fastbootd，is-userspace=yes；旧Bootloader flash boot_a曾返回unknown command，禁止重放。原厂boot回退文件已准备且SHA与原输入一致，但本次未实际触发回退，不冒称恢复流程已执行。

保留有限启动日志缺口与第三方解锁前CE异常，不能宣称完整无crash。跨Alpha签名保留数据迁移、Beta→Beta升级、全部硬件/长期稳定性仍未全部验收。个人数据须另行备份。

发布仍待中枢核验、Google/OEM二进制再分发及所需许可证/源码义务审定、固定签名密钥独立离线保管状态确认。公开源码仓库不含原厂大二进制或私钥。测试Beta不是官方认证或最终ROM完成声明。
