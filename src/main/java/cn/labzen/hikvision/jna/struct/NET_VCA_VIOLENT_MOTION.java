package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 剧烈运动参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byMode",
                       "byRes"})
public class NET_VCA_VIOLENT_MOTION extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发剧烈运动报警阈值：1-50秒
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1,5]
   */
  public byte bySensitivity;
  /**
   * 0-纯视频模式，1-音视频联合模式，2-纯音频模式
   */
  public byte byMode;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
