package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 入侵参数结构体
 * <p/>
 * 对于不同设备，以上参数的取值范围可能不同。对于Smart IPC，可以调用NET_DVR_GetDeviceAbility获取
 * 报警事件处理能力集（EventAbility，能力集类型：DEVICE_ABILITY_INFO）而得到实际取值范围
 * （节点：<FieldDetection>）；对于iDS智能设备，可以调用NET_DVR_GetDeviceAbility获取
 * 智能通道分析能力集（VcaChanAbility，能力集类型：DEVICE_ABILITY_INFO）而得到实际取值范围
 * （节点：<Intrusion>）。
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byRate",
                       "byDetectionTarget",
                       "byPriority",
                       "byRes"})
public class NET_VCA_INTRUSION extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 行为事件触发时间阈值，判断有效报警的时间。不同的设备取值范围不同，
   * 智能服务器为1~120秒（默认：5秒），ATM设备为1~1200秒，Smart IPC为1～100秒
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1-100]
   */
  public byte bySensitivity;
  /**
   * 占比：区域内所有未报警目标尺寸目标占区域面积的比重，归一化为1~100
   */
  public byte byRate;
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
  public byte[] byRes = new byte[2];
}
