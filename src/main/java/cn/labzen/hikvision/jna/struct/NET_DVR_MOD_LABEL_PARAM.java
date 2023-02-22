package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.LABEL_NAME_LEN;

/**
 * 标签修改结构体
 */
@Structure.FieldOrder({"struIndentify",
                       "byRes1",
                       "sLabelName",
                       "byRes2"})
public class NET_DVR_MOD_LABEL_PARAM extends Structure {

  /**
   * 要修改的标签标识
   */
  public NET_DVR_LABEL_IDENTIFY struIndentify;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[24];
  /**
   * 修改后的标签名称
   */
  public byte[] sLabelName = new byte[LABEL_NAME_LEN];
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[40];
}
