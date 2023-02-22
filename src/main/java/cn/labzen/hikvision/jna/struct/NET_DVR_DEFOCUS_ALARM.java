package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 虚焦报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "wDevInfoIvmsChannelEx",
                       "byRes1",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "byTimeDiffFlag",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes"})
public class NET_DVR_DEFOCUS_ALARM extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
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
  public byte[] byRes1 = new byte[2];
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 时差字段是否有效  0-时差无效， 1-时差有效
   */
  public byte byTimeDiffFlag;
  /**
   * 与UTC的时差（小时），-12 ... +14， +表示东区,，byTimeDiffFlag为1时有效
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 30, 45， +表示东区，byTimeDiffFlag为1时有效
   */
  public byte cTimeDifferenceM;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[49];
}
