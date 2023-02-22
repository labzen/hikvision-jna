package cn.labzen.hikvision.jna.definition;

/**
 * 事件主类型
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 事件主类型
 */
@Getter
@AllArgsConstructor
public enum EventMajorType implements HikvisionEnum {

  /**
   * 移动侦测，没有次类型
   */
  EVENT_MOT_DET(0, "移动侦测"),
  /**
   * 报警输入，没有次类型
   */
  EVENT_ALARM_IN(1, "报警输入"),
  /**
   * 行为分析，次类型参考{@link EventMinorVcaBehavior}
   */
  EVENT_VCA_BEHAVIOR(2, " 行为分析"),
  /**
   * 审讯事件，次类型参考{@link EventMinorInquest}
   */
  EVENT_INQUEST(3, "审讯事件"),
  /**
   * 智能侦测，次类型参考{@link EventMinorVcaDetection}
   */
  EVENT_VCA_DETECTION(4, "智能侦测"),
  /**
   * POS录像，没有次类型
   */
  EVENT_POS(5, "POS录像"),
  /**
   * 庭审案件信息，次类型参考{@link EventMinorTrialCase}
   */
  EVENT_TRIAL_CASE(6, "庭审案件信息"),
  /**
   * 门禁事件
   */
  EVENT_ACS_CASE(7, "门禁事件"),
  /**
   * 非视频联动事件—本类事件均为非视频设备联动视频设备产生的事件，不包含非视频设备本身的事件
   */
  EVENT_IOT_CASE(8, "非视频联动事件—本类事件均为非视频设备联动视频设备产生的事件，不包含非视频设备本身的事件"),
  /**
   * 流ID信息，次类型参考{@link EventMinorStreamInfo}
   */
  EVENT_STREAM_INFO(100, "流ID信息");

  private int code;
  private String description;

  public static Optional<EventMajorType> byCode(int code) {
    return EnumSet.allOf(EventMajorType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
