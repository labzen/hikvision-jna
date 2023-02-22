package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.Constants;
import cn.labzen.hikvision.jna.callback.REALDATACALLBACK;
import cn.labzen.hikvision.jna.library.internal.Configuration;
import cn.labzen.hikvision.jna.library.internal.Preview;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.ptr.IntByReference;

/**
 * 预览参数结构体
 * <p/>
 * <ul>
 *   <li>dwStreamType(码流类型)、dwLinkMode(连接方式)、bPassbackRecord(录像回传)、byPreviewMode(延迟预览模式)、
 *   byStreamID(流ID)这些参数的取值需要设备支持。 </li>
 *   <li>{@link Preview#NET_DVR_RealPlay_V40(int, NET_DVR_PREVIEWINFO, REALDATACALLBACK, Pointer)}支持
 *   多播方式预览（dwLinkMode设为2），不需要传多播组地址，底层自动从设备获取已配置的多播组地址
 *   （NET_DVR_NETCFG_V50中的参数struMulticastIpAddr）并以该多播组地址实现多播。 </li>
 *   TODO NET_DVR_NETCFG_V50
 *   <li>设备码流类型详细介绍可以参考“帮助”->“常见问题解答”中的Question 33。 </li>
 * </ul>
 */
@Structure.FieldOrder({"lChannel",
                       "dwStreamType",
                       "dwLinkMode",
                       "hPlayWnd",
                       "bBlocked",
                       "bPassbackRecord",
                       "byPreviewMode",
                       "byStreamID",
                       "byProtoType",
                       "byRes1",
                       "byVideoCodingType",
                       "dwDisplayBufNum",
                       "byNPQMode",
                       "byRes"})
public class NET_DVR_PREVIEWINFO extends Structure {

  /**
   * 通道号，目前设备模拟通道号从1开始，数字通道的起始通道号通过{@link Configuration#NET_DVR_GetDVRConfig(int, int, int, Pointer, int, IntByReference)})
   * （配置命令NET_DVR_GET_IPPARACFG_V40）获取（dwStartDChan）
   * TODO NET_DVR_GET_IPPARACFG_V40
   */
  public NativeLong lChannel;
  /**
   * 码流类型：0-主码流，1-子码流，2-三码流，3-虚拟码流，以此类推
   */
  public int dwStreamType;
  /**
   * 连接方式：0- TCP方式，1- UDP方式，2- 多播方式，3- RTP方式，4- RTP/RTSP，5- RTP/HTTP，6- HRUDP（可靠传输）
   */
  public int dwLinkMode;
  /**
   * 播放窗口的句柄,为NULL表示不播放图象
   */
  public WinDef.HWND hPlayWnd;
  /**
   * 0-非阻塞取流, 1-阻塞取流
   * <p/>
   * 若设为不阻塞，表示发起与设备的连接就认为连接成功，如果发生码流接收失败、播放失败等情况以预览异常的方式通知上层。
   * 在循环播放的时候可以减短停顿的时间，与NET_DVR_RealPlay处理一致。若设为阻塞，表示直到播放操作完成才返回成功与否，
   * 网络异常时SDK内部connect失败将会有5s的超时才能够返回，不适合于轮询取流操作
   */
  public int bBlocked;
  /**
   * 是否启用录像回传：0-不启用录像回传，1-启用录像回传。ANR断网补录功能，
   * 客户端和设备之间网络异常恢复之后自动将前端数据同步过来，需要设备支持
   */
  public int bPassbackRecord;
  /**
   * 预览模式，0-正常预览，1-延迟预览
   */
  public byte byPreviewMode;
  /**
   * 流ID，为字母、数字和"_"的组合，lChannel为0xffffffff时启用此参数
   */
  public byte[] byStreamID = new byte[Constants.STREAM_ID_LEN];
  /**
   * 应用层取流协议，0-私有协议，1-RTSP协议
   * <p/>
   * 主子码流支持的取流协议通过登录返回结构参数 {@link NET_DVR_DEVICEINFO_V30}的byMainProto、bySubProto值得知。
   * 设备同时支持私协议和RTSP协议时，该参数才有效，默认使用私有协议，可选RTSP协议。
   */
  public byte byProtoType;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 码流数据编解码类型 0-通用编码数据 1-热成像探测器产生的原始数据（温度数据的加密信息，通过去加密运算，
   * 将原始数据算出真实的温度值）
   */
  public byte byVideoCodingType;
  /**
   * 播放库播放缓冲区最大缓冲帧数，取值范围：1、6（默认，自适应播放模式）、15，置0时默认为1
   */
  public int dwDisplayBufNum;
  /**
   * NPQ是直连模式，还是过流媒体 0-直连 1-过流媒体
   */
  public byte byNPQMode;
  /**
   * 保留
   */
  public byte[] byRes = new byte[215];
}
