package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 软解码库错误码
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum DecodingErrorCode implements HikvisionEnum {

  /**
   * 没有错误
   */
  NET_PLAYM4_NOERROR(500, "没有错误"),
  /**
   * 输入参数非法
   */
  NET_PLAYM4_PARA_OVER(501, "输入参数非法"),
  /**
   * 调用顺序不对
   */
  NET_PLAYM4_ORDER_ERROR(502, "调用顺序不对"),
  /**
   * 多媒体时钟设置失败
   */
  NET_PLAYM4_TIMER_ERROR(503, "多媒体时钟设置失败"),
  /**
   * 视频解码失败
   */
  NET_PLAYM4_DEC_VIDEO_ERROR(504, "视频解码失败"),
  /**
   * 音频解码失败
   */
  NET_PLAYM4_DEC_AUDIO_ERROR(505, "音频解码失败"),
  /**
   * 分配内存失败
   */
  NET_PLAYM4_ALLOC_MEMORY_ERROR(506, "分配内存失败"),
  /**
   * 文件操作失败
   */
  NET_PLAYM4_OPEN_FILE_ERROR(507, "文件操作失败"),
  /**
   * 创建线程事件等失败
   */
  NET_PLAYM4_CREATE_OBJ_ERROR(508, "创建线程事件等失败"),
  /**
   * 创建 directDraw 失败
   */
  NET_PLAYM4_CREATE_DDRAW_ERROR(509, "创建 directDraw 失败"),
  /**
   * 创建后端缓存失败
   */
  NET_PLAYM4_CREATE_OFFSCREEN_ERROR(510, "创建后端缓存失败"),
  /**
   * 缓冲区满，输入流失败
   */
  NET_PLAYM4_BUF_OVER(511, "缓冲区满，输入流失败"),
  /**
   * 创建音频设备失败
   */
  NET_PLAYM4_CREATE_SOUND_ERROR(512, "创建音频设备失败"),
  /**
   * 设置音量失败
   */
  NET_PLAYM4_SET_VOLUME_ERROR(513, "设置音量失败"),
  /**
   * 只能在播放文件时才能使用此接口
   */
  NET_PLAYM4_SUPPORT_FILE_ONLY(514, "只能在播放文件时才能使用此接口"),
  /**
   * 只能在播放流时才能使用此接口
   */
  NET_PLAYM4_SUPPORT_STREAM_ONLY(515, "只能在播放流时才能使用此接口"),
  /**
   * 系统不支持，解码器只能工作在 Pentium 3 以上
   */
  NET_PLAYM4_SYS_NOT_SUPPORT(516, "系统不支持，解码器只能工作在 Pentium 3 以上"),
  /**
   * 没有文件头
   */
  NET_PLAYM4_FILEHEADER_UNKNOWN(517, "没有文件头"),
  /**
   * 解码器和编码器版本不对应
   */
  NET_PLAYM4_VERSION_INCORRECT(518, "解码器和编码器版本不对应"),
  /**
   * 初始化解码器失败
   */
  NET_PALYM4_INIT_DECODER_ERROR(519, "初始化解码器失败"),
  /**
   * 文件太短或码流无法识别
   */
  NET_PLAYM4_CHECK_FILE_ERROR(520, "文件太短或码流无法识别"),
  /**
   * 初始化多媒体时钟失败
   */
  NET_PLAYM4_INIT_TIMER_ERROR(521, "初始化多媒体时钟失败"),
  /**
   * 位拷贝失败
   */
  NET_PLAYM4_BLT_ERROR(522, "位拷贝失败"),
  /**
   * 显示 overlay 失败
   */
  NET_PLAYM4_UPDATE_ERROR(523, "显示 overlay 失败"),
  /**
   * 打开混合流文件失败
   */
  NET_PLAYM4_OPEN_FILE_ERROR_MULTI(524, "打开混合流文件失败"),
  /**
   * 打开视频流文件失败
   */
  NET_PLAYM4_OPEN_FILE_ERROR_VIDEO(525, "打开视频流文件失败"),
  /**
   * JPEG 压缩错误
   */
  NET_PLAYM4_JPEG_COMPRESS_ERROR(526, "JPEG 压缩错误"),
  /**
   * 不支持该文件版本
   */
  NET_PLAYM4_EXTRACT_NOT_SUPPORT(527, "不支持该文件版本"),
  /**
   * 提取文件数据失败
   */
  NET_PLAYM4_EXTRACT_DATA_ERROR(528, "提取文件数据失败");

  private int code;
  private String description;

  public static Optional<DecodingErrorCode> byCode(int code) {
    return EnumSet.allOf(DecodingErrorCode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
