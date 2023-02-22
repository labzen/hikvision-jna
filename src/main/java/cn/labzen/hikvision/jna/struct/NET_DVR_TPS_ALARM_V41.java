package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.DEVICE_ID_LEN;
import static cn.labzen.hikvision.jna.Constants.MONITORSITE_ID_LEN;

/**
 * 交通统计上传报警信息
 * <p/>
 * 从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 * #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 * #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 * #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 * #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 * #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 * #define GET_SECOND(_time_)     (((_time_)>>0) & 63)
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "struDevInfo",
                       "struTPSInfo",
                       "byMonitoringSiteID",
                       "byDeviceID",
                       "dwStartTime",
                       "dwStopTime",
                       "byRes"})
public class NET_DVR_TPS_ALARM_V41 extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 交通参数统计信息
   */
  public NET_DVR_TPS_INFO_V41 struTPSInfo;
  /**
   * 监测点编号（路口编号、内部编号）
   */
  public byte[] byMonitoringSiteID = new byte[MONITORSITE_ID_LEN];
  /**
   * 设备编号
   */
  public byte[] byDeviceID = new byte[DEVICE_ID_LEN];
  /**
   * 开始统计时间
   */
  public int dwStartTime;
  /**
   * 结束统计时间
   */
  public int dwStopTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[24];
}
