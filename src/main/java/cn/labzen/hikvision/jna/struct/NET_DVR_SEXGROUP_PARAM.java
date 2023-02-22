package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 性别人数统计参数结构体
 */
@Structure.FieldOrder({"dwMale",
                       "dwFemale",
                       "byRes"})
public class NET_DVR_SEXGROUP_PARAM extends Structure {

  /**
   * 男（人数）
   */
  public int dwMale;
  /**
   * 女（人数）
   */
  public int dwFemale;
  /**
   * 保留
   */
  public byte[] byRes = new byte[64];
}
