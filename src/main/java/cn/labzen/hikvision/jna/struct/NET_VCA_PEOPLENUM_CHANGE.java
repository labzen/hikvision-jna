package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人数变化参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "bySensitivity",
                       "byPeopleNumThreshold",
                       "byDetectMode",
                       "byNoneStateEffective",
                       "wDuration",
                       "byPeopleNum",
                       "byRes"})
public class NET_VCA_PEOPLENUM_CHANGE extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 灵敏度参数，范围[1,100]
   */
  public byte bySensitivity;
  /**
   * 人数阈值，范围[0,5]，默认1
   */
  public byte byPeopleNumThreshold;
  /**
   * 检测方式，与人数阈值相比较。1-大于，2-小于，3-等于，4-不等于
   */
  public byte byDetectMode;
  /**
   * 无人状态是否有效，0-无效，1-有效
   */
  public byte byNoneStateEffective;
  /**
   * 触发时间阈值[1,3600]，默认2，单位：秒
   */
  public short wDuration;
  /**
   * 触发报警人数，只读，仅报警上报，设备返回0表示不支持本功能上报，0xff表示报警人数为0
   */
  public byte byPeopleNum;
  /**
   * 保留
   */
  public byte byRes;
}
