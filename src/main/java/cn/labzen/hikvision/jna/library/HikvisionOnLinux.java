package cn.labzen.hikvision.jna.library;

import cn.labzen.hikvision.jna.callback.FExceptionCallBack;
import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

/**
 * Linux SDK实现
 */
public interface HikvisionOnLinux extends Hikvision, Library {

  String LIBRARY_NAME = "hcnetsdk";

  /**
   * 2.6 - [异常消息回调]： 注册接收异常、重连等消息的窗口句柄或回调函数
   * <p/>
   * Linux下cbExceptionCallBack不能设置为NULL，否则将接收不到异常消息
   *
   * @param reserved1          [in] 保留，为null即可
   * @param reserved2          [in] 保留，为null即可
   * @param fExceptionCallBack [in] 接收异常消息的回调函数，回调当前异常的相关信息
   * @param pUser              [in] 用户数据，为null即可
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetExceptionCallBack_V30(int reserved1,
                                           Pointer reserved2,
                                           FExceptionCallBack fExceptionCallBack,
                                           Pointer pUser);

  /**
   * 5.1 - [实时预览]： 预览窗口发生改变时下发通知给播放库（仅Linux版本适用）
   * <p/>
   * Linux版本SDK开发，预览接口直接传入有效窗口句柄，在预览过程中，改变窗口大小时，需要调用该接口通知底层播放库去获取窗口大小。
   * Windows系统下开发不需要调用相关接口，可以自适应。
   *
   * @param lRealHandle [in] 预览句柄，NET_DVR_RealPlay_V40的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_ChangeWndResolution(NativeLong lRealHandle);
}
