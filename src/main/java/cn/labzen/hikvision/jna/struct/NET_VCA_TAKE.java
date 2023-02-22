package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 捡包参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_TAKE extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发物品拿取报警阈值10-100秒
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[5];
}
