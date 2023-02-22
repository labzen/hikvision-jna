package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 时间参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "byRuleName",
                       "struTargetInfo",
                       "struDevInfo",
                       "dwPicDataLen",
                       "byAlarmPicType",
                       "byPanelChan",
                       "byRelAlarmPicNum",
                       "byRes1",
                       "dwFacePicDataLen",
                       "dwAlarmID",
                       "wDevInfoIvmsChannelEx",
                       "byRes2",
                       "pFaceImage",
                       "pImage"})
public class NET_DVR_FACEDETECT_ALARM extends Structure {

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
   * 规则名称
   */
  public byte[] byRuleName = new byte[NAME_LEN];
  /**
   * 报警目标信息
   */
  public NET_VCA_TARGET_INFO struTargetInfo;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 返回图片的长度 为0表示没有图片，大于0表示该结构后面紧跟图片数据
   */
  public int dwPicDataLen;
  /**
   * 0-异常人脸报警图片 1- 人脸图片,2-多张人脸, 3-戴墨镜人脸, 4-打电话人脸
   */
  public byte byAlarmPicType;
  /**
   * 人脸通道关联的面板通道
   */
  public byte byPanelChan;
  /**
   * 关联通道报警图片数量
   */
  public byte byRelAlarmPicNum;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 人脸图片的长度 为0表示没有图片，大于0表示该结构后面紧跟图片数据
   */
  public int dwFacePicDataLen;
  /**
   * 报警ID，用以标识通道间关联产生的组合报警，0表示无效
   */
  public int dwAlarmID;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[42];
  /**
   * 指向人脸图指针
   */
  public ByteByReference pFaceImage;
  /**
   * 指向图片的指针
   */
  public ByteByReference pImage;
}
