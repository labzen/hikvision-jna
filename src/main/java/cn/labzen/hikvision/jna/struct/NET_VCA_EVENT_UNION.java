package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;

/**
 * 警戒规则参数结构体
 */
@Structure.FieldOrder({"uLen",
                       "struTraversePlane",
                       "struArea",
                       "struIntrusion",
                       "struLoiter",
                       "struTakeTeft",
                       "struParking",
                       "struRun",
                       "struHighDensity",
                       "struViolentMotion",
                       "struReachHight",
                       "struGetUp",
                       "struLeft",
                       "struTake",
                       "struHumanEnter",
                       "struOvertime",
                       "struStickUp",
                       "struScanner",
                       "struLeavePos",
                       "struTrail",
                       "struFallDown",
                       "struAudioAbnormal",
                       "struReachHeight",
                       "struToiletTarry",
                       "struYardTarry",
                       "struAdvTraversePlane",
                       "struLecture",
                       "struAnswer",
                       "struStandUp",
                       "struPeopleNumChange",
                       "struSpacingChange",
                       "struCombinedRule",
                       "struSitQuietly",
                       "struHighDensityStatus",
                       "struRunning",
                       "struRetention",
                       "struBlackboardWrite",
                       "struSituationAnalysis"})
public class NET_VCA_EVENT_UNION extends Union {

  /**
   * 联合体大小，4*23共92字节
   */
  public int[] uLen = new int[23];
  /**
   * 穿越警戒面参数
   */
  public NET_VCA_TRAVERSE_PLANE struTraversePlane;
  /**
   * 进入/离开区域参数
   */
  public NET_VCA_AREA struArea;
  /**
   * 入侵参数
   */
  public NET_VCA_INTRUSION struIntrusion;
  /**
   * 徘徊参数
   */
  public NET_VCA_LOITER struLoiter;
  /**
   * 物品遗留/物品拿取参数
   */
  public NET_VCA_TAKE_LEFT struTakeTeft;
  /**
   * 停车参数
   */
  public NET_VCA_PARKING struParking;
  /**
   * 快速移动参数
   */
  public NET_VCA_RUN struRun;
  /**
   * 人员聚集参数
   */
  public NET_VCA_HIGH_DENSITY struHighDensity;
  /**
   * 剧烈运动
   */
  public NET_VCA_VIOLENT_MOTION struViolentMotion;
  /**
   * 攀高
   */
  public NET_VCA_REACH_HIGHT struReachHight;
  /**
   * 起床
   */
  public NET_VCA_GET_UP struGetUp;
  /**
   * 物品遗留
   */
  public NET_VCA_LEFT struLeft;
  /**
   * 物品拿取
   */
  public NET_VCA_TAKE struTake;
  /**
   * 人员进入
   */
  public NET_VCA_HUMAN_ENTER struHumanEnter;
  /**
   * 操作超时
   */
  public NET_VCA_OVER_TIME struOvertime;
  /**
   * 贴纸条
   */
  public NET_VCA_STICK_UP struStickUp;
  /**
   * 读卡器参数
   */
  public NET_VCA_SCANNER struScanner;
  /**
   * 离岗参数
   */
  public NET_VCA_LEAVE_POSITION struLeavePos;
  /**
   * 尾随参数
   */
  public NET_VCA_TRAIL struTrail;
  /**
   * 倒地参数
   */
  public NET_VCA_FALL_DOWN struFallDown;
  /**
   * 声强突变
   */
  public NET_VCA_AUDIO_ABNORMAL struAudioAbnormal;
  /**
   * 折线攀高参数
   */
  public NET_VCA_ADV_REACH_HEIGHT struReachHeight;
  /**
   * 如厕超时参数
   */
  public NET_VCA_TOILET_TARRY struToiletTarry;
  /**
   * 放风场滞留参数
   */
  public NET_VCA_YARD_TARRY struYardTarry;
  /**
   * 折线警戒面参数
   */
  public NET_VCA_ADV_TRAVERSE_PLANE struAdvTraversePlane;
  /**
   * 授课事件
   */
  public NET_VCA_LECTURE struLecture;
  /**
   * 回答问题事件
   */
  public NET_VCA_ANSWER struAnswer;
  /**
   * 起立参数
   */
  public NET_VCA_STANDUP struStandUp;
  /**
   * 人数变化参数
   */
  public NET_VCA_PEOPLENUM_CHANGE struPeopleNumChange;
  /**
   * 间距变化参数
   */
  public NET_VCA_SPACING_CHANGE struSpacingChange;
  /**
   * 组合规则参数
   */
  public NET_VCA_COMBINED_RULE struCombinedRule;
  /**
   * 静坐参数
   */
  public NET_VCA_SIT_QUIETLY struSitQuietly;
  /**
   * 人员聚集状态
   */
  public NET_VCA_HIGH_DENSITY_STATUS struHighDensityStatus;
  /**
   * 奔跑参数
   */
  public NET_VCA_RUNNING struRunning;
  /**
   * 滞留检测
   */
  public NET_VCA_RETENTION struRetention;
  /**
   * 板书参数
   */
  public NET_VCA_BLACKBOARD_WRITE struBlackboardWrite;
  /**
   * 态势分析参数
   */
  public NET_VCA_SITUATION_ANALYSIS struSituationAnalysis;
}
