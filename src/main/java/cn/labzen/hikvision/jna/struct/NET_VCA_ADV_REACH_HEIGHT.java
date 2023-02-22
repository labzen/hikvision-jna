package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 折线攀高参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "dwCrossDirection",
                       "byRes"})
public class NET_VCA_ADV_REACH_HEIGHT extends Structure {

  /**
   * 攀高折线
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 跨越方向(详见VCA_CROSS_DIRECTION): 0-双向，1-从左到右2-从右到左
   */
  public int dwCrossDirection;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[4];
}
