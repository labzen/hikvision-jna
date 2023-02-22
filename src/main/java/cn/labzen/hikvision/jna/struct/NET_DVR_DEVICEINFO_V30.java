package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.SERIALNO_LEN;

@Structure.FieldOrder({"sSerialNumber",
                       "byAlarmInPortNum",
                       "byAlarmOutPortNum",
                       "byDiskNum",
                       "byDVRType",
                       "byChanNum",
                       "byStartChan",
                       "byAudioChanNum",
                       "byIPChanNum",
                       "byZeroChanNum",
                       "byMainProto",
                       "bySubProto",
                       "bySupport",
                       "bySupport1",
                       "bySupport2",
                       "wDevType",
                       "bySupport3",
                       "byMultiStreamProto",
                       "byStartDChan",
                       "byStartDTalkChan",
                       "byHighDChanNum",
                       "bySupport4",
                       "byLanguageType",
                       "byVoiceInChanNum",
                       "byStartVoiceInChanNo",
                       "bySupport5",
                       "bySupport6",
                       "byMirrorChanNum",
                       "wStartMirrorChanNo",
                       "bySupport7",
                       "byRes2"})
public class NET_DVR_DEVICEINFO_V30 extends Structure {

  /**
   * 序列号
   */
  public byte[] sSerialNumber = new byte[SERIALNO_LEN];
  /**
   * 报警输入个数
   */
  public byte byAlarmInPortNum;
  /**
   * 报警输出个数
   */
  public byte byAlarmOutPortNum;
  /**
   * 硬盘个数
   */
  public byte byDiskNum;
  /**
   * 设备类型, 1:DVR 2:ATM DVR 3:DVS ......
   */
  public byte byDVRType;
  /**
   * 设备模拟通道个数，数字（IP）通道最大个数为byIPChanNum + byHighDChanNum*256
   */
  public byte byChanNum;
  /**
   * 模拟通道的起始通道号，从1开始。数字通道的起始通道号见下面参数byStartDChan
   */
  public byte byStartChan;
  /**
   * 设备语音对讲通道数
   */
  public byte byAudioChanNum;
  /**
   * 设备最大数字通道个数，低8位，高8位见byHighDChanNum。
   * 可以根据IP通道个数来判断是否调用NET_DVR_GetDVRConfig
   * （配置命令NET_DVR_GET_IPPARACFG_V40）获取模拟和数字通道相关参数（NET_DVR_IPPARACFG_V40）。
   */
  public byte byIPChanNum;
  /**
   * 零通道编码个数
   */
  public byte byZeroChanNum;
  /**
   * 主码流传输协议类型：0- private，1- rtsp，2- 同时支持私有协议和rtsp协议取流（默认采用私有协议取流）
   */
  public byte byMainProto;
  /**
   * 子码流传输协议类型：0- private，1- rtsp，2- 同时支持私有协议和rtsp协议取流（默认采用私有协议取流）
   */
  public byte bySubProto;
  /**
   * 能力，位与结果为0表示不支持，1表示支持
   * <ul>
   * <li>bySupport & 0x1，表示是否支持智能搜索</li>
   * <li>bySupport & 0x2，表示是否支持备份</li>
   * <li>bySupport & 0x4，表示是否支持压缩参数能力获取</li>
   * <li>bySupport & 0x8, 表示是否支持双网卡</li>
   * <li>bySupport & 0x10, 表示支持远程SADP</li>
   * <li>bySupport & 0x20, 表示支持Raid卡功能</li>
   * <li>bySupport & 0x40, 表示支持IPSAN目录查找</li>
   * <li>bySupport & 0x80, 表示支持rtp over rtsp</li>
   * </ul>
   */
  public byte bySupport;
  /**
   * 能力集扩充，位与结果为0表示不支持，1表示支持
   * <ul>
   * <li>bySupport1 & 0x1, 表示是否支持snmp v30</li>
   * <li>bySupport1 & 0x2, 表示是否支持区分回放和下载</li>
   * <li>bySupport1 & 0x4, 表示是否支持布防优先级</li>
   * <li>bySupport1 & 0x8, 表示智能设备是否支持布防时间段扩展</li>
   * <li>bySupport1 & 0x10,表示是否支持多磁盘数（超过33个）</li>
   * <li>bySupport1 & 0x20,表示是否支持rtsp over http</li>
   * <li>bySupport1 & 0x80,表示是否支持车牌新报警信息，且还表示是否支持NET_DVR_IPPARACFG_V40配置</li>
   * </ul>
   */
  public byte bySupport1;
  /**
   * 能力集扩充，位与结果为0表示不支持，1表示支持
   * <ul>
   * <li>bySupport2 & 0x1, 表示解码器是否支持通过URL取流解码</li>
   * <li>bySupport2 & 0x2, 表示是否支持FTPV40</li>
   * <li>bySupport2 & 0x4, 表示是否支持ANR(断网录像)</li>
   * <li>bySupport2 & 0x8,  表示支持CCD的通道参数配置</li>
   * <li>bySupport2 & 0x10,  表示支持布防报警回传信息（仅支持抓拍机报警 新老报警结构）</li>
   * <li>bySupport2 & 0x20, 表示是否支持单独获取设备状态子项</li>
   * <li>bySupport2 & 0x40, 表示是否是码流加密设备 </li>
   * </ul>
   */
  public byte bySupport2;
  /**
   * 设备型号
   */
  public short wDevType;
  /**
   * 能力集扩展，位与结果：0- 不支持，1- 支持
   * <ul>
   * <li>bySupport3 & 0x1 表示是否支持批量配置多码流参数</li>
   * <li>bySupport3 & 0x4 表示支持按组配置， 具体包含 通道图像参数、报警输入参数、IP报警输入、输出接入参数、用户参数、设备工作状态、JPEG抓图、定时和时间抓图、硬盘盘组管理</li>
   * <li>bySupport3 & 0x8 表示支持使用TCP预览、UDP预览、多播预览中的"延时预览"字段来请求延时预览（后续都将使用这种方式请求延时预览）。
   * 而当bySupport3 & 0x8为0时，将使用"私有延时预览"协议。</li>
   * <li>bySupport3 & 0x10 表示支持"获取报警主机主要状态（V40）"。</li>
   * <li>bySupport3 & 0x20 表示是否支持通过DDNS域名解析取流</li>
   * </ul>
   */
  public byte bySupport3;
  /**
   * 是否支持多码流，按位表示，位与结果：0-不支持，1-支持
   * <ul>
   * <li>byMultiStreamProto & 0x1, 表示是否支持码流3</li>
   * <li>byMultiStreamProto & 0x2, 表示是否支持码流4</li>
   * <li>byMultiStreamProto & 0x40,表示是否支持主码流</li>
   * <li>byMultiStreamProto & 0x80,表示是否支持子码流</li>
   * </ul>
   */
  public byte byMultiStreamProto;
  /**
   * 起始数字通道号，0表示无数字通道，比如DVR或IPC
   */
  public byte byStartDChan;
  /**
   * 起始数字对讲通道号，区别于模拟对讲通道号，0表示无数字对讲通道
   */
  public byte byStartDTalkChan;
  /**
   * 数字通道个数，高8位
   */
  public byte byHighDChanNum;
  /**
   * 能力集扩展，按位表示，位与结果：0- 不支持，1- 支持
   * <ul>
   * <li>bySupport4 & 0x01, 表示是否所有码流类型同时支持RTSP和私有协议</li>
   * <li>bySupport4 & 0x10, 表示是否支持域名方式挂载网络硬盘</li>
   * </ul>
   */
  public byte bySupport4;
  /**
   * 支持语种能力，按位表示，位与结果：0- 不支持，1- 支持
   * <ul>
   * <li>byLanguageType ==0，表示老设备，不支持该字段</li>
   * <li>byLanguageType & 0x1，表示是否支持中文</li>
   * <li>byLanguageType & 0x2，表示是否支持英文</li>
   * </ul>
   */
  public byte byLanguageType;
  /**
   * 音频输入通道数
   */
  public byte byVoiceInChanNum;
  /**
   * 音频输入起始通道号，0表示无效
   */
  public byte byStartVoiceInChanNo;
  /**
   * 能力集扩展，按位表示,0-不支持,1-支持,bit0-支持多码流
   * <ul>
   * <li>bySupport5 &0x01表示支持wEventTypeEx ,兼容dwEventType 的事件类型（支持行为事件扩展）--先占住，防止冲突</li>
   * <li>bySupport5 &0x04表示是否支持使用扩展的场景模式接口</li>
   * <li>bySupport5 &0x08 设备返回该值表示是否支持计划录像类型V40接口协议(DVR_SET_RECORDCFG_V40/ DVR_GET_RECORDCFG_V40)
   * (在该协议中设备支持类型类型13的配置)之前的部分发布的设备，支持录像类型13，则配置录像类型13。
   * 如果不支持，统一转换成录像类型3兼容处理。SDK通过命令探测处理)</li>
   * <li>bySupport5 &0x10 设备返回改值表示支持超过255个预置点</li>
   * </ul>
   */
  public byte bySupport5;
  /**
   * 能力集扩展，按位表示，0-不支持,1-支持
   * <ul>
   * <li>bySupport6 0x1  表示设备是否支持压缩</li>
   * <li>bySupport6 0x2 表示是否支持流ID方式配置流来源扩展命令，DVR_SET_STREAM_SRC_INFO_V40</li>
   * <li>bySupport6 0x4 表示是否支持事件搜索V40接口</li>
   * <li>bySupport6 0x8 表示是否支持扩展智能侦测配置命令</li>
   * <li>bySupport6 0x40表示图片查询结果V40扩展</li>
   * </ul>
   */
  public byte bySupport6;
  /**
   * 镜像通道个数，录播主机中用于表示导播通道
   */
  public byte byMirrorChanNum;
  /**
   * 起始镜像通道号
   */
  public short wStartMirrorChanNo;
  /**
   * 能力集扩展,按位表示,0-不支持,1-支持
   * <ul>
   * <li>bySupport7 & 0x1  表示设备是否支持 INTER_VCA_RULECFG_V42 扩展</li>
   * <li>bySupport7 & 0x2  表示设备是否支持 IPC HVT 模式扩展</li>
   * <li>bySupport7 & 0x04  表示设备是否支持 返回锁定时间</li>
   * <li>bySupport7 & 0x08  表示设置云台PTZ位置时，是否支持带通道号</li>
   * <li>bySupport7 & 0x10  表示设备是否支持双系统升级备份</li>
   * <li>bySupport7 & 0x20  表示设备是否支持 OSD字符叠加 V50</li>
   * <li>bySupport7 & 0x40  表示设备是否支持 主从跟踪（从摄像机）</li>
   * <li>bySupport7 & 0x80  表示设备是否支持 报文加密</li>
   * </ul>
   */
  public byte bySupport7;
  /**
   * 保留，置为0
   */
  public byte byRes2;

}
