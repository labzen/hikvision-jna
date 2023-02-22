package cn.labzen.hikvision.jna.definition;

import cn.labzen.hikvision.jna.library.internal.RemotePlayback;
import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 录像备份的进度
 * <p/>
 * 根据{@link RemotePlayback#NET_DVR_GetBackupProgress(NativeLong, IntByReference)}的参数pState
 */
@Getter
@AllArgsConstructor
public enum RecordBackupStatus implements HikvisionEnum {

  /**
   * 备份完成
   */
  BACKUP_SUCCESS(100, "备份完成"),
  /**
   * 备份设备已满，更换设备继续备份
   */
  BACKUP_CHANGE_DEVICE(101, "备份设备已满，更换设备继续备份"),
  /**
   * 正在搜索备份设备
   */
  BACKUP_SEARCH_DEVICE(300, "正在搜索备份设备"),
  /**
   * 正在搜索录像文件或者图片
   */
  BACKUP_SEARCH_FILE(301, "正在搜索录像文件或者图片"),
  /**
   * 正在搜索日志文件
   */
  BACKUP_SEARCH_LOG_FILE(302, "正在搜索日志文件"),
  /**
   * 正在更换光盘
   */
  BACKUP_CHANGE_DISK(303, "正在更换光盘"),
  /**
   * 备份异常
   */
  BACKUP_EXCEPTION(400, "备份异常"),
  /**
   * 备份失败
   */
  BACKUP_FAIL(500, "备份失败"),
  /**
   * 时间段内无录像文件或者图片
   */
  BACKUP_TIME_SEG_NO_FILE(501, "时间段内无录像文件或者图片"),
  /**
   * 申请不到资源
   */
  BACKUP_NO_RESOURCE(502, "申请不到资源"),
  /**
   * 备份设备容量不足
   */
  BACKUP_DEVICE_LOW_SPACE(503, "备份设备容量不足"),
  /**
   * 刻录光盘封盘
   */
  BACKUP_DISK_FINALIZED(504, "刻录光盘封盘"),
  /**
   * 刻录光盘异常
   */
  BACKUP_DISK_EXCEPTION(505, "刻录光盘异常"),
  /**
   * 备份设备不存在
   */
  BACKUP_DEVICE_NOT_EXIST(506, "备份设备不存在"),
  /**
   * 有其他备份操作在进行
   */
  BACKUP_OTNER_BACKUP_WORK(507, "有其他备份操作在进行"),
  /**
   * 用户没有操作权限
   */
  BACKUP_USER_NO_RIGHT(508, "用户没有操作权限"),
  /**
   * 操作失败
   */
  BACKUP_OPERATE_FAIL(509, "操作失败"),
  /**
   * 硬盘中无日志
   */
  BACKUP_NO_LOG_FILE(510, "硬盘中无日志");

  private int code;
  private String description;

  public static Optional<RecordBackupStatus> byCode(int code) {
    return EnumSet.allOf(RecordBackupStatus.class).stream().filter(in -> in.code == code).findFirst();
  }
}
