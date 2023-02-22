package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.struct.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 上传的消息类型，不同的报警信息对应不同的类型，通过类型区分是什么报警信息
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum MessageCallbackCommand implements HikvisionEnum {

  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 智能报警 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 行为分析信息，pAlarmInfo参数参考{@link NET_VCA_RULE_ALARM}
   */
  COMM_ALARM_RULE(0x1102, "行为分析信息"),
  /**
   * 客流量统计报警信息，pAlarmInfo参数参考{@link NET_DVR_PDC_ALRAM_INFO}
   */
  COMM_ALARM_PDC(0x1103, "客流量统计报警信息"),
  /**
   * 事件数据信息，pAlarmInfo参数参考{@link NET_DVR_RULE_INFO_ALARM}
   */
  COMM_RULE_INFO_UPLOAD(0x1107, "事件数据信息"),
  /**
   * 人脸检测识别报警信息，pAlarmInfo参数参考{@link NET_DVR_FACEDETECT_ALARM}
   */
  COMM_ALARM_FACE(0x1106, "人脸检测识别报警信息"),
  /**
   * 人脸抓拍结果信息，pAlarmInfo参数参考{@link NET_VCA_FACESNAP_RESULT}
   */
  COMM_UPLOAD_FACESNAP_RESULT(0x1112, "人脸抓拍结果信息"),
  /**
   * 人脸抓拍人员统计信息，pAlarmInfo参数参考{@link NET_DVR_FACECAPTURE_STATISTICS_RESULT}
   */
  COMM_FACECAPTURE_STATISTICS_RESULT(0x112a, "人脸抓拍人员统计信息"),
  /**
   * 人脸黑名单比对结果信息，pAlarmInfo参数参考{@link NET_VCA_FACESNAP_MATCH_ALARM}
   */
  COMM_SNAP_MATCH_ALARM(0x2902, "人脸黑名单比对结果信息"),
  /**
   * 人脸侦测报警信息，pAlarmInfo参数参考{@link NET_DVR_FACE_DETECTION}
   */
  COMM_ALARM_FACE_DETECTION(0x4010, "人脸侦测报警信息"),
  /**
   * 教师离开讲台报警，pAlarmInfo参数参考{@link NET_DVR_TARGET_LEFT_REGION_ALARM}
   */
  COMM_ALARM_TARGET_LEFT_REGION(0x4011, "教师离开讲台报警"),
  /**
   * 人员侦测信息，pAlarmInfo参数参考{@link NET_DVR_PEOPLE_DETECTION_RESULT}
   */
  COMM_PEOPLE_DETECTION_UPLOAD(0x4014, "人员侦测信息"),
  /**
   * 智能检测通用报警(Json数据结构) 人体目标识别报警Json数据。具体详情参考官方SDK使用手册
   */
  COMM_VCA_ALARM(0x4993, "智能检测通用报警(Json数据结构) 人体目标识别报警Json数据"),
  /**
   * ISAPI协议报警信息，pAlarmInfo参数参考{@link NET_DVR_ALARM_ISAPI_INFO}
   */
  COMM_ISAPI_ALARM(0x6009, "ISAPI协议报警信息"),
  /**
   * 体征异常报警(Json数据结构)。具体详情参考官方SDK使用手册
   */
  COMM_SIGN_ABNORMAL_ALARM(0x6120, "体征异常报警(Json数据结构)"),
  /**
   * 高频人员检测报警(Json数据结构)。具体详情参考官方SDK使用手册
   */
  COMM_HFPD_ALARM(0x6121, "高频人员检测报警(Json数据结构)"),
  /**
   * VQD报警信息，pAlarmInfo参数参考{@link NET_DVR_VQD_ALARM}
   */
  COMM_ALARM_VQD_EX(0x1116, "VQD报警信息"),
  /**
   * VQD诊断报警信息，pAlarmInfo参数参考{@link NET_DVR_VQD_DIAGNOSE_INFO}
   */
  COMM_ALARM_VQD(0x6000, "VQD诊断报警信息"),
  /**
   * 场景变更报警信息，pAlarmInfo参数参考{@link NET_DVR_SCENECHANGE_DETECTION_RESULT}
   */
  COMM_SCENECHANGE_DETECTION_UPLOAD(0x1130, "场景变更报警信息"),
  /**
   * 压线报警信息，pAlarmInfo参数参考{@link NET_DVR_CROSSLINE_ALARM}
   */
  COMM_CROSSLINE_ALARM(0x1131, "压线报警信息"),
  /**
   * 声音报警信息，pAlarmInfo参数参考{@link NET_DVR_AUDIOEXCEPTION_ALARM}
   */
  COMM_ALARM_AUDIOEXCEPTION(0x1150, "声音报警信息"),
  /**
   * 虚焦报警信息，pAlarmInfo参数参考{@link NET_DVR_DEFOCUS_ALARM}
   */
  COMM_ALARM_DEFOCUS(0x1151, "虚焦报警信息"),
  /**
   * 开关灯检测报警信息，pAlarmInfo参数参考{@link NET_DVR_SWITCH_LAMP_ALARM}
   */
  COMM_SWITCH_LAMP_ALARM(0x6002, "开关灯检测报警信息"),
  /**
   * 热度图报警信息，pAlarmInfo参数参考{@link NET_DVR_HEATMAP_RESULT}
   */
  COMM_UPLOAD_HEATMAP_RESULT(0x4008, "热度图报警信息"),
  /**
   * 火点检测报警信息，pAlarmInfo参数参考{@link NET_DVR_FIREDETECTION_ALARM}
   */
  COMM_FIREDETECTION_ALARM(0x4991, "火点检测报警信息"),
  /**
   * 人脸测温报警信息，pAlarmInfo参数参考{@link NET_DVR_FACE_THERMOMETRY_ALARM}
   */
  COMM_FACE_THERMOMETRY_ALARM(0x4994, "人脸测温报警信息"),
  /**
   * 温差报警信息，pAlarmInfo参数参考{@link NET_DVR_THERMOMETRY_DIFF_ALARM}
   */
  COMM_THERMOMETRY_DIFF_ALARM(0x5211, "温差报警信息"),
  /**
   * 温度报警信息，pAlarmInfo参数参考{@link NET_DVR_THERMOMETRY_ALARM}
   */
  COMM_THERMOMETRY_ALARM(0x5212, "温度报警信息"),
  /**
   * 船只检测报警信息，pAlarmInfo参数参考{@link NET_DVR_SHIPSDETECTION_ALARM}
   */
  COMM_ALARM_SHIPSDETECTION(0x4521, "船只检测报警信息"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 智能交通 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 交通事件报警信息，pAlarmInfo参数参考{@link NET_DVR_AID_ALARM}
   */
  COMM_ALARM_AID(0x1110, "交通事件报警信息"),
  /**
   * 交通参数统计报警信息，pAlarmInfo参数参考{@link NET_DVR_TPS_ALARM}
   */
  COMM_ALARM_TPS(0x1111, "交通参数统计报警信息"),
  /**
   * 交通取证报警信息，pAlarmInfo参数参考{@link NET_DVR_TFS_ALARM}
   */
  COMM_ALARM_TFS(0x1113, "交通取证报警信息"),
  /**
   * 交通参数统计报警信息(扩展)，pAlarmInfo参数参考{@link NET_DVR_TPS_ALARM_V41}
   */
  COMM_ALARM_TPS_V41(0x1114, "交通参数统计报警信息(扩展)"),
  /**
   * 交通事件报警信息扩展，pAlarmInfo参数参考{@link NET_DVR_AID_ALARM_V41}
   */
  COMM_ALARM_AID_V41(0x1115, "交通事件报警信息扩展"),
  /**
   * 交通抓拍结果，pAlarmInfo参数参考{@link NET_DVR_PLATE_RESULT}
   */
  COMM_UPLOAD_PLATE_RESULT(0x2800, "交通抓拍结果"),
  /**
   * 交通抓拍结果(新报警信息)，pAlarmInfo参数参考{@link NET_ITS_PLATE_RESULT}
   */
  COMM_ITS_PLATE_RESULT(0x3050, "交通抓拍结果(新报警信息)"),
  /**
   * 交通统计数据上传，pAlarmInfo参数参考{@link NET_ITS_TRAFFIC_COLLECT}
   */
  COMM_ITS_TRAFFIC_COLLECT(0x3051, "交通统计数据上传"),
  /**
   * 车辆黑名单报警上传，pAlarmInfo参数参考{@link NET_ITS_ECT_BLACKLIST}
   */
  COMM_ITS_BLACKLIST_ALARM(0x3057, "车辆黑名单报警上传"),
  /**
   * 车辆黑白名单数据需要同步报警上传，pAlarmInfo参数参考{@link NET_DVR_VEHICLE_CONTROL_LIST_DSALARM}
   */
  COMM_VEHICLE_CONTROL_LIST_DSALARM(0x3058, "车辆黑白名单数据需要同步报警上传"),
  /**
   * 黑白名单车辆报警上传，pAlarmInfo参数参考{@link NET_DVR_VEHICLE_CONTROL_ALARM}
   */
  COMM_VEHICLE_CONTROL_ALARM(0x3059, "黑白名单车辆报警上传"),
  /**
   * 消防报警上传，pAlarmInfo参数参考{@link NET_DVR_FIRE_ALARM}
   */
  COMM_FIRE_ALARM(0x3060, "消防报警上传"),
  /**
   * 车辆二次识别结果上传，pAlarmInfo参数参考{@link NET_DVR_VEHICLE_RECOG_RESULT}
   */
  COMM_VEHICLE_RECOG_RESULT(0x3062, "车辆二次识别结果上传"),
  /**
   * 传感器上传信息，pAlarmInfo参数参考{@link NET_DVR_SENSOR_INFO_UPLOAD}
   */
  COMM_ALARM_SENSORINFO_UPLOAD(0x3077, "传感器上传信息"),
  /**
   * 抓拍图片上传，pAlarmInfo参数参考{@link NET_DVR_CAPTURE_UPLOAD}
   */
  COMM_ALARM_CAPTURE_UPLOAD(0x3078, "抓拍图片上传"),
  /**
   * 雷达报警上传，pAlarmInfo参数参考{@link NET_DVR_ALARM_RADARINFO}
   */
  COMM_ITS_RADARINFO(0x3079, "雷达报警上传"),
  /**
   * 信号灯异常检测上传，pAlarmInfo参数参考{@link NET_DVR_SIGNALLAMP_DETCFG}
   */
  COMM_SIGNAL_LAMP_ABNORMAL(0x3080, "信号灯异常检测上传"),
  /**
   * TPS实时过车数据上传，pAlarmInfo参数参考{@link NET_DVR_TPS_REAL_TIME_INFO}
   */
  COMM_ALARM_TPS_REAL_TIME(0x3081, "TPS实时过车数据上传"),
  /**
   * TPS统计过车数据上传，pAlarmInfo参数参考{@link NET_DVR_TPS_STATISTICS_INFO}
   */
  COMM_ALARM_TPS_STATISTICS(0x3082, "TPS统计过车数据上传"),
  /**
   * 路口设备异常报警信息，pAlarmInfo参数参考{@link NET_ITS_ROADINFO}
   */
  COMM_ITS_ROAD_EXCEPTION(0x4500, "路口设备异常报警信息"),
  /**
   * 指示灯外控报警信息，pAlarmInfo参数参考{@link NET_DVR_EXTERNAL_CONTROL_ALARM}
   */
  COMM_ITS_EXTERNAL_CONTROL_ALARM(0x4520, "指示灯外控报警信息"),
  /**
   * 出入口人脸抓拍数据，pAlarmInfo参数参考{@link NET_ITS_GATE_FACE}
   */
  COMM_ITS_GATE_FACE(0x3053, "出入口人脸抓拍数据"),
  /**
   * 出入口控制机数据，pAlarmInfo参数参考{@link NET_DVR_GATE_ALARMINFO}
   */
  COMM_ITS_GATE_ALARMINFO(0x3061, "出入口控制机数据"),
  /**
   * 出入口付费信息，pAlarmInfo参数参考{@link NET_DVR_GATE_CHARGEINFO}
   */
  COMM_GATE_CHARGEINFO_UPLOAD(0x3064, "出入口付费信息"),
  /**
   * 出入口控制器TME车辆抓拍信息，pAlarmInfo参数参考{@link NET_DVR_TME_VEHICLE_RESULT}
   */
  COMM_TME_VEHICLE_INDENTIFICATION(0x3065, "出入口控制器TME车辆抓拍信息"),
  /**
   * 出入口卡片信息，pAlarmInfo参数参考{@link NET_DVR_GATE_CARDINFO}
   */
  COMM_GATE_CARDINFO_UPLOAD(0x3066, "出入口卡片信息"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 报警主机 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 网络报警主机报警信息
   */
  COMM_ALARM_ALARMHOST(0x1105, "网络报警主机报警信息"),
  /**
   * 模拟量数据实时信息
   */
  COMM_SENSOR_VALUE_UPLOAD(0x1120, "模拟量数据实时信息"),
  /**
   * 模拟量报警信息
   */
  COMM_SENSOR_ALARM(0x1121, "模拟量报警信息"),
  /**
   * 开关量报警信息
   */
  COMM_SWITCH_ALARM(0x1122, "开关量报警信息"),
  /**
   * 故障报警信息
   */
  COMM_ALARMHOST_EXCEPTION(0x1123, "故障报警信息"),
  /**
   * 防护舱状态信息
   */
  COMM_ALARMHOST_SAFETYCABINSTATE(0x1125, "防护舱状态信息"),
  /**
   * 报警输出口或警号状态信息
   */
  COMM_ALARMHOST_ALARMOUTSTATUS(0x1126, "报警输出口或警号状态信息"),
  /**
   * 报警主机CID报告报警上传
   */
  COMM_ALARMHOST_CID_ALARM(0x1127, "报警主机CID报告报警上传"),
  /**
   * 报警主机外接设备报警信息
   */
  COMM_ALARMHOST_EXTERNAL_DEVICE_ALARM(0x1128, "报警主机外接设备报警信息"),
  /**
   * 报警数据信息
   */
  COMM_ALARMHOST_DATA_UPLOAD(0x1129, "报警数据信息"),
  /**
   * 无线网络信息上传
   */
  COMM_ALARM_WIRELESS_INFO(0x122b, "无线网络信息上传"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 其他设备报警 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 移动侦测、视频丢失、遮挡、IO信号量等报警信息(V3.0以下版本支持的设备)
   */
  COMM_ALARM(0x1100, "移动侦测、视频丢失、遮挡、IO信号量等报警信息(V3.0以下版本支持的设备)"),
  /**
   * 移动侦测、视频丢失、遮挡、IO信号量等报警信息(V3.0以上版本支持的设备)
   */
  COMM_ALARM_V30(0x4000, "移动侦测、视频丢失、遮挡、IO信号量等报警信息(V3.0以上版本支持的设备)"),
  /**
   * 移动侦测、视频丢失、遮挡、IO信号量等报警信息，报警数据为可变长
   */
  COMM_ALARM_V40(0x4007, "移动侦测、视频丢失、遮挡、IO信号量等报警信息，报警数据为可变长"),
  /**
   * 混合型DVR、NVR等在IPC接入配置改变时的报警信息
   */
  COMM_IPCCFG(0x4001, "混合型DVR、NVR等在IPC接入配置改变时的报警信息"),
  /**
   * 混合型DVR、NVR等在IPC接入配置改变时的报警信息（扩展）
   */
  COMM_IPCCFG_V31(0x4002, "混合型DVR、NVR等在IPC接入配置改变时的报警信息（扩展）"),
  /**
   * PIR报警、无线报警、呼救报警信息
   */
  COMM_IPC_AUXALARM_RESULT(0x2820, "PIR报警、无线报警、呼救报警信息"),
  /**
   * CVR设备报警信息，由于通道值大于256而扩展
   */
  COMM_ALARM_DEVICE(0x4004, "CVR设备报警信息，由于通道值大于256而扩展"),
  /**
   * CVR设备报警信息扩展(增加报警信息子结构)
   */
  COMM_ALARM_DEVICE_V40(0x4009, "CVR设备报警信息扩展(增加报警信息子结构)"),
  /**
   * CVR外部报警信息
   */
  COMM_ALARM_CVR(0x4005, "CVR外部报警信息"),
  /**
   * ATM DVR交易信息
   */
  COMM_TRADEINFO(0x1500, "ATM DVR交易信息"),
  /**
   * 热备异常报警（N+1模式异常报警）信息
   */
  COMM_ALARM_HOT_SPARE(0x4006, "热备异常报警（N+1模式异常报警）信息"),
  /**
   * 按钮按下报警信息(IP可视对讲主机)
   */
  COMM_ALARM_BUTTON_DOWN_EXCEPTION(0x1152, "按钮按下报警信息(IP可视对讲主机)"),
  /**
   * 多屏控制器上传的报警信息
   */
  COMM_SCREEN_ALARM(0x5000, "多屏控制器上传的报警信息"),
  /**
   * LCD屏幕报警信息
   */
  COMM_ALARM_LCD(0x5011, "LCD屏幕报警信息"),
  /**
   * 可视对讲事件记录信息
   */
  COMM_UPLOAD_VIDEO_INTERCOM_EVENT(0x1132, "可视对讲事件记录信息"),
  /**
   * 可视对讲报警信息
   */
  COMM_ALARM_VIDEO_INTERCOM(0x1133, "可视对讲报警信息"),
  /**
   * 解码器智能解码报警信息
   */
  COMM_ALARM_DEC_VCA(0x5010, "解码器智能解码报警信息"),
  /**
   * GIS信息
   */
  COMM_GISINFO_UPLOAD(0x4012, "GIS信息"),
  /**
   * 防破坏报警信息
   */
  COMM_VANDALPROOF_ALARM(0x4013, "防破坏报警信息"),
  /**
   * 存储智能检测报警信息
   */
  COMM_ALARM_STORAGE_DETECTION(0x4015, "存储智能检测报警信息"),
  /**
   * 会议终端会议呼叫报警信息
   */
  COMM_CONFERENCE_CALL_ALARM(0x5012, "会议终端会议呼叫报警信息"),
  /**
   * GPS报警信息
   */
  COMM_ALARM_ALARMGPS(0x1202, "GPS报警信息"),
  /**
   * 交换机报警信息
   */
  COMM_ALARM_SWITCH_CONVERT(0x5004, "交换机报警信息"),
  /**
   * 审讯主机报警信息
   */
  COMM_INQUEST_ALARM(0x6005, "审讯主机报警信息"),
  /**
   * 鹰眼全景联动到位事件信息
   */
  COMM_PANORAMIC_LINKAGE_ALARM(0x5213, "鹰眼全景联动到位事件信息"),
  /**
   * 标签信息上传
   */
  COMM_TAG_INFO_ALARM(0x5215, "标签信息上传"),
  /**
   * 集群报警信息（集群异动（扩容/缩容等）时布防CS失败异常，收到此异常，需要重新布防集群设备，否则会有CS的报警丢失。普通设备不会回调该异常，只针对集群）
   */
  COMM_CLUSTER_ALARM(0x6020,
      "集群报警信息（集群异动（扩容/缩容等）时布防CS失败异常，收到此异常，需要重新布防集群设备，否则会有CS的报警丢失。普通设备不会回调该异常，只针对集群）");

  private int code;
  private String description;

  public static Optional<MessageCallbackCommand> byCode(int code) {
    return EnumSet.allOf(MessageCallbackCommand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
