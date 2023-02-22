package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 回答问题参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "bySensitivity",
                       "byAlarmState",
                       "byZoomOver",
                       "byAnswerStudent",
                       "byRes"})
public class NET_VCA_ANSWER extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 灵敏度参数，范围[1-100]
   */
  public byte bySensitivity;
  /**
   * 只读字段界面不显示；0-保留,1-报警开始,2-报警结束
   */
  public byte byAlarmState;
  /**
   * 0-保留,1-变倍到位(报警上传录播主机，作为切换画面判断依据)
   */
  public byte byZoomOver;
  /**
   * 0-保留，1-无学生起立，2-单个学生起立，3-多个学生起立,4-单个学生走动
   */
  public byte byAnswerStudent;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
