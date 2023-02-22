package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 倒地参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byHeightThreshold",
                       "byRes"})
public class NET_VCA_FALL_DOWN extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发事件阈值 1-60s
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 高度阈值，范围[0,250]，默认90，单位：厘米
   */
  public byte byHeightThreshold;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
