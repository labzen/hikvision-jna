package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.MAX_HUMAN_BIRTHDATE_LEN;
import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 人员信息结构体
 * <p/>
 * dwPersonInfoExtendLen && pPersonInfoExtend 对应URL(/ISAPI/System/Video/inputs/channels/<ID>/faceContrast/personInfoExtend)表示的 PersonInfoExtendList XML Block
 * 意义所在：平台中心管理的时候，导入picture数据的自定义信息，在设备检测匹配报警后，携带作为匹配信息一并上传；平台中心管理匹配；
 */
@Structure.FieldOrder({"bySex",
                       "byCertificateType",
                       "byBirthDate",
                       "byName",
                       "struNativePlace",
                       "byCertificateNumber",
                       "dwPersonInfoExtendLen",
                       "pPersonInfoExtend",
                       "byAgeGroup",
                       "byRes2"})
public class NET_VCA_HUMAN_ATTRIBUTE extends Structure {

  /**
   * 性别：0-男，1-女，0xff-未知
   */
  public byte bySex;
  /**
   * 证件类型：0-身份证，1-警官证，2-军官证，3-护照，4-其他，0xff-未知
   */
  public byte byCertificateType;
  /**
   * 出生年月，如：201106
   */
  public byte[] byBirthDate = new byte[MAX_HUMAN_BIRTHDATE_LEN];
  /**
   * 姓名
   */
  public byte[] byName = new byte[NAME_LEN];
  /**
   * 籍贯参数
   */
  public NET_DVR_AREAINFOCFG struNativePlace;
  /**
   * 证件号
   */
  public byte[] byCertificateNumber = new byte[NAME_LEN];
  /**
   * 人员标签信息扩展长度
   */
  public int dwPersonInfoExtendLen;
  /**
   * 人员标签信息扩展信息
   */
  public ByteByReference pPersonInfoExtend;
  /**
   * 年龄段，详见HUMAN_AGE_GROUP_ENUM，如传入0xff表示未知
   */
  public byte byAgeGroup;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[11];
}
