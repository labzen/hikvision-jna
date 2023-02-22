package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 人脸抓拍人员统计结果结构体
 * <ul>
 *   <li>设备不支持报警监听方式获取统计结果，仅支持报警布防方式，目前设备15分钟默认上传一次，上传间隔时间不可设置。 </li>
 *   <li>设备是否支持人员统计功能或者支持的参数能力，可以通过设备能力集进行判断，对应智能通道分析能力集(VcaChanAbility)，
 *   相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_ABILITY_INFO，节点：<FaceCaptureStatistics>。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "struStartTime",
                       "struEndTime",
                       "byStatType",
                       "byRes",
                       "dwPeopleNum",
                       "struAgeGroupParam",
                       "struSexGroupParam",
                       "struProgramInfo",
                       "byRes1"})
public class NET_DVR_FACECAPTURE_STATISTICS_RESULT extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 间隔开始时间
   */
  public NET_DVR_TIME_EX struStartTime;
  /**
   * 间隔结束时间
   */
  public NET_DVR_TIME_EX struEndTime;
  /**
   * 数据类型统计：Bit0-年龄段有效，Bit1-性别有效，Bit2-人数有效
   */
  public byte byStatType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[7];
  /**
   * 人数统计
   */
  public int dwPeopleNum;
  /**
   * 年龄段人数统计
   */
  public NET_DVR_AGEGROUP_PARAM struAgeGroupParam;
  /**
   * 性别人数统计
   */
  public NET_DVR_SEXGROUP_PARAM struSexGroupParam;
  /**
   * 节目信息
   */
  public NET_DVR_PROGRAM_INFO struProgramInfo;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[76];
}
