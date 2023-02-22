package cn.labzen.hikvision.jna.struct;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.LABEL_NAME_LEN;

/**
 * 录像标签查找结构体
 */
@Structure.FieldOrder({"dwSize",
                       "lChannel",
                       "struStartTime",
                       "struStopTime",
                       "sLabelName",
                       "byDrawFrame",
                       "byISO8601",
                       "cStartTimeDifferenceH",
                       "cStartTimeDifferenceM",
                       "cStopTimeDifferenceH",
                       "cStopTimeDifferenceM",
                       "byRes"})
public class NET_DVR_FIND_LABEL extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 查找的通道
   */
  public NativeLong lChannel;
  /**
   * 开始时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME struStopTime;
  /**
   * 录像标签名称 如果标签名称为空，则搜索起止时间所有标签
   */
  public byte[] sLabelName = new byte[LABEL_NAME_LEN];
  /**
   * 0:不抽帧，1：抽帧
   */
  public byte byDrawFrame;
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
   * 保留字节
   */
  public byte[] byRes = new byte[34];
}
