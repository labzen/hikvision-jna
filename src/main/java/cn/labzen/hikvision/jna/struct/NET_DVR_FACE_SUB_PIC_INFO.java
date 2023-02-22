package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人体特征识别结果结构体
 */
@Structure.FieldOrder({"dwSimilarity",
                       "struVcaRect",
                       "byRes2"})
public class NET_DVR_FACE_SUB_PIC_INFO extends Structure {

  /**
   * 相似度 0-100
   */
  public int dwSimilarity;
  /**
   * 人脸区域，归一化坐标
   */
  public NET_VCA_RECT struVcaRect;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[236];
}
