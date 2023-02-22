package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 前端设备信息结构体
 * <p/>
 * <ul>
 *   <li>当接入设备(IPC/DVR/DVS/IVMS等)的模拟通道报警时，struDevIP、wPort为接入设备的IP地址和端口号，byChannel、
 *   byIvmsChannel均为报警对应模拟通道的通道号。 </li>
 *   <li>当接入设备(HDVR/NVR/IVMS)的数字通道（IP通道）报警时，struDevIP、wPort、byChannel表示数字通道前端接入设备的IP、
 *   端口和通道号，byIvmsChannel为数字通道。如图，B1设备通道1和B2设备的通道1、2分别接入A作为通道1、2、3。则struDevIP、wPort、
 *   byChannel表示的是B1或者B2的IP地址、端口号和通道号，byIvmsChannel表示A设备自己的数字通道号。
 *   比如B2设备的通道2发生了行为分析报警信息，则SDK接收到的报警信息中，则struDevIP=192.168.0.12，wPort=8002，
 *   byChannel=2，byIvmsChannel=3。</li>
 * </ul>
 */
@Structure.FieldOrder({"struDevIP",
                       "wPort",
                       "byChannel",
                       "byIvmsChannel"})
public class NET_VCA_DEV_INFO extends Structure {

  /**
   * 前端设备地址，
   */
  public NET_DVR_IPADDR struDevIP;
  /**
   * 前端设备端口号，
   */
  public short wPort;
  /**
   * 报警通道对应设备的通道号，参数值即表示通道号。比如，byChannel=1，表示通道1。
   */
  public byte byChannel;
  /**
   * Ivms 通道
   */
  public byte byIvmsChannel;
}
