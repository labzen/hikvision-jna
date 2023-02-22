package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 报警目标信息结构体
 */
@Structure.FieldOrder({"dwID",
                       "struRect",
                       "byRes"})
public class NET_VCA_TARGET_INFO extends Structure {

  /**
   * 目标ID ,人员聚集过高报警时为0
   */
  public int dwID;
  /**
   * 目标边界框
   */
  public NET_VCA_RECT struRect;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
