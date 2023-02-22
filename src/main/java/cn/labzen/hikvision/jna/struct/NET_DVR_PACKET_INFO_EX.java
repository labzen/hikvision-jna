package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 数据包信息结构体
 */
@Structure.FieldOrder({"wWidth",
                       "wHeight",
                       "dwTimeStamp",
                       "dwTimeStampHigh",
                       "dwYear",
                       "dwMonth",
                       "dwDay",
                       "dwHour",
                       "dwMinute",
                       "dwSecond",
                       "dwMillisecond",
                       "dwFrameNum",
                       "dwFrameRate",
                       "dwFlag",
                       "dwFilePos",
                       "dwPacketType",
                       "dwPacketSize",
                       "pPacketBuffer",
                       "byRes1",
                       "dwPacketMode",
                       "byRes2",
                       "dwReserved"})
public class NET_DVR_PACKET_INFO_EX extends Structure {

  /**
   * width
   */
  public short wWidth;
  /**
   * height
   */
  public short wHeight;
  /**
   * lower time stamp
   */
  public int dwTimeStamp;
  /**
   * higher time stamp
   */
  public int dwTimeStampHigh;
  /**
   * year
   */
  public int dwYear;
  /**
   * month
   */
  public int dwMonth;
  /**
   * day
   */
  public int dwDay;
  /**
   * hour
   */
  public int dwHour;
  /**
   * minute
   */
  public int dwMinute;
  /**
   * second
   */
  public int dwSecond;
  /**
   * millisecond
   */
  public int dwMillisecond;
  /**
   * frame num
   */
  public int dwFrameNum;
  /**
   * 帧率，当帧率小于0时，0x80000002表示1/2帧率，同理可推0x80000010为1/16帧率
   */
  public int dwFrameRate;
  /**
   * flag E帧标记
   */
  public int dwFlag;
  /**
   * file pos
   */
  public int dwFilePos;
  /**
   * 包类型：0- 文件头，1- 视频I帧，2- 视频B帧， 3- 视频P帧， 10- 音频数据包， 11- 私有数据包
   */
  public int dwPacketType;
  /**
   * packet size
   */
  public int dwPacketSize;
  /**
   * packet buffer
   */
  public String pPacketBuffer;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[4];
  /**
   * 打包方式:0-保留，1-FU_A打包方式
   */
  public int dwPacketMode;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[16];
  /**
   * reserved[0] 表示私有数据类型
   */
  public int[] dwReserved = new int[6];
}
