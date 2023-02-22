package cn.labzen.hikvision.jna.callback;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.win32.StdCallLibrary;

public interface FStdDataCallBack extends StdCallLibrary.StdCallCallback {

  /**
   * @param lRealHandle [out] 当前的预览句柄
   * @param dwDataType  [out] 数据类型
   *                    <ul>
   *                      <li>NET_DVR_SYSHEAD(1) // 系统头数据
   *                      <li>NET_DVR_STREAMDATA(2) // 音视频复合流数据
   *                      <li>NET_DVR_STD_VIDEODATA(4) // 标准视频流数据(标准264、MPEG4)
   *                      <li>NET_DVR_STD_AUDIODATA(5) // 标准音频流数据(G722音频数据)
   *                      <li>NET_DVR_PRIVATE_DATA(112) // 私有数据，包括智能信息叠加等
   *                      <li>其他 (0x00-G711U音频，0x04-G723音频，0x08-G711A音频，0x0b-PCM16音频，
   *                      0x0e-Mpeg(MP2L2)音频，0x12-G729音频，0x1A-MJPEG视频，0x68-AAC音频，等)
   *                      // 标准RTP的pyload类型，不做转换，码流解码显示时所有类型对应的数据都需要送入播放库
   *                    </ul>
   * @param pBuffer     [out] 存放数据的缓冲区指针
   * @param dwBufSize   [out] 缓冲区大小
   * @param pUser       [out] 用户数据
   */
  void invoke(NativeLong lRealHandle, int dwDataType, ByteByReference pBuffer, int dwBufSize, Pointer pUser);
}
