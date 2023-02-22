package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;
import com.sun.jna.ptr.IntByReference;

/**
 * 上传的报警信息结构体
 */
@Structure.FieldOrder({"struAlarmFixedHeader",
                       "pAlarmData"})
public class NET_DVR_ALARMINFO_V40 extends Structure {

  /**
   * 报警固定部分
   */
  public NET_DVR_ALRAM_FIXED_HEADER struAlarmFixedHeader;
  /**
   * 报警可变部分内容
   */
  public IntByReference pAlarmData;

  /**
   * 报警信息固定部分参数结构体
   */
  @FieldOrder({"dwAlarmType",
               "struAlarmTime",
               "uStruAlarm"})
  public static class NET_DVR_ALRAM_FIXED_HEADER extends Structure {

    /**
     * 报警信息类型：0-信号量报警，1-硬盘满，2-信号丢失，3-移动侦测，4-硬盘未格式化，5-写硬盘出错，6-遮挡报警，
     * 7-制式不匹配，8-非法访问，9-视频信号异常，10-录像异常，11-智能场景变化，12-阵列异常，13-前端/录像分辨率不匹配，
     * 15-智能侦测，16-POE供电异常，17-录播主机报警，18-TME语音对讲请求报警，23-脉冲报警，24-人脸库硬盘异常，
     * 25-人脸库变更，26-人脸库图片变更
     * <p>
     * dwAlarmType为0、23对应联合体中结构struIOAlarm，dwAlarmType为2、3、6、9、10、11、13、15、16对应联合体中
     * 结构struAlarmChannel，dwAlarmType为1、4、5对应联合体中结构struAlarmHardDisk，dwAlarmType为17对应联合
     * 体中结构struRecordingHost，其他取值时联合体参数无效
     */
    public int dwAlarmType;
    /**
     * 报警时间
     */
    public NET_DVR_TIME_EX struAlarmTime;
    /**
     * 报警信息联合体
     */
    public uStruAlarm uStruAlarm;
  }

  @FieldOrder({"byUnionLen",
               "struioAlarm",
               "sstrualarmChannel",
               "strualarmHardDisk",
               "strurecordingHost"})
  public static class uStruAlarm extends Union {

    /**
     * 联合体大小，128字节
     */
    public byte[] byUnionLen = new byte[128];
    /**
     * 报警输入参数
     */
    public struIOAlarm struioAlarm;
    /**
     * 报警通道参数
     */
    public struAlarmChannel sstrualarmChannel;
    /**
     * 报警硬盘参数
     */
    public struAlarmHardDisk strualarmHardDisk;
    /**
     * 录播主机专用报警参数
     */
    public struRecordingHost strurecordingHost;
  }

  /**
   * 报警输入参数
   */
  @FieldOrder({"dwAlarmInputNo",
               "dwTrigerAlarmOutNum",
               "dwTrigerRecordChanNum"})
  public static class struIOAlarm extends Structure {

    /**
     * 发生报警的报警输入通道号，一次只有一个
     */
    public int dwAlarmInputNo;
    /**
     * 触发的报警输出个数，用于从NET_DVR_ALARMINFO_V40的pAlarmData(变长数据部分)计算出所有触发的报警输出通道号，四字节表示一个报警输出
     */
    public int dwTrigerAlarmOutNum;
    /**
     * 触发的录像通道个数，用于从NET_DVR_ALARMINFO_V40的pAlarmData(变长数据部分)计算出所有触发的录像通道号，四字节表示一个通道
     */
    public int dwTrigerRecordChanNum;
  }

  /**
   * 报警通道参数
   */
  @FieldOrder({"dwAlarmChanNum"})
  public static class struAlarmChannel extends Structure {

    /**
     * 发生报警通道数据个数，用于从NET_DVR_ALARMINFO_V40的pAlarmData(变长数据部分)计算出所有发生的报警通道号，四字节表示一个报警通道
     */
    public int dwAlarmChanNum;
  }

  /**
   * 报警硬盘参数
   */
  @FieldOrder({"dwAlarmHardDiskNum"})
  public static class struAlarmHardDisk extends Structure {

    /**
     * 发生报警的硬盘个数，用于从NET_DVR_ALARMINFO_V40的pAlarmData(变长数据部分)计算出所有发生报警的硬盘号，四节表示一个硬盘
     */
    public int dwAlarmHardDiskNum;
  }

  /**
   * 录播主机专用报警参数
   */
  @FieldOrder({"bySubAlarmType",
               "byRes1",
               "struRecordEndTime",
               "byRes"})
  public static class struRecordingHost extends Structure {

    /**
     * 报警子类型：1- 一键延迟录像
     */
    public byte bySubAlarmType;
    /**
     * 保留，置为0
     */
    public byte[] byRes1 = new byte[3];
    /**
     * 录播结束时间
     */
    public NET_DVR_TIME_EX struRecordEndTime;
    /**
     * 保留，置为0
     */
    public byte[] byRes = new byte[116];
  }

}
