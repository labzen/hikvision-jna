package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 行为分析子图信息结构体
 */
@Structure.FieldOrder({"struVcaRect",
                       "byRes2"})
public class NET_DVR_BEHAVIOR_INFO extends Structure {

  /**
   * 子图区域，归一化坐标
   */
  public NET_VCA_RECT struVcaRect;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[240];
}
