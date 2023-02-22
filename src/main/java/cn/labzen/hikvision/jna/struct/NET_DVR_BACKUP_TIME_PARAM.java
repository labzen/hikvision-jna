package cn.labzen.hikvision.jna.struct;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.DESC_LEN_32;

/**
 * 备份文件的参数结构体
 */
@Structure.FieldOrder({"lChannel",
                       "struStartTime",
                       "struStopTime",
                       "byDiskDes",
                       "byWithPlayer",
                       "byContinue",
                       "byDrawFrame",
                       "byUseBackCfgParam",
                       "dwStreamType",
                       "byRes"})
public class NET_DVR_BACKUP_TIME_PARAM extends Structure {

  /**
   * 按时间备份的通道
   */
  public NativeLong lChannel;
  /**
   * 备份的起始时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 备份的终止时间
   */
  public NET_DVR_TIME struStopTime;
  /**
   * 备份磁盘描述
   */
  public byte[] byDiskDes = new byte[DESC_LEN_32];
  /**
   * 是否备份播放器
   */
  public byte byWithPlayer;
  /**
   * 是否继续备份 0不继续 1继续
   */
  public byte byContinue;
  /**
   * 0 不抽帧  1 抽帧
   */
  public byte byDrawFrame;
  /**
   * 使用备份配置中的参数，0-无效，1-启用(启用后，通道号无效)，2-不启用
   */
  public byte byUseBackCfgParam;
  /**
   * 备份码流类型，按位表示 &0x1-表示主码流 &0x2-表示子码流&0x4-表示码流三
   */
  public int dwStreamType;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[28];
}
