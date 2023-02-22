package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 车辆检测信息结构体
 */
@Structure.FieldOrder({"sLicense",
                       "byCountry",
                       "byRes"})
public class NET_DVR_VEHICLE_PARA extends Structure {

  /**
   * 车牌号码
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 国家索引值：0-算法库不支持牌识国家，1-捷克共和国(CZ - Czech Republic)，2-法国(FRA - France)，3-德国(DE - Germany)，
   * 4-西班牙(E - Spain)，5-意大利(IT - Italy)，6-荷兰(NL - Netherlands)，7-波兰(PL - Poland)，8-斯洛伐克(SVK - Slovakia)，
   * 9-白俄罗斯(BY - Belorussia)，10-摩尔多瓦(MDA - Moldova)，11-俄罗斯(RU - Russia)，12-乌克兰(UA - Ukraine)，
   * 169-加拿大(Canada), 172-美国(US), 227-澳大利亚(Australia),0xfe-无法识别
   */
  public byte byCountry;
  /**
   * 保留
   */
  public byte[] byRes = new byte[239];

}
