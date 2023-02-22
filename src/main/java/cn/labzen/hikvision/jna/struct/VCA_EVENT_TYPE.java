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
                       "dwSecond"})
public class VCA_EVENT_TYPE extends Structure {

  public int dwYear;
  public int dwMonth;
  public int dwDay;
  public int dwHour;
  public int dwMinute;
  public int dwSecond;
}
