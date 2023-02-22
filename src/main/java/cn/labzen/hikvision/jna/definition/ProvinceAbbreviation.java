package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 图片文件类型
 */
@Getter
@AllArgsConstructor
public enum ProvinceAbbreviation implements HikvisionEnum {

  /**
   * 保留
   */
  RES(0, "保留"),
  /**
   * 澳
   */
  AO_MEN(1, "澳"),
  /**
   * 京
   */
  BEI_JING(2, "京"),
  /**
   * 渝
   */
  CHONG_QING(3, "渝"),
  /**
   * 闽
   */
  FU_JIAN(4, "闽"),
  /**
   * 甘
   */
  GAN_SU(5, "甘"),
  /**
   * 粤
   */
  GUANG_DONG(6, "粤"),
  /**
   * 桂
   */
  GUANG_XI(7, "桂"),
  /**
   * 贵
   */
  GUI_ZHOU(8, "贵"),
  /**
   * 琼
   */
  HAI_NAN(9, "琼"),
  /**
   * 冀
   */
  HE_BEI(10, "冀"),
  /**
   * 豫
   */
  HE_NAN(11, "豫"),
  /**
   * 黑
   */
  HEI_LONG_JIANG(12, "黑"),
  /**
   * 鄂
   */
  HU_BEI(13, "鄂"),
  /**
   * 湘
   */
  HU_NAN(14, "湘"),
  /**
   * 吉
   */
  JI_LIN(15, "吉"),
  /**
   * 苏
   */
  JIANG_SU(16, "苏"),
  /**
   * 赣
   */
  JIANG_XI(17, "赣"),
  /**
   * 辽
   */
  LIAO_NING(18, "辽"),
  /**
   * 蒙
   */
  NEI_MENG_GU(19, "蒙"),
  /**
   * 宁
   */
  NING_XIA(20, "宁"),
  /**
   * 青
   */
  QING_HAI(21, "青"),
  /**
   * 鲁
   */
  SHAN_DONG(22, "鲁"),
  /**
   * 晋
   */
  SHAN1_XI(23, "晋"),
  /**
   * 陕
   */
  SHAN3_XI(24, "陕"),
  /**
   * 沪
   */
  SHANG_HAI(25, "沪"),
  /**
   * 川
   */
  SI_CHUAN(26, "川"),
  /**
   * 台
   */
  TAI_WAN(27, "台"),
  /**
   * 津
   */
  TIAN_JIN(28, "津"),
  /**
   * 藏
   */
  XI_XANG(29, "藏"),
  /**
   * 港
   */
  XIANG_GANG(30, "港"),
  /**
   * 新
   */
  XIN_JIANG(31, "新"),
  /**
   * 云
   */
  YUN_NAN(32, "云"),
  /**
   * 浙
   */
  ZHE_JIANG(33, "浙"),
  /**
   * 皖
   */
  AN_HUI(34, "皖"),
  /**
   * 全部
   */
  ALL(0xff, "全部");

  private int code;
  private String description;

  public static Optional<ProvinceAbbreviation> byCode(int code) {
    return EnumSet.allOf(ProvinceAbbreviation.class).stream().filter(in -> in.code == code).findFirst();
  }
}
