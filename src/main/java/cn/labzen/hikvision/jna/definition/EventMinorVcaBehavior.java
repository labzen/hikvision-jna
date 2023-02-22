package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 行为分析主类型对应的次类型
 */
@Getter
@AllArgsConstructor
public enum EventMinorVcaBehavior implements HikvisionEnum {

  /**
   * 穿越警戒面
   */
  EVENT_TRAVERSE_PLANE(0, "穿越警戒面"),
  /**
   * 目标进入区域，支持区域规则
   */
  EVENT_ENTER_AREA(1, "目标进入区域，支持区域规则"),
  /**
   * 目标离开区域，支持区域规则
   */
  EVENT_EXIT_AREA(2, "目标离开区域，支持区域规则"),
  /**
   * 周界入侵，支持区域规则
   */
  EVENT_INTRUSION(3, "周界入侵，支持区域规则"),
  /**
   * 徘徊，支持区域规则
   */
  EVENT_LOITER(4, "徘徊，支持区域规则"),
  /**
   * 丢包捡包，支持区域规则
   */
  EVENT_LEFT_TAKE(5, "丢包捡包，支持区域规则"),
  /**
   * 停车，支持区域规则
   */
  EVENT_PARKING(6, "停车，支持区域规则"),
  /**
   * 奔跑，支持区域规则
   */
  EVENT_RUN(7, "奔跑，支持区域规则"),
  /**
   * 区域内人员密度，支持区域规则
   */
  EVENT_HIGH_DENSITY(8, "区域内人员密度，支持区域规则"),
  /**
   * 贴纸条，支持区域规则
   */
  EVENT_STICK_UP(9, "贴纸条，支持区域规则"),
  /**
   * 安装读卡器，支持区域规则
   */
  EVENT_INSTALL_SCANNER(10, "安装读卡器，支持区域规则"),
  /**
   * 操作超时
   */
  EVENT_OPERATE_OVER_TIME(11, "操作超时"),
  /**
   * 异常人脸
   */
  EVENT_FACE_DETECT(12, "异常人脸"),
  /**
   * 物品遗留
   */
  EVENT_LEFT(13, "物品遗留"),
  /**
   * 物品拿取
   */
  EVENT_TAKE(14, "物品拿取"),
  /**
   * 离岗事件
   */
  EVENT_LEAVE_POSITION(15, "离岗事件"),
  /**
   * 尾随
   */
  EVENT_TRAIL_INFO(16, "尾随"),
  /**
   * 倒地
   */
  EVENT_FALL_DOWN_INFO(19, "倒地"),
  /**
   * 异物粘贴区域
   */
  EVENT_OBJECT_PASTE(20, "异物粘贴区域"),
  /**
   * 正常人脸
   */
  EVENT_FACE_CAPTURE_INFO(21, "正常人脸"),
  /**
   * 多张人脸
   */
  EVENT_MULTI_FACES_INFO(22, "多张人脸"),
  /**
   * 声强突变
   */
  EVENT_AUDIO_ABNORMAL_INFO(23, "声强突变"),
  /**
   * 智能侦测
   */
  EVENT_DETECT(24, "智能侦测"),
  /**
   * 戴墨镜人脸
   */
  EVENT_SUNGLASSES_FACE_INFO(25, "戴墨镜人脸"),
  /**
   * 打电话人脸
   */
  EVENT_CALLING_FACE_INFO(26, "打电话人脸"),
  /**
   * 剧烈运动
   */
  EVENT_VIOLENT_MOTION(27, "剧烈运动"),
  /**
   * 安全帽检测
   */
  EVENT_SAFETY_HELMET(28, "安全帽检测"),
  /**
   * 人数变化
   */
  EVENT_PEOPLE_NUM_CHANGE(29, "人数变化"),
  /**
   * 起身
   */
  EVENT_GET_UP(30, "起身"),
  /**
   * 折线攀高
   */
  EVENT_ADV_REACH_HEIGHT(31, "折线攀高"),
  /**
   * 起立
   */
  EVENT_STOOD_UP(32, "起立"),
  /**
   * 人员密度（人数预警）
   */
  EVENT_PERSON_DENSITY(33, "人员密度（人数预警）");

  private int code;
  private String description;

  public static Optional<EventMinorVcaBehavior> byCode(int code) {
    return EnumSet.allOf(EventMinorVcaBehavior.class).stream().filter(in -> in.code == code).findFirst();
  }
}
