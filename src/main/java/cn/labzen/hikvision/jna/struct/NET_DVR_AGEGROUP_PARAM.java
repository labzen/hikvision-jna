package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 年龄段人数统计参数结构体
 */
@Structure.FieldOrder({"dwTeenage",
                       "dwYouth",
                       "dwMidLife",
                       "dwElderly",
                       "dwChild",
                       "dwAdolescent",
                       "dwPrime",
                       "dwMidage",
                       "byRes"})
public class NET_DVR_AGEGROUP_PARAM extends Structure {

  /**
   * 少年（人数）
   */
  public int dwTeenage;
  /**
   * 青年（人数）
   */
  public int dwYouth;
  /**
   * 中年（人数）
   */
  public int dwMidLife;
  /**
   * 老年（人数）
   */
  public int dwElderly;
  /**
   * 儿童（人数）
   */
  public int dwChild;
  /**
   * 青少年（人数）
   */
  public int dwAdolescent;
  /**
   * 壮年（人数）
   */
  public int dwPrime;
  /**
   * 中老年（人数）
   */
  public int dwMidage;
  /**
   * 保留
   */
  public byte[] byRes = new byte[48];
}
