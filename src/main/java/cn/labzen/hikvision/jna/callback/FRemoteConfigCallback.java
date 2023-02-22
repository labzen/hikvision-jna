package cn.labzen.hikvision.jna.callback;

import cn.labzen.hikvision.jna.definition.RemoteConfigCommand;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface FRemoteConfigCallback extends StdCallLibrary.StdCallCallback {

  /**
   * @param dwType    [out] 配置状态，0-回调状态值, 1-回调进度值, 2-回调数据内容
   * @param lpBuffer  [out] 存放数据的缓冲区指针，具体内容跟dwType相关
   *                  <ul>
   *                    <li>dwType = 0, lpBuffer为状态值，内容为 1000-成功, 1001-处理中, 1002-失败</li>
   *                    <li>dwType = 1, lpBuffer为进度值，内容为表示进度(DWORD)</li>
   *                    <li>dwType = 2, lpBuffer对应结构体，参考{@link RemoteConfigCommand}</li>
   *                  </ul>
   * @param dwBufLen  [out] 缓冲区大小
   * @param pUserData [out] 用户数据
   */
  void invoke(int dwType, Pointer lpBuffer, int dwBufLen, Pointer pUserData);
}
