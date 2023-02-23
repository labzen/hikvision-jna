package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.callback.FRemoteConfigCallback;
import cn.labzen.hikvision.jna.definition.*;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

/**
 * 8 - 参数配置
 * <ul>
 *   <li>
 *     <b>通用系统参数配置</b>
 *     <ul>
 *       <li>{@link #NET_DVR_GetDVRConfig(int, int, int, Pointer, int, IntByReference)}</li>
 *       <li>{@link #NET_DVR_SetDVRConfig(int, int, int, Pointer, int)}</li>
 *       <li>{@link #NET_DVR_GetSTDConfig(int, int, Pointer)}</li>
 *       <li>{@link #NET_DVR_SetSTDConfig(int, int, Pointer)}</li>
 *       <li>{@link #NET_DVR_RemoteControl(NativeLong, int, Pointer, int)}</li>
 *       <li>{@link #NET_DVR_StartRemoteConfig(NativeLong, int, Pointer, int, FRemoteConfigCallback, Pointer)}</li>
 *       <li>{@link #NET_DVR_GetNextRemoteConfig(NativeLong, Pointer, int)}</li>
 *       <li>{@link #NET_DVR_StopRemoteConfig(NativeLong)}</li>
 *       <li><s>NET_DVR_STDControl</s></li>
 *     </ul>
 *   </li>
 * </ul>
 */
public interface Configuration {

  /**
   * 8.x - [通用系统参数配置]： 获取设备的配置信息
   * <p/>
   * <font style="color: yellow; font-weight:bold">
   * 本接口在不同设备下、不同功能下通用，具体参数取值请参考海康开发手册，情况太多，命令枚举可能会有不全
   * </font>
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_VERSIONNOMATCH}</li>
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
   *   <li>{@link NetworkErrorCode#NET_DVR_PROGRAM_EXCEPTION}</li>
   * </ul>
   *
   * @param lUserID         [in] NET_DVR_Login_V40等登录接口的返回值
   * @param dwCommand       [in] 设备配置命令，参考{@link DvrConfigurationCommand}
   * @param lChannel        [in] 通道号，不同的命令对应不同的取值，如果该参数无效则置为0xFFFFFFFF即可，
   *                        请参考{@link DvrConfigurationCommand}的具体取值注释
   * @param lpOutBuffer     [out] 接收数据的缓冲指针，对应结构参考{@link DvrConfigurationCommand}取值
   * @param dwOutBufferSize [in] 接收数据的缓冲长度(以字节为单位)，不能为0
   * @param lpBytesReturned [out] 实际收到的数据长度指针，不能为NULL
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetDVRConfig(int lUserID,
                               int dwCommand,
                               int lChannel,
                               Pointer lpOutBuffer,
                               int dwOutBufferSize,
                               IntByReference lpBytesReturned);

  /**
   * 8.x - [通用系统参数配置]： 设置设备的配置信息
   * <p/>
   * <font style="color: yellow; font-weight:bold">
   * 本接口在不同设备下、不同功能下通用，具体参数取值请参考海康开发手册，情况太多，命令枚举可能会有不全
   * </font>
   * <p/>
   * <b>对于网络摄像机，通过命令{@link DvrConfigurationCommand#NET_DVR_SET_TIMECFG}进行校时会禁用设备配置的NTP校时功能，
   * 因此新增{@link DvrConfigurationCommand#NET_DVR_SET_TIMECORRECT}校时命令，只做设备校时操作，不修改NTP等参数。
   * 设备是否支持{@link DvrConfigurationCommand#NET_DVR_SET_TIMECORRECT}校时命令，可以通过能力集进行判断，
   * 对应设备软硬件能力集(BasicCapability)，相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_SOFTHARDWARE_ABILITY，节点：<isSupportTimeCorrect> </b>
   * TODO NET_DVR_GetDeviceAbility
   * <p/>
   * 该接口可能返回的错误值，参考{@link #NET_DVR_GetDVRConfig(int, int, int, Pointer, int, IntByReference)}
   *
   * @param lUserID        [in] NET_DVR_Login_V40等登录接口的返回值
   * @param dwCommand      [in] 设备配置命令，参考{@link DvrConfigurationCommand}
   * @param lChannel       [in] 通道号，不同的命令对应不同的取值，如果该参数无效则置为0xFFFFFFFF即可，
   *                       请参考{@link DvrConfigurationCommand}的具体取值注释
   * @param lpInBuffer     [in] 接收数据的缓冲指针，对应结构参考{@link DvrConfigurationCommand}取值
   * @param dwInBufferSize [in] 输入数据的缓冲长度(以字节为单位)
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetDVRConfig(int lUserID, int dwCommand, int lChannel, Pointer lpInBuffer, int dwInBufferSize);

  /**
   * 8.x - [通用系统参数配置]： 获取设备的配置信息
   * <p/>
   * <font style="color: yellow; font-weight:bold">
   * 本接口在不同设备下、不同功能下通用，具体参数取值请参考海康开发手册，情况太多，命令枚举可能会有不全
   * </font>
   * <p/>
   * 获取配置参数时，lpConfigParam结构体中的lpInBuffer无效，设为NULL
   *
   * @param lUserID       [in] NET_DVR_Login_V40等登录接口的返回值
   * @param dwCommand     [in] 设备配置命令，参考{@link StdConfigurationCommand}
   * @param lpConfigParam [in&out] 配置输入输出参数，不同的配置功能对应不同的输入输出参数，结构体内的
   *                      lpCondBuffer、lpOutBuffer 取决于{@link StdConfigurationCommand}命令取值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetSTDConfig(int lUserID, int dwCommand, Pointer lpConfigParam);

  /**
   * 8.x - [通用系统参数配置]： 设置设备的配置信息
   * <p/>
   * <font style="color: yellow; font-weight:bold">
   * 本接口在不同设备下、不同功能下通用，具体参数取值请参考海康开发手册，情况太多，命令枚举可能会有不全
   * </font>
   * <p/>
   * 设置配置参数时，lpConfigParam结构体里面的lpOutBuffer无效，设为NULL
   *
   * @param lUserID       [in] NET_DVR_Login_V40等登录接口的返回值
   * @param dwCommand     [in] 设备配置命令，参考{@link StdConfigurationCommand}
   * @param lpConfigParam [in&out] 配置输入输出参数，不同的配置功能对应不同的输入输出参数，结构体内的
   *                      lpCondBuffer、lpInBuffer 取决于{@link StdConfigurationCommand}命令取值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetSTDConfig(int lUserID, int dwCommand, Pointer lpConfigParam);

  /**
   * 8.x - [通用系统参数配置]： 远程控制
   *
   * @param lUserID        [in] NET_DVR_Login_V40等登录接口的返回值
   * @param dwCommand      [in] 控制命令，参考{@link RemoteControlCommand}
   * @param lpInBuffer     [in] 输入参数，具体内容跟控制命令相关，对应结构参考{@link RemoteControlCommand}取值
   * @param dwInBufferSize [in] 输入参数长度
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_RemoteControl(NativeLong lUserID, int dwCommand, Pointer lpInBuffer, int dwInBufferSize);

  /**
   * 8.x - [通用系统参数配置]： 启动远程配置
   * <p/>
   * 调用该接口启动长连接远程配置后，还需要调用其他接口获取或者设置相关参数，参考{@link RemoteConfigCommand}，详细查看海康官方文档
   *
   * @param lUserID         [in] NET_DVR_Login_V40等登录接口的返回值
   * @param dwCommand       [in] 配置命令，参考{@link RemoteConfigCommand}，
   *                        不同的功能对应不同的命令号(dwCommand)，lpInBuffer等参数也对应不同的内容
   * @param lpInBuffer      [in] 输入参数，具体内容跟配置命令相关
   * @param dwInBufferLen   [in] 输入缓冲的大小
   * @param cbStateCallback [in] 状态回调函数
   * @param pUserData       [in] 用户数据
   * @return -1表示失败，其他值作为NET_DVR_GetNextRemoteConfig、NET_DVR_SendRemoteConfig等接口的句柄。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_StartRemoteConfig(NativeLong lUserID,
                                       int dwCommand,
                                       Pointer lpInBuffer,
                                       int dwInBufferLen,
                                       FRemoteConfigCallback cbStateCallback,
                                       Pointer pUserData);

  /**
   * 8.x - [通用系统参数配置]： 逐个获取查找到的信息
   * <p/>
   * 在调用该接口获取查找文件之前，必须先调用{@link #NET_DVR_StartRemoteConfig(NativeLong, int, Pointer, int, FRemoteConfigCallback, Pointer)}
   * 得到当前的查找句柄。此接口用于获取一条已查找到的信息，若要获取全部的已查找到的信息，需要循环调用此接口
   *
   * @param lHandle       [in] 查找句柄，NET_DVR_StartRemoteConfig的返回值
   * @param lpOutBuff     [out] 输出数据缓冲区，与{@link #NET_DVR_StartRemoteConfig(NativeLong, int, Pointer, int, FRemoteConfigCallback, Pointer)}
   *                      的参数命令（dwCommand）（参考：{@link RemoteConfigCommand}）有关
   * @param dwOutBuffSize [in] 缓冲区长度
   * @return -1表示失败，其他值表示当前的获取状态等信息，详见下表。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_SDK_GET_NEXT_STATUS_SUCCESS = 1000 // 成功读取到数据，处理完本次数据后需要再次调用NET_DVR_GetNextRemoteConfig获取下一条数据 </li>
   *   <li>NET_SDK_GET_NETX_STATUS_NEED_WAIT = 1001 // 需等待设备发送数据，继续调用NET_DVR_GetNextRemoteConfig </li>
   *   <li>NET_SDK_GET_NEXT_STATUS_FINISH = 1002 // 数据全部取完，可调用NET_DVR_StopRemoteConfig结束长连接 </li>
   *   <li>NET_SDK_GET_NEXT_STATUS_FAILED =  1003 // 出现异常，可调用NET_DVR_StopRemoteConfig结束长连接 </li>
   * </ul>
   */
  NativeLong NET_DVR_GetNextRemoteConfig(NativeLong lHandle, Pointer lpOutBuff, int dwOutBuffSize);

  /**
   * 8.x - [通用系统参数配置]： 关闭长连接配置接口所创建的句柄，释放资源
   *
   * @param lHandle [in] 句柄，NET_DVR_StartRemoteConfig的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopRemoteConfig(NativeLong lHandle);

  // 8.x ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 通用系统参数配置 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_STDControl 接口暂不实现!!!!!!!!
  // 8.x ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 通用系统参数配置 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
}
