package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 夏令时参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwZoneIndex",
                       "byRes1",
                       "dwEnableDST",
                       "byDSTBias",
                       "byRes2",
                       "struBeginPoint",
                       "struEndPoint"})
public class NET_DVR_ZONEANDDST extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 应用层软件使用NET_DVR_NTPPARA 中的cTimeDifferenceH 或cTimeDifferenceM 来设置时区，
   * 此处用获取的值填充，不对用户提供输入编辑框
   */
  public int dwZoneIndex;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[12];
  /**
   * 是否启用夏时制 0－不启用 1－启用
   */
  public int dwEnableDST;
  /**
   * 夏令时偏移值，30min, 60min, 90min, 120min, 以分钟计，传递原始数值
   */
  public byte byDSTBias;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[3];
  /**
   * 夏时制开始时间
   */
  public NET_DVR_TIMEPOINT struBeginPoint;
  /**
   * 夏时制停止时间
   */
  public NET_DVR_TIMEPOINT struEndPoint;
}
