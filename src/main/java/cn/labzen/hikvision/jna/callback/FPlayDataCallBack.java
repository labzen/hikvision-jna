package cn.labzen.hikvision.jna.callback;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.win32.StdCallLibrary;

public interface FPlayDataCallBack extends StdCallLibrary.StdCallCallback {

  /**
   * @param lPlayHandle [out] 当前的录像播放句柄
   * @param dwDataType  [out] 数据类型
   *                    <ul>
   *                    <li>NET_DVR_SYSHEAD = 1 //系统头数据 </li>
   *                    <li>NET_DVR_STREAMDATA = 2 //流数据（包括复合流或音视频分开的视频流数据） </li>
   *                    <li>NET_DVR_CHANGE_FORWARD = 10 //码流改变为正放 </li>
   *                    <li>NET_DVR_CHANGE_REVERSE = 11 //码流改变为倒放 </li>
   *                    </ul>
   * @param pBuffer     [out] 存放数据的缓冲区指针
   * @param dwBufSize   [out] 缓冲区大小
   * @param pUser       [out] 用户数据
   */
  void invoke(NativeLong lPlayHandle, int dwDataType, ByteByReference pBuffer, int dwBufSize, Pointer pUser);
}
