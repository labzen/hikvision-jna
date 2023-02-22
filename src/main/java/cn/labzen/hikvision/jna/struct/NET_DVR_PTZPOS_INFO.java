package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * PTZ参数结构体
 */
@Structure.FieldOrder({"dwPanPos",
                       "dwTiltPos",
                       "dwZoomPos"})
public class NET_DVR_PTZPOS_INFO extends Structure {

  /**
   * P参数（水平参数）
   */
  public int dwPanPos;
  /**
   * T参数（垂直参数）
   */
  public int dwTiltPos;
  /**
   * Z参数（变倍参数）
   */
  public int dwZoomPos;
}
