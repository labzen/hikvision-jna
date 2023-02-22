package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 板书信息配置结构体
 */
@Structure.FieldOrder({"struRegion",
                       "byTeacherState",
                       "byWritingState",
                       "byWritingArea",
                       "byRes"})
public class NET_VCA_BLACKBOARD_WRITE extends Structure {

  /**
   * 区域范围（配置区域，报警中不含有该区域）
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 教师状态；0~教师特写，1~教师全景，2~讲台无人状态
   */
  public byte byTeacherState;
  /**
   * 板书状态；0~板书开始，1~板书结束
   */
  public byte byWritingState;
  /**
   * 板书区域；0~整个板书，1~板书左边，2~板书右边
   */
  public byte byWritingArea;
  /**
   * 保留
   */
  public byte[] byRes = new byte[5];
}
