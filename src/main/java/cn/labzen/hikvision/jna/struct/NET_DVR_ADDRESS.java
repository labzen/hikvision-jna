package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * IP地址和端口参数结构体
 */
@Structure.FieldOrder({"struIP",
                       "wPort",
                       "byRes"})
public class NET_DVR_ADDRESS extends Structure {

  /**
   * IP地址
   */
  public NET_DVR_IPADDR struIP;
  /**
   * 端口号
   */
  public short wPort;
  /**
   * 保留
   */
  public byte[] byRes = new byte[2];
}
