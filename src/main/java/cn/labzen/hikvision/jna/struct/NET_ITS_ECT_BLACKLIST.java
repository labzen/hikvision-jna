package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 黑名单报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwChannel",
                       "bylogicalLaneNo",
                       "byRes1",
                       "byLaneName",
                       "struPlateInfo",
                       "byRes2"})
public class NET_ITS_ECT_BLACKLIST extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 逻辑车道号
   */
  public byte bylogicalLaneNo;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 车道名称 32
   */
  public byte[] byLaneName = new byte[NAME_LEN];
  /**
   * 车牌信息结构
   */
  public NET_DVR_PLATE_INFO struPlateInfo;
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[256];
}
