package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 声音报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byAlarmType",
                       "byRes1",
                       "wAudioDecibel",
                       "struDevInfo",
                       "wDevInfoIvmsChannelEx",
                       "byRes"})
public class NET_DVR_AUDIOEXCEPTION_ALARM extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
  /**
   * 报警类型，1-音频输入异常，2-音频输入突变（声强陡升），3-声强陡降，4-音频丢失
   */
  public byte byAlarmType;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 声音强度（音频输入突变时用到）
   */
  public short wAudioDecibel;
  /**
   * 设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[62];
}
