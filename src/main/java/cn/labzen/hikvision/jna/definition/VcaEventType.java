package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 行为分析事件类型，参考VCA_EVENT_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VcaEventType implements HikvisionEnum {

  /**
   * 穿越警戒面
   */
  VCA_TRAVERSE_PLANE(0x1, "穿越警戒面"),
  /**
   * 目标进入区域,支持区域规则
   */
  VCA_ENTER_AREA(0x2, "目标进入区域,支持区域规则"),
  /**
   * 目标离开区域,支持区域规则
   */
  VCA_EXIT_AREA(0x4, "目标离开区域,支持区域规则"),
  /**
   * 周界入侵,支持区域规则
   */
  VCA_INTRUSION(0x8, "周界入侵,支持区域规则"),
  /**
   * 徘徊,支持区域规则
   */
  VCA_LOITER(0x10, "徘徊,支持区域规则"),
  /**
   * 物品遗留拿取,支持区域规则
   */
  VCA_LEFT_TAKE(0x20, "物品遗留拿取,支持区域规则"),
  /**
   * 停车,支持区域规则
   */
  VCA_PARKING(0x40, "停车,支持区域规则"),
  /**
   * 快速移动,支持区域规则
   */
  VCA_RUN(0x80, "快速移动,支持区域规则"),
  /**
   * 区域内人员聚集,支持区域规则
   */
  VCA_HIGH_DENSITY(0x100, "区域内人员聚集,支持区域规则"),
  /**
   * 剧烈运动检测
   */
  VCA_VIOLENT_MOTION(0x200, "剧烈运动检测"),
  /**
   * 攀高检测
   */
  VCA_REACH_HIGHT(0x400, "攀高检测"),
  /**
   * 起身检测
   */
  VCA_GET_UP(0x800, "起身检测"),
  /**
   * 物品遗留
   */
  VCA_LEFT(0x1000, "物品遗留"),
  /**
   * 物品拿取
   */
  VCA_TAKE(0x2000, "物品拿取"),
  /**
   * 离岗
   */
  VCA_LEAVE_POSITION(0x4000, "离岗"),
  /**
   * 尾随
   */
  VCA_TRAIL(0x8000, "尾随"),
  /**
   * 重点人员起身检测
   */
  VCA_KEY_PERSON_GET_UP(0x10000, "重点人员起身检测"),
  /**
   * 起立
   */
  VCA_STANDUP(0x20000, "起立"),
  /**
   * 倒地检测
   */
  VCA_FALL_DOWN(0x80000, "倒地检测"),
  /**
   * 声强突变检测
   */
  VCA_AUDIO_ABNORMAL(0x100000, "声强突变检测"),
  /**
   * 折线攀高
   */
  VCA_ADV_REACH_HEIGHT(0x200000, "折线攀高"),
  /**
   * 如厕超时
   */
  VCA_TOILET_TARRY(0x400000, "如厕超时"),
  /**
   * 放风场滞留
   */
  VCA_YARD_TARRY(0x800000, "放风场滞留"),
  /**
   * 折线警戒面
   */
  VCA_ADV_TRAVERSE_PLANE(0x1000000, "折线警戒面"),
  /**
   * 授课
   */
  VCA_LECTURE(0x2000000, "授课"),
  /**
   * 回答问题
   */
  VCA_ANSWER(0x4000000, "回答问题"),
  /**
   * 人靠近ATM,只在ATM_PANEL模式下支持
   */
  VCA_HUMAN_ENTER(0x10000000, "人靠近ATM，只在ATM_PANEL模式下支持"),
  /**
   * 操作超时，只在ATM_PANEL模式下支持
   */
  VCA_OVER_TIME(0x20000000, "操作超时，只在ATM_PANEL模式下支持"),
  /**
   * 贴纸条,支持区域规则
   */
  VCA_STICK_UP(0x40000000, "贴纸条,支持区域规则"),
  /**
   * 安装读卡器,支持区域规则
   */
  VCA_INSTALL_SCANNER(0x80000000, "安装读卡器,支持区域规则");

  private int code;
  private String description;

  public static Optional<VcaEventType> byCode(int code) {
    return EnumSet.allOf(VcaEventType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
