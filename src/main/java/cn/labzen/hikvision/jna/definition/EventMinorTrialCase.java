package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 庭审信息主类型对应的次类型
 */
@Getter
@AllArgsConstructor
public enum EventMinorTrialCase implements HikvisionEnum {

  /**
   * 庭审开始事件
   */
  TRIAL_START_INFO(0x1001, "庭审开始事件"),
  /**
   * 庭审结束事件
   */
  TRIAL_STOP_INFO(0x1002, "庭审结束事件"),
  /**
   * 庭审重点标注事件
   */
  TRIAL_TAG_INFO(0x1003, "庭审重点标注事件"),
  /**
   * 庭审片段状态信息
   */
  TRIAL_SEGMENT_INFO(0x1004, "庭审片段状态信息"),
  /**
   * 庭审案件信息
   */
  TRIAL_JUDGE_CASE_INFO(0x1005, "庭审案件信息");

  private int code;
  private String description;

  public static Optional<EventMinorTrialCase> byCode(int code) {
    return EnumSet.allOf(EventMinorTrialCase.class).stream().filter(in -> in.code == code).findFirst();
  }
}
