package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 审讯事件主类型对应的次类型
 */
@Getter
@AllArgsConstructor
public enum EventMinorInquest implements HikvisionEnum {

  /**
   * 讯问开始信息
   */
  INQUEST_START_INFO(0x1001, "讯问开始信息"),
  /**
   * 讯问停止信息
   */
  INQUEST_STOP_INFO(0x1002, "讯问停止信息"),
  /**
   * 重点标记信息
   */
  INQUEST_TAG_INFO(0x1003, "重点标记信息"),
  /**
   * 审讯片断状态信息
   */
  INQUEST_SEGMENT_INFO(0x1004, "审讯片断状态信息"),
  /**
   * 案件信息类型
   */
  INQUEST_CASE_INFO(0x1005, "案件信息类型");

  private int code;
  private String description;

  public static Optional<EventMinorInquest> byCode(int code) {
    return EnumSet.allOf(EventMinorInquest.class).stream().filter(in -> in.code == code).findFirst();
  }
}
