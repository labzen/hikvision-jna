package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车辆违规类型，参考VCA_ILLEGAL_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehicleIllegalType implements HikvisionEnum {

  /**
   * 卡口图片
   */
  VCA_POSTPIC_TYPE(0x1, "卡口图片"),
  /**
   * 低速
   */
  VCA_LOWSPEED_TYPE(0x2, "低速"),
  /**
   * 高速
   */
  VCA_HIGHSPEED_TYPE(0x4, "高速"),
  /**
   * 逆行
   */
  VCA_RETROGRADE_TYPE(0x8, "逆行"),
  /**
   * 闯红灯
   */
  VCA_RUSH_REDLIGHT_TYPE(0x10, "闯红灯"),
  /**
   * 压车道线
   */
  VCA_PRESS_LANE_TYPE(0x20, "压车道线"),
  /**
   * 不按导向
   */
  VCA_VIOLATE_GUIDE_TYPE(0x40, "不按导向"),
  /**
   * 路口滞留(设备不支持)
   */
  VCA_ROAD_STRAND_TYPE(0x80, "路口滞留(设备不支持)"),
  /**
   * 机占非
   */
  VCA_VEHICLE_ILLEGAL_LANE_TYPE(0x100, "机占非"),
  /**
   * 违法变道
   */
  VCA_ILLEGAL_LANE_CHANGE_TYPE(0x200, "违法变道"),
  /**
   * 不按车道
   */
  VCA_ILLEGAL_LANE_DRIVE_TYPE(0x400, "不按车道"),
  /**
   * 违法禁令
   */
  VCA_VIOLATE_BAN_TYPE(0x800, "违法禁令"),
  /**
   * 路口停车
   */
  VCA_CROSS_PARKING_TYPE(0x1000, "路口停车"),
  /**
   * 绿灯停车
   */
  VCA_GREEN_PARKING_TYPE(0x2000, "绿灯停车");

  private int code;
  private String description;

  public static Optional<VehicleIllegalType> byCode(int code) {
    return EnumSet.allOf(VehicleIllegalType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
