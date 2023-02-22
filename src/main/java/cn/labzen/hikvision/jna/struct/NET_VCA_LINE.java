package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 线结构参数结构体
 */
@Structure.FieldOrder({"struStart",
                       "struEnd"})
public class NET_VCA_LINE extends Structure {

  /**
   * 起点
   */
  public NET_VCA_POINT struStart;
  /**
   * 终点
   */
  public NET_VCA_POINT struEnd;
}
