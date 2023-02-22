package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 出入口付费信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "sLicense",
                       "szCardNo",
                       "struEntranceTime",
                       "struDepartureTime",
                       "szDepartureID",
                       "szEntranceID",
                       "dwTotalCost",
                       "szOperateName",
                       "byChargeRuleId",
                       "byVehicleType",
                       "byRes"})
public class NET_DVR_GATE_CHARGEINFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 报警设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 车牌
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 卡号
   */
  public byte[] szCardNo = new byte[48];
  /**
   * 进入时间
   */
  public NET_DVR_TIME_V30 struEntranceTime;
  /**
   * 离开时间
   */
  public NET_DVR_TIME_V30 struDepartureTime;
  /**
   * 出场唯一过车标示
   */
  public byte[] szDepartureID = new byte[32];
  /**
   * 入场唯一过车标示
   */
  public byte[] szEntranceID = new byte[32];
  /**
   * 实际收费金额*100
   */
  public int dwTotalCost;
  /**
   * 脱机下为"offline"
   */
  public byte[] szOperateName = new byte[32];
  /**
   * 收费规则centerId
   */
  public byte byChargeRuleId;
  /**
   * 车辆类型，0-其他车辆，1-小型车，2-大型车
   */
  public byte byVehicleType;
  /**
   * 预留
   */
  public byte[] byRes = new byte[127];
}
