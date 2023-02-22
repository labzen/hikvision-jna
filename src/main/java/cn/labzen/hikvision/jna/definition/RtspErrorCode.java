package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * RTSP 通讯库错误码
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum RtspErrorCode implements HikvisionEnum {

  /**
   * 无权限：服务器返回 401 时，转成这个错误码
   */
  NET_DVR_RTSP_ERROR_NOENOUGHPRI(401, "无权限：服务器返回 401 时，转成这个错误码"),
  /**
   * 分配资源失败
   */
  NET_DVR_RTSP_ERROR_ALLOC_RESOURCE(402, "分配资源失败"),
  /**
   * 参数错误
   */
  NET_DVR_RTSP_ERROR_PARAMETER(403, "参数错误"),
  /**
   * 指定的 URL 地址不存在：服务器返回 404 时，转成这个错误码，例如请求不可用的通道号预览、请求不支持子码流的通道预览
   */
  NET_DVR_RTSP_ERROR_NO_URL(404,
      "指定的 URL 地址不存在：服务器返回 404 时，转成这个错误码，例如请求不可用的通道号预览、请求不支持子码流的通道预览"),
  /**
   * 用户中途强行退出
   */
  NET_DVR_RTSP_ERROR_FORCE_STOP(406, "用户中途强行退出"),
  /**
   * 获取 RTSP 端口错误
   */
  NET_DVR_RTSP_GETPORTFAILED(407, "获取 RTSP 端口错误"),
  /**
   * RTSP DECRIBE 交互错误
   */
  NET_DVR_RTSP_DESCRIBERROR(410, "RTSP DECRIBE 交互错误"),
  /**
   * RTSP DECRIBE 发送超时
   */
  NET_DVR_RTSP_DESCRIBESENDTIMEOUT(411, "RTSP DECRIBE 发送超时"),
  /**
   * RTSP DECRIBE 发送失败
   */
  NET_DVR_RTSP_DESCRIBESENDERROR(412, "RTSP DECRIBE 发送失败"),
  /**
   * RTSP DECRIBE 接收超时
   */
  NET_DVR_RTSP_DESCRIBERECVTIMEOUT(413, "RTSP DECRIBE 接收超时"),
  /**
   * RTSP DECRIBE 接收数据错误
   */
  NET_DVR_RTSP_DESCRIBERECVDATALOST(414, "RTSP DECRIBE 接收数据错误"),
  /**
   * RTSP DECRIBE 接收失败
   */
  NET_DVR_RTSP_DESCRIBERECVERROR(415, "RTSP DECRIBE 接收失败"),
  /**
   * RTSP DECRIBE 服务器返回错误状态。例如服务器返回400，可能是不支持子码流
   */
  NET_DVR_RTSP_DESCRIBESERVERERR(416, "RTSP DECRIBE 服务器返回错误状态。例如服务器返回400，可能是不支持子码流"),
  /**
   * RTSP SETUP 交互错误，一般是服务器返回的码流地址无法连接上，或者被服务器拒绝。（老版本的 SDK 可能返回错误号 419，为同样的错误原因）
   */
  NET_DVR_RTSP_SETUPERROR(420,
      "RTSP SETUP 交互错误，一般是服务器返回的码流地址无法连接上，或者被服务器拒绝。（老版本的 SDK 可能返回错误号 419，为同样的错误原因）"),
  /**
   * RTSP SETUP 发送超时
   */
  NET_DVR_RTSP_SETUPSENDTIMEOUT(421, "RTSP SETUP 发送超时"),
  /**
   * RTSP SETUP 发送错误
   */
  NET_DVR_RTSP_SETUPSENDERROR(422, "RTSP SETUP 发送错误"),
  /**
   * RTSP SETUP 接收超时
   */
  NET_DVR_RTSP_SETUPRECVTIMEOUT(423, "RTSP SETUP 接收超时"),
  /**
   * RTSP SETUP 接收数据错误
   */
  NET_DVR_RTSP_SETUPRECVDATALOST(424, "RTSP SETUP 接收数据错误"),
  /**
   * RTSP SETUP 接收失败
   */
  NET_DVR_RTSP_SETUPRECVERROR(425, "RTSP SETUP 接收失败"),
  /**
   * 超过服务器最大连接数，或者服务器资源不足，服务器返回 453 时，转成这个错误码
   */
  NET_DVR_RTSP_OVER_MAX_CHAN(426, "超过服务器最大连接数，或者服务器资源不足，服务器返回 453 时，转成这个错误码"),
  /**
   * RTSP SETUP 服务器返回错误状态
   */
  NET_DVR_RTSP_SETUPSERVERERR(427, "RTSP SETUP 服务器返回错误状态"),
  /**
   * RTSP PLAY 交互错误
   */
  NET_DVR_RTSP_PLAYERROR(430, "RTSP PLAY 交互错误"),
  /**
   * RTSP PLAY 发送超时
   */
  NET_DVR_RTSP_PLAYSENDTIMEOUT(431, "RTSP PLAY 发送超时"),
  /**
   * RTSP PLAY 发送错误
   */
  NET_DVR_RTSP_PLAYSENDERROR(432, "RTSP PLAY 发送错误"),
  /**
   * RTSP PLAT 接收超时
   */
  NET_DVR_RTSP_PLAYRECVTIMEOUT(433, "RTSP PLAT 接收超时"),
  /**
   * RTSP PLAY 接收数据错误
   */
  NET_DVR_RTSP_PLAYRECVDATALOST(434, "RTSP PLAY 接收数据错误"),
  /**
   * RTSP PLAY 接收失败
   */
  NET_DVR_RTSP_PLAYRECVERROR(435, "RTSP PLAY 接收失败"),
  /**
   * RTSP PLAY 服务器返回错误状态
   */
  NET_DVR_RTSP_PLAYSERVERERR(436, "RTSP PLAY 服务器返回错误状态"),
  /**
   * RTSP TEARDOWN 交互错误
   */
  NET_DVR_RTSP_TEARDOWNERROR(440, "RTSP TEARDOWN 交互错误"),
  /**
   * RTSP TEARDOWN 发送超时
   */
  NET_DVR_RTSP_TEARDOWNSENDTIMEOUT(441, "RTSP TEARDOWN 发送超时"),
  /**
   * RTSP TEARDOWN 发送错误
   */
  NET_DVR_RTSP_TEARDOWNSENDERROR(442, "RTSP TEARDOWN 发送错误"),
  /**
   * RTSP TEARDOWN 接收超时
   */
  NET_DVR_RTSP_TEARDOWNRECVTIMEOUT(443, "RTSP TEARDOWN 接收超时"),
  /**
   * RTSP TEARDOWN 接收数据错误
   */
  NET_DVR_RTSP_TEARDOWNRECVDATALOST(444, "RTSP TEARDOWN 接收数据错误"),
  /**
   * RTSP TEARDOWN 接收失败
   */
  NET_DVR_RTSP_TEARDOWNRECVERROR(445, "RTSP TEARDOWN 接收失败"),
  /**
   * RTSP TEARDOWN 服务器返回错误状态
   */
  NET_DVR_RTSP_TEARDOWNSERVERERR(446, "RTSP TEARDOWN 服务器返回错误状态");

  private int code;
  private String description;

  public static Optional<RtspErrorCode> byCode(int code) {
    return EnumSet.allOf(RtspErrorCode.class).stream().filter(in -> in.code == code).findFirst();
  }
}
