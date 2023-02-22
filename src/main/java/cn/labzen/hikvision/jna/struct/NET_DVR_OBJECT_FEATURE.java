package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 物体属性参数结构体
 */
@Structure.FieldOrder({"byColorRatel",
                       "byRed",
                       "byGreen",
                       "byBlue",
                       "byRes"})
public class NET_DVR_OBJECT_FEATURE extends Structure {

  /**
   * 颜色在移动物体中的占比阈值，百分比，取值范围：0~100
   */
  public byte byColorRatel;
  /**
   * RGB颜色三分量中的红色
   */
  public byte byRed;
  /**
   * RGB颜色三分量中的绿色
   */
  public byte byGreen;
  /**
   * RGB颜色三分量中的兰色
   */
  public byte byBlue;
  /**
   * 保留
   */
  public byte[] byRes = new byte[32];
}
