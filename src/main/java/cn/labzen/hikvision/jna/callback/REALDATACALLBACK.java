package cn.labzen.hikvision.jna.callback;

import cn.labzen.hikvision.jna.library.internal.Preview;
import cn.labzen.hikvision.jna.struct.NET_DVR_PREVIEWINFO;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;

public interface REALDATACALLBACK {

  /**
   * @param lPlayHandle [out] 当前的预览句柄，{@link Preview#NET_DVR_RealPlay_V40(int, NET_DVR_PREVIEWINFO, REALDATACALLBACK, Pointer)}的返回值
   * @param dwDataType  [out] 数据类型，取值：
   *                    <ul>
   *                      <li>NET_DVR_SYSHEAD(1) // 系统头数据
   *                      <li>NET_DVR_STREAMDATA(2) // 流数据（包括复合流或音视频分开的视频流数据）
   *                      <li>NET_DVR_AUDIOSTREAMDATA(3) // 音频数据
   *                      <li>NET_DVR_PRIVATE_DATA(112) // 私有数据,包括智能信息
   *                    </ul>
   * @param pBuffer     [out] 存放数据的缓冲区指针
   * @param dwBufSize   [out] 缓冲区大小
   * @param pUser       [out] 用户数据
   */
  void invoke(NativeLong lPlayHandle, int dwDataType, ByteByReference pBuffer, int dwBufSize, Pointer pUser);
}
