package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 快速移动参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "fRunDistance",
                       "bySensitivity",
                       "byMode",
                       "byDetectionTarget",
                       "byRes"})
public class NET_VCA_RUN extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 人快速移动最大距离, 范围: [0.1, 1.00] 像素模式 实际模式(1,20)m/s
   */
  public float fRunDistance;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 0 像素模式  1 实际模式
   */
  public byte byMode;
  /**
   * 检测目标，0表示所有目标（表示不锁定检测目标，所有目标都将进行检测），其他取值按位表示不同的检测目标：0x01-人，0x02-车
   * 支持多选，例如：0x3表示同时检测车和人的目标类型
   */
  public byte byDetectionTarget;
  /**
   * 保留
   */
  public byte byRes;
}
