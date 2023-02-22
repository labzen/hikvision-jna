package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 交通统计数据结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byMonitoringSiteID",
                       "byDeviceID",
                       "byLaneNum",
                       "byDir",
                       "byDetectType",
                       "byRes1",
                       "dwChannel",
                       "struStartTime",
                       "dwSamplePeriod",
                       "struDriveChan",
                       "byRes2"})
public class NET_ITS_TRAFFIC_COLLECT extends Structure {

  /**
   * 结构大小
   */
  public int dwSize;
  /**
   * 监测点编号
   */
  public byte[] byMonitoringSiteID = new byte[48];
  /**
   * 设备编号
   */
  public byte[] byDeviceID = new byte[48];
  /**
   * 车道总数
   */
  public byte byLaneNum;
  /**
   * 监测方向
   */
  public byte byDir;
  /**
   * 检测方式1-地感线圈、2-视频触发、3、多帧识别、4雷达触发
   */
  public byte byDetectType;
  /**
   * 预留
   */
  public byte byRes1;
  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 统计开始时间
   */
  public NET_DVR_SYSTEM_TIME struStartTime;
  /**
   * 统计时间,单位秒
   */
  public int dwSamplePeriod;
  /**
   * 交通流量数据,每个相机支持6个车道
   */
  public NET_ITS_TRAFFIC_DRIVE_CHAN[] struDriveChan = new NET_ITS_TRAFFIC_DRIVE_CHAN[6];
  /**
   * 预留
   */
  public byte[] byRes2 = new byte[24];
}
