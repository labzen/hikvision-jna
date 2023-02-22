package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 获取当前SDK的功能信息
 */
@Structure.FieldOrder({"dwMaxLoginNum",
                       "dwMaxRealPlayNum",
                       "dwMaxPlayBackNum",
                       "dwMaxAlarmChanNum",
                       "dwMaxFormatNum",
                       "dwMaxFileSearchNum",
                       "dwMaxLogSearchNum",
                       "dwMaxSerialNum",
                       "dwMaxUpgradeNum",
                       "dwMaxVoiceComNum",
                       "dwMaxBroadCastNum",
                       "dwRes"})
public class NET_DVR_SDKABL extends Structure {

  /**
   * 最大login用户数 MAX_LOGIN_USERS
   */
  public int dwMaxLoginNum;
  /**
   * 最大realplay路数 WATCH_NUM
   */
  public int dwMaxRealPlayNum;
  /**
   * 最大回放或下载路数 WATCH_NUM
   */
  public int dwMaxPlayBackNum;
  /**
   * 最大建立报警通道路数 ALARM_NUM
   */
  public int dwMaxAlarmChanNum;
  /**
   * 最大硬盘格式化路数 SERVER_NUM
   */
  public int dwMaxFormatNum;
  /**
   * 最大文件搜索路数 SERVER_NUM
   */
  public int dwMaxFileSearchNum;
  /**
   * 最大日志搜索路数 SERVER_NUM
   */
  public int dwMaxLogSearchNum;
  /**
   * 最大透明通道路数 SERVER_NUM
   */
  public int dwMaxSerialNum;
  /**
   * 最大升级路数 SERVER_NUM
   */
  public int dwMaxUpgradeNum;
  /**
   * 最大语音转发路数 SERVER_NUM
   */
  public int dwMaxVoiceComNum;
  /**
   * 最大语音广播路数 MAX_CASTNUM
   */
  public int dwMaxBroadCastNum;
  /**
   * 保留
   */
  public int[] dwRes = new int[10];
}
