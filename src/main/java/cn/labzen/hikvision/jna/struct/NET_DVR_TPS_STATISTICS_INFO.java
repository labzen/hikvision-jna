package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * TPS统计过车数据信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwChan",
                       "struTPSStatisticsInfo",
                       "byRes"})
public class NET_DVR_TPS_STATISTICS_INFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChan;
  /**
   * 交通参数统计信息
   */
  public NET_DVR_TPS_STATISTICS_PARAM struTPSStatisticsInfo;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
