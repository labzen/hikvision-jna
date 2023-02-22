package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_FACE_PIC_NUM;

/**
 * 人脸侦测抓图附加信息结构体
 */
@Structure.FieldOrder({"dwYear",
                       "dwMonth",
                       "dwDay",
                       "dwHour",
                       "dwMinute",
                       "dwSecond"})
public class NET_DVR_FACE_EXTRA_INFO extends Structure {

  /**
   * 人脸子图坐标信息
   */
  public NET_VCA_RECT[] struVcaRect = new NET_VCA_RECT[MAX_FACE_PIC_NUM];
  /**
   * 保留
   */
  public byte[] byRes = new byte[64];
}
