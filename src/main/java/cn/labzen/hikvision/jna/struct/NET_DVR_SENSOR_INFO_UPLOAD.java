package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.SensorType;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 传感器上传信息结构体
 * <p/>
 * 设备支持的传感器功能对应传感器能力集(SensorPortList)，接口：NET_DVR_GetSTDAbility(能力集类型：NET_DVR_GET_SENSOR_PORT_CAPABILITIES)。
 */
@Structure.FieldOrder({"dwSize",
                       "struTime",
                       "szSensorName",
                       "szSensorChan",
                       "byReboot",
                       "byPowerSupply",
                       "byStatusType",
                       "bySensorType",
                       "fVoltageValue",
                       "fCurrentValue",
                       "fActualValue",
                       "szDescription",
                       "byRes1"})
public class NET_DVR_SENSOR_INFO_UPLOAD extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 上传时间
   */
  public NET_DVR_TIME_V30 struTime;
  /**
   * 传感器名称
   */
  public byte[] szSensorName = new byte[MAX_SENSORNAME_LEN];
  /**
   * 传感器通道
   */
  public byte[] szSensorChan = new byte[MAX_SENSORCHAN_LEN];
  /**
   * 之前是否重启过（一般是重启的后的第一条数据带有这个标志）0-表示没有重启，1-有过重启
   */
  public byte byReboot;
  /**
   * 是否正常供电 0-不在供电，1-正在供电
   */
  public byte byPowerSupply;
  /**
   * 设备状态:0:正常、1：异常、2、报警
   */
  public byte byStatusType;
  /**
   * 参考传感器枚举类型，参考{@link SensorType}
   */
  public byte bySensorType;
  /**
   * 电压值； 精确到0.001
   */
  public float fVoltageValue;
  /**
   * 电流值；精确到0.001
   */
  public float fCurrentValue;
  /**
   * 模拟信号转换后的数值；精确到0.001
   */
  public float fActualValue;
  /**
   * 描述信息;当设备状态（byStatusType）为非0时生效。
   */
  public byte[] szDescription = new byte[MAX_DESCRIPTION_LEN];
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[128];
}
