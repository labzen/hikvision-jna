package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 抓拍图片信息结构体
 * <ul>
 *   <li>如果设备只上传了场景图，用户可以根据牌识区域坐标（struPlateRecgRect）自己从场景图中截取特写图，宽和高可以根据实际情况自己调节。 </li>
 *   <li>通过NET_DVR_CLOUDSTORAGE_CFG配置可以启用云存储功能，则上传的图片信息将变成获取图片信息的URL地址，平台通过该URL地址去云存储服务器上获取数据。 </li>
 *   <li>图片云存储URL格式： http://CVMIP:Port/pic?did=DevID&bid=BlkID&pid=PictureID&ptime=PicTime <br>
 *     CVMIP：CVM(云存储服务器)的IP地址 <br>
 *     Port: CVM(云存储服务器)对外提供http服务的端口（固定8009） <br>
 *     DevID: CVS(云存储服务器)中设备ID号 <br>
 *     BlkID：CVS(云存储服务器)中设备的块号 <br>
 *     PictureID：CVS(云存储服务器)为图片生成的编号 <br>
 *     PicTime：图片的时间戳 <br>
 *     示例： <br>
 *     http://10.192.65.140:8009/pic?did=35b9cbd0-8ffa-1031-87e6-0025903c6a50&bid=387&pid=2952790009&ptime=1378106185
 *   </li>
 * </ul>
 */
@Structure.FieldOrder({"dwDataLen",
                       "byType",
                       "byDataType",
                       "byCloseUpType",
                       "byPicRecogMode",
                       "dwRedLightTime",
                       "byAbsTime",
                       "struPlateRect",
                       "struPlateRecgRect",
                       "pBuffer",
                       "dwUTCTime",
                       "byCompatibleAblity",
                       "byTimeDiffFlag",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes2"})
public class NET_ITS_PICTURE_INFO extends Structure {

  /**
   * 媒体数据长度
   */
  public int dwDataLen;
  /**
   * 数据类型：0-车牌图，1- 场景图，2- 合成图，3- 特写图，4- 二值图，5- 码流，6- 人脸子图(主驾驶)，7- 人脸子图(副驾驶)，
   * 8- 非机动车，9- 行人，10- 称重原始裸数据，11- 目标图，12- 主驾驶室图，13- 副驾驶室图，14- 人脸图抠小图
   */
  public byte byType;
  /**
   * 数据上传方式：0-数据直接上传; 1-云存储服务器URL(3.7Ver)原先的图片数据变成URL数据，图片长度变成URL长度
   */
  public byte byDataType;
  /**
   * 特写图类型，0-保留,1-非机动车,2-行人
   */
  public byte byCloseUpType;
  /**
   * 图片背向识别：0-正向车牌识别，1-背向识别(尾牌识别) ；
   */
  public byte byPicRecogMode;
  /**
   * 经过的红灯时间  （s）
   */
  public int dwRedLightTime;
  /**
   * 绝对时间点,yyyymmddhhmmssxxx,e.g.20090810235959999  最后三位为毫秒数
   */
  public byte[] byAbsTime = new byte[32];
  /**
   * 车牌位置,当byType为8-非机动车;9-行人时，表示人体坐标
   */
  public NET_VCA_RECT struPlateRect;
  /**
   * 牌识区域坐标，当图片类型为12-主驾驶室图13-副驾驶室图是，该坐标为驾驶员坐标
   */
  public NET_VCA_RECT struPlateRecgRect;
  /**
   * 数据指针
   */
  public ByteByReference pBuffer;
  /**
   * UTC时间定义
   */
  public int dwUTCTime;
  /**
   * 兼容能力字段 0表示无效，1表示有效; bit0-表示dwUTCTime字段有效
   */
  public byte byCompatibleAblity;
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
   * 保留
   */
  public byte[] byRes2 = new byte[4];
}
