package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 穿越警戒面参数结构体
 * <p/>
 * 对于不同设备，以上参数的取值范围可能不同。对于Smart IPC，可以调用NET_DVR_GetDeviceAbility获取
 * 报警事件处理能力集（EventAbility，能力集类型：DEVICE_ABILITY_INFO）而得到实际取值范围
 * （节点：<TraversingVirtualPlane>）；对于iDS智能设备，可以调用NET_DVR_GetDeviceAbility获取
 * 智能通道分析能力集（VcaChanAbility，能力集类型：DEVICE_ABILITY_INFO）而得到实际取值范围
 * （节点：<TraversePlane>）。
 */
@Structure.FieldOrder({"struPlaneBottom",
                       "dwCrossDirection",
                       "bySensitivity",
                       "byPlaneHeight",
                       "byDetectionTarget",
                       "byPriority",
                       "byRes2"})
public class NET_VCA_TRAVERSE_PLANE extends Structure {

  /**
   * 警戒面底边
   */
  public NET_VCA_LINE struPlaneBottom;
  /**
   * 穿越方向: 0-双向，1-从左到右，2-从右到左
   */
  public int dwCrossDirection;
  /**
   * 灵敏度，取值范围：[1,5] （对于Smart IPC，取值范围为[1,100]）
   */
  public byte bySensitivity;
  /**
   * 警戒面高度（网络摄像机不支持该参数设置）
   */
  public byte byPlaneHeight;
  /**
   * 检测目标，0表示所有目标（表示不锁定检测目标，所有目标都将进行检测），
   * 其他取值按位表示不同的检测目标：0x01-人，0x02-车, 支持多选，例如：0x3表示同时检测车和人的目标类型
   */
  public byte byDetectionTarget;
  /**
   * 优先级,0~低,1~中,2~高
   */
  public byte byPriority;
  /**
   * 保留留
   */
  public byte[] byRes2 = new byte[36];
}
