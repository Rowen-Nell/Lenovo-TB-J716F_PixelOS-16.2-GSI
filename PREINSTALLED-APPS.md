# 预装必要/可选清单（全部保留）

按当前产品目标区分核心/当前功能、可选用户功能、资源兼容配置及待依赖核查项。核心不等于最小启动集；待核查项不冒称必需。大小沿用r27实际APK逻辑大小，最终r28完整分类和占用见SIZE-REPORT.md。没有删除任何应用。

|应用/模块|MiB|分类|说明|
|---|---:|---|---|
|Velvet|337.44|optional user-facing feature; dependency review required before removal|搜索/语音助手|
|PrebuiltGmsCoreVic|182.36|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|PrebuiltGmail|169.43|optional user-facing feature; dependency review required before removal|邮件|
|Photos|154.79|optional user-facing feature; dependency review required before removal|照片/云图库|
|DevicePersonalizationPrebuiltPixel2024-playstore_aiai_20250306.00_RC10|117.4|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Maps|105.29|optional user-facing feature; dependency review required before removal|地图|
|Phonesky|91.33|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|LatinIMEGooglePrebuilt|82.36|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|Settings|81.31|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|GoogleTTS|70.31|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PixelLiveWallpaperPrebuilt-26000013|62.27|optional user-facing feature; dependency review required before removal|动态壁纸扩展|
|SystemUI|43.74|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|talkback|43.58|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|MagicPortraitWallpapers|42.64|optional user-facing feature; dependency review required before removal|人像壁纸扩展|
|CalendarGooglePrebuilt|41.12|optional user-facing feature; dependency review required before removal|日历客户端|
|WeatherPixelPrebuilt_10006113|37.6|optional user-facing feature; dependency review required before removal|天气|
|framework-res|36.28|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|ParanoidSense|34.38|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|ScribePrebuilt_v8.4.773573318|29.87|optional user-facing feature; dependency review required before removal|录音/转写|
|SoundAmplifierPrebuilt_v4.8.758106410|29.17|optional user-facing feature; dependency review required before removal|声音增强辅助功能|
|SafetyHubPrebuilt|26.53|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TouchGestures|25.42|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|FilesPrebuilt|24.92|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|WellbeingPrebuilt|24.68|optional user-facing feature; dependency review required before removal|数字健康|
|DeviceIntelligenceNetworkPrebuilt-astrea_20240329.00_RC02|22.44|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|DevicePolicyPrebuilt-v10334460|19.92|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TeleService|18.93|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|MlkitBarcodeUIPrebuilt|18.93|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|WallpaperAIPrebuilt_10000372|16.88|optional user-facing feature; dependency review required before removal|AI壁纸扩展|
|SettingsIntelligenceGooglePrebuilt|16.35|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|FrameworkOverlayCustom|16.34|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PrebuiltDeskClockGoogle_76007351|15.28|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|NexusLauncherReleaseTablet|15.13|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|SetupWizardPrebuilt_v811313066|15.0|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|PixelWallpapers2024|14.07|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SwitchAccessPrebuilt_1.16.0.726766860|13.65|optional user-facing feature; dependency review required before removal|开关控制辅助功能|
|NgaResources|13.56|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|AndroidPlatformServices|13.2|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TurboPrebuilt|12.05|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Flipendo|12.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|GoogleRestorePrebuilt-v842048|11.79|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrebuiltGmsCoreVic_CronetDynamite|11.2|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|WallpaperEmojiPrebuilt-foldable-wallpaper|10.42|optional user-facing feature; dependency review required before removal|表情壁纸扩展|
|WallpaperPickerGoogleRelease|10.04|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|DocumentsUIGoogle|8.78|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Aperture|7.9|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TfliteDynamitePrebuilt|7.84|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|VisionBarcodePrebuilt|7.77|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|WallpaperEffect|7.64|optional user-facing feature; dependency review required before removal|壁纸特效|
|SoundPickerPrebuilt_33000242|6.87|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|MarkupGoogle_v2|6.56|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|GoogleExtServices|6.29|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SetupWizardPixelPrebuilt_v802960446|6.15|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CredentialManager|6.06|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SearchSelectorPrebuilt|5.14|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|ManagedProvisioning|4.95|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|ImsServiceEntitlement|4.92|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CalculatorGooglePrebuilt_85006267|4.75|optional user-facing feature; dependency review required before removal|计算器|
|StorageManagerGoogle|4.33|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|LiveWallpapersPicker|4.17|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrebuiltGmsCoreVic_AdsDynamite|4.12|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|AvatarPicker|3.88|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PackageInstaller|3.8|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|KeyChain|3.75|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|AndroidAutoStubPrebuilt|3.66|optional user-facing feature; dependency review required before removal|车载入口|
|EmergencyInfoGoogleNoUi|3.66|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|IntentResolver|3.43|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|SystemUIClocks-Metro|3.21|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SettingsIntelligence|2.68|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrivateSpace|2.6|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|LocationHistoryPrebuilt|2.59|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrebuiltGmsCoreVic_MapsDynamite|2.51|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Telecom|2.43|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|PrebuiltGmsCoreVic_DynamiteModulesC|2.37|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SystemUIClocks-Weather|2.32|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|AccessibilityMenu|2.26|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SystemUIClocks-NumOverlap|2.26|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|EasterEgg|2.21|optional user-facing feature; dependency review required before removal|彩蛋|
|SystemUIClocks-BigNum|2.18|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|DeviceAsWebcam|2.17|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SystemUIClocks-Growth|2.16|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SystemUIClocks-Calligraphy|2.15|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SystemUIClocks-Inflate|2.15|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|BuiltInPrintService|2.05|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|StatementService|1.93|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|QualifiedNetworksService|1.81|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PartnerSetupPrebuilt|1.5|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|NetworkStack|1.46|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|CompanionDeviceManager|1.43|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|ParanoidSenseOverlay|1.35|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|MtpService|1.2|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|SoundPicker|1.12|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|ConfigUpdater|1.1|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|GoogleOneTimeInitializer|1.09|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|QuickAccessWallet|1.07|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|GoogleServicesFramework|1.07|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|PrebuiltGmsCoreVic_DynamiteModulesA|1.06|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrebuiltGmsCoreVic_MeasurementDynamite|1.06|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|framework-res__tablet__auto_generated_characteristics_rro|1.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PrintSpooler|1.01|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|MediaProviderLegacy|0.97|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CellBroadcastLegacyApp|0.94|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrebuiltGmsCoreVic_GoogleCertificates|0.88|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|ContactsProvider|0.81|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|TagGoogle|0.74|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Music|0.72|optional user-facing feature; dependency review required before removal|音乐播放器|
|CaptivePortalLogin|0.68|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CertInstaller|0.59|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|Shell|0.53|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|DownloadProvider|0.52|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|SettingsProvider|0.51|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|PhotoTable|0.51|optional user-facing feature; dependency review required before removal|照片屏保|
|TelephonyProvider|0.45|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|BackupRestoreConfirmation|0.44|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SimAppDialog|0.43|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TelephonyProvider__tablet__auto_generated_characteristics_rro|0.42|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|MusicFX|0.36|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CalendarProvider|0.33|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|InputDevices|0.31|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|MmsService|0.28|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CarrierConfig|0.26|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|GooglePrintRecommendationService|0.25|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|DownloadProviderUi|0.24|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|HTMLViewer|0.23|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Iwlan|0.23|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PrebuiltGmsCoreVic_DynamiteLoader|0.2|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CarrierDefaultApp|0.2|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TurboAdapter_NoBatt|0.2|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|BasicDreams|0.18|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|VpnDialogs|0.17|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PixelSetupWizardOverlayExpressive_GMS|0.15|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DynamicSystemInstallationService|0.15|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SecureElement|0.12|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PixelSetupWizardOverlay2024_GMS|0.1|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ONS|0.1|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PixelThemesStub2022_and_newer|0.08|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SettingsOverlayCustom|0.07|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ExternalStorageProvider|0.06|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|CameraExtensionsProxy|0.06|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|framework-res__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.05|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|BlockedNumberProvider|0.05|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PixelConfigOverlayCommon_GMS|0.05|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|Settings__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SystemUI__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|QcRilAm|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|GoogleConfigOverlay_GMS|0.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ModuleMetadataGoogle|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TeleService__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|TouchGestures__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|TeleService__tablet__auto_generated_characteristics_rro|0.04|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|CallLogBackup|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|ThemesStub|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|UserDictionaryProvider|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|FusedLocation|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|WallpaperBackup|0.04|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|treble-overlay-samsung-a32|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a54x|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a73|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-p3s|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r5q|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r9s|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|LocalTransport|0.03|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|ApertureLensLauncher|0.03|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|treble-overlay-samsung-S20|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-S20fe|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a33|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a52|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-m52|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-o1s|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r0s|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r9q|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-t2s|0.03|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|E2eeContactKeysProvider|0.03|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|BluetoothMidiService|0.03|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|BookmarkProvider|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|treble-overlay-xiaomi-mi14pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-nokia_3_2|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nubia-redmagic6series|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-findx|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a30|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a40|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a50|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a70|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a71|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a80|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a82xq|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gts8p|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-m31|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-n9q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-s9pq|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-s9q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mimix3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocom3pro5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocom4pro5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi10x5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik50ultra|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote114g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote115g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-S10pq|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-S10q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-XZ3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-alldocube-xneo|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-asus-zenfone5-10|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-bq-jeice|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-fairphone-fp3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note12v2023|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note30|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note30pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note40pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-zeroxpro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lge-lm_v500n|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lge-timelm|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g7play|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g8plus|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-onefusion|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-onehyper|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-ctl-7-1|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-drg-6.1plus-x6|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-nokia_7_2|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-c3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a20|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a51|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a7|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a9|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-d1q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-d1x|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gts7xllite|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gts8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-starqltekdi|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-z3q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-SO-03L|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-camon20pro4g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova4pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-vsmart-joy3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-civi|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi11lite5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi11tpro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi9se|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mipad5pro5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocox3gt|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi9|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi9a|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote10|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote10pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote10s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote12pro5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote135g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote9pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote9promax|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote9s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ProxyHandler|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|BuildManifest|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PartnerBookmarksProvider|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|CompanionDeviceManager__tablet__auto_generated_characteristics_rro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a60q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NoCutoutOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DisplayCutoutEmulationWaterfallOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DisplayCutoutEmulationTallOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DisplayCutoutEmulationHoleOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DisplayCutoutEmulationDoubleOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DisplayCutoutEmulationCornerOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NoCutoutOverlay|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PixelDocumentsUIGoogleOverlay_GMS|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|Tb24WallpaperHomeTypographyOverlay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-k5pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote7|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|GoogleExtShared|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|treble-overlay-highpriomisc|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-Hisense-HLTE556N|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-asus-rogphone|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-asus-zenfonemaxshot|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-blackview-bv6900|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-blackview-bv9500plus|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-blackview-shark8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-duoqin-qin2pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-duoqin-qin3ultra|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-essential-ph_1|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-ARE|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-COR|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-JKM|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-MAR|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-POT|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note10|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note10pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-s4|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-Q706F|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-Y70|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-p11_pro_plus|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-s5pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-z5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lg-g7|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lg-phoenix_lao_com-phoenix_sprout|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-meizu-m2181|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-e5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-e5plus|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g31|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g6|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g6play|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g6plus|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g7power|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-gpure|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-hiphi|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-nio|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-rhodep|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-pnx-8.1-x7|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nubia-redmagic3s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nubia-z18mini|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-acepro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n20|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n200|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nordce|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op9|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-findx3pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oukitel-c18pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oukitel-wp8pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-8pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gt2master|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gtmaster|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gtmasterexplorer|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-q2|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-q3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a03|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a10s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a20s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a31|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a51x|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a53|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-m31s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r0q|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-XZ2|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-J9110|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-pdx206-kddi|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-pdx206|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-pdx215|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-pdx223|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-teclast-p20hd|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-teclast-t30|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-camon11|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-camon18p|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova4|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova5pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-spark10pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-spark5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-umidigi-A5pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-umidigi-power|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-unihertz-luna|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-vivo-y20|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-vsmart-active3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-vsmart-live|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi8ee|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi8lite|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi8pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi8se|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi9|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mia2lite|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mimax3|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mimix2s|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-miplay|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocof1|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocof4|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocof5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocom5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi6|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi6a|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi6pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi7onc|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi8a|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi9t|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik20pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote11|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote5|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote6pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote8pro|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|J716fInputBackend|0.02|current product core or required retained function|按当前系统、原生设置/输入、首装及GMS目标保留；不是最小可启动集的证明|
|WAPPushManager|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|SharedStorageBackup|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|MtkInCallService|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|PacProcessor|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|Chrome-Stub|0.02|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|treble-overlay-asus-zenfone8|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lg-velvet|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-pl2-6.1|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-razer-cheryl|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-8-5g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-9i|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gta3xl|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-s10e|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote125g|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote9t|0.02|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-misc-transparent-pointer|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-misc-spen-pointer|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|LineageBlackTheme|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|GoogleWebViewOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ModuleMetadata|0.01|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|treble-overlay-asus-zenfone5|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-asus-zenfonelivel1za550kl|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-doogee-vmax|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-duoqin-qinf21pro|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-htc-exodus1|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-htc-u12plus|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-ANE|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-ATU|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-AUM|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-BKL|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-BND|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-COL|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-DUK|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-FIG|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-LLD|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-PIC|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-PRA|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-RNE|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-SHT|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-STF|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-VTR|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-WAS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note7|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-zero6|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-s5|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-mbi-s10|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g8|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-g8power|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-onefusionplus|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-b2n-7plus|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-nokia_4_2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-pda_sprout-5.1plus-x5|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op6t|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-c2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a02q|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a21s|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gta2xl|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gta7litewifi|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-j6|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sharp-s2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-teclast-m30|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-teracube-v7101o|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-umidigi-A13-Pro-Max-5G|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-umidigi-A3S|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-unihertz-jelly2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-unihertz-titanpocketeea|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-vivo-y31|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi6x|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mia2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mipad4|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi7a|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmigo|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmis2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocof4-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|WebViewGoogle-Stub|0.01|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|TrichromeLibrary-Stub|0.01|retained; necessity/dependency not individually closed|本轮保留；未完成逐包依赖闭环，不将它冒称不可删除，也不授权删除|
|FrameworkOverlayThemePicker|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|FrameworkPixellauncher|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|GoogleSettingsOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SettingsOverlayThemePicker|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SettingsPixelSounds|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SettingsProviderOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SystemUIOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SystemUIPixellauncher|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|framework-resOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-caf-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-hw-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-hot60proplus|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-y700_2023|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lge-mfh505glm|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-meizu-m2461|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-e6plus|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-tesla|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-tundra|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-mtk-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace2v|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace3|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace3v|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nord|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nord4|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nord5|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op10pro|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op12|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op6|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-a54|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-reno6-5g|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-renopro2019|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-10pro|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-14proplus|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-6|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-6i|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gt2pro|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gtneo3|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a82xq-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-gta4l|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sec-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-pdx213|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sprd-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-camon50ultra|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-spark6|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-telephony-caf-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-telephony-floss-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-telephony-hw-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-telephony-mtk-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-telephony-slsi-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-telephony-sprd-ims|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-civi-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-civi4pro|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi12lite-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi12lite|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi13-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi13|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi13t|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi14pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik20pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik70|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik70ultra|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote13pro4g|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NavigationBarModeGesturalOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|gsi_overlay_framework|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|gsi_overlay_systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ApertureFrameworksBaseOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|AvatarPicker__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ContactsProviderOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|DocumentsUIOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|FrameworkPixelSounds|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ImsServiceEntitlement__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|IntentResolver__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|Launcher3Overlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ManagedProvisioning__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NetworkStackOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|ParanoidSense__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PermissionControllerOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PixelConfigOverlay2018_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PixelConfigOverlay2019Midyear_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PixelConfigOverlay2021_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PixelLauncherOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|PixelLauncherOverlayThemePicker|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SettingsOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SettingsProvider__pixelos_tb03_arm64_ext4__auto_generated_rro_product|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SystemUIGXOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SystemUIOverlayThemePicker|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|SystemUIResPixelClocks|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|Tb03J716FColorPolicyOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|Tb03WifiRegEventsOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|TeleServiceOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|TelecomOverlay_GMS|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-NavBar|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-NightMode|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-SystemUI-FalseLocks|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-Telephony-LTE|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-asus-zenfone5z|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-asus-zenfonemaxm2|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-blackview-shark8-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-devinputjack|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-duoqin-qin3ultra-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-CLT|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-huawei-EML|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-hot60proplus-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note12v2023-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note30-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-infinix-note30pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-tabv7-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-tabv7|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lenovo-y700_2023-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lg-v40|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-lge-mfh505glm-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-mbi-s10-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-meizu-m2181-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-meizu-m2461-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-misc-aod-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-misc-aod|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-misc-dt2w|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-misc-minimal-brightness|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-hiphi-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-wifi|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-one-action|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-one|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-onefusion-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-razr|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-rhodep-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-tesla-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-moto-tundra-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-nokia_7_2-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-nokia-pnx-8.1-x7-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace2-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace2v-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace3-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-ace3v-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-acepro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n10-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n10|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n2-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n20-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-n200-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nord-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nord4-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nord5-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-nordce-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op10pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op12-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op6t-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op8-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oneplus-op9-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-onn-mid7019|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-a54-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-findx-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-findx3pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-reno6-5g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-oppo-renopro2019-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-10pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-14proplus-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-8-5g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-9i-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gt2master-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gt2pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gtmaster-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gtmasterexplorer-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-gtneo3-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-narzo10a|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-q2-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-realme-x2pro|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-S20-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-S20fe-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a02q-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a20s-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a21s-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a31-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a32-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a33-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a40-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a51-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a53-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-a54x-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-d1q-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-d1x-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-m31-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-m31s-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-p3s-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r0q-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-r0s-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-samsung-starqltekdi-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-sony-pdx213-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-camon20pro4g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-camon50ultra-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova4-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova4pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova5-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tecno-pova5pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-teracube-2e|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tethering-nobpf|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-tethering|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-vivo-y20-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-wifi5g|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-civi4pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mi11lite5g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-mimix3-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocof5-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocom4pro5g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-pocom5-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi10x5g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmi9-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik70-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redmik70ultra-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote10s-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote114g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote115g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote135g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote13pro4g-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|treble-overlay-xiaomi-redminote6pro-systemui|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|TransparentNavigationBarOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NotesRoleEnabledOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NavigationBarMode3ButtonOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|NavigationBarMode2ButtonOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
|FontNotoSerifSourceOverlay|0.01|retained resource/compatibility configuration|既有产品/设备/主题资源；不是可直接删的用户应用|
