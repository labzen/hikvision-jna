package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef;

/**
 * 按文件名回放参数结构体
 */
@Structure.FieldOrder({"szFileName",
                       "byDownload",
                       "byRes1",
                       "hWnd",
                       "struAddr",
                       "byRes2"})
public class NET_DVR_PLAY_BY_NAME_PARA extends Structure {

  /**
   * 回放文件名
   */
  public byte[] szFileName = new byte[100];
  /**
   * 是否下载 0-否，1-是
   */
  public byte byDownload;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[127];
  /**
   * 回放的窗口句柄，若置为空，SDK仍能收到码流数据，但不解码显示
   */
  public WinDef.HWND hWnd;
  /**
   * 文件所在集群中CS地址信息，该信息文件查找时会返回；如果为空表示本登录地址
   */
  public NET_DVR_ADDRESS struAddr;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[256];
}
