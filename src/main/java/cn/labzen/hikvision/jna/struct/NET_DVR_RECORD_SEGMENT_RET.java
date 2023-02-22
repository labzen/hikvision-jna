package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 录像段总大小查询结果结构体
 * <p/>
 * 设备是否支持录像段总大小查询或者支持的参数能力，可以通过设备能力集进行判断，对应CVR设备能力集(CVRAbility)，
 * 相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_ABILITY_INFO，节点：<GetSegmentRecordtotalSize>。
 */
@Structure.FieldOrder({"dwSize",
                       "dwRecordTotalSize",
                       "byRes"})
public class NET_DVR_RECORD_SEGMENT_RET extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 录像总大小，单位MB
   */
  public int dwRecordTotalSize;
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];
}
