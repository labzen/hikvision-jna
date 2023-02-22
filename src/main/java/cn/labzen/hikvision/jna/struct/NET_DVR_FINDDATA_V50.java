package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.RecordFileType;
import com.sun.jna.Structure;

/**
 * 文件查找结果信息结构体
 */
@Structure.FieldOrder({"sFileName",
                       "struStartTime",
                       "struStopTime",
                       "struAddr",
                       "dwFileSize",
                       "byLocked",
                       "byFileType",
                       "byQuickSearch",
                       "byStreamType",
                       "dwFileIndex",
                       "sCardNum",
                       "byRes"})
public class NET_DVR_FINDDATA_V50 extends Structure {

  /**
   * 文件名，日历查询时无效
   */
  public byte[] sFileName = new byte[100];
  /**
   * 文件的开始时间
   */
  public NET_DVR_TIME_SEARCH struStartTime;
  /**
   * 文件的结束时间
   */
  public NET_DVR_TIME_SEARCH struStopTime;
  /**
   * 片段所在的地址信息，集群回放时用到
   */
  public NET_DVR_ADDRESS struAddr;
  /**
   * 文件的大小
   */
  public int dwFileSize;
  /**
   * 9000设备支持（ISAPI登录不支持）文件是否被锁定，1－文件已锁定；0－文件未锁定
   */
  public byte byLocked;
  /**
   * 文件类型
   * <p/>
   * 参考{@link RecordFileType}
   */
  public byte byFileType;
  /**
   * （ISAPI登录不支持）0- 普通查询结果，1- 快速（日历）查询结果
   */
  public byte byQuickSearch;
  /**
   * （ISAPI登录不支持）码流类型：0- 主码流，1- 子码流，2- 码流三
   */
  public byte byStreamType;
  /**
   * （ISAPI登录不支持）文件索引号
   */
  public int dwFileIndex;
  /**
   * 卡号
   */
  public byte[] sCardNum = new byte[32];
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];

}
