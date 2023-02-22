package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 间距变化参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "fSpacingThreshold",
                       "bySensitivity",
                       "byDetectMode",
                       "wDuration"})
public class NET_VCA_SPACING_CHANGE extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 间距阈值，范围[0,10.0]，默认1.0，单位：米
   */
  public float fSpacingThreshold;
  /**
   * 灵敏度参数，范围[1,100]
   */
  public byte bySensitivity;
  /**
   * 检测方式，与间距阈值相比较。1-大于，2-小于
   */
  public byte byDetectMode;
  /**
   * 触发时间阈值[1,3600]，默认2，单位：秒
   */
  public short wDuration;
}
