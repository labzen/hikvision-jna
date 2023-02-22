package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * RS232串口参数子结构体
 */
@Structure.FieldOrder({"dwBaudRate",
                       "byDataBit",
                       "byStopBit",
                       "byParity",
                       "byFlowcontrol",
                       "dwWorkMode"})
public class NET_DVR_SINGLE_RS232 extends Structure {

  /**
   * 波特率(bps)，0－50，1－75，2－110，3－150，4－300，5－600，6－1200，7－2400，8－4800，
   * 9－9600，10－19200， 11－38400，12－57600，13－76800，14－115.2k;
   */
  public int dwBaudRate;
  /**
   * 数据有几位 0－5位，1－6位，2－7位，3－8位
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
   * 工作模式，0－232串口用于PPP拨号，1－232串口用于参数控制，2－透明通道 3- ptz模式,审讯温湿度传感器,
   * 4-报警盒模式  5-矩阵串口控制 6-屏幕控制 7-串口直连 8-键盘控制 9-监控板管理 10-控制云台
   */
  public int dwWorkMode;

}
