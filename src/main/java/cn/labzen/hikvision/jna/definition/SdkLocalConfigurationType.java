package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum SdkLocalConfigurationType implements HikvisionEnum {

  /**
   * 本地TCP端口绑定配置，对应结构体NET_DVR_LOCAL_TCP_PORT_BIND_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_TCP_PORT_BIND(0, "本地TCP端口绑定配置，对应结构体NET_DVR_LOCAL_TCP_PORT_BIND_CFG"),
  /**
   * 本地UDP端口绑定配置，对应结构体NET_DVR_LOCAL_UDP_PORT_BIND_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_UDP_PORT_BIND(1, "本地UDP端口绑定配置，对应结构体NET_DVR_LOCAL_UDP_PORT_BIND_CFG"),
  /**
   * 内存池本地配置，对应结构体NET_DVR_LOCAL_MEM_POOL_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_MEM_POOL(2, "内存池本地配置，对应结构体NET_DVR_LOCAL_MEM_POOL_CFG"),
  /**
   * 按模块配置超时时间，对应结构体NET_DVR_LOCAL_MODULE_RECV_TIMEOUT_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_MODULE_RECV_TIMEOUT(3, "按模块配置超时时间，对应结构体NET_DVR_LOCAL_MODULE_RECV_TIMEOUT_CFG"),
  /**
   * 是否使用能力集解析库，对应结构体NET_DVR_LOCAL_ABILITY_PARSE_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_ABILITY_PARSE(4, "是否使用能力集解析库，对应结构体NET_DVR_LOCAL_ABILITY_PARSE_CFG"),
  /**
   * 对讲模式，对应结构体NET_DVR_LOCAL_TALK_MODE_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_TALK_MODE(5, "对讲模式，对应结构体NET_DVR_LOCAL_TALK_MODE_CFG"),
  /**
   * 密钥设置，对应结构体NET_DVR_LOCAL_PROTECT_KEY_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_PROTECT_KEY(6, "密钥设置，对应结构体NET_DVR_LOCAL_PROTECT_KEY_CFG"),
  /**
   * 用于测试版本头的设备端兼容情NET_DVR_LOCAL_MEM_POOL_CFG况, 只有在设置参数时才起作用。
   */
  NET_SDK_LOCAL_CFG_TYPE_CFG_VERSION(7,
      "用于测试版本头的设备端兼容情NET_DVR_LOCAL_MEM_POOL_CFG况, 只有在设置参数时才起作用。"),
  /**
   * rtsp参数配置，对于结构体NET_DVR_RTSP_PARAMS_CFG
   */
  NET_SDK_LOCAL_CFG_TYPE_RTSP_PARAMS(8, "rtsp参数配置，对于结构体NET_DVR_RTSP_PARAMS_CFG"),
  /**
   * 在登录时使用模拟能力补充support字段, 对应结构NET_DVR_SIMXML_LOGIN
   */
  NET_SDK_LOCAL_CFG_TYPE_SIMXML_LOGIN(9, "在登录时使用模拟能力补充support字段, 对应结构NET_DVR_SIMXML_LOGIN"),
  /**
   * 心跳交互间隔时间
   */
  NET_SDK_LOCAL_CFG_TYPE_CHECK_DEV(10, "心跳交互间隔时间"),
  /**
   * SDK本次安全配置，
   */
  NET_SDK_LOCAL_CFG_TYPE_SECURITY(11, "SDK本次安全配置，"),
  /**
   * 配置萤石云通信库地址，
   */
  NET_SDK_LOCAL_CFG_TYPE_EZVIZLIB_PATH(12, "配置萤石云通信库地址，"),
  /**
   * 配置字符编码相关处理回调
   */
  NET_SDK_LOCAL_CFG_TYPE_CHAR_ENCODE(13, "配置字符编码相关处理回调"),
  /**
   * 设置获取代
   */
  NET_SDK_LOCAL_CFG_TYPE_PROXYS(14, "设置获取代"),
  /**
   * 日志参数配置  NET_DVR_LOCAL_LOG_CFG
   */
  NET_DVR_LOCAL_CFG_TYPE_LOG(15, "日志参数配置  NET_DVR_LOCAL_LOG_CFG"),
  /**
   * 码流回调参数配置 NET_DVR_LOCAL_STREAM_CALLBACK_CFG
   */
  NET_DVR_LOCAL_CFG_TYPE_STREAM_CALLBACK(16, "码流回调参数配置 NET_DVR_LOCAL_STREAM_CALLBACK_CFG"),
  /**
   * 通用参数配置 NET_DVR_LOCAL_GENERAL_CFG
   */
  NET_DVR_LOCAL_CFG_TYPE_GENERAL(17, "通用参数配置 NET_DVR_LOCAL_GENERAL_CFG"),
  /**
   * PTZ是否接收设备返回配置
   */
  NET_DVR_LOCAL_CFG_TYPE_PTZ(18, "PTZ是否接收设备返回配置"),
  /**
   * 报警V51回调相关本地配置,对应结构体为NET_DVR_MESSAGE_CALLBACK_PARAM_V51。(仅对NET_DVR_SetDVRMessageCallBack_V51以上版本有效)
   * TODO NET_DVR_MESSAGE_CALLBACK_PARAM_V51
   */
  NET_DVR_LOCAL_CFG_MESSAGE_CALLBACK_V51(19,
      "报警V51回调相关本地配置,对应结构体为NET_DVR_MESSAGE_CALLBACK_PARAM_V51。(仅对NET_DVR_SetDVRMessageCallBack_V51以上版本有效)"),
  /**
   * 配置和证书相关的参数，对应结构体结构体NET_DVR_LOCAL_CERTIFICATION
   */
  NET_SDK_LOCAL_CFG_CERTIFICATION(20, "配置和证书相关的参数，对应结构体结构体NET_DVR_LOCAL_CERTIFICATION");

  private int code;
  private String description;

  public static Optional<SdkLocalConfigurationType> byCode(int code) {
    return EnumSet.allOf(SdkLocalConfigurationType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
