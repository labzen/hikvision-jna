package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_TPS_RULE;

/**
 * 车道统计参数信息结构体
 */
@Structure.FieldOrder({"dwLanNum",
                       "struLaneParam",
                       "dwSceneID",
                       "byRes"})
public class NET_DVR_TPS_INFO_V41 extends Structure {

  /**
   * 交通参数的车道数目
   */
  public int dwLanNum;
  /**
   * 车道参数
   */
  public NET_DVR_LANE_PARAM_V41[] struLaneParam = new NET_DVR_LANE_PARAM_V41[MAX_TPS_RULE];
  /**
   * 场景ID
   */
  public int dwSceneID;
  /**
   * 保留
   */
  public byte[] byRes = new byte[28];
}
