package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.MAX_FACE_PIC_NUM;

/**
 * 人脸侦测报警信息结构体
 * <ul>
 *   <li>从DWORD类型的时间取值解析得到“年月日时分秒”的算法如下所示： <br>
 *    #define GET_YEAR(_time_)          (((_time_)>>26) + 2000) <br>
 *    #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 *    #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 *    #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 *    #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 *    #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 *   <li>相对时标，一般涉及到时区，比如传递的东八区时间、GMT时间。
 *      绝对时标，即UTC时间，不带时区，比如1970年1月1日0时0分0秒到现在的秒数，相机现在一般传递的绝对时标都是这个。
 *      例如：当前相机东八区的time_t值1400252410 ，则
 *      相对时标：2014-05-16 23:00:10
 *      绝对时标：2014-05-16 15:00:10 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "dwBackgroundPicLen",
                       "struDevInfo",
                       "struFacePic",
                       "byFacePicNum",
                       "byUploadEventDataType",
                       "wDevInfoIvmsChannelEx",
                       "byTimeDiffFlag",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes",
                       "pBackgroundPicpBuffer"})
public class NET_DVR_FACE_DETECTION extends Structure {

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
   * 背景图的长度，为0表示没有图片，大于0表示有图片
   */
  public int dwBackgroundPicLen;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 人脸子图区域
   */
  public NET_VCA_RECT[] struFacePic = new NET_VCA_RECT[MAX_FACE_PIC_NUM];
  /**
   * 子图数量
   */
  public byte byFacePicNum;
  /**
   * 图片数据长传方式：0-二进制数据，1-URL
   */
  public byte byUploadEventDataType;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
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
  public byte[] byRes = new byte[249];
  /**
   * 背景图的图片数据
   */
  public ByteByReference pBackgroundPicpBuffer;
}
