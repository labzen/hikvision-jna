package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * ISAPI协议报警信息结构体
 */
@Structure.FieldOrder({"pAlarmData",
                       "dwAlarmDataLen",
                       "byDataType",
                       "byPicturesNumber",
                       "byRes",
                       "pPicPackData",
                       "byRes1"})
public class NET_DVR_ALARM_ISAPI_INFO extends Structure {

  /**
   * 报警数据
   */
  public String pAlarmData;
  /**
   * 报警数据长度
   */
  public int dwAlarmDataLen;
  /**
   * 0-invalid,1-xml,2-json
   */
  public byte byDataType;
  /**
   * 图片数量，当byPicturesNumber =1时，pPicPackData返回一个NET_DVR_ALARM_ISAPI_PICDATA结构体； byPicturesNumber >1时，
   * pPicPackData返回多个NET_DVR_ALARM_ISAPI_PICDATA结构体。
   */
  public byte byPicturesNumber;
  /**
   * 保留
   */
  public byte[] byRes = new byte[2];
  /**
   * 图片变长部分
   */
  public Pointer pPicPackData;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[32];
}
