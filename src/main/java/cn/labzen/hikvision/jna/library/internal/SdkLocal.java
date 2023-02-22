package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.definition.*;
import cn.labzen.hikvision.jna.library.HikvisionOnLinux;
import cn.labzen.hikvision.jna.library.HikvisionOnWindows;
import cn.labzen.hikvision.jna.struct.*;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.NativeLongByReference;

/**
 * 2 - SDK本地功能
 * <ul>
 *   <li>
 *     <b>本地参数配置</b>
 *     <ul>
 *       <li>{@link #NET_DVR_SetSDKLocalCfg(int, Pointer)}</li>
 *       <li>{@link #NET_DVR_GetSDKLocalCfg(int, Pointer)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>连接和接收超时时间及重连设置</b>
 *     <ul>
 *       <li>{@link #NET_DVR_SetConnectTime(int, int)}</li>
 *       <li>{@link #NET_DVR_SetRecvTimeOut(int)}</li>
 *       <li>{@link #NET_DVR_SetReconnect(int, boolean)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>客户端多网卡绑定</b>
 *     <ul>
 *       <li>{@link #NET_DVR_GetLocalIP(byte[], IntByReference, IntByReference)}</li>
 *       <li>{@link #NET_DVR_SetValidIP(long, boolean)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>SDK版本、状态、能力和日志</b>
 *     <ul>
 *       <li>{@link #NET_DVR_GetSDKVersion()}</li>
 *       <li>{@link #NET_DVR_GetSDKBuildVersion()}</li>
 *       <li>{@link #NET_DVR_GetSDKState(NET_DVR_SDKSTATE)}</li>
 *       <li>{@link #NET_DVR_GetSDKAbility(NET_DVR_SDKABL)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>SDK启用写日志</b>
 *     <ul>
 *       <li>{@link #NET_DVR_SetLogToFile(int, String, boolean)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>异常消息回调</b>
 *     <ul>
 *       <li><s>NET_DVR_SetDVRMessage</s></li>
 *       <li>NET_DVR_SetExceptionCallBack_V30 in ({@link HikvisionOnWindows}, {@link HikvisionOnLinux})</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>获取错误信息</b>
 *     <ul>
 *       <li>{@link #NET_DVR_GetLastError()}</li>
 *       <li>{@link #NET_DVR_GetErrorMsg(NativeLongByReference)}</li>
 *     </ul>
 *   </li>
 * </ul>
 */
public interface SdkLocal {

  /**
   * 2.1 - [SDK本地参数配置]： 设置SDK本地参数
   * <p/>
   * <ul>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_TCP_PORT_BIND}，对应结构体：
   * {@link NET_DVR_LOCAL_TCP_PORT_BIND_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_UDP_PORT_BIND}，对应结构体：
   * {@link NET_DVR_LOCAL_UDP_PORT_BIND_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_MEM_POOL}，对应结构体：
   * {@link NET_DVR_LOCAL_MEM_POOL_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_MODULE_RECV_TIMEOUT}，对应结构体：
   * {@link NET_DVR_LOCAL_MODULE_RECV_TIMEOUT_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_ABILITY_PARSE}，对应结构体：
   * {@link NET_DVR_LOCAL_ABILITY_PARSE_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_TALK_MODE}，对应结构体：
   * {@link NET_DVR_LOCAL_TALK_MODE_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_CHECK_DEV}，对应结构体：
   * {@link NET_DVR_LOCAL_CHECK_DEV}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_CHAR_ENCODE}，对应结构体：
   * {@link NET_DVR_LOCAL_BYTE_ENCODE_CONVERT}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_DVR_LOCAL_CFG_TYPE_LOG}，对应结构体：{@link NET_DVR_LOCAL_LOG_CFG}
   * </li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_DVR_LOCAL_CFG_TYPE_GENERAL}，对应结构体：
   * {@link NET_DVR_LOCAL_GENERAL_CFG}</li>
   * </ul>
   *
   * @param enumType [in] 配置类型，不同的取值对应不同的SDK参数
   * @param lpInBuff [in] 输入参数，不同的配置类型，输入参数对应不同的结构
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetSDKLocalCfg(int enumType, Pointer lpInBuff);

  /**
   * 2.1 - [SDK本地参数配置]： 获取SDK本地参数
   * <p/>
   * <ul>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_TCP_PORT_BIND}，对应结构体：
   * {@link NET_DVR_LOCAL_TCP_PORT_BIND_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_UDP_PORT_BIND}，对应结构体：
   * {@link NET_DVR_LOCAL_UDP_PORT_BIND_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_MEM_POOL}，对应结构体：
   * {@link NET_DVR_LOCAL_MEM_POOL_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_MODULE_RECV_TIMEOUT}，对应结构体：
   * {@link NET_DVR_LOCAL_MODULE_RECV_TIMEOUT_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_ABILITY_PARSE}，对应结构体：
   * {@link NET_DVR_LOCAL_ABILITY_PARSE_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_TALK_MODE}，对应结构体：
   * {@link NET_DVR_LOCAL_TALK_MODE_CFG}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_SDK_LOCAL_CFG_TYPE_CHECK_DEV}，对应结构体：
   * {@link NET_DVR_LOCAL_CHECK_DEV}</li>
   * <li>enumType = {@link SdkLocalConfigurationType#NET_DVR_LOCAL_CFG_TYPE_GENERAL}，对应结构体：
   * {@link NET_DVR_LOCAL_GENERAL_CFG}</li>
   * </ul>
   *
   * @param enumType [in] 配置类型，不同的取值对应不同的SDK参数
   * @param lpInBuff [out] 输出参数，不同的配置类型，输出参数对应不同的结构
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetSDKLocalCfg(int enumType, Pointer lpInBuff);

  /**
   * 2.2 - [连接和接收超时时间及重连设置]： 设置网络连接超时时间和连接尝试次数
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   * </ul>
   * <p/>
   * <ul>
   *   <li>对于Windows版本，SDK默认建立连接的超时时间为3000毫秒；对于Linux版本，V5.2.7.2及以上版本，连接超时时间为3500毫秒</li>
   *   <li>SDK4.0及以后版本中当设置的超时时间超过或低于限制的值时接口不返回失败，将取最接近的上下限限制值作为实际的超时时间</li>
   * </ul>
   *
   * @param dwWaitTime [in] 超时时间，单位毫秒，取值范围[300,75000]，实际最大超时时间因系统的 connect 超时时间而不同。
   * @param dwTryTimes [in] 连接尝试次数（保留）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetConnectTime(int dwWaitTime, int dwTryTimes);

  /**
   * 2.2 - [连接和接收超时时间及重连设置]： 设置接收超时时间
   * <p/>
   * <ul>
   *   <li>该接口用于设置接收超时时间，例如预览接收实时流数据、回放下载接收录像数据、报警接收报警信息等接收超时时间</li>
   *   <li>通过{@link #NET_DVR_SetSDKLocalCfg(int, Pointer)}(配置类型：{@link NET_DVR_LOCAL_MODULE_RECV_TIMEOUT_CFG})可以按预览
   *   、报警、回放等模块配置接收超时时间，不同的模块设置不同的时间值</li>
   * </ul>
   *
   * @param nRecvTimeOut [in] 接收超时时间，单位毫秒，默认为 5000，最小为 3000 毫秒
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetRecvTimeOut(int nRecvTimeOut);

  /**
   * 2.2 - [连接和接收超时时间及重连设置]： 设置重连功能
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   * </ul>
   * <p/>
   * 该接口可以同时控制预览、透明通道和布防的重连功能。不调用该接口时，SDK默认启动预览、透明通道和布防的重连功能，重连时间间隔为5秒
   *
   * @param dwInterval   [in] 重连间隔，单位:毫秒
   * @param bEnableRecon [in] 是否重连，0-不重连，1-重连，参数默认为 1
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetReconnect(int dwInterval, boolean bEnableRecon);

  /**
   * 2.3 - [多网卡绑定]： 获取所有IP，用于支持多网卡接口
   * <p/>
   * 该接口获取客户端本地多网卡的所有IP地址，可以通过接口 {@link #NET_DVR_SetValidIP(long, boolean)} 选择要使用的IP地址
   *
   * @param strIP       [out] 存放IP的缓冲区，不能为空，二维数组长度16*16=256
   * @param pValidNum   [out] 所有有效 IP 的数量
   * @param pEnableBind [out] 是否绑定
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetLocalIP(byte[] strIP, IntByReference pValidNum, IntByReference pEnableBind);

  /**
   * 2.3 - [多网卡绑定]： 选择使用哪个IP
   *
   * @param dwIPIndex   [in] 选择使用的IP下标，由NET_DVR_GetLocalIP获取
   * @param bEnableBind [in] 是否绑定
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetValidIP(long dwIPIndex, boolean bEnableBind);

  /**
   * 2.4 - [SDK版本、状态、能力和日志]： 获取SDK的版本信息
   *
   * @return SDK版本信息，2个高字节表示主版本，2个低字节表示次版本。如0x00030000：表示版本为3.0
   */
  int NET_DVR_GetSDKVersion();

  /**
   * 2.4 - [SDK版本、状态、能力和日志]： 获取SDK的版本号和build信息
   *
   * @return SDK的版本号和build信息。2个高字节表示版本号 ：25~32位表示主版本号，17~24位表示次版本号；2个低字节表示build信息。
   * 如0x03000101：表示版本号为3.0，build 号是0101
   */
  int NET_DVR_GetSDKBuildVersion();

  /**
   * 2.4 - [SDK版本、状态、能力和日志]： 获取当前SDK的状态信息
   *
   * @param pSDKState [out] 状态信息结构
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetSDKState(NET_DVR_SDKSTATE pSDKState);

  /**
   * 2.4 - [SDK版本、状态、能力和日志]： 获取当前SDK的功能信息
   *
   * @param pSDKAbl [out] 功能信息结构
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetSDKAbility(NET_DVR_SDKABL pSDKAbl);

  /**
   * 2.5 - [SDK启用写日志]： 启用写日志文件
   * <p/>
   * <ul>
   * <li>日志文件路径必须是绝对路径，且以"\\"结尾，例如"C:\\SdkLog\\"，建议用户先手动创建文件。若未指定文件路径，则采用默认路径"C:\\SdkLog\\"。</li>
   * <li>可多次调用该接口创建新的日志文件，更改目录时到下一次写文件时才会使用新的目录写文件。</li>
   * <li>bAutoDel为TRUE时表示覆盖模式，日志文件个数超过SDK限制个数时将会自动删除超出的文件。SDK限制个数默认为10个，
   * 可以调用接口 {@link #NET_DVR_SetSDKLocalCfg(int, Pointer)} (配置类型：{@link SdkLocalConfigurationType#NET_DVR_LOCAL_CFG_TYPE_LOG})进行修改配置</li>
   * </ul>
   *
   * @param nLogLevel [in] 日志的等级（默认为0）：0-表示关闭日志，1-表示只输出ERROR错误日志，2-输出ERROR错误信息和DEBUG调试信息，3-输出ERROR错误信息、DEBUG调试信息和INFO
   *                  普通信息等所有信息
   * @param strLogDir [in] 日志文件的路径，windows默认值为"C:\\SdkLog\\"；linux默认值"/home/sdklog/"
   * @param bAutoDel  [in] 是否删除超出的文件数，默认值为TRUE
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetLogToFile(int nLogLevel, String strLogDir, boolean bAutoDel);

  // 2.6 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 异常消息回调 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_SetDVRMessage 接口暂不实现!!!!!!!!
  // NET_DVR_SetExceptionCallBack_30 接口查看 HikvisionOnWindows, HikvisionOnLinux
  // 2.6 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 异常消息回调 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

  /**
   * 2.7 - [获取错误信息]： 返回最后操作的错误码
   * <p/>
   * <ul>
   *   <li>RTSP通讯库错误码中410、420、430、440，大多数情况由于网络原因引起</li>
   *   <li>通过{@link #NET_DVR_GetErrorMsg(NativeLongByReference)} 函数还能获取错误号信息</li>
   * </ul>
   *
   * @return 返回值为错误码。错误码主要分为网络通讯库、RTSP通讯库、软硬解库、语音对讲库等错误码。详见错误码宏定义
   * @see NetworkErrorCode
   * @see RtspErrorCode
   * @see DecodingErrorCode
   * @see QosErrorCode
   * @see VoiceIntercomErrorCode
   */
  int NET_DVR_GetLastError();

  /**
   * 2.7 - [获取错误信息]： 返回最后操作的错误码信息
   *
   * @param pErrorNo [out] 错误码数值的指针
   * @return 返回值为错误码信息的指针。错误码主要分为网络通讯库、RTSP通讯库、软硬解库、语音对讲库等错误码
   * @see #NET_DVR_GetLastError()
   */
  String NET_DVR_GetErrorMsg(NativeLongByReference pErrorNo);

}
