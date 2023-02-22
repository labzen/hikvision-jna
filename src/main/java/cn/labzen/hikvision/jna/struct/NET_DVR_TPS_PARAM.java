package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * TPS交通参数信息结构体
 */
@Structure.FieldOrder({"byStart",
                       "byCMD",
                       "wSpaceHeadway",
                       "wDeviceID",
                       "wDataLen",
                       "byLane",
                       "bySpeed",
                       "byLaneState",
                       "byQueueLen",
                       "wLoopState",
                       "wStateMask",
                       "dwDownwardFlow",
                       "dwUpwardFlow",
                       "byJamLevel",
                       "byVehicleDirection",
                       "byJamFlow",
                       "byRes1",
                       "wTimeHeadway"})
public class NET_DVR_TPS_PARAM extends Structure {

  /**
   * 开始码
   */
  public byte byStart;
  /**
   * 命令号，01-进入指令，02-离开指令，03-拥堵状态指令(为03时，只有byLaneState和byQueueLen有效)，04-多线圈状态
   * （为04时，wLoopState和wStateMask有效，表示byLane车道上多个线圈的过车状态）
   */
  public byte byCMD;
  /**
   * 车头间距，以米来计算
   */
  public short wSpaceHeadway;
  /**
   * 设备ID
   */
  public short wDeviceID;
  /**
   * 数据长度
   */
  public short wDataLen;
  /**
   * 对应车道号
   */
  public byte byLane;
  /**
   * 对应车速（KM/H）
   */
  public byte bySpeed;
  /**
   * 车道状态；0-无状态，1-畅通，2-拥挤，3-堵塞
   */
  public byte byLaneState;
  /**
   * 堵塞状态下排队长度（比如50米）
   */
  public byte byQueueLen;
  /**
   * 线圈状态，第几位表示几号线圈状态，线圈编号从镜头由近到远依次增大。状态1-到达，0-离开
   */
  public short wLoopState;
  /**
   * 线圈状态掩码，掩码位为1对应wLoopState状态位有效，为0表示无效
   */
  public short wStateMask;
  /**
   * 当前车道 从上到下车流量
   */
  public int dwDownwardFlow;
  /**
   * 当前车道 从下到上车流量
   */
  public int dwUpwardFlow;
  /**
   * 拥堵等级，当byLaneState为3时有效，1-轻度，2-中度，3-重度
   */
  public byte byJamLevel;
  /**
   * 0-未知，1-由上而下，2-由下而上
   */
  public byte byVehicleDirection;
  /**
   * 拥堵新增流量，每新增一辆车就上报一次累计车辆的信息
   */
  public byte byJamFlow;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[7];
  /**
   * 车头时距，以秒计算
   */
  public short wTimeHeadway;
}
