package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.DESC_LEN_32;
import static cn.labzen.hikvision.jna.Constants.MAX_RECORD_FILE_NUM;

/**
 * 备份文件的参数结构体
 */
@Structure.FieldOrder({"dwFileNum",
                       "struFileList",
                       "byDiskDes",
                       "byWithPlayer",
                       "byContinue",
                       "byRes"})
public class NET_DVR_BACKUP_NAME_PARAM extends Structure {

  /**
   * 文件个数
   */
  public int dwFileNum;
  /**
   * 文件列表
   */
  public NET_DVR_FINDDATA_V30[] struFileList = new NET_DVR_FINDDATA_V30[MAX_RECORD_FILE_NUM];
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
   * 保留
   */
  public byte[] byRes = new byte[34];
}
