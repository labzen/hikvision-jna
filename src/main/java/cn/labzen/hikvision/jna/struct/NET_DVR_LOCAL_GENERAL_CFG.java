package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 通用参数配置结构体
 */
@Structure.FieldOrder({"byExceptionCbDirectly",
                       "byNotSplitRecordFile",
                       "byResumeUpgradeEnable",
                       "byAlarmJsonPictureSeparate",
                       "byRes",
                       "i64FileSize",
                       "dwResumeUpgradeTimeout",
                       "byAlarmReconnectMode",
                       "byStdXmlBufferSize",
                       "byRes1"})
public class NET_DVR_LOCAL_GENERAL_CFG extends Structure {

  /**
   * 异常回调类型：0- 通过线程池异常回调，1- 直接异常回调给上层
   */
  public byte byExceptionCbDirectly;
  /**
   * 回放和预览中保存到本地录像文件不切片：0- 切片（默认），1- 不切片
   */
  public byte byNotSplitRecordFile;
  /**
   * 断网续传升级使能：0-关闭（默认），1-开启
   */
  public byte byResumeUpgradeEnable;
  /**
   * 控制JSON透传报警数据和图片是否分离，0-不分离，1-分离（分离后走COMM_ISAPI_ALARM回调返回）
   */
  public byte byAlarmJsonPictureSeparate;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
  /**
   * 文件最大限制字节数，单位：Byte，启用切片（{@link #byNotSplitRecordFile}为0）时，
   * 预览和回放保存的录像文件超过这个大小限制会自动切片，即新建文件进行保存
   */
  public long i64FileSize;
  /**
   * 断网续传重连超时时间，单位毫秒
   */
  public int dwResumeUpgradeTimeout;
  /**
   * 0-独立线程重连（默认） 1-线程池重连
   */
  public byte byAlarmReconnectMode;
  /**
   * 设置ISAPI透传接收缓冲区大小，1-1M 其他-默认
   */
  public byte byStdXmlBufferSize;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[234];

}
