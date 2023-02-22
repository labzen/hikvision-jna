package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 流ID信息主类型对应的次类型
 */
@Getter
@AllArgsConstructor
public enum EventMinorStreamInfo implements HikvisionEnum {

  /**
   * 流ID
   */
  EVENT_STREAM_ID(0, "流ID"),
  /**
   * 定时录像
   */
  EVENT_TIMING(1, "定时录像"),
  /**
   * 移动侦测
   */
  EVENT_MOTION_DETECT(2, "移动侦测"),
  /**
   * 报警录像
   */
  EVENT_ALARM(3, "报警录像"),
  /**
   * 报警或移动侦测
   */
  EVENT_ALARM_OR_MOTION_DETECT(4, "报警或移动侦测"),
  /**
   * 报警和移动侦测
   */
  EVENT_ALARM_AND_MOTION_DETECT(5, "报警和移动侦测"),
  /**
   * 命令触发
   */
  EVENT_COMMAND_TRIGGER(6, "命令触发"),
  /**
   * 手动录像
   */
  EVENT_MANNUAL(7, "手动录像"),
  /**
   * 存档卷录像
   */
  EVENT_BACKUP_VOLUME(8, "存档卷录像"),
  /**
   * 信号量
   */
  STREAM_EVENT_SEMAPHORE(9, "信号量"),
  /**
   * 遮挡
   */
  STREAM_EVENT_HIDE(10, "遮挡"),
  /**
   * 逆行
   */
  STREAM_EVENT_INVERSE(11, "逆行"),
  /**
   * 视频丢失
   */
  STREAM_EVENT_VIDEO_LOST(12, "视频丢失"),
  /**
   * 无线报警
   */
  STREAM_EVENT_WIRELESS_ALARM(13, "无线报警"),
  /**
   * PIR报警
   */
  STREAM_EVENT_PIR_ALARM(14, "PIR报警"),
  /**
   * 呼救报警
   */
  STREAM_EVENT_CALLHELP_ALARM(15, "呼救报警"),
  /**
   * 人脸抓拍
   */
  STREAM_EVENT_FACESNAP(16, "人脸抓拍"),
  /**
   * 人脸侦测
   */
  STREAM_EVENT_FACE_DETECTION(17, "人脸侦测"),
  /**
   * 车辆检测
   */
  STREAM_EVENT_ITS_PLATE(18, "车辆检测"),
  /**
   * 客流量统计
   */
  STREAM_EVENT_PDC(19, "客流量统计"),
  /**
   * 场景变更
   */
  STREAM_EVENT_SCENECHANGE_DETECTION(20, "场景变更"),
  /**
   * 虚焦侦测
   */
  STREAM_EVENT_DEFOCUS_DETECTION(21, "虚焦侦测"),
  /**
   * 音频异常
   */
  STREAM_EVENT_AUDIOEXCEPTION(22, "音频异常"),
  /**
   * 穿越警戒面
   */
  VCA_EVENT_TRAVERSE_PLANE(23, "穿越警戒面"),
  /**
   * 周界入侵
   */
  VCA_EVENT_INTRUSION(24, "周界入侵"),
  /**
   * 进入区域
   */
  VCA_EVENT_ENTER_AREA(25, "进入区域"),
  /**
   * 离开区域
   */
  VCA_EVENT_EXIT_AREA(26, "离开区域"),
  /**
   * 徘徊侦测
   */
  VCA_EVENT_LOITER(27, "徘徊侦测"),
  /**
   * 人员聚集
   */
  VCA_EVENT_HIGH_DENSITY(28, "人员聚集"),
  /**
   * 快速移动
   */
  VCA_EVENT_RUN(29, "快速移动"),
  /**
   * 非法停车
   */
  VCA_EVENT_PARKING(30, "非法停车"),
  /**
   * 物品遗留
   */
  VCA_EVENT_LEFT(31, "物品遗留"),
  /**
   * 物品拿取
   */
  VCA_EVENT_TAKE(32, "物品拿取");

  private int code;
  private String description;

  public static Optional<EventMinorStreamInfo> byCode(int code) {
    return EnumSet.allOf(EventMinorStreamInfo.class).stream().filter(in -> in.code == code).findFirst();
  }
}
