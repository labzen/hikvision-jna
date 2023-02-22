package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 点坐标参数结构体
 */
@Structure.FieldOrder({"fX",
                       "fY"})
public class NET_VCA_POINT extends Structure {

  /**
   * X轴坐标, 0.001~1
   */
  public float fX;
  /**
   * Y轴坐标, 0.001~1
   */
  public float fY;
}
