package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * SDK日志参数配置结构体
 */
@Structure.FieldOrder({"wSDKLogNum",
                       "byRes"})
public class NET_DVR_LOCAL_LOG_CFG extends Structure {

  /**
   * SDK日志文件个数，SDK写日志模式为覆盖模式（NET_DVR_SetLogToFile接口中参数bAutoDel为TRUE）时日志生成的个数，0表示默认值（即10个）
   * TODO NET_DVR_SetLogToFile
   */
  public short wSDKLogNum;
  /**
   * 保留
   */
  public byte[] byRes = new byte[254];
}
