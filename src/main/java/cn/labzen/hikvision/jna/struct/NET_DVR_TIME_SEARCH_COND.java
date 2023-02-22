package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 数据时间搜索条件结构体
 */
@Structure.FieldOrder({"wYear",
                       "byMonth",
                       "byDay",
                       "byHour",
                       "byMinute",
                       "bySecond",
                       "byLocalOrUTC",
                       "wMillisecond",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM"})
public class NET_DVR_TIME_SEARCH_COND extends Structure {

  /**
   * 年，设备OSD时间
   */
  public short wYear;
  /**
   * 月，设备OSD时间
   */
  public byte byMonth;
  /**
   * 日，设备OSD时间
   */
  public byte byDay;
  /**
   * 时，设备OSD时间
   */
  public byte byHour;
  /**
   * 分，设备OSD时间
   */
  public byte byMinute;
  /**
   * 秒，设备OSD时间
   */
  public byte bySecond;
  /**
   * 0-时差无效，设备本地时间，即设备OSD时间  1-时差有效
   */
  public byte byLocalOrUTC;
  /**
   * 毫秒，精度不够，默认为0
   */
  public short wMillisecond;
  /**
   * 与UTC的时差（小时），-12 ... +14，+表示东区，byLocalOrUTC为1时有效
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 0, 30, 45，+表示东区，byLocalOrUTC为1时有效
   */
  public byte cTimeDifferenceM;
}
