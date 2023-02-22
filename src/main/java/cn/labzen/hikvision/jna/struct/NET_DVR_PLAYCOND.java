package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.STREAM_ID_LEN;

/**
 * 回放或者下载信息结构体
 */
@Structure.FieldOrder({"dwChannel",
                       "struStartTime",
                       "struStopTime",
                       "byDrawFrame",
                       "byStreamType",
                       "byStreamID",
                       "byCourseFile",
                       "byDownload",
                       "byOptimalStreamType",
                       "byRes"})
public class NET_DVR_PLAYCOND extends Structure {

  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 开始时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME struStopTime;
  /**
   * 是否抽帧0:不抽帧，1：抽帧
   */
  public byte byDrawFrame;
  /**
   * 码流类型，0-主码流 1-子码流 2-码流三
   */
  public byte byStreamType;
  /**
   * 流ID，使用流ID方式时dwChannel设为0xffffffff
   */
  public byte[] byStreamID = new byte[STREAM_ID_LEN];
  /**
   * 课程文件0-否，1-是
   */
  public byte byCourseFile;
  /**
   * 是否下载 0-否，1-是
   */
  public byte byDownload;
  /**
   * 是否按最优码流类型回放 0-否，1-是（对于双码流设备，某一段时间内的录像文件与指定码流类型不同，则返回实际码流类型的录像）
   */
  public byte byOptimalStreamType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[27];
}
