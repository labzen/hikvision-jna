package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 内存池本地配置结构体
 */
@Structure.FieldOrder({"dwAlarmMaxBlockNum",
                       "dwAlarmReleaseInterval",
                       "dwObjectReleaseInterval",
                       "byRes"})
public class NET_DVR_LOCAL_MEM_POOL_CFG extends Structure {

  /**
   * 报警模块内存池最多向系统申请的内存块（block）个数，每个block为64MB，超过这个上限则不向系统申请，0表示无上限
   */
  public short dwAlarmMaxBlockNum;
  /**
   * 报警模块空闲内存释放的间隔，单位秒，为0表示不释放
   */
  public short dwAlarmReleaseInterval;
  /**
   * 对象申请模块空闲内存释放的间隔，单位秒，为0表示不释放
   */
  public short dwObjectReleaseInterval;
  /**
   * 保留
   */
  public byte[] byRes = new byte[508];
}
