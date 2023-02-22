package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.DeviceModel;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 设备参数结构体
 * <p/>
 * <ul>
 *   <li>byStorageMode的三种存储模式互斥，三者选一：如果设置了盘组模式，可以进行盘组配置（NET_DVR_HDGROUP_CFG
 *   ）；如果设置了配额模式，可以进行磁盘配额配置（NET_DVR_DISK_QUOTA_CFG）；如果设置了抽帧模式，
 *   可以进行抽帧通道磁盘配额配置（NET_DVR_DRAWFRAME_DISK_QUOTA_CFG）。 </li>
 *   <li>如果byDVRType是0，则接口中解析wDevType作为设备型号，设备端同时将设备型号的名称传过来。如果byDVRType不是0，则接口中将不解析wDevType及byDevTypeName
 *   ，使用已有的设备型号及名称对byDVRType、wDevType、byDevTypeName进行填充，其中byDVRType=wDevType。建议开发时使用wDevType、byDevTypeName，而不要使用byDVRType，sdk内部兼容。 </li>
 * </ul>
 * TODO NET_DVR_DISK_QUOTA_CFG 等
 */
@Structure.FieldOrder({"dwSize",
                       "sDVRName",
                       "dwDVRID",
                       "dwRecycleRecord",
                       "sSerialNumber",
                       "dwSoftwareVersion",
                       "dwSoftwareBuildDate",
                       "dwDSPSoftwareVersion",
                       "dwDSPSoftwareBuildDate",
                       "dwPanelVersion",
                       "dwHardwareVersion",
                       "byAlarmInPortNum",
                       "byAlarmOutPortNum",
                       "byRS232Num",
                       "byRS485Num",
                       "byNetworkPortNum",
                       "byDiskCtrlNum",
                       "byDiskNum",
                       "byDVRType",
                       "byChanNum",
                       "byStartChan",
                       "byDecordChans",
                       "byVGANum",
                       "byUSBNum",
                       "byAuxoutNum",
                       "byAudioNum",
                       "byIPChanNum",
                       "byZeroChanNum",
                       "bySupport",
                       "byEsataUseage",
                       "byIPCPlug",
                       "byStorageMode",
                       "bySupport1",
                       "wDevType",
                       "byDevTypeName",
                       "bySupport2",
                       "byAnalogAlarmInPortNum",
                       "byStartAlarmInNo",
                       "byStartAlarmOutNo",
                       "byStartIPAlarmInNo",
                       "byStartIPAlarmOutNo",
                       "byHighIPChanNum",
                       "byEnableRemotePowerOn",
                       "wDevClass",
                       "byRes2"})
public class NET_DVR_DEVICECFG_V40 extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 设备名称
   */
  public byte[] sDVRName = new byte[NAME_LEN];
  /**
   * 设备ID号，用于遥控器，v1.4的设备号范围为(0~99), v1.5及以上版本的设备号为(1~255)
   */
  public int dwDVRID;
  /**
   * 是否循环录像,0:不是; 1:是
   */
  public int dwRecycleRecord;
  /**
   * 序列号
   */
  public byte[] sSerialNumber = new byte[SERIALNO_LEN];
  /**
   * 软件版本号,设备最高8位为主版本号，次高8位为次版本号，低16位为修复版本号，例如：0x05050000表示V5.5.0
   */
  public int dwSoftwareVersion;
  /**
   * 软件生成日期，高16位表示年份（需要加2000），次8位表示月份，最后8位表示日期，例如：0x0011090e表示build20170914
   */
  public int dwSoftwareBuildDate;
  /**
   * DSP软件版本，高16位是主版本，低16位是次版本
   */
  public int dwDSPSoftwareVersion;
  /**
   * DSP软件生成日期，高16位表示年份（需要加2000），次8位表示月份，最后8位表示日期
   */
  public int dwDSPSoftwareBuildDate;
  /**
   * 前面板版本，高16位是主版本，低16位是次版本
   */
  public int dwPanelVersion;
  /**
   * 硬件版本，高16位是主版本，低16位是次版本
   */
  public int dwHardwareVersion;
  /**
   * 设备模拟报警输入个数
   */
  public byte byAlarmInPortNum;
  /**
   * 设备模拟报警输出个数
   */
  public byte byAlarmOutPortNum;
  /**
   * 设备232串口个数
   */
  public byte byRS232Num;
  /**
   * 设备485串口个数
   */
  public byte byRS485Num;
  /**
   * 网络口个数
   */
  public byte byNetworkPortNum;
  /**
   * 设备硬盘控制器个数
   */
  public byte byDiskCtrlNum;
  /**
   * 设备硬盘个数
   */
  public byte byDiskNum;
  /**
   * 设备类型，参考{@link DeviceModel}
   */
  public byte byDVRType;
  /**
   * 设备模拟通道个数
   */
  public byte byChanNum;
  /**
   * 模拟通道的起始通道号
   */
  public byte byStartChan;
  /**
   * 设备解码路数
   */
  public byte byDecordChans;
  /**
   * VGA口的个数
   */
  public byte byVGANum;
  /**
   * USB口的个数
   */
  public byte byUSBNum;
  /**
   * 辅口的个数
   */
  public byte byAuxoutNum;
  /**
   * 语音口的个数
   */
  public byte byAudioNum;
  /**
   * 最大数字通道数 低8位，高8位见byHighIPChanNum
   */
  public byte byIPChanNum;
  /**
   * 零通道编码个数
   */
  public byte byZeroChanNum;
  /**
   * 能力，位与结果为0表示不支持，1表示支持<br/>
   * bySupport & 0x1，表示是否支持智能搜索<br/>
   * bySupport & 0x2，表示是否支持备份<br/>
   * bySupport & 0x4，表示是否支持压缩参数能力获取<br/>
   * bySupport & 0x8，表示是否支持双网卡<br/>
   * bySupport & 0x10，表示支持远程SADP<br/>
   * bySupport & 0x20，表示支持Raid卡功能<br/>
   * bySupport & 0x40，表示支持IPSAN搜索<br/>
   * bySupport & 0x80，表示支持rtp over rtsp
   */
  public byte bySupport;
  /**
   * Esata的默认用途，0-默认备份，1-默认录像
   */
  public byte byEsataUseage;
  /**
   * 0-关闭即插即用，1-打开即插即用
   */
  public byte byIPCPlug;
  /**
   * 存储模式：0-盘组模式,1-磁盘配额, 2抽帧模式, 3-自动
   */
  public byte byStorageMode;
  /**
   * 能力集扩充，位与结果：0表示不支持，1表示支持<br/>
   * bySupport1 & 0x1, 表示是否支持snmp v30<br/>
   * bySupport1 & 0x2, 支持区分回放和下载
   */
  public byte bySupport1;
  /**
   * 设备型号，参考{@link DeviceModel}
   */
  public short wDevType;
  /**
   * 设备型号名称
   */
  public byte[] byDevTypeName = new byte[DEV_TYPE_NAME_LEN];
  /**
   * 能力集扩充，位与结果：0表示不支持，1表示支持<br/>
   * bySupport2 & 0x1, 表示是否支持是否支持扩展的OSD字符叠加(终端和抓拍机扩展区分)
   */
  public byte bySupport2;
  /**
   * 模拟报警输入个数
   */
  public byte byAnalogAlarmInPortNum;
  /**
   * 模拟报警输入起始号
   */
  public byte byStartAlarmInNo;
  /**
   * 模拟报警输出起始号
   */
  public byte byStartAlarmOutNo;
  /**
   * IP报警输入起始号，0表示参数无效
   */
  public byte byStartIPAlarmInNo;
  /**
   * IP报警输出起始号，0表示参数无效
   */
  public byte byStartIPAlarmOutNo;
  /**
   * 最大数字通道高8位，低8位见byIPChanNum
   */
  public byte byHighIPChanNum;
  /**
   * 是否启用在设备休眠的状态下远程开机功能：0- 不启用，1- 启用
   */
  public byte byEnableRemotePowerOn;
  /**
   * 设备大类，判断设备是属于哪个产品线：0-保留，1~50表示DVR，51~100表示DVS，101~150表示NVR，151~200表示IPC，65534表示其他类型
   * 其他，具体分类方法见《设备类型对应序列号和类型值.docx》
   */
  public short wDevClass;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[6];

}
