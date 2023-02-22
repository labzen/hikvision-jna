package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 温度报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwChannel",
                       "byRuleID",
                       "byThermometryUnit",
                       "wPresetNo",
                       "struPtzInfo",
                       "byAlarmLevel",
                       "byAlarmType",
                       "byAlarmRule",
                       "byRuleCalibType",
                       "struPoint",
                       "struRegion",
                       "fRuleTemperature",
                       "fCurrTemperature",
                       "dwPicLen",
                       "dwThermalPicLen",
                       "dwThermalInfoLen",
                       "pPicBuff",
                       "pThermalPicBuff",
                       "pThermalInfoBuff",
                       "struHighestPoint",
                       "fToleranceTemperature",
                       "dwAlertFilteringTime",
                       "dwAlarmFilteringTime",
                       "dwTemperatureSuddenChangeCycle",
                       "fTemperatureSuddenChangeValue",
                       "byPicTransType",
                       "byRes"})
public class NET_DVR_THERMOMETRY_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 通道号
   */
  public int dwChannel;
  /**
   * 规则ID
   */
  public byte byRuleID;
  /**
   * 测温单位: 0-摄氏度（℃），1-华氏度（℉），2-开尔文(K)
   */
  public byte byThermometryUnit;
  /**
   * 预置点号
   */
  public short wPresetNo;
  /**
   * ptz坐标信息
   */
  public NET_PTZ_INFO struPtzInfo;
  /**
   * 0-预警 1-报警
   */
  public byte byAlarmLevel;
  /**
   * 报警类型 0-最高温度 1-最低温度 2-平均温度 3-温差 4-温度突升 5-温度突降
   */
  public byte byAlarmType;
  /**
   * 0-大于，1-小于
   */
  public byte byAlarmRule;
  /**
   * 规则标定类型 0-点，1-框，2线
   */
  public byte byRuleCalibType;
  /**
   * 点测温坐标（当规则标定类型为点的时候生效）
   */
  public NET_VCA_POINT struPoint;
  /**
   * 区域（当规则标定类型为框的时候生效）
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 配置规则温度,精确到小数点后一位(-40-1000),（浮点数+100）
   */
  public float fRuleTemperature;
  /**
   * 当前温度,精确到小数点后一位(-40-1000),（浮点数+100）
   */
  public float fCurrTemperature;
  /**
   * 可见光图片长度
   */
  public int dwPicLen;
  /**
   * 热成像图片长度
   */
  public int dwThermalPicLen;
  /**
   * 热成像附加信息长度
   */
  public int dwThermalInfoLen;
  /**
   * /可见光图片指针
   */
  public String pPicBuff;
  /**
   * 热成像图片指针
   */
  public String pThermalPicBuff;
  /**
   * 热成像附加信息指针
   */
  public String pThermalInfoBuff;
  /**
   * 线、框测温最高温度位置坐标（当规则标定类型为线、框的时候生效）
   */
  public NET_VCA_POINT struHighestPoint;
  /**
   * 容差温度,精确到小数点后一位(-40-1000),（浮点数+100）
   */
  public float fToleranceTemperature;
  /**
   * 温度预警等待时间 单位秒 范围为0-200秒，默认为0秒
   */
  public int dwAlertFilteringTime;
  /**
   * 温度报警等待时间 单位秒 范围为0-200秒，默认为0秒
   */
  public int dwAlarmFilteringTime;
  /**
   * 温度突变记录周期，单位秒
   */
  public int dwTemperatureSuddenChangeCycle;
  /**
   * 温度突变值,精确到小数点后一位(大于0)
   */
  public float fTemperatureSuddenChangeValue;
  /**
   * 图片数据传输方式: 0-二进制；1-url
   */
  public byte byPicTransType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[39];
}
