package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 时间参数结构体
 * <p/>
 * 设备是否支持按时间点获取缩略图或者支持的参数能力，可以通过设备能力集进行判断，对应设备软硬件能力集(BasicCapability)，相关接口：
 * NET_DVR_GetDeviceAbility，能力集类型：DEVICE_SOFTHARDWARE_ABILITY，节点：<isSupportGetFigure>。
 */
@Structure.FieldOrder({"dwPicLen",
                       "pPicBuf"})
public class NET_DVR_FIGURE_INFO extends Structure {

  /**
   * 图片长度
   */
  public int dwPicLen;
  /**
   * 图片数据
   */
  public String pPicBuf;
}
