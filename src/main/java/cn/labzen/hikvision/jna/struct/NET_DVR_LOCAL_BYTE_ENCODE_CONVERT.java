package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.callback.CHAR_ENCODE_CONVERT;
import cn.labzen.hikvision.jna.library.Hikvision;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * 字符编码转换参数结构体
 * <p/>
 * <ul>
 *  <li>回调函数的返回值：-1表示失败，0表示成功（内存足够存放转换以后的字符串）。</li>
 *  <li>设备的字符编码类型在登录接口返回，对应NET_DVR_DEVICEINFO_V40结构体中的参数byCharEncodeType。
 *  SDK内部需要字符编码转换时，SDK默认使用libiconv库进行类型转换。如果不想使用libiconv编码库，
 *  可以调用 {@link Hikvision#NET_DVR_SetSDKLocalCfg(int, Pointer)} (类型: NET_SDK_LOCAL_CFG_TYPE_BYTE_ENCODE)
 *  设置字符转码回调函数，告知SDK用户自己的字符编码接口，然后SDK将使用用户提供的字符编码接口进行字符串处理。 </li>
 * </ul>
 * TODO NET_DVR_DEVICEINFO_V40
 */
@Structure.FieldOrder({"fnCharConvertCallBack",
                       "byRes"})
public class NET_DVR_LOCAL_BYTE_ENCODE_CONVERT extends Structure {

  /**
   * 字符编码转换回调函数
   */
  public CHAR_ENCODE_CONVERT fnCharConvertCallBack;
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];

}
