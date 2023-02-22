package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.PictureFileType;
import cn.labzen.hikvision.jna.definition.VehicleBrand;
import cn.labzen.hikvision.jna.definition.VehicleModel;
import cn.labzen.hikvision.jna.definition.VehiclePlateColor;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 图片查找结果信息结构体
 */
@Structure.FieldOrder({"sFileName",
                       "struTime",
                       "dwFileSize",
                       "sCardNum",
                       "byPlateColor",
                       "byVehicleLogo",
                       "byFileType",
                       "byRecogResult",
                       "sLicense",
                       "byEventSearchStatus",
                       "struAddr",
                       "byISO8601",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes",
                       "uPicExtraInfo"})
public class NET_DVR_FIND_PICTURE_V50 extends Structure {

  /**
   * 图片名
   */
  public byte[] sFileName = new byte[PICTURE_NAME_LEN];
  /**
   * 图片的时间
   */
  public NET_DVR_TIME struTime;
  /**
   * 图片的大小
   */
  public int dwFileSize;
  /**
   * 卡号
   */
  public byte[] sCardNum = new byte[CARDNUM_LEN_V30];
  /**
   * 车牌颜色(仅智能交通设备支持)，参考{@link VehiclePlateColor}
   */
  public byte byPlateColor;
  /**
   * 汽车品牌(仅智能交通设备支持)，参考{@link VehicleBrand}
   */
  public byte byVehicleLogo;
  /**
   * 文件类型，参考{@link PictureFileType}
   */
  public byte byFileType;
  /**
   * 识别结果参考结构，参考{@link VehicleModel}
   */
  public byte byRecogResult;
  /**
   * 车牌号码
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 连续图片表示同一查找结果的时候，0-表示后面没有图片信息，1-表示后面还有图片信息。总共图片信息包括最后一张状态为0的图片。
   */
  public byte byEventSearchStatus;
  /**
   * 图片所在的地址信息，图片下载时用到
   */
  public NET_DVR_ADDRESS struAddr;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 与UTC的时差（小时），-12 ... +14
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30,0, 30, 45
   */
  public byte cTimeDifferenceM;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[253];
  /**
   * 图片附件信息
   */
  public NET_DVR_PIC_EXTRA_INFO_UNION uPicExtraInfo;
}
