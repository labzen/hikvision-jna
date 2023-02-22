package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_ALARMOUT_V40;

/**
 * 异常参数信息结构体
 */
@Structure.FieldOrder({"dwHandleType",
                       "dwMaxAlarmOutChannelNum",
                       "dwRelAlarmOut",
                       "byRes"})
public class NET_DVR_HANDLEEXCEPTION_V41 extends Structure {

  /**
   * 处理方式，各种异常处理方式的"或"结果，异常处理方式：<br/>
   * 0x00: 无响应<br/>
   * 0x01: 监视器上警告<br/>
   * 0x02: 声音警告<br/>
   * 0x04: 上传中心<br/>
   * 0x08: 触发报警输出<br/>
   * 0x10: Jpeg抓图并上传EMail<br/>
   * 0x20: 无线声光报警器联动<br/>
   * 0x40: 联动电子地图(目前仅PCNVR支持)<br/>
   * 0x200: 抓图并上传ftp<br/>
   * 0x400: 虚交侦测 联动 聚焦模式（提供可配置项，原先设备自动完成）IPC5.1.0<br/>
   * 0x800: PTZ联动跟踪(球机跟踪目标)<br/>
   * 0x1000：抓图上传到云存储<br/>
   * E.g. dwHandleType==0x01|0x04 表示配置报警发生时联动监视器上警告并且将报警信息上传中心
   */
  public int dwHandleType;
  /**
   * 设备最大支持的触发报警输出通道数（只读）
   */
  public int dwMaxAlarmOutChannelNum;
  /**
   * 触发报警输出通道，数组元素值表示报警输出号（从0开始），例如：dwRelAlarmOut[i]==3表示触发第4个报警输出通道。中间遇到0xffffffff则后续无效。
   */
  public int[] dwRelAlarmOut = new int[MAX_ALARMOUT_V40];
  /**
   * 保留
   */
  public byte[] byRes = new byte[64];
}
