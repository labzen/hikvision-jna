package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 视频质量诊断检测事件，参考VQD_EVENT_ENUM
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VqdEventType implements HikvisionEnum {

  /**
   * 图像模糊
   */
  VQD_EVENT_BLUR(1, "图像模糊"),
  /**
   * 亮度异常
   */
  VQD_EVENT_LUMA(2, "亮度异常"),
  /**
   * 图像偏色
   */
  VQD_EVENT_CHROMA(3, "图像偏色"),
  /**
   * 雪花干扰
   */
  VQD_EVENT_SNOW(4, "雪花干扰"),
  /**
   * 条纹干扰
   */
  VQD_EVENT_STREAK(5, "条纹干扰"),
  /**
   * 画面冻结
   */
  VQD_EVENT_FREEZE(6, "画面冻结"),
  /**
   * 信号丢失
   */
  VQD_EVENT_SIGNAL_LOSS(7, "信号丢失"),
  /**
   * 云台失控
   */
  VQD_EVENT_PTZ(8, "云台失控"),
  /**
   * 场景突变
   */
  VQD_EVENT_SCNENE_CHANGE(9, "场景突变"),
  /**
   * 视频异常
   */
  VQD_EVENT_VIDEO_ABNORMAL(10, "视频异常"),
  /**
   * 视频遮挡
   */
  VQD_EVENT_VIDEO_BLOCK(11, "视频遮挡"),
  /**
   * 清晰度异常
   */
  VQD_EVENT_CLARTY(12, "清晰度异常"),
  /**
   * 画面抖动
   */
  VQD_EVENT_JITTER(13, "画面抖动"),
  /**
   * 画屏
   */
  VQD_EVENT_FLOWERS(14, "画屏"),
  /**
   * 噪点
   */
  VQD_EVENT_NOISE(15, "噪点"),
  /**
   * 异常光斑
   */
  VQD_EVENT_GHOST(16, "异常光斑"),
  /**
   * 紫边
   */
  VQD_EVENT_PURPLE(17, "紫边"),
  /**
   * ICR检测异常
   */
  VQD_EVENT_ICR(18, " ICR检测异常"),
  /**
   * 保护膜未撕
   */
  VQD_EVENT_PROTECTFILM(19, "保护膜未撕");

  private int code;
  private String description;

  public static Optional<VqdEventType> byCode(int code) {
    return EnumSet.allOf(VqdEventType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
