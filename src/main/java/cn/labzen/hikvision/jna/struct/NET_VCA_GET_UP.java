package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 起身参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "byMode",
                       "bySensitivity",
                       "byRes"})
public class NET_VCA_GET_UP extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 触发起床报警阈值1-100 秒
   */
  public short wDuration;
  /**
   * 起身检测模式,0-大床通铺模式,1-高低铺模式,2-大床通铺坐立起身模式
   */
  public byte byMode;
  /**
   * 灵敏度参数，范围[1,10]
   */
  public byte bySensitivity;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[4];
}
