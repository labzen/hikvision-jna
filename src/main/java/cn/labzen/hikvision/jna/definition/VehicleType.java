package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车辆类型，参考VCA_VEHICLE_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehicleType implements HikvisionEnum {

  /**
   * 其它车型
   */
  VCA_OTHER_TYPE(0x1, "其它车型"),

  /**
   * 小型车
   */
  VCA_SMALLCAR_TYPE(0x2, "小型车"),

  /**
   * 大型车
   */
  VCA_BIGCAR_TYPE(0x4, "大型车"),

  /**
   * 客车
   */
  VCA_BUS_TYPE(0x8, "客车"),

  /**
   * 货车
   */
  VCA_TRUCK_TYPE(0x10, "货车"),

  /**
   * 轿车
   */
  VCA_CAR_TYPE(0x20, "轿车"),

  /**
   * 面包车
   */
  VCA_MINIBUS_TYPE(0x40, "面包车"),

  /**
   * 小货车
   */
  VCA_SMALL_TRUCK_TYPE(0x80, "小货车");

  private int code;
  private String description;

  public static Optional<VehicleType> byCode(int code) {
    return EnumSet.allOf(VehicleType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
