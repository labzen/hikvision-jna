package cn.labzen.hikvision.jna.struct;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

@Structure.FieldOrder({"byUserIDValid",
                       "bySerialValid",
                       "byVersionValid",
                       "byDeviceNameValid",
                       "byMacAddrValid",
                       "byLinkPortValid",
                       "byDeviceIPValid",
                       "bySocketIPValid",
                       "lUserID",
                       "sSerialNumber",
                       "dwDeviceVersion",
                       "sDeviceName",
                       "byMacAddr",
                       "wLinkPort",
                       "sDeviceIP",
                       "sSocketIP",
                       "byIpProtocol",
                       "byRes1",
                       "bJSONBroken",
                       "wSocketPort",
                       "byRes2"})
public class NET_DVR_ALARMER extends Structure {

  /**
   * userid是否有效 0-无效，1-有效
   */
  public byte byUserIDValid;
  /**
   * 序列号是否有效 0-无效，1-有效
   */
  public byte bySerialValid;
  /**
   * 版本号是否有效 0-无效，1-有效
   */
  public byte byVersionValid;
  /**
   * 设备名字是否有效 0-无效，1-有效
   */
  public byte byDeviceNameValid;
  /**
   * MAC地址是否有效 0-无效，1-有效
   */
  public byte byMacAddrValid;
  /**
   * login端口是否有效 0-无效，1-有效
   */
  public byte byLinkPortValid;
  /**
   * 设备IP是否有效 0-无效，1-有效
   */
  public byte byDeviceIPValid;
  /**
   * socket ip是否有效 0-无效，1-有效
   */
  public byte bySocketIPValid;
  /**
   * NET_DVR_Login()返回值, 布防时有效
   */
  public NativeLong lUserID;
  /**
   * 序列号
   */
  public byte[] sSerialNumber = new byte[SERIALNO_LEN];
  /**
   * 版本信息 高16位表示主版本，低16位表示次版本
   */
  public int dwDeviceVersion;
  /**
   * 设备名字
   */
  public byte[] sDeviceName = new byte[NAME_LEN];
  /**
   * MAC地址
   */
  public byte[] byMacAddr = new byte[MACADDR_LEN];
  /**
   * link port
   */
  public short wLinkPort;
  /**
   * IP地址
   */
  public byte[] sDeviceIP = new byte[128];
  /**
   * 报警主动上传时的socket IP地址
   */
  public byte[] sSocketIP = new byte[128];
  /**
   * Ip协议 0-IPV4, 1-IPV6
   */
  public byte byIpProtocol;
  /**
   * 保留，置为0
   */
  public byte[] byRes2 = new byte[11];
}
