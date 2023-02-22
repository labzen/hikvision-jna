package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;

/**
 * 组合搜索条件联合体
 */
@Structure.FieldOrder({"byLen",
                       "struHumanFeature",
                       "struObjectFeature"})
public class NET_DVR_ADVANCE_COND_UNION extends Union {

  /**
   * 联合体长度
   */
  public byte[] byLen = new byte[36];
  /**
   * 人体属性
   */
  public NET_VCA_HUMAN_FEATURE struHumanFeature;
  /**
   * 物体属性
   */
  public NET_DVR_OBJECT_FEATURE struObjectFeature;
}
