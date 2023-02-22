package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 连接设备列表信息查询条件结构体
 * <p/>
 * 设备是否支持获取连接设备列表信息或者支持的参数能力，可以通过设备能力集进行判断，
 * 对应获取连接设备列表信息能力集(accessDeviceList)，相关接口：NET_DVR_GetSTDAbility，
 * 能力集类型：NET_DVR_GET_CONNECT_LIST_CAPABILITIES。
 */
@Structure.FieldOrder({"dwSize",
                       "dwChannel",
                       "byRes"})
public class NET_DVR_CONNECTDEV_COND extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
