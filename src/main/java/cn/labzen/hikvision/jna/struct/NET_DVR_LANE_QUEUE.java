package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 车道队列结构体
 */
@Structure.FieldOrder({"struHead",
                       "struTail",
                       "dwLength"})
public class NET_DVR_LANE_QUEUE extends Structure {

  /**
   * 队列头
   */
  public NET_VCA_POINT struHead;
  /**
   * 队列尾
   */
  public NET_VCA_POINT struTail;
  /**
   * 实际队列长度 单位为米 [0-500]
   */
  public int dwLength;
}
