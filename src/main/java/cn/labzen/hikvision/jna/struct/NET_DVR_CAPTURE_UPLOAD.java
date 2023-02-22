package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.MAX_DEVNAME_LEN_EX;

/**
 * 抓拍图片上传信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struTime",
                       "dwChannel",
                       "szDevName",
                       "dwPicLen",
                       "pBuffer",
                       "byRes"})
public class NET_DVR_CAPTURE_UPLOAD extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 上传时间
   */
  public NET_DVR_TIME_V30 struTime;
  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 设备名称
   */
  public byte[] szDevName = new byte[MAX_DEVNAME_LEN_EX];
  /**
   * 图片长度
   */
  public int dwPicLen;
  /**
   * 图片数据指针
   */
  public ByteByReference pBuffer;
  /**
   * 保留
   */
  public byte[] byRes = new byte[124];
}
