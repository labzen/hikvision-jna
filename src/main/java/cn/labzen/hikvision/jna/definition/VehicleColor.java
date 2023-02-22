package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车身颜色，参考VCR_CLR_CLASS
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehicleColor implements HikvisionEnum {

  /**
   * 不支持
   */
  VCR_CLR_UNSUPPORT(0, "不支持"),
  /**
   * 白
   */
  VCR_CLR_WHITE(1, "白"),
  /**
   * 银
   */
  VCR_CLR_SILVER(2, "银"),
  /**
   * 灰
   */
  VCR_CLR_GRAY(3, "灰"),
  /**
   * 黑
   */
  VCR_CLR_BLACK(4, "黑"),
  /**
   * 红
   */
  VCR_CLR_RED(5, "红"),
  /**
   * 深蓝
   */
  VCR_CLR_DARKBLUE(6, "深蓝"),
  /**
   * 蓝
   */
  VCR_CLR_BLUE(7, "蓝"),
  /**
   * 黄
   */
  VCR_CLR_YELLOW(8, "黄"),
  /**
   * 绿
   */
  VCR_CLR_GREEN(9, "绿"),
  /**
   * 棕
   */
  VCR_CLR_BROWN(10, "棕"),
  /**
   * 粉
   */
  VCR_CLR_PINK(11, "粉"),
  /**
   * 紫
   */
  VCR_CLR_PURPLE(12, "紫"),
  /**
   * 深灰
   */
  VCR_CLR_DARKGRAY(13, "深灰"),
  /**
   * 青色
   */
  VCR_CLR_CYAN(14, "青色");

  private int code;
  private String description;

  public static Optional<VehicleColor> byCode(int code) {
    return EnumSet.allOf(VehicleColor.class).stream().filter(in -> in.code == code).findFirst();
  }
}
