package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.DESC_LEN_32;

/**
 * 能力节点描述参数结构体
 */
@Structure.FieldOrder({"iValue",
                       "byDescribe",
                       "dwFreeSpace",
                       "byRes"})
public class NET_DVR_DESC_NODE extends Structure {

  /**
   * -1表示能力可以是一项可以变范围的自定义值
   */
  int iValue;
  /**
   * 描述字段
   */
  byte[] byDescribe = new byte[DESC_LEN_32];
  /**
   * 获取磁盘列表专用,单位为M
   */
  int dwFreeSpace;
  /**
   * 保留
   */
  byte[] byRes = new byte[12];
}
