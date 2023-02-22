package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 表情，参考FACE_EXPRESSION_GROUP_ENUM
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum FaceExpression implements HikvisionEnum {

  /**
   * 惊讶
   */
  ENUM_EXPRESSION_GROUP_SURPRISED(1, "惊讶"),
  /**
   * 害怕
   */
  ENUM_EXPRESSION_GROUP_PANIC(2, "害怕"),
  /**
   * 厌恶
   */
  ENUM_EXPRESSION_GROUP_DISGUUSTED(3, "厌恶"),
  /**
   * 高兴
   */
  ENUM_EXPRESSION_GROUP_HAPPY(4, "高兴"),
  /**
   * 难过
   */
  ENUM_EXPRESSION_GROUP_SAD(5, "难过"),
  /**
   * 愤怒
   */
  ENUM_EXPRESSION_GROUP_ANGRY(6, "愤怒"),
  /**
   * 中性
   */
  ENUM_EXPRESSION_GROUP_POKER(7, "中性"),
  /**
   * 未知,算法支持未检出
   */
  ENUM_EXPRESSION_GROUP_UNKNOW(0xff, "未知,算法支持未检出");

  private int code;
  private String description;

  public static Optional<FaceExpression> byCode(int code) {
    return EnumSet.allOf(FaceExpression.class).stream().filter(in -> in.code == code).findFirst();
  }
}
