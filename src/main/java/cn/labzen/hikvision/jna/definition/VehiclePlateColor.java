package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车牌颜色，参考VCA_PLATE_COLOR
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehiclePlateColor implements HikvisionEnum {

  /**
   * 蓝色车牌
   */
  VCA_BLUE_PLATE(0, "蓝色车牌"),
  /**
   * 黄色车牌
   */
  VCA_YELLOW_PLATE(1, "黄色车牌"),
  /**
   * 白色车牌
   */
  VCA_WHITE_PLATE(2, "白色车牌"),
  /**
   * 黑色车牌
   */
  VCA_BLACK_PLATE(3, "黑色车牌"),
  /**
   * 绿色车牌
   */
  VCA_GREEN_PLATE(4, "绿色车牌"),
  /**
   * 民航黑色车牌
   */
  VCA_BKAIR_PLATE(5, "民航黑色车牌"),
  /**
   * 红色车牌
   */
  VCA_RED_PLATE(6, "红色车牌"),
  /**
   * 橙色车牌
   */
  VCA_ORANGE_PLATE(7, "橙色车牌"),
  /**
   * 其他
   */
  VCA_OTHER(0xff, "其他");

  private int code;
  private String description;

  public static Optional<VehiclePlateColor> byCode(int code) {
    return EnumSet.allOf(VehiclePlateColor.class).stream().filter(in -> in.code == code).findFirst();
  }
}
