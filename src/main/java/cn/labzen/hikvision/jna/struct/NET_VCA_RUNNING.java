package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人员奔跑检测结构体
 */
@Structure.FieldOrder({"struRegion",
                       "dwSpeed",
                       "byRes"})
public class NET_VCA_RUNNING extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 奔跑速度，范围[1,10]
   */
  public int dwSpeed;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
