package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_DEL_LABEL_IDENTIFY;

/**
 * 要删除的标签信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byMode",
                       "byRes1",
                       "wLabelNum",
                       "struIndentify",
                       "byRes2"})
public class NET_DVR_DEL_LABEL_PARAM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 按位表示,0x01表示按标识删除
   */
  public byte byMode;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 标签数目
   */
  public short wLabelNum;
  /**
   * 标签标识
   */
  public NET_DVR_LABEL_IDENTIFY[] struIndentify = new NET_DVR_LABEL_IDENTIFY[MAX_DEL_LABEL_IDENTIFY];
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[160];
}
