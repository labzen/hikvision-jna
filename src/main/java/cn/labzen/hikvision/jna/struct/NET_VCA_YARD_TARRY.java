package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 放风场滞留参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDelay",
                       "byRes"})
public class NET_VCA_YARD_TARRY extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 放风场滞留时间[1,120]，单位：秒
   */
  public short wDelay;
  /**
   * 保留
   */
  public byte[] byRes = new byte[6];
}
