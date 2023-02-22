package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 网络通讯库错误码
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum NetworkErrorCode implements HikvisionEnum {

  /**
   * 没有错误
   */
  NET_DVR_NOERROR(0, "没有错误"),
  /**
   * 用户名密码错误。注册时输入的用户名或者密码错误
   */
  NET_DVR_PASSWORD_ERROR(1, "用户名密码错误。注册时输入的用户名或者密码错误"),
  /**
   * 权限不足。一般和通道相关，例如有预览通道1权限，无预览通道2权限，即有预览权限但不完全，预览通道2返回此错误
   */
  NET_DVR_NOENOUGHPRI(2,
      "权限不足。一般和通道相关，例如有预览通道1权限，无预览通道2权限，即有预览权限但不完全，预览通道2返回此错误"),
  /**
   * SDK未初始化
   */
  NET_DVR_NOINIT(3, "SDK未初始化"),
  /**
   * 通道号错误。设备没有对应的通道号
   */
  NET_DVR_CHANNEL_ERROR(4, "通道号错误。设备没有对应的通道号"),
  /**
   * 设备总的连接数超过最大
   */
  NET_DVR_OVER_MAXLINK(5, "设备总的连接数超过最大"),
  /**
   * 版本不匹配。SDK和设备的版本不匹配
   */
  NET_DVR_VERSIONNOMATCH(6, "版本不匹配。SDK和设备的版本不匹配"),
  /**
   * 连接设备失败。设备不在线或网络原因引起的连接超时等
   */
  NET_DVR_NETWORK_FAIL_CONNECT(7, "连接设备失败。设备不在线或网络原因引起的连接超时等"),
  /**
   * 向设备发送失败
   */
  NET_DVR_NETWORK_SEND_ERROR(8, "向设备发送失败"),
  /**
   * 从设备接收数据失败
   */
  NET_DVR_NETWORK_RECV_ERROR(9, "从设备接收数据失败"),
  /**
   * 从设备接收数据超时
   */
  NET_DVR_NETWORK_RECV_TIMEOUT(10, "从设备接收数据超时"),
  /**
   * 传送的数据有误。发送给设备或者从设备接收到的数据错误，如远程参数配置时输入设备不支持的值
   */
  NET_DVR_NETWORK_ERRORDATA(11,
      "传送的数据有误。发送给设备或者从设备接收到的数据错误，如远程参数配置时输入设备不支持的值"),
  /**
   * 调用次序错误
   */
  NET_DVR_ORDER_ERROR(12, "调用次序错误"),
  /**
   * 无此权限。用户对某个功能模块的权限，例如无预览权限用户预览返回此错误
   */
  NET_DVR_OPERNOPERMIT(13, "无此权限。用户对某个功能模块的权限，例如无预览权限用户预览返回此错误"),
  /**
   * 设备命令执行超时
   */
  NET_DVR_COMMANDTIMEOUT(14, "设备命令执行超时"),
  /**
   * 串口号错误。指定的设备串口号不存在
   */
  NET_DVR_ERRORSERIALPORT(15, "串口号错误。指定的设备串口号不存在"),
  /**
   * 报警端口错误。指定的设备报警输入或者输出端口不存在
   */
  NET_DVR_ERRORALARMPORT(16, "报警端口错误。指定的设备报警输入或者输出端口不存在"),
  /**
   * 参数错误。SDK接口中给入的输入或输出参数为空，或者参数格式或值不符合要求
   */
  NET_DVR_PARAMETER_ERROR(17, "参数错误。SDK接口中给入的输入或输出参数为空，或者参数格式或值不符合要求"),
  /**
   * 设备通道处于错误状态
   */
  NET_DVR_CHAN_EXCEPTION(18, "设备通道处于错误状态"),
  /**
   * 设备无硬盘。当设备无硬盘时，对设备的录像文件、硬盘配置等操作失败
   */
  NET_DVR_NODISK(19, "设备无硬盘。当设备无硬盘时，对设备的录像文件、硬盘配置等操作失败"),
  /**
   * 硬盘号错误。当对设备进行硬盘管理操作时，指定的硬盘号不存在时返回该错误
   */
  NET_DVR_ERRORDISKNUM(20, "硬盘号错误。当对设备进行硬盘管理操作时，指定的硬盘号不存在时返回该错误"),
  /**
   * 设备硬盘满
   */
  NET_DVR_DISK_FULL(21, "设备硬盘满"),
  /**
   * 设备硬盘出错
   */
  NET_DVR_DISK_ERROR(22, "设备硬盘出错"),
  /**
   * 设备不支持
   */
  NET_DVR_NOSUPPORT(23, "设备不支持"),
  /**
   * 设备忙
   */
  NET_DVR_BUSY(24, "设备忙"),
  /**
   * 设备修改不成功
   */
  NET_DVR_MODIFY_FAIL(25, "设备修改不成功"),
  /**
   * 密码输入格式不正确
   */
  NET_DVR_PASSWORD_FORMAT_ERROR(26, "密码输入格式不正确"),
  /**
   * 硬盘正在格式化，不能启动操作
   */
  NET_DVR_DISK_FORMATING(27, "硬盘正在格式化，不能启动操作"),
  /**
   * 设备资源不足
   */
  NET_DVR_DVRNORESOURCE(28, "设备资源不足"),
  /**
   * 设备操作失败
   */
  NET_DVR_DVROPRATEFAILED(29, "设备操作失败"),
  /**
   * 语音对讲、语音广播操作中采集本地音频或打开音频输出失败
   */
  NET_DVR_OPENHOSTSOUND_FAIL(30, "语音对讲、语音广播操作中采集本地音频或打开音频输出失败"),
  /**
   * 设备语音对讲被占用
   */
  NET_DVR_DVRVOICEOPENED(31, "设备语音对讲被占用"),
  /**
   * 时间输入不正确
   */
  NET_DVR_TIMEINPUTERROR(32, "时间输入不正确"),
  /**
   * 回放时设备没有指定的文件
   */
  NET_DVR_NOSPECFILE(33, "回放时设备没有指定的文件"),
  /**
   * 创建文件出错。本地录像、保存图片、获取配置文件和远程下载录像时创建文件失败
   */
  NET_DVR_CREATEFILE_ERROR(34, "创建文件出错。本地录像、保存图片、获取配置文件和远程下载录像时创建文件失败"),
  /**
   * 打开文件出错。可能因为文件不存在或者路径错误
   */
  NET_DVR_FILEOPENFAIL(35, "打开文件出错。可能因为文件不存在或者路径错误"),
  /**
   * 上次的操作还没有完成
   */
  NET_DVR_OPERNOTFINISH(36, "上次的操作还没有完成"),
  /**
   * 获取当前播放的时间出错
   */
  NET_DVR_GETPLAYTIMEFAIL(37, "获取当前播放的时间出错"),
  /**
   * 播放出错
   */
  NET_DVR_PLAYFAIL(38, "播放出错"),
  /**
   * 文件格式不正确
   */
  NET_DVR_FILEFORMAT_ERROR(39, "文件格式不正确"),
  /**
   * 路径错误
   */
  NET_DVR_DIR_ERROR(40, "路径错误"),
  /**
   * SDK资源分配错误
   */
  NET_DVR_ALLOC_RESOURCE_ERROR(41, "SDK资源分配错误"),
  /**
   * 声卡模式错误。当前打开声音播放模式与实际设置的模式不符出错
   */
  NET_DVR_AUDIO_MODE_ERROR(42, "声卡模式错误。当前打开声音播放模式与实际设置的模式不符出错"),
  /**
   * 缓冲区太小。接收设备数据的缓冲区或存放图片缓冲区不足
   */
  NET_DVR_NOENOUGH_BUF(43, "缓冲区太小。接收设备数据的缓冲区或存放图片缓冲区不足"),
  /**
   * 创建SOCKET出错
   */
  NET_DVR_CREATESOCKET_ERROR(44, "创建SOCKET出错"),
  /**
   * 设置SOCKET出错
   */
  NET_DVR_SETSOCKET_ERROR(45, "设置SOCKET出错"),
  /**
   * 个数达到最大。分配的注册连接数、预览连接数超过SDK支持的最大数
   */
  NET_DVR_MAX_NUM(46, "个数达到最大。分配的注册连接数、预览连接数超过SDK支持的最大数"),
  /**
   * 用户不存在。注册的用户ID已注销或不可用
   */
  NET_DVR_USERNOTEXIST(47, "用户不存在。注册的用户ID已注销或不可用"),
  /**
   * 写FLASH出错。设备升级时写FLASH失败
   */
  NET_DVR_WRITEFLASHERROR(48, "写FLASH出错。设备升级时写FLASH失败"),
  /**
   * 设备升级失败。网络或升级文件语言不匹配等原因升级失败
   */
  NET_DVR_UPGRADEFAIL(49, "设备升级失败。网络或升级文件语言不匹配等原因升级失败"),
  /**
   * 解码卡已经初始化过
   */
  NET_DVR_CARDHAVEINIT(50, "解码卡已经初始化过"),
  /**
   * 调用播放库中某个函数失败
   */
  NET_DVR_PLAYERFAILED(51, "调用播放库中某个函数失败"),
  /**
   * 登录设备的用户数达到最大
   */
  NET_DVR_MAX_USERNUM(52, "登录设备的用户数达到最大"),
  /**
   * 获得本地PC的IP地址或物理地址失败
   */
  NET_DVR_GETLOCALIPANDMACFAIL(53, "获得本地PC的IP地址或物理地址失败"),
  /**
   * 设备该通道没有启动编码
   */
  NET_DVR_NOENCODEING(54, "设备该通道没有启动编码"),
  /**
   * IP地址不匹配
   */
  NET_DVR_IPMISMATCH(55, "IP地址不匹配"),
  /**
   * MAC地址不匹配
   */
  NET_DVR_MACMISMATCH(56, "MAC地址不匹配"),
  /**
   * 升级文件语言不匹配
   */
  NET_DVR_UPGRADELANGMISMATCH(57, "升级文件语言不匹配"),
  /**
   * 播放器路数达到最大
   */
  NET_DVR_MAX_PLAYERPORT(58, "播放器路数达到最大"),
  /**
   * 备份设备中没有足够空间进行备份
   */
  NET_DVR_NOSPACEBACKUP(59, "备份设备中没有足够空间进行备份"),
  /**
   * 没有找到指定的备份设备
   */
  NET_DVR_NODEVICEBACKUP(60, "没有找到指定的备份设备"),
  /**
   * 图像素位数不符，限24色
   */
  NET_DVR_PICTURE_BITS_ERROR(61, "图像素位数不符，限24色"),
  /**
   * 图片高*宽超限，限128*256
   */
  NET_DVR_PICTURE_DIMENSION_ERROR(62, "图片高*宽超限，限128*256"),
  /**
   * 图片大小超限，限100K
   */
  NET_DVR_PICTURE_SIZ_ERROR(63, "图片大小超限，限100K"),
  /**
   * 载入当前目录下播放库(PlayCtrl.dll、SuperRender.dll、AudioRender.dll)出错
   */
  NET_DVR_LOADPLAYERSDKFAILED(64, "载入当前目录下播放库(PlayCtrl.dll、SuperRender.dll、AudioRender.dll)出错"),
  /**
   * 找不到Player Sdk中某个函数入口
   */
  NET_DVR_LOADPLAYERSDKPROC_ERROR(65, "找不到Player Sdk中某个函数入口"),
  /**
   * 载入当前目录下DSsdk出错
   */
  NET_DVR_LOADDSSDKFAILED(66, "载入当前目录下DSsdk出错"),
  /**
   * 找不到DsSdk中某个函数入口
   */
  NET_DVR_LOADDSSDKPROC_ERROR(67, "找不到DsSdk中某个函数入口"),
  /**
   * 调用硬解码库DsSdk中某个函数失败
   */
  NET_DVR_DSSDK_ERROR(68, "调用硬解码库DsSdk中某个函数失败"),
  /**
   * 声卡被独占
   */
  NET_DVR_VOICEMONOPOLIZE(69, "声卡被独占"),
  /**
   * 加入多播组失败
   */
  NET_DVR_JOINMULTICASTFAILED(70, "加入多播组失败"),
  /**
   * 建立日志文件目录失败
   */
  NET_DVR_CREATEDIR_ERROR(71, "建立日志文件目录失败"),
  /**
   * 绑定套接字失败
   */
  NET_DVR_BINDSOCKET_ERROR(72, "绑定套接字失败"),
  /**
   * socket连接中断，此错误通常是由于连接中断或目的地不可达
   */
  NET_DVR_SOCKETCLOSE_ERROR(73, "socket连接中断，此错误通常是由于连接中断或目的地不可达"),
  /**
   * 注销时用户ID正在进行某操作
   */
  NET_DVR_USERID_ISUSING(74, "注销时用户ID正在进行某操作"),
  /**
   * 监听失败
   */
  NET_DVR_SOCKETLISTEN_ERROR(75, "监听失败"),
  /**
   * 程序异常
   */
  NET_DVR_PROGRAM_EXCEPTION(76, "程序异常"),
  /**
   * 写文件失败。本地录像、远程下载录像、下载图片等操作时写文件失败
   */
  NET_DVR_WRITEFILE_FAILED(77, "写文件失败。本地录像、远程下载录像、下载图片等操作时写文件失败"),
  /**
   * 禁止格式化只读硬盘
   */
  NET_DVR_FORMAT_READONLY(78, "禁止格式化只读硬盘"),
  /**
   * 远程用户配置结构中存在相同的用户名
   */
  NET_DVR_WITHSAMEUSERNAME(79, "远程用户配置结构中存在相同的用户名"),
  /**
   * 导入参数时设备型号不匹配
   */
  NET_DVR_DEVICETYPE_ERROR(80, "导入参数时设备型号不匹配"),
  /**
   * 导入参数时语言不匹配
   */
  NET_DVR_LANGUAGE_ERROR(81, "导入参数时语言不匹配"),
  /**
   * 导入参数时软件版本不匹配
   */
  NET_DVR_PARAVERSION_ERROR(82, "导入参数时软件版本不匹配"),
  /**
   * 预览时外接IP通道不在线
   */
  NET_DVR_IPCHAN_NOTALIVE(83, "预览时外接IP通道不在线"),
  /**
   * 加载标准协议通讯库(StreamTransClient.dll)失败
   */
  NET_DVR_RTSP_SDK_ERROR(84, "加载标准协议通讯库(StreamTransClient.dll)失败"),
  /**
   * 加载转封装库(SystemTransform.dll)失败
   */
  NET_DVR_CONVERT_SDK_ERROR(85, "加载转封装库(SystemTransform.dll)失败"),
  /**
   * 超出最大的IP接入通道数
   */
  NET_DVR_IPC_COUNT_OVERFLOW(86, "超出最大的IP接入通道数"),
  /**
   * 添加录像标签或者其他操作超出最多支持的个数
   */
  NET_DVR_MAX_ADD_NUM(87, "添加录像标签或者其他操作超出最多支持的个数"),
  /**
   * 图像增强仪，参数模式错误（用于硬件设置时，客户端进行软件设置时错误值）
   */
  NET_DVR_PARAMMODE_ERROR(88, "图像增强仪，参数模式错误（用于硬件设置时，客户端进行软件设置时错误值）"),
  /**
   * 码分器不在线
   */
  NET_DVR_CODESPITTER_OFFLINE(89, "码分器不在线"),
  /**
   * 设备正在备份
   */
  NET_DVR_BACKUP_COPYING(90, "设备正在备份"),
  /**
   * 通道不支持该操作
   */
  NET_DVR_CHAN_NOTSUPPORT(91, "通道不支持该操作"),
  /**
   * 高度线位置太集中或长度线不够倾斜
   */
  NET_DVR_CALLINEINVALID(92, "高度线位置太集中或长度线不够倾斜"),
  /**
   * 取消标定冲突，如果设置了规则及全局的实际大小尺寸过滤
   */
  NET_DVR_CALCANCELCONFLICT(93, "取消标定冲突，如果设置了规则及全局的实际大小尺寸过滤"),
  /**
   * 标定点超出范围
   */
  NET_DVR_CALPOINTOUTRANGE(94, "标定点超出范围"),
  /**
   * 尺寸过滤器不符合要求
   */
  NET_DVR_FILTERRECTINVALID(95, "尺寸过滤器不符合要求"),
  /**
   * 设备没有注册到ddns上
   */
  NET_DVR_DDNS_DEVOFFLINE(96, "设备没有注册到ddns上"),
  /**
   * DDNS 服务器内部错误
   */
  NET_DVR_DDNS_INTER_ERROR(97, "DDNS 服务器内部错误"),
  /**
   * 此功能不支持该操作系统
   */
  NET_DVR_FUNCTION_NOT_SUPPORT_OS(98, "此功能不支持该操作系统"),
  /**
   * 解码通道绑定显示输出次数受限
   */
  NET_DVR_DEC_CHAN_REBIND(99, "解码通道绑定显示输出次数受限"),
  /**
   * 加载当前目录下的语音对讲库失败
   */
  NET_DVR_INTERCOM_SDK_ERROR(100, "加载当前目录下的语音对讲库失败"),
  /**
   * 没有正确的升级包
   */
  NET_DVR_NO_CURRENT_UPDATEFILE(101, "没有正确的升级包"),
  /**
   * 用户还没登录成功
   */
  NET_DVR_USER_NOT_SUCC_LOGIN(102, "用户还没登录成功"),
  /**
   * 正在使用日志开关文件
   */
  NET_DVR_USE_LOG_SWITCH_FILE(103, "正在使用日志开关文件"),
  /**
   * 端口池中用于绑定的端口已耗尽
   */
  NET_DVR_POOL_PORT_EXHAUST(104, "端口池中用于绑定的端口已耗尽"),
  /**
   * 码流封装格式错误
   */
  NET_DVR_PACKET_TYPE_NOT_SUPPORT(105, "码流封装格式错误"),
  /**
   * IP接入配置时IPID有误
   */
  NET_DVR_IPPARA_IPID_ERROR(106, "IP接入配置时IPID有误"),
  /**
   * 预览组件加载失败
   */
  NET_DVR_LOAD_HCPREVIEW_SDK_ERROR(107, "预览组件加载失败"),
  /**
   * 语音组件加载失败
   */
  NET_DVR_LOAD_HCVOICETALK_SDK_ERROR(108, "语音组件加载失败"),
  /**
   * 报警组件加载失败
   */
  NET_DVR_LOAD_HCALARM_SDK_ERROR(109, "报警组件加载失败"),
  /**
   * 回放组件加载失败
   */
  NET_DVR_LOAD_HCPLAYBACK_SDK_ERROR(110, "回放组件加载失败"),
  /**
   * 显示组件加载失败
   */
  NET_DVR_LOAD_HCDISPLAY_SDK_ERROR(111, "显示组件加载失败"),
  /**
   * 行业应用组件加载失败
   */
  NET_DVR_LOAD_HCINDUSTRY_SDK_ERROR(112, "行业应用组件加载失败"),
  /**
   * 通用配置管理组件加载失败
   */
  NET_DVR_LOAD_HCGENERALCFGMGR_SDK_ERROR(113, "通用配置管理组件加载失败"),
  /**
   * 设备配置核心组件加载失败
   */
  NET_DVR_LOAD_HCCOREDEVCFG_SDK_ERROR(114, "设备配置核心组件加载失败"),
  /**
   * 单独加载组件时，组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH(121, "单独加载组件时，组件与core版本不匹配"),
  /**
   * 预览组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCPREVIEW(122, "预览组件与core版本不匹配"),
  /**
   * 语音组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCVOICETALK(123, "语音组件与core版本不匹配"),
  /**
   * 报警组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCALARM(124, "报警组件与core版本不匹配"),
  /**
   * 回放组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCPLAYBACK(125, "回放组件与core版本不匹配"),
  /**
   * 显示组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCDISPLAY(126, "显示组件与core版本不匹配"),
  /**
   * 行业应用组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCINDUSTRY(127, "行业应用组件与core版本不匹配"),
  /**
   * 通用配置管理组件与core版本不匹配
   */
  NET_DVR_CORE_VER_MISMATCH_HCGENERALCFGMGR(128, "通用配置管理组件与core版本不匹配"),
  /**
   * 预览组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCPREVIEW(136, "预览组件与HCNetSDK版本不匹配"),
  /**
   * 语音组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCVOICETALK(137, "语音组件与HCNetSDK版本不匹配"),
  /**
   * 报警组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCALARM(138, "报警组件与HCNetSDK版本不匹配"),
  /**
   * 回放组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCPLAYBACK(139, "回放组件与HCNetSDK版本不匹配"),
  /**
   * 显示组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCDISPLAY(140, "显示组件与HCNetSDK版本不匹配"),
  /**
   * 行业应用组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCINDUSTRY(141, "行业应用组件与HCNetSDK版本不匹配"),
  /**
   * 通用配置管理组件与HCNetSDK版本不匹配
   */
  NET_DVR_COM_VER_MISMATCH_HCGENERALCFGMGR(142, "通用配置管理组件与HCNetSDK版本不匹配"),
  /**
   * 别名重复（HiDDNS的配置）
   */
  NET_DVR_ALIAS_DUPLICATE(150, "别名重复（HiDDNS的配置）"),
  /**
   * 用户名不存在（V5.1.7~V5.3.1版本的IPC、IPD的错误码）
   */
  NET_DVR_USERNAME_NOT_EXIST(152, "用户名不存在（V5.1.7~V5.3.1版本的IPC、IPD的错误码）"),
  /**
   * 用户名被锁定
   */
  NET_ERR_USERNAME_LOCKED(153, "用户名被锁定"),
  /**
   * 无效用户ID
   */
  NET_DVR_INVALID_USERID(154, "无效用户ID"),
  /**
   * 登录版本低
   */
  NET_DVR_LOW_LOGIN_VERSION(155, "登录版本低"),
  /**
   * 加载libeay32.dll库失败
   */
  NET_DVR_LOAD_LIBEAY32_DLL_ERROR(156, "加载libeay32.dll库失败"),
  /**
   * 加载ssleay32.dll库失败
   */
  NET_DVR_LOAD_SSLEAY32_DLL_ERROR(157, "加载ssleay32.dll库失败"),
  /**
   * 加载libiconv.dll库失败
   */
  NET_ERR_LOAD_LIBICONV(158, "加载libiconv.dll库失败"),
  /**
   * 连接测试服务器失败
   */
  NET_DVR_TEST_SERVER_FAIL_CONNECT(165, "连接测试服务器失败"),
  /**
   * NAS服务器挂载目录失败，目录无效或者用户名密码错误
   */
  NET_DVR_NAS_SERVER_INVALID_DIR(166, "NAS服务器挂载目录失败，目录无效或者用户名密码错误"),
  /**
   * NAS服务器挂载目录失败，没有权限
   */
  NET_DVR_NAS_SERVER_NOENOUGH_PRI(167, "NAS服务器挂载目录失败，没有权限"),
  /**
   * 服务器使用域名，但是没有配置DNS，可能造成域名无效
   */
  NET_DVR_EMAIL_SERVER_NOT_CONFIG_DNS(168, "服务器使用域名，但是没有配置DNS，可能造成域名无效"),
  /**
   * 没有配置网关，可能造成发送邮件失败
   */
  NET_DVR_EMAIL_SERVER_NOT_CONFIG_GATEWAY(169, "没有配置网关，可能造成发送邮件失败"),
  /**
   * 用户名密码不正确，测试服务器的用户名或密码错误
   */
  NET_DVR_TEST_SERVER_PASSWORD_ERROR(170, "用户名密码不正确，测试服务器的用户名或密码错误"),
  /**
   * 设备和smtp服务器交互异常
   */
  NET_DVR_EMAIL_SERVER_CONNECT_EXCEPTION_WITH_SMTP(171, "设备和smtp服务器交互异常"),
  /**
   * FTP服务器创建目录失败
   */
  NET_DVR_FTP_SERVER_FAIL_CREATE_DIR(172, "FTP服务器创建目录失败"),
  /**
   * FTP服务器没有写入权限
   */
  NET_DVR_FTP_SERVER_NO_WRITE_PIR(173, "FTP服务器没有写入权限"),
  /**
   * IP冲突
   */
  NET_DVR_IP_CONFLICT(174, "IP冲突"),
  /**
   * 存储池空间已满
   */
  NET_DVR_INSUFFICIENT_STORAGEPOOL_SPACE(175, "存储池空间已满"),
  /**
   * 云服务器存储池无效，没有配置存储池或者存储池ID错误
   */
  NET_DVR_STORAGEPOOL_INVALID(176, "云服务器存储池无效，没有配置存储池或者存储池ID错误"),
  /**
   * 生效需要重启
   */
  NET_DVR_EFFECTIVENESS_REBOOT(177, "生效需要重启"),
  /**
   * 断网续传布防连接已经存在（私有SDK协议布防连接已经建立的情况下，重复布防且选择断网续传功能时返回该错误）
   */
  NET_ERR_ANR_ARMING_EXIST(178,
      "断网续传布防连接已经存在（私有SDK协议布防连接已经建立的情况下，重复布防且选择断网续传功能时返回该错误）"),
  /**
   * 断网续传上传连接已经存在（EHOME协议和私有SDK协议不能同时支持断网续传，其中一种协议已经建议连接，另外一个连接建立时返回该错误）
   */
  NET_ERR_UPLOADLINK_EXIST(179,
      "断网续传上传连接已经存在（EHOME协议和私有SDK协议不能同时支持断网续传，其中一种协议已经建议连接，另外一个连接建立时返回该错误）"),
  /**
   * 导入文件格式不正确
   */
  NET_ERR_INCORRECT_FILE_FORMAT(180, "导入文件格式不正确"),
  /**
   * 导入文件内容不正确
   */
  NET_ERR_INCORRECT_FILE_CONTENT(181, "导入文件内容不正确"),
  /**
   * HRUDP连接数超过设备限制
   */
  NET_ERR_MAX_HRUDP_LINK(182, "HRUDP连接数超过设备限制"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 阵列错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 名称已存在
   */
  NET_DVR_NAME_NOT_ONLY(200, "名称已存在"),
  /**
   * 阵列达到上限
   */
  NET_DVR_OVER_MAX_ARRAY(201, "阵列达到上限"),
  /**
   * 虚拟磁盘达到上限
   */
  NET_DVR_OVER_MAX_VD(202, "虚拟磁盘达到上限"),
  /**
   * 虚拟磁盘槽位已满
   */
  NET_DVR_VD_SLOT_EXCEED(203, "虚拟磁盘槽位已满"),
  /**
   * 重建阵列所需物理磁盘状态错误
   */
  NET_DVR_PD_STATUS_INVALID(204, "重建阵列所需物理磁盘状态错误"),
  /**
   * 重建阵列所需物理磁盘为指定热备
   */
  NET_DVR_PD_BE_DEDICATE_SPARE(205, "重建阵列所需物理磁盘为指定热备"),
  /**
   * 重建阵列所需物理磁盘非空闲
   */
  NET_DVR_PD_NOT_FREE(206, "重建阵列所需物理磁盘非空闲"),
  /**
   * 不能从当前的阵列类型迁移到新的阵列类型
   */
  NET_DVR_CANNOT_MIG2NEWMODE(207, "不能从当前的阵列类型迁移到新的阵列类型"),
  /**
   * 迁移操作已暂停
   */
  NET_DVR_MIG_PAUSE(208, "迁移操作已暂停"),
  /**
   * 正在执行的迁移操作已取消
   */
  NET_DVR_MIG_CANCEL(209, "正在执行的迁移操作已取消"),
  /**
   * 阵列上存在虚拟磁盘，无法删除阵列
   */
  NET_DVR_EXIST_VD(210, "阵列上存在虚拟磁盘，无法删除阵列"),
  /**
   * 对象物理磁盘为虚拟磁盘组成部分且工作正常
   */
  NET_DVR_TARGET_IN_LD_FUNCTIONAL(211, "对象物理磁盘为虚拟磁盘组成部分且工作正常"),
  /**
   * 指定的物理磁盘被分配为虚拟磁盘
   */
  NET_DVR_HD_IS_ASSIGNED_ALREADY(212, "指定的物理磁盘被分配为虚拟磁盘"),
  /**
   * 物理磁盘数量与指定的RAID等级不匹配
   */
  NET_DVR_INVALID_HD_COUNT(213, "物理磁盘数量与指定的RAID等级不匹配"),
  /**
   * 阵列正常，无法重建
   */
  NET_DVR_LD_IS_FUNCTIONAL(214, "阵列正常，无法重建"),
  /**
   * 存在正在执行的后台任务
   */
  NET_DVR_BGA_RUNNING(215, "存在正在执行的后台任务"),
  /**
   * 无法用ATAPI盘创建虚拟磁盘
   */
  NET_DVR_LD_NO_ATAPI(216, "无法用ATAPI盘创建虚拟磁盘"),
  /**
   * 阵列无需迁移
   */
  NET_DVR_MIGRATION_NOT_NEED(217, "阵列无需迁移"),
  /**
   * 物理磁盘不属于同意类型
   */
  NET_DVR_HD_TYPE_MISMATCH(218, "物理磁盘不属于同意类型"),
  /**
   * 无虚拟磁盘，无法进行此项操作
   */
  NET_DVR_NO_LD_IN_DG(219, "无虚拟磁盘，无法进行此项操作"),
  /**
   * 磁盘空间过小，无法被指定为热备盘
   */
  NET_DVR_NO_ROOM_FOR_SPARE(220, "磁盘空间过小，无法被指定为热备盘"),
  /**
   * 磁盘已被分配为某阵列热备盘
   */
  NET_DVR_SPARE_IS_IN_MULTI_DG(221, "磁盘已被分配为某阵列热备盘"),
  /**
   * 阵列缺少盘
   */
  NET_DVR_DG_HAS_MISSING_PD(222, "阵列缺少盘"),
  /**
   * 名称为空
   */
  NET_DVR_NAME_EMPTY(223, "名称为空"),
  /**
   * 输入参数有误
   */
  NET_DVR_INPUT_PARAM(224, "输入参数有误"),
  /**
   * 物理磁盘不可用
   */
  NET_DVR_PD_NOT_AVAILABLE(225, "物理磁盘不可用"),
  /**
   * 阵列不可用
   */
  NET_DVR_ARRAY_NOT_AVAILABLE(226, "阵列不可用"),
  /**
   * 物理磁盘数不正确
   */
  NET_DVR_PD_COUNT(227, "物理磁盘数不正确"),
  /**
   * 虚拟磁盘太小
   */
  NET_DVR_VD_SMALL(228, "虚拟磁盘太小"),
  /**
   * 不存在
   */
  NET_DVR_NO_EXIST(229, "不存在"),
  /**
   * 不支持该操作
   */
  NET_DVR_NOT_SUPPORT(230, "不支持该操作"),
  /**
   * 阵列状态不是正常状态
   */
  NET_DVR_NOT_FUNCTIONAL(231, "阵列状态不是正常状态"),
  /**
   * 虚拟磁盘设备节点不存在
   */
  NET_DVR_DEV_NODE_NOT_FOUND(232, "虚拟磁盘设备节点不存在"),
  /**
   * 槽位达到上限
   */
  NET_DVR_SLOT_EXCEED(233, "槽位达到上限"),
  /**
   * 阵列上不存在虚拟磁盘
   */
  NET_DVR_NO_VD_IN_ARRAY(234, "阵列上不存在虚拟磁盘"),
  /**
   * 虚拟磁盘槽位无效
   */
  NET_DVR_VD_SLOT_INVALID(235, "虚拟磁盘槽位无效"),
  /**
   * 所需物理磁盘空间不足
   */
  NET_DVR_PD_NO_ENOUGH_SPACE(236, "所需物理磁盘空间不足"),
  /**
   * 只有处于正常状态的阵列才能进行迁移
   */
  NET_DVR_ARRAY_NONFUNCTION(237, "只有处于正常状态的阵列才能进行迁移"),
  /**
   * 阵列空间不足
   */
  NET_DVR_ARRAY_NO_ENOUGH_SPACE(238, "阵列空间不足"),
  /**
   * 正在执行安全拔盘或重新扫描
   */
  NET_DVR_STOPPING_SCANNING_ARRAY(239, "正在执行安全拔盘或重新扫描"),
  /**
   * 不支持创建大于16T的阵列
   */
  NET_DVR_NOT_SUPPORT_16T(240, "不支持创建大于16T的阵列"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 安全激活相关错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 设备未激活（设备未激活时，登录失败，返回错误码）
   */
  NET_DVR_ERROR_DEVICE_NOT_ACTIVATED(250, "设备未激活（设备未激活时，登录失败，返回错误码）"),
  /**
   * 有风险的密码（设置用户密码或者激活的时候为风险密码）
   */
  NET_DVR_ERROR_RISK_PASSWORD(251, "有风险的密码（设置用户密码或者激活的时候为风险密码）"),
  /**
   * 设备已激活（已激活的设备，再次激活时返回错误）
   */
  NET_DVR_ERROR_DEVICE_HAS_ACTIVATED(252, "设备已激活（已激活的设备，再次激活时返回错误）"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 智能设备错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 配置ID不合理
   */
  NET_DVR_ID_ERROR(300, "配置ID不合理"),
  /**
   * 多边形不符合要求
   */
  NET_DVR_POLYGON_ERROR(301, "多边形不符合要求"),
  /**
   * 规则参数不合理
   */
  NET_DVR_RULE_PARAM_ERROR(302, "规则参数不合理"),
  /**
   * 配置信息冲突
   */
  NET_DVR_RULE_CFG_CONFLICT(303, "配置信息冲突"),
  /**
   * 当前没有标定信息
   */
  NET_DVR_CALIBRATE_NOT_READY(304, "当前没有标定信息"),
  /**
   * 摄像机参数不合理
   */
  NET_DVR_CAMERA_DATA_ERROR(305, "摄像机参数不合理"),
  /**
   * 长度不够倾斜，不利于标定
   */
  NET_DVR_CALIBRATE_DATA_UNFIT(306, "长度不够倾斜，不利于标定"),
  /**
   * 标定出错，以为所有点共线或者位置太集中
   */
  NET_DVR_CALIBRATE_DATA_CONFILICT(307, "标定出错，以为所有点共线或者位置太集中"),
  /**
   * 摄像机标定参数值计算失败
   */
  NET_DVR_CALIBRATE_CALC_FAIL(308, "摄像机标定参数值计算失败"),
  /**
   * 输入的样本标定线超出了样本外接矩形框
   */
  NET_DVR_CALIBRATE_LINE_OUT_RECT(309, "输入的样本标定线超出了样本外接矩形框"),
  /**
   * 没有设置进入区域
   */
  NET_DVR_ENTER_RULE_NOT_READY(310, "没有设置进入区域"),
  /**
   * 交通事件规则中没有包括车道（特值拥堵和逆行）
   */
  NET_DVR_AID_RULE_NO_INCLUDE_LANE(311, "交通事件规则中没有包括车道（特值拥堵和逆行）"),
  /**
   * 当前没有设置车道
   */
  NET_DVR_LANE_NOT_READY(312, "当前没有设置车道"),
  /**
   * 事件规则中包含2种不同方向
   */
  NET_DVR_RULE_INCLUDE_TWO_WAY(313, "事件规则中包含2种不同方向"),
  /**
   * 车道和数据规则冲突
   */
  NET_DVR_LANE_TPS_RULE_CONFLICT(314, "车道和数据规则冲突"),
  /**
   * 不支持的事件类型
   */
  NET_DVR_NOT_SUPPORT_EVENT_TYPE(315, "不支持的事件类型"),
  /**
   * 车道没有方向
   */
  NET_DVR_LANE_NO_WAY(316, "车道没有方向"),
  /**
   * 尺寸过滤框不合理
   */
  NET_DVR_SIZE_FILTER_ERROR(317, "尺寸过滤框不合理"),
  /**
   * 特征点定位时输入的图像没有人脸
   */
  NET_DVR_LIB_FFL_NO_FACE(318, "特征点定位时输入的图像没有人脸"),
  /**
   * 特征点定位时输入的图像太小
   */
  NET_DVR_LIB_FFL_IMG_TOO_SMALL(319, "特征点定位时输入的图像太小"),
  /**
   * 单张图像人脸检测时输入的图像没有人脸
   */
  NET_DVR_LIB_FD_IMG_NO_FACE(320, "单张图像人脸检测时输入的图像没有人脸"),
  /**
   * 建模时人脸太小
   */
  NET_DVR_LIB_FACE_TOO_SMALL(321, "建模时人脸太小"),
  /**
   * 建模时人脸图像质量太差
   */
  NET_DVR_LIB_FACE_QUALITY_TOO_BAD(322, "建模时人脸图像质量太差"),
  /**
   * 高级参数设置错误
   */
  NET_DVR_KEY_PARAM_ERR(323, "高级参数设置错误"),
  /**
   * 标定样本数目错误，或数据值错误，或样本点超出地平线
   */
  NET_DVR_CALIBRATE_DATA_ERR(324, "标定样本数目错误，或数据值错误，或样本点超出地平线"),
  /**
   * 所配置规则不允许取消标定
   */
  NET_DVR_CALIBRATE_DISABLE_FAIL(325, "所配置规则不允许取消标定"),
  /**
   * 最大过滤框的宽高最小值超过最小过滤框的宽高最大值两倍以上
   */
  NET_DVR_VCA_LIB_FD_SCALE_OUTRANGE(326, "最大过滤框的宽高最小值超过最小过滤框的宽高最大值两倍以上"),
  /**
   * 当前检测区域范围过大。检测区最大为图像的2/3
   */
  NET_DVR_LIB_FD_REGION_TOO_LARGE(327, "当前检测区域范围过大。检测区最大为图像的2/3"),
  /**
   * 试用版评估期已结束
   */
  NET_DVR_TRIAL_OVERDUE(328, "试用版评估期已结束"),
  /**
   * 设备类型与配置文件冲突（加密狗类型与现有分析仪配置不符错误码提示）
   */
  NET_DVR_CONFIG_FILE_CONFLICT(329, "设备类型与配置文件冲突（加密狗类型与现有分析仪配置不符错误码提示）"),
  /**
   * 人脸特征点定位失败
   */
  NET_DVR_FR_FPL_FAIL(330, "人脸特征点定位失败"),
  /**
   * 人脸评分失败
   */
  NET_DVR_FR_IQA_FAIL(331, "人脸评分失败"),
  /**
   * 人脸特征提取失败
   */
  NET_DVR_FR_FEM_FAIL(332, "人脸特征提取失败"),
  /**
   * 特征点定位时人脸检测置信度过低
   */
  NET_DVR_FPL_DT_CONF_TOO_LOW(333, "特征点定位时人脸检测置信度过低"),
  /**
   * 特征点定位置信度过低
   */
  NET_DVR_FPL_CONF_TOO_LOW(334, "特征点定位置信度过低"),
  /**
   * 数据长度不匹配
   */
  NET_DVR_E_DATA_SIZE(335, "数据长度不匹配"),
  /**
   * 人脸模型数据中的模型版本错误
   */
  NET_DVR_FR_MODEL_VERSION_ERR(336, "人脸模型数据中的模型版本错误"),
  /**
   * 识别库中人脸检测失败
   */
  NET_DVR_FR_FD_FAIL(337, "识别库中人脸检测失败"),
  /**
   * 人脸归一化出错
   */
  NET_DVR_FA_NORMALIZE_ERR(338, "人脸归一化出错"),
  /**
   * 加密狗与前端取流设备类型不匹配
   */
  NET_DVR_DOG_PUSTREAM_NOT_MATCH(339, "加密狗与前端取流设备类型不匹配"),
  /**
   * 前端取流设备版本不匹配
   */
  NET_DVR_DEV_PUSTREAM_NOT_MATCH(340, "前端取流设备版本不匹配"),
  /**
   * 设备的其他通道已经添加过该前端设备
   */
  NET_DVR_PUSTREAM_ALREADY_EXISTS(341, "设备的其他通道已经添加过该前端设备"),
  /**
   * 连接检索服务器失败
   */
  NET_DVR_SEARCH_CONNECT_FAILED(342, "连接检索服务器失败"),
  /**
   * 可存储的硬盘空间不足
   */
  NET_DVR_INSUFFICIENT_DISK_SPACE(343, "可存储的硬盘空间不足"),
  /**
   * 数据库连接失败
   */
  NET_DVR_DATABASE_CONNECTION_FAILED(344, "数据库连接失败"),
  /**
   * 数据库用户名、密码错误
   */
  NET_DVR_DATABASE_ADM_PW_ERROR(345, "数据库用户名、密码错误"),
  /**
   * 解码失败
   */
  NET_DVR_DECODE_YUV(346, "解码失败"),
  /**
   * 图片分辨率不合理
   */
  NET_DVR_IMAGE_RESOLUTION_ERROR(347, "图片分辨率不合理"),
  /**
   * 通道工作模式错误
   */
  NET_DVR_CHAN_WORKMODE_ERROR(348, "通道工作模式错误"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 其他错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 场景正在使用
   */
  NET_ERROR_SCENE_USING(717, "场景正在使用"),
  /**
   * 终端忙，终端处于会议中
   */
  NET_ERR_TERMINAL_BUSY(780, "终端忙，终端处于会议中"),
  /**
   * 设备其它功能占用资源，导致该功能无法开启
   */
  NET_DVR_FUNCTION_RESOURCE_USAGE_ERROR(791, "设备其它功能占用资源，导致该功能无法开启"),
  /**
   * 网络流量超过设备能力上限
   */
  NET_DVR_DEV_NET_OVERFLOW(800, "网络流量超过设备能力上限"),
  /**
   * 录像文件在录像，无法被锁定
   */
  NET_DVR_STATUS_RECORDFILE_WRITING_NOT_LOCK(801, "录像文件在录像，无法被锁定"),
  /**
   * 由于硬盘太小无法格式化
   */
  NET_DVR_STATUS_CANT_FORMAT_LITTLE_DISK(802, "由于硬盘太小无法格式化"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ N+1 功能错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 远端无法连接
   */
  NET_SDK_ERR_REMOTE_DISCONNEC(803, "远端无法连接"),
  /**
   * 备机不能添加备机
   */
  NET_SDK_ERR_RD_ADD_RD(804, "备机不能添加备机"),
  /**
   * 备份盘异常
   */
  NET_SDK_ERR_BACKUP_DISK_EXCEPT(805, "备份盘异常"),
  /**
   * 备机数已达上限
   */
  NET_SDK_ERR_RD_LIMIT(806, "备机数已达上限"),
  /**
   * 添加的备机是工作机
   */
  NET_SDK_ERR_ADDED_RD_IS_WD(807, "添加的备机是工作机"),
  /**
   * 添加顺序出错，比如没有被工作机添加为备机，就添加工作机
   */
  NET_SDK_ERR_ADD_ORDER_WRONG(808, "添加顺序出错，比如没有被工作机添加为备机，就添加工作机"),
  /**
   * 工作机不能添加工作机
   */
  NET_SDK_ERR_WD_ADD_WD(809, "工作机不能添加工作机"),
  /**
   * CVR服务异常(N+1模式下表示CVR工作机服务异常)
   */
  NET_SDK_ERR_WD_SERVICE_EXCETP(810, "CVR服务异常(N+1模式下表示CVR工作机服务异常)"),
  /**
   * 备机CVR服务异常
   */
  NET_SDK_ERR_RD_SERVICE_EXCETP(811, "备机CVR服务异常"),
  /**
   * 添加的工作机是备机
   */
  NET_SDK_ERR_ADDED_WD_IS_RD(812, "添加的工作机是备机"),
  /**
   * 性能达到上限
   */
  NET_SDK_ERR_PERFORMANCE_LIMIT(813, "性能达到上限"),
  /**
   * 添加的设备已经存在
   */
  NET_SDK_ERR_ADDED_DEVICE_EXIST(814, "添加的设备已经存在"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 审讯机错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 审讯恢复中
   */
  NET_SDK_ERR_INQUEST_RESUMING(815, "审讯恢复中"),
  /**
   * 审讯备份中
   */
  NET_SDK_ERR_RECORD_BACKUPING(816, "审讯备份中"),
  /**
   * 光盘回放中
   */
  NET_SDK_ERR_DISK_PLAYING(817, "光盘回放中"),
  /**
   * 审讯已开启
   */
  NET_SDK_ERR_INQUEST_STARTED(818, "审讯已开启"),
  /**
   * 本地操作进行中
   */
  NET_SDK_ERR_LOCAL_OPERATING(819, "本地操作进行中"),
  /**
   * 审讯未开启
   */
  NET_SDK_ERR_INQUEST_NOT_START(820, "审讯未开启"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 其他错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 通道未绑定或绑定语音对讲失败
   */
  NET_SDK_ERR_CHAN_AUDIO_BIND(821, "通道未绑定或绑定语音对讲失败"),
  /**
   * 设备当前处于N+1模式，不支持设置云存储
   */
  NET_DVR_N_PLUS_ONE_MODE(822, "设备当前处于N+1模式，不支持设置云存储"),
  /**
   * 云存储模式已开启
   */
  NET_DVR_CLOUD_STORAGE_OPENED(823, "云存储模式已开启"),
  /**
   * 设备处于N+0被接管状态，不允许该操作
   */
  NET_DVR_ERR_OPER_NOT_ALLOWED(824, "设备处于N+0被接管状态，不允许该操作"),
  /**
   * 设备处于N+0被接管状态，需要获取重定向信息，再重新操作
   */
  NET_DVR_ERR_NEED_RELOCATE(825, "设备处于N+0被接管状态，需要获取重定向信息，再重新操作"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 庭审主机错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 红外输出口错误
   */
  NET_SDK_ERR_IR_PORT_ERROR(830, "红外输出口错误"),
  /**
   * 红外输出口的命令号错误
   */
  NET_SDK_ERR_IR_CMD_ERROR(831, "红外输出口的命令号错误"),
  /**
   * 设备处于非审讯状态
   */
  NET_SDK_ERR_NOT_INQUESTING(832, "设备处于非审讯状态"),
  /**
   * 设备处于非暂停状态
   */
  NET_SDK_ERR_INQUEST_NOT_PAUSED(833, "设备处于非暂停状态"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 其他错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 校验密码错误
   */
  NET_DVR_CHECK_PASSWORD_MISTAKE_ERROR(834, "校验密码错误"),
  /**
   * 校验密码不能为空
   */
  NET_DVR_CHECK_PASSWORD_NULL_ERROR(835, "校验密码不能为空"),
  /**
   * 当前无法标定
   */
  NET_DVR_UNABLE_CALIB_ERROR(836, "当前无法标定"),
  /**
   * 请先完成标定
   */
  NET_DVR_PLEASE_CALIB_ERROR(837, "请先完成标定"),
  /**
   * Flash中全景标定为空
   */
  NET_DVR_ERR_PANORAMIC_CAL_EMPTY(838, "Flash中全景标定为空"),
  /**
   * 标定失败，请重新标定
   */
  NET_DVR_ERR_CALIB_FAIL_PLEASEAGAIN(839, "标定失败，请重新标定"),
  /**
   * 规则线配置错误，请重新配置规则线，确保规则线位于红色区域内
   */
  NET_DVR_ERR_DETECTION_LINE(840, "规则线配置错误，请重新配置规则线，确保规则线位于红色区域内"),
  /**
   * 超过人脸图片最大张数
   */
  NET_DVR_EXCEED_FACE_IMAGES_ERROR(843, "超过人脸图片最大张数"),
  /**
   * 图片数据识别失败
   */
  NET_DVR_ANALYSIS_FACE_IMAGES_ERROR(844, "图片数据识别失败"),
  /**
   * A<-1报警号已用于触发车辆抓拍
   */
  NET_ERR_ALARM_INPUT_OCCUPIED(845, "A<-1报警号已用于触发车辆抓拍"),
  /**
   * 人脸库中数据库版本不匹配
   */
  NET_DVR_FACELIB_DATABASE_ERROR(846, "人脸库中数据库版本不匹配"),
  /**
   * 人脸库数据错误
   */
  NET_DVR_FACELIB_DATA_ERROR(847, "人脸库数据错误"),
  /**
   * 人脸数据PID无效
   */
  NET_DVR_FACE_DATA_ID_ERROR(848, "人脸数据PID无效"),
  /**
   * 人脸库ID无效
   */
  NET_DVR_FACELIB_ID_ERROR(849, "人脸库ID无效"),
  /**
   * 超过人脸库最大个数
   */
  NET_DVR_EXCEED_FACE_LIBARY_ERROR(850, "超过人脸库最大个数"),
  /**
   * 图片未识别到目标
   */
  NET_DVR_PIC_ANALYSIS_NO_TARGET_ERROR(851, "图片未识别到目标"),
  /**
   * 子图建模失败
   */
  NET_DVR_SUBPIC_ANALYSIS_MODELING_ERROR(852, "子图建模失败"),
  /**
   * 无对应智能分析引擎支持图片二次识别
   */
  NET_DVR_PIC_ANALYSIS_NO_RESOURCE_ERROR(853, "无对应智能分析引擎支持图片二次识别"),
  /**
   * 无分析引擎资源
   */
  NET_DVR_ANALYSIS_ENGINES_NO_RESOURCE_ERROR(854, "无分析引擎资源"),
  /**
   * 引擎使用率超负荷，已达100%
   */
  NET_DVR_ANALYSIS_ENGINES_USAGE_EXCEED_ERROR(855, "引擎使用率超负荷，已达100%"),
  /**
   * 超过开启人体去误报最大通道个数
   */
  NET_DVR_EXCEED_HUMANMISINFO_FILTER_ENABLED_ERROR(856, "超过开启人体去误报最大通道个数"),
  /**
   * 名称错误
   */
  NET_DVR_NAME_ERROR(857, "名称错误"),
  /**
   * 名称已存在
   */
  NET_DVR_NAME_EXIST_ERROR(858, "名称已存在"),
  /**
   * 人脸库导入图片中
   */
  NET_DVR_FACELIB_PIC_IMPORTING_ERROR(859, "人脸库导入图片中"),
  /**
   * 图片格式错误
   */
  NET_DVR_PIC_FORMAT_ERROR(864, "图片格式错误"),
  /**
   * 图片分辨率无效错误
   */
  NET_DVR_PIC_RESOLUTION_INVALID_ERROR(865, "图片分辨率无效错误"),
  /**
   * 图片过大
   */
  NET_DVR_PIC_SIZE_EXCEED_ERROR(866, "图片过大"),
  /**
   * 图片目标个数超过上限
   */
  NET_DVR_PIC_ANALYSIS_TARGRT_NUM_EXCEED_ERROR(867, "图片目标个数超过上限"),
  /**
   * 分析引擎初始化中
   */
  NET_DVR_ANALYSIS_ENGINES_LOADING_ERROR(868, "分析引擎初始化中"),
  /**
   * 分析引擎异常
   */
  NET_DVR_ANALYSIS_ENGINES_ABNORMA_ERROR(869, "分析引擎异常"),
  /**
   * 分析引擎正在导入人脸库
   */
  NET_DVR_ANALYSIS_ENGINES_FACELIB_IMPORTING(870, "分析引擎正在导入人脸库"),
  /**
   * 无待建模数据
   */
  NET_DVR_NO_DATA_FOR_MODELING_ERROR(871, "无待建模数据"),
  /**
   * 设备正在进行图片建模操作，不支持并发处理
   */
  NET_DVR_FACE_DATA_MODELING_ERROR(872, "设备正在进行图片建模操作，不支持并发处理"),
  /**
   * 超过设备中支持导入人脸数最大个数限制（导入的人脸库中数据）
   */
  NET_ERR_FACELIBDATA_OVERLIMIT(873, "超过设备中支持导入人脸数最大个数限制（导入的人脸库中数据）"),
  /**
   * 分析引擎已关联通道
   */
  NET_DVR_ANALYSIS_ENGINES_ASSOCIATED_CHANNEL(874, "分析引擎已关联通道"),
  /**
   * 上层自定义ID的长度最小32字符长度
   */
  NET_DVR_ERR_CUSTOMID_LEN(875, "上层自定义ID的长度最小32字符长度"),
  /**
   * 上层下发重复的自定义人脸库ID
   */
  NET_DVR_ERR_CUSTOMFACELIBID_REPEAT(876, "上层下发重复的自定义人脸库ID"),
  /**
   * 上层下发重复的自定义人员ID
   */
  NET_DVR_ERR_CUSTOMHUMANID_REPEAT(877, "上层下发重复的自定义人员ID"),
  /**
   * url下载失败
   */
  NET_DVR_ERR_URL_DOWNLOAD_FAIL(878, "url下载失败"),
  /**
   * url未开始下载
   */
  NET_DVR_ERR_URL_DOWNLOAD_NOTSTART(879, "url未开始下载"),
  /**
   * 配置文件安全校验密钥错误
   */
  NET_DVR_CFG_FILE_SECRETKEY_ERROR(880, "配置文件安全校验密钥错误"),
  /**
   * 测温区域越界
   */
  NET_DVR_THERMOMETRY_REGION_OVERSTEP_ERROR(883, "测温区域越界"),
  /**
   * 无温度传感器
   */
  NET_DVR_NO_TEMP_SENSOR_ERROR(897, "无温度传感器"),
  /**
   * 瞳距过大
   */
  NET_DVR_PUPIL_DISTANCE_OVERSIZE_ERROR(898, "瞳距过大"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 多屏控制器错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 开窗通道号错误
   */
  NET_ERR_WINCHAN_IDX(901, "开窗通道号错误"),
  /**
   * 窗口层数错误，单个屏幕上最多覆盖的窗口层数
   */
  NET_ERR_WIN_LAYER(902, "窗口层数错误，单个屏幕上最多覆盖的窗口层数"),
  /**
   * 窗口的块数错误，单个窗口可覆盖的屏幕个数
   */
  NET_ERR_WIN_BLK_NUM(903, "窗口的块数错误，单个窗口可覆盖的屏幕个数"),
  /**
   * 输出分辨率错误
   */
  NET_ERR_OUTPUT_RESOLUTION(904, "输出分辨率错误"),
  /**
   * 场景号错误
   */
  NET_ERR_LAYOUT(905, "场景号错误"),
  /**
   * 输入分辨率不支持
   */
  NET_ERR_INPUT_RESOLUTION(906, "输入分辨率不支持"),
  /**
   * 子设备不在线
   */
  NET_ERR_SUBDEVICE_OFFLINE(907, "子设备不在线"),
  /**
   * 没有空闲解码通道
   */
  NET_ERR_NO_DECODE_CHAN(908, "没有空闲解码通道"),
  /**
   * 开窗能力上限，解码子设备能力上限或者显示处理器能力上限导致
   */
  NET_ERR_MAX_WINDOW_ABILITY(909, "开窗能力上限，解码子设备能力上限或者显示处理器能力上限导致"),
  /**
   * 调用顺序有误
   */
  NET_ERR_ORDER_ERROR(910, "调用顺序有误"),
  /**
   * 正在执行预案
   */
  NET_ERR_PLAYING_PLAN(911, "正在执行预案"),
  /**
   * 解码板正在使用
   */
  NET_ERR_DECODER_USED(912, "解码板正在使用"),
  /**
   * 输出板数据量超限
   */
  NET_ERR_OUTPUT_BOARD_DATA_OVERFLOW(913, "输出板数据量超限"),
  /**
   * 用户名相同
   */
  NET_ERR_SAME_USER_NAME(914, "用户名相同"),
  /**
   * 无效用户名
   */
  NET_ERR_INVALID_USER_NAME(915, "无效用户名"),
  /**
   * 输入矩阵正在使用
   */
  NET_ERR_MATRIX_USING(916, "输入矩阵正在使用"),
  /**
   * 通道类型不同（矩阵输出通道和控制器的输入为不同的类型）
   */
  NET_ERR_DIFFERENT_CHAN_TYPE(917, "通道类型不同（矩阵输出通道和控制器的输入为不同的类型）"),
  /**
   * 输入通道已经被其他矩阵绑定
   */
  NET_ERR_INPUT_CHAN_BINDED(918, "输入通道已经被其他矩阵绑定"),
  /**
   * 正在使用的矩阵输出通道个数超过矩阵与控制器绑定的通道个数
   */
  NET_ERR_BINDED_OUTPUT_CHAN_OVERFLOW(919, "正在使用的矩阵输出通道个数超过矩阵与控制器绑定的通道个数"),
  /**
   * 输入信号源个数达到上限
   */
  NET_ERR_MAX_SIGNAL_NUM(920, "输入信号源个数达到上限"),
  /**
   * 输入通道正在使用
   */
  NET_ERR_INPUT_CHAN_USING(921, "输入通道正在使用"),
  /**
   * 管理员已经登陆，操作失败
   */
  NET_ERR_MANAGER_LOGON(922, "管理员已经登陆，操作失败"),
  /**
   * 该用户已经登陆，操作失败
   */
  NET_ERR_USERALREADY_LOGON(923, "该用户已经登陆，操作失败"),
  /**
   * 场景正在初始化，操作失败
   */
  NET_ERR_LAYOUT_INIT(924, "场景正在初始化，操作失败"),
  /**
   * 底图大小不符
   */
  NET_ERR_BASEMAP_SIZE_NOT_MATCH(925, "底图大小不符"),
  /**
   * 窗口正在执行其他操作，本次操作失败
   */
  NET_ERR_WINDOW_OPERATING(926, "窗口正在执行其他操作，本次操作失败"),
  /**
   * 信号源开窗个数达到上限
   */
  NET_ERR_SIGNAL_UPLIMIT(927, "信号源开窗个数达到上限"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 解码器错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 窗口大小超限
   */
  NET_ERR_WINDOW_SIZE_OVERLIMIT(943, "窗口大小超限"),
  /**
   * 达到最大窗口重叠数
   */
  NET_ERR_MAX_WIN_OVERLAP(951, "达到最大窗口重叠数"),
  /**
   * stream ID和通道号同时有效
   */
  NET_ERR_STREAMID_CHAN_BOTH_VALID(952, "stream ID和通道号同时有效"),
  /**
   * 设备无零通道
   */
  NET_ERR_NO_ZERO_CHAN(953, "设备无零通道"),
  /**
   * 需要重定向（转码子系统使用）
   */
  NEED_RECONNECT(955, "需要重定向（转码子系统使用）"),
  /**
   * 流ID不存在
   */
  NET_ERR_NO_STREAM_ID(956, "流ID不存在"),
  /**
   * 转码未启动
   */
  NET_DVR_TRANS_NOT_START(957, "转码未启动"),
  /**
   * 流ID数达到上限
   */
  NET_ERR_MAXNUM_STREAM_ID(958, "流ID数达到上限"),
  /**
   * 工作模式不匹配
   */
  NET_ERR_WORKMODE_MISMATCH(959, "工作模式不匹配"),
  /**
   * 已工作在当前模式
   */
  NET_ERR_MODE_IS_USING(960, "已工作在当前模式"),
  /**
   * 设备正在处理中
   */
  NET_ERR_DEV_PROGRESSING(961, "设备正在处理中"),
  /**
   * 正在被动转码
   */
  NET_ERR_PASSIVE_TRANSCODING(962, "正在被动转码"),
  /**
   * 窗口位置错误
   */
  NET_DVR_ERR_WINDOW_SIZE_PLACE(975, "窗口位置错误"),
  /**
   * 屏幕距离超限
   */
  NET_DVR_ERR_RGIONAL_RESTRICTIONS(976, "屏幕距离超限"),
  /**
   * 操作失败，请先关闭窗口
   */
  NET_DVR_ERR_CLOSE_WINDOWS(984, "操作失败，请先关闭窗口"),
  /**
   * 超出轮巡解码能力限制
   */
  NET_DVR_ERR_MATRIX_LOOP_ABILITY(985, "超出轮巡解码能力限制"),
  /**
   * 轮巡解码时间不支持
   */
  NET_DVR_ERR_MATRIX_LOOP_TIME(986, "轮巡解码时间不支持"),
  /**
   * 联动通道数超过上限
   */
  NET_DVR_ERR_LINKED_OUT_ABILITY(987, "联动通道数超过上限"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 能力集错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 不支持能力节点获取
   */
  XML_ABILITY_NOTSUPPORT(1000, "不支持能力节点获取"),
  /**
   * 输出内存不足
   */
  XML_ANALYZE_NOENOUGH_BUF(1001, "输出内存不足"),
  /**
   * 无法找到对应的本地 xml
   */
  XML_ANALYZE_FIND_LOCALXML_ERROR(1002, "无法找到对应的本地 xml"),
  /**
   * 加载本地 xml 出错
   */
  XML_ANALYZE_LOAD_LOCALXML_ERROR(1003, "加载本地 xml 出错"),
  /**
   * 设备能力数据格式错误
   */
  XML_NANLYZE_DVR_DATA_FORMAT_ERROR(1004, "设备能力数据格式错误"),
  /**
   * 能力集类型错误
   */
  XML_ANALYZE_TYPE_ERROR(1005, "能力集类型错误"),
  /**
   * XML 能力节点格式错误
   */
  XML_ANALYZE_XML_NODE_ERROR(1006, "XML 能力节点格式错误"),
  /**
   * 输入的能力 XML 节点值错误
   */
  XML_INPUT_PARAM_ERROR(1007, "输入的能力 XML 节点值错误"),
  /**
   * XML 版本不匹配
   */
  XML_VERSION_MISMATCH(1008, "XML 版本不匹配"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 其他错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 透明通道已打开，当前操作无法完成
   */
  NET_ERR_TRANS_CHAN_START(1101, "透明通道已打开，当前操作无法完成"),
  /**
   * 设备正在升级
   */
  NET_ERR_DEV_UPGRADING(1102, "设备正在升级"),
  /**
   * 升级包类型不匹配
   */
  NET_ERR_MISMATCH_UPGRADE_PACK_TYPE(1103, "升级包类型不匹配"),
  /**
   * 设备正在格式化
   */
  NET_ERR_DEV_FORMATTING(1104, "设备正在格式化"),
  /**
   * 升级包版本不匹配
   */
  NET_ERR_MISMATCH_UPGRADE_PACK_VERSION(1105, "升级包版本不匹配"),
  /**
   * PT已被锁定
   */
  NET_ERR_PT_LOCKED(1106, "PT已被锁定"),
  /**
   * 验证码不合法，请修改验证码
   */
  NET_DVR_ERR_ILLEGAL_VERIFICATION_CODE(1111, "验证码不合法，请修改验证码"),
  /**
   * 缺少验证码，请输入验证码
   */
  NET_DVR_ERR_LACK_VERIFICATION_CODE(1112, "缺少验证码，请输入验证码"),
  /**
   * 该IP地址已被禁止，不允许配置(设备支持的IP地址过滤功能)
   */
  NET_DVR_ERR_FORBIDDEN_IP(1113, "该IP地址已被禁止，不允许配置(设备支持的IP地址过滤功能)"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 报警设备错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 正在搜索外接模块
   */
  NET_ERR_SEARCHING_MODULE(1201, "正在搜索外接模块"),
  /**
   * 正在注册外接模块
   */
  NET_ERR_REGISTERING_MODULE(1202, "正在注册外接模块"),
  /**
   * 正在获取防区参数
   */
  NET_ERR_GETTING_ZONES(1203, "正在获取防区参数"),
  /**
   * 正在获取触发器
   */
  NET_ERR_GETTING_TRIGGERS(1204, "正在获取触发器"),
  /**
   * 系统处于布防状态
   */
  NET_ERR_ARMED_STATUS(1205, "系统处于布防状态"),
  /**
   * 系统处于编程模式
   */
  NET_ERR_PROGRAM_MODE_STATUS(1206, "系统处于编程模式"),
  /**
   * 系统处于步测模式
   */
  NET_ERR_WALK_TEST_MODE_STATUS(1207, "系统处于步测模式"),
  /**
   * 旁路状态
   */
  NET_ERR_BYPASS_STATUS(1208, "旁路状态"),
  /**
   * 功能未使能
   */
  NET_ERR_DISABLED_MODULE_STATUS(1209, "功能未使能"),
  /**
   * 防区不支持该操作
   */
  NET_ERR_NOT_SUPPORT_OPERATE_ZONE(1210, "防区不支持该操作"),
  /**
   * 模块地址不能被修改
   */
  NET_ERR_NOT_SUPPORT_MOD_MODULE_ADDR(1211, "模块地址不能被修改"),
  /**
   * 模块未注册
   */
  NET_ERR_UNREGISTERED_MODULE(1212, "模块未注册"),
  /**
   * 公共子系统关联自身
   */
  NET_ERR_PUBLIC_SUBSYSTEM_ASSOCIATE_SELF(1213, "公共子系统关联自身"),
  /**
   * 超过公共子系统最大关联个数
   */
  NET_ERR_EXCEEDS_ASSOCIATE_SUBSYSTEM_NUM(1214, "超过公共子系统最大关联个数"),
  /**
   * 子系统被其他公共子系统关联
   */
  NET_ERR_BE_ASSOCIATED_BY_PUBLIC_SUBSYSTEM(1215, "子系统被其他公共子系统关联"),
  /**
   * 防区处于故障状态
   */
  NET_ERR_ZONE_FAULT_STATUS(1216, "防区处于故障状态"),
  /**
   * 事件触发报警输出开启和事件触发报警输出关闭中有相同事件类型
   */
  NET_ERR_SAME_EVENT_TYPE(1217, "事件触发报警输出开启和事件触发报警输出关闭中有相同事件类型"),
  /**
   * 防区处于报警状态
   */
  NET_ERR_ZONE_ALARM_STATUS(1218, "防区处于报警状态"),
  /**
   * 扩展总线短路
   */
  NET_ERR_EXPANSION_BUS_SHORT_CIRCUIT(1219, "扩展总线短路"),
  /**
   * 密码冲突，比如开锁密码和防劫持密码相同
   */
  NET_ERR_PWD_CONFLICT(1220, "密码冲突，比如开锁密码和防劫持密码相同"),
  /**
   * 探测器已被其他防区注册
   */
  NET_ERR_DETECTOR_GISTERED_BY_OTHER_ZONE(1221, "探测器已被其他防区注册"),
  /**
   * 探测器已被其他主机注册
   */
  NET_ERR_DETECTOR_GISTERED_BY_OTHER_PU(1222, "探测器已被其他主机注册"),
  /**
   * 探测器不在线
   */
  NET_ERR_DETECTOR_DISCONNECT(1223, "探测器不在线"),
  /**
   * 设备正在通话中
   */
  NET_ERR_CALL_BUSY(1224, "设备正在通话中"),
  /**
   * 防区处于防拆状态
   */
  NET_DVR_ERR_ZONE_TAMPER_STAUS(1225, "防区处于防拆状态"),
  /**
   * 无线外设已被其他主机注册
   */
  NET_DVR_ERR_WIRELESS_DEV_REGISTER(1226, "无线外设已被其他主机注册"),
  /**
   * 无线外设已被添加
   */
  NET_DVR_ERR_WIRELESS_DEV_ADDED(1227, "无线外设已被添加"),
  /**
   * 无线外设不在线
   */
  NET_DVR_ERR_WIRELESS_DEV_OFFLINE(1228, "无线外设不在线"),
  /**
   * 无线外设处于防拆状态
   */
  NET_DVR_ERR_WIRELESS_DEV_TAMPER_STATUS(1229, "无线外设处于防拆状态"),
  /**
   * 文件名称错误，为空或不合法
   */
  NET_ERR_FILE_NAME(1357, "文件名称错误，为空或不合法"),
  /**
   * 设备正在广播中
   */
  NET_ERR_BROADCAST_BUSY(1358, "设备正在广播中"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 抓拍机错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 车道数超出能力
   */
  NET_DVR_ERR_LANENUM_EXCEED(1400, "车道数超出能力"),
  /**
   * 牌识区域过大
   */
  NET_DVR_ERR_PRAREA_EXCEED(1401, "牌识区域过大"),
  /**
   * 信号灯接入参数错误
   */
  NET_DVR_ERR_LIGHT_PARAM(1402, "信号灯接入参数错误"),
  /**
   * 车道线配置错误
   */
  NET_DVR_ERR_LANE_LINE_INVALID(1403, "车道线配置错误"),
  /**
   * 停止线配置错误
   */
  NET_DVR_ERR_STOP_LINE_INVALID(1404, "停止线配置错误"),
  /**
   * 左/右转分界线配置错误
   */
  NET_DVR_ERR_LEFTORRIGHT_LINE_INVALID(1405, "左/右转分界线配置错误"),
  /**
   * 叠加车道号重复
   */
  NET_DVR_ERR_LANE_NO_REPEAT(1406, "叠加车道号重复"),
  /**
   * 牌识多边形不符合要求
   */
  NET_DVR_ERR_PRAREA_INVALID(1407, "牌识多边形不符合要求"),
  /**
   * 视频检测交通灯信号灯数目超出最大值
   */
  NET_DVR_ERR_LIGHT_NUM_EXCEED(1408, "视频检测交通灯信号灯数目超出最大值"),
  /**
   * 视频检测交通灯信号灯子灯数目不合法
   */
  NET_DVR_ERR_SUBLIGHT_NUM_INVALID(1409, "视频检测交通灯信号灯子灯数目不合法"),
  /**
   * 视频检测交通灯输入信号灯框大小不合法
   */
  NET_DVR_ERR_LIGHT_AREASIZE_INVALID(1410, "视频检测交通灯输入信号灯框大小不合法"),
  /**
   * 视频检测交通灯输入信号灯颜色不合法
   */
  NET_DVR_ERR_LIGHT_COLOR_INVALID(1411, "视频检测交通灯输入信号灯颜色不合法"),
  /**
   * 视频检测交通灯输入灯方向属性不合法
   */
  NET_DVR_ERR_LIGHT_DIRECTION_INVALID(1412, "视频检测交通灯输入灯方向属性不合法"),
  /**
   * IO口实际支持的能力不足
   */
  NET_DVR_ERR_LACK_IOABLITY(1413, "IO口实际支持的能力不足"),
  /**
   * FTP端口号非法（端口号重复或者异常）
   */
  NET_DVR_ERR_FTP_PORT(1414, "FTP端口号非法（端口号重复或者异常）"),
  /**
   * FTP目录名非法（启用多级目录，多级目录传值为空）
   */
  NET_DVR_ERR_FTP_CATALOGUE(1415, "FTP目录名非法（启用多级目录，多级目录传值为空）"),
  /**
   * FTP上传类型非法（单ftp只支持全部/双ftp只支持卡口和违章）
   */
  NET_DVR_ERR_FTP_UPLOAD_TYPE(1416, "FTP上传类型非法（单ftp只支持全部/双ftp只支持卡口和违章）"),
  /**
   * 配置参数时写FLASH失败
   */
  NET_DVR_ERR_FLASH_PARAM_WRITE(1417, "配置参数时写FLASH失败"),
  /**
   * 配置参数时读FLASH失败
   */
  NET_DVR_ERR_FLASH_PARAM_READ(1418, "配置参数时读FLASH失败"),
  /**
   * FTP图片命名分隔符非法
   */
  NET_DVR_ERR_PICNAME_DELIMITER(1419, "FTP图片命名分隔符非法"),
  /**
   * FTP图片命名项非法（例如 分隔符）
   */
  NET_DVR_ERR_PICNAME_ITEM(1420, "FTP图片命名项非法（例如 分隔符）"),
  /**
   * 牌识区域类型非法（矩形和多边形有效性校验）
   */
  NET_DVR_ERR_PLATE_RECOGNIZE_TYPE(1421, "牌识区域类型非法（矩形和多边形有效性校验）"),
  /**
   * 抓拍次数非法（有效值是0～5）
   */
  NET_DVR_ERR_CAPTURE_TIMES(1422, "抓拍次数非法（有效值是0～5）"),
  /**
   * 线圈距离非法（有效值是0～2000ms）
   */
  NET_DVR_ERR_LOOP_DISTANCE(1423, "线圈距离非法（有效值是0～2000ms）"),
  /**
   * 线圈输入状态非法 （有效值）
   */
  NET_DVR_ERR_LOOP_INPUT_STATUS(1424, "线圈输入状态非法 （有效值）"),
  /**
   * 测速组IO关联冲突
   */
  NET_DVR_ERR_RELATE_IO_CONFLICT(1425, "测速组IO关联冲突"),
  /**
   * 连拍间隔时间非法（0～6000ms）
   */
  NET_DVR_ERR_INTERVAL_TIME(1426, "连拍间隔时间非法（0～6000ms）"),
  /**
   * 标志限速值非法（大车标志限速不能大于小车标志限速）
   */
  NET_DVR_ERR_SIGN_SPEED(1427, "标志限速值非法（大车标志限速不能大于小车标志限速）"),
  /**
   * 图像配置翻转（配置交互影响）
   */
  NET_DVR_ERR_PIC_FLIP(1428, "图像配置翻转（配置交互影响）"),
  /**
   * 关联车道数错误(重复 有效值校验1～99)
   */
  NET_DVR_ERR_RELATE_LANE_NUMBER(1429, "关联车道数错误(重复 有效值校验1～99)"),
  /**
   * 配置抓拍机触发模式非法
   */
  NET_DVR_ERR_TRIGGER_MODE(1430, "配置抓拍机触发模式非法"),
  /**
   * 触发延时时间错误(2000ms)
   */
  NET_DVR_ERR_DELAY_TIME(1431, "触发延时时间错误(2000ms)"),
  /**
   * 超过最大485个数限制
   */
  NET_DVR_ERR_EXCEED_RS485_COUNT(1432, "超过最大485个数限制"),
  /**
   * 雷达类型错误
   */
  NET_DVR_ERR_RADAR_TYPE(1433, "雷达类型错误"),
  /**
   * 雷达角度错误
   */
  NET_DVR_ERR_RADAR_ANGLE(1434, "雷达角度错误"),
  /**
   * 雷达有效时间错误
   */
  NET_DVR_ERR_RADAR_SPEED_VALID_TIME(1435, "雷达有效时间错误"),
  /**
   * 雷达线性矫正参数错误
   */
  NET_DVR_ERR_RADAR_LINE_CORRECT(1436, "雷达线性矫正参数错误"),
  /**
   * 雷达常量矫正参数错误
   */
  NET_DVR_ERR_RADAR_CONST_CORRECT(1437, "雷达常量矫正参数错误"),
  /**
   * 录像参数无效（预录时间不超过10s）
   */
  NET_DVR_ERR_RECORD_PARAM(1438, "录像参数无效（预录时间不超过10s）"),
  /**
   * 视频检测信号灯配置信号灯个数，但是没有勾选信号灯方向和颜色的
   */
  NET_DVR_ERR_LIGHT_WITHOUT_COLOR_AND_DIRECTION(1439, "视频检测信号灯配置信号灯个数，但是没有勾选信号灯方向和颜色的"),
  /**
   * 视频检测信号灯配置信号灯个数，但是没有画检测区域
   */
  NET_DVR_ERR_LIGHT_WITHOUT_DETECTION_REGION(1440, "视频检测信号灯配置信号灯个数，但是没有画检测区域"),
  /**
   * 牌识参数省份参数的合法性
   */
  NET_DVR_ERR_RECOGNIZE_PROVINCE_PARAM(1441, "牌识参数省份参数的合法性"),
  /**
   * IO测速超时时间非法（有效值大于0）
   */
  NET_DVR_ERR_SPEED_TIMEOUT(1442, "IO测速超时时间非法（有效值大于0）"),
  /**
   * ntp时区参数错误
   */
  NET_DVR_ERR_NTP_TIMEZONE(1443, "ntp时区参数错误"),
  /**
   * ntp校时间隔错误
   */
  NET_DVR_ERR_NTP_INTERVAL_TIME(1444, "ntp校时间隔错误"),
  /**
   * 可配置网卡数目错误
   */
  NET_DVR_ERR_NETWORK_CARD_NUM(1445, "可配置网卡数目错误"),
  /**
   * 默认路由错误
   */
  NET_DVR_ERR_DEFAULT_ROUTE(1446, "默认路由错误"),
  /**
   * bonding网卡工作模式错误
   */
  NET_DVR_ERR_BONDING_WORK_MODE(1447, "bonding网卡工作模式错误"),
  /**
   * slave网卡错误
   */
  NET_DVR_ERR_SLAVE_CARD(1448, "slave网卡错误"),
  /**
   * Primary网卡错误
   */
  NET_DVR_ERR_PRIMARY_CARD(1449, "Primary网卡错误"),
  /**
   * dhcp和pppoE不能同时启动
   */
  NET_DVR_ERR_DHCP_PPOE_WORK(1450, "dhcp和pppoE不能同时启动"),
  /**
   * 网络接口错误
   */
  NET_DVR_ERR_NET_INTERFACE(1451, "网络接口错误"),
  /**
   * MTU错误
   */
  NET_DVR_ERR_MTU(1452, "MTU错误"),
  /**
   * 子网掩码错误
   */
  NET_DVR_ERR_NETMASK(1453, "子网掩码错误"),
  /**
   * IP地址不合法
   */
  NET_DVR_ERR_IP_INVALID(1454, "IP地址不合法"),
  /**
   * 多播地址不合法
   */
  NET_DVR_ERR_MULTICAST_IP_INVALID(1455, "多播地址不合法"),
  /**
   * 网关不合法
   */
  NET_DVR_ERR_GATEWAY_INVALID(1456, "网关不合法"),
  /**
   * DNS不合法
   */
  NET_DVR_ERR_DNS_INVALID(1457, "DNS不合法"),
  /**
   * 告警主机地址不合法
   */
  NET_DVR_ERR_ALARMHOST_IP_INVALID(1458, "告警主机地址不合法"),
  /**
   * IP冲突
   */
  NET_DVR_ERR_IP_CONFLICT(1459, "IP冲突"),
  /**
   * IP不支持同网段
   */
  NET_DVR_ERR_NETWORK_SEGMENT(1460, "IP不支持同网段"),
  /**
   * 端口错误
   */
  NET_DVR_ERR_NETPORT(1461, "端口错误"),
  /**
   * PPPOE不支持
   */
  NET_DVR_ERR_PPPOE_NOSUPPORT(1462, "PPPOE不支持"),
  /**
   * 域名不支持
   */
  NET_DVR_ERR_DOMAINNAME_NOSUPPORT(1463, "域名不支持"),
  /**
   * 未启用测速功能
   */
  NET_DVR_ERR_NO_SPEED(1464, "未启用测速功能"),
  /**
   * IO状态错误
   */
  NET_DVR_ERR_IOSTATUS_INVALID(1465, "IO状态错误"),
  /**
   * 连拍间隔非法
   */
  NET_DVR_ERR_BURST_INTERVAL_INVALID(1466, "连拍间隔非法"),
  /**
   * 备用模式错误
   */
  NET_DVR_ERR_RESERVE_MODE(1467, "备用模式错误"),
  /**
   * 叠加车道号错误
   */
  NET_DVR_ERR_LANE_NO(1468, "叠加车道号错误"),
  /**
   * 线圈区域类型错误
   */
  NET_DVR_ERR_COIL_AREA_TYPE(1469, "线圈区域类型错误"),
  /**
   * 触发区域参数错误
   */
  NET_DVR_ERR_TRIGGER_AREA_PARAM(1470, "触发区域参数错误"),
  /**
   * 违章限速参数错误
   */
  NET_DVR_ERR_SPEED_LIMIT_PARAM(1471, "违章限速参数错误"),
  /**
   * 车道关联协议类型错误
   */
  NET_DVR_ERR_LANE_PROTOCOL_TYPE(1472, "车道关联协议类型错误"),
  /**
   * 连拍间隔类型非法
   */
  NET_DVR_ERR_INTERVAL_TYPE(1473, "连拍间隔类型非法"),
  /**
   * 连拍间隔距离非法
   */
  NET_DVR_ERR_INTERVAL_DISTANCE(1474, "连拍间隔距离非法"),
  /**
   * RS485关联类型非法
   */
  NET_DVR_ERR_RS485_ASSOCIATE_DEVTYPE(1475, "RS485关联类型非法"),
  /**
   * RS485关联车道号非法
   */
  NET_DVR_ERR_RS485_ASSOCIATE_LANENO(1476, "RS485关联车道号非法"),
  /**
   * 车道号关联多个RS485口
   */
  NET_DVR_ERR_LANENO_ASSOCIATE_MULTIRS485(1477, "车道号关联多个RS485口"),
  /**
   * 视频检测信号灯配置信号灯个数，但是检测区域宽或高为0
   */
  NET_DVR_ERR_LIGHT_DETECTION_REGION(1478, "视频检测信号灯配置信号灯个数，但是检测区域宽或高为0"),
  /**
   * 不支持抓拍帧2D降噪
   */
  NET_DVR_ERR_DN2D_NOSUPPORT(1479, "不支持抓拍帧2D降噪"),
  /**
   * 不支持的镜头类型
   */
  NET_DVR_ERR_IRISMODE_NOSUPPORT(1480, "不支持的镜头类型"),
  /**
   * 不支持的白平衡模式
   */
  NET_DVR_ERR_WB_NOSUPPORT(1481, "不支持的白平衡模式"),
  /**
   * IO口的有效性
   */
  NET_DVR_ERR_IO_EFFECTIVENESS(1482, "IO口的有效性"),
  /**
   * 信号灯检测器接入红/黄灯超限(16)
   */
  NET_DVR_ERR_LIGHTNO_MAX(1483, "信号灯检测器接入红/黄灯超限(16)"),
  /**
   * 信号灯检测器接入红/黄灯冲突
   */
  NET_DVR_ERR_LIGHTNO_CONFLICT(1484, "信号灯检测器接入红/黄灯冲突"),
  /**
   * 直行触发线
   */
  NET_DVR_ERR_CANCEL_LINE(1485, "直行触发线"),
  /**
   * 待行区停止线
   */
  NET_DVR_ERR_STOP_LINE(1486, "待行区停止线"),
  /**
   * 闯红灯触发线
   */
  NET_DVR_ERR_RUSH_REDLIGHT_LINE(1487, "闯红灯触发线"),
  /**
   * IO输出口编号越界
   */
  NET_DVR_ERR_IOOUTNO_MAX(1488, "IO输出口编号越界"),
  /**
   * IO输出口提前时间超限
   */
  NET_DVR_ERR_IOOUTNO_AHEADTIME_MAX(1489, "IO输出口提前时间超限"),
  /**
   * IO输出口有效持续时间超限
   */
  NET_DVR_ERR_IOOUTNO_IOWORKTIME(1490, "IO输出口有效持续时间超限"),
  /**
   * IO输出口脉冲模式下倍频出错
   */
  NET_DVR_ERR_IOOUTNO_FREQMULTI(1491, "IO输出口脉冲模式下倍频出错"),
  /**
   * IO输出口脉冲模式下占空比出错
   */
  NET_DVR_ERR_IOOUTNO_DUTYRATE(1492, "IO输出口脉冲模式下占空比出错"),
  /**
   * 以曝闪起效，工作方式不支持视频
   */
  NET_DVR_ERR_VIDEO_WITH_EXPOSURE(1493, "以曝闪起效，工作方式不支持视频"),
  /**
   * 车牌亮度自动使能闪光灯仅在车牌亮度补偿模式下起效
   */
  NET_DVR_ERR_PLATE_BRIGHTNESS_WITHOUT_FLASHDET(1494, "车牌亮度自动使能闪光灯仅在车牌亮度补偿模式下起效"),
  /**
   * 识别类型非法 车牌识别参数（如大车、小车、背向、正向、车标识别等）
   */
  NET_DVR_ERR_RECOGNIZE_TYPE_PARAM(1495, "识别类型非法 车牌识别参数（如大车、小车、背向、正向、车标识别等）"),
  /**
   * 牌识参数非法 牌识区域配置时判断出错
   */
  NET_DVR_ERR_PALTE_RECOGNIZE_AREA_PARAM(1496, "牌识参数非法 牌识区域配置时判断出错"),
  /**
   * 端口有冲突
   */
  NET_DVR_ERR_PORT_CONFLICT(1497, "端口有冲突"),
  /**
   * IP不能设置为回环地址
   */
  NET_DVR_ERR_LOOP_IP(1498, "IP不能设置为回环地址"),
  /**
   * 压线灵敏度出错(视频电警模式下)
   */
  NET_DVR_ERR_DRIVELINE_SENSITIVE(1499, "压线灵敏度出错(视频电警模式下)"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ VQD 错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * VQD 诊断时间段冲突
   */
  NET_ERR_VQD_TIME_CONFLICT(1500, "VQD 诊断时间段冲突"),
  /**
   * VQD 诊断计划不存在
   */
  NET_ERR_VQD_PLAN_NO_EXIST(1501, "VQD 诊断计划不存在"),
  /**
   * VQD 监控点不存在
   */
  NET_ERR_VQD_CHAN_NO_EXIST(1502, "VQD 监控点不存在"),
  /**
   * VQD 计划数已达上限
   */
  NET_ERR_VQD_CHAN_MAX(1503, "VQD 计划数已达上限"),
  /**
   * VQD 任务数已达上限
   */
  NET_ERR_VQD_TASK_MAX(1504, "VQD 任务数已达上限"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 抓拍机错误码新增 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 抓拍模式为频闪时最大抓拍张数为2张(IVT模式下)
   */
  NET_DVR_ERR_EXCEED_MAX_CAPTURE_TIMES(1600, "抓拍模式为频闪时最大抓拍张数为2张(IVT模式下)"),
  /**
   * 相同485口关联雷达类型冲突
   */
  NET_DVR_ERR_REDAR_TYPE_CONFLICT(1601, "相同485口关联雷达类型冲突"),
  /**
   * 车牌号为空
   */
  NET_DVR_ERR_LICENSE_PLATE_NULL(1602, "车牌号为空"),
  /**
   * 写入数据库失败
   */
  NET_DVR_ERR_WRITE_DATABASE(1603, "写入数据库失败"),
  /**
   * 车牌有效时间错误
   */
  NET_DVR_ERR_LICENSE_EFFECTIVE_TIME(1604, "车牌有效时间错误"),
  /**
   * 预录开始时间大于违法抓拍张数
   */
  NET_DVR_ERR_PRERECORDED_STARTTIME_LONG(1605, "预录开始时间大于违法抓拍张数"),
  /**
   * 触发规则线错误
   */
  NET_DVR_ERR_TRIGGER_RULE_LINE(1606, "触发规则线错误"),
  /**
   * 左/右触发线不垂直
   */
  NET_DVR_ERR_LEFTRIGHT_TRIGGERLINE_NOTVERTICAL(1607, "左/右触发线不垂直"),
  /**
   * 闪光灯闪烁模式错误
   */
  NET_DVR_ERR_FLASH_LAMP_MODE(1608, "闪光灯闪烁模式错误"),
  /**
   * 违章抓拍张数错误
   */
  NET_DVR_ERR_ILLEGAL_SNAPSHOT_NUM(1609, "违章抓拍张数错误"),
  /**
   * 违章检测类型错误
   */
  NET_DVR_ERR_ILLEGAL_DETECTION_TYPE(1610, "违章检测类型错误"),
  /**
   * 正背向触发线高度错误
   */
  NET_DVR_ERR_POSITIVEBACK_TRIGGERLINE_HIGH(1611, "正背向触发线高度错误"),
  /**
   * 混合模式下只支持机非人抓拍类型
   */
  NET_DVR_ERR_MIXEDMODE_CAPTYPE_ALLTARGETS(1612, "混合模式下只支持机非人抓拍类型"),
  /**
   * 小车标志限速大于限速值
   */
  NET_DVR_ERR_CARSIGNSPEED_GREATERTHAN_LIMITSPEED(1613, "小车标志限速大于限速值"),
  /**
   * 大车标志限速大于限速值
   */
  NET_DVR_ERR_BIGCARSIGNSPEED_GREATERTHAN_LIMITSPEED(1614, "大车标志限速大于限速值"),
  /**
   * 大车标志限速大于小车标志限速值
   */
  NET_DVR_ERR_BIGCARSIGNSPEED_GREATERTHAN_CARSIGNSPEED(1615, "大车标志限速大于小车标志限速值"),
  /**
   * 大车限速值大于小车限速值
   */
  NET_DVR_ERR_BIGCARLIMITSPEED_GREATERTHAN_CARLIMITSPEED(1616, "大车限速值大于小车限速值"),
  /**
   * 大车低速限速值大于小车低速限速值
   */
  NET_DVR_ERR_BIGCARLOWSPEEDLIMIT_GREATERTHAN_CARLOWSPEEDLIMIT(1617, "大车低速限速值大于小车低速限速值"),
  /**
   * 小车限速大于异常高速值
   */
  NET_DVR_ERR_CARLIMITSPEED_GREATERTHAN_EXCEPHIGHSPEED(1618, "小车限速大于异常高速值"),
  /**
   * 大车限速大于异常高速值
   */
  NET_DVR_ERR_BIGCARLIMITSPEED_GREATERTHAN_EXCEPHIGHSPEED(1619, "大车限速大于异常高速值"),
  /**
   * 停止线超过直行触发线
   */
  NET_DVR_ERR_STOPLINE_MORETHAN_TRIGGERLINE(1620, "停止线超过直行触发线"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 门禁主机错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 时间段重叠
   */
  NET_ERR_TIME_OVERLAP(1900, "时间段重叠"),
  /**
   * 假日计划重叠
   */
  NET_ERR_HOLIDAY_PLAN_OVERLAP(1901, "假日计划重叠"),
  /**
   * 卡号未排序
   */
  NET_ERR_CARDNO_NOT_SORT(1902, "卡号未排序"),
  /**
   * 卡号不存在
   */
  NET_ERR_CARDNO_NOT_EXIST(1903, "卡号不存在"),
  /**
   * 卡号错误
   */
  NET_ERR_ILLEGAL_CARDNO(1904, "卡号错误"),
  /**
   * 防区处于布防状态(参数修改不允许)
   */
  NET_ERR_ZONE_ALARM(1905, "防区处于布防状态(参数修改不允许)"),
  /**
   * 防区不支持该操作
   */
  NET_ERR_ZONE_OPERATION_NOT_SUPPORT(1906, "防区不支持该操作"),
  /**
   * 多门互锁和反潜回同时配置错误
   */
  NET_ERR_INTERLOCK_ANTI_CONFLICT(1907, "多门互锁和反潜回同时配置错误"),
  /**
   * 卡已满（卡达到10W后返回）
   */
  NET_ERR_DEVICE_CARD_FULL(1908, "卡已满（卡达到10W后返回）"),
  /**
   * 假日组下载失败
   */
  NET_ERR_HOLIDAY_GROUP_DOWNLOAD(1909, "假日组下载失败"),
  /**
   * 就地控制器离线
   */
  NET_ERR_LOCAL_CONTROL_OFF(1910, "就地控制器离线"),
  /**
   * 就地控制器未添加
   */
  NET_ERR_LOCAL_CONTROL_DISADD(1911, "就地控制器未添加"),
  /**
   * 就地控制器已添加
   */
  NET_ERR_LOCAL_CONTROL_HASADD(1912, "就地控制器已添加"),
  /**
   * 与已添加的就地控制器门编号冲突
   */
  NET_ERR_LOCAL_CONTROL_DOORNO_CONFLICT(1913, "与已添加的就地控制器门编号冲突"),
  /**
   * 就地控制器通信失败
   */
  NET_ERR_LOCAL_CONTROL_COMMUNICATION_FAIL(1914, "就地控制器通信失败"),
  /**
   * 操作对象不存在（对门、报警输出、报警输入相关操作，当对象未添加时返回）
   */
  NET_ERR_OPERAND_INEXISTENCE(1915, "操作对象不存在（对门、报警输出、报警输入相关操作，当对象未添加时返回）"),
  /**
   * 就地控制器超出设备最大能力（主控对就地数量有限制）
   */
  NET_ERR_LOCAL_CONTROL_OVER_LIMIT(1916, "就地控制器超出设备最大能力（主控对就地数量有限制）"),
  /**
   * 门超出设备最大能力
   */
  NET_ERR_DOOR_OVER_LIMIT(1917, "门超出设备最大能力"),
  /**
   * 报警输入输出超出设备最大能力
   */
  NET_ERR_ALARM_OVER_LIMIT(1918, "报警输入输出超出设备最大能力"),
  /**
   * 就地控制器地址与类型不符
   */
  NET_ERR_LOCAL_CONTROL_ADDRESS_INCONFORMITY_TYPE(1919, "就地控制器地址与类型不符"),
  /**
   * 不支持一人多卡
   */
  NET_ERR_NOT_SUPPORT_ONE_MORE_CARD(1920, "不支持一人多卡"),
  /**
   * 删除的人脸不存在
   */
  NET_ERR_DELETE_NO_EXISTENCE_FACE(1921, "删除的人脸不存在"),
  /**
   * 与设备门特殊密码重复
   */
  NET_ERR_DOOR_SPECIAL_PASSWORD_REPEAT(1922, "与设备门特殊密码重复"),
  /**
   * 与设备认证码重复
   */
  NET_ERR_AUTH_CODE_REPEAT(1923, "与设备认证码重复"),
  /**
   * 布防超过最大连接数
   */
  NET_ERR_DEPLOY_EXCEED_MAX(1924, "布防超过最大连接数"),
  /**
   * 读卡器不支持按手指ID删除指纹
   */
  NET_ERR_NOT_SUPPORT_DEL_FP_BY_ID(1925, "读卡器不支持按手指ID删除指纹"),
  /**
   * 有效期参数配置范围有误
   */
  NET_ERR_TIME_RANGE(1926, "有效期参数配置范围有误"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 可视对讲错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 与门口机通信异常
   */
  NET_DVR_ERR_OUTDOOR_COMMUNICATION(1950, "与门口机通信异常"),
  /**
   * 未设置房间号
   */
  NET_DVR_ERR_ROOMNO_UNDEFINED(1951, "未设置房间号"),
  /**
   * 无呼叫
   */
  NET_DVR_ERR_NO_CALLING(1952, "无呼叫"),
  /**
   * 响铃
   */
  NET_DVR_ERR_RINGING(1953, "响铃"),
  /**
   * 正在通话
   */
  NET_DVR_ERR_IS_CALLING_NOW(1954, "正在通话"),
  /**
   * 智能锁密码错误
   */
  NET_DVR_ERR_LOCK_PASSWORD_WRONG(1955, "智能锁密码错误"),
  /**
   * 开关锁失败
   */
  NET_DVR_ERR_CONTROL_LOCK_FAILURE(1956, "开关锁失败"),
  /**
   * 开关锁超时
   */
  NET_DVR_ERR_CONTROL_LOCK_OVERTIME(1957, "开关锁超时"),
  /**
   * 智能锁设备繁忙
   */
  NET_DVR_ERR_LOCK_DEVICE_BUSY(1958, "智能锁设备繁忙"),
  /**
   * 远程开锁功能未打开
   */
  NET_DVR_ERR_UNOPEN_REMOTE_LOCK_FUNCTION(1959, "远程开锁功能未打开"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 其他错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  /**
   * 下载的文件不完整
   */
  NET_DVR_ERR_FILE_NOT_COMPLETE(2100, "下载的文件不完整"),
  /**
   * 该 IPC 已经存在
   */
  NET_DVR_ERR_IPC_EXIST(2101, "该 IPC 已经存在"),
  /**
   * 该通道已添加 IPC
   */
  NET_DVR_ERR_ADD_IPC(2102, "该通道已添加 IPC"),
  /**
   * 网络带宽能力不足
   */
  NET_DVR_ERR_OUT_OF_RES(2103, "网络带宽能力不足"),
  /**
   * IPC 的 ip 地址跟 DVR 的 IP 地址冲突
   */
  NET_DVR_ERR_CONFLICT_TO_LOCALIP(2104, "IPC 的 ip 地址跟 DVR 的 IP 地址冲突"),
  /**
   * 非法 IP 地址
   */
  NET_DVR_ERR_IP_SET(2105, "非法 IP 地址"),
  /**
   * 非法的端口号
   */
  NET_DVR_ERR_PORT_SET(2106, "非法的端口号"),
  /**
   * 功能互斥
   */
  NET_ERR_MUTEX_FUNCTION(2108, "功能互斥"),
  /**
   * 安全问题配置数量错误
   */
  NET_ERR_QUESTION_CONFIGNUM(2109, "安全问题配置数量错误"),
  /**
   * 人脸智能通道资源已用完
   */
  NET_ERR_FACECHAN_NORESOURCE(2110, "人脸智能通道资源已用完"),
  /**
   * 正在数据回迁
   */
  NET_ERR_DATA_CALLBACK(2111, "正在数据回迁"),
  /**
   * SMD编码资源不足
   */
  NET_DVR_SMD_ENCODING_NORESOURSE(2116, "SMD编码资源不足"),
  /**
   * SMD解码资源不足
   */
  NET_DVR_SMD_DECODING_NORESOURSE(2117, "SMD解码资源不足"),
  /**
   * 人脸库数据正在处理
   */
  NET_DVR_FACELIB_DATA_PROCESSING(2118, "人脸库数据正在处理"),
  /**
   * 设备和服务器之间的时间差异太大
   */
  NET_DVR_ERR_LARGE_TIME_DIFFRENCE(2119, "设备和服务器之间的时间差异太大"),
  /**
   * 已开启回放，不支持本功能
   */
  NET_DVR_NO_SUPPORT_WITH_PLAYBACK(2120, "已开启回放，不支持本功能"),
  /**
   * 通道已开启SMD，不支持本功能
   */
  NET_DVR_CHANNEL_NO_SUPPORT_WITH_SMD(2121, "通道已开启SMD，不支持本功能"),
  /**
   * 通道已开启人脸抓拍，不支持本功能
   */
  NET_DVR_CHANNEL_NO_SUPPORT_WITH_FD(2122, "通道已开启人脸抓拍，不支持本功能"),
  /**
   * 非法的电话号码
   */
  NET_DVR_ILLEGAL_PHONE_NUMBER(2123, "非法的电话号码"),
  /**
   * 非法的证件号码
   */
  NET_DVR_ILLEGAL_CERITIFICATE_NUMBER(2124, "非法的证件号码"),
  /**
   * 通道分辨率不支持
   */
  NET_DVR_ERR_CHANNEL_RESOLUTION_NO_SUPPORT(2125, "通道分辨率不支持"),
  /**
   * 通道编码格式不支持
   */
  NET_DVR_ERR_CHANNEL_COMPRESSION_NO_SUPPORT(2126, "通道编码格式不支持"),
  /**
   * 设备数少，不允许删除
   */
  NET_DVR_ERR_CLUSTER_DEVICE_TOO_LESS(2127, "设备数少，不允许删除"),
  /**
   * 该设备是集群主机，不允许删除
   */
  NET_DVR_ERR_CLUSTER_DEL_DEVICE_CM_PLAYLOAD(2128, "该设备是集群主机，不允许删除"),
  /**
   * 设备数达到上限，不允许增加
   */
  NET_DVR_ERR_CLUSTER_DEVNUM_OVER_UPPER_LIMIT(2129, "设备数达到上限，不允许增加"),
  /**
   * 设备类型不一致
   */
  NET_DVR_ERR_CLUSTER_DEVICE_TYPE_INCONFORMITY(2130, "设备类型不一致"),
  /**
   * 设备版本不一致
   */
  NET_DVR_ERR_CLUSTER_DEVICE_VERSION_INCONFORMITY(2131, "设备版本不一致"),
  /**
   * 集群系统IP地址冲突：ipv4地址冲突、ipv6地址冲突
   */
  NET_DVR_ERR_CLUSTER_IP_CONFLICT(2132, "集群系统IP地址冲突：ipv4地址冲突、ipv6地址冲突"),
  /**
   * 集群系统IP地址无效：ipv4非法、ipv6非法
   */
  NET_DVR_ERR_CLUSTER_IP_INVALID(2133, "集群系统IP地址无效：ipv4非法、ipv6非法"),
  /**
   * 集群系统端口冲突
   */
  NET_DVR_ERR_CLUSTER_PORT_CONFLICT(2134, "集群系统端口冲突"),
  /**
   * 集群系统端口非法
   */
  NET_DVR_ERR_CLUSTER_PORT_INVALID(2135, "集群系统端口非法"),
  /**
   * 用户名或密码非法
   */
  NET_DVR_ERR_CLUSTER_USERNAEM_OR_PASSWORD_INVALID(2136, "用户名或密码非法"),
  /**
   * 存在相同设备
   */
  NET_DVR_ERR_CLUSTER_DEVICE_ALREADY_EXIST(2137, "存在相同设备"),
  /**
   * 设备不存在(组网时下发的cs列表中的设备信息在任何一台cs上都找不到，删除的时候下发的id不对)
   */
  NET_DVR_ERR_CLUSTER_DEVICE_NOT_EXIST(2138,
      "设备不存在(组网时下发的cs列表中的设备信息在任何一台cs上都找不到，删除的时候下发的id不对)"),
  /**
   * 设备处于非集群模式
   */
  NET_DVR_ERR_CLUSTER_NON_CLUSTER_MODE(2139, "设备处于非集群模式"),
  /**
   * IP地址不在同一局域网，不同区域网不允许组网/扩容
   */
  NET_DVR_ERR_CLUSTER_IP_NOT_SAME_LAN(2140, "IP地址不在同一局域网，不同区域网不允许组网/扩容"),
  /**
   * 抓包失败
   */
  NET_DVR_ERR_CAPTURE_PACKAGE_FAILED(2141, "抓包失败"),
  /**
   * 正在抓包
   */
  NET_DVR_ERR_CAPTURE_PACKAGE_PROCESSING(2142, "正在抓包"),
  /**
   * 安全帽检测资源不足
   */
  NET_DVR_ERR_SAFETY_HELMET_NO_RESOURCE(2143, "安全帽检测资源不足"),
  /**
   * 已开启视频摘要，不支持本功能
   */
  NET_DVR_NO_SUPPORT_WITH_ABSTRACT(2144, "已开启视频摘要，不支持本功能"),
  /**
   * 深度学习资源超限
   */
  NET_DVR_INSUFFICIENT_DEEP_LEARNING_RESOURCES(2146, "深度学习资源超限"),
  /**
   * 交互口令错误
   */
  NET_DVR_ERR_IDENTITY_KEY(2147, "交互口令错误"),
  /**
   * 交互口令缺失
   */
  NET_DVR_MISSING_IDENTITY_KEY(2148, "交互口令缺失"),
  /**
   * 已开启人员密度检测，不支持本功能
   */
  NET_DVR_NO_SUPPORT_WITH_PERSON_DENSITY_DETECT(2149, "已开启人员密度检测，不支持本功能"),
  /**
   * IPC分辨率超限
   */
  NET_DVR_IPC_RESOLUTION_OVERFLOW(2150, "IPC分辨率超限"),
  /**
   * IPC码率超限
   */
  NET_DVR_IPC_BITRATE_OVERFLOW(2151, "IPC码率超限"),
  /**
   * 无效的taskID
   */
  NET_DVR_ERR_INVALID_TASKID(2152, "无效的taskID"),
  /**
   * 没有配置面板路智能
   */
  NET_DVR_PANEL_MODE_NOT_CONFIG(2153, "没有配置面板路智能"),
  /**
   * 检测区域范围非法
   */
  NET_DVR_DETECT_REGION_RANGE_INVALID(2181, "检测区域范围非法"),
  /**
   * 通道抓图失败
   */
  NET_DVR_CHANNEL_CAPTURE_PICTURE_FAILURE(2182, "通道抓图失败"),
  /**
   * 设备当前状态不支持除冰功能（只在POE+、AC24V、DC12V供电下支持除冰功能）
   */
  NET_DVR_ERR_NOTSUPPORT_DEICING(3001, "设备当前状态不支持除冰功能（只在POE+、AC24V、DC12V供电下支持除冰功能）"),
  /**
   * 测温功能总使能未开启(即NET_DVR_THERMOMETRY_BASICPARAM使能未开启)
   */
  NET_DVR_ERR_THERMENABLE_CLOSE(3002, "测温功能总使能未开启(即NET_DVR_THERMOMETRY_BASICPARAM使能未开启)"),
  /**
   * 全景地图和限位不可同时操作
   */
  NET_DVR_ERR_PANORAMIC_LIMIT_OPERATED(3004, "全景地图和限位不可同时操作"),
  /**
   * SmartH264和ROI不可同时操作
   */
  NET_DVR_ERR_SMARTH264_ROI_OPERATED(3005, "SmartH264和ROI不可同时操作"),
  /**
   * 规则数达到上限
   */
  NET_DVR_ERR_RULENUM_LIMIT(3006, "规则数达到上限"),
  /**
   * 激光以及除冰功能不可同时操作
   */
  NET_DVR_ERR_LASER_DEICING_OPERATED(3007, "激光以及除冰功能不可同时操作"),
  /**
   * 请先关闭数据变倍功能或变倍限制设置为最小值（当执行烟火检测、行为分析、船只检测、坏点矫正、测温、烟火屏蔽功能时，若没有关闭数据变倍或者变倍限制没有设置为最小值时，将会提示该错误码）
   */
  NET_DVR_ERR_OFFDIGITALZOOM_OR_MINZOOMLIMIT(3008,
      "请先关闭数据变倍功能或变倍限制设置为最小值（当执行烟火检测、行为分析、船只检测、坏点矫正、测温、烟火屏蔽功能时，若没有关闭数据变倍或者变倍限制没有设置为最小值时，将会提示该错误码）"),
  // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 非SDK错误码 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  UNKNOWN(-1, "未知错误编码");

  private int code;
  private String description;

  public static Optional<NetworkErrorCode> byCode(int code) {
    return EnumSet.allOf(NetworkErrorCode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
