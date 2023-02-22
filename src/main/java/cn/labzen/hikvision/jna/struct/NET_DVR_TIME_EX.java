package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 时间参数结构体
 */
@Structure.FieldOrder({"dwYear",
                       "dwMonth",
                       "dwDay",
                       "dwHour",
                       "dwMinute",
                       "dwSecond",
                       "byRes"})
public class NET_DVR_TIME_EX extends Structure {

  public short dwYear;
  public byte dwMonth;
  public byte dwDay;
  public byte dwHour;
  public byte dwMinute;
  public byte dwSecond;
  public byte byRes;
}
