package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 上传的报警信息结构体
 */
@Structure.FieldOrder({"dwAlarmType",
                       "dwAlarmInputNumber",
                       "dwAlarmOutputNumber",
                       "dwAlarmRelateChannel",
                       "dwChannel",
                       "dwDiskNumber"})
public class NET_DVR_ALARMINFO extends Structure {

  /**
   * 报警类型： 0－信号量报警； 1－硬盘满； 2－信号丢失； 3－移动侦测； 4－硬盘未格式化； 5－读写硬盘出错； 6－遮挡报警； 7－制式不匹配； 8－非法访问；
   */
  public int dwAlarmType;
  /**
   * 报警输入端口。当报警类型为9时该变量表示串口状态：0表示正常，0xffffffff表示异常
   */
  public int dwAlarmInputNumber;
  /**
   * 触发的报警输出端口。当报警类型为信号量报警时，值为1表示该报警端口输出
   */
  public int[] dwAlarmOutputNumber = new int[MAX_ALARMOUT];
  /**
   * 触发的录像通道。当报警类型为信号量报警时，值为1表示该通道录像，如dwAlarmRelateChannel[0]表示触发第1个通道录像
   */
  public int[] dwAlarmRelateChannel = new int[MAX_CHANNUM];
  /**
   * 发生报警的通道。当报警类型为2，3，6时有效，如dwChannel[0]值为1表示第1个通道报警
   */
  public int[] dwChannel = new int[MAX_CHANNUM];
  /**
   * 发生报警的硬盘。当报警类型为1，4，5时有效，dwDiskNumber[0]值为1表示1号硬盘异常
   */
  public int[] dwDiskNumber = new int[MAX_DISKNUM];
}
