package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 行为分析事件类型枚举，参考VCA_RULE_EVENT_TYPE_EX
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VcaEventTypeExtension implements HikvisionEnum {

  /**
   * 穿越警戒面
   */
  VCA_EVENT_TRAVERSE_PLANE(1, "穿越警戒面"),
  /**
   * 目标进入区域,支持区域规则
   */
  VCA_EVENT_ENTER_AREA(2, "目标进入区域,支持区域规则"),
  /**
   * 目标离开区域,支持区域规则
   */
  VCA_EVENT_EXIT_AREA(3, "目标离开区域,支持区域规则"),
  /**
   * 周界入侵,支持区域规则
   */
  VCA_EVENT_INTRUSION(4, "周界入侵,支持区域规则"),
  /**
   * 徘徊,支持区域规则
   */
  VCA_EVENT_LOITER(5, "徘徊,支持区域规则"),
  /**
   * 物品遗留拿取,支持区域规则
   */
  VCA_EVENT_LEFT_TAKE(6, "物品遗留拿取,支持区域规则"),
  /**
   * 停车,支持区域规则
   */
  VCA_EVENT_PARKING(7, "停车,支持区域规则"),
  /**
   * 快速移动,支持区域规则
   */
  VCA_EVENT_RUN(8, "快速移动,支持区域规则"),
  /**
   * 区域内人员聚集,支持区域规则
   */
  VCA_EVENT_HIGH_DENSITY(9, "区域内人员聚集,支持区域规则"),
  /**
   * 剧烈运动检测
   */
  VCA_EVENT_VIOLENT_MOTION(10, "剧烈运动检测"),
  /**
   * 攀高检测
   */
  VCA_EVENT_REACH_HIGHT(11, "攀高检测"),
  /**
   * 起身检测
   */
  VCA_EVENT_GET_UP(12, "起身检测"),
  /**
   * 物品遗留
   */
  VCA_EVENT_LEFT(13, "物品遗留"),
  /**
   * 物品拿取
   */
  VCA_EVENT_TAKE(14, "物品拿取"),
  /**
   * 离岗
   */
  VCA_EVENT_LEAVE_POSITION(15, "离岗"),
  /**
   * 尾随
   */
  VCA_EVENT_TRAIL(16, "尾随"),
  /**
   * 重点人员起身检测
   */
  VCA_EVENT_KEY_PERSON_GET_UP(17, "重点人员起身检测"),
  /**
   * 起立
   */
  VCA_EVENT_STANDUP(18, "起立"),
  /**
   * 倒地检测
   */
  VCA_EVENT_FALL_DOWN(20, "倒地检测"),
  /**
   * 声强突变检测
   */
  VCA_EVENT_AUDIO_ABNORMAL(21, "声强突变检测"),
  /**
   * 折线攀高
   */
  VCA_EVENT_ADV_REACH_HEIGHT(22, "折线攀高"),
  /**
   * 如厕超时
   */
  VCA_EVENT_TOILET_TARRY(23, "如厕超时"),
  /**
   * 放风场滞留
   */
  VCA_EVENT_YARD_TARRY(24, "放风场滞留"),
  /**
   * 折线警戒面
   */
  VCA_EVENT_ADV_TRAVERSE_PLANE(25, "折线警戒面"),
  /**
   * 授课（文教）
   */
  VCA_EVENT_LECTURE(26, "授课（文教）"),
  /**
   * 回答问题（文教）
   */
  VCA_EVENT_ANSWER(27, "回答问题（文教）"),
  /**
   * 人靠近ATM,只在ATM_PANEL模式下支持
   */
  VCA_EVENT_HUMAN_ENTER(29, "人靠近ATM,只在ATM_PANEL模式下支持"),
  /**
   * 操作超时,只在ATM_PANEL模式下支持
   */
  VCA_EVENT_OVER_TIME(30, "操作超时,只在ATM_PANEL模式下支持"),
  /**
   * 贴纸条,支持区域规则
   */
  VCA_EVENT_STICK_UP(31, "贴纸条,支持区域规则"),
  /**
   * 安装读卡器,支持区域规则
   */
  VCA_EVENT_INSTALL_SCANNER(32, "安装读卡器,支持区域规则"),
  /**
   * 人数变化事件
   */
  VCA_EVENT_PEOPLENUM_CHANGE(35, "人数变化事件"),
  /**
   * 间距变化事件
   */
  VCA_EVENT_SPACING_CHANGE(36, "间距变化事件"),
  /**
   * 组合规则事件
   */
  VCA_EVENT_COMBINED_RULE(37, "组合规则事件"),
  /**
   * 一动不动（静坐）    则事件
   */
  VCA_EVENT_SIT_QUIETLY(38, "一动不动（静坐）    则事件"),
  /**
   * 区域内人员聚集状态
   */
  VCA_EVENT_HIGH_DENSITY_STATUS(3, "区域内人员聚集状态"),
  /**
   * 奔跑检测
   */
  VCA_EVENT_RUNNING(40, "奔跑检测"),
  /**
   * 滞留检测
   */
  VCA_EVENT_RETENTION(41, "滞留检测"),
  /**
   * 板书
   */
  VCA_EVENT_BLACKBOARD_WRITE(42, "板书"),
  /**
   * 态势分析
   */
  VCA_EVENT_SITUATION_ANALYSIS(43, "态势分析");

  private int code;
  private String description;

  public static Optional<VcaEventTypeExtension> byCode(int code) {
    return EnumSet.allOf(VcaEventTypeExtension.class).stream().filter(in -> in.code == code).findFirst();
  }
}
