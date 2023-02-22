package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_INTRUSIONREGION_NUM;

/**
 * 区域入侵录像查找条件参数结构体
 */
@Structure.FieldOrder({"struVcaIntrusion",
                       "dwPreTime",
                       "dwDelayTime",
                       "struPTZPosInfo",
                       "byAdvanceType",
                       "byRes1",
                       "uAdvanceCond",
                       "byRes"})
public class NET_DVR_INTRUSION_SEARCHCOND extends Structure {

  /**
   * 入侵区域
   */
  public NET_VCA_INTRUSION[] struVcaIntrusion = new NET_VCA_INTRUSION[MAX_INTRUSIONREGION_NUM];
  /**
   * 智能报警提前时间 单位:秒
   */
  public int dwPreTime;
  /**
   * 智能报警延迟时间 单位:秒
   */
  public int dwDelayTime;
  /**
   * PTZ坐标信息
   */
  public NET_DVR_PTZPOS_INFO struPTZPosInfo;
  /**
   * 组合方式，0-不使用组号，1-和人脸属性组合，2-与物体颜色占比组合
   */
  public byte byAdvanceType;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 组合属性
   */
  public NET_DVR_ADVANCE_COND_UNION uAdvanceCond;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5348];
}
