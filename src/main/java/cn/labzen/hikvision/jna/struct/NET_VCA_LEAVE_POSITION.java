package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 离岗事件参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wLeaveDelay",
                       "wStaticDelay",
                       "byMode",
                       "byPersonType",
                       "byOnPosition",
                       "bySensitivity"})
public class NET_VCA_LEAVE_POSITION extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 无人报警时间，单位：s
   */
  public short wLeaveDelay;
  /**
   * 睡觉报警时间，单位：s
   */
  public short wStaticDelay;
  /**
   * 模式，0-离岗事件，1-睡岗事件，2-离岗睡岗事件
   */
  public byte byMode;
  /**
   * 值岗人数类型，0-单人值岗，1-双人值岗
   */
  public byte byPersonType;
  /**
   * 在岗人数，1-10，默认1
   */
  public byte byOnPosition;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
}
