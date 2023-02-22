package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 语音对讲库错误码
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VoiceIntercomErrorCode implements HikvisionEnum {

  /**
   * 没有错误
   */
  NET_AUDIOINTERCOM_OK(600, "没有错误"),
  /**
   * 不支持
   */
  NET_AUDIOINTECOM_ERR_NOTSUPORT(601, "不支持"),
  /**
   * 内存申请错误
   */
  NET_AUDIOINTECOM_ERR_ALLOC_MEMERY(602, "内存申请错误"),
  /**
   * 参数错误
   */
  NET_AUDIOINTECOM_ERR_PARAMETER(603, "参数错误"),
  /**
   * 调用次序错误
   */
  NET_AUDIOINTECOM_ERR_CALL_ORDER(604, "调用次序错误"),
  /**
   * 未发现设备
   */
  NET_AUDIOINTECOM_ERR_FIND_DEVICE(605, "未发现设备"),
  /**
   * 不能打开设备
   */
  NET_AUDIOINTECOM_ERR_OPEN_DEVICE(606, "不能打开设备"),
  /**
   * 设备上下文出错
   */
  NET_AUDIOINTECOM_ERR_NO_CONTEXT(607, "设备上下文出错"),
  /**
   * WAV 文件出错
   */
  NET_AUDIOINTECOM_ERR_NO_WAVFILE(608, "WAV 文件出错"),
  /**
   * 无效的 WAV 参数类型
   */
  NET_AUDIOINTECOM_ERR_INVALID_TYPE(609, "无效的 WAV 参数类型"),
  /**
   * 编码失败
   */
  NET_AUDIOINTECOM_ERR_ENCODE_FAIL(610, "编码失败"),
  /**
   * 解码失败
   */
  NET_AUDIOINTECOM_ERR_DECODE_FAIL(611, "解码失败"),
  /**
   * 播放失败
   */
  NET_AUDIOINTECOM_ERR_NO_PLAYBACK(612, "播放失败"),
  /**
   * 降噪失败
   */
  NET_AUDIOINTECOM_ERR_DENOISE_FAIL(613, "降噪失败"),
  /**
   * 未知错误
   */
  NET_AUDIOINTECOM_ERR_UNKOWN(619, "未知错误");

  private int code;
  private String description;

  public static Optional<VoiceIntercomErrorCode> byCode(int code) {
    return EnumSet.allOf(VoiceIntercomErrorCode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
