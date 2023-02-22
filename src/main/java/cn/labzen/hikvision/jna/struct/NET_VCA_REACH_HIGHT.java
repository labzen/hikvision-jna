package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 攀高参数结构体
 */
@Structure.FieldOrder({"struVcaLine",
                       "wDuration",
                       "byRes"})
public class NET_VCA_REACH_HIGHT extends Structure {

  /**
   * 攀高警戒面
   */
  public NET_VCA_LINE struVcaLine;
  /**
   * 触发攀高报警阈值：1-120秒
   */
  public short wDuration;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[6];
}
