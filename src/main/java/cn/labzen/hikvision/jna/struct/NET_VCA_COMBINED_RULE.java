package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 组合规则参数结构体
 */
@Structure.FieldOrder({"byRuleSequence",
                       "byRes",
                       "dwMinInterval",
                       "dwMaxInterval",
                       "struRule1Raram",
                       "struRule2Raram",
                       "byRes1"})
public class NET_VCA_COMBINED_RULE extends Structure {

  /**
   * 规则触发顺序，0-顺序或逆序触发，1-顺序触发
   */
  public byte byRuleSequence;
  /**
   * 保留
   */
  public byte[] byRes = new byte[7];
  /**
   * 最小时间间隔，单位：秒
   */
  public int dwMinInterval;
  /**
   * 最大时间间隔，单位：秒
   */
  public int dwMaxInterval;
  /**
   * 规则1
   */
  public NET_VCA_RELATE_RULE_PARAM struRule1Raram;
  /**
   * 规则2
   */
  public NET_VCA_RELATE_RULE_PARAM struRule2Raram;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[36];
}
