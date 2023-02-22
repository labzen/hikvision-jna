package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 雷达报警报警信息结构体
 * <p/>
 * 该报警在三级布防下才会产生，布防等级在布防（NET_DVR_SetupAlarmChan_V41）时选择
 */
@Structure.FieldOrder({"dwSize",
                       "dwRadarTriggerTimeSecond",
                       "dwRadarTriggerTimeMSecond",
                       "dwVedioTriggerTimeSecond",
                       "dwVedioTriggerTimeMSecond",
                       "dwVedioRadarDiffTimeMSecond",
                       "dwRadarSpeed",
                       "byRes"})
public class NET_DVR_ALARM_RADARINFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 雷达触发时间，秒
   */
  public int dwRadarTriggerTimeSecond;
  /**
   * 雷达触发时间，毫秒
   */
  public int dwRadarTriggerTimeMSecond;
  /**
   * 视频触发时间，秒
   */
  public int dwVedioTriggerTimeSecond;
  /**
   * 视频触发时间，毫秒
   */
  public int dwVedioTriggerTimeMSecond;
  /**
   * 雷达视频触发时间差，毫秒
   */
  public int dwVedioRadarDiffTimeMSecond;
  /**
   * 雷达速度
   */
  public int dwRadarSpeed;
  /**
   * 保留
   */
  public byte[] byRes = new byte[16];
}
