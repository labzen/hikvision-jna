package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

/**
 * 查找结果结构体
 */
@Structure.FieldOrder({"pDVRFileName",
                       "pSavedFileBuf",
                       "dwBufLen",
                       "lpdwRetLen",
                       "struAddr",
                       "byRes"})
public class NET_DVR_PIC_PARAM extends Structure {

  /**
   * 图片名，包含\0，最大64字节
   */
  public String pDVRFileName;
  /**
   * 保存图片的缓冲区，内存外部申请释放
   */
  public String pSavedFileBuf;
  /**
   * 缓冲区大小
   */
  public int dwBufLen;
  /**
   * 实际收到的数据长度指针，不能为NULL
   */
  public IntByReference lpdwRetLen;
  /**
   * 图片所在的地址信息，图片查找时会返回
   */
  public NET_DVR_ADDRESS struAddr;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[256];
}
