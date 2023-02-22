package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 进入/离开区域参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "bySensitivity",
                       "byDetectionTarget",
                       "byPriority",
                       "byRes"})
public class NET_VCA_AREA extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 检测目标，0表示所有目标（表示不锁定检测目标，所有目标都将进行检测），其他取值按位表示不同的检测目标：0x01-人，0x02-车
   * 支持多选，例如：0x3表示同时检测车和人的目标类型
   */
  public byte byDetectionTarget;
  /**
   * 优先级,0~低,1~中,2~高
   */
  public byte byPriority;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5];
}
