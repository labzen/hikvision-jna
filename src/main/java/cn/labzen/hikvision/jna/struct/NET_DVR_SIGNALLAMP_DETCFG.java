package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 信号灯异常检测信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byAbsTime",
                       "struAlarmCamIP",
                       "dwPic1Len",
                       "dwPic2Len",
                       "pPic1Buffer",
                       "pPic2Buffer",
                       "byRes"})
public class NET_DVR_SIGNALLAMP_DETCFG extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
  /**
   * 绝对时间点,yyyymmddhhmmssxxx,e.g.20090810235959999  最后三位为毫秒数
   */
  public byte[] byAbsTime = new byte[32];
  /**
   * 报警摄像机IP
   */
  public NET_DVR_IPADDR struAlarmCamIP;
  /**
   * 异常图片1长度
   */
  public int dwPic1Len;
  /**
   * 异常图片2长度
   */
  public int dwPic2Len;
  /**
   * 数据指针  叠加车道线图片
   */
  public String pPic1Buffer;
  /**
   * 数据指针  叠加信号灯状态图片
   */
  public String pPic2Buffer;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
