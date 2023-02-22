package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 假日日期模式A
 */
@Structure.FieldOrder({"byStartMonth",
                       "byStartDay",
                       "byEndMonth",
                       "byEndDay",
                       "byRes"})
public class NET_DVR_HOLIDATE_MODEA extends Structure {

  /**
   * 开始月 从1开始
   */
  public byte byStartMonth;
  /**
   * 开始日 从1开始
   */
  public byte byStartDay;
  /**
   * 结束月
   */
  public byte byEndMonth;
  /**
   * 结束日
   */
  public byte byEndDay;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[4];
}
