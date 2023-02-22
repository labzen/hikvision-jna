package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;

import static cn.labzen.hikvision.jna.Constants.STREAM_ID_LEN;

/**
 * 智能图片搜索条件结构体
 * <p/>
 * “以图索图”功能，需要设备启用图像建模功能（NET_DVR_PIC_MODEL_CFG）。
 */
@Structure.FieldOrder({"dwChanNo",
                       "byStreamID",
                       "struStartTime",
                       "struEndTime",
                       "wSearchType",
                       "byRes1",
                       "uSmartSearchCond",
                       "byISO8601",
                       "cStartTimeDifferenceH",
                       "cStartTimeDifferenceM",
                       "cStopTimeDifferenceH",
                       "cStopTimeDifferenceM",
                       "byRes"})
public class NET_DVR_SMART_SEARCH_PIC_PARA extends Structure {

  /**
   * 通道号
   */
  public int dwChanNo;
  /**
   * 流ID信息，与dwChanNo相比，优先级较高，即当byStreamID不为空时，则使用流ID，为空的情况下使用dwChanNo字段
   */
  public int[] byStreamID = new int[STREAM_ID_LEN];
  /**
   * 录像开始的时间
   */
  public NET_DVR_TIME_EX struStartTime;
  /**
   * 录像停止的时间
   */
  public NET_DVR_TIME_EX struEndTime;
  /**
   * 智能查找类型  0-车辆检索 ，1-人脸属性， 2-以图索图 ，3-行为分析
   */
  public short wSearchType;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 智能查找条件
   */
  public NET_DVR_SMARTSEARCH_PIC_UNION uSmartSearchCond;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 开始时间与UTC的时差（小时），-12 ... +14， 正数表示东时区
   */
  public char cStartTimeDifferenceH;
  /**
   * 开始时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public char cStartTimeDifferenceM;
  /**
   * 结束时间与UTC的时差（小时），-12 ... +14，正数表示东时区
   */
  public char cStopTimeDifferenceH;
  /**
   * 结束时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public char cStopTimeDifferenceM;
  /**
   * 保留
   */
  public byte[] byRes = new byte[59];

  /**
   * 智能查找条件
   */
  @FieldOrder({"byLen",
               "struVehiclePara",
               "struHumaFeature",
               "struHumaPic",
               "struBehaviourCond"})
  public static class NET_DVR_SMARTSEARCH_PIC_UNION extends Union {

    /**
     * 联合体大小，256字节
     */
    public byte[] byLen = new byte[256];
    /**
     * 车辆检测信息，智能查找类型(wSearchType)为"0-车辆检索"时有效
     */
    public NET_DVR_VEHICLE_PARA struVehiclePara;
    /**
     * 人脸属性，智能查找类型(wSearchType)为"1-人脸属性"时有效
     */
    public NET_VCA_HUMAN_FEATURE struHumaFeature;
    /**
     * 根据人脸子图信息查询（用于远程图片的以图索图功能），智能查找类型(wSearchType)为"2-以图索图"时有效
     */
    public NET_DVR_FACE_PIC_DATA_INFO struHumaPic;
    /**
     * 行为分析搜索条件，智能查找类型(wSearchType)为"3-行为分析"时有效
     */
    public NET_DVR_BEHAVIOUR_COND struBehaviourCond;
  }
}
