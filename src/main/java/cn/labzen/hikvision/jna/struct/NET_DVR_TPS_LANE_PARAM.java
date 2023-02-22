package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 单车道TPS交通统计信息结构体
 */
@Structure.FieldOrder({"byLane",
                       "bySpeed",
                       "wArrivalFlow",
                       "dwLightVehicle",
                       "dwMidVehicle",
                       "dwHeavyVehicle",
                       "dwTimeHeadway",
                       "dwSpaceHeadway",
                       "fSpaceOccupyRation",
                       "fTimeOccupyRation",
                       "byStoppingTimes",
                       "byQueueLen",
                       "byFlag",
                       "byVehicelNum",
                       "wDelay",
                       "byRes1",
                       "dwNonMotor"})
public class NET_DVR_TPS_LANE_PARAM extends Structure {

  /**
   * 对应车道号
   */
  public byte byLane;
  /**
   * 车道过车平均速度
   */
  public byte bySpeed;
  /**
   * 到达流量
   */
  public short wArrivalFlow;
  /**
   * 小型车数量
   */
  public int dwLightVehicle;
  /**
   * 中型车数量
   */
  public int dwMidVehicle;
  /**
   * 重型车数量
   */
  public int dwHeavyVehicle;
  /**
   * 车头时距，以秒计算
   */
  public int dwTimeHeadway;
  /**
   * 车头间距，以米来计算
   */
  public int dwSpaceHeadway;
  /**
   * 空间占有率，百分比计算,浮点数*1000
   */
  public float fSpaceOccupyRation;
  /**
   * 时间占有率，百分比计算,浮点数*1000
   */
  public float fTimeOccupyRation;
  /**
   * 平均停车次数
   */
  public byte byStoppingTimes;
  /**
   * 堵塞状态下排队长度（比如50米）
   */
  public byte byQueueLen;
  /**
   * 上传标识，0-表示T1时间的统计结果,1-表示T2时间的统计
   */
  public byte byFlag;
  /**
   * 区域车辆数
   */
  public byte byVehicelNum;
  /**
   * 平均延误
   */
  public short wDelay;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[6];
  /**
   * 非机动车数量
   */
  public int dwNonMotor;
}
