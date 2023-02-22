package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;

/**
 * 智能查找条件联合体
 * <p/>
 * 对于byMotionScope：整个图像的区域大小P制为704×576，N制为704×480，即将704×576（或者704×480）的
 * 画面分割成22×18（或者22×15）个小宏块，然后可分别设置每个宏块是否为移动侦测区域。如果P制情况下，
 * 设备的图像大小不为704*576，比如高清设备1280*720，设置移动侦测时需要将画面缩小成704*576，然后设置移动侦测区域。
 */
@Structure.FieldOrder({"byLen",
                       "byMotionScope",
                       "struTraversPlaneCond",
                       "struIntrusionCond",
                       "struFaceSnapCond"})
public class NET_DVR_AREA_SMARTSEARCH_COND_UNION extends Union {

  /**
   * 结构体长度
   */
  public byte[] byLen = new byte[6144];
  /**
   * 移动侦测区域，96×64的数组中，P制只有22×18有效，N制只有22×15有效，取值为1表示该宏块设定为移动侦测区域，0示不设定为移动侦测区域；其他保留，置为0
   */
  public byte[] byMotionScope = new byte[64 * 96];
  /**
   * 越界侦测录像查找条件
   */
  public NET_DVR_TRAVERSE_PLANE_SEARCHCOND struTraversPlaneCond;
  /**
   * 区域入侵录像查找条件
   */
  public NET_DVR_INTRUSION_SEARCHCOND struIntrusionCond;
  /**
   * 人脸侦测录像查找条件
   */
  public NET_DVR_FACEDETECTION_SEARCHCOND struFaceSnapCond;
}
