package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人员进入参数结构体
 */
@Structure.FieldOrder({"dwRes"})
public class NET_VCA_HUMAN_ENTER extends Structure {

  /**
   * 保留
   */
  public int[] dwRes = new int[23];
}
