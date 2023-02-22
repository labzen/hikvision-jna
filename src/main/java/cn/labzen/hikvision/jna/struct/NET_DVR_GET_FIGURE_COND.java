package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.STREAM_ID_LEN;

/**
 * 按时间点获取缩略图条件参数结构体
 * <p/>
 * <ul>
 *   <li>如果设备不支持流ID，byID全部为0即可。如果设备同时支持流ID和通道模式，dwChannel和byID不能同时有效：使用通道模式时，
 *   dwChannel输入正确的通道号，byID全部赋值为0；使用流ID模式时，dwChannel为0xffffffff，byID输入正确的流ID。 </li>
 *   <li>设备是否支持按时间点获取缩略图或者支持的参数能力，可以通过设备能力集进行判断，对应设备软硬件能力集(BasicCapability)，
 *   相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_SOFTHARDWARE_ABILITY，节点：<isSupportGetFigure>。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwLength",
                       "dwChannel",
                       "struTimePoint",
                       "byID",
                       "byRes"})
public class NET_DVR_GET_FIGURE_COND extends Structure {

  /**
   * 结构长度
   */
  public int dwLength;
  /**
   * 通道
   */
  public int dwChannel;
  /**
   * 时间点
   */
  public NET_DVR_TIME_V30 struTimePoint;
  /**
   * 流ID，为字母、数字和"_"的组合，全部为0时无效
   */
  public byte[] byID = new byte[STREAM_ID_LEN];
  /**
   * 保留
   */
  public byte[] byRes = new byte[32];
}
