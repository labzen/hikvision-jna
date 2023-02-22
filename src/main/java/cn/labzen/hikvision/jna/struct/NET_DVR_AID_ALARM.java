package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 交通事件报警信息结构体
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
                       "struAIDInfo",
                       "dwPicDataLen",
                       "pImage",
                       "byRes"})
public class NET_DVR_AID_ALARM extends Structure {

  /**
   * 结构长度
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
   * 交通事件信息
   */
  public NET_DVR_AID_INFO struAIDInfo;
  /**
   * 返回图片的长度 为0表示没有图片，大于0表示该结构后面紧跟图片数据
   */
  public int dwPicDataLen;
  /**
   * 指向图片的指针
   */
  public ByteByReference pImage;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[40];
}
