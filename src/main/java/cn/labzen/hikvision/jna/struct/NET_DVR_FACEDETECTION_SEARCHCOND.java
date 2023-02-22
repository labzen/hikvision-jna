package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人脸侦测录像查找条件参数结构体
 */
@Structure.FieldOrder({"struFacePolygon",
                       "dwPreTime",
                       "dwDelayTime",
                       "byRes"})
public class NET_DVR_FACEDETECTION_SEARCHCOND extends Structure {

  /**
   * 识别区域
   */
  public NET_VCA_POLYGON struFacePolygon;
  /**
   * 智能录像提前时间 单位:秒
   */
  public int dwPreTime;
  /**
   * 智能录像延迟时间 单位:秒
   */
  public int dwDelayTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5972];
}
