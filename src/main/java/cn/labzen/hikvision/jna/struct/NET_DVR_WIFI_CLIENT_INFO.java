package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MACADDR_LEN;

/**
 * WIFI热点下连接的设备信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struAddress",
                       "byMACAddr",
                       "wConnSpeed",
                       "byRSSIValue",
                       "byRes1",
                       "wBandwidth",
                       "byRes"})
public class NET_DVR_WIFI_CLIENT_INFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * IP地址
   */
  public NET_DVR_IPADDR struAddress;
  /**
   * 设备MAC地址
   */
  public byte[] byMACAddr = new byte[MACADDR_LEN];
  /**
   * 连接速度 单位KB
   */
  public short wConnSpeed;
  /**
   * 接收到的信号强度，取值为负值，传输时不带赋值，范围为0~-110dbm,值越大，代表信号越强
   */
  public byte byRSSIValue;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 网络带宽  单位KB
   */
  public short wBandwidth;
  /**
   * 保留
   */
  public byte[] byRes = new byte[32];
}

