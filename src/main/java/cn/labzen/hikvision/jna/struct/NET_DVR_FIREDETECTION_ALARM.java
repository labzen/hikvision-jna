package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 火点检测报警信息结构体
 * <ul>
 *   <li>从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 *     #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 *     #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 *     #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 *     #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 *     #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 *     #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 *   <li>设备是否支持火点检测能力，可以通过设备能力集进行判断，对应热成像能力集(ThermalCap)，相关接口：NET_DVR_GetSTDAbility，
 *   能力集类型：NET_DVR_GET_THERMAL_CAPABILITIES，节点：<isSupportFireDetection>。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "struDevInfo",
                       "wPanPos",
                       "wTiltPos",
                       "wZoomPos",
                       "byPicTransType",
                       "byRes1",
                       "dwPicDataLen",
                       "pBuffer",
                       "struRect",
                       "struPoint",
                       "wFireMaxTemperature",
                       "wTargetDistance",
                       "byStrategyType",
                       "byAlarmSubType",
                       "byPTZPosExEnable",
                       "byRes2",
                       "struPtzPosEx",
                       "dwVisiblePicLen",
                       "pVisiblePicBuf",
                       "pSmokeBuf",
                       "wDevInfoIvmsChannelEx",
                       "byRes3",
                       "byFireScanWaitMode",
                       "dwVisibleChannel",
                       "byTimeDiffFlag",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes"})
public class NET_DVR_FIREDETECTION_ALARM extends Structure {

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
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * P参数（水平参数，为实际值*100）
   */
  public short wPanPos;
  /**
   * T参数（垂直参数，为（实际值+360）*100）
   */
  public short wTiltPos;
  /**
   * Z参数（变倍参数，为实际值*100）
   */
  public short wZoomPos;
  /**
   * 图片数据传输方式: 0-二进制；1-url
   */
  public byte byPicTransType;
  /**
   * 保留
   */
  public byte byRes1;
  /**
   * 报警抓拍图片长度
   */
  public int dwPicDataLen;
  /**
   * 数据指针
   */
  public ByteByReference pBuffer;
  /**
   * 火点框
   */
  public NET_VCA_RECT struRect;
  /**
   * 火点框内最高温度点坐标
   */
  public NET_VCA_POINT struPoint;
  /**
   * 火点最高温度[300℃~4000℃]
   */
  public short wFireMaxTemperature;
  /**
   * 目标距离[100m ~ 10000m]
   */
  public short wTargetDistance;
  /**
   * 策略类型；0~任意报警，1~协同报警，2~多系统报警，3~指定火点报警，4~指定烟雾报警
   */
  public byte byStrategyType;
  /**
   * 报警子类型。0~火点检测报警，1~烟雾检测报警，2~烟火报警
   */
  public byte byAlarmSubType;
  /**
   * 是否启用PTZ坐标扩展：0- 不启用（PTZ坐标值以wPanPos、wTiltPos、wZoomPos为准），1- 启用（PTZ坐标值以struPtzPosEx为准）
   */
  public byte byPTZPosExEnable;
  /**
   * 保留
   */
  public byte byRes2;
  /**
   * ptz坐标扩展(支持高精度PTZ值，精确到小数点后三位)
   */
  public NET_PTZ_INFO struPtzPosEx;
  /**
   * 可见光图片长度
   */
  public int dwVisiblePicLen;
  /**
   * 可见光图片数据指针
   */
  public ByteByReference pVisiblePicBuf;
  /**
   * 烟雾检测报警数据指针，指向一个NET_DVR_SMOKEDETECTION_ALARM结构体。当byAlarmSubType报警子类型为1（烟雾检测报警）、2（烟火报警）时生效。
   */
  public ByteByReference pSmokeBuf;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 保留
   */
  public byte byRes3;
  /**
   * 火点扫描等待模式 0-自动   1-手动
   */
  public byte byFireScanWaitMode;
  /**
   * 可见光通道通道号
   */
  public int dwVisibleChannel;
  /**
   * 时差字段是否有效  0-时差无效， 1-时差有效
   */
  public byte byTimeDiffFlag;
  /**
   * 与UTC的时差（小时），-12 ... +14， +表示东区,，byTimeDiffFlag为1时有效
   */
  public char cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 30, 45， +表示东区，byTimeDiffFlag为1时有效
   */
  public char cTimeDifferenceM;
  /**
   * 保留
   */
  public byte[] byRes = new byte[49];
}
