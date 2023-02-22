package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.library.internal.RemotePlayback;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 控制录像回放状态命令
 * <p/>
 * 根据{@link RemotePlayback#NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}
 * 的参数dwControlCode
 */
@Getter
@AllArgsConstructor
public enum RecordPlayCommand implements HikvisionEnum {

  /**
   * 开始播放
   */
  NET_DVR_PLAYSTART(1, "开始播放"),
  /**
   * 暂停播放
   */
  NET_DVR_PLAYPAUSE(3, "暂停播放"),
  /**
   * 恢复播放（在暂停后调用将恢复暂停前的速度播放）
   */
  NET_DVR_PLAYRESTART(4, "恢复播放（在暂停后调用将恢复暂停前的速度播放）"),
  /**
   * 快放
   */
  NET_DVR_PLAYFAST(5, "快放"),
  /**
   * 慢放
   */
  NET_DVR_PLAYSLOW(6, "慢放"),
  /**
   * 正常速度播放（快放或者慢放时调用将恢复单倍速度播放）
   */
  NET_DVR_PLAYNORMAL(7, "正常速度播放（快放或者慢放时调用将恢复单倍速度播放）"),
  /**
   * 单帧放（恢复正常回放使用NET_DVR_PLAYNORMAL命令）
   */
  NET_DVR_PLAYFRAME(8, "单帧放（恢复正常回放使用NET_DVR_PLAYNORMAL命令）"),
  /**
   * 打开声音
   */
  NET_DVR_PLAYSTARTAUDIO(9, "打开声音"),
  /**
   * 关闭声音
   */
  NET_DVR_PLAYSTOPAUDIO(10, "关闭声音"),
  /**
   * 调节音量，取值范围[0,0xffff]
   */
  NET_DVR_PLAYAUDIOVOLUME(11, "调节音量，取值范围[0,0xffff]"),
  /**
   * 改变文件回放的进度
   */
  NET_DVR_PLAYSETPOS(12, "改变文件回放的进度"),
  /**
   * 获取按文件或者按时间回放的进度
   */
  NET_DVR_PLAYGETPOS(13, "获取按文件或者按时间回放的进度"),
  /**
   * 获取当前已经播放的时间(按文件回放的时候有效)
   */
  NET_DVR_PLAYGETTIME(14, "获取当前已经播放的时间(按文件回放的时候有效)"),
  /**
   * 获取当前已经播放的帧数(按文件回放的时候有效，倒放不支持)
   */
  NET_DVR_PLAYGETFRAME(15, "获取当前已经播放的帧数(按文件回放的时候有效，倒放不支持)"),
  /**
   * 获取当前播放文件总的帧数(按文件回放的时候有效，倒放不支持)
   */
  NET_DVR_GETTOTALFRAMES(16, "获取当前播放文件总的帧数(按文件回放的时候有效，倒放不支持)"),
  /**
   * 获取当前播放文件总的时间(按文件回放的时候有效)
   */
  NET_DVR_GETTOTALTIME(17, "获取当前播放文件总的时间(按文件回放的时候有效)"),
  /**
   * 丢B帧
   */
  NET_DVR_THROWBFRAME(20, "丢B帧"),
  /**
   * 设置码流速度，速度单位：kbps，最小为256kbps，最大为设备带宽
   */
  NET_DVR_SETSPEED(24, "设置码流速度，速度单位：kbps，最小为256kbps，最大为设备带宽"),
  /**
   * 保持与设备的心跳(如果回调阻塞，建议2秒发送一次)
   */
  NET_DVR_KEEPALIVE(25, "保持与设备的心跳(如果回调阻塞，建议2秒发送一次)"),
  /**
   * 按绝对时间定位
   */
  NET_DVR_PLAYSETTIME(26, "按绝对时间定位"),
  /**
   * 获取按时间回放对应时间段内的所有文件的总长度
   */
  NET_DVR_PLAYGETTOTALLEN(27, "获取按时间回放对应时间段内的所有文件的总长度"),
  /**
   * 倒放切换为正放
   */
  NET_DVR_PLAY_FORWARD(29, "倒放切换为正放"),
  /**
   * 正放切换为倒放
   */
  NET_DVR_PLAY_REVERSE(30, "正放切换为倒放"),
  /**
   * 设置转封装类型
   */
  NET_DVR_SET_TRANS_TYPE(32, "设置转封装类型"),
  /**
   * 回放转码
   */
  NET_DVR_PLAY_CONVERT(33, "回放转码"),
  /**
   * 开始抽帧回放
   */
  NET_DVR_START_DRAWFRAME(34, "开始抽帧回放"),
  /**
   * 停止抽帧回放
   */
  NET_DVR_STOP_DRAWFRAME(35, "停止抽帧回放"),
  /**
   * 窗口大小改变时下发通知给播放库（仅Linux版本适用）
   */
  NET_DVR_CHANGEWNDRESOLUTION(36, "窗口大小改变时下发通知给播放库（仅Linux版本适用）"),
  /**
   * 拖动中
   */
  NET_DVR_VOD_DRAG_ING(37, "拖动中"),
  /**
   * 拖动结束
   */
  NET_DVR_VOD_DRAG_END(38, "拖动结束");

  private int code;
  private String description;

  public static Optional<RecordPlayCommand> byCode(int code) {
    return EnumSet.allOf(RecordPlayCommand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
