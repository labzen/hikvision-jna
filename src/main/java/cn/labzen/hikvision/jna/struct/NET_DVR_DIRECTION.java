package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 方向结构体
 */
@Structure.FieldOrder({"struStartPoint",
                       "struEndPoint"})
public class NET_DVR_DIRECTION extends Structure {

  /**
   * 方向起始点
   */
  public NET_VCA_POINT struStartPoint;
  /**
   * 方向结束点
   */
  public NET_VCA_POINT struEndPoint;
}
