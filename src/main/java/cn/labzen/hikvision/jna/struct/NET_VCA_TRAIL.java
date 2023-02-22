package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 尾随参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wRes",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_TRAIL extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 保留
   */
  public short wRes;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5];
}
