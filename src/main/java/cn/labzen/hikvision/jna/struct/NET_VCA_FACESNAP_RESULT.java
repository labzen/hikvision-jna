package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 人脸抓拍结果结构体
 * <ul>
 *   <li>人脸抓拍摄像机一般只上传背景图（dwBackgroundPicLen、pBuffer2）和人脸子图区域（struRect），
 *   人脸子图需要应用层根据区域从背景图截取。而人脸分析仪(iVMS6200/F)一般只上传人脸子图（dwFacePicLen、pBuffer1）
 *   和人脸子图ID（dwFacePicID），背景图需要根据人脸子图ID通过接口NET_DVR_FindBackgroundPic获取。 </li>
 *   <li>新增人脸抓拍质量评分机制与原有的人脸评分区别： 原有的人脸评分是在人脸抓拍中实现，目的是确保一次人脸抓拍中获取
 *   最好的图像效果，是一个相对图像质量的评分；新增人脸抓拍质量评分机制是针对已经抓拍完成的人脸图片，使用图像算法对图像中人脸，
 *   人眼，肩宽等相对重要的信息进行分析，按照统一的标准对人脸图片效果质量进行评分。 </li>
 *   <li>从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 *     #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 *     #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 *     #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 *     #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 *     #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 *     #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "dwFacePicID",
                       "dwFaceScore",
                       "struTargetInfo",
                       "struRect",
                       "struDevInfo",
                       "dwFacePicLen",
                       "dwBackgroundPicLen",
                       "bySmart",
                       "byAlarmEndMark",
                       "byRepeatTimes",
                       "byUploadEventDataType",
                       "struFeature",
                       "fStayDuration",
                       "sStorageIP",
                       "wStoragePort",
                       "wDevInfoIvmsChannelEx",
                       "byFacePicQuality",
                       "byUIDLen",
                       "byLivenessDetectionStatus",
                       "byAddInfo",
                       "pUIDBuffer",
                       "pAddInfoBuffer",
                       "byTimeDiffFlag",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byBrokenNetHttp",
                       "pBuffer1",
                       "pBuffer2"})
public class NET_VCA_FACESNAP_RESULT extends Structure {

  /**
   * 结构大小
   */
  public int dwSize;
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 人脸图ID
   */
  public int dwFacePicID;
  /**
   * 人脸评分,0-100
   */
  public int dwFaceScore;
  /**
   * 报警目标信息
   */
  public NET_VCA_TARGET_INFO struTargetInfo;
  /**
   * 人脸子图区域
   */
  public NET_VCA_RECT struRect;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 人脸子图的长度，为0表示没有图片，大于0表示有图片
   */
  public int dwFacePicLen;
  /**
   * 背景图的长度，为0表示没有图片，大于0表示有图片(保留)
   */
  public int dwBackgroundPicLen;
  /**
   * IDS设备返回0(默认值)，Smart Functiom Return 1
   */
  public byte bySmart;
  /**
   * 报警结束标记0-保留，1-结束标记（该字段结合人脸ID字段使用，表示该ID对应的下报警结束，主要提供给NVR使用，用于判断报警结束，提取识别图片数据中，清晰度最高的图片）
   */
  public byte byAlarmEndMark;
  /**
   * 重复报警次数，0-无意义
   */
  public byte byRepeatTimes;
  /**
   * 人脸图片数据长传方式：0-二进制数据，1-URL
   */
  public byte byUploadEventDataType;
  /**
   * 人体属性
   */
  public NET_VCA_HUMAN_FEATURE struFeature;
  /**
   * 停留画面中时间(单位: 秒)
   */
  public float fStayDuration;
  /**
   * 存储服务IP地址
   */
  public byte[] sStorageIP = new byte[16];
  /**
   * 存储服务端口号
   */
  public short wStoragePort;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 人脸子图图片质量评估等级，0-低等质量,1-中等质量,2-高等质量,新增人脸抓拍质量评分机制与原有的人脸评分区别：
   * 原有的人脸评分是在人脸抓拍中实现，目的是确保一次人脸抓拍中获取最好的图像效果，是一个相对图像质量的评分；
   * 新增人脸抓拍质量评分机制是针对已经抓拍完成的人脸图片，使用图像算法对图像中人脸，人眼，肩宽等相对重要的信息进行分析，
   * 按照统一的标准对人脸图片效果质量进行评分
   */
  public byte byFacePicQuality;
  /**
   * 上传报警的标识长度
   */
  public byte byUIDLen;
  /**
   * 活体检测状态：0-保留，1-未知(检测失败)，2-非真人人脸，3-真人人脸，4-未开启活体检测
   */
  public byte byLivenessDetectionStatus;
  /**
   * 附加信息标识位（即是否有NET_VCA_FACESNAP_ADDINFO结构体）,0-无附加信息, 1-有附加信息。
   */
  public byte byAddInfo;
  /**
   * 标识指针
   */
  public ByteByReference pUIDBuffer;
  /**
   * 附加信息指针,指向NET_VCA_FACESNAP_ADDINFO结构体
   */
  public ByteByReference pAddInfoBuffer;
  /**
   * 时差字段是否有效  0-时差无效， 1-时差有效
   */
  public byte byTimeDiffFlag;
  /**
   * 与UTC的时差（小时），-12 ... +14， +表示东区,，byTimeDiffFlag为1时有效
   */
  public byte cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 30, 45， +表示东区，byTimeDiffFlag为1时有效
   */
  public byte cTimeDifferenceM;
  /**
   * 断网续传标志位，0-不是重传数据，1-重传数据
   */
  public byte byBrokenNetHttp;
  /**
   * 人脸子图的图片数据
   */
  public ByteByReference pBuffer1;
  /**
   * 背景图的图片数据（保留，通过查找背景图接口可以获取背景图）
   */
  public ByteByReference pBuffer2;
}
