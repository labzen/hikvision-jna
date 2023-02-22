package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 录像段加锁/解锁结果结构体
 */
@Structure.FieldOrder({"dwSize",
                       "strBeginTime",
                       "strEndTime",
                       "byRes"})
public class NET_DVR_LOCK_RETURN extends Structure {

  /**
   *
   */
  public int dwSize;
  /**
   * 开始时间
   */
  public NET_DVR_TIME strBeginTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME strEndTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[20];
}
