package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 热度图上传结果结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "struStartTime",
                       "struEndTime",
                       "dwMaxHeatMapValue",
                       "dwMinHeatMapValue",
                       "dwTimeHeatMapValue",
                       "wArrayLine",
                       "wArrayColumn",
                       "pBuffer",
                       "byDetSceneID",
                       "byBrokenNetHttp",
                       "wDevInfoIvmsChannelEx",
                       "byTimeDiffFlag",
                       "cStartTimeDifferenceH",
                       "cStartTimeDifferenceM",
                       "cStopTimeDifferenceH",
                       "cStopTimeDifferenceM",
                       "byArrayUnitType",
                       "byRes1",
                       "dwTotalTime",
                       "byRes"})
public class NET_DVR_HEATMAP_RESULT extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 开始时间
   */
  public NET_DVR_TIME_EX struStartTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME_EX struEndTime;
  /**
   * 最大热度值
   */
  public int dwMaxHeatMapValue;
  /**
   * 最小热度值
   */
  public int dwMinHeatMapValue;
  /**
   * (时间热度值)平均热度值
   */
  public int dwTimeHeatMapValue;
  /**
   * 图片像素点行值
   */
  public short wArrayLine;
  /**
   * 图片像素点列值 （当行列值为0的时候，像素点值内存信息不存在）
   */
  public short wArrayColumn;
  /**
   * 热度图片像素点数据信息
   */
  public ByteByReference pBuffer;
  /**
   * 检测场景号[1],球机当前支持1个场景, IPC默认是0
   */
  public byte byDetSceneID;
  /**
   * 断网续传标志位，0-不是重传数据，1-重传数据
   */
  public byte byBrokenNetHttp;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 时差字段是否有效  0-时差无效， 1-时差有效
   */
  public byte byTimeDiffFlag;
  /**
   * 开始时间与UTC的时差（小时），-12 ... +14，+表示东区
   */
  public byte cStartTimeDifferenceH;
  /**
   * 开始时间与UTC的时差（分钟），-30, 30, 45，+表示东区
   */
  public byte cStartTimeDifferenceM;
  /**
   * 结束时间与UTC的时差（小时），-12 ... +14， +表示东区
   */
  public byte cStopTimeDifferenceH;
  /**
   * 结束时间与UTC的时差（分钟），-30, 30, 45，+表示东区
   */
  public byte cStopTimeDifferenceM;
  /**
   * 矩阵单元数据类型（矩阵信息中每个像素点数据的数据类型），1-byte，2-short,4-int
   */
  public byte byArrayUnitType;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 停留时间总和，单位秒，按人员停留时间报警时上传
   */
  public int dwTotalTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[112];
}
