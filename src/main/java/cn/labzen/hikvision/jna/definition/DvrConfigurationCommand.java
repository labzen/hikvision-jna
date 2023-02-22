package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.struct.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 设备的配置信息命令
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum DvrConfigurationCommand implements HikvisionEnum {

  /**
   * 获取设备参数(扩展)，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_DEVICECFG_V40}
   */
  NET_DVR_GET_DEVICECFG_V40(1100, "获取设备参数(扩展)"),
  /**
   * 获取时间参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_TIME}
   */
  NET_DVR_GET_TIMECFG(118, "获取时间参数"),
  /**
   * 获取RS485(云台解码器)参数，参数lChannel=参数 通道号， lpOutBuffer对应结构体 {@link NET_DVR_DECODERCFG_V40}
   */
  NET_DVR_GET_DECODERCFG_V40(6319, "获取RS485(云台解码器)参数"),
  /**
   * 获取RS232串口参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_RS232CFG_V30}
   */
  NET_DVR_GET_RS232CFG_V30(1036, "获取RS232串口参数"),
  /**
   * 获取异常参数，参数lChannel=组号，从0开始，每组32种异常， lpOutBuffer对应结构体 {@link NET_DVR_EXCEPTION_V40}
   */
  NET_DVR_GET_EXCEPTIONCFG_V40(6177, "获取异常参数"),
  /**
   * 获取时区和夏时制参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_ZONEANDDST}
   */
  NET_DVR_GET_ZONEANDDST(128, "获取时区和夏时制参数"),
  /**
   * 获取模块服务配置，参数lChannel=通道号， lpOutBuffer对应结构体 {@link NET_DVR_DEVSERVER_CFG}
   */
  NET_DVR_GET_DEVSERVER_CFG(3257, "获取模块服务配置"),
  /**
   * 获取节假日参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_HOLIDAY_PARAM_CFG}
   */
  NET_DVR_GET_HOLIDAY_PARAM_CFG(1240, "获取节假日参数"),

  // =================================================================

  /**
   * 设置设备参数(扩展)，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_DEVICECFG_V40}
   */
  NET_DVR_SET_DEVICECFG_V40(1101, "设置设备参数(扩展)"),
  /**
   * 设置时间参数（校时），参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_TIME}
   */
  NET_DVR_SET_TIMECFG(119, "设置时间参数（校时）"),
  /**
   * 设置（RS485)云台解码器参数，参数lChannel=参数 通道号， lpOutBuffer对应结构体 {@link NET_DVR_DECODERCFG_V40}
   */
  NET_DVR_SET_DECODERCFG_V40(6320, "设置（RS485)云台解码器参数"),
  /**
   * 设置232串口参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_RS232CFG_V30}
   */
  NET_DVR_SET_RS232CFG_V30(1037, "设置232串口参数"),
  /**
   * 设置异常参数，参数lChannel=组号，从0开始，每组32种异常， lpOutBuffer对应结构体 {@link NET_DVR_EXCEPTION_V40}
   */
  NET_DVR_SET_EXCEPTIONCFG_V40(6178, "设置异常参数"),
  /**
   * 设置时区和夏时制参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_ZONEANDDST}
   */
  NET_DVR_SET_ZONEANDDST(129, "设置时区和夏时制参数"),
  /**
   * 设置模块服务配置，参数lChannel=通道号， lpOutBuffer对应结构体 {@link NET_DVR_DEVSERVER_CFG}
   */
  NET_DVR_SET_DEVSERVER_CFG(3258, "设置模块服务配置"),
  /**
   * 设置节假日参数，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_HOLIDAY_PARAM_CFG}
   */
  NET_DVR_SET_HOLIDAY_PARAM_CFG(1241, "设置节假日参数"),
  /**
   * 校时配置(针对网络摄像机)，参数lChannel=无效， lpOutBuffer对应结构体 {@link NET_DVR_TIME}
   */
  NET_DVR_SET_TIMECORRECT(432, "校时配置(针对网络摄像机)");

  private int code;
  private String description;

  public static Optional<DvrConfigurationCommand> byCode(int code) {
    return EnumSet.allOf(DvrConfigurationCommand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
