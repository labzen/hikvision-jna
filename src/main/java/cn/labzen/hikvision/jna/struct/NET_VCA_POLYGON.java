package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.VCA_MAX_POLYGON_POINT_NUM;

/**
 * 多边形结构体
 */
@Structure.FieldOrder({"dwPointNum",
                       "struPos"})
public class NET_VCA_POLYGON extends Structure {

  /**
   * 有效点 大于等于3，若是3点在一条线上认为是无效区域，线交叉认为是无效区域
   */
  public int dwPointNum;
  /**
   * 多边形边界点,最多十个
   */
  public NET_VCA_POINT[] struPos = new NET_VCA_POINT[VCA_MAX_POLYGON_POINT_NUM];
}
