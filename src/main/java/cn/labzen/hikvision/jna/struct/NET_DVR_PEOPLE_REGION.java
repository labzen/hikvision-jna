package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人员检测区域信息结构体
 */
@Structure.FieldOrder({"byID",
                       "byNumber",
                       "byDressType",
                       "byRes",
                       "struRegion",
                       "dwPicLen",
                       "pPicBuffer",
                       "byRes1"})
public class NET_DVR_PEOPLE_REGION extends Structure {

  /**
   * 区域ID
   */
  public byte byID;
  /**
   * 区域中的人员数量 0-表示区域中没有人员
   */
  public byte byNumber;
  /**
   * 着装类型 0-未知，1-法袍、2-徽章、3-制服
   */
  public byte byDressType;
  /**
   * 保留
   */
  public byte byRes;
  /**
   * 区域范围
   */
  public NET_VCA_RECT struRegion;
  /**
   * 检测图片长度 (0表示没有长度)
   */
  public int dwPicLen;
  /**
   * 具体的图片数据
   */
  public String pPicBuffer;
  /**
   * 保留(预留后期扩展区域属性)
   */
  public byte[] byRes1 = new byte[24];
}
