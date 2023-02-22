package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人员聚集状态信息结构体
 * <p/>
 * 设备是否支持人员聚集状态上传或者支持的参数能力，可以通过设备能力集进行判断，对应智能通道分析能力集(VcaChanAbility)，
 * 相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_ABILITY_INFO，节点：<HighDensityStatus>。
 */
@Structure.FieldOrder({"struRegion",
                       "fDensity",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_HIGH_DENSITY_STATUS extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 聚集比率, 范围: [0.1, 1.0]
   */
  public float fDensity;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[3];
}
