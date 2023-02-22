package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;
import static cn.labzen.hikvision.jna.Constants.PASSWD_LEN;

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
                       "byPlayMode",
                       "byLinkMode",
                       "byDownload",
                       "byOptimalStreamType",
                       "byDisplayBufNum",
                       "byNPQMode",
                       "sUserName",
                       "sPassword",
                       "byRemoteFile",
                       "byRes2",
                       "pSavedFileName"})
public class NET_DVR_VOD_PARA_V50 extends Structure {

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
  public NET_DVR_TIME_V50 struBeginTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME_V50 struEndTime;
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
   * 播放方式0-正放，1-倒放
   */
  public byte byPlayMode;
  /**
   * 连接方式0-TCP，1-AdaptiveUDP
   */
  public byte byLinkMode;
  /**
   * 是否下载 0-否，1-是
   */
  public byte byDownload;
  /**
   * 是否按最优码流类型回放 0-否，1-是（对于双码流设备，某一段时间内的录像文件与指定码流类型不同，则返回实际码流类型的录像）
   */
  public byte byOptimalStreamType;
  /**
   * 设置播放缓冲帧数，当为0时，默认为3帧，hWnd不为空时有效
   */
  public byte byDisplayBufNum;
  /**
   * NPQ是直连模式，还是过流媒体 0-直连 1-过流媒体
   */
  public byte byNPQMode;
  /**
   * 二次认证用户名
   */
  public byte[] sUserName = new byte[NAME_LEN];
  /**
   * 二次认证密码
   */
  public byte[] sPassword = new byte[PASSWD_LEN];
  /**
   * 回放远程文件0-否，1-是
   */
  public byte byRemoteFile;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[203];
  /**
   * 下载时，保存的录像文件路径，byDownload为1时有效，长度超过256将会被截断
   */
  public String pSavedFileName;
}
