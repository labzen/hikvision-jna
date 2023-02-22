package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 车牌类型，参考VCA_PLATE_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehiclePlateType implements HikvisionEnum {

  /**
   * 标准民用车与军车
   */
  VCA_STANDARD92_PLATE(0, "标准民用车与军车"),
  /**
   * 02式民用车牌
   */
  VCA_STANDARD02_PLATE(1, "02式民用车牌"),
  /**
   * 武警车
   */
  VCA_WJPOLICE_PLATE(2, "武警车"),
  /**
   * 警车
   */
  VCA_JINGCHE_PLATE(3, "警车"),
  /**
   * 民用车双行尾牌
   */
  STANDARD92_BACK_PLATE(4, "民用车双行尾牌"),
  /**
   * 使馆车牌
   */
  VCA_SHIGUAN_PLATE(5, "使馆车牌"),
  /**
   * 农用车
   */
  VCA_NONGYONG_PLATE(6, "农用车"),
  /**
   * 摩托车
   */
  VCA_MOTO_PLATE(7, "摩托车"),
  /**
   * 新能源车牌
   */
  NEW_ENERGY_PLATE(8, "新能源车牌"),
  /**
   * 运输车
   */
  TRANSPORT_PLATE(0x20, "运输车"),
  /**
   * 商用车
   */
  COMMERCIAL_PLATE(0x21, "商用车"),
  /**
   * 私家车
   */
  PRIVATE_PLATE(0x22, "私家车"),
  /**
   * 教练车
   */
  LEARNING_PLATE(0x23, "教练车"),
  /**
   * 使馆车
   */
  CD_PLATE(0x24, "使馆车"),
  /**
   * 使馆车
   */
  CC_PLATE(0x25, "使馆车"),
  /**
   * 军车
   */
  ARMY_PLATE(0x26, "军车"),
  /**
   * PROTOCOL
   */
  PROTOCOL_PLATE(0x27, "PROTOCOL"),
  /**
   * 政府车
   */
  GOVERNMENT_PLATE(0x28, "政府车"),
  /**
   * EXPORT
   */
  EXPORT_PLATE(0x29, "EXPORT"),
  /**
   * 出租车
   */
  TAXI_PLATE(0x2A, "出租车"),
  /**
   * TESTING
   */
  TESTING_PLATE(0x2B, "TESTING"),
  /**
   * TRANSFER
   */
  TRANSFER_PLATE(0x2C, "TRANSFER"),
  /**
   * 货车
   */
  TRUCK_PLATE(0x2D, "货车"),
  /**
   * 公交车
   */
  BUS_PLATE(0x2E, "公交车"),
  /**
   * PUBLIC
   */
  PUBLIC_PLATE(0x2F, "PUBLIC"),
  /**
   * PUBLIC TRANSFER
   */
  PUB_TRANS_PLATE(0x30, "PUBLIC TRANSFER"),
  /**
   * PRIVATE TRANSPORT
   */
  PRI_TRANS_PLATE(0x31, "PRIVATE TRANSPORT"),
  /**
   * 未知（未识别）
   */
  UNKNOWN_PLATE(0xff, "未知（未识别）");

  private int code;
  private String description;

  public static Optional<VehiclePlateType> byCode(int code) {
    return EnumSet.allOf(VehiclePlateType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
