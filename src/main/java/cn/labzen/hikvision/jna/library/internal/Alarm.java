package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.callback.MSGCallBack;
import com.sun.jna.Pointer;

/**
 * 10 - 报警布防/监听
 * <ul>
 *   <li>
 *     <b>报警布撤防</b>
 *     <ul>
 *       <li>
 *         <b>设置报警灯信息上传的回调函数</b>
 *         <ul>
 *           <li>{@link #NET_DVR_SetDVRMessageCallBack_V50(int, MSGCallBack, Pointer)}</li>
 *         </ul>
 *       </li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>报警监听</b>
 *     <ul>
 *     </ul>
 *   </li>
 * </ul>
 */
public interface Alarm {

  /**
   * 注册回调函数，接收报警消息
   * <p/>
   * V30、V31的接口设置报警回调函数是全局唯一的，注册多次会覆盖之前的，只有最后设置的回调函数有效，
   * 所有设备报警信息都是在同一个回调函数中返回的，通过报警设备信息（pAlarmInfo）区分是哪台设备；通过V50接口设置报警回调函数，
   * 支持设置多路不同的回调函数，最大支持16路，通过索引进行区分，所有的设备报警信息会同时在设置的各个回调函数里面返回，
   * 返回相同的数据，同样需要通过报警设备信息（pAlarmInfo）区分是哪台设备。
   *
   * @param iIndex           通过V50接口设置报警回调函数，支持设置多路不同的回调函数，最大支持16路，通过索引进行区分，所有的设备报警信息会同时在设置的各个回调函数里面返回
   * @param fMessageCallBack 报警信息回调函数
   * @param pUser            用户数据
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetDVRMessageCallBack_V50(int iIndex, MSGCallBack fMessageCallBack, Pointer pUser);
}
