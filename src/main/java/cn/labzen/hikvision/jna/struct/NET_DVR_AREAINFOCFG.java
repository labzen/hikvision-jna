package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.ProvinceIndex;
import com.sun.jna.Structure;

/**
 * 籍贯参数结构体
 */
@Structure.FieldOrder({"wNationalityID",
                       "wProvinceID",
                       "wCityID",
                       "wCountyID",
                       "dwCode"})
public class NET_DVR_AREAINFOCFG extends Structure {

  /**
   * 国籍
   */
  public short wNationalityID;
  /**
   * 省，参考{@link ProvinceIndex}
   */
  public short wProvinceID;
  /**
   * 市
   */
  public short wCityID;
  /**
   * 县
   */
  public short wCountyID;
  /**
   * 国家标准的省份、城市、县级代码，为0表示设备不支持，不为0时wNationalityID、wProvinceID、wCityID、wCountyID取值详见全国各省份城市列表
   */
  public int dwCode;
}
