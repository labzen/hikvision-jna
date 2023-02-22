package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 智能搜索参数的结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struIDInfo",
                       "bySearchCondType",
                       "bySensitivity",
                       "byRes1",
                       "struStartTime",
                       "struEndTime",
                       "uSmartSearchCond",
                       "byISO8601",
                       "cStartTimeDifferenceH",
                       "cStartTimeDifferenceM",
                       "cStopTimeDifferenceH",
                       "cStopTimeDifferenceM",
                       "byRes2"})
public class NET_DVR_SMART_SEARCH_PARAM_V40 extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 流信息，流ID或者通道号
   */
  public NET_DVR_STREAM_INFO struIDInfo;
  /**
   * 智能查找联合体索引 0-侦测区域, 1-越界侦测, 2-区域入侵,3-人脸侦测, 4-车牌检测
   */
  public byte bySearchCondType;
  /**
   * 动态分析搜索灵敏度（bySearchCondType==0时有效，表示发生移动侦测区域占搜索区域的百分比，当移动侦测区域占搜索区域的百分比越低越容易搜出结果来，即灵敏度越高），取值：1~100
   */
  public byte bySensitivity;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 录像的开始时间
   */
  public NET_DVR_TIME_EX struStartTime;
  /**
   * 录像的结束时间
   */
  public NET_DVR_TIME_EX struEndTime;
  /**
   * 智能查找条件
   */
  public NET_DVR_AREA_SMARTSEARCH_COND_UNION uSmartSearchCond;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 开始时间与UTC的时差（小时），-12 ... +14， 正数表示东时区，byISO8601为1时有效
   */
  public byte cStartTimeDifferenceH;
  /**
   * 开始时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区，byISO8601为1时有效
   */
  public byte cStartTimeDifferenceM;
  /**
   * 结束时间与UTC的时差（小时），-12 ... +14，正数表示东时区，byISO8601为1时有效
   */
  public byte cStopTimeDifferenceH;
  /**
   * 结束时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区，byISO8601为1时有效
   */
  public byte cStopTimeDifferenceM;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[251];
}
