package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.STREAM_ID_LEN;

/**
 * 时间参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "sStreamID",
                       "dwChan",
                       "byStreamType",
                       "byRes"})
public class NET_DVR_I_FRAME extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
  /**
   * 流ID
   */
  public byte[] sStreamID = new byte[STREAM_ID_LEN];
  /**
   * 被控通道号
   */
  public int dwChan;
  /**
   * 0-主码流，1-子码流，2-码流3，3-码流4，4-码流5
   */
  public byte byStreamType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[63];

}
