package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.PICTURE_NAME_LEN;

/**
 * 图片查找结果信息结构体
 */
@Structure.FieldOrder({"sFileName",
                       "struTime",
                       "dwFileSize",
                       "wPicType",
                       "byRes1",
                       "uPicFeature",
                       "byISO8601",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes"})
public class NET_DVR_SMART_SEARCH_PIC_RET extends Structure {

  /**
   * 文件名
   */
  public byte[] sFileName = new byte[PICTURE_NAME_LEN];
  /**
   * 图片的抓图时间
   */
  public NET_DVR_TIME_EX struTime;
  /**
   * 文件的大小
   */
  public int dwFileSize;
  /**
   * 图片类型  0-车辆检索 ，1-人脸属性， 2-以图索图 ，3-穿越警戒线，4-区域入侵， 5-物品遗留， 6-物品拿取， 7-进入区域，
   * 8-离开区域，9-非法停车，10-徘徊，11-人员聚集，12-快速移动,13-人员奔跑，14-剧烈运动，15-人员倒地，16-人数异常，17-离岗检测，18-人员滞留，19-态势分析
   */
  public short wPicType;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 图片属性
   */
  public NET_DVR_PIC_FEATURE_UNION uPicFeature;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 与UTC的时差（小时），-12 ... +14， 正数表示东时区
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public byte cTimeDifferenceM;
  /**
   * 保留
   */
  public byte[] byRes = new byte[29];

  /**
   * 时间参数结构体
   */
  @FieldOrder({"byLen",
               "struPlateInfo",
               "struFaceSubInfo",
               "struBehavior"})
  public static class NET_DVR_PIC_FEATURE_UNION extends Structure {

    /**
     * 联合体长度
     */
    public byte[] byLen = new byte[256];
    /**
     * 车辆检索信息
     */
    public NET_DVR_PLATE_INFO struPlateInfo;
    /**
     * 人脸子图信息
     */
    public NET_DVR_FACE_SUB_PIC_INFO struFaceSubInfo;
    /**
     * 行为分析对应的子图信息
     */
    public NET_DVR_BEHAVIOR_INFO struBehavior;
  }
}
