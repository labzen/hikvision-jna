package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 黑名单报警信息结构体
 */
@Structure.FieldOrder({"struBlackListInfo",
                       "dwBlackListPicID",
                       "byRes"})
public class NET_VCA_BLACKLIST_INFO_ALARM extends Structure {

  /**
   * 黑名单基本信息
   */
  public NET_VCA_BLACKLIST_INFO struBlackListInfo;
  /**
   * 黑名单人脸子图ID，用于查找图片
   */
  public int dwBlackListPicID;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[20];
}
