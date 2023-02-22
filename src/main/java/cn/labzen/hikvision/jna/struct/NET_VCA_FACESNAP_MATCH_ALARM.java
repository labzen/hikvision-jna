package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 黑名单比对(人脸比对)结果报警上传结构体
 * <ul>
 *   <li>实时抓拍与黑名单中的图片进行比对，同时输出抓拍信息和黑名单相关信息（包括比对出的相似度最高的人脸图片）。 </li>
 *   <li>人脸比对的匹配图片有多张的时候，多次回调分配获取每一张图片，通过struSnapInfo中的dwUIDLen和pUIDBuffer判断是否
 *   是同一次比对结果，当接收到同一个pUIDbuffer的报警匹配图片的张数等于byMatchPicNum时，表示这个报警的匹配图片信息接收结束。
 *   如果在一段时间内接收到的匹配图片的张数不等于byMatchPicNum时，上层应该设置一个超时时间，
 *   不再继续等待这个报警后续的匹配信息，建议超时时间1分钟。 </li>
 *   <li>dwUIDLen为0的情况，上层则不做匹配信息的流程处理，则认为是老设备上传的报警按照以前的处理流程接口报警信息。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "fSimilarity",
                       "struSnapInfo",
                       "struBlackListInfo",
                       "sStorageIP",
                       "wStoragePort",
                       "byMatchPicNum",
                       "byPicTransType",
                       "dwSnapPicLen",
                       "pSnapPicBuffer",
                       "struRegion",
                       "dwModelDataLen",
                       "pModelDataBuffer",
                       "byModelingStatus",
                       "byLivenessDetectionStatus",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byMask",
                       "bySmile",
                       "byContrastStatus",
                       "byBrokenNetHttp"})
public class NET_VCA_FACESNAP_MATCH_ALARM extends Structure {

  /**
   * 结构大小
   */
  public int dwSize;
  /**
   * 相似度，[0.001,1]
   */
  public float fSimilarity;
  /**
   * 抓拍信息
   */
  public NET_VCA_FACESNAP_INFO_ALARM struSnapInfo;
  /**
   * 黑名单信息
   */
  public NET_VCA_BLACKLIST_INFO_ALARM struBlackListInfo;
  /**
   * 存储服务IP地址
   */
  public byte[] sStorageIP = new byte[16];
  /**
   * 存储服务端口号
   */
  public short wStoragePort;
  /**
   * 匹配图片的数量，0-保留（老设备这个值默认0，新设备这个值为0时表示后续没有匹配的图片信息）
   */
  public byte byMatchPicNum;
  /**
   * 图片数据传输方式: 0-二进制；1-url
   */
  public byte byPicTransType;
  /**
   * 设备识别抓拍图片长度
   */
  public int dwSnapPicLen;
  /**
   * 设备识别抓拍图片指针
   */
  public ByteByReference pSnapPicBuffer;
  /**
   * 目标边界框，设备识别抓拍图片中，人脸子图坐标
   */
  public NET_VCA_RECT struRegion;
  /**
   * 建模数据长度
   */
  public int dwModelDataLen;
  /**
   * 建模数据指针
   */
  public ByteByReference pModelDataBuffer;
  /**
   * 建模状态
   */
  public byte byModelingStatus;
  /**
   * 活体检测状态：0-保留，1-未知（检测失败），2-非真人人脸，3-真人人脸，4-未开启活体检测
   */
  public byte byLivenessDetectionStatus;
  /**
   * 与UTC的时差（小时），-12 ... +14， +表示东区,0xff无效
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 30, 45， +表示东区，0xff无效
   */
  public byte cTimeDifferenceM;
  /**
   * 抓拍图是否戴口罩，0-保留，1-未知，2-不戴口罩，3-戴口罩
   */
  public byte byMask;
  /**
   * 抓拍图是否微笑，0-保留，1-未知，2-不微笑，3-微笑
   */
  public byte bySmile;
  /**
   * 比对结果，0-保留，1-比对成功，2-比对失败
   */
  public byte byContrastStatus;
  /**
   * 断网续传标志位，0-不是重传数据，1-重传数据
   */
  public byte byBrokenNetHttp;
}
