package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 静坐参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "dwDuration",
                       "byRes"})
public class NET_VCA_SIT_QUIETLY extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 持续时间  单位s 范围1-3600
   */
  public int dwDuration;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
