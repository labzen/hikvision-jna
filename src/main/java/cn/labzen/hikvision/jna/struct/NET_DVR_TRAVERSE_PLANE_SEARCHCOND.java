package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_ALERTLINE_NUM;

/**
 * 越界侦测录像查找条件参数结构体
 */
@Structure.FieldOrder({"struVcaTraversePlane",
                       "dwPreTime",
                       "dwDelayTime",
                       "struPTZPosInfo",
                       "byAdvanceType",
                       "byRes1",
                       "uAdvanceCond",
                       "byRes"})
public class NET_DVR_TRAVERSE_PLANE_SEARCHCOND extends Structure {

  /**
   * 穿越境界面参数
   */
  public NET_VCA_TRAVERSE_PLANE[] struVcaTraversePlane = new NET_VCA_TRAVERSE_PLANE[MAX_ALERTLINE_NUM];
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
  public byte[] byRes = new byte[5604];
}
