package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.RecordFileType;
import com.sun.jna.Structure;

/**
 * 文件查找条件结构体
 */
@Structure.FieldOrder({"struStreamID",
                       "struStartTime",
                       "struStopTime",
                       "byFindType",
                       "byDrawFrame",
                       "byQuickSearch",
                       "byStreamType",
                       "dwFileType",
                       "dwVolumeNum",
                       "dwIsLocked",
                       "byNeedCard",
                       "byOnlyAudioFile",
                       "bySpecialFindInfoType",
                       "szCardNum",
                       "szWorkingDeviceGUID",
                       "uSpecialFindInfo",
                       "byAudioFile",
                       "byRes"})
public class NET_DVR_FILECOND_V50 extends Structure {

  /**
   * 流ID或通道号
   */
  public NET_DVR_STREAM_INFO struStreamID;
  /**
   * 开始时间
   */
  public NET_DVR_TIME_SEARCH_COND struStartTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME_SEARCH_COND struStopTime;
  /**
   * 0- 查询普通卷，1- 查询存档卷(适用于CVR设备，普通卷用于通道录像，存档卷用于备份录像)，2- 查询N+1录像文件
   */
  public byte byFindType;
  /**
   * 是否抽帧：0:不抽帧，1：抽帧
   */
  public byte byDrawFrame;
  /**
   * 0- 普通查询，1- 快速（日历）查询，快速查询速度快于普通查询但是相关的录像信息减少（比如没有文件名、文件类型等）
   */
  public byte byQuickSearch;
  /**
   * 0-主码流，1-子码流，2-3码流，0xff-全部
   */
  public byte byStreamType;
  /**
   * 录象文件类型（根据dwUseCardNo参数是否带卡号查找分为两类）
   * <p/>
   * 参考{@link RecordFileType}
   */
  public int dwFileType;
  /**
   * 存档卷号，适用于CVR设备，byFindType为1时有效
   */
  public int dwVolumeNum;
  /**
   * 是否锁定：0-未锁定文件，1-锁定文件，0xff表示所有文件（包括锁定和未锁定）
   */
  public byte dwIsLocked;
  /**
   * 是否需要查询卡，0-不需要 1-需要
   */
  public byte byNeedCard;
  /**
   * 音频文件 0-视频文件 1-音频文件
   */
  public byte byOnlyAudioFile;
  /**
   * 专有查询类型：0-无效，1-带ATM信息的查询
   */
  public byte bySpecialFindInfoType;
  /**
   * 卡号，byNeedCard为1时有效
   */
  public byte[] szCardNum = new byte[32];
  /**
   * 工作机GUID，通过获取N+1得到，byFindType为2时有效
   */
  public byte[] szWorkingDeviceGUID = new byte[16];
  /**
   * 专有查询条件联合体
   */
  public NET_DVR_SPECIAL_FINDINFO_UNION uSpecialFindInfo;
  /**
   * 查找音频文件：0- 不搜索音频文件，1- 搜索音频文件，该功能需要设备支持，启动音频搜索后只搜索音频文件
   */
  public byte byAudioFile;
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];
}
