package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.library.Hikvision;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NET_SDK_MAX_FILE_PATH;

/**
 * 组件库加载路径信息结构体
 * <p/>
 * 当组件库所在的HCNetSDKCom文件夹、HCNetSDK库的路径同可执行程序工作目录不同时，可以调用
 * {@link Hikvision#NET_DVR_SetSDKInitCfg(int, Pointer)} 接口配置指明HCNetSDKCom文件夹的路径
 * ，以保证组件库的正常加载。
 */
@Structure.FieldOrder({"sPath",
                       "byRes"})
public class NET_DVR_LOCAL_SDK_PATH extends Structure {

  /**
   * 组件库地址
   */
  public byte[] sPath = new byte[NET_SDK_MAX_FILE_PATH];
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];
}
