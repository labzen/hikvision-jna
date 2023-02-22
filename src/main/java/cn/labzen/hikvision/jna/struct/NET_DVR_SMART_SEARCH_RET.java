package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 智能搜索结果的结构体
 */
@Structure.FieldOrder({"struStartTime",
                       "struEndTime",
                       "byISO8601",
                       "cStartTimeDifferenceH",
                       "cStartTimeDifferenceM",
                       "cStopTimeDifferenceH",
                       "cStopTimeDifferenceM",
                       "byRes"})
public class NET_DVR_SMART_SEARCH_RET extends Structure {

  /**
   * 移动侦测报警开始的时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 事件停止的时间
   */
  public NET_DVR_TIME struEndTime;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 开始时间与UTC的时差（小时），-12 ... +14， 正数表示东时区
   */
  public byte cStartTimeDifferenceH;
  /**
   * 开始时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public byte cStartTimeDifferenceM;
  /**
   * 结束时间与UTC的时差（小时），-12 ... +14，正数表示东时区
   */
  public byte cStopTimeDifferenceH;
  /**
   * 结束时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public byte cStopTimeDifferenceM;
  /**
   * 保留
   */
  public byte[] byRes = new byte[59];
}
