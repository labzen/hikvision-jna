package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * SDK本地异常（消息回调）
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum ExceptionErrorCode implements HikvisionEnum {

  /**
   * 用户交互时异常（注册心跳超时，心跳间隔为2分钟）
   */
  EXCEPTION_EXCHANGE(0x8000, "用户交互时异常（注册心跳超时，心跳间隔为2分钟）"),
  /**
   * 语音对讲异常
   */
  EXCEPTION_AUDIOEXCHANGE(0x8001, "语音对讲异常"),
  /**
   * 报警异常
   */
  EXCEPTION_ALARM(0x8002, "报警异常"),
  /**
   * 网络预览异常
   */
  EXCEPTION_PREVIEW(0x8003, "网络预览异常"),
  /**
   * 透明通道异常
   */
  EXCEPTION_SERIAL(0x8004, "透明通道异常"),
  /**
   * 预览时重连
   */
  EXCEPTION_RECONNECT(0x8005, "预览时重连"),
  /**
   * 报警时重连
   */
  EXCEPTION_ALARMRECONNECT(0x8006, "报警时重连"),
  /**
   * 透明通道重连
   */
  EXCEPTION_SERIALRECONNECT(0x8007, "透明通道重连"),
  /**
   * 透明通道重连成功
   */
  SERIAL_RECONNECTSUCCESS(0x8008, "透明通道重连成功"),
  /**
   * 回放异常
   */
  EXCEPTION_PLAYBACK(0x8010, "回放异常"),
  /**
   * 硬盘格式化
   */
  EXCEPTION_DISKFMT(0x8011, "硬盘格式化"),
  /**
   * 被动解码异常
   */
  EXCEPTION_PASSIVEDECODE(0x8012, "被动解码异常"),
  /**
   * 邮件测试异常
   */
  EXCEPTION_EMAILTEST(0x8013, "邮件测试异常"),
  /**
   * 备份异常
   */
  EXCEPTION_BACKUP(0x8014, "备份异常"),
  /**
   * 预览时重连成功
   */
  PREVIEW_RECONNECTSUCCESS(0x8015, "预览时重连成功"),
  /**
   * 报警时重连成功
   */
  ALARM_RECONNECTSUCCESS(0x8016, "报警时重连成功"),
  /**
   * 用户交互恢复
   */
  RESUME_EXCHANGE(0x8017, "用户交互恢复"),
  /**
   * 网络流量检测异常
   */
  NETWORK_FLOWTEST_EXCEPTION(0x8018, "网络流量检测异常"),
  /**
   * 图片预览重连
   */
  EXCEPTION_PICPREVIEWRECONNECT(0x8019, "图片预览重连"),
  /**
   * 图片预览重连成功
   */
  PICPREVIEW_RECONNECTSUCCESS(0x8020, "图片预览重连成功"),
  /**
   * 图片预览异常
   */
  EXCEPTION_PICPREVIEW(0x8021, "图片预览异常"),
  /**
   * 报警信息缓存已达上限
   */
  EXCEPTION_MAX_ALARM_INFO(0x8022, "报警信息缓存已达上限"),
  /**
   * 报警丢失
   */
  EXCEPTION_LOST_ALARM(0x8023, "报警丢失"),
  /**
   * 被动转码重连
   */
  EXCEPTION_PASSIVETRANSRECONNECT(0x8024, "被动转码重连"),
  /**
   * 被动转码重连成功
   */
  PASSIVETRANS_RECONNECTSUCCESS(0x8025, "被动转码重连成功"),
  /**
   * 被动转码异常
   */
  EXCEPTION_PASSIVETRANS(0x8026, "被动转码异常"),
  /**
   * 用户重登陆
   */
  EXCEPTION_RELOGIN(0x8040, "用户重登陆"),
  /**
   * 用户重登陆成功
   */
  RELOGIN_SUCCESS(0x8041, "用户重登陆成功"),
  /**
   * 被动解码重连
   */
  EXCEPTION_PASSIVEDECODE_RECONNNECT(0x8042, "被动解码重连"),
  /**
   * 集群报警异常
   */
  EXCEPTION_CLUSTER_CS_ARMFAILED(0x8043, "集群报警异常"),
  /**
   * 重登陆失败，停止重登陆
   */
  EXCEPTION_RELOGIN_FAILED(0x8044, "重登陆失败，停止重登陆"),
  /**
   * 关闭预览重连功能
   */
  EXCEPTION_PREVIEW_RECONNECT_CLOSED(0x8045, "关闭预览重连功能"),
  /**
   * 关闭报警重连功能
   */
  EXCEPTION_ALARM_RECONNECT_CLOSED(0x8046, "关闭报警重连功能"),
  /**
   * 关闭透明通道重连功能
   */
  EXCEPTION_SERIAL_RECONNECT_CLOSED(0x8047, "关闭透明通道重连功能"),
  /**
   * 关闭回显重连功能
   */
  EXCEPTION_PIC_RECONNECT_CLOSED(0x8048, "关闭回显重连功能"),
  /**
   * 关闭被动解码重连功能
   */
  EXCEPTION_PASSIVE_DECODE_RECONNECT_CLOSED(0x8049, "关闭被动解码重连功能"),
  /**
   * 关闭被动转码重连功能
   */
  EXCEPTION_PASSIVE_TRANS_RECONNECT_CLOSED(0x804a, "关闭被动转码重连功能");

  private int code;
  private String description;

  public static Optional<ExceptionErrorCode> byCode(int code) {
    return EnumSet.allOf(ExceptionErrorCode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
