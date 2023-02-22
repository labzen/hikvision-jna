package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.VcaEventTypeExtension;
import com.sun.jna.Structure;

/**
 * 关联规则结构体
 */
@Structure.FieldOrder({"byRuleID",
                       "byRes",
                       "wEventType"})
public class NET_VCA_RELATE_RULE_PARAM extends Structure {

  /**
   * 规则序号 0-表示无
   */
  public byte byRuleID;
  /**
   * 保留
   */
  public byte byRes;
  /**
   * 行为事件类型，参考{@link VcaEventTypeExtension}
   */
  public short wEventType;
}
