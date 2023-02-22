package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 球机位置配置结构体
 * <p/>
 * 本结构体中的wAction参数是设置时的操作类型，因此获取时该参数无效。实际显示的PTZ值是获取到的十六进制值的十分之一，
 * 如获取的水平参数P的值是0x1750，实际显示的P值为175度；获取到的垂直参数T的值是0x0789，实际显示的T值为78.9度；
 * 获取到的变倍参数Z的值是0x1100，实际显示的Z值为110倍。
 */
@Structure.FieldOrder({"wAction",
                       "wPanPos",
                       "wTiltPos",
                       "wZoomPos"})
public class NET_DVR_PTZPOS extends Structure {

  /**
   * 获取时该字段无效
   */
  public short wAction;
  /**
   * 水平参数
   */
  public short wPanPos;
  /**
   * 垂直参数
   */
  public short wTiltPos;
  /**
   * 变倍参数
   */
  public short wZoomPos;
}
