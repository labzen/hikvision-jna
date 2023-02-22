package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 识别结果结构体
 * <ul>
 *   <li>智能交通摄像机报警上传的信息是图片或者录像中的一种，可以通过判断图片和录像的长度是否为0以确定上传的是图片信息还是录像信息。
 *   图片数据为场景图片+车牌小图片。视频长度为0xffffffff时，表示视频内容异常，此时只上传报警信息，后面无视频内容，指向视频内容的指针为NULL。 </li>
 *   <li>iDS-65xx手动抓拍只支持上传pBuffer1和pBuffer2。 </li>
 *   <li>当byResultType为2时，可以用wAlarmRecordID作为查找条件，搜索报警录像。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "byResultType",
                       "byChanIndex",
                       "wAlarmRecordID",
                       "dwRelativeTime",
                       "byAbsTime",
                       "dwPicLen",
                       "dwPicPlateLen",
                       "dwVideoLen",
                       "byTrafficLight",
                       "byPicNum",
                       "byDriveChan",
                       "byVehicleType",
                       "dwBinPicLen",
                       "dwCarPicLen",
                       "dwFarCarPicLen",
                       "pBuffer3",
                       "pBuffer4",
                       "pBuffer5",
                       "byRelaLaneDirectionType",
                       "byCarDirectionType",
                       "byRes3",
                       "struPlateInfo",
                       "struVehicleInfo",
                       "pBuffer1",
                       "pBuffer2"})
public class NET_DVR_PLATE_RESULT extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
  /**
   * 0-视频识别结果，1图像识别结果 2 大于10M时走下载路线
   */
  public byte byResultType;
  /**
   * 通道号
   */
  public byte byChanIndex;
  /**
   * 报警录像ID(用于查询录像，仅当byResultType为2时有效)
   */
  public short wAlarmRecordID;
  /**
   * 相对时间点
   */
  public int dwRelativeTime;
  /**
   * 绝对时间点,yyyymmddhhmmssxxx,e.g.20090810235959999（毫秒）
   */
  public byte[] byAbsTime = new byte[32];
  /**
   * 图片长度(近景图)
   */
  public int dwPicLen;
  /**
   * 车牌小图片长度
   */
  public int dwPicPlateLen;
  /**
   * 录像内容长度
   */
  public int dwVideoLen;
  /**
   * 0-非红绿灯抓拍，1-绿灯时抓拍；2-红灯时抓拍
   */
  public byte byTrafficLight;
  /**
   * 连拍的图片序号
   */
  public byte byPicNum;
  /**
   * 触发车道号
   */
  public byte byDriveChan;
  /**
   * 车辆类型，参考VTR_RESULT
   */
  public byte byVehicleType;
  /**
   * 车牌二值图长度
   */
  public int dwBinPicLen;
  /**
   * 车辆原图长度
   */
  public int dwCarPicLen;
  /**
   * 远景图长度
   */
  public int dwFarCarPicLen;
  /**
   * 车牌二值图
   */
  public ByteByReference pBuffer3;
  /**
   * 车辆原图
   */
  public ByteByReference pBuffer4;
  /**
   * 远景图
   */
  public ByteByReference pBuffer5;
  /**
   * 关联车道方向类型，参考ITC_RELA_LANE_DIRECTION_TYPE，该参数为车道方向参数，与关联车道号对应，确保车道唯一性。
   */
  public byte byRelaLaneDirectionType;
  /**
   * 车辆具体行驶的方向，0表示从上往下，1表示从下往上（根据实际车辆的行驶方向来的区分）
   */
  public byte byCarDirectionType;
  /**
   * 保留
   */
  public byte[] byRes3 = new byte[6];
  /**
   * 车牌信息结构
   */
  public NET_DVR_PLATE_INFO struPlateInfo;
  /**
   * 车辆信息
   */
  public NET_DVR_VEHICLE_INFO struVehicleInfo;
  /**
   * 当上传的是图片(近景图)，指针指向图片信息，当上传的是视频，指针指向视频信息，如果不想获得图片或视频信息，传NULL(DVS车辆近景图)
   */
  public ByteByReference pBuffer1;
  /**
   * 当上传的是图片(车牌图)时，指向车牌图片的指针（DVS车牌彩图）
   */
  public ByteByReference pBuffer2;
}
