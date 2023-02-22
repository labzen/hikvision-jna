package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 车道参数结构体
 */
@Structure.FieldOrder({"byRuleName",
                       "byRuleID",
                       "byVaryType",
                       "byLaneType",
                       "byRes1",
                       "dwLaneVolume",
                       "dwLaneVelocity",
                       "dwTimeHeadway",
                       "dwSpaceHeadway",
                       "fSpaceOccupyRation",
                       "struLaneQueue",
                       "struRuleLocation",
                       "byRes2"})
public class NET_DVR_LANE_PARAM extends Structure {

  /**
   * 车道规则名称
   */
  public byte[] byRuleName = new byte[NAME_LEN];
  /**
   * 规则序号，为规则配置结构下标，0-7
   */
  public byte byRuleID;
  /**
   * 车道交通参数变化类型 参照 TRAFFIC_DATA_VARY_TYPE
   */
  public byte byVaryType;
  /**
   * 车道上行或下行
   */
  public byte byLaneType;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 车道流量 ，统计有多少车子通过
   */
  public int dwLaneVolume;
  /**
   * 车道速度，公里计算
   */
  public int dwLaneVelocity;
  /**
   * 车头时距，以秒计算
   */
  public int dwTimeHeadway;
  /**
   * 车头间距，以米来计算
   */
  public int dwSpaceHeadway;
  /**
   * 车道占有率，百分比计算（空间上)
   */
  public float fSpaceOccupyRation;
  /**
   * 车道队列长度
   */
  public NET_DVR_LANE_QUEUE struLaneQueue;
  /**
   * 线圈规则的中心点位置
   */
  public NET_VCA_POINT struRuleLocation;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[32];
}
