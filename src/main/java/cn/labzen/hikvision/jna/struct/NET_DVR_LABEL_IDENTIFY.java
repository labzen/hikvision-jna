package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.LABEL_IDENTIFY_LEN;

/**
 * 添加录像标签后的标识结构体
 */
@Structure.FieldOrder({"sLabelIdentify",
                       "byRes"})
public class NET_DVR_LABEL_IDENTIFY extends Structure {

  /**
   * 录像标签的标识
   */
  public byte[] sLabelIdentify = new byte[LABEL_IDENTIFY_LEN];
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[8];
}
