package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 指示灯外控报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwChannelNo",
                       "struLampStateCtrl",
                       "struExternalBeginTime",
                       "byRes1"})
public class NET_DVR_EXTERNAL_CONTROL_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChannelNo;
  /**
   * 指示灯外控状态
   */
  public NET_DVR_LAMP_STATE struLampStateCtrl;
  /**
   * 外控开始时间
   */
  public NET_DVR_TIME struExternalBeginTime;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[64];
}
