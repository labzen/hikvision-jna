package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.VcaEventType;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 单个事件信息
 */
@Structure.FieldOrder({"byRuleID",
                       "byRes",
                       "byRuleName",
                       "dwEventType",
                       "uEventParam"})
public class NET_DVR_EVENT_INFO extends Structure {

  /**
   * Rule ID
   */
  public byte byRuleID;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[3];
  /**
   * 规则名称
   */
  public byte[] byRuleName = new byte[NAME_LEN];
  /**
   * 参照{@link VcaEventType}
   */
  public int dwEventType;
  /**
   * 事件参数联合体
   */
  public NET_DVR_EVENT_PARAM_UNION uEventParam;

}
