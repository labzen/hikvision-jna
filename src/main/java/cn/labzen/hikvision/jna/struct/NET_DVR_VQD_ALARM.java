package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.VqdEventType;
import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * VQD诊断报警结构体
 * <ul>
 *   <li>获取该报警信息，需要调用NET_DVR_SetupAlarmChan_V41进行布防且byRetVQDAlarmType设为1</li>
 *   <li>相对时标暂未使用。从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 *     #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 *     #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 *     #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 *     #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 *     #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 *     #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "struDevInfo",
                       "dwEventType",
                       "fThreshold",
                       "dwPicDataLen",
                       "pImage",
                       "byRes"})
public class NET_DVR_VQD_ALARM extends Structure {

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
   * 事件类型，参考{@link VqdEventType}
   */
  public int dwEventType;
  /**
   * 报警阈值[0.000,1.000]
   */
  public float fThreshold;
  /**
   * 图片长度，为0表示没有图片
   */
  public int dwPicDataLen;
  /**
   * 指向图片的指针
   */
  public ByteByReference pImage;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
