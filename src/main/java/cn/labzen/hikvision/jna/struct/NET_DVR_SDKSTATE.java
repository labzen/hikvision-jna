package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * SDK状态信息结构体
 */
@Structure.FieldOrder({"dwTotalLoginNum",
                       "dwTotalRealPlayNum",
                       "dwTotalPlayBackNum",
                       "dwTotalAlarmChanNum",
                       "dwTotalFormatNum",
                       "dwTotalFileSearchNum",
                       "dwTotalLogSearchNum",
                       "dwTotalSerialNum",
                       "dwTotalUpgradeNum",
                       "dwTotalVoiceComNum",
                       "dwTotalBroadCastNum",
                       "dwTotalListenNum",
                       "dwEmailTestNum",
                       "dwBackupNum",
                       "dwTotalInquestUploadNum",
                       "dwRes"})
public class NET_DVR_SDKSTATE extends Structure {

  /**
   * 当前login用户数
   */
  public int dwTotalLoginNum;
  /**
   * 当前realplay路数
   */
  public int dwTotalRealPlayNum;
  /**
   * 当前回放或下载路数
   */
  public int dwTotalPlayBackNum;
  /**
   * 当前建立报警通道路数
   */
  public int dwTotalAlarmChanNum;
  /**
   * 当前硬盘格式化路数
   */
  public int dwTotalFormatNum;
  /**
   * 当前日志或文件搜索路数
   */
  public int dwTotalFileSearchNum;
  /**
   * 当前日志或文件搜索路数
   */
  public int dwTotalLogSearchNum;
  /**
   * 当前透明通道路数
   */
  public int dwTotalSerialNum;
  /**
   * 当前升级路数
   */
  public int dwTotalUpgradeNum;
  /**
   * 当前语音转发路数
   */
  public int dwTotalVoiceComNum;
  /**
   * 当前语音广播路数
   */
  public int dwTotalBroadCastNum;
  /**
   * 当前网络监听路数
   */
  public int dwTotalListenNum;
  /**
   * 当前邮件计数路数
   */
  public int dwEmailTestNum;
  /**
   * 当前文件备份路数
   */
  public int dwBackupNum;
  /**
   * 当前审讯上传路数
   */
  public int dwTotalInquestUploadNum;
  /**
   * 保留
   */
  public int[] dwRes = new int[6];
}
