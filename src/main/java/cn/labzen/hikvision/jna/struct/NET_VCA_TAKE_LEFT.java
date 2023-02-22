package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 丢包/捡包参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_TAKE_LEFT extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发时间阈值：1-120秒，建议10秒
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5];
}
