package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 时间参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struStreamInfo",
                       "bySearchDataType",
                       "byRes",
                       "struStartTime",
                       "struStopTime",
                       "dwIntervalTime",
                       "byRes1"})
public class NET_DVR_THUMBNAILS_COND extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 流信息
   */
  public NET_DVR_STREAM_INFO struStreamInfo;
  /**
   * 查找数据类型 0-I帧数据（CVR 一路的情况下，1s最多28个I帧），1-图片数据
   */
  public byte bySearchDataType;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[3];
  /**
   * 查找开始时间
   */
  public NET_DVR_TIME_V30 struStartTime;
  /**
   * 查找结束时间
   */
  public NET_DVR_TIME_V30 struStopTime;
  /**
   * 间隔时间，单位秒，范围：0~24*60*60，若查找结束时间等于查找开始时间，则填0，填其他值无效
   */
  public int dwIntervalTime;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[512];
}
