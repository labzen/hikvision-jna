package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.library.internal.Configuration;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * 透传接口输出参数结构体
 * <p/>
 * <ul>
 *   <li>对于不同的协议功能（{@link NET_DVR_XML_CONFIG_INPUT}结构体中的lpRequestUrl输入的URL命令），lpOutBuffer对应不同的内容，
 *   详见{@link Configuration#NET_DVR_STDXMLConfig(int, NET_DVR_XML_CONFIG_INPUT, NET_DVR_XML_CONFIG_OUTPUT)}接口中"Remarks"说明。 </li>
 *   <li>{@link Configuration#NET_DVR_STDXMLConfig(int, NET_DVR_XML_CONFIG_INPUT, NET_DVR_XML_CONFIG_OUTPUT)}接口是直接透传的ISAPI协议命令，
 *   输出参数信息的详细内容可以参考ISAPI协议文档。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "lpOutBuffer",
                       "dwOutBufferSize",
                       "dwReturnedXMLSize",
                       "lpStatusBuffer",
                       "dwStatusSize",
                       "byRes"})
public class NET_DVR_XML_CONFIG_OUTPUT extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 输出参数缓冲区，XML格式
   */
  public Pointer lpOutBuffer;
  /**
   * 输出参数缓冲区大小(内存大小)
   */
  public int dwOutBufferSize;
  /**
   * 实际输出的XML内容大小
   */
  public int dwReturnedXMLSize;
  /**
   * 返回的状态参数(XML格式),获取命令成功时不会赋值,如果不需要,可以置NULL
   */
  public Pointer lpStatusBuffer;
  /**
   * 状态缓冲区大小(内存大小)
   */
  public int dwStatusSize;
  /**
   * 保留
   */
  public byte[] byRes = new byte[32];
}
