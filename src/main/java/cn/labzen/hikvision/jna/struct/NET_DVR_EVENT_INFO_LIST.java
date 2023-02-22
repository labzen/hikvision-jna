package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_RULE_NUM;

/**
 * 事件信息列表
 */
@Structure.FieldOrder({"byNum",
                       "byRes1",
                       "struEventInfo"})
public class NET_DVR_EVENT_INFO_LIST extends Structure {

  /**
   * 事件实时信息个数
   */
  public byte byNum;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 事际实时信息
   */
  public NET_DVR_EVENT_INFO[] struEventInfo = new NET_DVR_EVENT_INFO[MAX_RULE_NUM];
}
