package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_ID_LEN;

/**
 * 出入口人脸抓拍结果结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byGroupNum",
                       "byPicNo",
                       "byFeaturePicNo",
                       "byRes",
                       "wLaneid",
                       "byCamLaneId",
                       "byDir",
                       "dwChanIndex",
                       "byMonitoringSiteID",
                       "byDeviceID",
                       "struFaceInfo",
                       "byRes2"})
public class NET_ITS_GATE_FACE extends Structure {

  /**
   * 结构体长度
   */
  public int dwSize;
  /**
   * 图片组数量（一个行人相机多次抓拍的数量，代表一组图片的总数，用于延时匹配数据）
   */
  public byte byGroupNum;
  /**
   * 连拍的图片序号（接收到图片组数量后，表示接收完成。
   */
  public byte byPicNo;
  /**
   * 连抓时取第几张图作为特写图,0xff-表示不取
   */
  public byte byFeaturePicNo;
  /**
   * 保留
   */
  public byte byRes;
  /**
   * 车道号1～32（索引车道号，可以跳跃）
   */
  public short wLaneid;
  /**
   * 对应相机车道号1～16（相机配置的车道号，可以跳跃，可以相同）
   */
  public byte byCamLaneId;
  /**
   * 监测方向，0-其他 1 入场， 2 出场
   */
  public byte byDir;
  /**
   * 通道号
   */
  public int dwChanIndex;
  /**
   * 监测点编号
   */
  public byte[] byMonitoringSiteID = new byte[MAX_ID_LEN];
  /**
   * 设备编号
   */
  public byte[] byDeviceID = new byte[MAX_ID_LEN];
  /**
   * 人脸抓拍数据
   */
  public NET_VCA_FACESNAP_RESULT struFaceInfo;
  /**
   * 预留
   */
  public byte[] byRes2 = new byte[256];
}
