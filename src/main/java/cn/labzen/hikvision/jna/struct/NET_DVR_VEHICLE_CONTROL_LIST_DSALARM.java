package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_OPERATE_INDEX_LEN;

/**
 * 黑白名单数据需要同步报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwDataIndex",
                       "sOperateIndex",
                       "byRes"})
public class NET_DVR_VEHICLE_CONTROL_LIST_DSALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 数据流水号（这个值返回设备当前接收到的数据的最后一个数据流水号,平台同步的时候从下一个流水号开始同步）
   */
  public int dwDataIndex;
  /**
   * 操作数（平台同步表流水号不会重复，用于增量更新，代表同步到同步表的某一条记录了，存在相机内存，重启后会清0） 2014-03-03
   */
  public byte[] sOperateIndex = new byte[MAX_OPERATE_INDEX_LEN];
  /**
   * 保留
   */
  public byte[] byRes = new byte[32];
}
