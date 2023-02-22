package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 设备编码类型
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum DeviceEncode implements HikvisionEnum {

  /**
   * 无字符编码信息(老设备)
   */
  UNKNOWN(0, "无字符编码信息(老设备)"),
  /**
   * GB2312(简体中文)
   */
  GB2312(1, "GB2312(简体中文)"),
  /**
   * GBK
   */
  GBK(2, "GBK"),
  /**
   * BIG5(繁体中文)
   */
  BIG5(3, "BIG5(繁体中文)"),
  /**
   * Shift_JIS(日文)
   */
  JIS(4, "Shift_JIS(日文)"),
  /**
   * EUC-KR(韩文)
   */
  KR(5, "EUC-KR(韩文)"),
  /**
   * UTF-8
   */
  UTF_8(6, "UTF-8"),
  /**
   * ISO8859-1
   */
  ISO8859_1(7, "ISO8859-1"),
  /**
   * ISO8859-2
   */
  ISO8859_2(8, "ISO8859-2"),
  /**
   * ISO8859-3
   */
  ISO8859_3(9, "ISO8859-3"),
  /**
   * ISO8859-4
   */
  ISO8859_4(10, "ISO8859-4"),
  /**
   * ISO8859-5
   */
  ISO8859_5(11, "ISO8859-5"),
  /**
   * ISO8859-6
   */
  ISO8859_6(12, "ISO8859-6"),
  /**
   * ISO8859-7
   */
  ISO8859_7(13, "ISO8859-7"),
  /**
   * ISO8859-8
   */
  ISO8859_8(14, "ISO8859-8"),
  /**
   * ISO8859-9
   */
  ISO8859_9(15, "ISO8859-9"),
  /**
   * ISO8859-10
   */
  ISO8859_10(16, "ISO8859-10"),
  /**
   * ISO8859-11
   */
  ISO8859_11(17, "ISO8859-11"),
  /**
   * ISO8859-12
   */
  ISO8859_12(18, "ISO8859-12"),
  /**
   * ISO8859-13
   */
  ISO8859_13(19, "ISO8859-13"),
  /**
   * ISO8859-14
   */
  ISO8859_14(20, "ISO8859-14"),
  /**
   * ISO8859-15
   */
  ISO8859_15(21, "ISO8859-15");

  private int code;
  private String description;

  public static Optional<DeviceEncode> byCode(int code) {
    return EnumSet.allOf(DeviceEncode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
