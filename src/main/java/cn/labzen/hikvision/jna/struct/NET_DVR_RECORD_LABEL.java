package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.LABEL_NAME_LEN;

/**
 * 录像标签结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struTimeLabel",
                       "byQuickAdd",
                       "byRes1",
                       "sLabelName",
                       "byRes2"})
public class NET_DVR_RECORD_LABEL extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 标签的时间
   */
  public NET_DVR_TIME struTimeLabel;
  /**
   * 是否快速添加 快速添加时标签名称无效
   */
  public byte byQuickAdd;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 标签的名称 长度为40字节
   */
  public byte[] sLabelName = new byte[LABEL_NAME_LEN];
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[40];
}
