package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.NET_DVR_MAX_FACE_SEARCH_NUM;

/**
 * 人脸子图信息查询条件结构体
 * <p/>
 * <ul>
 *   <li>对于超脑NVR设备，图片ID和人脸子图在大图中的坐标，通过接口NET_DVR_UploadFile_V40(上传类型：UPLOAD_FACE_ANALYSIS_DATA)、
 *   NET_DVR_GetUploadResult将图片上传给设备进行识别获取。 </li>
 *   <li>对于其他设备，子图在大图中的坐标位置，通过接口NET_DVR_DetectImage将图片上传给设备进行识别获取。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwImageLen",
                       "struVcaRect",
                       "dwFaceScore",
                       "byVcaRectOnly",
                       "byRes1",
                       "dwPID",
                       "dwFaceSearchNum",
                       "struMultiVcaRect",
                       "byRes",
                       "pImage"})
public class NET_DVR_FACE_PIC_DATA_INFO extends Structure {

  /**
   * 图片大小
   */
  public int dwImageLen;
  /**
   * 子图在大图中的坐标位置，归一化坐标
   */
  public NET_VCA_RECT struVcaRect;
  /**
   * 相似度，取值范围0-100
   */
  public int dwFaceScore;
  /**
   * 是否只上传坐标：0-否；1-是
   */
  public byte byVcaRectOnly;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 图片ID
   */
  public int dwPID;
  /**
   * 搜索人脸区域个数
   */
  public int dwFaceSearchNum;
  /**
   * （多个）子图在大图中的坐标位置，归一化坐标, byVcaRectOnly=1时启用，紧凑排列
   */
  public NET_VCA_RECT[] struMultiVcaRect = new NET_VCA_RECT[NET_DVR_MAX_FACE_SEARCH_NUM];
  /**
   * 保留
   */
  public byte[] byRes = new byte[136];
  /**
   * 其中图片要求为jpg格式
   */
  public ByteByReference pImage;
}
