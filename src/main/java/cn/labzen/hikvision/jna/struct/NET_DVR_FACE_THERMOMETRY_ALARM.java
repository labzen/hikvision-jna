package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 人脸测温报警信息结构体
 * <ul>
 *   <li>从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 *   #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 *   #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 *   #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 *   #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 *   #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 *   #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 *   <li>当byFaceDetectionState = 0（未检测到人脸）时，dwfaceImageLen = 0，struFaceRect为空，只有可见光图片数据，无人脸子图图片数据；</li>
 *   <li>当byFaceDetectionState = 1（检测到人脸）时，有可见光图片数据和人脸子图图片数据</li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "dwChannel",
                       "byRuleID",
                       "byRes1",
                       "byRuleName",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "byFaceDetectionState",
                       "byThermometryUnit",
                       "byAlarmRule",
                       "byRes2",
                       "fAlarmTemperature",
                       "fRuleTemperature",
                       "dwVisibleLightImageLen",
                       "pVisibleLightImage",
                       "dwFaceImageLen",
                       "pFaceImage",
                       "struFaceRegion",
                       "fMinTemperature",
                       "fAverageTemperature",
                       "struMinTemperaturePoint",
                       "struMaxTemperaturePoint",
                       "byRes"})
public class NET_DVR_FACE_THERMOMETRY_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 人脸测温规则ID:1-40
   */
  public byte byRuleID;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 规则名称
   */
  public byte[] byRuleName = new byte[NAME_LEN];
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 人脸检测状态；0~未检测到人脸，1~已检测到人脸
   */
  public byte byFaceDetectionState;
  /**
   * 测温单位: 0-摄氏度（℃），1-华氏度（℉），2-开尔文(K)
   */
  public byte byThermometryUnit;
  /**
   * 报警规则；0-最高温大于，1-最高温小于
   */
  public byte byAlarmRule;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[1];
  /**
   * 触发报警温度（-20.0~120.0℃，精确到小数点后1位）
   */
  public float fAlarmTemperature;
  /**
   * 规则配置报警温度（-20.0~60.0℃，精确到小数点后1位）
   */
  public float fRuleTemperature;
  /**
   * 可见光图片长度
   */
  public int dwVisibleLightImageLen;
  /**
   * 可见光图片指针
   */
  public ByteByReference pVisibleLightImage;
  /**
   * 人脸子图长度
   */
  public int dwFaceImageLen;
  /**
   * 人脸子图指针
   */
  public ByteByReference pFaceImage;
  /**
   * 人脸目标边界框，设备识别抓拍图片中，人脸子图坐标
   */
  public NET_VCA_RECT struFaceRegion;
  /**
   * 最低温度（-20.0~120.0℃，精确到小数点后1位）
   */
  public float fMinTemperature;
  /**
   * 平均温（-20.0~120.0℃，精确到小数点后1位）
   */
  public float fAverageTemperature;
  /**
   * 最低温度位置坐标
   */
  public NET_VCA_POINT struMinTemperaturePoint;
  /**
   * 最高温度位置坐标
   */
  public NET_VCA_POINT struMaxTemperaturePoint;
  /**
   * 保留
   */
  public byte[] byRes = new byte[720];
}
