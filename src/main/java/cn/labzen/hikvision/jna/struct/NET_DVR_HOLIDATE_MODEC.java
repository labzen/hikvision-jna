package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 假日日期模式C
 */
@Structure.FieldOrder({"wStartYear",
                       "byStartMon",
                       "byStartDay",
                       "wEndYear",
                       "byEndMon",
                       "byEndDay"})
public class NET_DVR_HOLIDATE_MODEC extends Structure {

  public short wStartYear;
  public byte byStartMon;
  public byte byStartDay;
  public short wEndYear;
  public byte byEndMon;
  public byte byEndDay;
}
