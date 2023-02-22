package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_CARDNO_LEN;
import static cn.labzen.hikvision.jna.Constants.MAX_VEHICLE_ID_LEN;

/**
 * 出入口卡片信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "szCardNo",
                       "szPassVehicleID",
                       "szInVehicleID",
                       "struSwipeTime",
                       "struCardTime",
                       "byLetPass",
                       "byCardType",
                       "byRes"})
public class NET_DVR_GATE_CARDINFO extends Structure {

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
   * 卡号
   */
  public byte[] szCardNo = new byte[MAX_CARDNO_LEN];
  /**
   * 唯一标识
   */
  public byte[] szPassVehicleID = new byte[MAX_VEHICLE_ID_LEN];
  /**
   * 出口时的入口唯一标识
   */
  public byte[] szInVehicleID = new byte[MAX_VEHICLE_ID_LEN];
  /**
   * 刷卡时间
   */
  public NET_DVR_TIME_V30 struSwipeTime;
  /**
   * 卡片存的时间，即入场时写入的时间，只对出口票箱有用，0表示无入场时间
   */
  public NET_DVR_TIME_V30 struCardTime;
  /**
   * 出入口放行方式 0-不放行(当CardType == 纸票)需要收费，1-放行，2-中心收费放行
   */
  public byte byLetPass;
  /**
   * 卡类型 0-固定卡，1-临时卡，2-纸票
   */
  public byte byCardType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[126];
}
