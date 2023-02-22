package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 指示灯外控状态信息结构体
 */
@Structure.FieldOrder({"byFlicker",
                       "byParkingIndex",
                       "byRes1",
                       "dwIONo",
                       "byRes2"})
public class NET_DVR_LAMP_STATE extends Structure {

  /**
   * 0~不闪烁 1 ～闪烁
   */
  public byte byFlicker;
  /**
   * 车位号1～3
   */
  public byte byParkingIndex;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 1~IO1;2~IO2;4~IO3;
   */
  public int dwIONo;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[8];
}
