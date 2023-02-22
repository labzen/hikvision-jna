package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

@Structure.FieldOrder({"struDeviceV30",
                       "bySupportLock",
                       "byRetryLoginTime",
                       "byPasswordLevel",
                       "byProxyType",
                       "dwSurplusLockTime",
                       "byCharEncodeType",
                       "bySupportDev5",
                       "bySupport",
                       "byLoginMode",
                       "iResidualValidity",
                       "byResidualValidity",
                       "byRes2"})
public class NET_DVR_DEVICEINFO_V40 extends Structure {

  public NET_DVR_DEVICEINFO_V30 struDeviceV30;
  /**
   * 设备支持锁定功能，该字段由SDK根据设备返回值来赋值的。bySupportLock为1时，dwSurplusLockTime和byRetryLoginTime有效
   */
  public byte bySupportLock;
  /**
   * 剩余可尝试登陆的次数，用户名，密码错误时，此参数有效
   */
  public byte byRetryLoginTime;
  /**
   * admin密码安全等级0-无效，1-默认密码，2-有效密码,3-风险较高的密码。当用户的密码为出厂默认密码（12345）或者风险较高的密码时，上层客户端需要提示用户更改密码。
   */
  public byte byPasswordLevel;
  /**
   * 代理类型，0-不使用代理, 1-使用socks5代理, 2-使用EHome代理
   */
  public byte byProxyType;
  /**
   * 剩余时间，单位秒，用户锁定时，此参数有效
   */
  public int dwSurplusLockTime;
  /**
   * 字符编码类型
   */
  public byte byCharEncodeType;
  /**
   * 支持v50版本的设备参数获取，设备名称和设备类型名称长度扩展为64字节
   */
  public byte bySupportDev5;
  /**
   * 能力集扩展，位与结果：0- 不支持，1- 支持
   * <ul>
   * <li>bySupport & 0x1:  保留</li>
   * <li>bySupport & 0x2:  0-不支持变化上报 1-支持变化上报</li>
   * </ul>
   */
  public byte bySupport;
  /**
   * 登录模式 0-Private登录 1-ISAPI登录
   */
  public byte byLoginMode;
  /**
   * 该用户密码剩余有效天数，单位：天，返回负值，表示密码已经超期使用，例如“-3表示密码已经超期使用3天”
   */
  public int iResidualValidity;
  /**
   * iResidualValidity字段是否有效，0-无效，1-有效
   */
  public byte byResidualValidity;
  /**
   * 保留，置为0
   */
  public byte[] byRes2 = new byte[243];
}
