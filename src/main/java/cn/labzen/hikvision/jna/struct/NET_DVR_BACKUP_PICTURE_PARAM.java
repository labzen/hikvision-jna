package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.DESC_LEN_32;
import static cn.labzen.hikvision.jna.Constants.MAX_RECORD_PICTURE_NUM;

/**
 * 图片备份参数结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwPicNum",
                       "struPicture",
                       "byDiskDes",
                       "byWithPlayer",
                       "byContinue",
                       "byRes"})
public class NET_DVR_BACKUP_PICTURE_PARAM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 图片序号
   */
  public int dwPicNum;
  /**
   * 图片信息
   */
  public NET_DVR_FIND_PICTURE[] struPicture = new NET_DVR_FIND_PICTURE[MAX_RECORD_PICTURE_NUM];
  /**
   * 备份磁盘的描述
   */
  public byte[] byDiskDes = new byte[DESC_LEN_32];
  /**
   * 未知
   */
  public byte byWithPlayer;
  /**
   * 是否继续备份：0- 不继续，1- 继续
   */
  public byte byContinue;
  /**
   * 保留
   */
  public byte[] byRes = new byte[34];
}
