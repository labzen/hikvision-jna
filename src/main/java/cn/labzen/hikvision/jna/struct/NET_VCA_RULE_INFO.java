package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.VcaEventType;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 事件规则信息结构体
 * <p/>
 * 上传的行为报警事件，建议事件类型按wEventTypeEx的值定义进行区分，兼容参数dwEventType。
 */
@Structure.FieldOrder({"byRuleID",
                       "bySceneID",
                       "wEventTypeEx",
                       "byRuleName",
                       "dwEventType",
                       "uEventParam"})
public class NET_VCA_RULE_INFO extends Structure {

  /**
   * 规则ID,0-7
   */
  public byte byRuleID;

  /**
   * 场景ID,返回0无效
   */
  public byte bySceneID;

  /**
   * 行为事件类型扩展，用于代替字段dwEventType，参考VCA_RULE_EVENT_TYPE_EX
   */
  public short wEventTypeEx;

  /**
   * 规则名称
   */
  public byte[] byRuleName = new byte[NAME_LEN];

  /**
   * 行为事件类型，保留是为了兼容，后续建议使wEventTypeEx获取事件类型，参考{@link VcaEventType}
   */
  public int dwEventType;

  /**
   * 事件参数
   */
  public NET_VCA_EVENT_UNION uEventParam;
}
