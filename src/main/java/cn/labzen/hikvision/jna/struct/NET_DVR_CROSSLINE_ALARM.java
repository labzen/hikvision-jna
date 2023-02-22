package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 压线报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "struTriggerTime",
                       "struParkInfo",
                       "byRes1"})
public class NET_DVR_CROSSLINE_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 报警设备信息，包括IP、端口、通道等
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 触发时间
   */
  public NET_DVR_TIME_EX struTriggerTime;
  /**
   * 车位信息
   */
  public NET_DVR_PARK_INFO struParkInfo;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[128];
}
