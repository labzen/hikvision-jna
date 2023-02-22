package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 密码安全等级
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum PasswordSecureLevel implements HikvisionEnum {

  /**
   * 无效密码
   */
  INVALID(0, "无效密码"),
  /**
   * 默认密码
   */
  DEFAULT(1, "默认密码"),
  /**
   * 有效密码
   */
  VALID(2, "有效密码"),
  /**
   * 高风险的密码
   */
  RISKY(3, "高风险的密码");

  private int code;
  private String description;

  public static Optional<PasswordSecureLevel> byCode(int code) {
    return EnumSet.allOf(PasswordSecureLevel.class).stream().filter(in -> in.code == code).findFirst();
  }
}
