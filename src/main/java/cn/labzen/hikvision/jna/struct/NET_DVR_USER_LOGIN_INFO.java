package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.callback.FLoginResultCallBack;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

@Structure.FieldOrder({"sDeviceAddress",
                       "byUseTransport",
                       "wPort",
                       "sUserName",
                       "sPassword",
                       "cbLoginResult",
                       "pUser",
                       "bUseAsynLogin",
                       "byProxyType",
                       "byUseUTCTime",
                       "byLoginMode",
                       "byHttps",
                       "iProxyID",
                       "byVerifyMode",
                       "byRes3"})
public class NET_DVR_USER_LOGIN_INFO extends Structure {

  /**
   * 设备地址，IP 或者普通域名
   */
  public byte[] sDeviceAddress = new byte[NET_DVR_DEV_ADDRESS_MAX_LEN];
  /**
   * 是否启用能力集透传：0- 不启用透传，默认；1- 启用透传
   */
  public byte byUseTransport;
  /**
   * 设备端口号，例如：8000
   */
  public short wPort;
  /**
   * 登录用户名，例如：admin
   */
  public byte[] sUserName = new byte[NET_DVR_LOGIN_USERNAME_MAX_LEN];
  /**
   * 登录密码，例如：12345
   */
  public byte[] sPassword = new byte[NET_DVR_LOGIN_PASSWD_MAX_LEN];
  /**
   * 登录状态回调函数，bUseAsynLogin 为1时有效
   */
  public FLoginResultCallBack cbLoginResult;
  /**
   * 用户数据
   */
  public Pointer pUser;
  /**
   * 是否异步登录：0- 否，1- 是
   */
  public int bUseAsynLogin;
  /**
   * 代理服务器类型：0- 不使用代理，1- 使用标准代理，2- 使用EHome代理
   */
  public byte byProxyType;
  /**
   * 是否使用UTC时间：0- 不进行转换，默认；1- 输入输出UTC时间，SDK进行与设备时区的转换；2- 输入输出平台本地时间，SDK进行与设备时区的转换
   */
  public byte byUseUTCTime;
  /**
   * 登录模式(不同模式具体含义详见“Remarks”说明)：0- SDK私有协议，1- ISAPI协议，2- 自适应（设备支持协议类型未知时使用，一般不建议）
   */
  public byte byLoginMode;
  /**
   * ISAPI协议登录时是否启用HTTPS(byLoginMode为1时有效)：0- 不启用，1- 启用，2- 自适应（设备支持协议类型未知时使用，一般不建议）
   */
  public byte byHttps;
  /**
   * 代理服务器序号，添加代理服务器信息时相对应的服务器数组下表值
   */
  public int iProxyID;
  /**
   * 认证方式，0-不认证，1-双向认证，2-单向认证；认证仅在使用TLS的时候生效
   */
  public byte byVerifyMode;
  /**
   * 保留，置为0
   */
  public byte[] byRes3 = new byte[119];
}
