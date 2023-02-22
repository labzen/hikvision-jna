package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.LEN_PROPERTY;

/**
 * 主控版本信息结构体
 * <p/>
 * 设备是否支持获取主控版本信息能力，可以通过设备能力集进行判断，对应设备系统能力集(DeviceCap)，
 * 相关接口：NET_DVR_GetSTDAbility，能力集类型：NET_DVR_GET_SYSTEM_CAPABILITIES，节点：<isSupportFirmwareVersionInfo>
 * TODO NET_DVR_GetSTDAbility
 */
@Structure.FieldOrder({"dwSize",
                       "szFirmwareVersion",
                       "byRes2"})
public class NET_DVR_FIRMWARE_VERSION_IFNO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 主控版本属性，只读
   */
  public byte[] szFirmwareVersion = new byte[LEN_PROPERTY];
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[128];
}
