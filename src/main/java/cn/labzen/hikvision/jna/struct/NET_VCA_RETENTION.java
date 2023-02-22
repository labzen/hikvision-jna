package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人员滞留检测结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "byRes"})
public class NET_VCA_RETENTION extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发滞留报警阈值时间（60-3600秒）默认1800秒
   */
  public short wDuration;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[6];
}
