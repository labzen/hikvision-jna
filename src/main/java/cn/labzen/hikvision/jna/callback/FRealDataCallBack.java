package cn.labzen.hikvision.jna.callback;

import com.sun.jna.NativeLong;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.win32.StdCallLibrary;

public interface FRealDataCallBack extends StdCallLibrary.StdCallCallback {

  /**
   * @param lRealHandle [out] 当前的预览句柄
   * @param dwDataType  [out] 数据类型
   *                    <ul>
   *                      <li>NET_DVR_SYSHEAD(1) // 系统头数据
   *                      <li>NET_DVR_STREAMDATA(2) // 流数据（包括复合流或音视频分开的视频流数据）
   *                      <li>NET_DVR_AUDIOSTREAMDATA(3) // 音频数据
   *                      <li>NET_DVR_PRIVATE_DATA(112) // 私有数据,包括智能信息
   *                    </ul>
   * @param pBuffer     [out] 存放数据的缓冲区指针
   * @param dwBufSize   [out] 缓冲区大小
   * @param dwUser      [out] 用户数据
   */
  void invoke(NativeLong lRealHandle, int dwDataType, ByteByReference pBuffer, int dwBufSize, int dwUser);
}
