package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 交通事件信息结构体
 */
@Structure.FieldOrder({"byRuleID",
                       "byRes1",
                       "byRuleName",
                       "dwAIDType",
                       "struDirect",
                       "bySpeedLimit",
                       "byCurrentSpeed",
                       "byVehicleEnterState",
                       "byState",
                       "byParkingID",
                       "byRes2"})
public class NET_DVR_AID_INFO extends Structure {

  /**
   * 规则序号，为规则配置结构下标，0-16
   */
  public byte byRuleID;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 规则名称
   */
  public byte[] byRuleName = new byte[NAME_LEN];
  /**
   * 报警事件类型
   */
  public int dwAIDType;
  /**
   * 报警指向区域
   */
  public NET_DVR_DIRECTION struDirect;
  /**
   * 限速值，单位km/h[0,255]
   */
  public byte bySpeedLimit;
  /**
   * 当前速度值，单位km/h[0,255]
   */
  public byte byCurrentSpeed;
  /**
   * 车辆出入状态 0-无效 1-驶入 2-驶出
   */
  public byte byVehicleEnterState;
  /**
   * 0-变化上传，1-轮巡上传
   */
  public byte byState;
  /**
   * 停车位编号
   */
  public byte[] byParkingID = new byte[16];
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[20];
}
