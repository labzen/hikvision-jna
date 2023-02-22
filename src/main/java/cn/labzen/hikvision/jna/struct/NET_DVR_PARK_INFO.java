package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_PlATE_NO_LEN;

/**
 * 车位信息结构体
 */
@Structure.FieldOrder({"sPlateNo",
                       "sParkIndex",
                       "byRes"})
public class NET_DVR_PARK_INFO extends Structure {

  /**
   * 车牌号码
   */
  public byte[] sPlateNo = new byte[MAX_PlATE_NO_LEN];
  /**
   * 车位编号
   */
  public byte[] sParkIndex = new byte[MAX_PlATE_NO_LEN];
  /**
   * 保留
   */
  public byte[] byRes = new byte[64];
}
