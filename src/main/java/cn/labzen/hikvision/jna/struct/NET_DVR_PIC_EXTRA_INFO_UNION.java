package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;

/**
 * 图片附件信息联合体
 */
@Structure.FieldOrder({"byUnionLen",
                       "struFaceExtraInfo"})
public class NET_DVR_PIC_EXTRA_INFO_UNION extends Union {

  /**
   * 联合体大小，544字节
   */
  public byte[] byUnionLen = new byte[544];
  /**
   * 人脸侦测信息
   */
  public NET_DVR_FACE_EXTRA_INFO struFaceExtraInfo;
}
