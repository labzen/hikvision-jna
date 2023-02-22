package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 区域框参数结构体
 */
@Structure.FieldOrder({"fX",
                       "fY",
                       "fWidth",
                       "fHeight"})
public class NET_VCA_RECT extends Structure {

  /**
   * 边界框左上角点的X轴坐标, 0.001~1
   */
  public float fX;
  /**
   * 边界框左上角点的Y轴坐标, 0.001~1
   */
  public float fY;
  /**
   * 边界框的宽度, 0.001~1
   */
  public float fWidth;
  /**
   * 边界框的高度, 0.001~1
   */
  public float fHeight;
}
