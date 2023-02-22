package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 时间参数结构体
 */
@Structure.FieldOrder({"wYear",
                       "byMonth",
                       "byDay",
                       "byHour",
                       "byMinute",
                       "bySecond",
                       "byISO8601",
                       "wMillisecond",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM"})
public class NET_DVR_TIME_V50 extends Structure {

  /**
   * 年
   */
  public short wYear;
  /**
   * 月
   */
  public byte byMonth;
  /**
   * 日
   */
  public byte byDay;
  /**
   * 时
   */
  public byte byHour;
  /**
   * 分
   */
  public byte byMinute;
  /**
   * 秒
   */
  public byte bySecond;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 毫秒，精度不够，默认为0
   */
  public short wMillisecond;
  /**
   * 与UTC的时差（小时），-12 ... +14，+表示东区，byISO8601为1时有效
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 0, 30, 45，+表示东区，byISO8601为1时有效
   */
  public byte cTimeDifferenceM;
}
