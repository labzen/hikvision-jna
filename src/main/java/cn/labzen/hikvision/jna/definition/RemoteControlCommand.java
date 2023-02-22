package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.struct.NET_DVR_I_FRAME;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 远程控制命令
 */
@Getter
@AllArgsConstructor
public enum RemoteControlCommand implements HikvisionEnum {

  /**
   * 强制I帧，对应结构：{@link NET_DVR_I_FRAME}
   */
  NET_DVR_MAKE_I_FRAME(3402, "强制I帧");

  private int code;
  private String description;

  public static Optional<RemoteControlCommand> byCode(int code) {
    return EnumSet.allOf(RemoteControlCommand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
