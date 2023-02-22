package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 消防报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struAlarmTime",
                       "byRes"})
public class NET_DVR_FIRE_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 报警时间
   */
  public NET_DVR_TIME_V30 struAlarmTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
