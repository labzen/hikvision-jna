package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 智能查找条件联合体
 */
@Structure.FieldOrder({"byLenth",
                       "struATMFindInfo"})
public class NET_DVR_SPECIAL_FINDINFO_UNION extends Structure {

  /**
   * 联合体大小，8字节
   */
  public byte[] byLenth = new byte[8];
  /**
   * ATM查询条件
   */
  public NET_DVR_ATMFINDINFO struATMFindInfo;

}
