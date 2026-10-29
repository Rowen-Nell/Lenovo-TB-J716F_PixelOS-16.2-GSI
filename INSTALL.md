# TB-J716F r28配套安装与原厂boot回退

配套：既有028 system + 当前寄存器修补boot，全部文件名/大小/SHA见release-files.json、SHA256SUMS。raw system 4,337,688,576B；压缩件不是刷写容量；两个完整boot各100,663,296B（96MiB）。源码仓库不提供这些大二进制。

当前Permissive/userdebug、安全验收未完成；测试者应知悉。本说明给出已实证路线，不是代替当次设备/分区/数据影响确认的自动刷写脚本。保持BL解锁，不Root、不锁BL、不额外改SELinux/温控/FCC。先备份个人数据；关键分区备份不包含userdata。

## 首次从ZUI15全新安装

已验底座为ZUI15.0.485及其原厂boot、vendor、独立Recovery/fastbootd。先按匹配原厂恢复材料完成ZUI恢复并确认能启动、Recovery入口可用。完整恢复可能影响userdata/metadata、固件与分区表，须另外列清输入/范围；不要盲用一键脚本或旧设备会话。Alpha保留数据迁移不是首发路线。

1. 核对设备TB-J716F、当前槽A/解锁、原厂Recovery及无快照、实际LP组和system容量；运行名J716F、构建输出tb03_arm64、vendor p11_pro_plus不同属预期。解压后必须匹配raw system SHA，不能用压缩大小代替容量。
2. 从Bootloader执行下列入口，然后确认`is-userspace=yes`，原厂fastbootd product为p11_pro_plus。Bootloader product kona属正常，但**不能在is-userspace=no时执行flash boot_a**，旧BL命令曾返回unknown command。示例中的SERIAL必须换为当次已核设备，不复用他人设备标识。

```text
fastboot -s SERIAL reboot fastboot
fastboot -s SERIAL getvar is-userspace
fastboot -s SERIAL getvar current-slot
fastboot -s SERIAL getvar unlocked
fastboot -s SERIAL getvar snapshot-update-status
```

3. 已验路线为A槽；必须确认current-slot=a、unlocked=yes、snapshot none和实际容量。若不是A或条件不符，停止，不把命令批量换B、不删除product/system_ext或重排分区。按完整范围卡在原厂fastbootd一次写system_a：

```text
fastboot -s SERIAL -S 64M flash system_a system.img
```

4. 首次GSI安装复用精确教程vbmeta输入（4096B，SHA b3281c527ecf2a6a743b37f5b9e118f492d2038e0a82e6777d292d1c5b42601a，flags2），在已列明数据/安全影响的首次安装范围内写vbmeta_a。该小二进制同样为外部匹配输入；不生成替代密钥或临时修改flags来启动。对应单次命令为`fastboot -s SERIAL flash vbmeta_a vbmeta-input.img`（仅首次全新GSI范围，不在boot-only更新时重刷）。原厂Recovery执行一次明确授权的userdata初始化，再正常启动r28。未匹配输入/恢复流程时不要猜命令。
5. 首次Android启动后用户自行解锁、启用USB调试并批准自己的RSA提示；没有预授权本机ADB公钥。版本应为PixelOS-16.2_arm64_20261027.028 (Beta)，incremental1793089111。此时沿用原厂boot完成首次启动，再按下一节装配套修补boot，复现已有成功顺序。没有把“两镜像合并前一次首启”冒充已测路线。

## 已运行r28：仅安装配套充电boot，保留userdata

已实证：原厂fastbootd对physical/raw boot_a完整96MiB的Sending 98,304KiB和Writing均成功，随后首启通过。旧BL直接flash拒绝不是充电失败；不要重放该命令。

已在真fastbootd则不来回切模式；在BL用上节reboot fastboot；Android正常时可从已有原厂Recovery入口进入。再次核当前A槽、is-userspace=yes、解锁/无快照、boot_a=0x6000000、raw/physical、下载上限至少完整96MiB（已测256MiB）。核对修补boot SHA，随后仅一次：

```text
fastboot -s SERIAL flash boot_a boot-r28-charging-current-reg14-experimental.img
fastboot -s SERIAL reboot
```

boot不加-S64M/force/disable，不resize物理分区或LP，不再写system/vbmeta/vendor/dtbo/recovery，不清数据或切槽。Sending成功而Writing失败不算成功；异常停止，保存日志，不连续重试。

首启核正常桌面、boot_completed与核心服务。系统仍为028、内核banner仍4.19.157-perf+，不能单凭版本识别新boot；绑定实际输入SHA、命令/目标、写入成功与新启动记录。已有本机证明不含分区SHA读回，不宣称写后逐字节验证。当前既有用户无需为本次资料整理再次刷写或重测。

## 原厂boot条件回退

回退输入boot-r28-stock-restore.img，96MiB，SHA84cba57ff27e34669fa34d0b78d776ad621960898cdfbca3c70bcd4645043105。它是原boot的精确副本，不是recovery.img。

在约定的启动故障/需退出实验等条件且授权覆盖时，通过同一**独立原厂fastbootd**入口、同样前检向同一boot_a槽写一次：

```text
fastboot -s SERIAL flash boot_a boot-r28-stock-restore.img
fastboot -s SERIAL reboot
```

从BL必须先reboot fastboot并确认userspace=yes，不能直接BL flash。无法进入原厂Recovery/fastbootd时停止，不自动改走EDL、刷Recovery/ABL或vbmeta。原厂boot回退恢复内核和boot参数，保留r28 system及userdata，不会恢复整个ZUI或撤销其他状态；本次未触发实际回退，不保证未测故障均可恢复。

本机亮屏PPS已改善，“无改善再ZUI”条件未触发，不自动恢复ZUI或清数据。若未来有新的具体故障，保留有限证据再决定下一完整范围。Google基础使用已通过，不要求重复登记/清Google数据；认证与Integrity另属未完成项。
