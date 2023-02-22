package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车型，参考VTR_RESULT
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehicleModel implements HikvisionEnum {

  /**
   * 未知
   */
  VTR_RESULT_OTHER(0, "未知"),
  /**
   * 客车
   */
  VTR_RESULT_BUS(1, "客车"),
  /**
   * 货车
   */
  VTR_RESULT_TRUCK(2, "货车"),
  /**
   * 轿车
   */
  VTR_RESULT_CAR(3, "轿车"),
  /**
   * 面包车
   */
  VTR_RESULT_MINIBUS(4, "面包车"),
  /**
   * 小货车
   */
  VTR_RESULT_SMALLTRUCK(5, "小货车"),
  /**
   * 行人
   */
  VTR_RESULT_HUMAN(6, "行人"),
  /**
   * 二轮车
   */
  VTR_RESULT_TUMBREL(7, "二轮车"),
  /**
   * 三轮车
   */
  VTR_RESULT_TRIKE(8, "三轮车"),
  /**
   * SUV/MPV
   */
  VTR_RESULT_SUV_MPV(9, "SUV/MPV"),
  /**
   * 中型客车
   */
  VTR_RESULT_MEDIUM_BUS(10, "中型客车"),
  /**
   * 机动车
   */
  VTR_RESULT_MOTOR_VEHICLE(11, "机动车"),
  /**
   * 非机动车
   */
  VTR_RESULT_NON_MOTOR_VEHICLE(12, "非机动车"),
  /**
   * 小型轿车
   */
  VTR_RESULT_SMALLCAR(13, "小型轿车"),
  /**
   * 微型轿车
   */
  VTR_RESULT_MICROCAR(14, "微型轿车"),
  /**
   * 皮卡车
   */
  VTR_RESULT_PICKUP(15, "皮卡车"),
  /**
   * 集装箱卡车
   */
  VTR_RESULT_CONTAINER_TRUCK(16, " 集装箱卡车"),
  /**
   * 微卡，栏板卡
   */
  VTR_RESULT_MINI_TRUCK(17, " 微卡，栏板卡"),
  /**
   * 渣土车
   */
  VTR_RESULT_SLAG_CAR(18, " 渣土车"),
  /**
   * 吊车，工程车
   */
  VTR_RESULT_CRANE(19, " 吊车，工程车"),
  /**
   * 油罐车
   */
  VTR_RESULT_OIL_TANK_TRUCK(20, " 油罐车"),
  /**
   * 混凝土搅拌车
   */
  VTR_RESULT_CONCRETE_MIXER(21, " 混凝土搅拌车"),
  /**
   * 平板拖车
   */
  VTR_RESULT_PLATFORM_TRAILER(22, " 平板拖车"),
  /**
   * 两厢轿车
   */
  VTR_RESULT_HATCHBACK(23, " 两厢轿车"),
  /**
   * 三厢轿车
   */
  VTR_RESULT_SALOON(24, " 三厢轿车"),
  /**
   * 轿跑
   */
  VTR_RESULT_SPORT_SEDAN(25, " 轿跑"),
  /**
   * 小型客车
   */
  VTR_RESULT_SMALL_BUS(26, "小型客车");

  private int code;
  private String description;

  public static Optional<VehicleModel> byCode(int code) {
    return EnumSet.allOf(VehicleModel.class).stream().filter(in -> in.code == code).findFirst();
  }
}
