package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * VQD诊断类型，参考VQD_TYPE
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VqdType implements HikvisionEnum {

  /**
   * 图像模糊
   */
  VQD_BLUR_FLAG(0x00000001, "图像模糊"),
  /**
   * 亮度异常
   */
  VQD_LUMA_FLAG(0x00000002, "亮度异常"),
  /**
   * 图像偏色
   */
  VQD_CHROMA_FLAG(0x00000004, "图像偏色"),
  /**
   * 雪花干扰
   */
  VQD_SNOW_FLAG(0x00000008, "雪花干扰"),
  /**
   * 条纹干扰
   */
  VQD_STREAK_FLAG(0x00000010, "条纹干扰"),
  /**
   * 画面冻结
   */
  VQD_FREEZE_FLAG(0x00000020, "画面冻结"),
  /**
   * 信号丢失
   */
  VQD_SIGLOSE_FLAG(0x00000040, "信号丢失"),
  /**
   * 云台失控
   */
  VQD_PTZ_FLAG(0x00000080, "云台失控");

  private int code;
  private String description;

  public static Optional<VqdType> byCode(int code) {
    return EnumSet.allOf(VqdType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
