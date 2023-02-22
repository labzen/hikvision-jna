package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 折线警戒面参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "dwCrossDirection",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_ADV_TRAVERSE_PLANE extends Structure {

  /**
   * 警戒面折线
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 跨越方向(详见VCA_CROSS_DIRECTION): 0-双向，1-从左到右2-从右到左
   */
  public int dwCrossDirection;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[3];
}
