package cn.labzen.hikvision.jna.library;

import cn.labzen.hikvision.jna.callback.FExceptionCallBack;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

/**
 * Windows SDK实现
 */
public interface HikvisionOnWindows extends Hikvision, StdCallLibrary {

  String LIBRARY_NAME = "HCNetSDK";

  /**
   * 2.6 - [异常消息回调]： 注册接收异常、重连等消息的窗口句柄或回调函数
   * <p/>
   * Windows下该函数的hWnd和cbExceptionCallBack不能同时为NULL，否则将接收不到异常消息
   *
   * @param nMessage           [in] 消息，为null即可
   * @param hWnd               [in] 接收异常信息消息的窗口句柄，为null即可
   * @param fExceptionCallBack [in] 接收异常消息的回调函数，回调当前异常的相关信息
   * @param pUser              [in] 用户数据，为null即可
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetExceptionCallBack_V30(int nMessage,
                                           int hWnd,
                                           FExceptionCallBack fExceptionCallBack,
                                           Pointer pUser);

}
