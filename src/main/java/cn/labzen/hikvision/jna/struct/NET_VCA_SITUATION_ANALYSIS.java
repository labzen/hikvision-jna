package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 态势分析参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wPeopleNum",
                       "byRes"})
public class NET_VCA_SITUATION_ANALYSIS extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 区域人数
   */
  public short wPeopleNum;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[6];
}
