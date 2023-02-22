package cn.labzen.hikvision.jna.callback;

import cn.labzen.hikvision.jna.struct.NET_DVR_PACKET_INFO_EX;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface FPlayESCallBack extends StdCallLibrary.StdCallCallback {

  /**
   * @param lPlayHandle  [out] 当前的录像播放句柄
   * @param struPackInfo [in] 回放裸码流数据回调函数，回调获取每一帧裸码流数据
   * @param pUser        [out] 用户数据
   */
  void invoke(NativeLong lPlayHandle, NET_DVR_PACKET_INFO_EX struPackInfo, Pointer pUser);
}
