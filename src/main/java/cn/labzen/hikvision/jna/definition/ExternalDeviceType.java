package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 外设类型，参考EXTERNAL_DEVICES_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum ExternalDeviceType implements HikvisionEnum {

  /**
   * 保留1
   */
  DEVICES_TYPE_RES1(0, "保留1"),
  /**
   * 远距离读卡器
   */
  DEVICES_TYPE_FAR_SCR(1, "远距离读卡器"),
  /**
   * 出入口控制机
   */
  DEVICES_TYPE_ENTRANCE_CONTROL(2, "出入口控制机"),
  /**
   * 外接LED
   */
  DEVICES_TYPE_WJ_LED_DEV(3, "外接LED"),
  /**
   * 内接LED
   */
  DEVICES_TYPE_NJ_LED_DEV(4, "内接LED"),
  /**
   * 车检器设备
   */
  DEVICES_TYPE_VEH_DETECT_DEV(5, "车检器设备"),
  /**
   * 道闸
   */
  DEVICES_TYPE_DZ_DEV(6, "道闸"),
  /**
   * 票箱读卡器
   */
  DEVICES_TYPE_PX_SCR_DEV(7, "票箱读卡器"),
  /**
   * 卡机读卡器
   */
  DEVICES_TYPE_KJ_SCR_DEV(8, "卡机读卡器"),
  /**
   * 发卡机
   */
  DEVICES_TYPE_FKJ_DEV(9, "发卡机"),
  /**
   * 收卡机
   */
  DEVICES_TYPE_SKJ_DEV(10, "收卡机"),
  /**
   * 硬盘(裸盘 1G)
   */
  DEVICES_TYPE_HDD_DEV(11, "硬盘(裸盘 1G)"),
  /**
   * 道闸锁闸状态，0表示未锁闸，1表示锁闸
   */
  DEVICES_TYPE_DZ_LOCK(12, "道闸锁闸状态，0表示未锁闸，1表示锁闸"),
  /**
   * 纸票打印机
   */
  DEVICES_TYPE_PAPER_PRINTER(13, "纸票打印机"),
  /**
   * 纸票扫描仪
   */
  DEVICES_TYPE_PAPER_SCANNERS(14, "纸票扫描仪"),
  /**
   * IPC布防状态
   */
  DEVICES_TYPE_IPC_ALARM(15, "IPC布防状态");

  private int code;
  private String description;

  public static Optional<ExternalDeviceType> byCode(int code) {
    return EnumSet.allOf(ExternalDeviceType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
