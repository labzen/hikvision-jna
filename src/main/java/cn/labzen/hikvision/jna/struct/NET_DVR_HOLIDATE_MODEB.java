package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 假日日期模式B
 */
@Structure.FieldOrder({"byStartMonth",
                       "byStartWeekNum",
                       "byStartWeekday",
                       "byEndMonth",
                       "byEndWeekNum",
                       "byEndWeekday",
                       "byRes"})
public class NET_DVR_HOLIDATE_MODEB extends Structure {

  /**
   * 从1开始
   */
  public byte byStartMonth;
  /**
   * 第几个星期 从1开始
   */
  public byte byStartWeekNum;
  /**
   * 星期几
   */
  public byte byStartWeekday;
  /**
   * 从1开始
   */
  public byte byEndMonth;
  /**
   * 第几个星期 从1开始
   */
  public byte byEndWeekNum;
  /**
   * 星期几
   */
  public byte byEndWeekday;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[2];
}
