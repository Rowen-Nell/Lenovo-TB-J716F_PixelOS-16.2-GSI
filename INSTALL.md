# TB-J716F 安装 PixelOS 16.2（Windows）

这篇从 **已经能正常使用的 ZUI15.0.485** 开始。平板必须是 **Lenovo TB-J716F**，Bootloader 已解锁。解锁和恢复 ZUI 不包含在本文中。

**第一次安装会清空平板里的应用、照片和其他个人文件，请先备份。** 当前是测试 Beta，SELinux 为 Permissive，具体限制见 [已知问题](KNOWN-ISSUES.md)。

整个过程是：**准备文件 → 生成充电修补 boot → 刷入系统 → 清数据并首次开机 → 安装修补 boot。**

如果已经装好本版、只是补装充电修复，完成第1、2步后直接看第6步，不用重刷系统或清数据。

## 1. 把文件准备到同一个文件夹

电脑准备以下工具：

- [Android SDK Platform-Tools（Windows版）](https://developer.android.com/tools/releases/platform-tools)：提供 `adb.exe` 和 `fastboot.exe`。
- [最新版7-Zip](https://www.7-zip.org/)：用于解压 `.zst` 系统镜像和 `.7z` 原厂包。
- [Python 3（Windows版）](https://www.python.org/downloads/windows/)：只用于在电脑上生成修补 boot，不需要安装额外 Python 库。

再从 [本版下载页](https://github.com/Rowen-Nell/Lenovo-TB-J716F_PixelOS-16.2-GSI/releases/tag/v16.2-20261027.028-beta) 下载：

| 文件 | 用来做什么 |
|---|---|
| `PixelOS-16.2_arm64_20261027.028-Beta.img.zst` | 系统镜像 |
| `J716F-r28-install-tools.zip` | 本指南配套的小辅助包，包含 `vbmeta.img` 和 boot 修补脚本 |
| `SHA256SUMS` | 校验文件 |

**还要自行准备原厂 `boot.img`：** 从 `TB_J716F_ZUI_15.0.485.7z` 原厂包的 `image` 文件夹取出。这里要的是原厂文件，不是 Magisk 修改过的 boot。原厂包和完整 boot 不在本版下载附件里。

在电脑上新建一个 `J716F-Flash` 文件夹，留出至少10GB空间，然后：

1. 把 Platform-Tools 解压后的**所有文件**复制进去，不能只拿两个 exe。
2. 用7-Zip解压下载的 `.img.zst`，把解压出来的 `.img` 改名为 `system.img`，放进去。
3. 解压辅助包，把其中的 `vbmeta.img` 和 `reproduce-charging-boot.py` 放进去。
4. 把原厂 `boot.img` 放进去并保留，后面回退会用到。

准备好后，文件夹大致如下。Windows请打开“显示文件扩展名”，避免把文件误命名为 `system.img.img`。

```text
J716F-Flash/
  adb.exe
  fastboot.exe
  AdbWinApi.dll
  AdbWinUsbApi.dll
  ...其他 Platform-Tools 文件...
  system.img
  vbmeta.img
  boot.img
  reproduce-charging-boot.py
```

打开这个文件夹，在资源管理器地址栏输入 `powershell` 并回车。**后面的命令都在这个窗口里执行。** 命令前面的 `.\` 表示使用当前文件夹里的文件，不用改成项目路径，也不用填写设备序列号。

先检查系统和 vbmeta：

```powershell
Get-FileHash .\system.img, .\vbmeta.img -Algorithm SHA256
```

结果应与下面一致，哈希大小写不影响比较。`system.img` 大小应为 **4,337,688,576 字节**；`vbmeta.img` 为 **4,096 字节**。

| 文件 | SHA256 |
|---|---|
| system.img | `7ec077d2f97d37b0ada486d6de022c3dc575c6bd962c3d38e08c4421ef979ea6` |
| vbmeta.img | `b3281c527ecf2a6a743b37f5b9e118f492d2038e0a82e6777d292d1c5b42601a` |

## 2. 在电脑上生成充电修补 boot

执行：

```powershell
python .\reproduce-charging-boot.py --stock-boot .\boot.img --output .\boot-patched.img
```

成功后，文件夹里会多出 `boot-patched.img`。脚本会自动检查原厂输入和生成结果，**这一条命令不会刷平板**。

如果提示 Python 不存在，先完成 Python 安装并重新打开 PowerShell；如果提示 boot 不匹配，重新检查原厂包和取出的文件。若输出文件已经存在，不要反复生成，先确认是否就是前面成功生成的文件。

## 3. 从 ZUI 进入 fastbootd

电脑只连接这一台安卓设备，关闭安卓模拟器。在平板的“关于平板”里连续点击7次“版本号”，按提示开启开发者选项，再在开发者选项中打开 USB 调试。连接电脑后，同意平板弹出的 USB 调试授权。

先执行：

```powershell
.\adb.exe devices
```

列表中应只有这台平板，后面是 `device`。若显示 `unauthorized`，先在平板上同意授权；列表为空则先处理连接或驱动，暂不刷写。

然后执行：

```powershell
.\adb.exe reboot fastboot
```

平板会重启到刷机界面。接着执行下面四条检查命令：

```powershell
.\fastboot.exe getvar is-userspace
.\fastboot.exe getvar current-slot
.\fastboot.exe getvar unlocked
.\fastboot.exe getvar snapshot-update-status
```

应看到：

| 检查项 | 正确结果 |
|---|---|
| is-userspace | `yes`，表示现在是 fastbootd |
| current-slot | `a`，本指南只覆盖已验证的A槽路线 |
| unlocked | `yes`，表示Bootloader已解锁 |
| snapshot-update-status | `none` |

**fastbootd 和 Bootloader fastboot 是两个界面，不能只看电脑能识别就开始刷。** 如果 `is-userspace` 是 `no`，先运行下面这条切换，再重新检查：

```powershell
.\fastboot.exe reboot fastboot
```

其他结果不符合表格时，先停在这里确认底座状态，不要自行切槽或删除分区。

## 4. 写入系统和 vbmeta

**每次只执行一条，上一条成功后再执行下一条。** 写入过程中保持USB连接。

先刷系统：

```powershell
.\fastboot.exe -S 64M flash system_a .\system.img
```

系统较大，会显示多段 `Sending` / `Writing`。等整个命令结束，确认没有 `FAILED`，再刷 vbmeta：

```powershell
.\fastboot.exe flash vbmeta_a .\vbmeta.img
```

两条均成功后，进入原厂 Recovery：

```powershell
.\fastboot.exe reboot recovery
```

这里保留原厂 vendor、Recovery 和其他固件；不需要另外刷 product/system_ext，也不需要手动调整分区大小。

## 5. 在 Recovery 清数据，然后首次启动

这一步需要在**平板屏幕**操作：

1. 选择“清除数据 / 恢复出厂”并确认。菜单文字会随 Recovery 语言有所不同，目标是清除用户数据。
2. 等操作完成，选择 `Reboot system now`（重启系统）。
3. 等待 PixelOS 初始设置向导，完成设置并进入桌面。

第一次开机可能较慢。如果15分钟仍无法进入设置向导，或一直反复重启，停止继续刷写，保留报错信息反馈。

**先完成这次首次启动，再安装下面的充电修补 boot。** 这与本机实际验证的安装顺序一致。

## 6. 安装充电修补 boot

在 PixelOS 中重新开启 USB 调试，同意电脑授权。仍使用原来的 PowerShell 窗口和刷机文件夹。

先让平板进入 Bootloader：

```powershell
.\adb.exe reboot bootloader
```

等界面切换完成，再进入 fastbootd：

```powershell
.\fastboot.exe reboot fastboot
```

确认下面两项仍为 `yes` 和 `a`：

```powershell
.\fastboot.exe getvar is-userspace
.\fastboot.exe getvar current-slot
```

然后刷入第2步生成的文件：

```powershell
.\fastboot.exe flash boot_a .\boot-patched.img
```

成功后重启：

```powershell
.\fastboot.exe reboot
```

回到桌面后，在“关于平板”中确认版本为 **PixelOS-16.2_arm64_20261027.028 (Beta)**，安装完成。保留刷机文件夹里的原厂 `boot.img` 作为回退文件。

## 7. Google 服务：遇到未认证拦截时自行注册

首次使用时，如果 Google 登录、Play 商店或 Chrome 被“此设备未经 Google Play 保护机制认证”提示拦住，可能需要先登记**这次安装生成的 GSF ID**。能正常使用时无需为了这个步骤重新注册。

这是 Google 为自定义 ROM 用户提供的设备登记入口。本项目此前已在一台测试机上完成登记并验证 Google 登录、Play 下载和 Chrome 基础使用；这不是所有设备或应用均可用的保证。

### 获取自己平板当前的 GSF ID

平板联网、解锁并开启 USB 调试，在前面的刷机文件夹打开 PowerShell。下面的命令只读取信息，不需要 Root，也不修改系统。

先执行这行，它只保留 GMS 诊断结果中的 ID 字段：

```powershell
$gsf = .\adb.exe shell dumpsys activity provider com.google.android.gms/.gservices.provider.GservicesProvider | Select-String '^\s*AndroidId\s*:\s*(?:0x)?([0-9a-fA-F]+)\s*$'
```

如果没有匹配结果，或者显示权限错误，先停止这一步并反馈错误文字；GMS 更新后可能不再开放该诊断字段。不要把完整诊断输出发到公开 Issue。

有且只有一条匹配时，执行下面这行，把诊断字段中的十六进制值转为登记使用的十进制数字：

```powershell
[Convert]::ToUInt64($gsf.Matches[0].Groups[1].Value, 16).ToString()
```

这个诊断接口曾在本项目测试环境中成功读取；不是 Google 承诺长期提供的接口。**GSF ID 不是序列号，也不是 `settings get secure android_id` 的结果。**

### 在 Google 官网登记

1. 在电脑浏览器打开 [Google 自定义 ROM 设备登记页](https://www.google.com/android/uncertified/)，登录自己的 Google 账号。
2. 将上一步的数字填入 **Google Services Framework Android ID**，按网页提示完成验证并注册。
3. 确认网页接受登记，等待生效后，在平板正常打开 Google 应用并登录，分别确认账号登录、Play 下载和 Chrome 是否可用。生效时间以 Google 服务为准。

每位使用者只登记自己的当前 ID，不要复用作者、其他设备或旧 ZUI 的 ID。清除用户数据或重新初始化 Google 服务后，ID 可能改变；此时如果再次遇到拦截，重新读取当前值再判断是否需要登记。**普通升级不等于一定要重新登记。**

GSF ID 只在本机查看并提交给 Google，不要附在 GitHub Issue、公开截图、源码或镜像中。本仓库不包含作者的 GSF ID 或账号数据。

登记解决的是自定义 ROM 使用 Google 服务时可能遇到的拦截，**不等于 ROM 获得 Google 认证，也不保证 Play Integrity 通过**。Play 商店仍可能显示“设备未通过认证”，部分应用仍可能受限；不要为改变这行文字清除 Google 数据或重新锁定 Bootloader。

参考：[Google 对自定义 ROM 用户的登记提示](https://www.google.com/android/uncertified/warningauto)、[Google 设备认证说明](https://support.google.com/googleplay/answer/7165974?hl=zh-Hans)。

## 如果装修补 boot 后出现问题

以下只回退 boot，**不会把整个系统恢复成 ZUI**。

在还能进入原厂 fastbootd 的前提下，先确认 `is-userspace: yes`、`current-slot: a`，然后执行：

```powershell
.\fastboot.exe flash boot_a .\boot.img
```

成功后执行 ` .\fastboot.exe reboot `。如果当前停在 Bootloader fastboot，先执行 ` .\fastboot.exe reboot fastboot ` 进入 fastbootd。无法进入原厂 fastbootd 时，需要另行处理原厂恢复，不继续尝试写其他分区。

## 常见卡点

| 现象 | 怎么处理 |
|---|---|
| PowerShell 说找不到 adb/fastboot | 确认在刷机文件夹打开窗口，并使用带 `.\` 的命令 |
| `waiting for any device` | 先处理USB连接和ADB/Fastboot驱动，检查电脑是否只连接这一台设备 |
| `flash boot_a` 返回 `unknown command` | 先查 `is-userspace`，本机应在 fastbootd 中写 boot，不能在 Bootloader 界面直接写 |
| 提示分区空间不足或写入 `FAILED` | 保存完整输出，先确认ZUI15底座；不要靠删除 product/system_ext 或反复清数据处理 |

辅助包的文件清单和校验值见 [INSTALL-TOOLS.json](INSTALL-TOOLS.json)。需要了解 boot 修补原理，再看 [技术说明](CHARGING-BOOT.md)；正常安装不需要阅读内部核验报告。
