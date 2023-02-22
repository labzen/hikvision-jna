package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 如厕超时参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDelay",
                       "byRes"})
public class NET_VCA_TOILET_TARRY extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 如厕超时时间[1,3600]，单位：秒
   */
  public short wDelay;
  /**
   * 保留
   */
  public byte[] byRes = new byte[6];
}
