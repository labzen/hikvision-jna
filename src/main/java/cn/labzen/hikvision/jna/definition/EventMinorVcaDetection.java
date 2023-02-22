package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 智能侦测主类型对应的次类型
 */
@Getter
@AllArgsConstructor
public enum EventMinorVcaDetection implements HikvisionEnum {

  /**
   * 越界侦测
   */
  EVENT_VCA_TRAVERSE_PLANE(1, "越界侦测"),
  /**
   * 区域入侵侦测
   */
  EVENT_FIELD_DETECTION(2, "区域入侵侦测"),
  /**
   * 音频丢失侦测
   */
  EVENT_AUDIO_INPUT_ALARM(3, "音频丢失侦测"),
  /**
   * 声强突变侦测（声强陡升侦测、声强陡降侦测）
   */
  EVENT_SOUND_INTENSITY_ALARM(4, "声强突变侦测（声强陡升侦测、声强陡降侦测）"),
  /**
   * 人脸侦测
   */
  EVENT_FACE_DETECTION(5, "人脸侦测"),
  /**
   * 虚焦侦测
   */
  EVENT_VIRTUAL_FOCUS_ALARM(6, "虚焦侦测"),
  /**
   * 场景变更侦测
   */
  EVENT_SCENE_CHANGE_ALARM(7, "场景变更侦测"),
  /**
   * PIR报警
   */
  EVENT_PIR_ALARM(8, "PIR报警"),
  /**
   * 进入区域
   */
  EVENT_ENTER_REGION(9, "进入区域"),
  /**
   * 目标离开区域
   */
  EVENT_EXIT_REGION(10, "目标离开区域"),
  /**
   * 徘徊
   */
  EVENT_LOITERING(11, "徘徊"),
  /**
   * 区域内人员聚集,支持区域规则
   */
  EVENT_GROUPDETECTION(12, "区域内人员聚集,支持区域规则"),
  /**
   * 快速移动
   */
  EVENT_RAPIDMOVE(13, "快速移动"),
  /**
   * 停车
   */
  EVENT_PARK(14, "停车"),
  /**
   * 物品遗留
   */
  EVENT_UNATTENDED_BAGGAGE(15, "物品遗留"),
  /**
   * 物品拿取
   */
  EVENT_ATTENDEDBAGGAGE(16, "物品拿取"),
  /**
   * 车辆检测
   */
  EVENT_VEHICLE_DETECTION(17, "车辆检测");

  private int code;
  private String description;

  public static Optional<EventMinorVcaDetection> byCode(int code) {
    return EnumSet.allOf(EventMinorVcaDetection.class).stream().filter(in -> in.code == code).findFirst();
  }
}
