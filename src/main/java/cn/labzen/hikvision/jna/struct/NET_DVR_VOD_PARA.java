package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef;

/**
 * 录像回放结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struIDInfo",
                       "struBeginTime",
                       "struEndTime",
                       "hWnd",
                       "byDrawFrame",
                       "byVolumeType",
                       "byVolumeNum",
                       "byStreamType",
                       "dwFileIndex",
                       "byAudioFile",
                       "byCourseFile",
                       "byDownload",
                       "byOptimalStreamType",
                       "byRes2"})
public class NET_DVR_VOD_PARA extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * （ISAPI登录不支持）流信息，流ID或者通道号
   */
  public NET_DVR_STREAM_INFO struIDInfo;
  /**
   * 开始时间
   */
  public NET_DVR_TIME struBeginTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME struEndTime;
  /**
   * 回放的窗口句柄，若置为空，SDK仍能收到码流数据，但不解码显示
   */
  public WinDef.HWND hWnd;
  /**
   * （ISAPI登录不支持）是否抽帧：0:不抽帧，1：抽帧
   */
  public byte byDrawFrame;
  /**
   * （ISAPI登录不支持）0-普通录像卷  1-存档卷
   */
  public byte byVolumeType;
  /**
   * （ISAPI登录不支持）卷号，目前指存档卷号
   */
  public byte byVolumeNum;
  /**
   * （ISAPI登录不支持）码流类型 0-主码流， 1-子码流，2-码流三
   */
  public byte byStreamType;
  /**
   * （ISAPI登录不支持）存档卷上的录像文件索引，搜索存档卷录像时返回的值
   */
  public int dwFileIndex;
  /**
   * （ISAPI登录不支持）音频文件0-否，1-是
   */
  public byte byAudioFile;
  /**
   * （ISAPI登录不支持）课程文件0-否，1-是
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
  public byte[] byRes2 = new byte[20];
}
