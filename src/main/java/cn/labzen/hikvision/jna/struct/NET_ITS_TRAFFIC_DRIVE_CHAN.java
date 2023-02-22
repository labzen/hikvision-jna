package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 单个车道路况信息结构体
 */
@Structure.FieldOrder({"byDriveChan",
                       "byRes1",
                       "wCarFlux",
                       "wPasserbyFlux",
                       "wShayFlux",
                       "fAverOccpancy",
                       "wAverSpeed",
                       "wAverCarDis",
                       "byRes2"})
public class NET_ITS_TRAFFIC_DRIVE_CHAN extends Structure {

  /**
   * 车道号
   */
  public byte byDriveChan;
  /**
   * 预留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 汽车流量数
   */
  public short wCarFlux;
  /**
   * 行人流量数
   */
  public short wPasserbyFlux;
  /**
   * 二轮车流量数
   */
  public short wShayFlux;
  /**
   * 平均车道占有率百分比
   */
  public float fAverOccpancy;
  /**
   * 平均车速(km/h)
   */
  public short wAverSpeed;
  /**
   * 平均车距(单位待定)
   */
  public short wAverCarDis;
  /**
   * 预留
   */
  public byte[] byRes2 = new byte[16];
}
