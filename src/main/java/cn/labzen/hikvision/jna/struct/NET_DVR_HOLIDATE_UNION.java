package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 假日参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struModeA",
                       "struModeB",
                       "struModeC"})
public class NET_DVR_HOLIDATE_UNION extends Structure {

  /**
   * 联合体大小
   */
  public int[] dwSize = new int[3];
  /**
   * 日期模式A
   */
  public NET_DVR_HOLIDATE_MODEA struModeA;
  /**
   * 日期模式B
   */
  public NET_DVR_HOLIDATE_MODEB struModeB;
  /**
   * 日期模式C
   */
  public NET_DVR_HOLIDATE_MODEC struModeC;

}
