package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.MAX_CATEGORY_LEN;
import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 交通抓拍结果车牌信息结构体
 */
@Structure.FieldOrder({"byPlateType",
                       "byColor",
                       "byBright",
                       "byLicenseLen",
                       "byEntireBelieve",
                       "byRegion",
                       "byCountry",
                       "byArea",
                       "byPlateSize",
                       "byAddInfoFlag",
                       "byRes",
                       "pAddInfoBuffer",
                       "sPlateCategory",
                       "dwXmlLen",
                       "pXmlBuf",
                       "struPlateRect",
                       "sLicense",
                       "byBelieve"})
public class NET_DVR_PLATE_INFO extends Structure {

  /**
   * 车牌类型
   */
  public byte byPlateType;
  /**
   * 车牌颜色
   */
  public byte byColor;
  /**
   * 车牌亮度
   */
  public byte byBright;
  /**
   * 车牌字符个数
   */
  public byte byLicenseLen;
  /**
   * 整个车牌的置信度，-100
   */
  public byte byEntireBelieve;
  /**
   * 区域索引值 0-保留，1-欧洲(EU)，2-俄语区域(ER)，3-欧洲&俄罗斯(EU&CIS) ,4-中东(ME),0xff-所有
   */
  public byte byRegion;
  /**
   * 国家索引值，参照枚举COUNTRY_INDEX（不支持"COUNTRY_ALL = 0xff 全部"）
   */
  public byte byCountry;
  /**
   * 区域（省份），各国家内部区域枚举，阿联酋参照 EMI_AREA
   */
  public byte byArea;
  /**
   * 车牌尺寸，0~未知，1~long, 2~short(中东车牌使用)
   */
  public byte byPlateSize;
  /**
   * 附加信息标识（即是否有NET_DVR_VEHICLE_ADDINFO结构体）,0-无附加信息, 1-有附加信息。
   */
  public byte byAddInfoFlag;
  /**
   * 保留
   */
  public byte[] byRes = new byte[6];
  /**
   * 附加信息指针,指向NET_DVR_VEHICLE_ADDINFO结构体
   */
  public ByteByReference pAddInfoBuffer;
  /**
   * 车牌附加信息, 即中东车牌中车牌号码旁边的小字信息，(目前只有中东地区支持)
   */
  public byte[] sPlateCategory = new byte[MAX_CATEGORY_LEN];
  /**
   * XML报警信息长度
   */
  public int dwXmlLen;
  /**
   * XML报警信息指针,报警类型为 COMM_ITS_PLATE_RESUL时有效，其XML对应到EventNotificationAlert XML
   */
  public String pXmlBuf;
  /**
   * 车牌位置
   */
  public NET_VCA_RECT struPlateRect;
  /**
   * 车牌号码,注：中东车牌需求把小字也纳入车牌号码，小字和车牌号中间用空格分隔
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 各个识别字符的置信度，如检测到车牌"浙A12345", 置信度为,20,30,40,50,60,70，则表示"浙"字正确的可能性只有%，"A"字的正确的可能性是%
   */
  public byte[] byBelieve = new byte[MAX_LICENSE_LEN];
}
