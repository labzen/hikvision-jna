package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * RS232串口参数结构体
 */
@Structure.FieldOrder({"struRemoteIP",
                       "struLocalIP",
                       "sLocalIPMask",
                       "sUsername",
                       "sPassword",
                       "byPPPMode",
                       "byRedial",
                       "byRedialMode",
                       "byDataEncrypt",
                       "dwMTU",
                       "sTelephoneNumber"})
public class NET_DVR_PPPCFG_V30 extends Structure {

  /**
   * 远端IP地址
   */
  public NET_DVR_IPADDR struRemoteIP;
  /**
   * 本地IP地址
   */
  public NET_DVR_IPADDR struLocalIP;
  /**
   * 本地IP地址掩码
   */
  public byte[] sLocalIPMask = new byte[16];
  /**
   * 用户名
   */
  public byte[] sUsername = new byte[NAME_LEN];
  /**
   * 密码
   */
  public byte[] sPassword = new byte[PASSWD_LEN];
  /**
   * PPP模式, 0－主动，1－被动
   */
  public byte byPPPMode;
  /**
   * 是否回拨 ：0-否,1-是
   */
  public byte byRedial;
  /**
   * 回拨模式,0-由拨入者指定,1-预置回拨号码
   */
  public byte byRedialMode;
  /**
   * 数据加密,0-否,1-是
   */
  public byte byDataEncrypt;
  /**
   * MTU
   */
  public int dwMTU;
  /**
   * 电话号码
   */
  public byte[] sTelephoneNumber = new byte[PHONENUMBER_LEN];

}
