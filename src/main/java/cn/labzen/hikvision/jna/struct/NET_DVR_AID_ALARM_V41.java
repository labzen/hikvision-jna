package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.DEVICE_ID_LEN;
import static cn.labzen.hikvision.jna.Constants.MONITORSITE_ID_LEN;

/**
 * 交通事件报警信息结构体
 * <p/>
 * 从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 * #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 * #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 * #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 * #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 * #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 * #define GET_SECOND(_time_)     (((_time_)>>0) & 63)
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "struDevInfo",
                       "struAIDInfo",
                       "struSceneInfo",
                       "dwPicDataLen",
                       "pImage",
                       "byDataType",
                       "byLaneNo",
                       "wMilliSecond",
                       "byMonitoringSiteID",
                       "byDeviceID",
                       "dwXmlLen",
                       "pXmlBuf",
                       "byTargetType",
                       "byRes"})
public class NET_DVR_AID_ALARM_V41 extends Structure {

  /**
   * 结构长度
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
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 交通事件信息
   */
  public NET_DVR_AID_INFO struAIDInfo;
  /**
   * 场景信息
   */
  public NET_DVR_SCENE_INFO struSceneInfo;
  /**
   * 图片长度
   */
  public int dwPicDataLen;
  /**
   * 指向图片的指针
   */
  public ByteByReference pImage;
  /**
   * 数据上传方式：0-数据直接上传；1-云存储服务器URL（原先的图片数据变成URL数据，图片长度变成URL长度）
   */
  public byte byDataType;
  /**
   * 关联车道号
   */
  public byte byLaneNo;
  /**
   * 时标毫秒
   */
  public short wMilliSecond;
  /**
   * 监测点编号（路口编号、内部编号）
   */
  public byte[] byMonitoringSiteID = new byte[MONITORSITE_ID_LEN];
  /**
   * 设备编号
   */
  public byte[] byDeviceID = new byte[DEVICE_ID_LEN];
  /**
   * XML报警信息长度
   */
  public int dwXmlLen;
  /**
   * XML报警信息指针,其XML对应到EventNotificationAlert XML Block
   */
  public String pXmlBuf;
  /**
   * 检测的目标类型，0~未知，1~行人、2~二轮车、3~三轮车(行人检测中返回)
   */
  public byte byTargetType;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[19];
}
