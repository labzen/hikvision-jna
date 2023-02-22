package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * RS485(云台解码器)参数结构体
 */
@Structure.FieldOrder({"wSize",
                       "dwBaudRate",
                       "byDataBit",
                       "byStopBit",
                       "byParity",
                       "byFlowcontrol",
                       "wDecoderType",
                       "wDecoderAddress",
                       "bySetPreset",
                       "bySetCruise",
                       "bySetTrack",
                       "bySerialNO",
                       "byWorkMode",
                       "byRes"})
public class NET_DVR_DECODERCFG_V40 extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 波特率 0－50，1－75，2－110，3－150，4－300，5－600，6－1200，7－2400，8－4800，9－9600，10－19200，
   * 11－38400，12－57600，13－76800，14－115.2k;
   */
  public int dwBaudRate;
  /**
   * 数据有几位 0－5位，1－6位，2－7位，3－8位;
   */
  public byte byDataBit;
  /**
   * 停止位 0－1位，1－2位
   */
  public byte byStopBit;
  /**
   * 校验 0－无校验，1－奇校验，2－偶校验
   */
  public byte byParity;
  /**
   * 0－无，1－软流控,2-硬流控
   */
  public byte byFlowcontrol;
  /**
   * 解码器类型，通过NET_DVR_GetPTZProtocol获取，该值对应于结构NET_DVR_PTZ_PROTOCOL中的dwType
   * TODO
   */
  public short wDecoderType;
  /**
   * 解码器地址，0-255
   */
  public short wDecoderAddress;
  /**
   * 预置点是否设置,0-没有设置,1-设置
   */
  public byte[] bySetPreset = new byte[MAX_PRESET_V30];
  /**
   * 巡航是否设置: 0-没有设置,1-设置
   */
  public byte[] bySetCruise = new byte[MAX_CRUISE_V30];
  /**
   * 轨迹是否设置,0-没有设置,1-设置
   */
  public byte[] bySetTrack = new byte[MAX_TRACK_V30];
  /**
   * 串口编号
   */
  public byte bySerialNO;
  /**
   * 工作模式， 1-矩阵串口控制，2-屏幕控制，3-透明通道模式 4-PPP模式 5-控制台模式 6-串口直连 7-键盘控制
   * 8-监控板管理 9-控制云台  12-LED显示，13-触发抓拍数据传输
   */
  public byte byWorkMode;
  /**
   * 保留
   */
  public byte[] byRes = new byte[254];

}
