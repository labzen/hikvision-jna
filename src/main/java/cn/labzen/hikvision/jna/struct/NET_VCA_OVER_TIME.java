package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 操作超时结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "byRes"})
public class NET_VCA_OVER_TIME extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 操作报警时间阈值 4s-60000s
   */
  public short wDuration;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[6];
}
