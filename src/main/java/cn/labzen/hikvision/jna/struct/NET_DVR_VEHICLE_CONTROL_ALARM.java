package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.VehiclePlateColor;
import cn.labzen.hikvision.jna.definition.VehiclePlateType;
import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.MAX_CARDNO_LEN;
import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 车辆报警（黑白名单）报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byListType",
                       "byPlateType",
                       "byPlateColor",
                       "byRes1",
                       "sLicense",
                       "sCardNo",
                       "struAlarmTime",
                       "dwChannel",
                       "dwPicDataLen",
                       "byPicType",
                       "byPicTransType",
                       "byRes3",
                       "pPicData",
                       "byRes2"})
public class NET_DVR_VEHICLE_CONTROL_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 名单属性（黑白名单）0-白名单，1-黑名单，2-临时名单
   */
  public byte byListType;
  /**
   * 车牌类型，参考{@link VehiclePlateType}
   */
  public byte byPlateType;
  /**
   * 车牌颜色，参考{@link VehiclePlateColor}
   */
  public byte byPlateColor;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 车牌号码
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 卡号
   */
  public byte[] sCardNo = new byte[MAX_CARDNO_LEN];
  /**
   * 报警时间
   */
  public NET_DVR_TIME_V30 struAlarmTime;
  /**
   * 设备通道号，如果直连的是IPC，则为ipc通道号；如果连的DVR\nvr,则为DVR\NVR的通道号
   */
  public int dwChannel;
  /**
   * 图片数据大小，0表示无图片，不为0是表示后面带图片数据
   */
  public int dwPicDataLen;
  /**
   * 图片类型，0-JPEG
   */
  public byte byPicType;
  /**
   * 图片数据传输方式: 0-二进制；1-url
   */
  public byte byPicTransType;
  /**
   * 保留
   */
  public byte[] byRes3 = new byte[2];
  /**
   * 图片数据缓冲区，JPEG图片
   */
  public ByteByReference pPicData;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[48];
}
