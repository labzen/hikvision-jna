package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 通道录像起止时间查询条件结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byType",
                       "byRes"})
public class NET_DVR_RECORD_TIME_SPAN_INQUIRY extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 录像类型， 0正常音视频录像, 1图片通道录像, 2ANR通道录像, 3抽帧通道录像
   */
  public byte byType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[63];
}
