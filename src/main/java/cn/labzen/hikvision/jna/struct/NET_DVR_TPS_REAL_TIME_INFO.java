package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * TPS实时过车数据信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwChan",
                       "struTime",
                       "struTPSRealTimeInfo",
                       "pAddInfoBuffer",
                       "byAddInfoFlag",
                       "byRes"})
public class NET_DVR_TPS_REAL_TIME_INFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChan;
  /**
   * 检测时间
   */
  public NET_DVR_TIME_V30 struTime;
  /**
   * 交通参数统计信息
   */
  public NET_DVR_TPS_PARAM struTPSRealTimeInfo;
  /**
   * 指向NET_DVR_TPS_ADDINFO结构体
   */
  public ByteByReference pAddInfoBuffer;
  /**
   * 附加信息标识（即是否有NET_DVR_TPS_ADDINFO结构体）,0-无附加信息, 1-有附加信息。
   */
  public byte byAddInfoFlag;
  /**
   * 保留
   */
  public byte[] byRes = new byte[15];
}
