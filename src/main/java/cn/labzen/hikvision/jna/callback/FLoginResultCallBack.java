package cn.labzen.hikvision.jna.callback;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface FLoginResultCallBack extends StdCallLibrary.StdCallCallback {

  void invoke(NativeLong lUserID, int dwResult, Pointer lpDeviceinfo, Pointer pUser);
}
