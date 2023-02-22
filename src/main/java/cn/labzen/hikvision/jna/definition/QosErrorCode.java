package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * Qos流控库错误码
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum QosErrorCode implements HikvisionEnum {

  /**
   * 预设的最小间隔错误.
   */
  NET_QOS_ERR_SCHEDPARAMS_BAD_MINIMUM_INTERVAL(678, "预设的最小间隔错误."),
  /**
   * 预设分数错误
   */
  NET_QOS_ERR_SCHEDPARAMS_BAD_FRACTION(679, "预设分数错误"),
  /**
   * 预设的带宽值无效
   */
  NET_QOS_ERR_SCHEDPARAMS_INVALID_BANDWIDTH(680, "预设的带宽值无效"),
  /**
   * 数据包太大
   */
  NET_QOS_ERR_PACKET_TOO_BIG(687, "数据包太大"),
  /**
   * 数据包长度错误
   */
  NET_QOS_ERR_PACKET_LENGTH(688, "数据包长度错误"),
  /**
   * 数据包版本错误
   */
  NET_QOS_ERR_PACKET_VERSION(689, "数据包版本错误"),
  /**
   * 未知数据包
   */
  NET_QOS_ERR_PACKET_UNKNOW(690, "未知数据包"),
  /**
   * 内存不足
   */
  NET_QOS_ERR_OUTOFMEM(695, "内存不足"),
  /**
   * Lib库没有初始化
   */
  NET_QOS_ERR_LIB_NOT_INITIALIZED(696, "Lib库没有初始化"),
  /**
   * 没有找到会话
   */
  NET_QOS_ERR_SESSION_NOT_FOUND(697, "没有找到会话"),
  /**
   * 参数无效
   */
  NET_QOS_ERR_INVALID_ARGUMENTS(698, "参数无效"),
  /**
   * Qos 错误
   */
  NET_QOS_ERROR(699, "Qos 错误"),
  /**
   * 没有错误
   */
  NET_QOS_OK(700, "没有错误");

  private int code;
  private String description;

  public static Optional<QosErrorCode> byCode(int code) {
    return EnumSet.allOf(QosErrorCode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
