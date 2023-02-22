package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 开关灯检测报警信息结构体
 * <p/>
 * 设备是否支持开关灯检测能力，可以通过设备能力集进行判断，对应智能通道分析能力集(VcaChanAbility)，相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_ABILITY_INFO，节点：<SwitchLamp>。
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "struTime",
                       "byLampStatus",
                       "byRes1",
                       "dwPicDataLen",
                       "pPicData",
                       "byRes"})
public class NET_DVR_SWITCH_LAMP_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 报警时间
   */
  public NET_DVR_TIME_EX struTime;
  /**
   * 开关灯状态，0-已关闭  1-已打开
   */
  public byte byLampStatus;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 图片数据长度，非0表示有图片上传
   */
  public int dwPicDataLen;
  /**
   * 图片数据
   */
  public String pPicData;
  /**
   * 保留
   */
  public byte[] byRes = new byte[64];
}
