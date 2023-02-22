package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 设备型号
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum DeviceModel implements HikvisionEnum {

  /**
   * 对尚未定义的dvr类型返回DVR
   */
  DVR(1, "对尚未定义的dvr类型返回DVR"),
  /**
   * atm dvr
   */
  ATMDVR(2, "atm dvr"),
  /**
   * DVS
   */
  DVS(3, "DVS"),
  /**
   * 6001D
   */
  DEC(4, "6001D"),
  /**
   * 6001F
   */
  ENC_DEC(5, "6001F"),
  /**
   * 8000HC
   */
  DVR_HC(6, "8000HC"),
  /**
   * 8000HT
   */
  DVR_HT(7, "8000HT"),
  /**
   * 8000HF
   */
  DVR_HF(8, "8000HF"),
  /**
   * 8000HS DVR(no audio)
   */
  DVR_HS(9, "8000HS DVR(no audio)"),
  /**
   * 8016HTS DVR(no audio)
   */
  DVR_HTS(10, "8016HTS DVR(no audio)"),
  /**
   * HB DVR(SATA HD)
   */
  DVR_HB(11, "HB DVR(SATA HD)"),
  /**
   * 8000HCS DVR
   */
  DVR_HCS(12, "8000HCS DVR"),
  /**
   * 带ATA硬盘的DVS
   */
  DVS_A(13, "带ATA硬盘的DVS"),
  /**
   * 8000HC-S
   */
  DVR_HC_S(14, "8000HC-S"),
  /**
   * 8000HT-S
   */
  DVR_HT_S(15, "8000HT-S"),
  /**
   * 8000HF-S
   */
  DVR_HF_S(16, "8000HF-S"),
  /**
   * 8000HS-S
   */
  DVR_HS_S(17, "8000HS-S"),
  /**
   * ATM-S
   */
  ATMDVR_S(18, "ATM-S"),
  /**
   * 7000H系列
   */
  DVR_7000H(19, "7000H系列"),
  /**
   * 多路解码器
   */
  DEC_MAT(20, "多路解码器"),
  /**
   * mobile DVR
   */
  DVR_MOBILE(21, "mobile DVR"),
  /**
   * 8000HD-S
   */
  DVR_HD_S(22, "8000HD-S"),
  /**
   * 8000HD-SL
   */
  DVR_HD_SL(23, "8000HD-SL"),
  /**
   * 8000HC-SL
   */
  DVR_HC_SL(24, "8000HC-SL"),
  /**
   * 8000HS_ST
   */
  DVR_HS_ST(25, "8000HS_ST"),
  /**
   * 6000HW
   */
  DVS_HW(26, "6000HW"),
  /**
   * 多路解码器
   */
  DS630X_D(27, "多路解码器"),
  /**
   * 640X高清解码器
   */
  DS640X_HD(28, "640X高清解码器"),
  /**
   * 610X解码器
   */
  DS610X_D(29, "610X解码器"),
  /**
   * IP 摄像机
   */
  IPCAM(30, "IP 摄像机"),
  /**
   * 高清IP摄像机
   */
  MEGA_IPCAM(31, "高清IP摄像机"),
  /**
   * 862MF可以接入9000设备
   */
  IPCAM_X62MF(32, "862MF可以接入9000设备"),
  /**
   * 智能高清网络摄像机
   */
  ITCCAM(35, "智能高清网络摄像机"),
  /**
   * 智能分析高清网络摄像机
   */
  IVS_IPCAM(36, "智能分析高清网络摄像机"),
  /**
   * 一体机
   */
  ZOOMCAM(38, "一体机"),
  /**
   * IP 标清球机
   */
  IPDOME(40, "IP 标清球机"),
  /**
   * IP 200万高清球机
   */
  IPDOME_MEGA200(41, "IP 200万高清球机"),
  /**
   * IP 130万高清球机
   */
  IPDOME_MEGA130(42, "IP 130万高清球机"),
  /**
   * IP 高清智能快球
   */
  IPDOME_AI(43, "IP 高清智能快球"),
  /**
   * 红外热成像摄像机
   */
  TII_IPCAM(44, "红外热成像摄像机"),
  /**
   * 红外热成像双目球机
   */
  IPTC_DOME(45, "红外热成像双目球机"),
  /**
   * 球型鹰眼（大）
   */
  DS_2DP_Z(46, "球型鹰眼（大）"),
  /**
   * 非球型鹰眼（小）
   */
  DS_2DP(47, "非球型鹰眼（小）"),
  /**
   * 称重数据管理服务器
   */
  ITS_WMS(48, "称重数据管理服务器"),
  /**
   * IP 模块
   */
  IPMOD(50, "IP 模块"),
  /**
   * 交通智能云台（不带雷达测速）
   */
  TRAFFIC_YTDOME(51, "交通智能云台（不带雷达测速）"),
  /**
   * 交通智能云台（带雷达测速）
   */
  TRAFFIC_RDDOME(52, "交通智能云台（带雷达测速）"),
  /**
   * 6501 车牌
   */
  IDS6501_HF_P(60, "6501 车牌"),
  /**
   * 智能ATM
   */
  IDS6101_HF_A(61, "智能ATM"),
  /**
   * 双机跟踪：DS6002-HF/B
   */
  IDS6002_HF_B(62, "双机跟踪：DS6002-HF/B"),
  /**
   * 行为分析：DS6101-HF/B DS6101-HF/B_SATA
   */
  IDS6101_HF_B(63, "行为分析：DS6101-HF/B DS6101-HF/B_SATA"),
  /**
   * 智能分析仪IVMS
   */
  IDS52XX(64, "智能分析仪IVMS"),
  /**
   * 9000智能
   */
  IDS90XX(65, "9000智能"),
  /**
   * 海鑫人脸识别 ATM
   */
  IDS8104_AHL_S_HX(66, "海鑫人脸识别 ATM"),
  /**
   * 私有人脸识别 ATM
   */
  IDS8104_AHL_S_H(67, "私有人脸识别 ATM"),
  /**
   * 9100智能
   */
  IDS91XX(68, "9100智能"),
  /**
   * 智能行为IP摄像机
   */
  IIP_CAM_B(69, "智能行为IP摄像机"),
  /**
   * 智能人脸IP摄像机
   */
  IIP_CAM_F(70, "智能人脸IP摄像机"),
  /**
   * DS71XXH_S
   */
  DS71XX_H(71, "DS71XXH_S"),
  /**
   * DS72XXH_S
   */
  DS72XX_H_S(72, "DS72XXH_S"),
  /**
   * DS73XXH_S
   */
  DS73XX_H_S(73, "DS73XXH_S"),
  /**
   * DS72XX_HF_S
   */
  DS72XX_HF_S(74, "DS72XX_HF_S"),
  /**
   * DS73XX_HFI_S
   */
  DS73XX_HFI_S(75, "DS73XX_HFI_S"),
  /**
   * DVR,e.g. DS7604_HI_S
   */
  DS76XX_H_S(76, "DVR,e.g. DS7604_HI_S"),
  /**
   * NVR,e.g. DS7604_NI_S
   */
  DS76XX_N_S(77, "NVR,e.g. DS7604_NI_S"),
  /**
   * 机柜智能检测仪
   */
  DS_TP3200_EC(78, "机柜智能检测仪"),
  /**
   * DS81XX_HS_S
   */
  DS81XX_HS_S(81, "DS81XX_HS_S"),
  /**
   * DS81XX_HL_S
   */
  DS81XX_HL_S(82, "DS81XX_HL_S"),
  /**
   * DS81XX_HC_S
   */
  DS81XX_HC_S(83, "DS81XX_HC_S"),
  /**
   * DS81XX_HD_S
   */
  DS81XX_HD_S(84, "DS81XX_HD_S"),
  /**
   * DS81XX_HE_S
   */
  DS81XX_HE_S(85, "DS81XX_HE_S"),
  /**
   * DS81XX_HF_S
   */
  DS81XX_HF_S(86, "DS81XX_HF_S"),
  /**
   * DS81XX_AH_S
   */
  DS81XX_AH_S(87, "DS81XX_AH_S"),
  /**
   * DS81XX_AHF_S
   */
  DS81XX_AHF_S(88, "DS81XX_AHF_S"),
  /**
   * DS90XX_HF_S
   */
  DS90XX_HF_S(90, "DS90XX_HF_S"),
  /**
   * DS91XX_HF_S
   */
  DS91XX_HF_S(91, "DS91XX_HF_S"),
  /**
   * 91XXHD-S(MD)
   */
  DS91XX_HD_S(92, "91XXHD-S(MD)"),
  /**
   * 9000智能 ATM
   */
  IDS90XX_A(93, "9000智能 ATM"),
  /**
   * 9100智能 ATM
   */
  IDS91XX_A(94, "9100智能 ATM"),
  /**
   * DS95XX_N_S NVR 不带任何输出
   */
  DS95XX_N_S(95, "DS95XX_N_S NVR 不带任何输出"),
  /**
   * DS96XX_N_SH NVR
   */
  DS96XX_N_SH(96, "DS96XX_N_SH NVR"),
  /**
   * DS90XX_HF_SH
   */
  DS90XX_HF_SH(97, "DS90XX_HF_SH"),
  /**
   * DS91XX_HF_SH
   */
  DS91XX_HF_SH(98, "DS91XX_HF_SH"),
  /**
   * 视频综合平台设备型号(X:编码板片数，Y:解码板片数)
   */
  DS_B10_XY(100, "视频综合平台设备型号(X:编码板片数，Y:解码板片数)"),
  /**
   * 视频综合平台内部编码器
   */
  DS_6504HF_B10(101, "视频综合平台内部编码器"),
  /**
   * 视频综合平台内部解码器
   */
  DS_6504D_B10(102, "视频综合平台内部解码器"),
  /**
   * 视频综合平台内部码分器
   */
  DS_1832_B10(103, "视频综合平台内部码分器"),
  /**
   * 视频综合平台内部光纤板
   */
  DS_6401HFH_B10(104, "视频综合平台内部光纤板"),
  /**
   * 65XXHC DVS
   */
  DS_65XXHC(105, "65XXHC DVS"),
  /**
   * 65XXHC-SATA DVS
   */
  DS_65XXHC_S(106, "65XXHC-SATA DVS"),
  /**
   * 65XXHF DVS
   */
  DS_65XXHF(107, "65XXHF DVS"),
  /**
   * 65XXHF-SATA DVS
   */
  DS_65XXHF_S(108, "65XXHF-SATA DVS"),
  /**
   * 65 rack DVS
   */
  DS_6500HF_B(109, "65 rack DVS"),
  /**
   * iVMS-6200(/C)
   */
  IVMS_6200_C(110, "iVMS-6200(/C)"),
  /**
   * iVMS-6200(/B)
   */
  IVMS_6200_B(111, "iVMS-6200(/B)"),
  /**
   * 72XXHV_ST  海思3515平台 DVR
   */
  DS_72XXHV_ST15(112, "72XXHV_ST  海思3515平台 DVR"),
  /**
   * 72XXHV_ST  海思3520平台 DVR
   */
  DS_72XXHV_ST20(113, "72XXHV_ST  海思3520平台 DVR"),
  /**
   * IVMS-6200(/T)
   */
  IVMS_6200_T(114, "IVMS-6200(/T)"),
  /**
   * IVMS-6200(/BP)
   */
  IVMS_6200_BP(115, "IVMS-6200(/BP)"),
  /**
   * DS_81XXHC_ST
   */
  DS_81XXHC_ST(116, "DS_81XXHC_ST"),
  /**
   * DS_81XXHS_ST
   */
  DS_81XXHS_ST(117, "DS_81XXHS_ST"),
  /**
   * DS_81XXAH_ST
   */
  DS_81XXAH_ST(118, "DS_81XXAH_ST"),
  /**
   * DS_81XXAHF_ST
   */
  DS_81XXAHF_ST(119, "DS_81XXAHF_ST"),
  /**
   * 66XX DVS
   */
  DS_66XXDVS(120, "66XX DVS"),
  /**
   * 视频综合平台内部报警器
   */
  DS_1964_B10(121, "视频综合平台内部报警器"),
  /**
   * 视频综合平台内部级联输入
   */
  DS_B10N04_IN(122, "视频综合平台内部级联输入"),
  /**
   * 视频综合平台内部级联输出
   */
  DS_B10N04_OUT(123, "视频综合平台内部级联输出"),
  /**
   * 视频综合平台内部智能
   */
  DS_B10N04_INTEL(124, "视频综合平台内部智能"),
  /**
   * V6高清
   */
  DS_6408HFH_B10E_RM(125, "V6高清"),
  /**
   * V6级联不带DSP
   */
  DS_B10N64F1_RTM(126, "V6级联不带DSP"),
  /**
   * V6级联带DSP
   */
  DS_B10N64F1D_RTM(127, "V6级联带DSP"),
  /**
   * 视频综合平台子域控制器
   */
  DS_B10_SDS(128, "视频综合平台子域控制器"),
  /**
   * 视频综合平台域控制器
   */
  DS_B10_DS(129, "视频综合平台域控制器"),
  /**
   * VGA高清编码器
   */
  DS_6401HFH_B10V(130, "VGA高清编码器"),
  /**
   * 视频综合平台内部标清解码器
   */
  DS_6504D_B10B(131, "视频综合平台内部标清解码器"),
  /**
   * 视频综合平台内部高清解码器
   */
  DS_6504D_B10H(132, "视频综合平台内部高清解码器"),
  /**
   * 视频综合平台内部VGA解码器
   */
  DS_6504D_B10V(133, "视频综合平台内部VGA解码器"),
  /**
   * 视频综合平台SDI子板
   */
  DS_6408HFH_B10S(134, "视频综合平台SDI子板"),
  /**
   * 矩阵接入网关
   */
  DS_18XX_N(135, "矩阵接入网关"),
  /**
   * 光端机SD
   */
  DS_6504HF_B10F_CLASS(136, "光端机SD"),
  /**
   * 网络码分类产品
   */
  DS_18XX_PTZ(141, "网络码分类产品"),
  /**
   * 通用报警主机类产品
   */
  DS_19AXX(142, "通用报警主机类产品"),
  /**
   * 家用报警主机
   */
  DS_19BXX(143, "家用报警主机"),
  /**
   * 自助银行报警主机
   */
  DS_19CXX(144, "自助银行报警主机"),
  /**
   * 动环监控报警主机
   */
  DS_19DXX(145, "动环监控报警主机"),
  /**
   * 1900系列报警主机
   */
  DS_19XX(146, "1900系列报警主机"),
  /**
   * 视频报警主机
   */
  DS_19SXX(147, "视频报警主机"),
  /**
   * CS类产品 防护舱
   */
  DS_1HXX(148, "CS类产品 防护舱"),
  /**
   * 一键式紧急报警产品
   */
  DS_PEAXX(149, "一键式紧急报警产品"),
  /**
   * 无线报警主机产品
   */
  DS_PWXX(150, "无线报警主机产品"),
  /**
   * 4G网络模块
   */
  DS_PMXX(151, "4G网络模块"),
  /**
   * 视频动环监控主机
   */
  DS_19DXX_S(152, "视频动环监控主机"),
  /**
   * Axiom Hub无线报警主机
   */
  DS_PWAXX(153, "Axiom Hub无线报警主机"),
  /**
   * Axiom Hybrid混合报警主机
   */
  DS_PHAXX(154, "Axiom Hybrid混合报警主机"),
  /**
   * 多屏控制器
   */
  DS_C10H(161, "多屏控制器"),
  /**
   * BNC处理器
   */
  DS_C10N_BI(162, "BNC处理器"),
  /**
   * rbg处理器
   */
  DS_C10N_DI(163, "rbg处理器"),
  /**
   * 码流处理器
   */
  DS_C10N_SI(164, "码流处理器"),
  /**
   * 显示处理器
   */
  DS_C10N_DO(165, "显示处理器"),
  /**
   * 分布式服务器
   */
  DS_C10N_SERVER(166, "分布式服务器"),
  /**
   * 8104ATM
   */
  IDS_8104_AHFL_S_H(171, "8104ATM"),
  /**
   * 65 ATM
   */
  IDS_65XX_HF_A(172, "65 ATM"),
  /**
   * 9000 智能RH
   */
  IDS90XX_HF_RH(173, "9000 智能RH"),
  /**
   * 9100 智能RH设备
   */
  IDS91XX_HF_RH(174, "9100 智能RH设备"),
  /**
   * 65 行为分析
   */
  IDS_65XX_HF_B(175, "65 行为分析"),
  /**
   * 65 车牌识别
   */
  IDS_65XX_HF_P(176, "65 车牌识别"),
  /**
   * IVMS-6200(/F)
   */
  IVMS_6200_F(177, "IVMS-6200(/F)"),
  /**
   * iVMS-6200(/A)
   */
  IVMS_6200_A(178, "iVMS-6200(/A)"),
  /**
   * IVMS-6200(/F_S)人脸后检索分析仪
   */
  IVMS_6200_F_S(179, "IVMS-6200(/F_S)人脸后检索分析仪"),
  /**
   * 9000 RH    648
   */
  DS90XX_HF_RH(181, "9000 RH    648"),
  /**
   * 9100 RH设备 648
   */
  DS91XX_HF_RH(182, "9100 RH设备 648"),
  /**
   * 78系列设备 6446
   */
  DS78XX_S(183, "78系列设备 6446"),
  /**
   * 81 Resolution 960 KY2011
   */
  DS81XXHW_S(185, "81 Resolution 960 KY2011"),
  /**
   * DS81XXHW_ST  KY2011
   */
  DS81XXHW_ST(186, "DS81XXHW_ST  KY2011"),
  /**
   * DS91XXHW_ST  KY2011
   */
  DS91XXHW_ST(187, "DS91XXHW_ST  KY2011"),
  /**
   * DS91XX_ST netra
   */
  DS91XX_ST(188, "DS91XX_ST netra"),
  /**
   * DS81XX_ST netra
   */
  DS81XX_ST(189, "DS81XX_ST netra"),
  /**
   * DS81XXHDI_ST,DS81XXHE_ST ky2012
   */
  DS81XXHX_ST(190, "DS81XXHDI_ST,DS81XXHE_ST ky2012"),
  /**
   * DS73XXHI_ST ky2012
   */
  DS73XXHX_ST(191, "DS73XXHI_ST ky2012"),
  /**
   * 审讯81SH,81SHF
   */
  DS81XX_SH(192, "审讯81SH,81SHF"),
  /**
   * 审讯81SNL
   */
  DS81XX_SN(193, "审讯81SNL"),
  /**
   * NVR:DS96xxN_ST
   */
  DS96XXN_ST(194, "NVR:DS96xxN_ST"),
  /**
   * NVR:DS86xxN_ST
   */
  DS86XXN_ST(195, "NVR:DS86xxN_ST"),
  /**
   * DVR:DS80xxHF_ST
   */
  DS80XXHF_ST(196, "DVR:DS80xxHF_ST"),
  /**
   * DVR:DS90xxHF_ST
   */
  DS90XXHF_ST(197, "DVR:DS90xxHF_ST"),
  /**
   * NVR:DS76xxN_ST
   */
  DS76XXN_ST(198, "NVR:DS76xxN_ST"),
  /**
   * NVR:DS_9664N_RX
   */
  DS_9664N_RX(199, "NVR:DS_9664N_RX"),
  /**
   * 编码卡服务器
   */
  ENCODER_SERVER(200, "编码卡服务器"),
  /**
   * 解码卡服务器
   */
  DECODER_SERVER(201, "解码卡服务器"),
  /**
   * PCNVR存储服务器
   */
  PCNVR_SERVER(202, "PCNVR存储服务器"),
  /**
   * 邦诺CVR，他给自己定的类型为DVR_S-1
   */
  CVR_SERVER(203, "邦诺CVR，他给自己定的类型为DVR_S-1"),
  /**
   * 91系列HD-SDI高清DVR
   */
  DS_91XXHFH_ST(204, "91系列HD-SDI高清DVR"),
  /**
   * 66高清编码器
   */
  DS_66XXHFH(205, "66高清编码器"),
  /**
   * 终端服务器
   */
  TRAFFIC_TS_SERVER(210, "终端服务器"),
  /**
   * 视频分析记录仪
   */
  TRAFFIC_VAR(211, "视频分析记录仪"),
  /**
   * IP可视对讲分机
   */
  IPCALL(212, "IP可视对讲分机"),
  /**
   * 与CVR_SERVER相同的程序，只是模式不同
   */
  SAN_SERVER(213, "与CVR_SERVER相同的程序，只是模式不同"),
  /**
   * 视频综合平台设备型号
   */
  DS_B11_M_CLASS(301, "视频综合平台设备型号"),
  /**
   * 视频综合平台设备型号
   */
  DS_B12_M_CLASS(302, "视频综合平台设备型号"),
  /**
   * 视频综合平台内部编码器
   */
  DS_6504HF_B11_CLASS(303, "视频综合平台内部编码器"),
  /**
   * 视频综合平台内部编码器
   */
  DS_6504HF_B12_CLASS(304, "视频综合平台内部编码器"),
  /**
   * VGA高清
   */
  DS_6401HFH_B11V_CLASS(305, "VGA高清"),
  /**
   * VGA高清
   */
  DS_6401HFH_B12V_CLASS(306, "VGA高清"),
  /**
   * SDI
   */
  DS_6408HFH_B11S_CLASS(307, "SDI"),
  /**
   * SDI
   */
  DS_6408HFH_B12S_CLASS(308, "SDI"),
  /**
   * 视频综合平台内部高清解码器
   */
  DS_6504D_B11H_CLASS(309, "视频综合平台内部高清解码器"),
  /**
   * 视频综合平台内部标清解码器
   */
  DS_6504D_B11B_CLASS(310, "视频综合平台内部标清解码器"),
  /**
   * 视频综合平台内部标清解码器
   */
  DS_6504D_B12B_CLASS(311, "视频综合平台内部标清解码器"),
  /**
   * 视频综合平台内部VGA解码器
   */
  DS_6504D_B11V_CLASS(312, "视频综合平台内部VGA解码器"),
  /**
   * 视频综合平台内部VGA解码器
   */
  DS_6504D_B12V_CLASS(313, "视频综合平台内部VGA解码器"),
  /**
   * B10 RGB高清
   */
  DS_6401HFH_B10R_CLASS(314, "B10 RGB高清"),
  /**
   * B10 DVI高清
   */
  DS_6401HFH_B10D_CLASS(315, "B10 DVI高清"),
  /**
   * B10 HDMI高清
   */
  DS_6401HFH_B10H_CLASS(316, "B10 HDMI高清"),
  /**
   * B11 RGB高清
   */
  DS_6401HFH_B11R_CLASS(317, "B11 RGB高清"),
  /**
   * B11 DVI高清
   */
  DS_6401HFH_B11D_CLASS(318, "B11 DVI高清"),
  /**
   * B11 HDMI高清
   */
  DS_6401HFH_B11H_CLASS(319, "B11 HDMI高清"),
  /**
   * B12 RGB高清
   */
  DS_6401HFH_B12R_CLASS(320, "B12 RGB高清"),
  /**
   * B12 DVI高清
   */
  DS_6401HFH_B12D_CLASS(321, "B12 DVI高清"),
  /**
   * B12 HDMI高清
   */
  DS_6401HFH_B12H_CLASS(322, "B12 HDMI高清"),
  /**
   * netra高清解码
   */
  DS_65XXD_B10Ex_CLASS(323, "netra高清解码"),
  /**
   * netra高线编码
   */
  DS_6516HW_B10_CLASS(324, "netra高线编码"),
  /**
   * 高清光端机接入（支持1/2路光端机接入）
   */
  DS_6401HFH_B10F_RX_CLASS(326, "高清光端机接入（支持1/2路光端机接入）"),
  /**
   * 960H光端机接入（支持1/4/8路光端机接入）
   */
  DS_6502HW_B10F_RX_CLASS(327, "960H光端机接入（支持1/4/8路光端机接入）"),
  /**
   * netra高清解码
   */
  DS_6504D_B11Ex_CLASS(328, "netra高清解码"),
  /**
   * netra高清解码
   */
  DS_6504D_B12Ex_CLASS(329, "netra高清解码"),
  /**
   * netra高线编码
   */
  DS_6512_B11_CLASS(330, "netra高线编码"),
  /**
   * netra高线编码
   */
  DS_6512_B12_CLASS(331, "netra高线编码"),
  /**
   * 视频综合平台内部高清解码器
   */
  DS_6504D_B10H_CLASS(332, "视频综合平台内部高清解码器"),
  /**
   * 视频综合平台转码子系统
   */
  DS_65XXT_B10_CLASS(333, "视频综合平台转码子系统"),
  /**
   * 视频综合平台万能解码板
   */
  DS_65XXD_B10_CLASS(335, "视频综合平台万能解码板"),
  /**
   * X86服务器子系统
   */
  DS_IVMSE_B10X_CLASS(336, "X86服务器子系统"),
  /**
   * 增强型解码板_SDI(B10)
   */
  DS_6532D_B10ES_CLASS(337, "增强型解码板_SDI(B10)"),
  /**
   * SDI输入编码子系统
   */
  DS_6508HFH_B10ES_CLASS(338, "SDI输入编码子系统"),
  /**
   * 联网网关中的子系统
   */
  DS_82NCG_CLASS(340, "联网网关中的子系统"),
  /**
   * 联网网关中的子系统
   */
  DS_82VAG_CLASS(341, "联网网关中的子系统"),
  /**
   * 光口交换子系统
   */
  DS_1802XXF_B10_CLASS(342, "光口交换子系统"),
  /**
   * 智能子系统
   */
  iDS_6504_B10EVAC_CLASS(343, "智能子系统"),
  /**
   * 智能子系统
   */
  iDS_6504_B10EDEC_CLASS(344, "智能子系统"),
  /**
   * netra编码(VGA)
   */
  DS_6402HFH_B10EV_CLASS(345, "netra编码(VGA)"),
  /**
   * netra编码(DVI)
   */
  DS_6402HFH_B10ED_CLASS(346, "netra编码(DVI)"),
  /**
   * netra编码(HDMI)
   */
  DS_6402HFH_B10EH_CLASS(347, "netra编码(HDMI)"),
  /**
   * 光纤接入编码
   */
  DS_6404HFH_B10T_RX_CLASS(348, "光纤接入编码"),
  /**
   * netra高清解码
   */
  DS_6504D_AIO_CLASS(349, "netra高清解码"),
  /**
   * X86转码子系统
   */
  DS_IVMST_B10_CLASS(350, "X86转码子系统"),
  /**
   * netra编码
   */
  DS_6402_AIO_CLASS(351, "netra编码"),
  /**
   * x86服务器子系统
   */
  DS_iVMSE_AIO_CLASS(352, "x86服务器子系统"),
  /**
   * 一体机
   */
  DS_AIO_M_CLASS(353, "一体机"),
  /**
   * BNC输入编码子系统
   */
  DS_6508HF_B10E_CLASS(355, "BNC输入编码子系统"),
  /**
   * SDI输入编码子系统
   */
  DS_6404HFH_B10ES_CLASS(356, "SDI输入编码子系统"),
  /**
   * RGB输入编码子系统
   */
  DS_6402HFH_B10ER_CLASS(358, "RGB输入编码子系统"),
  /**
   * 光纤输入编码子系统
   */
  DS_6404HFH_B10T_RM_CLASS(361, "光纤输入编码子系统"),
  /**
   * BNC输出解码子系统
   */
  DS_6516D_B10EB_CLASS(362, "BNC输出解码子系统"),
  /**
   * SDI输出解码子系统
   */
  DS_6516D_B10ES_CLASS(363, "SDI输出解码子系统"),
  /**
   * DS_6508D_B10FD_CLASS(        364,DS_6508D_B10FV_CLASS(        364
   */
  DS_6508D_B10FH_CLASS(364, "DS_6508D_B10FD_CLASS(        364,DS_6508D_B10FV_CLASS(        364"),
  /**
   * BNC输入编码子系统
   */
  DS_6508_B11E_CLASS(365, "BNC输入编码子系统"),
  /**
   * SDI输入编码子系统
   */
  DS_6402_B11ES_CLASS(366, "SDI输入编码子系统"),
  /**
   * VGA输入编码子系统
   */
  DS_6402_B11EV_CLASS(367, "VGA输入编码子系统"),
  /**
   * RGB输入编码子系统
   */
  DS_6402_B11ER_CLASS(368, "RGB输入编码子系统"),
  /**
   * DVI输入编码子系统
   */
  DS_6402_B11ED_CLASS(369, "DVI输入编码子系统"),
  /**
   * HDMI输入编码子系统
   */
  DS_6402_B11EH_CLASS(370, "HDMI输入编码子系统"),
  /**
   * BNC输出解码子系统
   */
  DS_6516D_B11EB_CLASS(371, "BNC输出解码子系统"),
  /**
   * SDI输出解码子系统
   */
  DS_6516D_B11ES_CLASS(372, "SDI输出解码子系统"),
  /**
   * BNC输入编码子系统
   */
  DS_6508_B12E_CLASS(373, "BNC输入编码子系统"),
  /**
   * SDI输入编码子系统
   */
  DS_6402_B12ES_CLASS(375, "SDI输入编码子系统"),
  /**
   * VGA输入编码子系统
   */
  DS_6402_B12EV_CLASS(376, "VGA输入编码子系统"),
  /**
   * RGB输入编码子系统
   */
  DS_6402_B12ER_CLASS(377, "RGB输入编码子系统"),
  /**
   * DVI输入编码子系统
   */
  DS_6402_B12ED_CLASS(378, "DVI输入编码子系统"),
  /**
   * HDMI输入编码子系统
   */
  DS_6402_B12EH_CLASS(379, "HDMI输入编码子系统"),
  /**
   * BNC输出解码子系统
   */
  DS_6516D_B12EB_CLASS(380, "BNC输出解码子系统"),
  /**
   * 金融行业一体机X86子系统
   */
  DS_iVMSE_AIO_8100x_CLASS(381, "金融行业一体机X86子系统"),
  /**
   * 智能楼宇一体机X86子系统
   */
  DS_iVMSE_AIO_87x_CLASS(382, "智能楼宇一体机X86子系统"),
  /**
   * 增强型解码板_SDI(B11)
   */
  DS_6532D_B11ES_CLASS(384, "增强型解码板_SDI(B11)"),
  /**
   * 增强型解码板_SDI(B12)
   */
  DS_6532D_B12ES_CLASS(385, "增强型解码板_SDI(B12)"),
  /**
   * B20主控板
   */
  DS_B20_MSU_NP(400, "B20主控板"),
  /**
   * SDI输入编码
   */
  DS_6416HFH_B20S(401, "SDI输入编码"),
  /**
   * 光纤输入高清编码
   */
  DS_6416HFH_B20_RM(402, "光纤输入高清编码"),
  /**
   * DVI解码
   */
  DS_6564D_B20D(403, "DVI解码"),
  /**
   * HDMI解码
   */
  DS_6564D_B20H(404, "HDMI解码"),
  /**
   * VGA解码
   */
  DS_6564D_B20V(405, "VGA解码"),
  /**
   * B20解码子系统
   */
  DS_B20_6516D_DEV_CLASS(406, "B20解码子系统"),
  /**
   * VGA编码板
   */
  DS_6408HFH_B20V(407, "VGA编码板"),
  /**
   * B20主控
   */
  DS_MMC_B20_CLASS(408, "B20主控"),
  /**
   * B20主控子板
   */
  DS_CARD_CHIP_B20_CLASS(409, "B20主控子板"),
  /**
   * BNC解码子系统
   */
  DS_6564D_B20B_DEV_CLASS(410, "BNC解码子系统"),
  /**
   * SDI解码子系统
   */
  DS_6564D_B20S_DEV_CLASS(411, "SDI解码子系统"),
  /**
   * BNC编码子系统
   */
  DS_6532HF_B20B_DEV_CLASS(412, "BNC编码子系统"),
  /**
   * DVI编码子系统
   */
  DS_6408HFH_B20D_DEV_CLASS(413, "DVI编码子系统"),
  /**
   * HDMI编码子系统
   */
  DS_6408HFH_B20H_DEV_CLASS(414, "HDMI编码子系统"),
  /**
   * X86服务器子系统
   */
  DS_IVMSE_B20_CLASS(415, "X86服务器子系统"),
  /**
   * YUV编码子系统
   */
  DS_6402HFH_B20Y_DEV_CLASS(416, "YUV编码子系统"),
  /**
   * HW编码子系统
   */
  DS_6508HW_B20_DEV_CLASS(417, "HW编码子系统"),
  /**
   * DS_B20N128Fx_M级联板
   */
  DS_B20N128Fx_B20_DEV_CLASS(418, "DS_B20N128Fx_M级联板"),
  /**
   * IO主控板
   */
  DS_AIO_MCU_NP_DEV_CLASS(419, "IO主控板"),
  /**
   * VGA编码
   */
  DS_6402_AIO_EV_DEV_CLASS(420, "VGA编码"),
  /**
   * VGA解码
   */
  DS_6508D_AIO_EV_DEV_CLASS(421, "VGA解码"),
  /**
   * DVI解码
   */
  DS_6508D_AIO_ED_DEV_CLASS(422, "DVI解码"),
  /**
   * HDMI解码
   */
  DS_6508D_AIO_EH_DEV_CLASS(423, "HDMI解码"),
  /**
   * 视频增强板
   */
  DS_6508HD_B20F_DEV_CLASS(424, "视频增强板"),
  /**
   * 3G SID编码
   */
  DS_6402HFH_B20ES_DEV_CLASS(425, "3G SID编码"),
  /**
   * B20解码子系统
   */
  DS_6532D_B20_DEV_CLASS(426, "B20解码子系统"),
  /**
   * X86服务器子系统
   */
  DS_IVMST_B20_DEV_CLASS(427, "X86服务器子系统"),
  /**
   * DVI双链路
   */
  DS_6416HFH_B20DD_DEV_CLASS(428, "DVI双链路"),
  /**
   * 相机拼接类型
   */
  DS_6441VS_B20_DEV_CLASS(429, "相机拼接类型"),
  /**
   * TVI
   */
  DS_6404HFH_B20T_CLASS(431, "TVI"),
  /**
   * 交换机子系统
   */
  DS_FS22_B20_DEV_CLASS(432, "交换机子系统"),
  /**
   * 超高清X86输入
   */
  DS_IVMSE_B20UH_DEV_CLASS(433, "超高清X86输入"),
  /**
   * IDS_6524J_B20_DEV_CLASS
   */
  IDS_6524J_B20_DEV_CLASS(434, "IDS_6524J_B20_DEV_CLASS"),
  /**
   * IDS_6532B_B20_DEV_CLASS
   */
  IDS_6532B_B20_DEV_CLASS(435, "IDS_6532B_B20_DEV_CLASS"),
  /**
   * 光端机接入子系统
   */
  DS_6404HFH_B20Fx_DEV_CLASS(436, "光端机接入子系统"),
  /**
   * 级联子系统
   */
  DS_N128x_B20Fy_CLASS(437, "级联子系统"),
  /**
   * 网络光纤子系统
   */
  DS_181600F_B20_CLASS(438, "网络光纤子系统"),
  /**
   * 超高清解码子系统
   */
  DS_6904UD_B20H_CLASS(439, "超高清解码子系统"),
  /**
   * B21主控
   */
  DS_B21_MCU_NP_CLASS(440, "B21主控"),
  /**
   * B21机箱 x = A/S/D
   */
  DS_B21_S10_x_CLASS(441, "B21机箱 x = A/S/D"),
  /**
   * B21编码子系统
   */
  DS_6402HFH_B21D_CLASS(442, "B21编码子系统"),
  /**
   * B21解码子系统
   */
  DS_6508HD_B21D_CLASS(443, "B21解码子系统"),
  /**
   * B21 X86子系统
   */
  DS_iVMSE_B21HW_CLASS(444, "B21 X86子系统"),
  /**
   * C10S 集中式大屏控制器
   */
  DS_C10S(501, "C10S 集中式大屏控制器"),
  /**
   * SDI处理器
   */
  DS_C10N_SDI(551, "SDI处理器"),
  /**
   * 8路BNC处理器
   */
  DS_C10N_BIW(552, "8路BNC处理器"),
  /**
   * 显示处理器
   */
  DS_C10N_DON(553, "显示处理器"),
  /**
   * TVI输入板
   */
  DS_C10N_TVI(554, "TVI输入板"),
  /**
   * DVI 2路输入板
   */
  DS_C10N_DI2(555, "DVI 2路输入板"),
  /**
   * DVI，HDMI，VGA输出板带音频
   */
  DS_C10N_AUDIO_OUT(556, "DVI，HDMI，VGA输出板带音频"),
  /**
   * DVI，HDMI，VGA输入板带音频
   */
  DS_C10N_AUDIO_IN(557, "DVI，HDMI，VGA输入板带音频"),
  /**
   * 分布式大屏控制器
   */
  DS_C20N(570, "分布式大屏控制器"),
  /**
   * BNC输入设备
   */
  DS_C20N_BNC(571, "BNC输入设备"),
  /**
   * DVI输入设备
   */
  DS_C20N_DVI(572, "DVI输入设备"),
  /**
   * DP输入设备
   */
  DS_C20N_DP(573, "DP输入设备"),
  /**
   * 输出设备
   */
  DS_C20N_OUT(574, "输出设备"),
  /**
   * C20N服务器
   */
  DS_C20N_VWMS(5351, "C20N服务器"),
  /**
   * 两路DVI输入设备
   */
  DS_C20N_DI2(5352, "两路DVI输入设备"),
  /**
   * 两路DVI输出设备
   */
  DS_C20N_DO2(5353, "两路DVI输出设备"),
  /**
   * DP/HDMI 1路4K超高清输入设备
   */
  DS_C20N_UHDI(5354, "DP/HDMI 1路4K超高清输入设备"),
  /**
   * 两路YPbPr输入板
   */
  DS_C20N_YI2(5355, "两路YPbPr输入板"),
  /**
   * C12N服务器
   */
  DS_C12N_VWMS(5356, "C12N服务器"),
  /**
   * 1路DVI输出
   */
  DS_C12N_DO(5357, "1路DVI输出"),
  /**
   * 1路HDMI 4K输出
   */
  DS_C12N_HOE(5358, "1路HDMI 4K输出"),
  /**
   * HDMI输入节点(2路)
   */
  DS_C20N_HI2(5359, "HDMI输入节点(2路)"),
  /**
   * VGA输入节点(2路)
   */
  DS_C20N_VI2(5360, "VGA输入节点(2路)"),
  /**
   * SDI输入节点(2路)
   */
  DS_C20N_SI2(5361, "SDI输入节点(2路)"),
  /**
   * HDMI输出节点(2路)
   */
  DS_C20N_HO2(5362, "HDMI输出节点(2路)"),
  /**
   * C20N专用千兆交换机(24路)
   */
  DS_C20N_S24G(5363, "C20N专用千兆交换机(24路)"),
  /**
   * C20N专用万兆交换机(24路)
   */
  DS_C20N_S24X(5364, "C20N专用万兆交换机(24路)"),
  /**
   * 全息显示设备
   */
  DS_D1HXX(5591, "全息显示设备"),
  /**
   * 无线电梯网桥
   */
  ELEVATO_BRIDGE(5751, "无线电梯网桥"),
  /**
   * 5.8G室外1公里无线工地网
   */
  DS_3WF01S_5NG_M(5752, "5.8G室外1公里无线工地网"),
  /**
   * 2.4G室外500米网桥
   */
  DS_3WF0EC_2N_D(5753, "2.4G室外500米网桥"),
  /**
   * 报警主机百兆网络模块
   */
  DS_19M00_MN(601, "报警主机百兆网络模块"),
  /**
   * 室内机
   */
  DS_KH8302_A(602, "室内机"),
  /**
   * 门口机
   */
  DS_KD8101_2(603, "门口机"),
  /**
   * 管理机
   */
  DS_KM8301(604, "管理机"),
  /**
   * 别墅门口机
   */
  DS_KVXXXX_XX(605, "别墅门口机"),
  /**
   * 酒店锁
   */
  DS_LHPM1D_C(606, "酒店锁"),
  /**
   * 半数字转接模块
   */
  DS_KAM03(607, "半数字转接模块"),
  /**
   * 64-T高清解码器
   */
  DS64XXHD_T(701, "64-T高清解码器"),
  /**
   * 65万能解码器
   */
  DS_65XXD(703, "65万能解码器"),
  /**
   * 63-T标清解码器
   */
  DS63XXD_T(704, "63-T标清解码器"),
  /**
   * 抓屏服务器
   */
  SCE_SERVER(705, "抓屏服务器"),
  /**
   * 64XXHD-S高清解码器
   */
  DS_64XXHD_S(706, "64XXHD-S高清解码器"),
  /**
   * 多功能视音频转码器
   */
  DS_68XXT(707, "多功能视音频转码器"),
  /**
   * 65D-T万能解码器
   */
  DS_65XXD_T(708, "65D-T万能解码器"),
  /**
   * 65HD-T万能解码器
   */
  DS_65XXHD_T(709, "65HD-T万能解码器"),
  /**
   * 69XXUD超高清解码器
   */
  DS_69XXUD(710, "69XXUD超高清解码器"),
  /**
   * 65XXUD解码器
   */
  DS_65XXUD(711, "65XXUD解码器"),
  /**
   * 65XXUD_L解码器
   */
  DS_65XXUD_L(712, "65XXUD_L解码器"),
  /**
   * 65XXUD_T解码器
   */
  DS_65XXUD_T(713, "65XXUD_T解码器"),
  /**
   * 69XXHD解码器
   */
  DS_69XXHD(5001, "69XXHD解码器"),
  /**
   * LCD屏幕 解码卡
   */
  DS_D20XX(750, "LCD屏幕 解码卡"),
  /**
   * SDI矩阵
   */
  DS_C50S(751, "SDI矩阵"),
  /**
   * LCD屏幕 解码卡
   */
  DS_D50XX(752, "LCD屏幕 解码卡"),
  /**
   * LED屏发送卡
   */
  DS_D40(760, "LED屏发送卡"),
  /**
   * 视频会议服务器
   */
  DS_65VMXX(770, "视频会议服务器"),
  /**
   * 视频会议终端
   */
  DS_65VTXX(771, "视频会议终端"),
  /**
   * 视频会议一体式终端
   */
  DS_65VTA(772, "视频会议一体式终端"),
  /**
   * 互动教学终端
   */
  DS_65VT_RX(773, "互动教学终端"),
  /**
   * 大容量MCU
   */
  DS_65VM_MCU_NP(774, "大容量MCU"),
  /**
   * 一体式终端
   */
  DS_65VT0010(5571, "一体式终端"),
  /**
   * 高密度MCU主控板
   */
  DS_65VM_MCU(5572, "高密度MCU主控板"),
  /**
   * 高密度MCU媒体资源板
   */
  DS_65VM_MPC(5573, "高密度MCU媒体资源板"),
  /**
   * 司法提讯终端
   */
  DS_65VT2XXYR_SF(5574, "司法提讯终端"),
  /**
   * 视频会议大终端
   */
  DS_65VT0XXY(5575, "视频会议大终端"),
  /**
   * 智能一体式终端
   */
  DS_65VT0010Z(5576, "智能一体式终端"),
  /**
   * 智能分体式终端
   */
  DS_65VT0050Z(5577, "智能分体式终端"),
  /**
   * opensips服务器设备
   */
  DS_65VS0XXXS(5878, "opensips服务器设备"),
  /**
   * 视频会议会控平台设备
   */
  DS_65VS0XXXM(5879, "视频会议会控平台设备"),
  /**
   * 虚拟屏服务器
   */
  DS_CS_SERVER(800, "虚拟屏服务器"),
  /**
   * 视频网闸
   */
  DS_68GAP_MCU(831, "视频网闸"),
  /**
   * 门禁主机
   */
  DS_K260X(850, "门禁主机"),
  /**
   * 指纹一体机
   */
  DS_K1TXXX(851, "指纹一体机"),
  /**
   * 经济型门禁主机
   */
  DS_K280X(852, "经济型门禁主机"),
  /**
   * 经济型门禁一体机
   */
  DS_K1T80X(854, "经济型门禁一体机"),
  /**
   * 汉军指纹门禁一体机
   */
  RAC_6X00(856, "汉军指纹门禁一体机"),
  /**
   * 人员通道主机
   */
  DS_K2602_AX(857, "人员通道主机"),
  /**
   * 经济型指纹门禁产品
   */
  DS_K1T803F(858, "经济型指纹门禁产品"),
  /**
   * 分布式三层架构门禁主机
   */
  DS_K2700(859, "分布式三层架构门禁主机"),
  /**
   * 分布式三层架构就地控制器
   */
  DS_K270X(860, "分布式三层架构就地控制器"),
  /**
   * 视屏门禁一体机
   */
  DS_K1T500S(861, "视屏门禁一体机"),
  /**
   * 经济型指纹门禁产品
   */
  DS_K1A801F(862, "经济型指纹门禁产品"),
  /**
   * 人脸识别门禁一体机
   */
  DS_K1T600X(863, "人脸识别门禁一体机"),
  /**
   * 梯控主控制器
   */
  DS_K22X(864, "梯控主控制器"),
  /**
   * 梯控分控制器
   */
  DS_K2M0016AX(865, "梯控分控制器"),
  /**
   * 人员通道产品
   */
  DS_K2602S_AX(867, "人员通道产品"),
  /**
   * 立式/台式智能身份识别终端
   */
  DS_K560XX(870, "立式/台式智能身份识别终端"),
  /**
   * 低端门禁主机
   */
  DS_K260X_E(873, "低端门禁主机"),
  /**
   * 台式/壁挂式嵌入式人证设备
   */
  DS_K5603X(874, "台式/壁挂式嵌入式人证设备"),
  /**
   * 权限控制器
   */
  DS_K3M200X(875, "权限控制器"),
  /**
   * 通道控制器
   */
  DS_K3M100X(879, "通道控制器"),
  /**
   * 经销型人脸识别门禁一体机
   */
  DS_K1T8101XT(881, "经销型人脸识别门禁一体机"),
  /**
   * 经销型人脸识别门禁一体机
   */
  DS_K1T8101XX(882, "经销型人脸识别门禁一体机"),
  /**
   * 5604人证设备
   */
  DS_K5604(883, "5604人证设备"),
  /**
   * 中端人脸门禁一体机DS_K1T607（M/MF/E/EF/MG/MFG?MW/MFW/TM/TMF/TE/TEF/TMG/TMFG/TMW
   */
  DS_K1T607XXXX(884, "中端人脸门禁一体机DS_K1T607（M/MF/E/EF/MG/MFG?MW/MFW/TM/TMF/TE/TEF/TMG/TMFG/TMW"),
  /**
   * 低端经销指纹考勤机
   */
  DS_K1A850X(885, "低端经销指纹考勤机"),
  /**
   * 低端经销指纹门禁一体机
   */
  DS_K1T800X(886, "低端经销指纹门禁一体机"),
  /**
   * 中端人脸门禁一体机DS_K1T610（M/MF/E/EF/MG/MFG?MW/MFW/TM/TMF/TE/TEF/TMG/TMFG/TMW
   */
  DS_K1T610XXXX(887, "中端人脸门禁一体机DS_K1T610（M/MF/E/EF/MG/MFG?MW/MFW/TM/TMF/TE/TEF/TMG/TMFG/TMW"),
  /**
   * DS-K1T8115、DS-K1T8115M、DS-K1T8115M-Z 经销型人脸识别一体机
   */
  DS_K1T8115X(888, "DS-K1T8115、DS-K1T8115M、DS-K1T8115M-Z 经销型人脸识别一体机"),
  /**
   * 经销型人脸识别一体机
   */
  DS_K1T815LC_M(889, "经销型人脸识别一体机"),
  /**
   * 经销型人脸识别一体机
   */
  DS_K1T606M_Z(890, "经销型人脸识别一体机"),
  /**
   * 68M合码器
   */
  DS_6800M(900, "68M合码器"),
  /**
   * 信息发布主机
   */
  DS_68NTH(901, "信息发布主机"),
  /**
   * 信息发布服务器
   */
  DS_D60S(902, "信息发布服务器"),
  /**
   * 背投显示设备
   */
  DS_D10(931, "背投显示设备"),
  /**
   * 光纤收发器
   */
  DS_3K0X_NM(951, "光纤收发器"),
  /**
   * 百兆交换机
   */
  DS_3E2328(952, "百兆交换机"),
  /**
   * 千兆交换机
   */
  DS_3E1528(953, "千兆交换机"),
  /**
   * 屏幕服务器
   */
  SCREEN_LINK_SERVER(971, "屏幕服务器"),
  /**
   * OPS电脑盒
   */
  DS_D51OPSXX(972, "OPS电脑盒"),
  /**
   * IP 200万一体化云台
   */
  IP_PTSYS_MEGA200(1001, "IP 200万一体化云台"),
  /**
   * 鱼眼摄像机
   */
  IPCAM_FISHEYE(1002, "鱼眼摄像机"),
  /**
   * 经济型鱼眼摄像机
   */
  IPCAM_FISHEYE_E(1003, "经济型鱼眼摄像机"),
  /**
   * 双目摄像机
   */
  IPCAM_BINOCULAR(1004, "双目摄像机"),
  /**
   * 支持365的平台的IPC CAM
   */
  IPCAM_365(1010, "支持365的平台的IPC CAM"),
  /**
   * 支持A5S的平台的IPC CAM
   */
  IPCAM_R0(1011, "支持A5S的平台的IPC CAM"),
  /**
   * 支持385的平台的IPC CAM
   */
  IPCAM_R1(1012, "支持385的平台的IPC CAM"),
  /**
   * 支持R2的平台的IPC CAM
   */
  IPCAM_R2(1013, "支持R2的平台的IPC CAM"),
  /**
   * 支持8127的平台的IPC CAM
   */
  IPCAM_R3(1014, "支持8127的平台的IPC CAM"),
  /**
   * 支持S2的平台的IPC CAM
   */
  IPCAM_R4(1015, "支持S2的平台的IPC CAM"),
  /**
   * 支持365的平台的IPD CAM
   */
  IPDOME_365(1110, "支持365的平台的IPD CAM"),
  /**
   * 支持A5S的平台的IPD CAM
   */
  IPDOME_R0(1111, "支持A5S的平台的IPD CAM"),
  /**
   * 支持385的平台的IPD CAM
   */
  IPDOME_R1(1112, "支持385的平台的IPD CAM"),
  /**
   * 支持R2的平台的IPD CAM
   */
  IPDOME_R2(1113, "支持R2的平台的IPD CAM"),
  /**
   * 支持8127的平台的IPD CAM
   */
  IPDOME_R3(1114, "支持8127的平台的IPD CAM"),
  /**
   * 支持S2的平台的IPD CAM
   */
  IPDOME_R4(1115, "支持S2的平台的IPD CAM"),
  /**
   * 支持8127的平台的ITCCAM
   */
  ITCCAM_R3(1211, "支持8127的平台的ITCCAM"),
  /**
   * 无人机基站设备 （Ummanned Aerial Vehicle – Station）
   */
  UAV_S(1300, "无人机基站设备 （Ummanned Aerial Vehicle – Station）"),
  /**
   * ECT设备类型
   */
  TRAFFIC_ECT(1400, "ECT设备类型"),
  /**
   * 停车场服务器
   */
  TRAFFIC_PARKING_SERVER(1401, "停车场服务器"),
  /**
   * 出入口控制机
   */
  TRAFFIC_TME(1402, "出入口控制机"),
  /**
   * DS90XXHW_ST混合DVR
   */
  DS90XXHW_ST(2001, "DS90XXHW_ST混合DVR"),
  /**
   * DS-72xxHV_SH, DS-72xxHF-SH
   */
  DS72XXHX_SH(2002, "DS-72xxHV_SH, DS-72xxHF-SH"),
  /**
   * DS-92XX-HF-ST
   */
  DS_92XX_HF_ST(2003, "DS-92XX-HF-ST"),
  /**
   * 9100DVR_HF_XT
   */
  DS_91XX_HF_XT(2004, "9100DVR_HF_XT"),
  /**
   * 9000DVR_HF_XT
   */
  DS_90XX_HF_XT(2005, "9000DVR_HF_XT"),
  /**
   * 7300DVR_HX_SH
   */
  DS_73XXHX_SH(2006, "7300DVR_HX_SH"),
  /**
   * 7200DVR_HFH_ST
   */
  DS_72XXHFH_ST(2007, "7200DVR_HFH_ST"),
  /**
   * DS-67XXHF-SATA
   */
  DS_67XXHF_SATA(2008, "DS-67XXHF-SATA"),
  /**
   * DS-67XXHW
   */
  DS_67XXHW(2009, "DS-67XXHW"),
  /**
   * DS-67XXHW-SATA
   */
  DS_67XXHW_SATA(2010, "DS-67XXHW-SATA"),
  /**
   * DS-67XXHF
   */
  DS_67XXHF(2011, "DS-67XXHF"),
  /**
   * DS-72xxHF-SV
   */
  DS_72XXHF_SV(2012, "DS-72xxHF-SV"),
  /**
   * DS-72xxHW-SV
   */
  DS_72XXHW_SV(2013, "DS-72xxHW-SV"),
  /**
   * 8100DVR_HX_SH
   */
  DS_81XXHX_SH(2014, "8100DVR_HX_SH"),
  /**
   * 小型DVR
   */
  DS_71XXHX_SL(2015, "小型DVR"),
  /**
   * DS_76XXH_ST
   */
  DS_76XXH_ST(2016, "DS_76XXH_ST"),
  /**
   * 73HFH系列
   */
  DS_73XXHFH_ST(2017, "73HFH系列"),
  /**
   * 81HFH系列 ST
   */
  DS_81XXHFH_ST(2018, "81HFH系列 ST"),
  /**
   * hi3521
   */
  DS_72XXHFH_SL(2019, "hi3521"),
  /**
   * 2盘位ATM
   */
  DS_FDXXCGA_FLT(2020, "2盘位ATM"),
  /**
   * iDS-9100HF-ST/A
   */
  IDS_91XX_HF_ST_A(2100, "iDS-9100HF-ST/A"),
  /**
   * iDS-9100HF-ST/B
   */
  IDS_91XX_HF_ST_B(2101, "iDS-9100HF-ST/B"),
  /**
   * iDS-9000HF-ST/A
   */
  IDS_90XX_HF_ST_A(2102, "iDS-9000HF-ST/A"),
  /**
   * iDS-9000HF-ST/B
   */
  IDS_90XX_HF_ST_B(2103, "iDS-9000HF-ST/B"),
  /**
   * iDS-8100HF-ST/A
   */
  IDS_81XX_HF_ST_A(2104, "iDS-8100HF-ST/A"),
  /**
   * iDS-8100HF-ST/B
   */
  IDS_81XX_HF_ST_B(2105, "iDS-8100HF-ST/B"),
  /**
   * iDS-8000HF-ST/A
   */
  IDS_80XX_HF_ST_A(2106, "iDS-8000HF-ST/A"),
  /**
   * iDS-8000HF-ST/B
   */
  IDS_80XX_HF_ST_B(2107, "iDS-8000HF-ST/B"),
  /**
   * 智能混合ATM机
   */
  IDS_8104_AHFL_ST(2108, "智能混合ATM机"),
  /**
   * 垂直双目相机
   */
  IDS_2CD6812F_C(2109, "垂直双目相机"),
  /**
   * NVR DS-77XXHF-ST
   */
  DS_77XXN_ST(2201, "NVR DS-77XXHF-ST"),
  /**
   * 95XXN_ST NVR
   */
  DS_95XX_N_ST(2202, "95XXN_ST NVR"),
  /**
   * 85XXN_ST NVR
   */
  DS_85XX_N_ST(2203, "85XXN_ST NVR"),
  /**
   * 9600NVR_N_XT
   */
  DS_96XX_N_XT(2204, "9600NVR_N_XT"),
  /**
   * 7600NVR_N_SE
   */
  DS_76XX_N_SE(2205, "7600NVR_N_SE"),
  /**
   * 8608NVR_SX，包括4中类型DS-8608SNL-SP、DS-8608SNL-ST、DS-8608SN-SP、DS-8608SN-ST
   */
  DS_86XXSN_SX(2206, "8608NVR_SX，包括4中类型DS-8608SNL-SP、DS-8608SNL-ST、DS-8608SN-SP、DS-8608SN-ST"),
  /**
   * DS-96XX-N-RX
   */
  DS_96XX_N_RX(2207, "DS-96XX-N-RX"),
  /**
   * DS-71XXN-SL 民用产品
   */
  DS_71XXN_SL(2208, "DS-71XXN-SL 民用产品"),
  /**
   * CS_N1_1XX，民用事业部所用
   */
  CS_N1_1XX(2209, "CS_N1_1XX，民用事业部所用"),
  /**
   * 71XX_N_SN  经济型民用产品
   */
  DS_71XXN_SN(2210, "71XX_N_SN  经济型民用产品"),
  /**
   * N1_2XX        民用事业部所用
   */
  CS_N1_2XX(2211, "N1_2XX        民用事业部所用"),
  /**
   * 76XX_N_SHT  后端基线产品
   */
  DS_76XX_N_SHT(2212, "76XX_N_SHT  后端基线产品"),
  /**
   * 高新性能NVR(256)
   */
  DS_96XXX_N_E(2213, "高新性能NVR(256)"),
  /**
   * 76 78系列NVR，注：包括 4 8 16路的E1一盘位， 8 16 32路 E2两盘位； /N /P设备
   */
  DS_76XXN_EX(2214, "76 78系列NVR，注：包括 4 8 16路的E1一盘位， 8 16 32路 E2两盘位； /N /P设备"),
  /**
   * 77系列NVR，   注：包括8 16 32路， /N /P设备
   */
  DS_77XXN_E4(2215, "77系列NVR，   注：包括8 16 32路， /N /P设备"),
  /**
   * 86系列NVR，   注：包括8 16 32路， /N /P设备
   */
  DS_86XXN_E8(2216, "86系列NVR，   注：包括8 16 32路， /N /P设备"),
  /**
   * DS_9616N_H8
   */
  DS_9616N_H8(2217, "DS_9616N_H8"),
  /**
   * 表示72系列无线DVR产品，其中72后面的xx表示通道数，H后的X目前仅有HW,为了后续扩展保留，E后面的X表示的是盘位数，G XY表示的是无线类型
   */
  DS_72XXHX_EX_GXY(2218,
      "表示72系列无线DVR产品，其中72后面的xx表示通道数，H后的X目前仅有HW,为了后续扩展保留，E后面的X表示的是盘位数，G XY表示的是无线类型"),
  /**
   * 表示是76系列无线NVR产品，其中76后面的xx表示通道数，E后面的X表示的是盘位数，G XY表示的是无线类型
   */
  DS_76XXN_EX_GXY(2219, "表示是76系列无线NVR产品，其中76后面的xx表示通道数，E后面的X表示的是盘位数，G XY表示的是无线类型"),
  /**
   * 72XXHXH_SH_21
   */
  DS_72XXHXH_SH_21(2220, "72XXHXH_SH_21"),
  /**
   * 72XXHXH_SH_31
   */
  DS_72XXHXH_SH_31(2221, "72XXHXH_SH_31"),
  /**
   * 73XXHXH_SH_31
   */
  DS_73XXHXH_SH_31(2222, "73XXHXH_SH_31"),
  /**
   * 81XXHXH_SH_31
   */
  DS_81XXHXH_SH_31(2223, "81XXHXH_SH_31"),
  /**
   * 71XXHXH_SH_21
   */
  DS_71XXHXH_SH_21(2224, "71XXHXH_SH_21"),
  /**
   * 71XXHXH_SH_31
   */
  DS_71XXHXH_SH_31(2225, "71XXHXH_SH_31"),
  /**
   * 便携式主机
   */
  DS_NBXX_N_E1_X(2226, "便携式主机"),
  /**
   * DS_96XXN_FX
   */
  DS_96XXN_FX(2230, "DS_96XXN_FX"),
  /**
   * DS_86XXN_FX
   */
  DS_86XXN_FX(2231, "DS_86XXN_FX"),
  /**
   * 96系列高性能设备
   */
  DS_96XXXN_HX(2232, "96系列高性能设备"),
  /**
   * DS_86XXN_I
   */
  DS_86XXN_I(2233, "DS_86XXN_I"),
  /**
   * DS_77XX_N_I
   */
  DS_77XX_N_I(2234, "DS_77XX_N_I"),
  /**
   * DS_76XX_N_I
   */
  DS_76XX_N_I(2235, "DS_76XX_N_I"),
  /**
   * DS_78XX_N_I
   */
  DS_78XX_N_I(2236, "DS_78XX_N_I"),
  /**
   * DS-96XXX_N_I（DS-96128N-I16、DS-96128N-I24、DS-96256N-I16、DS-96256N-I24）
   */
  DS_96XXXN_IX(2237, "DS-96XXX_N_I（DS-96128N-I16、DS-96128N-I24、DS-96256N-I16、DS-96256N-I24）"),
  /**
   * DS_90XXHXH_XT（DS-9016HQH-XT）
   */
  DS_90XXHXH_XT(2238, "DS_90XXHXH_XT（DS-9016HQH-XT）"),
  /**
   * PCNVR_IVMS_4200
   */
  PCNVR_IVMS_4200(2301, "PCNVR_IVMS_4200"),
  /**
   * IVMS-6200 交通诱导分析仪
   */
  IVMS_6200_TP(2401, "IVMS-6200 交通诱导分析仪"),
  /**
   * IVMS-6200 交通取证分析仪
   */
  IVMS_6200_TF(2402, "IVMS-6200 交通取证分析仪"),
  /**
   * iVMS-6200(/D)
   */
  IVMS_6200_D(2403, "iVMS-6200(/D)"),
  /**
   * iDS-81xxAHW-ST
   */
  IDS_81XXAHW_ST(2405, "iDS-81xxAHW-ST"),
  /**
   * iDS-81xxAHW-SP
   */
  IDS_81XXAHW_SP(2406, "iDS-81xxAHW-SP"),
  /**
   * iDS-81xxAHWL-ST
   */
  IDS_81XXAHWL_ST(2407, "iDS-81xxAHWL-ST"),
  /**
   * iDS-81xxAHWL-SP
   */
  IDS_81XXAHWL_SP(2408, "iDS-81xxAHWL-SP"),
  /**
   * iDS_9616N_H8
   */
  IDS_9616N_H8(2409, "iDS_9616N_H8"),
  /**
   * IVMS_6200_SMD
   */
  IVMS_6200_SMD(2500, "IVMS_6200_SMD"),
  /**
   * B20一体机
   */
  DS_6904UD_AIOE_H_CLASS(4002, "B20一体机"),
  /**
   * B21 编码
   */
  DS_6402HFH_B21B_CLASS(4005, "B21 编码"),
  /**
   * B21 HDMI解码
   */
  DS_6902UD_B21H_CLASS(4006, "B21 HDMI解码"),
  /**
   * B21 DVI解码
   */
  DS_6902UD_B21D_CLASS(4007, "B21 DVI解码"),
  /**
   * B21 VGA解码
   */
  DS_6902UD_B21V_CLASS(4008, "B21 VGA解码"),
  /**
   * B20 DVI解码
   */
  DS_6904UD_B20D_CLASS(4010, "B20 DVI解码"),
  /**
   * B20 VGA解码
   */
  DS_6904UD_B20V_CLASS(4011, "B20 VGA解码"),
  /**
   * 主控板
   */
  DS_AIOH_MCU_NP(4042, "主控板"),
  /**
   * 4路DVI输入板
   */
  DS_6404HFH_AIOH_D(4043, "4路DVI输入板"),
  /**
   * 4路DVI输出板
   */
  DS_6908UD_AIOH_D(4044, "4路DVI输出板"),
  /**
   * 4路HDMI输出板
   */
  DS_6908UD_AIOH_H(4045, "4路HDMI输出板"),
  /**
   * 解码一体机
   */
  DS_69XXUD_B(4046, "解码一体机"),
  /**
   * 4路DVI输入板
   */
  DS_6404HFH_I(4047, "4路DVI输入板"),
  /**
   * 8路HDMI输出板
   */
  DS_6904UD_O(4048, "8路HDMI输出板"),
  /**
   * 主控板
   */
  DS_Y10_MCU(5771, "主控板"),
  /**
   * 交换板
   */
  DS_Y10_SW1(5772, "交换板"),
  /**
   * 8路DVI显示接口解码板
   */
  DS_6516UD_Y10D(5773, "8路DVI显示接口解码板"),
  /**
   * 16路DVI显示接口解码板
   */
  DS_6532UD_Y10D(5774, "16路DVI显示接口解码板"),
  /**
   * 24个万兆接口编码接入板
   */
  DS_6E2724_Y10(5775, "24个万兆接口编码接入板"),
  /**
   * 双路2620、内存32G业务板
   */
  DS_68SAA_AA_Y10(5776, "双路2620、内存32G业务板"),
  /**
   * 双路2630、内存32G业务板
   */
  DS_68SBA_AA_Y10(5777, "双路2630、内存32G业务板"),
  /**
   * 双路2650、内存32G业务板
   */
  DS_68SCA_AA_Y10(5778, "双路2650、内存32G业务板"),
  /**
   * P4显卡版
   */
  DS_68GPU_A1_Y10(5779, "P4显卡版"),
  /**
   * CPU服务板
   */
  DS_CPU_SERVER(5780, "CPU服务板"),
  /**
   * GPU服务板
   */
  DS_GPU_SERVER(5781, "GPU服务板"),
  /**
   * 大数据服务板
   */
  DS_BIGDATA_SERVER(5782, "大数据服务板"),
  /**
   * 主控板
   */
  DS_B80_MCU(5821, "主控板"),
  /**
   * 交换板
   */
  DS_B80_SW(5822, "交换板"),
  /**
   * 服务板
   */
  DS_B80_SR_01(5823, "服务板"),
  /**
   * 智能分析板，支持4路分析能力
   */
  DS_B80_AI04(5824, "智能分析板，支持4路分析能力"),
  /**
   * 存储板，支持4个2.5寸2T硬盘
   */
  DS_B80_ST(5825, "存储板，支持4个2.5寸2T硬盘"),
  /**
   * 通用物联网关
   */
  DS_3LGCX(5841, "通用物联网关"),
  /**
   * LoRa网关
   */
  DS_3LGRX(5842, "LoRa网关"),
  /**
   * 电梯网关设备
   */
  DS_3LGT4(5843, "电梯网关设备"),
  /**
   * NB-IoT电梯网关
   */
  DS_3LGT40_N(5844, "NB-IoT电梯网关"),
  /**
   * 百兆交换机
   */
  DS_3E11XX(5681, "百兆交换机"),
  /**
   * 千兆上行交换机
   */
  DS_3E13XX(5682, "千兆上行交换机"),
  /**
   * 千兆交换机
   */
  DS_3E15XX(5683, "千兆交换机"),
  /**
   * 百兆POE交换机
   */
  DS_3E11XXP(5684, "百兆POE交换机"),
  /**
   * 千兆上行POE交换机
   */
  DS_3E13XXP(5685, "千兆上行POE交换机"),
  /**
   * 千兆POE交换机
   */
  DS_3E15XXP(5686, "千兆POE交换机"),
  /**
   * 收发器接收卡
   */
  DS_3D01R_NM(5691, "收发器接收卡"),
  /**
   * 收发器发送机
   */
  DS_3D01T_NM(5692, "收发器发送机"),
  /**
   * 收发器网管卡
   */
  DS_3K02_RNM(5693, "收发器网管卡"),
  /**
   * 超脑人体DVR产品
   */
  IDS_90XX_HXH_XX_S(6001, "超脑人体DVR产品"),
  /**
   * 超脑人脸DVR产品
   */
  IDS_90XX_HXH_XX_FA(6002, "超脑人脸DVR产品"),
  /**
   * KY2017平台审讯机DS-8104SHFH（L）-K4/4P
   */
  DS_81XX_SHXL_K4(6101, "KY2017平台审讯机DS-8104SHFH（L）-K4/4P"),
  /**
   * 标准庭审主机DS-8116THFHL-F4
   */
  DS_8116THFHL_F4(6201, "标准庭审主机DS-8116THFHL-F4"),
  /**
   * DS_81XXAHQ_E4(TVI ATM)
   */
  DS_81XXAHQ_E4(6301, "DS_81XXAHQ_E4(TVI ATM)"),
  /**
   * IDS_81XXAHQ_E4(智能TVI ATM)
   */
  IDS_81XXAHQ_E4(6302, "IDS_81XXAHQ_E4(智能TVI ATM)"),
  /**
   * 超脑智能ATM NVR(iDS-8632NX-I8/A)
   */
  IDS_86XX_NX_A(7501, "超脑智能ATM NVR(iDS-8632NX-I8/A)"),
  /**
   * 人体超脑智能NVR
   */
  IDS_96XX_NX_S(7502, "人体超脑智能NVR"),
  /**
   * 超脑加油站NVR
   */
  IDS_96XX_NX_V(7503, "超脑加油站NVR"),
  /**
   * 人脸超脑智能NVR iDS-9632NX-I8/FA
   */
  IDS_96XX_NX_FA(7504, "人脸超脑智能NVR iDS-9632NX-I8/FA"),
  /**
   * 86系列安全帽检测NVR产品
   */
  IDS_86XX_NX_IX_B(7505, "86系列安全帽检测NVR产品"),
  /**
   * 人脸超脑智能安检产品NVR(IDS_67XX_NX/S_X)
   */
  IDS_67XX_NX_S_X(7506, "人脸超脑智能安检产品NVR(IDS_67XX_NX/S_X)"),
  /**
   * 学生三目相机
   */
  IDS_ECDXX_HE(8001, "学生三目相机"),
  /**
   * 教师三目相机
   */
  IDS_ECDXX_HT(8002, "教师三目相机"),
  /**
   * 4K半球
   */
  IDS_ECDXX_E(8101, "4K半球"),
  /**
   * 二代人脸抓拍机
   */
  IDS_EPTXX_HF(8201, "二代人脸抓拍机"),
  /**
   * 3200W全景拼接IPC型号
   */
  DS_2CD69XXX_I(8351, "3200W全景拼接IPC型号"),
  /**
   * 超高频固定式读卡器DS_TRI900
   */
  DS_TRIXX(8471, "超高频固定式读卡器DS_TRI900"),
  /**
   * 监所智能服务器
   */
  DS_IEXX_E_J(11501, "监所智能服务器"),
  /**
   * 67系列NVS产品(iDS-6704NX/A)
   */
  IDS_67XX_NX_A(12501, "67系列NVS产品(iDS-6704NX/A)"),
  /**
   * 67系列录播NVS产品
   */
  IDS_67XX_NX_L(12502, "67系列录播NVS产品"),
  /**
   * 录播NVS行业专业产品
   */
  IDS_ENIXX_XHE(12503, "录播NVS行业专业产品"),
  /**
   * 超脑加油站NVS
   */
  IDS_67XX_NX_V(12504, "超脑加油站NVS"),
  /**
   * 67系列安全帽检测NVS产品
   */
  IDS_67XX_NX_B(12505, "67系列安全帽检测NVS产品"),
  /**
   * 脸谱单机
   */
  DS_IE63XX_E_FA(13001, "脸谱单机"),
  /**
   * 猎鹰服务器
   */
  DS_DS_GPKIA(13002, "猎鹰服务器"),
  /**
   * 脸谱纯分析
   */
  DS_DS_PURE(13003, "脸谱纯分析"),
  /**
   * 人脸静态数据服务器
   */
  DS_DS_FS(13004, "人脸静态数据服务器"),
  /**
   * 抓拍检测服务器
   */
  DS_DS_FD(13005, "抓拍检测服务器"),
  /**
   * 刀锋
   */
  DS_DS_BLADE(13006, "刀锋"),
  /**
   * 模型对比服务器
   */
  DS_DS_HMCP(13007, "模型对比服务器"),
  /**
   * 智能锁盒子
   */
  DS_LNX_RF(13501, "智能锁盒子"),
  /**
   * PA雷达
   */
  DS_PA_RADAR(13551, "PA雷达"),
  /**
   * 周界雷达
   */
  DS_PERIMETER_RADAR(13552, "周界雷达"),
  /**
   * 消防网关
   */
  DS_N1104X(14001, "消防网关"),
  /**
   * 用户信息传输设备
   */
  DS_N1103X(14002, "用户信息传输设备"),
  /**
   * 用水设备
   */
  NP_FSC201(14003, "用水设备"),
  /**
   * 组合式电气火灾探测器
   */
  NP_FDC240(14004, "组合式电气火灾探测器"),
  /**
   * 物联网网关
   */
  DS_N1107(14005, "物联网网关");

  private int code;
  private String description;

  public static Optional<DeviceModel> byCode(int code) {
    return EnumSet.allOf(DeviceModel.class).stream().filter(in -> in.code == code).findFirst();
  }
}
