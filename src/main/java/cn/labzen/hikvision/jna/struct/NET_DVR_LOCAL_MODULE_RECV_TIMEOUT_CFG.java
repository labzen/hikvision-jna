package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 按模块配置接收超时时间
 */
@Structure.FieldOrder({"dwPreviewTime",
                       "dwAlarmTime",
                       "dwVodTime",
                       "dwElse",
                       "byRes"})
public class NET_DVR_LOCAL_MODULE_RECV_TIMEOUT_CFG extends Structure {

  /**
   * 预览模块接收超时时间，单位：毫秒，取值范围：0~3000,000，0表示恢复默认设置
   */
  public short dwPreviewTime;
  /**
   * 报警模块接收超时时间，单位：毫秒，取值范围：0~3000,000，0表示恢复默认设置
   */
  public short dwAlarmTime;
  /**
   * 回放模块接收超时时间，单位：毫秒，取值范围：0~3000,000，0表示恢复默认设置
   */
  public short dwVodTime;
  /**
   * 其他模块接收超时时间，单位：毫秒，取值范围：0~3000,000，0表示恢复默认设置
   */
  public short dwElse;
  /**
   * 保留
   */
  public byte[] byRes = new byte[512];
}
