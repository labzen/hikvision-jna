package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 实时上传事件信息结构体
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
                       "struEventInfoList",
                       "byRes2"})
public class NET_DVR_RULE_INFO_ALARM extends Structure {

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
   * 事件信息列表
   */
  public NET_DVR_EVENT_INFO_LIST struEventInfoList;
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[40];
}
