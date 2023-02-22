package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 传感器类型，参考SENSOR_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum SensorType implements HikvisionEnum {

  /**
   * 无
   */
  SENSOR_TYPE_NONE(0, "无"),
  /**
   * 温度
   */
  SENSOR_TYPE_TEMPERATURE(1, "温度"),
  /**
   * 湿度
   */
  SENSOR_TYPE_HUMIDITY(2, "湿度"),
  /**
   * 风速
   */
  SENSOR_TYPE_WINDSPEED(3, "风速"),
  /**
   * 气体
   */
  SENSOR_TYPE_GAS(4, "气体"),
  /**
   * 交流电压
   */
  SENSOR_AC_VOLTAGE(5, "交流电压"),
  /**
   * 交流电流
   */
  SENSOR_AC_CURRENT(6, "交流电流"),
  /**
   * 直流电压
   */
  SENSOR_DC_VOLTAGE(7, "直流电压"),
  /**
   * 直流电流
   */
  SENSOR_DC_CURRENT(8, "直流电流"),
  /**
   * 水压
   */
  SENSOR_WATER_PRESSURE(9, "水压"),
  /**
   * 压力变送器
   */
  SENSOR_PRESSURE_TRANSMITTER(10, "压力变送器"),
  /**
   * 流量变送器
   */
  SENSOR_FLOW_TRANSMITTER(11, "流量变送器"),
  /**
   * 漏水传感器
   */
  SENSOR_WATER_LEAKAGE(12, "漏水传感器"),
  /**
   * 一体化温变
   */
  SENSOR_INTERGRATED_TEMPERATURE_DETECTOR(13, "一体化温变"),
  /**
   * 隔离式温变
   */
  SENSOR_ISOLATION_TEMPERATURE_DETECTOR(14, "隔离式温变"),
  /**
   * 在线余氯仪
   */
  SENSOR_RESIDUAL_CHLORINE(15, "在线余氯仪"),
  /**
   * AC端子
   */
  SENSOR_TYPE_AC_TERMINAL(16, "AC端子"),
  /**
   * AC插座
   */
  SENSOR_TYPE_AC_SOCKET(17, "AC插座"),
  /**
   * 温湿度
   */
  SENSOR_TYPE_HUMITURE(18, "温湿度"),
  /**
   * 流量
   */
  SENSOR_TYPE_FLOW(19, "流量"),
  /**
   * 液位
   */
  SENSOR_LIQUID_LEVEL(20, "液位"),
  /**
   * 电弧
   */
  SENSOR_TYPE_ARC(21, "电弧"),
  /**
   * 未定义
   */
  SENSOR_TYPE_UNKNOW(255, "未定义");

  private int code;
  private String description;

  public static Optional<SensorType> byCode(int code) {
    return EnumSet.allOf(SensorType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
