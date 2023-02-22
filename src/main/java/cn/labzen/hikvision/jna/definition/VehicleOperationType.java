package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车辆操作类型，参考VCA_OPERATE_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehicleOperationType implements HikvisionEnum {

  /**
   * 车牌号码
   */
  VCA_LICENSE_TYPE(0x1, "车牌号码"),
  /**
   * 车牌颜色
   */
  VCA_PLATECOLOR_TYPE(0x2, "车牌颜色"),
  /**
   * 卡号
   */
  VCA_CARDNO_TYPE(0x4, "卡号"),
  /**
   * 车牌类型
   */
  VCA_PLATETYPE_TYPE(0x8, "车牌类型"),
  /**
   * 车辆名单类型
   */
  VCA_LISTTYPE_TYPE(0x10, "车辆名单类型"),
  /**
   * 数据流水号
   */
  VCA_INDEX_TYPE(0x20, "数据流水号"),
  /**
   * 操作数
   */
  VCA_OPERATE_INDEX_TYPE(0x40, "操作数");

  private int code;
  private String description;

  public static Optional<VehicleOperationType> byCode(int code) {
    return EnumSet.allOf(VehicleOperationType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
