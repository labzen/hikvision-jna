package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 录像文件信息结构体
 */
@Structure.FieldOrder({"sFileName",
                       "struStartTime",
                       "struStopTime",
                       "dwFileSize",
                       "sCardNum",
                       "byLocked",
                       "byFileType",
                       "byRes"})
public class NET_DVR_FINDDATA_V30 extends Structure {

  /**
   * 文件名
   */
  public byte[] sFileName = new byte[100];
  /**
   * 文件的开始时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 文件的结束时间
   */
  public NET_DVR_TIME struStopTime;
  /**
   * 文件的大小
   */
  public int dwFileSize;
  /**
   * （ISAPI登录不支持）卡号
   */
  public byte[] sCardNum = new byte[32];
  /**
   * 9000设备支持,1表示此文件已经被锁定,0表示正常的文件
   */
  public byte byLocked;
  /**
   * 文件类型:参考
   */
  public byte byFileType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[2];
}
