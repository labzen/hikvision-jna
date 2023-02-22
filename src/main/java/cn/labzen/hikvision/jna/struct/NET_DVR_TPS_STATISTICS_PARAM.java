package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_TPS_RULE;

/**
 * TPS交通统计信息结构体
 */
@Structure.FieldOrder({"dwYear",
                       "dwMonth",
                       "dwDay",
                       "dwHour",
                       "dwMinute",
                       "dwSecond"})
public class NET_DVR_TPS_STATISTICS_PARAM extends Structure {

  /**
   * 开始码
   */
  public byte byStart;
  /**
   * 命令号， 08-定时成组数据指令
   */
  public byte byCMD;
  /**
   * 预留字节
   */
  public byte[] byRes = new byte[2];
  /**
   * 设备ID
   */
  public short wDeviceID;
  /**
   * 数据长度
   */
  public short wDataLen;
  /**
   * 有效车道总数
   */
  public byte byTotalLaneNum;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[15];
  /**
   * 统计开始时间
   */
  public NET_DVR_TIME_V30 struStartTime;
  /**
   * 统计时间,单位秒
   */
  public int dwSamplePeriod;
  /**
   * 每个车道TPS统计信息
   */
  public NET_DVR_TPS_LANE_PARAM[] struLaneParam = new NET_DVR_TPS_LANE_PARAM[MAX_TPS_RULE];
}
