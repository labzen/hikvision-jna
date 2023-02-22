package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_SERIAL_PORT;

/**
 * RS232串口参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struRs232",
                       "struPPPConfig"})
public class NET_DVR_RS232CFG_V30 extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * RS232串口参数，数组下标（+1）表示串口号
   */
  public NET_DVR_SINGLE_RS232[] struRs232 = new NET_DVR_SINGLE_RS232[MAX_SERIAL_PORT];
  /**
   * PPP参数
   */
  public NET_DVR_PPPCFG_V30 struPPPConfig;

}
