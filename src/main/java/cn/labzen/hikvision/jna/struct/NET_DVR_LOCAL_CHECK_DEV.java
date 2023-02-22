package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 设备在线巡检参数结构体
 * <p/>
 * <ul>
 *   <li>SDK按照该结构体中的时间间隔对设备进行自动巡检，巡检过程中如果连失败或者重连成功在
 *   NET_DVR_SetExceptionCallBack_V30 设置的异常消息回调函数中返回，对应异常消息类型为：
 *   EXCEPTION_EXCHANGE、RESUME_EXCHANGE。 </li>
 *   <li>推荐设置30s时间间隔、3次，即心跳间隔为1.5分钟。 </li>
 *   <li>通过NET_DVR_RemoteControl（命令：NET_DVR_CHECK_USER_STATUS）可以手动检测设备在线状态。 </li>
 * </ul>
 * TODO NET_DVR_SetExceptionCallBack_V30  NET_DVR_RemoteControl
 */
@Structure.FieldOrder({"dwCheckOnlineTimeout",
                       "dwCheckOnlineNetFailMax",
                       "byRes"})
public class NET_DVR_LOCAL_CHECK_DEV extends Structure {

  /**
   * 巡检时间间隔，单位：ms，取值范围：30s~120s，0表示用默认值(120s)，推荐设置30s
   */
  public short dwCheckOnlineTimeout;
  /**
   * 由于网络原因失败的最大累加次数，达到该次数，SDK才回调用户异常消息，0表示使用默认值1，推荐设置3次
   */
  public short dwCheckOnlineNetFailMax;
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];

}
