package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.*;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.CARDNUM_LEN_V30;
import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 图片查找条件结构体
 */
@Structure.FieldOrder({"dwSize",
                       "lChannel",
                       "byFileType",
                       "byNeedCard",
                       "byProvince",
                       "byEventType",
                       "sCardNum",
                       "struStartTime",
                       "struStopTime",
                       "dwTrafficType",
                       "dwVehicleType",
                       "dwIllegalType",
                       "byLaneNo",
                       "bySubHvtType",
                       "byRes2",
                       "sLicense",
                       "byRegion",
                       "byCountry",
                       "byArea",
                       "byISO8601",
                       "cStartTimeDifferenceH",
                       "cStartTimeDifferenceM",
                       "cStopTimeDifferenceH",
                       "cStopTimeDifferenceM"})
public class NET_DVR_FIND_PICTURE_PARAM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public NativeLong lChannel;
  /**
   * 查找的图片类型: 参考{@link PictureFileType}
   */
  public byte byFileType;
  /**
   * 是否需要卡号
   */
  public byte byNeedCard;
  /**
   * 省份索引值（byFileType为车牌侦测时有效）：参考{@link ProvinceAbbreviation}
   */
  public byte byProvince;
  /**
   * 事件类型：0保留，1-交通事件；2-违章取证；3-其他事件
   */
  public byte byEventType;
  /**
   * 卡号
   */
  public byte[] sCardNum = new byte[CARDNUM_LEN_V30];
  /**
   * 查找图片的开始时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 查找图片的结束时间
   */
  public NET_DVR_TIME struStopTime;
  /**
   * 图片检索生效项(仅智能交通设备支持)，参考{@link VehicleOperationType}
   */
  public int dwTrafficType;
  /**
   * 车辆类型(仅智能交通设备支持)，参考{@link VehicleType}
   */
  public int dwVehicleType;
  /**
   * 违规检测类型(仅智能交通设备支持)，参考{@link VehicleIllegalType}
   */
  public int dwIllegalType;
  /**
   * 车道号(1~99)
   */
  public byte byLaneNo;
  /**
   * 0-保留,1-机动车(机动车子类型中支持车牌检索，省份检索),2-非机动车,3-行人
   */
  public byte bySubHvtType;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[2];
  /**
   * 车牌号码
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 区域索引值 0-保留，1-欧洲(Europe Region)，2-俄语区域(Russian Region)，3-欧洲&俄罗斯(EU&CIS), 4-中东(MiddleEast),0xff-所有
   */
  public byte byRegion;
  /**
   * 国家索引值，参照：COUNTRY_INDEX
   */
  public byte byCountry;
  /**
   * 地区
   */
  public byte byArea;
  /**
   * 是否是8601的时间格式，即时差字段是否有效0-时差无效，年月日时分秒为设备本地时间 1-时差有效
   */
  public byte byISO8601;
  /**
   * 开始时间与UTC的时差（小时），-12 ... +14， 正数表示东时区
   */
  public byte cStartTimeDifferenceH;
  /**
   * 开始时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public byte cStartTimeDifferenceM;
  /**
   * 结束时间与UTC的时差（小时），-12 ... +14，正数表示东时区
   */
  public byte cStopTimeDifferenceH;
  /**
   * 结束时间与UTC的时差（分钟），-30, 0, 30, 45，正数表示东时区
   */
  public byte cStopTimeDifferenceM;
}
