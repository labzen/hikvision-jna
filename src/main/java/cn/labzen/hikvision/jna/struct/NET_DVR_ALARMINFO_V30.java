package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 上传的报警信息结构体
 */
@Structure.FieldOrder({"dwAlarmType",
                       "dwAlarmInputNumber",
                       "byAlarmOutputNumber",
                       "byAlarmRelateChannel",
                       "byChannel",
                       "byDiskNumber"})
public class NET_DVR_ALARMINFO_V30 extends Structure {

  /**
   * 报警类型：0-信号量报警，1-硬盘满，2-信号丢失，3-移动侦测，4-硬盘未格式化，5-读写硬盘出错，6-遮挡报警，
   * 7-制式不匹配，8-非法访问，9-视频信号异常，10-录像/抓图异常，11-智能场景变化，12-阵列异常，13-前端/录像分辨率不匹配，
   * 15-智能侦测，16-POE供电异常，17-闪光灯异常，18-磁盘满负荷异常报警，19-音频丢失，23-脉冲报警，24-人脸库硬盘异常，
   * 25-人脸库变更，26-人脸库图片变更
   */
  public int dwAlarmType;
  /**
   * 报警输入端口，当报警类型为0、23时有效
   */
  public int dwAlarmInputNumber;
  /**
   * 触发的报警输出端口，值为1表示该报警端口输出，如byAlarmOutputNumber[0]=1表示触发第1个报警输出口输出，
   * byAlarmOutputNumber[1]=1表示触发第2个报警输出口，依次类推。
   */
  public byte[] byAlarmOutputNumber = new byte[MAX_ALARMOUT_V30];
  /**
   * 触发的录像通道，值为1表示该通道录像，如byAlarmRelateChannel[0]=1表示触发第1个通道录像
   */
  public byte[] byAlarmRelateChannel = new byte[MAX_CHANNUM_V30];
  /**
   * dwAlarmType为2或3,6时，表示哪个通道，dwChannel[0]对应第1个通道
   */
  public byte[] byChannel = new byte[MAX_CHANNUM_V30];
  /**
   * 发生报警的硬盘。当报警类型为1，4，5时有效，byDiskNumber[0]=1表示1号硬盘异常
   */
  public byte[] byDiskNumber = new byte[MAX_DISKNUM_V30];
}
