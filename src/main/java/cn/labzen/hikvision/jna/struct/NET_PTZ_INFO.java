package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * PTZ参数结构体，热成像相机位置信息
 */
@Structure.FieldOrder({"fPan",
                       "fTilt",
                       "fZoom",
                       "dwFocus",
                       "byRes"})
public class NET_PTZ_INFO extends Structure {

  /**
   * P参数（水平参数），精确到小数点后3位，范围：0 – 36.000
   */
  public float fPan;
  /**
   * T参数（垂直参数），精确到小数点后3位，范围：-90.000 – 270.000
   */
  public float fTilt;
  /**
   * Z参数（变倍参数），精确到小数点后3位，范围：0-100000
   */
  public float fZoom;
  /**
   * 聚焦参数，聚焦范围：归一化0-100000
   */
  public int dwFocus;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
