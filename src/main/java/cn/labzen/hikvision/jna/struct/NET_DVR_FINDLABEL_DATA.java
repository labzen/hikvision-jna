package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.LABEL_NAME_LEN;

/**
 * 标签信息结构体
 */
@Structure.FieldOrder({"sLabelName",
                       "struTimeLabel",
                       "struLabelIdentify",
                       "byISO8601",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes"})
public class NET_DVR_FINDLABEL_DATA extends Structure {

  /**
   * 标签名称
   */
  public byte[] sLabelName = new byte[LABEL_NAME_LEN];
  /**
   * 标签时间
   */
  public NET_DVR_TIME struTimeLabel;
  /**
   * 标签标识
   */
  public NET_DVR_LABEL_IDENTIFY struLabelIdentify;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 开始时间与UTC的时差（小时），-12 ... +14， 正数表示东时区
   */
  public byte cTimeDifferenceH;
  /**
   * 开始时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public byte cTimeDifferenceM;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[29];
}
