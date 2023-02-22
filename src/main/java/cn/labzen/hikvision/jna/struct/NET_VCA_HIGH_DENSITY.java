package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人员聚集参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "fDensity",
                       "bySensitivity",
                       "byRes",
                       "wDuration"})
public class NET_VCA_HIGH_DENSITY extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 聚集比率, 范围: [0.1, 1.0]
   */
  public float fDensity;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留字节
   */
  public byte byRes;
  /**
   * 触发人员聚集参数报警阈值 20-360s
   */
  public short wDuration;
}
