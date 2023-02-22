package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_NODE_NUM;

/**
 * 设备磁盘列表结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwNodeNum",
                       "struDescNode"})
public class NET_DVR_DISKABILITY_LIST extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
  /**
   * 能力结点个数
   */
  public int dwNodeNum;
  /**
   * 描述参数
   */
  public NET_DVR_DESC_NODE[] struDescNode = new NET_DVR_DESC_NODE[MAX_NODE_NUM];
}
