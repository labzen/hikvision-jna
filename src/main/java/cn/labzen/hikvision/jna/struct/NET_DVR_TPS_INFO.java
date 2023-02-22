package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_TPS_RULE;

/**
 * 车道统计参数信息结构体
 */
@Structure.FieldOrder({"dwLanNum",
                       "struLaneParam"})
public class NET_DVR_TPS_INFO extends Structure {

  /**
   * 交通参数的车道数目
   */
  public int dwLanNum;
  /**
   * 车道参数结构体
   */
  public NET_DVR_LANE_PARAM[] struLaneParam = new NET_DVR_LANE_PARAM[MAX_TPS_RULE];
}
