package cn.labzen.hikvision.jna.struct;

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
                       "byEventSearchStatus",
                       "byRecogResult",
                       "sLicense",
                       "byRes"})
public class NET_DVR_FIND_PICTURE extends Structure {

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
   * 参考结构 VCA_PLATE_COLOR
   */
  public byte byPlateColor;
  /**
   * 参考结构 VLR_VEHICLE_CLASS
   */
  public byte byVehicleLogo;
  /**
   * 连续图片表示同一查找结果的时候，0-表示后面没有图片信息，1-表示后面还有图片信息。总共图片信息包括最后一张状态为0的图片。
   */
  public byte byEventSearchStatus;
  /**
   * 识别结果参考结构VTR_RESULT
   */
  public byte byRecogResult;
  /**
   * 车牌号码
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 保留
   */
  public byte[] byRes = new byte[12];
}
