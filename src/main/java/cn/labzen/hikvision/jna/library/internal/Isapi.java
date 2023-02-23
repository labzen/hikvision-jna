package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.struct.NET_DVR_XML_CONFIG_INPUT;
import cn.labzen.hikvision.jna.struct.NET_DVR_XML_CONFIG_OUTPUT;

/**
 * xx - ISAPI相关功能接口
 * <ul>
 *   <li>{@link #NET_DVR_STDXMLConfig(int, NET_DVR_XML_CONFIG_INPUT, NET_DVR_XML_CONFIG_OUTPUT)}</li>
 * </ul>
 */
@Deprecated
public interface Isapi {

  /**
   * 16.1 - [协议透传]： ISAPI协议命令透传
   * <p/>
   * <font style="color: yellow; font-weight:bold">
   * 本接口在不同设备下、不同功能下通用，具体参数取值请参考海康开发手册，情况太多，命令枚举可能会有不全
   * </font>
   * <p/>
   * <ul>
   *   <li>通过该接口可以直接透传ISAPI协议命令，实现参数配置、能力集获取等功能。
   *   调用该接口需要设备支持ISAPI协议（PUT、GET、POST、DELETE等命令），发送的命令内容请参考ISAPI协议文档。 </li>
   *   <li>我司设备有DVR、混合型DVR、NVR、网络摄像机等，通道有两种类型：模拟通道和IP通道（数字通道，
   *   针对混合型DVR和NVR设备）。对于使用SDK私有协议对接时需要区分通道类型，不同的通道类型起始通道号不一样，
   *   比如混合型DVR和64路以下的NVR的IP通道的通道号是从33开始的
   *   （NET_DVR_Login_V40登录设备返回的设备信息NET_DVR_DEVICEINFO_V30里面可以获取模拟通道个数（byChanNum）、
   *   模拟通道起始通道号（byStartChan）和设备支持的最大IP通道数（byIPChanNum+ byHighDChanNum*256）、
   *   数字通道起始通道号（byStartDChan））。但是透传ISAPI协议的NET_DVR_STDXMLConfig这个接口传入的URL命令
   *   和XML、JSON数据里面通道号不区分模拟还是数字通道，起始通道号都是1，按顺序递增。因此，不同接口对接存在通道号
   *   不一致的问题，需要调用NET_DVR_SDKChannelToISAPI接口进行转换。 </li>
   * </ul>
   *
   * @param lUserID       [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpInputParam  [in] 输入参数
   * @param lpOutputParam [in&out] 输出参数
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_STDXMLConfig(int lUserID,
                               NET_DVR_XML_CONFIG_INPUT lpInputParam,
                               NET_DVR_XML_CONFIG_OUTPUT lpOutputParam);
}
