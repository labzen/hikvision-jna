package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * TME车辆抓拍上传信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "wLaneid",
                       "byCamLaneId",
                       "byRes1",
                       "dwChanIndex",
                       "struPlateInfo",
                       "struVehicleInfo",
                       "byMonitoringSiteID",
                       "byDeviceID",
                       "byDir",
                       "byRes2",
                       "wBackList",
                       "dwPicNum",
                       "struPicInfo",
                       "byPassVehicleID",
                       "byCardNo",
                       "bySwipeTime",
                       "dwCharge",
                       "byHistory",
                       "byLetPass",
                       "byRes3"})
public class NET_DVR_TME_VEHICLE_RESULT extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 车道号1～32（索引车道号，可以跳跃）
   */
  public short wLaneid;
  /**
   * 对应相机车道号1～16（相机配置的车道号，可以跳跃，可以相同）
   */
  public byte byCamLaneId;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 通道号
   */
  public int dwChanIndex;
  /**
   * 车牌信息结构
   */
  public NET_DVR_PLATE_INFO struPlateInfo;
  /**
   * 车辆信息
   */
  public NET_DVR_VEHICLE_INFO struVehicleInfo;
  /**
   * 监测点编号
   */
  public byte[] byMonitoringSiteID = new byte[48];
  /**
   * 设备编号
   */
  public byte[] byDeviceID = new byte[48];
  /**
   * 监测方向，0-其它 1 入场，2 出场
   */
  public byte byDir;
  /**
   * 保留
   */
  public byte byRes2;
  /**
   * 标记为是否报警数据 0 表示为正常过车数据  1 表示黑名单
   */
  public short wBackList;
  /**
   * 图片数量（与picGroupNum不同，代表本条信息附带的图片数量，图片信息由struVehicleInfoEx定义
   */
  public int dwPicNum;
  /**
   * 图片信息,暂定最多4张图
   */
  public NET_ITS_PICTURE_INFO[] struPicInfo = new NET_ITS_PICTURE_INFO[4];
  /**
   * 车辆唯一ID
   */
  public byte[] byPassVehicleID = new byte[32];
  /**
   * 卡号
   */
  public byte[] byCardNo = new byte[48];
  /**
   * 增加刷卡时间  时间格式为yyyymmddhh24missfff
   */
  public byte[] bySwipeTime = new byte[32];
  /**
   * 收费金额 （分）
   */
  public int dwCharge;
  /**
   * 是否是历史数据  0-否  1-是
   */
  public byte byHistory;
  /**
   * 是否已放行，0-未放行，1-放行  2-未知
   */
  public byte byLetPass;
  /**
   * 保留
   */
  public byte[] byRes3 = new byte[186];
}
