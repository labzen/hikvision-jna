package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 事件参数联合体
 */
@Structure.FieldOrder({"uLen",
                       "dwHumanIn",
                       "fCrowdDensity"})
public class NET_DVR_EVENT_PARAM_UNION extends Structure {

  /**
   * 联合体大小为12字节
   */
  public int[] uLen = new int[3];
  /**
   * 有无人接近 0 - 无人 1- 有人
   */
  public int dwHumanIn;
  /**
   * 人员聚集值
   */
  public float fCrowdDensity;
}
