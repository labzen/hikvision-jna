package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 路口设备信息结构体
 */
@Structure.FieldOrder({"dwDeviceType",
                       "dwDirID",
                       "dwLaneID",
                       "dwDeviceState",
                       "byDeviceName",
                       "byDeviceID",
                       "struTriggerTime",
                       "byRelateChan",
                       "byRes"})
public class NET_ITS_SINGLE_DEVICE_INFO extends Structure {

  /**
   * 设备类型：0-终端，1-相机，2-补光灯，3-车检器，4-线圈1，5-线圈2，6-线圈3，7-红绿灯检测器，8-机柜，9-雷达，10-道闸，
   * 11-出入口控制机(票箱)，12-LED显示屏，13-远距离读卡器，14-近距离读卡器，15-红外扫描枪，16-票据打印机，
   * 17-节点管理器(诱导服务器相关) , 18-机柜检测仪
   */
  public int dwDeviceType;
  /**
   * 方向编号
   */
  public int dwDirID;
  /**
   * 车道编号
   */
  public int dwLaneID;
  /**
   * 设备状态  0正常 非0 异常（参考设备异常代码表）
   */
  public int dwDeviceState;
  /**
   * 设备名称
   */
  public byte[] byDeviceName = new byte[32];
  /**
   * 设备编号，一般用序列号，车检器用地址
   */
  public byte[] byDeviceID = new byte[48];
  /**
   * 触发时间
   */
  public NET_DVR_TIME_V30 struTriggerTime;
  /**
   * 关联通道号（传感器是1~8  AC端子1~4  AC插座1~2）
   */
  public byte byRelateChan;
  /**
   * 保留
   */
  public byte[] byRes = new byte[3];
}
