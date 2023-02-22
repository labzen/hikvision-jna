package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.library.internal.Configuration;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * 透传接口输入参数结构体
 * <p/>
 * <ul>
 *   <li>对于不同的协议功能（lpRequestUrl输入的URL命令），lpInBuffer对应不同的内容，
 *   详见{@link Configuration#NET_DVR_STDXMLConfig(int, NET_DVR_XML_CONFIG_INPUT, NET_DVR_XML_CONFIG_OUTPUT)}接口中"Remarks"说明。 </li>
 *   <li>{@link Configuration#NET_DVR_STDXMLConfig(int, NET_DVR_XML_CONFIG_INPUT, NET_DVR_XML_CONFIG_OUTPUT)}接口是直接透传的ISAPI协议命令，
 *   该结构体中的请求信令以及输入参数信息的详细内容可以参考ISAPI协议文档。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "lpRequestUrl",
                       "dwRequestUrlLen",
                       "lpInBuffer",
                       "dwInBufferSize",
                       "dwRecvTimeOut",
                       "byForceEncrpt",
                       "byNumOfMultiPart",
                       "byRes"})
public class NET_DVR_XML_CONFIG_INPUT extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 请求信令，字符串格式
   */
  public Pointer lpRequestUrl;
  /**
   * 请求信令长度，字符串长度
   */
  public int dwRequestUrlLen;
  /**
   * 输入参数缓冲区，XML格式
   */
  public Pointer lpInBuffer;
  /**
   * 输入参数缓冲区大小
   */
  public int dwInBufferSize;
  /**
   * 接收超时时间，单位：ms，填0则使用默认超时5s
   */
  public int dwRecvTimeOut;
  /**
   * 是否强制加密，0-否，1-是
   */
  public byte byForceEncrpt;
  /**
   * 0-无效，其他值表示报文分段个数，非零时lpInBuffer传入的是NET_DVR_MIME_UNIT结构体数组的指针，该值即代表结构体个数
   */
  public byte byNumOfMultiPart;
  /**
   * 保留
   */
  public byte[] byRes = new byte[30];
}
