package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 起立参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "bySensitivity",
                       "byHeightThreshold",
                       "wDuration",
                       "byRes"})
public class NET_VCA_STANDUP extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 灵敏度参数，范围[1,100]
   */
  public byte bySensitivity;
  /**
   * 高度阈值，范围[0,250]，默认130，单位：厘米
   */
  public byte byHeightThreshold;
  /**
   * 触发事件阈值[1,3600]，默认2，单位：秒
   */
  public short wDuration;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
