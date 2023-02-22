package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MACADDR_LEN;

/**
 * 连接设备列表信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byID",
                       "byRes",
                       "byMACAddr",
                       "struDVRIP",
                       "struConnectTime",
                       "byRes1"})
public class NET_DVR_CONNECTDEV_CFG extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 序列号
   */
  public byte byID;
  /**
   * 保留
   */
  public byte[] byRes = new byte[1];
  /**
   * 物理地址
   */
  public byte[] byMACAddr = new byte[MACADDR_LEN];
  /**
   * 设备IP
   */
  public NET_DVR_IPADDR struDVRIP;
  /**
   * 接入时间
   */
  public NET_DVR_TIME struConnectTime;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[256];
}
