package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.ITS_MAX_DEVICE_NUM;

/**
 * 路口设备异常报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwChannel",
                       "byTriggerMode",
                       "byRes1",
                       "dwDeviceNum",
                       "byMonitoringSiteID",
                       "byRoadInfo",
                       "struSingleDevice",
                       "byRes"})
public class NET_ITS_ROADINFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号,0xffffffff表示终端，其它表示对应的相机
   */
  public int dwChannel;
  /**
   * 0:线圈触发;  1:视频触发
   */
  public byte byTriggerMode;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 实际设备个数
   */
  public int dwDeviceNum;
  /**
   * 监测点编号
   */
  public byte[] byMonitoringSiteID = new byte[48];
  /**
   * 监测点信息
   */
  public byte[] byRoadInfo = new byte[48];
  /**
   * 路口设备信息
   */
  public NET_ITS_SINGLE_DEVICE_INFO[] struSingleDevice = new NET_ITS_SINGLE_DEVICE_INFO[ITS_MAX_DEVICE_NUM];
  /**
   * 保留
   */
  public byte[] byRes = new byte[16];
}
