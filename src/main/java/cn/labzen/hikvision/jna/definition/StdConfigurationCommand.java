package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.struct.NET_DVR_DEVICECFG_V40;
import cn.labzen.hikvision.jna.struct.NET_DVR_FIRMWARE_VERSION_IFNO;
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
public enum StdConfigurationCommand implements HikvisionEnum {

  /**
   * 获取主控版本信息，参数lpCondBuffer=NULL，lpOutBuffer={@link NET_DVR_FIRMWARE_VERSION_IFNO}
   */
  NET_DVR_GET_FIRMWARE_VERSION(3776, "获取主控版本信息"),

  // =================================================================

  /**
   * 设置设备参数(扩展)，参数lChannel=无效， lpInBuffer对应结构体 {@link NET_DVR_DEVICECFG_V40}
   */
  @Deprecated NET_DVR_SET_DEVICECFG_V40(1101, "设置设备参数(扩展)");

  private int code;
  private String description;

  public static Optional<StdConfigurationCommand> byCode(int code) {
    return EnumSet.allOf(StdConfigurationCommand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
