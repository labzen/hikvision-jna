package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 外设状态，参考EXTERNAL_DEVICES_STATUS
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum ExternalDeviceStatus implements HikvisionEnum {

  /**
   * 状态正常
   */
  DEVICES_STATUS_NORMAL(0, "状态正常"),
  /**
   * 状态异常
   */
  DEVICES_STATUS_ABNORMAL(1, "状态异常"),
  /**
   * 发卡机少卡
   */
  DEVICES_STATUS_TOO_LESS_CARD(20, "发卡机少卡"),
  /**
   * 发卡机无卡
   */
  DEVICES_STATUS_NO_CARD(21, "发卡机无卡"),
  /**
   * 预发卡错误
   */
  DEVICES_STATUS_SENDCARD_ERROR(22, "预发卡错误"),
  /**
   * 堵卡
   */
  DEVICES_STATUS_CARD_BLOCKED(23, "堵卡"),
  /**
   * 回收仓卡满
   */
  DEVICES_STATUS_CARD_FULL(24, "回收仓卡满"),
  /**
   * 道闸正在开
   */
  DEVICES_STATUS_OPENING(40, "道闸正在开"),
  /**
   * 道闸正在关
   */
  DEVICES_STATUS_CLOSING(41, "道闸正在关"),
  /**
   * 道闸开到位
   */
  DEVICES_STATUS_OPENED(42, "道闸开到位"),
  /**
   * 道闸关到位
   */
  DEVICES_STATUS_CLOSED(43, "道闸关到位"),
  /**
   * 道闸无信号
   */
  DEVICES_STATUS_NOSIGNAL(44, "道闸无信号"),
  /**
   * 锁闸
   */
  DEVICES_STATUS_LOCK(45, "锁闸"),
  /**
   * 脱机
   */
  PP_STATUS_OFFLINE(61, "脱机"),
  /**
   * 打印头抬起
   */
  PP_STATUS_PRINT_HEADER_UP(62, " 打印头抬起"),
  /**
   * 正在用进纸键进纸
   */
  PP_STATUS_FEED_BUTTON_FEEDING(63, "正在用进纸键进纸"),
  /**
   * 联机等待
   */
  PP_STATUS_ONLINE_WAITING(64, "联机等待"),
  /**
   * 按键进纸使能为开
   */
  PP_STATUS_FEED_BUTTON_ENABLE(65, "按键进纸使能为开"),
  /**
   * 卡纸错误
   */
  PP_STATUS_JAMR_PAPER_ERROR(66, "卡纸错误"),
  /**
   * 切刀错误
   */
  PP_STATUS_CUT_PAPER_ERROR(67, "切刀错误"),
  /**
   * 自动上纸错误
   */
  PP_STATUS_AUTO_FEED_ERROR(68, "自动上纸错误"),
  /**
   * 有可恢复错误
   */
  PP_STATUS_EXIT_RECOVERY_ERROR(69, "有可恢复错误"),
  /**
   * 有可自动恢复错误
   */
  PP_STATUS_EXIT_AUTO_RECOVERY_ERROR(70, "有可自动恢复错误"),
  /**
   * 拉纸错误
   */
  PP_STATUS_PULL_PAPER_ERROR(71, "拉纸错误"),
  /**
   * 纸将尽
   */
  PP_STATUS_LESS_PAPER(72, "纸将尽"),
  /**
   * 无纸
   */
  PP_STATUS_NO_PAPER(73, "无纸"),
  /**
   * 打印失败
   */
  PP_STATUS_PRINT_FAIL(74, "打印失败"),
  /**
   * 正在打印
   */
  PP_STATUS_PRINTING(75, "正在打印");

  private int code;
  private String description;

  public static Optional<ExternalDeviceStatus> byCode(int code) {
    return EnumSet.allOf(ExternalDeviceStatus.class).stream().filter(in -> in.code == code).findFirst();
  }
}
