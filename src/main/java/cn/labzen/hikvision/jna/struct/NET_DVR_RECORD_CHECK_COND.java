package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 录像完整性检测条件参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struStreamInfo",
                       "byCheckType",
                       "byRes1",
                       "struBeginTime",
                       "struEndTime",
                       "byRes"})
public class NET_DVR_RECORD_CHECK_COND extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 流信息（仅流ID有效）
   */
  public NET_DVR_STREAM_INFO struStreamInfo;
  /**
   * 检测方式,0--录像是否完整,1--录像是否完整&缺失录像的起止时间
   */
  public byte byCheckType;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 检测录像的开始时间
   */
  public NET_DVR_TIME_EX struBeginTime;
  /**
   * 检测录像的结束时间
   */
  public NET_DVR_TIME_EX struEndTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
