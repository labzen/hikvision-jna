package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.RecordFileType;
import com.sun.jna.Structure;

/**
 * 录像段加锁/解锁参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "strBeginTime",
                       "strEndTime",
                       "dwChannel",
                       "dwRecordType",
                       "dwLockDuration",
                       "strUnlockTimePoint",
                       "byRes"})
public class NET_DVR_TIME_LOCK extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 开始时间
   */
  public NET_DVR_TIME strBeginTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME strEndTime;
  /**
   * 通道号, 0xff表示所有通道
   */
  public int dwChannel;
  /**
   * 录像类型: 参考{@link RecordFileType}
   */
  public int dwRecordType;
  /**
   * 锁定持续时间,单位秒,0xffffffff表示永久锁定
   */
  public int dwLockDuration;
  /**
   * 加锁时有效，当dwLockDuration不为永久锁定时，锁定持续的时间到此时间点就自动解锁
   */
  public NET_DVR_TIME_EX strUnlockTimePoint;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
