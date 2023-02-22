package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * IP地址结构体
 */
@Structure.FieldOrder({"sIpV4",
                       "byIPv6"})
public class NET_DVR_IPADDR extends Structure {

  /**
   * 设备IPv4地址
   */
  public byte[] sIpV4 = new byte[16];
  /**
   * 设备IPv6地址
   */
  public byte[] byIPv6 = new byte[128];

}
