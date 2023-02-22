package cn.labzen.hikvision.jna.callback;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface FExceptionCallBack extends StdCallLibrary.StdCallCallback {

  /**
   * @param dwType  [out] 异常或重连等消息的类型，见{@link ExceptionErrorCode}
   * @param lUserID [out] 登录ID
   * @param lHandle [out] 出现异常的相应类型的句柄
   * @param pUser   [out] 用户数据
   * @see ExceptionErrorCode
   */
  void invoke(int dwType, int lUserID, int lHandle, Pointer pUser);
}
