package cn.labzen.hikvision.jna;

@SuppressWarnings({"unused",
                   "SpellCheckingInspection",
                   "WeakerAccess"})
public final class Constants {

  // TODO 拆解
  private Constants() {
  }

  /**
   * DVR本地登陆名
   */
  public static final int MAX_NAMELEN = 16;
  /**
   * 设备支持的权限（1-12表示本地权限，13-32表示远程权限）
   */
  public static final int MAX_RIGHT = 32;
  /**
   * 用户名长度
   */
  public static final int NAME_LEN = 32;
  /**
   * 最小密码长度
   */
  public static final int MIN_PASSWD_LEN = 8;
  /**
   * 密码长度
   */
  public static final int PASSWD_LEN = 16;
  /**
   * 码流加密密钥最大长度
   */
  public static final int STREAM_PASSWD_LEN = 12;
  /**
   * 密码长度64位
   */
  public static final int MAX_PASSWD_LEN_EX = 64;
  /**
   * GUID长度
   */
  public static final int GUID_LEN = 16;
  /**
   * 设备类型名称长度
   */
  public static final int DEV_TYPE_NAME_LEN = 24;
  public static final int STREAM_ID_LEN = 32;
  /**
   * 序列号长度
   */
  public static final int SERIALNO_LEN = 48;
  /**
   * mac地址长度
   */
  public static final int MACADDR_LEN = 6;
  /**
   * Mac地址长度
   */
  public static final int MAC_ADDRESS_NUM = 48;
  /**
   * 场景数
   */
  public static final int MAX_SENCE_NUM = 16;
  /**
   * 最大区域
   */
  public static final int RULE_REGION_MAX = 128;
  /**
   * 设备可配以太网络
   */
  public static final int MAX_ETHERNET = 2;
  /**
   * 设备可配最大网卡数目
   */
  public static final int MAX_NETWORK_CARD = 4;
  /**
   * 设备可配最大网卡数目扩展
   */
  public static final int MAX_NETWORK_CARD_EX = 12;
  /**
   * 路径长度
   */
  public static final int PATHNAME_LEN = 128;
  /**
   * 预置点
   */
  public static final int MAX_PRESET_V13 = 16;
  /**
   * 产线测试保留字段长度
   */
  public static final int MAX_TEST_COMMAND_NUM = 32;
  /**
   * 号码最大长度
   */
  public static final int MAX_NUMBER_LEN = 32;
  /**
   * 设备名称最大长度
   */
  public static final int MAX_NAME_LEN = 128;
  /**
   * LED索引最大值 2013-11-19
   */
  public static final int MAX_INDEX_LED = 8;
  /**
   * 自定义目录最大长度
   */
  public static final int MAX_CUSTOM_DIR = 64;
  /**
   * 最大URL长度
   */
  public static final int URL_LEN_V40 = 256;
  /**
   * 云存储服务器用户名长度
   */
  public static final int CLOUD_NAME_LEN = 48;
  /**
   * 云存储服务器密码长度
   */
  public static final int CLOUD_PASSWD_LEN = 48;
  /**
   * 传感器名称长度
   */
  public static final int MAX_SENSORNAME_LEN = 64;
  /**
   * 传感器通道长度
   */
  public static final int MAX_SENSORCHAN_LEN = 32;
  /**
   * 传感器描述长度
   */
  public static final int MAX_DESCRIPTION_LEN = 32;
  /**
   * 设备名称长度扩展
   */
  public static final int MAX_DEVNAME_LEN_EX = 64;
  /**
   * 文件路径长度
   */
  public static final int NET_SDK_MAX_FILE_PATH = 256;
  /**
   * TME语音播报内容长度
   */
  public static final int MAX_TMEVOICE_LEN = 64;
  /**
   * ISO_8601时间长度
   */
  public static final int ISO_8601_LEN = 32;
  /**
   * 模块信息长度
   */
  public static final int MODULE_INFO_LEN = 32;
  /**
   * 版本信息长度
   */
  public static final int VERSION_INFO_LEN = 32;
  /**
   * 输入板最大个数
   */
  public static final int MAX_NUM_INPUT_BOARD = 512;
  /**
   * 船只检测区域列表最大数目
   */
  public static final int MAX_SHIPSDETE_REGION_NUM = 8;
  /**
   * 一个虚拟屏输入通道支持的分辨率的最大数量
   */
  public static final int MAX_RES_NUM_ONE_VS_INPUT_CHAN = 8;
  /**
   * 虚拟屏输入通道最大数量
   */
  public static final int MAX_VS_INPUT_CHAN_NUM = 16;
  /**
   * 人脸库ID最大长度
   */
  public static final int NET_SDK_MAX_FDID_LEN = 256;
  /**
   * 人脸ID最大长度
   */
  public static final int NET_SDK_MAX_PICID_LEN = 256;
  /**
   * 人脸库图片自定义信息长度
   */
  public static final int NET_SDK_FDPIC_CUSTOM_INFO_LEN = 96;
  /**
   * 最大支持单张图片识别出的人脸区域个数
   */
  public static final int NET_DVR_MAX_FACE_ANALYSIS_NUM = 32;
  /**
   * 最大支持搜索人脸区域个数
   */
  public static final int NET_DVR_MAX_FACE_SEARCH_NUM = 5;
  /**
   * 配置文件密钥长度
   */
  public static final int NET_SDK_SECRETKEY_LEN = 128;
  /**
   * 自定义信息最大长度
   */
  public static final int NET_SDK_CUSTOM_LEN = 512;
  /**
   * 校验码长度
   */
  public static final int NET_SDK_CHECK_CODE_LEN = 128;
  /**
   * 小间距LED控制器: 字符内容长度
   */
  public static final int MAX_LEN_TEXT_CONTENT = 128;
  /**
   * 小间距LED控制器: 信号源可叠加的文本数量
   */
  public static final int MAX_NUM_INPUT_SOURCE_TEXT = 32;
  /**
   * 小间距LED控制器: LED区域包含的输出口个数
   */
  public static final int MAX_NUM_OUTPUT_CHANNEL = 512;
  /**
   * 子窗口解码OSD: OSD信息最大长度
   */
  public static final int MAX_LEN_OSD_CONTENT = 256;
  /**
   * 子窗口解码OSD: 单个子窗口支持的最大OSD数量
   */
  public static final int MAX_NUM_OSD_ONE_SUBWND = 8;
  /**
   * 子窗口解码OSD: 单个窗口支持的最大分屏窗口数量（即子窗口数量）
   */
  public static final int MAX_NUM_SPLIT_WND = 64;
  /**
   * 子窗口解码OSD: unknown
   */
  public static final int MAX_NUM_OSD = 8;
  /**
   * 设备名称最大长度
   */
  public static final int MAX_DEVNAME_LEN = 32;
  /**
   * 屏幕字体显示信息最大长度
   */
  public static final int MAX_LED_INFO = 256;
  /**
   * 时间最大长度
   */
  public static final int MAX_TIME_LEN = 32;
  /**
   * 卡号最大长度
   */
  public static final int MAX_CARD_LEN = 24;
  /**
   * 操作人员名称最大长度
   */
  public static final int MAX_OPERATORNAME_LEN = 32;
  /**
   * 热成像报警规则数
   */
  public static final int THERMOMETRY_ALARMRULE_NUM = 40;
  /**
   * 热度图检测区域最大支持数
   */
  public static final int MAX_THERMOMETRY_REGION_NUM = 40;
  /**
   * 热成像温差报警规则数
   */
  public static final int MAX_THERMOMETRY_DIFFCOMPARISON_NUM = 40;
  /**
   * 船只检测最大船只数
   */
  public static final int MAX_SHIPS_NUM = 20;
  /**
   * 关键字个数
   */
  public static final int KEY_WORD_NUM = 3;
  /**
   * 关键字长度
   */
  public static final int KEY_WORD_LEN = 128;
  /**
   * 异步登录回调状态宏定义: 异步登录成功
   */
  public static final int ASYN_LOGIN_SUCC = 1;
  /**
   * 异步登录回调状态宏定义: 异步登录失败
   */
  public static final int ASYN_LOGIN_FAILED = 0;
  /**
   * 萤石云验证码长度
   */
  public static final int NET_SDK_MAX_VERIFICATION_CODE_LEN = 32;
  /**
   * 萤石云操作码长度
   */
  public static final int NET_SDK_MAX_OPERATE_CODE_LEN = 64;
  /**
   * 9000设备最大时间段数
   */
  public static final int MAX_TIMESEGMENT_V30 = 8;
  /**
   * 8000设备最大时间段数
   */
  public static final int MAX_TIMESEGMENT = 4;
  /**
   * 抓拍机红外滤光片预置点数2013-07-09
   */
  public static final int MAX_ICR_NUM = 8;
  /**
   * 车流量信息最大个数
   */
  public static final int MAX_VEHICLEFLOW_INFO = 24;
  /**
   * 8000设备最大遮挡区域数
   */
  public static final int MAX_SHELTERNUM = 4;
  public static final int MAX_ALARMOUT_V40 = 4128;
  /**
   * 每周天数
   */
  public static final int MAX_DAYS = 7;
  /**
   * pppoe拨号号码最大长度
   */
  public static final int PHONENUMBER_LEN = 32;
  /**
   * 配件板信息最大长度
   */
  public static final int MAX_ACCESSORY_CARD = 256;
  /**
   * 9000设备最大硬盘数
   * <p>
   * 最多33个硬盘(包括16个内置SATA硬盘、1个eSATA硬盘和16个NFS盘)
   */
  public static final int MAX_DISKNUM_V30 = 33;
  /**
   * 硬盘位置长度
   */
  public static final int NET_SDK_DISK_LOCATION_LEN = 16;
  /**
   * 供应商名称长度
   */
  public static final int NET_SDK_SUPPLIER_NAME_LEN = 32;
  /**
   * 硬盘型号长度
   */
  public static final int NET_SDK_DISK_MODEL_LEN = 64;
  /**
   * 最大硬盘卷个数
   */
  public static final int NET_SDK_MAX_DISK_VOLUME = 33;
  /**
   * 硬盘卷名称长度
   */
  public static final int NET_SDK_DISK_VOLUME_LEN = 36;
  /**
   * 8000设备最大硬盘数
   */
  public static final int MAX_DISKNUM = 16;
  /**
   * 1.2版本之前版本
   */
  public static final int MAX_DISKNUM_V10 = 8;
  /**
   * 读卡器描述
   */
  public static final int CARD_READER_DESCRIPTION = 32;
  /**
   * 最大人脸数
   */
  public static final int MAX_FACE_NUM = 2;
  /**
   * 9000设备本地显示最大播放窗口数
   */
  public static final int MAX_WINDOW_V30 = 32;
  /**
   * Netra 2.3.1扩展
   */
  public static final int MAX_WINDOW_V40 = 64;
  /**
   * 8000设备最大硬盘数
   */
  public static final int MAX_WINDOW = 16;
  /**
   * 9000设备最大可接VGA数
   */
  public static final int MAX_VGA_V30 = 4;
  /**
   * 8000设备最大可接VGA数
   */
  public static final int MAX_VGA = 1;
  /**
   * 9000设备最大用户数
   */
  public static final int MAX_USERNUM_V30 = 32;
  /**
   * 8000设备最大用户数
   */
  public static final int MAX_USERNUM = 16;
  /**
   * 9000设备最大异常处理数
   */
  public static final int MAX_EXCEPTIONNUM_V30 = 32;
  /**
   * 8000设备最大异常处理数
   */
  public static final int MAX_EXCEPTIONNUM = 16;
  /**
   * 8000设备单通道最大视频流连接数
   */
  public static final int MAX_LINK = 6;
  /**
   * 抓拍机最大报警输出
   */
  public static final int MAX_ITC_EXCEPTIONOUT = 32;
  /**
   * 屏幕显示字符长度
   */
  public static final int MAX_SCREEN_DISPLAY_LEN = 512;
  /**
   * 单路解码器每个解码通道最大可循环解码数
   */
  public static final int MAX_DECPOOLNUM = 4;
  /**
   * 单路解码器的最大解码通道数（实际只有一个，其他三个保留）
   */
  public static final int MAX_DECNUM = 4;
  /**
   * 单路解码器可配置最大透明通道数
   */
  public static final int MAX_TRANSPARENTNUM = 2;
  /**
   * 单路解码器最大轮巡通道数
   */
  public static final int MAX_CYCLE_CHAN = 16;
  /**
   * 最大轮巡通道数（扩展）
   */
  public static final int MAX_CYCLE_CHAN_V30 = 64;
  /**
   * 最大目录长度
   */
  public static final int MAX_DIRNAME_LENGTH = 80;
  /**
   * 最大窗口数
   */
  public static final int MAX_WINDOWS = 16;
  /**
   * 9000设备最大OSD字符行数数
   */
  public static final int MAX_STRINGNUM_V30 = 8;
  /**
   * 8000设备最大OSD字符行数数
   */
  public static final int MAX_STRINGNUM = 4;
  /**
   * 8000定制扩展
   */
  public static final int MAX_STRINGNUM_EX = 8;
  /**
   * 9000设备最大辅助输出数
   */
  public static final int MAX_AUXOUT_V30 = 16;
  /**
   * 8000设备最大辅助输出数
   */
  public static final int MAX_AUXOUT = 4;
  /**
   * 9000设备最大硬盘组数
   */
  public static final int MAX_HD_GROUP = 16;
  /**
   * 设备最大硬盘组数
   */
  public static final int MAX_HD_GROUP_V40 = 32;
  /**
   * 8000设备最大NFS硬盘数
   */
  public static final int MAX_NFS_DISK = 8;
  /**
   * 算法库版本最大值
   */
  public static final int NET_SDK_VERSION_LIST_LEN = 64;
  /**
   * WIFI的SSID号长度
   */
  public static final int IW_ESSID_MAX_SIZE = 32;
  /**
   * WIFI密锁最大字节数
   */
  public static final int IW_ENCODING_TOKEN_MAX = 32;
  /**
   * 最多支持的透明通道路数
   */
  public static final int MAX_SERIAL_NUM = 64;
  /**
   * 9000设备最大可配ddns数
   */
  public static final int MAX_DDNS_NUMS = 10;
  /**
   * 最大域名长度
   */
  public static final int MAX_DOMAIN_NAME = 64;
  /**
   * 最大email地址长度
   */
  public static final int MAX_EMAIL_ADDR_LEN = 48;
  /**
   * 最大email密码长度
   */
  public static final int MAX_EMAIL_PWD_LEN = 32;
  /**
   * 从摄像机个数
   */
  public static final int MAX_SLAVECAMERA_NUM = 8;
  /**
   * 标定点的个数
   */
  public static final int MAX_CALIB_NUM = 6;
  /**
   * 扩展标定点的个数
   */
  public static final int MAX_CALIB_NUM_EX = 20;
  /**
   * 最大LED屏显示长度
   */
  public static final int MAX_LEDDISPLAYINFO_LEN = 1024;
  /**
   * 最大人员检测区域数
   */
  public static final int MAX_PEOPLE_DETECTION_NUM = 8;
  /**
   * 回放时的最大百分率
   */
  public static final int MAXPROGRESS = 100;
  /**
   * 8000设备支持的串口数 1-232， 2-485
   */
  public static final int MAX_SERIALNUM = 2;
  /**
   * 卡号长度
   */
  public static final int CARDNUM_LEN = 20;
  /**
   * unknown
   */
  public static final int PATIENTID_LEN = 64;
  /**
   * 外部结构体卡号长度
   */
  public static final int CARDNUM_LEN_OUT = 32;
  /**
   * 9000设备的视频输出数
   */
  public static final int MAX_VIDEOOUT_V30 = 4;
  /**
   * 8000设备的视频输出数
   */
  public static final int MAX_VIDEOOUT = 2;
  /**
   * 9000设备支持的云台预置点数
   */
  public static final int MAX_PRESET_V30 = 256;
  /**
   * 9000设备支持的云台轨迹数
   */
  public static final int MAX_TRACK_V30 = 256;
  /**
   * 9000设备支持的云台巡航数
   */
  public static final int MAX_CRUISE_V30 = 256;
  /**
   * 8000设备支持的云台预置点数
   */
  public static final int MAX_PRESET = 128;
  /**
   * 8000设备支持的云台轨迹数
   */
  public static final int MAX_TRACK = 128;
  /**
   * 8000设备支持的云台巡航数
   */
  public static final int MAX_CRUISE = 128;
  /**
   * 云台支持的最大预置点数
   */
  public static final int MAX_PRESET_V40 = 300;
  /**
   * 最大支持的巡航点的个数
   */
  public static final int MAX_CRUISE_POINT_NUM = 128;
  /**
   * 最大支持的巡航点的个数扩展
   */
  public static final int MAX_CRUISEPOINT_NUM_V50 = 256;
  /**
   * 一条巡航最多的巡航点
   */
  public static final int CRUISE_MAX_PRESET_NUMS = 32;
  /**
   * 人脸子图个数
   */
  public static final int MAX_FACE_PIC_NUM = 30;
  /**
   * 锁闸时间段个数
   */
  public static final int LOCKGATE_TIME_NUM = 4;
  /**
   * 9000设备支持232串口数
   */
  public static final int MAX_SERIAL_PORT = 8;
  /**
   * 设备支持最大预览模式数目 1画面,4画面,9画面,16画面....
   */
  public static final int MAX_PREVIEW_MODE = 8;
  /**
   * 最大模拟矩阵输出个数
   */
  public static final int MAX_MATRIXOUT = 16;
  /**
   * 日志附加信息
   */
  public static final int LOG_INFO_LEN = 11840;
  /**
   * 云台描述字符串长度
   */
  public static final int DESC_LEN = 16;
  /**
   * 9000最大支持的云台协议数
   */
  public static final int PTZ_PROTOCOL_NUM = 200;
  /**
   * ipc 协议最大个数
   */
  public static final int IPC_PROTOCOL_NUM = 50;
  /**
   * 8000语音对讲通道数
   */
  public static final int MAX_AUDIO = 1;
  /**
   * 9000语音对讲通道数
   */
  public static final int MAX_AUDIO_V30 = 2;
  /**
   * 8000设备最大通道数
   */
  public static final int MAX_CHANNUM = 16;
  /**
   * 8000设备最大报警输入数
   */
  public static final int MAX_ALARMIN = 16;
  /**
   * 8000设备最大报警输出数
   */
  public static final int MAX_ALARMOUT = 4;
  /**
   * 最大32个模拟通道
   */
  public static final int MAX_ANALOG_CHANNUM = 32;
  /**
   * 最大32路模拟报警输出
   */
  public static final int MAX_ANALOG_ALARMOUT = 32;
  /**
   * 最大32路模拟报警输入
   */
  public static final int MAX_ANALOG_ALARMIN = 32;
  /**
   * 允许接入的最大IP设备数
   */
  public static final int MAX_IP_DEVICE = 32;
  /**
   * 允许接入的最大IP设备数 最多可添加64个 IVMS 2000等新设备
   */
  public static final int MAX_IP_DEVICE_V40 = 64;
  /**
   * 允许加入的最多IP通道数
   */
  public static final int MAX_IP_CHANNEL = 32;
  /**
   * 允许加入的最多报警输入数
   */
  public static final int MAX_IP_ALARMIN = 128;
  /**
   * 允许加入的最多报警输出数
   */
  public static final int MAX_IP_ALARMOUT = 64;
  /**
   * 允许加入的最多报警输入数
   */
  public static final int MAX_IP_ALARMIN_V40 = 4096;
  /**
   * 允许加入的最多报警输出数
   */
  public static final int MAX_IP_ALARMOUT_V40 = 4096;
  public static final int NET_DVR_DEV_ADDRESS_MAX_LEN = 129;
  public static final int NET_DVR_LOGIN_USERNAME_MAX_LEN = 64;
  public static final int NET_DVR_LOGIN_PASSWD_MAX_LEN = 64;
  /**
   * 最大支持的通道数 最大模拟加上最大IP支持:64
   */
  public static final int MAX_CHANNUM_V30 = (MAX_ANALOG_CHANNUM + MAX_IP_CHANNEL);
  /**
   * 最大支持的通道数 最大模拟加上最大IP支持:96
   */
  public static final int MAX_ALARMOUT_V30 = (MAX_ANALOG_ALARMOUT + MAX_IP_ALARMOUT);
  /**
   * 最大支持的通道数 最大模拟加上最大IP支持:160
   */
  public static final int MAX_ALARMIN_V30 = (MAX_ANALOG_ALARMIN + MAX_IP_ALARMIN);
  public static final int MAX_HOLIDAY_NUM = 32;
  public static final int LEN_PROPERTY = 128;
  /**
   * 支持关键字查找条数
   */
  public static final int MAX_POS_KEYWORDS_NUM = 3;
  /**
   * 每条关键字长度
   */
  public static final int MAX_POS_KEYWORD_LEN = 128;
  public static final int SEARCH_EVENT_INFO_LEN_V40 = 800;
  public static final int SEARCH_CASE_NO_LEN = 56;
  public static final int SEARCH_CASE_NAME_LEN = 100;
  public static final int SEARCH_LITIGANT_LEN = 32;
  public static final int SEARCH_CHIEF_JUDGE_LEN = 32;
  /**
   * 磁带编号最大长度
   */
  public static final int NET_SDK_MAX_TAPE_INDEX_LEN = 32;
  /**
   * 文件名最大长度
   */
  public static final int NET_SDK_MAX_FILE_LEN = 256;
  public static final int CASE_NO_RET_LEN = 52;
  public static final int CASE_NAME_RET_LEN = 64;
  public static final int LITIGANT_RET_LEN = 24;
  public static final int CHIEF_JUDGE_RET_LEN = 24;
  public static final int NET_SDK_CASETYPE_LEN = 32;
  /**
   * 最大警戒线条数
   */
  public static final int MAX_ALERTLINE_NUM = 8;
  /**
   * 最大区域数数
   */
  public static final int MAX_INTRUSIONREGION_NUM = 8;

  /**
   * 检测区域最多支持10个点的多边形
   */
  public static final int VCA_MAX_POLYGON_POINT_NUM = 10;
  /**
   * 最多规则条数
   */
  public static final int MAX_RULE_NUM = 8;
  /**
   * 最多规则条数扩展
   */
  public static final int MAX_RULE_NUM_V42 = 16;
  /**
   * 最多目标个数
   */
  public static final int MAX_TARGET_NUM = 30;
  /**
   * 最大标定点个数
   */
  public static final int MAX_CALIB_PT = 6;
  /**
   * 最小标定点个数
   */
  public static final int MIN_CALIB_PT = 4;
  /**
   * 最大时间段数
   */
  public static final int MAX_TIMESEGMENT_2 = 2;
  /**
   * 数据流水号
   */
  public static final int DATA_INDEX_LEN = 64;
  /**
   * 设备数据流水号
   */
  public static final int MAX_DEV_DATAINDEX_LEN = 64;
  /**
   * 交通图片数量
   */
  public static final int MAX_TRAFFIC_PICTURE_NUM = 8;
  /**
   * 车牌号最大长度
   */
  public static final int MAX_LICENSE_LEN = 16;
  /**
   * 车牌号最大长度
   */
  public static final int MAX_LICENSE_LEN_EX = 32;
  /**
   * 车牌附加信息最大字符
   */
  public static final int MAX_CATEGORY_LEN = 8;
  /**
   * 卡号最大长度 2013-11-04
   */
  public static final int MAX_CARDNO_LEN = 48;
  /**
   * 操作数最大长度2014-03-03
   */
  public static final int MAX_OPERATE_INDEX_LEN = 32;
  /**
   * 车牌个数
   */
  public static final int MAX_PLATE_NUM = 3;
  /**
   * 最多四个屏蔽区域
   */
  public static final int MAX_MASK_REGION_NUM = 4;
  /**
   * 摄像机标定最大样本线数目
   */
  public static final int MAX_SEGMENT_NUM = 6;
  /**
   * 摄像机标定最小样本线数目
   */
  public static final int MIN_SEGMENT_NUM = 3;
  /**
   * 最大关联抓图通道数
   */
  public static final int MAX_REL_SNAPCHAN_NUM = 3;
  /**
   * 云存储服务器存储的最大图片类型数
   */
  public static final int MAX_PIC_SWITCH_STORAGE_SERVER = 64;
  /**
   * 云存储服务器存储的最大附加信息类型数
   */
  public static final int MAX_INFO_SWITCH_STORAGE_SERVER = 64;
  /**
   * RTMP URL 长度
   */
  public static final int RTMP_URL_LEN = 128;
  /**
   * 发布文件ID长度
   */
  public static final int MAX_ID_LEN_128 = 128;
  /**
   * 设备调试命令最大长度
   */
  public static final int MAX_DEBUGCMD_LEN = 1024;
  /**
   * 设备调试信息最大长度
   */
  public static final int MAX_DEBUGINFO_LEN = 1400;
  /**
   * 最大车辆标识长度
   */
  public static final int MAX_VEHICLE_ID_LEN = 32;
  public static final int LABEL_NAME_LEN = 40;
  public static final int LABEL_IDENTIFY_LEN = 64;
  /**
   * 删除的最大标签标识个数
   */
  public static final int MAX_DEL_LABEL_IDENTIFY = 20;
  /**
   * 描述字长度
   */
  public static final int DESC_LEN_32 = 32;
  /**
   * 节点个数
   */
  public static final int MAX_NODE_NUM = 256;
  /**
   * 每次删除或者刻录的最大文件数
   */
  public static final int MAX_RECORD_FILE_NUM = 20;
  public static final int PICTURE_NAME_LEN = 64;
  /**
   * 卡号长度
   */
  public static final int CARDNUM_LEN_V30 = 40;
  /**
   * 最大备份图片张数
   */
  public static final int MAX_RECORD_PICTURE_NUM = 50;
  /**
   * 最大照片数
   */
  public static final int MAX_HUMAN_PICTURE_NUM = 10;
  /**
   * 最大出生年月长度
   */
  public static final int MAX_HUMAN_BIRTHDATE_LEN = 10;
  /**
   * 车牌号码最大长度
   */
  public static final int MAX_PlATE_NO_LEN = 32;
  /**
   * 区域列表最大数目
   */
  public static final int MAX_REGION_NUM = 8;
  /**
   * 最大参数规则数目
   */
  public static final int MAX_TPS_RULE = 8;
  /**
   * 最大事件规则数目
   */
  public static final int MAX_AID_RULE = 8;
  /**
   * 最大车道数目
   */
  public static final int MAX_LANE_NUM = 8;
  /**
   * 最大场景数量
   */
  public static final int MAX_ITS_SCENE_NUM = 16;
  /**
   * 最大场景时间段数量
   */
  public static final int MAX_SCENE_TIMESEG_NUM = 16;
  /**
   * 最大IP通道数
   */
  public static final int MAX_IVMS_IP_CHANNEL = 128;
  /**
   * 设备编号长度
   */
  public static final int DEVICE_ID_LEN = 48;
  /**
   * 监测点编号长度
   */
  public static final int MONITORSITE_ID_LEN = 48;
  /**
   * 辅助区域最大数目
   */
  public static final int MAX_AUXAREA_NUM = 16;
  /**
   * 最大从通道数量
   */
  public static final int MAX_SLAVE_CHANNEL_NUM = 16;
  /**
   * 设备描述信息最大长度
   */
  public static final int MAX_DEVDESC_LEN = 64;
  /**
   * 违法代码长度
   */
  public static final int ILLEGAL_LEN = 32;
  /**
   * 货车轴最大数
   */
  public static final int MAX_TRUCK_AXLE_NUM = 10;
  /**
   * 泊车位编号
   */
  public static final int SERIAL_NO_LEN = 16;
  /**
   * 版本长度
   */
  public static final int VERSION_LEN = 32;
  /**
   * 最大字符叠加种数
   */
  public static final int MAX_OVERLAP_ITEM_NUM = 50;
  /**
   * 最大设备个数
   */
  public static final int ITS_MAX_DEVICE_NUM = 32;
  public static final int MAX_ID_LEN = 48;

  /* ************************************************
   NET_DVR_IsSupport()返回值
   1－9位分别表示以下信息（位与是TRUE)表示支持；
   ************************************************* */
  /**
   * 支持DIRECTDRAW，如果不支持，则播放器不能工作；
   */
  public static final int NET_DVR_SUPPORT_DDRAW = 0x01;
  /**
   * 显卡支持BLT操作，如果不支持，则播放器不能工作；
   */
  public static final int NET_DVR_SUPPORT_BLT = 0x02;
  /**
   * 显卡BLT支持颜色转换，如果不支持，播放器会用软件方法作RGB转换；
   */
  public static final int NET_DVR_SUPPORT_BLTFOURCC = 0x04;
  /**
   * 显卡BLT支持X轴缩小；如果不支持，系统会用软件方法转换；
   */
  public static final int NET_DVR_SUPPORT_BLTSHRINKX = 0x08;
  /**
   * 显卡BLT支持Y轴缩小；如果不支持，系统会用软件方法转换；
   */
  public static final int NET_DVR_SUPPORT_BLTSHRINKY = 0x10;
  /**
   * 显卡BLT支持X轴放大；如果不支持，系统会用软件方法转换；
   */
  public static final int NET_DVR_SUPPORT_BLTSTRETCHX = 0x20;
  /**
   * 显卡BLT支持Y轴放大；如果不支持，系统会用软件方法转换；
   */
  public static final int NET_DVR_SUPPORT_BLTSTRETCHY = 0x40;
  /**
   * CPU支持SSE指令，Intel Pentium3以上支持SSE指令；
   */
  public static final int NET_DVR_SUPPORT_SSE = 0x80;
  /**
   * CPU支持MMX指令集，Intel Pentium3以上支持SSE指令；
   */
  public static final int NET_DVR_SUPPORT_MMX = 0x100;
  /* *********************云台控制命令 begin************************ */
  /**
   * 接通灯光电源
   */
  public static final int LIGHT_PWRON = 2;
  /**
   * 接通雨刷开关
   */
  public static final int WIPER_PWRON = 3;
  /**
   * 接通风扇开关
   */
  public static final int FAN_PWRON = 4;
  /**
   * 接通加热器开关
   */
  public static final int HEATER_PWRON = 5;
  /**
   * 接通辅助设备开关
   */
  public static final int AUX_PWRON1 = 6;
  /**
   * 接通辅助设备开关
   */
  public static final int AUX_PWRON2 = 7;
  /**
   * 设置预置点
   */
  public static final int SET_PRESET = 8;
  /**
   * 清除预置点
   */
  public static final int CLE_PRESET = 9;
  /**
   * 焦距以速度SS变大(倍率变大)
   */
  public static final int ZOOM_IN = 11;
  /**
   * 焦距以速度SS变小(倍率变小)
   */
  public static final int ZOOM_OUT = 12;
  /**
   * 焦点以速度SS前调
   */
  public static final int FOCUS_NEAR = 13;
  /**
   * 焦点以速度SS后调
   */
  public static final int FOCUS_FAR = 14;
  /**
   * 光圈以速度SS扩大
   */
  public static final int IRIS_OPEN = 15;
  /**
   * 光圈以速度SS缩小
   */
  public static final int IRIS_CLOSE = 16;
  /**
   * 云台以SS的速度上仰
   */
  public static final int TILT_UP = 21;
  /**
   * 云台以SS的速度下俯
   */
  public static final int TILT_DOWN = 22;
  /**
   * 云台以SS的速度左转
   */
  public static final int PAN_LEFT = 23;
  /**
   * 云台以SS的速度右转
   */
  public static final int PAN_RIGHT = 24;
  /**
   * 云台以SS的速度上仰和左转
   */
  public static final int UP_LEFT = 25;
  /**
   * 云台以SS的速度上仰和右转
   */
  public static final int UP_RIGHT = 26;
  /**
   * 云台以SS的速度下俯和左转
   */
  public static final int DOWN_LEFT = 27;
  /**
   * 云台以SS的速度下俯和右转
   */
  public static final int DOWN_RIGHT = 28;
  /**
   * 云台以SS的速度左右自动扫描
   */
  public static final int PAN_AUTO = 29;
  /**
   * 将预置点加入巡航序列
   */
  public static final int FILL_PRE_SEQ = 30;
  /**
   * 设置巡航点停顿时间
   */
  public static final int SET_SEQ_DWELL = 31;
  /**
   * 设置巡航速度
   */
  public static final int SET_SEQ_SPEED = 32;
  /**
   * 将预置点从巡航序列中删除
   */
  public static final int CLE_PRE_SEQ = 33;
  /**
   * 开始记录轨迹
   */
  public static final int STA_MEM_CRUISE = 34;
  /**
   * 停止记录轨迹
   */
  public static final int STO_MEM_CRUISE = 35;
  /**
   * 开始轨迹
   */
  public static final int RUN_CRUISE = 36;
  /**
   * 开始巡航
   */
  public static final int RUN_SEQ = 37;
  /**
   * 停止巡航
   */
  public static final int STOP_SEQ = 38;
  /**
   * 快球转到预置点
   */
  public static final int GOTO_PRESET = 39;
  /* ********************云台控制命令 end************************ */

  /* ************************************************
   回放时播放控制命令宏定义
   NET_DVR_PlayBackControl
   NET_DVR_PlayControlLocDisplay
   NET_DVR_DecPlayBackCtrl的宏定义
   具体支持查看函数说明和代码
   ************************************************* */
  /**
   * 开始播放
   */
  public static final int NET_DVR_PLAYSTART = 1;
  /**
   * 停止播放
   */
  public static final int NET_DVR_PLAYSTOP = 2;
  /**
   * 暂停播放
   */
  public static final int NET_DVR_PLAYPAUSE = 3;
  /**
   * 恢复播放
   */
  public static final int NET_DVR_PLAYRESTART = 4;
  /**
   * 快放
   */
  public static final int NET_DVR_PLAYFAST = 5;
  /**
   * 慢放
   */
  public static final int NET_DVR_PLAYSLOW = 6;
  /**
   * 正常速度
   */
  public static final int NET_DVR_PLAYNORMAL = 7;
  /**
   * 单帧放
   */
  public static final int NET_DVR_PLAYFRAME = 8;
  /**
   * 打开声音
   */
  public static final int NET_DVR_PLAYSTARTAUDIO = 9;
  /**
   * 关闭声音
   */
  public static final int NET_DVR_PLAYSTOPAUDIO = 10;
  /**
   * 调节音量
   */
  public static final int NET_DVR_PLAYAUDIOVOLUME = 11;
  /**
   * 改变文件回放的进度
   */
  public static final int NET_DVR_PLAYSETPOS = 12;
  /**
   * 获取文件回放的进度
   */
  public static final int NET_DVR_PLAYGETPOS = 13;
  /**
   * 获取当前已经播放的时间(按文件回放的时候有效)
   */
  public static final int NET_DVR_PLAYGETTIME = 14;
  /**
   * 获取当前已经播放的帧数(按文件回放的时候有效)
   */
  public static final int NET_DVR_PLAYGETFRAME = 15;
  /**
   * 获取当前播放文件总的帧数(按文件回放的时候有效)
   */
  public static final int NET_DVR_GETTOTALFRAMES = 16;
  /**
   * 获取当前播放文件总的时间(按文件回放的时候有效)
   */
  public static final int NET_DVR_GETTOTALTIME = 17;
  /**
   * 丢B帧
   */
  public static final int NET_DVR_THROWBFRAME = 20;
  /**
   * 设置码流速度
   */
  public static final int NET_DVR_SETSPEED = 24;
  /**
   * 保持与设备的心跳(如果回调阻塞，建议2秒发送一次)
   */
  public static final int NET_DVR_KEEPALIVE = 25;

  /* ************************************************
   远程按键定义如下：
   key value send to CONFIG program
  ************************************************ */
  public static final int KEY_CODE_1 = 1;
  public static final int KEY_CODE_2 = 2;
  public static final int KEY_CODE_3 = 3;
  public static final int KEY_CODE_4 = 4;
  public static final int KEY_CODE_5 = 5;
  public static final int KEY_CODE_6 = 6;
  public static final int KEY_CODE_7 = 7;
  public static final int KEY_CODE_8 = 8;
  public static final int KEY_CODE_9 = 9;
  public static final int KEY_CODE_0 = 10;
  public static final int KEY_CODE_POWER = 11;
  public static final int KEY_CODE_MENU = 12;
  public static final int KEY_CODE_ENTER = 13;
  public static final int KEY_CODE_CANCEL = 14;
  public static final int KEY_CODE_UP = 15;
  public static final int KEY_CODE_DOWN = 16;
  public static final int KEY_CODE_LEFT = 17;
  public static final int KEY_CODE_RIGHT = 18;
  public static final int KEY_CODE_EDIT = 19;
  public static final int KEY_CODE_ADD = 20;
  public static final int KEY_CODE_MINUS = 21;
  public static final int KEY_CODE_PLAY = 22;
  public static final int KEY_CODE_REC = 23;
  public static final int KEY_CODE_PAN = 24;
  public static final int KEY_CODE_M = 25;
  public static final int KEY_CODE_A = 26;
  public static final int KEY_CODE_F1 = 27;
  public static final int KEY_CODE_F2 = 28;

  /* for PTZ control */
  public static final int KEY_PTZ_UP_START = KEY_CODE_UP;
  public static final int KEY_PTZ_UP_STO = 32;
  public static final int KEY_PTZ_DOWN_START = KEY_CODE_DOWN;
  public static final int KEY_PTZ_DOWN_STOP = 33;
  public static final int KEY_PTZ_LEFT_START = KEY_CODE_LEFT;
  public static final int KEY_PTZ_LEFT_STOP = 34;
  public static final int KEY_PTZ_RIGHT_START = KEY_CODE_RIGHT;
  public static final int KEY_PTZ_RIGHT_STOP = 35;
  /**
   * 光圈+
   */
  public static final int KEY_PTZ_AP1_START = KEY_CODE_EDIT;
  public static final int KEY_PTZ_AP1_STOP = 36;
  /**
   * 光圈-
   */
  public static final int KEY_PTZ_AP2_START = KEY_CODE_PAN;
  public static final int KEY_PTZ_AP2_STOP = 37;
  /**
   * 聚焦+
   */
  public static final int KEY_PTZ_FOCUS1_START = KEY_CODE_A;
  public static final int KEY_PTZ_FOCUS1_STOP = 38;
  /**
   * 聚焦-
   */
  public static final int KEY_PTZ_FOCUS2_START = KEY_CODE_M;
  public static final int KEY_PTZ_FOCUS2_STOP = 39;
  /**
   * 变倍+
   */
  public static final int KEY_PTZ_B1_START = 40;
  public static final int KEY_PTZ_B1_STOP = 41;
  /**
   * 变倍-
   */
  public static final int KEY_PTZ_B2_START = 42;
  public static final int KEY_PTZ_B2_STOP = 43;
  //9000新增
  public static final int KEY_CODE_11 = 44;
  public static final int KEY_CODE_12 = 45;
  public static final int KEY_CODE_13 = 46;
  public static final int KEY_CODE_14 = 47;
  public static final int KEY_CODE_15 = 48;
  public static final int KEY_CODE_16 = 49;

  /* ************************
    参数配置命令 begin
    用于NET_DVR_SetDVRConfig和NET_DVR_GetDVRConfig,注意其对应的配置结构
  *******************************/

  /**
   * 获取设备参数
   */
  public static final int NET_DVR_GET_DEVICECFG = 100;
  /**
   * 设置设备参数
   */
  public static final int NET_DVR_SET_DEVICECFG = 101;
  /**
   * 获取网络参数
   */
  public static final int NET_DVR_GET_NETCFG = 102;
  /**
   * 设置网络参数
   */
  public static final int NET_DVR_SET_NETCFG = 103;
  /**
   * 获取图象参数
   */
  public static final int NET_DVR_GET_PICCFG = 104;
  /**
   * 设置图象参数
   */
  public static final int NET_DVR_SET_PICCFG = 105;
  /**
   * 获取压缩参数
   */
  public static final int NET_DVR_GET_COMPRESSCFG = 106;
  /**
   * 设置压缩参数
   */
  public static final int NET_DVR_SET_COMPRESSCFG = 107;
  /**
   * 获取录像时间参数
   */
  public static final int NET_DVR_GET_RECORDCFG = 108;
  /**
   * 设置录像时间参数
   */
  public static final int NET_DVR_SET_RECORDCFG = 109;
  /**
   * 获取解码器参数
   */
  public static final int NET_DVR_GET_DECODERCFG = 110;
  /**
   * 设置解码器参数
   */
  public static final int NET_DVR_SET_DECODERCFG = 111;
  /**
   * 获取232串口参数
   */
  public static final int NET_DVR_GET_RS232CFG = 112;
  /**
   * 设置232串口参数
   */
  public static final int NET_DVR_SET_RS232CFG = 113;
  /**
   * 获取报警输入参数
   */
  public static final int NET_DVR_GET_ALARMINCFG = 114;
  /**
   * 设置报警输入参数
   */
  public static final int NET_DVR_SET_ALARMINCFG = 115;
  /**
   * 获取报警输出参数
   */
  public static final int NET_DVR_GET_ALARMOUTCFG = 116;
  /**
   * 设置报警输出参数
   */
  public static final int NET_DVR_SET_ALARMOUTCFG = 117;
  /**
   * 获取DVR时间
   */
  public static final int NET_DVR_GET_TIMECFG = 118;
  /**
   * 设置DVR时间
   */
  public static final int NET_DVR_SET_TIMECFG = 119;
  /**
   * 获取预览参数
   */
  public static final int NET_DVR_GET_PREVIEWCFG = 120;
  /**
   * 设置预览参数
   */
  public static final int NET_DVR_SET_PREVIEWCFG = 121;
  /**
   * 获取视频输出参数
   */
  public static final int NET_DVR_GET_VIDEOOUTCFG = 122;
  /**
   * 设置视频输出参数
   */
  public static final int NET_DVR_SET_VIDEOOUTCFG = 123;
  /**
   * 获取用户参数
   */
  public static final int NET_DVR_GET_USERCFG = 124;
  /**
   * 设置用户参数
   */
  public static final int NET_DVR_SET_USERCFG = 125;
  /**
   * 获取异常参数
   */
  public static final int NET_DVR_GET_EXCEPTIONCFG = 126;
  /**
   * 设置异常参数
   */
  public static final int NET_DVR_SET_EXCEPTIONCFG = 127;
  /**
   * 获取时区和夏时制参数
   */
  public static final int NET_DVR_GET_ZONEANDDST = 128;
  /**
   * 设置时区和夏时制参数
   */
  public static final int NET_DVR_SET_ZONEANDDST = 129;
  /**
   * 获取叠加字符参数
   */
  public static final int NET_DVR_GET_SHOWSTRING = 130;
  /**
   * 设置叠加字符参数
   */
  public static final int NET_DVR_SET_SHOWSTRING = 131;
  /**
   * 获取事件触发录像参数
   */
  public static final int NET_DVR_GET_EVENTCOMPCFG = 132;
  /**
   * 设置事件触发录像参数
   */
  public static final int NET_DVR_SET_EVENTCOMPCFG = 133;
  /**
   * 获取报警触发辅助输出设置(HS设备辅助输出2006-02-28)
   */
  public static final int NET_DVR_GET_AUXOUTCFG = 140;
  /**
   * 设置报警触发辅助输出设置(HS设备辅助输出2006-02-28)
   */
  public static final int NET_DVR_SET_AUXOUTCFG = 141;
  /**
   * 获取-s系列双输出预览参数(-s系列双输出2006-04-13)
   */
  public static final int NET_DVR_GET_PREVIEWCFG_AUX = 142;
  /**
   * 设置-s系列双输出预览参数(-s系列双输出2006-04-13)
   */
  public static final int NET_DVR_SET_PREVIEWCFG_AUX = 143;
  /**
   * 获取图象参数(SDK_V14扩展命令)
   */
  public static final int NET_DVR_GET_PICCFG_EX = 200;
  /**
   * 设置图象参数(SDK_V14扩展命令)
   */
  public static final int NET_DVR_SET_PICCFG_EX = 201;
  /**
   * 获取用户参数(SDK_V15扩展命令)
   */
  public static final int NET_DVR_GET_USERCFG_EX = 202;
  /**
   * 设置用户参数(SDK_V15扩展命令)
   */
  public static final int NET_DVR_SET_USERCFG_EX = 203;
  /**
   * 获取压缩参数(SDK_V15扩展命令2006-05-15)
   */
  public static final int NET_DVR_GET_COMPRESSCFG_EX = 204;
  /**
   * 设置压缩参数(SDK_V15扩展命令2006-05-15)
   */
  public static final int NET_DVR_SET_COMPRESSCFG_EX = 205;
  /**
   * 获取网络应用参数 NTP/DDNS/EMAIL
   */
  public static final int NET_DVR_GET_NETAPPCFG = 222;
  /**
   * 设置网络应用参数 NTP/DDNS/EMAIL
   */
  public static final int NET_DVR_SET_NETAPPCFG = 223;
  /**
   * 获取网络应用参数 NTP
   */
  public static final int NET_DVR_GET_NTPCFG = 224;
  /**
   * 设置网络应用参数 NTP
   */
  public static final int NET_DVR_SET_NTPCFG = 225;
  /**
   * 获取网络应用参数 DDNS
   */
  public static final int NET_DVR_GET_DDNSCFG = 226;
  /**
   * 设置网络应用参数 DDNS
   */
  public static final int NET_DVR_SET_DDNSCFG = 227;
  /**
   * 对应NET_DVR_EMAILPARA: 获取网络应用参数 EMAIL
   */
  public static final int NET_DVR_GET_EMAILCFG = 228;
  /**
   * 对应NET_DVR_EMAILPARA: 设置网络应用参数 EMAIL
   */
  public static final int NET_DVR_SET_EMAILCFG = 229;
  /**
   * 对应NET_DVR_EMAILPARA: NFS disk config
   */
  public static final int NET_DVR_GET_NFSCFG = 230;
  /**
   * 对应NET_DVR_EMAILPARA: NFS disk config
   */
  public static final int NET_DVR_SET_NFSCFG = 231;
  /**
   * 对应NET_DVR_EMAILPARA: 获取叠加字符参数扩展(支持8条字符)
   */
  public static final int NET_DVR_GET_SHOWSTRING_EX = 238;
  /**
   * 对应NET_DVR_EMAILPARA: 设置叠加字符参数扩展(支持8条字符)
   */
  public static final int NET_DVR_SET_SHOWSTRING_EX = 239;
  /**
   * 对应NET_DVR_EMAILPARA: 获取网络参数
   */
  public static final int NET_DVR_GET_NETCFG_OTHER = 244;
  /**
   * 对应NET_DVR_EMAILPARA: 设置网络参数
   */
  public static final int NET_DVR_SET_NETCFG_OTHER = 245;
  /**
   * 对应NET_DVR_EMAILCFG结构: Get EMAIL parameters
   */
  public static final int NET_DVR_GET_EMAILPARACFG = 250;
  /**
   * 对应NET_DVR_EMAILCFG结构: Setup EMAIL parameters
   */
  public static final int NET_DVR_SET_EMAILPARACFG = 251;
  /**
   * 对应NET_DVR_EMAILCFG结构: 获取扩展DDNS参数
   */
  public static final int NET_DVR_GET_DDNSCFG_EX = 274;
  /**
   * 对应NET_DVR_EMAILCFG结构: 设置扩展DDNS参数
   */
  public static final int NET_DVR_SET_DDNSCFG_EX = 275;
  /**
   * 对应NET_DVR_EMAILCFG结构: 云台设置PTZ位置
   */
  public static final int NET_DVR_SET_PTZPOS = 292;
  /**
   * 对应NET_DVR_EMAILCFG结构: 云台获取PTZ位置
   */
  public static final int NET_DVR_GET_PTZPOS = 293;
  /**
   * 对应NET_DVR_EMAILCFG结构: 云台获取PTZ范围
   */
  public static final int NET_DVR_GET_PTZSCOPE = 294;

  /* **************************DS9000新增命令(_V30) begin **************************** */

  /**
   * 网络(NET_DVR_NETCFG_V30结构): 获取网络参数
   */
  public static final int NET_DVR_GET_NETCFG_V30 = 1000;
  /**
   * 网络(NET_DVR_NETCFG_V30结构): 设置网络参数
   */
  public static final int NET_DVR_SET_NETCFG_V30 = 1001;
  /**
   * 图象(NET_DVR_PICCFG_V30结构): 获取图象参数
   */
  public static final int NET_DVR_GET_PICCFG_V30 = 1002;
  /**
   * 图象(NET_DVR_PICCFG_V30结构): 设置图象参数
   */
  public static final int NET_DVR_SET_PICCFG_V30 = 1003;
  /**
   * 录像时间(NET_DVR_RECORD_V30结构): 获取录像参数
   */
  public static final int NET_DVR_GET_RECORDCFG_V30 = 1004;
  /**
   * 录像时间(NET_DVR_RECORD_V30结构): 设置录像参数
   */
  public static final int NET_DVR_SET_RECORDCFG_V30 = 1005;
  /**
   * 用户(NET_DVR_USER_V30结构): 获取用户参数
   */
  public static final int NET_DVR_GET_USERCFG_V30 = 1006;
  /**
   * 用户(NET_DVR_USER_V30结构): 设置用户参数
   */
  public static final int NET_DVR_SET_USERCFG_V30 = 1007;
  /**
   * 9000DDNS参数配置(NET_DVR_DDNSPARA_V30结构): 获取DDNS(9000扩展)
   */
  public static final int NET_DVR_GET_DDNSCFG_V30 = 1010;
  /**
   * 9000DDNS参数配置(NET_DVR_DDNSPARA_V30结构): 设置DDNS(9000扩展)
   */
  public static final int NET_DVR_SET_DDNSCFG_V30 = 1011;
  /**
   * EMAIL功能(NET_DVR_EMAILCFG_V30结构): 获取EMAIL参数
   */
  public static final int NET_DVR_GET_EMAILCFG_V30 = 1012;
  /**
   * EMAIL功能(NET_DVR_EMAILCFG_V30结构): 设置EMAIL参数
   */
  public static final int NET_DVR_SET_EMAILCFG_V30 = 1013;
  /**
   * 巡航参数 (NET_DVR_CRUISE_PARA结构)
   */
  public static final int NET_DVR_GET_CRUISE = 1020;
  /**
   * 巡航参数 (NET_DVR_CRUISE_PARA结构)
   */
  public static final int NET_DVR_SET_CRUISE = 1021;
  /**
   * 报警输入结构参数 (NET_DVR_ALARMINCFG_V30结构)
   */
  public static final int NET_DVR_GET_ALARMINCFG_V30 = 1024;
  /**
   * 报警输入结构参数 (NET_DVR_ALARMINCFG_V30结构)
   */
  public static final int NET_DVR_SET_ALARMINCFG_V30 = 1025;
  /**
   * 报警输出结构参数 (NET_DVR_ALARMOUTCFG_V30结构)
   */
  public static final int NET_DVR_GET_ALARMOUTCFG_V30 = 1026;
  /**
   * 报警输出结构参数 (NET_DVR_ALARMOUTCFG_V30结构)
   */
  public static final int NET_DVR_SET_ALARMOUTCFG_V30 = 1027;
  /**
   * 视频输出结构参数 (NET_DVR_VIDEOOUT_V30结构)
   */
  public static final int NET_DVR_GET_VIDEOOUTCFG_V30 = 1028;
  /**
   * 视频输出结构参数 (NET_DVR_VIDEOOUT_V30结构)
   */
  public static final int NET_DVR_SET_VIDEOOUTCFG_V30 = 1029;
  /**
   * 叠加字符结构参数 (NET_DVR_SHOWSTRING_V30结构)
   */
  public static final int NET_DVR_GET_SHOWSTRING_V30 = 1030;
  /**
   * 叠加字符结构参数 (NET_DVR_SHOWSTRING_V30结构)
   */
  public static final int NET_DVR_SET_SHOWSTRING_V30 = 1031;
  /**
   * 异常结构参数 (NET_DVR_EXCEPTION_V30结构)
   */
  public static final int NET_DVR_GET_EXCEPTIONCFG_V30 = 1034;
  /**
   * 异常结构参数 (NET_DVR_EXCEPTION_V30结构)
   */
  public static final int NET_DVR_SET_EXCEPTIONCFG_V30 = 1035;
  /**
   * 串口232结构参数 (NET_DVR_RS232CFG_V30结构)
   */
  public static final int NET_DVR_GET_RS232CFG_V30 = 1036;
  /**
   * 串口232结构参数 (NET_DVR_RS232CFG_V30结构)
   */
  public static final int NET_DVR_SET_RS232CFG_V30 = 1037;
  /**
   * 压缩参数 (NET_DVR_COMPRESSIONCFG_V30结构)
   */
  public static final int NET_DVR_GET_COMPRESSCFG_V30 = 1040;
  /**
   * 压缩参数 (NET_DVR_COMPRESSIONCFG_V30结构)
   */
  public static final int NET_DVR_SET_COMPRESSCFG_V30 = 1041;
  /**
   * 获取485解码器参数 (NET_DVR_DECODERCFG_V30结构): 获取解码器参数
   */
  public static final int NET_DVR_GET_DECODERCFG_V30 = 1042;
  /**
   * 获取485解码器参数 (NET_DVR_DECODERCFG_V30结构): 设置解码器参数
   */
  public static final int NET_DVR_SET_DECODERCFG_V30 = 1043;
  /**
   * 获取预览参数 (NET_DVR_PREVIEWCFG_V30结构): 获取预览参数
   */
  public static final int NET_DVR_GET_PREVIEWCFG_V30 = 1044;
  /**
   * 获取预览参数 (NET_DVR_PREVIEWCFG_V30结构): 设置预览参数
   */
  public static final int NET_DVR_SET_PREVIEWCFG_V30 = 1045;
  /**
   * 辅助预览参数 (NET_DVR_PREVIEWCFG_AUX_V30结构): 获取辅助预览参数
   */
  public static final int NET_DVR_GET_PREVIEWCFG_AUX_V30 = 1046;
  /**
   * 辅助预览参数 (NET_DVR_PREVIEWCFG_AUX_V30结构): 设置辅助预览参数
   */
  public static final int NET_DVR_SET_PREVIEWCFG_AUX_V30 = 1047;
  /**
   * IP接入配置参数 （NET_DVR_IPPARACFG结构）: 获取IP接入配置信息
   */
  public static final int NET_DVR_GET_IPPARACFG = 1048;
  /**
   * IP接入配置参数 （NET_DVR_IPPARACFG结构）: 设置IP接入配置信息
   */
  public static final int NET_DVR_SET_IPPARACFG = 1049;
  /**
   * IP报警输入接入配置参数 （NET_DVR_IPALARMINCFG结构）: 获取IP报警输入接入配置信息
   */
  public static final int NET_DVR_GET_IPALARMINCFG = 1050;
  /**
   * IP报警输入接入配置参数 （NET_DVR_IPALARMINCFG结构）: 设置IP报警输入接入配置信息
   */
  public static final int NET_DVR_SET_IPALARMINCFG = 1051;
  /**
   * IP报警输出接入配置参数 （NET_DVR_IPALARMOUTCFG结构）: 获取IP报警输出接入配置信息
   */
  public static final int NET_DVR_GET_IPALARMOUTCFG = 1052;
  /**
   * IP报警输出接入配置参数 （NET_DVR_IPALARMOUTCFG结构）: 设置IP报警输出接入配置信息
   */
  public static final int NET_DVR_SET_IPALARMOUTCFG = 1053;
  /**
   * 硬盘管理的参数获取 (NET_DVR_HDCFG结构): 获取硬盘管理配置参数
   */
  public static final int NET_DVR_GET_HDCFG = 1054;
  /**
   * 硬盘管理的参数获取 (NET_DVR_HDCFG结构): 设置硬盘管理配置参数
   */
  public static final int NET_DVR_SET_HDCFG = 1055;
  /**
   * 盘组管理的参数获取 (NET_DVR_HDGROUP_CFG结构): 获取盘组管理配置参数
   */
  public static final int NET_DVR_GET_HDGROUP_CFG = 1056;
  /**
   * 盘组管理的参数获取 (NET_DVR_HDGROUP_CFG结构): 设置盘组管理配置参数
   */
  public static final int NET_DVR_SET_HDGROUP_CFG = 1057;
  /**
   * 设备编码类型配置(NET_DVR_COMPRESSION_AUDIO结构): 获取设备语音对讲编码参数
   */
  public static final int NET_DVR_GET_COMPRESSCFG_AUD = 1058;
  /**
   * 设备编码类型配置(NET_DVR_COMPRESSION_AUDIO结构): 设置设备语音对讲编码参数
   */
  public static final int NET_DVR_SET_COMPRESSCFG_AUD = 1059;
  /* ************************** DS9000新增命令(_V30) end **************************** */

  /* ************************** 参数配置命令 end ************************************* */

  /**
   * 查找文件和日志函数返回值: 获得文件信息
   */
  public static final int NET_DVR_FILE_SUCCESS = 1000;
  /**
   * 查找文件和日志函数返回值: 没有文件
   */
  public static final int NET_DVR_FILE_NOFIND = 1001;
  /**
   * 查找文件和日志函数返回值: 正在查找文件
   */
  public static final int NET_DVR_ISFINDING = 1002;
  /**
   * 查找文件和日志函数返回值: 查找文件时没有更多的文件
   */
  public static final int NET_DVR_NOMOREFILE = 1003;
  /**
   * 查找文件和日志函数返回值: 查找文件时异常
   */
  public static final int NET_DVR_FILE_EXCEPTION = 1004;

  /* ********************回调函数类型 begin*********************** */
  /**
   * 8000报警信息主动上传
   */
  public static final int COMM_ALARM = 0x1100;
  /**
   * ATMDVR主动上传交易信息
   */
  public static final int COMM_TRADEINFO = 0x1500;
  /**
   * 9000报警信息主动上传
   */
  public static final int COMM_ALARM_V30 = 0x4000;
  /**
   * 9000设备IPC接入配置改变报警信息主动上传
   */
  public static final int COMM_IPCCFG = 0x4001;
  /**
   * 预览回调函数: 系统头数据
   */
  public static final int NET_DVR_SYSHEAD = 1;
  /**
   * 预览回调函数: 视频流数据（包括复合流和音视频分开的视频流数据）
   */
  public static final int NET_DVR_STREAMDATA = 2;
  /**
   * 预览回调函数: 音频流数据
   */
  public static final int NET_DVR_AUDIOSTREAMDATA = 3;
  /**
   * 预览回调函数: 标准视频流数据
   */
  public static final int NET_DVR_STD_VIDEODATA = 4;
  /**
   * 预览回调函数: 标准音频流数据
   */
  public static final int NET_DVR_STD_AUDIODATA = 5;
  /**
   * 回调预览中的状态和消息: 预览异常
   */
  public static final int NET_DVR_REALPLAYEXCEPTION = 111;
  /**
   * 回调预览中的状态和消息: 预览时连接断开
   */
  public static final int NET_DVR_REALPLAYNETCLOSE = 112;
  /**
   * 回调预览中的状态和消息: 预览5s没有收到数据
   */
  public static final int NET_DVR_REALPLAY5SNODATA = 113;
  /**
   * 回调预览中的状态和消息: 预览重连
   */
  public static final int NET_DVR_REALPLAYRECONNECT = 114;
  /**
   * 回放回调函数: 回放数据播放完毕
   */
  public static final int NET_DVR_PLAYBACKOVER = 101;
  /**
   * 回放回调函数: 回放异常
   */
  public static final int NET_DVR_PLAYBACKEXCEPTION = 102;
  /**
   * 回放回调函数: 回放时候连接断开
   */
  public static final int NET_DVR_PLAYBACKNETCLOSE = 103;
  /**
   * 回放回调函数: 回放5s没有收到数据
   */
  public static final int NET_DVR_PLAYBACK5SNODATA = 104;
  /* ********************回调函数类型 end*********************** */

  public static final int PARA_VIDEOOUT = 0x1;
  public static final int PARA_IMAGE = 0x2;
  public static final int PARA_ENCODE = 0x4;
  public static final int PARA_NETWORK = 0x8;
  public static final int PARA_ALARM = 0x10;
  public static final int PARA_EXCEPTION = 0x20;
  /**
   * 解码器
   */
  public static final int PARA_DECODER = 0x40;
  public static final int PARA_RS232 = 0x80;
  public static final int PARA_PREVIEW = 0x100;
  public static final int PARA_SECURITY = 0x200;
  public static final int PARA_DATETIME = 0x400;
  /**
   * 帧格式
   */
  public static final int PARA_FRAMETYPE = 0x800;
  /**
   * 行为规则
   */
  public static final int PARA_VCA_RULE = 0x1000;
  /**
   * SDK_V222  智能设备类型: 行为分析：DS6001-HF/B
   */
  public static final int DS6001_HF_B = 60;
  /**
   * SDK_V222  智能设备类型: 车牌识别：DS6001-HF/P
   */
  public static final int DS6001_HF_P = 61;
  /**
   * SDK_V222  智能设备类型: 双机跟踪：DS6002-HF/B
   */
  public static final int DS6002_HF_B = 62;
  /**
   * SDK_V222  智能设备类型: 行为分析：DS6101-HF/B
   */
  public static final int DS6101_HF_B = 63;
  /**
   * SDK_V222  智能设备类型: 智能分析仪
   */
  public static final int IVMS_2000 = 64;
  /**
   * SDK_V222  智能设备类型: 9000系列智能DVR
   */
  public static final int DS9000_IVS = 65;
  /**
   * SDK_V222  智能设备类型: 智能ATM, DS8004AHL-S/A
   */
  public static final int DS8004_AHL_A = 66;
  /**
   * SDK_V222  智能设备类型: 车牌识别：DS6101-HF/P
   */
  public static final int DS6101_HF_P = 67;
  //能力获取命令
  public static final int VCA_DEV_ABILITY = 0x100;//设备智能分析的总能力
  public static final int VCA_CHAN_ABILITY = 0x110;//行为分析能力

  /* ****************** 获取/设置大接口参数配置命令 ****************** */

  /**
   * 车牌识别（NET_VCA_PLATE_CFG）: 设置车牌识别参数
   */
  public static final int NET_DVR_SET_PLATECFG = 150;
  /**
   * 车牌识别（NET_VCA_PLATE_CFG）: 获取车牌识别参数
   */
  public static final int NET_DVR_GET_PLATECFG = 151;
  /**
   * 行为对应（NET_VCA_RULECFG）: 设置行为分析规则
   */
  public static final int NET_DVR_SET_RULECFG = 152;
  /**
   * 行为对应（NET_VCA_RULECFG）: 获取行为分析规则,
   */
  public static final int NET_DVR_GET_RULECFG = 153;
  /**
   * 双摄像机标定参数（NET_DVR_LF_CFG）: 设置双摄像机的配置参数
   */
  public static final int NET_DVR_SET_LF_CFG = 160;
  /**
   * 双摄像机标定参数（NET_DVR_LF_CFG）: 获取双摄像机的配置参数
   */
  public static final int NET_DVR_GET_LF_CFG = 161;
  /**
   * 智能分析仪取流配置结构: 设置智能分析仪取流参数
   */
  public static final int NET_DVR_SET_IVMS_STREAMCFG = 162;
  /**
   * 智能分析仪取流配置结构: 获取智能分析仪取流参数
   */
  public static final int NET_DVR_GET_IVMS_STREAMCFG = 163;
  /**
   * 智能控制参数结构: 设置智能控制参数
   */
  public static final int NET_DVR_SET_VCA_CTRLCFG = 164;
  /**
   * 智能控制参数结构: 获取智能控制参数
   */
  public static final int NET_DVR_GET_VCA_CTRLCFG = 165;
  /**
   * 屏蔽区域NET_VCA_MASK_REGION_LIST: 设置屏蔽区域参数
   */
  public static final int NET_DVR_SET_VCA_MASK_REGION = 166;
  /**
   * 屏蔽区域NET_VCA_MASK_REGION_LIST: 获取屏蔽区域参数
   */
  public static final int NET_DVR_GET_VCA_MASK_REGION = 167;
  /**
   * ATM进入区域 NET_VCA_ENTER_REGION: 设置进入区域参数
   */
  public static final int NET_DVR_SET_VCA_ENTER_REGION = 168;
  /**
   * ATM进入区域 NET_VCA_ENTER_REGION: 获取进入区域参数
   */
  public static final int NET_DVR_GET_VCA_ENTER_REGION = 169;
  /**
   * 标定线配置NET_VCA_LINE_SEGMENT_LIST: 设置标定线
   */
  public static final int NET_DVR_SET_VCA_LINE_SEGMENT = 170;
  /**
   * 标定线配置NET_VCA_LINE_SEGMENT_LIST: 获取标定线
   */
  public static final int NET_DVR_GET_VCA_LINE_SEGMENT = 171;
  /**
   * ivms屏蔽区域NET_IVMS_MASK_REGION_LIST: 设置IVMS屏蔽区域参数
   */
  public static final int NET_DVR_SET_IVMS_MASK_REGION = 172;
  /**
   * ivms屏蔽区域NET_IVMS_MASK_REGION_LIST: 获取IVMS屏蔽区域参数
   */
  public static final int NET_DVR_GET_IVMS_MASK_REGION = 173;
  /**
   * ivms进入检测区域NET_IVMS_ENTER_REGION: 设置IVMS进入区域参数
   */
  public static final int NET_DVR_SET_IVMS_ENTER_REGION = 174;
  /**
   * ivms进入检测区域NET_IVMS_ENTER_REGION: 获取IVMS进入区域参数
   */
  public static final int NET_DVR_GET_IVMS_ENTER_REGION = 175;
  /**
   * ivms进入检测区域NET_IVMS_ENTER_REGION: 设置智能分析仪行为规则参数
   */
  public static final int NET_DVR_SET_IVMS_BEHAVIORCFG = 176;
  /**
   * ivms进入检测区域NET_IVMS_ENTER_REGION: 获取智能分析仪行为规则参数
   */
  public static final int NET_DVR_GET_IVMS_BEHAVIORCFG = 177;

  public static final int ACS_CARD_NO_LEN = 32;
  public static final int CARD_PASSWORD_LEN = 8;
  public static final int MAX_DOOR_NUM = 32;
  public static final int MAX_CARD_RIGHT_PLAN_NUM = 4;
  public static final int MAX_CHANNUM_V40 = 512;
  public static final int MAX_MULTI_AREA_NUM = 24;
  public static final int COMM_ISAPI_ALARM = 0x6009;
}
