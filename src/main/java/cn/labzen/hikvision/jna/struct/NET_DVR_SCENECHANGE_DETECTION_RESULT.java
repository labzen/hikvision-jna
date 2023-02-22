package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 场景变更报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "wDevInfoIvmsChannelEx",
                       "byRes"})
public class NET_DVR_SCENECHANGE_DETECTION_RESULT extends Structure {

  /**
   * 结构大小
   */
  public int dwSize;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[126];
}
