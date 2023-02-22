package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.definition.NetworkErrorCode;
import cn.labzen.hikvision.jna.definition.SdkInitConfigurationType;
import cn.labzen.hikvision.jna.struct.NET_DVR_INIT_CFG_ABILITY;
import cn.labzen.hikvision.jna.struct.NET_DVR_LOCAL_SDK_PATH;
import com.sun.jna.Pointer;

/**
 * 1- SDK初始化
 * <ul>
 *   <li>{@link #NET_DVR_SetSDKInitCfg(int, Pointer)}</li>
 *   <li>{@link #NET_DVR_Init()}</li>
 *   <li>{@link #NET_DVR_Cleanup()}</li>
 * </ul>
 */
public interface SdkInit {

  /**
   * 1 - [SDK初始化]： 设置SDK初始化参数。
   * <p/>
   * <b>该接口需要在初始化接口 {@link #NET_DVR_Init()} 之前调用，通过初始化接口检查SDK依赖库和SDK能力。 </b>
   * <p/>
   * <ul>
   *   <li>enumType = {@link SdkInitConfigurationType#NET_SDK_INIT_CFG_ABILITY}，对应结构体：{@link NET_DVR_INIT_CFG_ABILITY}</li>
   *   <li>enumType = {@link SdkInitConfigurationType#NET_SDK_INIT_CFG_SDK_PATH}，对应结构体：{@link NET_DVR_LOCAL_SDK_PATH}</li>
   * </ul>
   *
   * @param enumType [in] 初始化参数类型，不同的取值对应不同的参数，参考{@link SdkInitConfigurationType}
   * @param lpInBuff [in] 输入参数，不同的参数类型，输入参数对应不同的结构
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetSDKInitCfg(int enumType, Pointer lpInBuff);

  /**
   * 1 - [SDK初始化]： 初始化SDK，调用其他SDK函数的前提。
   * <p/>
   * <b>SDK初始化之前可以调用 {@link #NET_DVR_SetSDKInitCfg(int, Pointer)} 设置SDK支持的登录布防连接个数、设置组件库加载路径（仅Linux版本支持）等初始化参数。</b>
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_GETLOCALIPANDMACFAIL}</li>
   * </ul>
   *
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_Init();

  /**
   * 1 - [SDK初始化]： 释放SDK资源，在程序结束之前调用
   * <p/>
   * 在调用 {@link #NET_DVR_Cleanup()} 的时候，不能同时调用其他任何SDK接口。 {@link #NET_DVR_Init()}
   * 和 {@link #NET_DVR_Cleanup()} 需要配对使用，即程序里面调用多少次 {@link #NET_DVR_Init()}
   * ，退出时就需要调用多少次 {@link #NET_DVR_Cleanup()}
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   * </ul>
   *
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_Cleanup();

}
