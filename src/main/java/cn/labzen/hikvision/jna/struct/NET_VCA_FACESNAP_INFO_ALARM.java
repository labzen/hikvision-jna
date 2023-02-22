package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人脸抓拍信息结构体
 */
@Structure.FieldOrder({"dwYear",
                       "dwMonth",
                       "dwDay",
                       "dwMinute",
                       "dwSecond"})
public class NET_VCA_FACESNAP_INFO_ALARM extends Structure {

  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 抓拍人脸图ID
   */
  public int dwSnapFacePicID;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[20];
}
