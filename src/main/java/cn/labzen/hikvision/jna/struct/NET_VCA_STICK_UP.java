package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 贴纸条(异物粘贴)参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_STICK_UP extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发时间阈值：4-60秒，建议10秒
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5];
}
