package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 年龄段，参考HUMAN_AGE_GROUP_ENUM
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum ProvinceIndex implements HikvisionEnum {

  /**
   * 安徽
   */
  ANHUI_PROVINCE(0, "安徽"),
  /**
   * 澳门
   */
  AOMEN_PROVINCE(1, "澳门"),
  /**
   * 北京
   */
  BEIJING_PROVINCE(2, "北京"),
  /**
   * 重庆
   */
  CHONGQING_PROVINCE(3, "重庆"),
  /**
   * 福建
   */
  FUJIAN_PROVINCE(4, "福建"),
  /**
   * 甘肃
   */
  GANSU_PROVINCE(5, "甘肃"),
  /**
   * 广东
   */
  GUANGDONG_PROVINCE(6, "广东"),
  /**
   * 广西
   */
  GUANGXI_PROVINCE(7, "广西"),
  /**
   * 贵州
   */
  GUIZHOU_PROVINCE(8, "贵州"),
  /**
   * 海南
   */
  HAINAN_PROVINCE(9, "海南"),
  /**
   * 喝杯
   */
  HEBEI_PROVINCE(10, "喝杯"),
  /**
   * 河南
   */
  HENAN_PROVINCE(11, "河南"),
  /**
   * 黑龙江
   */
  HEILONGJIANG_PROVINCE(12, "黑龙江"),
  /**
   * 湖北
   */
  HUBEI_PROVINCE(13, "湖北"),
  /**
   * 湖南
   */
  HUNAN_PROVINCE(14, "湖南"),
  /**
   * 吉林
   */
  JILIN_PROVINCE(15, "吉林"),
  /**
   * 江苏
   */
  JIANGSU_PROVINCE(16, "江苏"),
  /**
   * 江西
   */
  JIANGXI_PROVINCE(17, "江西"),
  /**
   * 辽宁
   */
  LIAONING_PROVINCE(18, "辽宁"),
  /**
   * 内蒙古
   */
  NEIMENGGU_PROVINCE(19, "内蒙古"),
  /**
   * 宁夏
   */
  NINGXIA_PROVINCE(20, "宁夏"),
  /**
   * 青海
   */
  QINGHAI_PROVINCE(21, "青海"),
  /**
   * 山东
   */
  SHANDONG_PROVINCE(22, "山东"),
  /**
   * 山西
   */
  SHANXI_JIN_PROVINCE(23, "山西"),
  /**
   * 陕西
   */
  SHANXI_SHAN_PROVINCE(24, "陕西"),
  /**
   * 上海
   */
  SHANGHAI_PROVINCE(25, "上海"),
  /**
   * 四川
   */
  SICHUAN_PROVINCE(26, "四川"),
  /**
   * 台湾
   */
  TAIWAN_PROVINCE(27, "台湾"),
  /**
   * 天津
   */
  TIANJIN_PROVINCE(28, "天津"),
  /**
   * 西藏
   */
  XIZANG_PROVINCE(29, "西藏"),
  /**
   * 香港
   */
  XIANGGANG_PROVINCE(30, "香港"),
  /**
   * 新疆
   */
  XINJIANG_PROVINCE(31, "新疆"),
  /**
   * 云南
   */
  YUNNAN_PROVINCE(32, "云南"),
  /**
   * 浙江
   */
  ZHEJIANG_PROVINCE(33, "浙江");

  private int code;
  private String description;

  public static Optional<ProvinceIndex> byCode(int code) {
    return EnumSet.allOf(ProvinceIndex.class).stream().filter(in -> in.code == code).findFirst();
  }
}
