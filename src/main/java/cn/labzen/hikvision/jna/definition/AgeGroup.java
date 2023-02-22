package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 年龄段，参考HUMAN_AGE_GROUP_ENUM
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum AgeGroup implements HikvisionEnum {

  /**
   * 婴幼儿
   */
  ENUM_AGE_GROUP_INFANT(1, "婴幼儿"),
  /**
   * 儿童
   */
  ENUM_AGE_GROUP_CHILD(2, "儿童"),
  /**
   * 少年
   */
  ENUM_AGE_GROUP_YOUNGSTER(3, "少年"),
  /**
   * 青少年
   */
  ENUM_AGE_GROUP_ADOLESCENT(4, "青少年"),
  /**
   * 青年
   */
  ENUM_AGE_GROUP_YOUTH(5, "青年"),
  /**
   * 壮年
   */
  ENUM_AGE_GROUP_PRIME(6, "壮年"),
  /**
   * 中年
   */
  ENUM_AGE_GROUP_MIDLIFE(7, "中年"),
  /**
   * 中老年
   */
  ENUM_AGE_GROUP_MIDAGE(8, "中老年"),
  /**
   * 老年
   */
  ENUM_AGE_GROUP_OLD(9, "老年"),
  /**
   * 未知,算法支持未检出
   */
  ENUM_AGE_GROUP_UNKNOW(0xff, "未知,算法支持未检出");

  private int code;
  private String description;

  public static Optional<AgeGroup> byCode(int code) {
    return EnumSet.allOf(AgeGroup.class).stream().filter(in -> in.code == code).findFirst();
  }
}
