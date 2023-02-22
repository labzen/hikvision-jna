package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 录像完整性检测结果结构体
 * <p/>
 * 设备是否支持录像完整性检测或者支持的参数能力，可以通过设备能力集进行判断，对应CVR设备能力集(CVRAbility)，
 * 相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_ABILITY_INFO，节点：<RecordCheck>。
 */
@Structure.FieldOrder({"dwSize",
                       "byRecordNotComplete",
                       "byRes1",
                       "struBeginTime",
                       "struEndTime",
                       "byRes"})
public class NET_DVR_RECORD_CHECK_RET extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 录像是否完整，0--完整,1--不完整
   */
  public byte byRecordNotComplete;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * 缺失录像的开始时间，byRecordNotComplete参数值和{@link NET_DVR_RECORD_CHECK_COND}查询条件中的byCheckType都为1时有效
   */
  public NET_DVR_TIME_EX struBeginTime;
  /**
   * 缺失录像的结束时间，byRecordNotComplete参数值和{@link NET_DVR_RECORD_CHECK_COND}查询条件中的byCheckType都为1时有效
   */
  public NET_DVR_TIME_EX struEndTime;
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
