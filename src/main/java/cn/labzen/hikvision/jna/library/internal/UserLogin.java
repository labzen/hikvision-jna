package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.definition.NetworkErrorCode;
import cn.labzen.hikvision.jna.struct.NET_DVR_ACTIVATECFG;
import cn.labzen.hikvision.jna.struct.NET_DVR_DEVICEINFO_V40;
import cn.labzen.hikvision.jna.struct.NET_DVR_USER_LOGIN_INFO;
import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;

/**
 * 3 - 用户注册(设备登录)
 * <ul>
 *   <li>{@link #NET_DVR_GetDVRIPByResolveSvr_EX(String, short, String, short, String, short, String, IntByReference)}</li>
 *   <li>{@link #NET_DVR_ActivateDevice(String, short, NET_DVR_ACTIVATECFG)}</li>
 *   <li>{@link #NET_DVR_Login_V40(NET_DVR_USER_LOGIN_INFO, NET_DVR_DEVICEINFO_V40)} </li>
 *   <li>{@link #NET_DVR_Logout(NativeLong)} </li>
 * </ul>
 */
public interface UserLogin {

  /**
   * 3 - [用户注册]： 通过解析服务器，获取设备的动态IP地址和端口号
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param sServerIP        [in] 解析服务器(IPServer或者hiDDNS)的IP地址或者域名
   * @param wServerPort      [in] 解析服务器的端口号。IP Server端口号为7071，hiDDNS服务器的端口号为80
   * @param sDVRName         [in] 设备名称
   * @param wDVRNameLen      [in] 设备名称的长度
   * @param sDVRSerialNumber [in] 设备的序列号
   * @param wDVRSerialLen    [in] 设备序列号的长度
   * @param sGetIP           [out] 获取到的设备IP地址指针
   * @param dwPort           [out] 获取到的设备端口号指针
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetDVRIPByResolveSvr_EX(String sServerIP,
                                          short wServerPort,
                                          String sDVRName,
                                          short wDVRNameLen,
                                          String sDVRSerialNumber,
                                          short wDVRSerialLen,
                                          String sGetIP,
                                          IntByReference dwPort);

  /**
   * 3 - [用户注册]： 激活设备
   * <p/>
   * 出厂设备需要先激活，然后再使用激活使用的初始密码登录设备
   *
   * @param sDVRIP        [in] 设备IP地址
   * @param wDVRPort      [in] 设备端口
   * @param lpActivateCfg [in] 激活参数
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_ActivateDevice(String sDVRIP, short wDVRPort, NET_DVR_ACTIVATECFG lpActivateCfg);

  /**
   * 3 - [用户注册]： 用户注册设备（支持异步登录）。其实就是登录
   * <p/>
   * <ul>
   *   <li>pLoginInfo中bUseAsynLogin为0时登录为同步模式，接口返回成功即表示登录成功；pLoginInfo中bUseAsynLogin为1时登录为异步模式，登录是否成功在输入参数设置的回调函数中返回。 </li>
   *   <li>DS-7116、DS-81xx、DS-90xx、DS-91xx等系列设备允许有32个注册用户名，且同时最多允许128个用户注册；DS-80xx等设备允许有16个注册用户名，且同时最多允许128个用户注册。 </li>
   *   <li>SDK支持2048个注册，返回UserID的取值范围为0~2047</li>
   * </ul>
   *
   * @param pLoginInfo [in] 登录参数，包括设备地址、登录用户、密码等
   * @param lpDevice   [out]设备信息(同步登录即pLoginInfo中bUseAsynLogin为0时有效)，默认实现同步
   * @return 异步登录的状态、用户ID和设备信息通过{@link NET_DVR_USER_LOGIN_INFO}结构体中设置的回调函数(fLoginResultCallBack)返回。
   * 对于同步登录，接口返回-1表示登录失败，其他值表示返回的用户ID值。用户ID具有唯一性，后续对设备的操作都需要通过此ID实现。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  NativeLong NET_DVR_Login_V40(NET_DVR_USER_LOGIN_INFO pLoginInfo, NET_DVR_DEVICEINFO_V40 lpDevice);

  /**
   * 用户注销。其实就是登出
   * <p/>
   * 建议使用此接口实现注销功能
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_COMMANDTIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID [in] 用户ID号，NET_DVR_Login_V40等登录接口的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_Logout(NativeLong lUserID);
}
