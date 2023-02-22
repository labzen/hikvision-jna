package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.library.internal.Configuration;
import cn.labzen.hikvision.jna.struct.*;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 远程配置命令
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum RemoteConfigCommand implements HikvisionEnum {

  /**
   * 获取WIFI热点连接设备信息。<br>
   * <font style="color: yellow; font-weight: bold">
   * lpInBuffer对应结构体: NULL，cbStateCallback 为 NULL<br>
   * {@link Configuration#NET_DVR_GetNextRemoteConfig(NativeLong, Pointer, int)}接口
   * 的lpOutBuff对应结构体为{@link NET_DVR_WIFI_CLIENT_INFO}
   * </font>
   */
  NET_DVR_GET_WIFI_CLIENT_LIST_INFO(6363, "获取WIFI热点连接设备信息"),
  /**
   * 获取WIFI热点连接设备列表信息。<br>
   * <font style="color: yellow; font-weight: bold">
   * lpInBuffer对应结构体: {@link NET_DVR_CONNECTDEV_COND}，cbStateCallback 为 返回状态、信息数据<br>
   * cbStateCallback.dwType = 2时：<br>
   * cbStateCallback.lpBuffer 对应结构体 {@link NET_DVR_CONNECTDEV_CFG}
   * </font>
   */
  NET_DVR_GET_CONNECT_LIST(433, "获取WIFI热点连接设备列表信息"),
  /**
   * 录像完整性检测。<br>
   * <font style="color: yellow; font-weight: bold">
   * lpInBuffer对应结构体: {@link NET_DVR_RECORD_CHECK_COND}，cbStateCallback 为 NULL<br>
   * {@link Configuration#NET_DVR_GetNextRemoteConfig(NativeLong, Pointer, int)}接口
   * 的lpOutBuff对应结构体为{@link NET_DVR_RECORD_CHECK_RET}
   * </font>
   */
  NET_DVR_RECORD_CHECK(6233, "录像完整性检测"),
  /**
   * 获取录像段总大小。<br>
   * <font style="color: yellow; font-weight: bold">
   * lpInBuffer对应结构体: {@link NET_DVR_RECORD_SEGMENT_COND}，cbStateCallback 为 NULL<br>
   * {@link Configuration#NET_DVR_GetNextRemoteConfig(NativeLong, Pointer, int)}接口
   * 的lpOutBuff对应结构体为{@link NET_DVR_RECORD_SEGMENT_RET}
   * </font>
   */
  NET_DVR_GET_RECORD_SEGMENT_CFG(6242, "获取录像段总大小"),
  /**
   * 按时间段获取缩略图（录像的缩略图，支持流ID)<br>
   * <font style="color: yellow; font-weight: bold">
   * lpInBuffer对应结构体: {@link NET_DVR_THUMBNAILS_COND}，cbStateCallback 为 返回状态、信息数据<br>
   * cbStateCallback.dwType = 2时：<br>
   * cbStateCallback.lpBuffer 对应结构体 {@link NET_DVR_THUMBNAILS_RESULT}
   * </font>
   */
  NET_DVR_GET_THUMBNAILS(6253, "按时间段获取缩略图（录像的缩略图，支持流ID)"),
  /**
   * 按时间点获取缩略图<br>
   * <font style="color: yellow; font-weight: bold">
   * lpInBuffer对应结构体: {@link NET_DVR_GET_FIGURE_COND}，cbStateCallback 为 返回状态、信息数据<br>
   * cbStateCallback.dwType = 2时：<br>
   * cbStateCallback.lpBuffer 对应结构体 {@link NET_DVR_FIGURE_INFO}
   * </font>
   */
  NET_DVR_GET_FIGURE(6610, "按时间点获取缩略图");

  private int code;
  private String description;

  public static Optional<RemoteConfigCommand> byCode(int code) {
    return EnumSet.allOf(RemoteConfigCommand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
