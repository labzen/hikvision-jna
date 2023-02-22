package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 录像段总大小查询条件参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struStreanInfo",
                       "struStartTime",
                       "struStopTime",
                       "byRes"})
public class NET_DVR_RECORD_SEGMENT_COND extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 流信息（仅流ID有效）
   */
  public NET_DVR_STREAM_INFO struStreanInfo;
  /**
   * 开始时间
   */
  public NET_DVR_TIME_EX struStartTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME_EX struStopTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];
}
