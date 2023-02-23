package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.callback.FRealDataCallBack;
import cn.labzen.hikvision.jna.callback.FStdDataCallBack;
import cn.labzen.hikvision.jna.callback.REALDATACALLBACK;
import cn.labzen.hikvision.jna.definition.NetworkErrorCode;
import cn.labzen.hikvision.jna.library.HikvisionOnLinux;
import cn.labzen.hikvision.jna.struct.NET_DVR_JPEGPARA;
import cn.labzen.hikvision.jna.struct.NET_DVR_PREVIEWINFO;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

/**
 * 4 - 实时预览
 * <ul>
 *   <li>
 *     <b>实时预览</b>
 *     <ul>
 *       <li>{@link #NET_DVR_RealPlay_V40(int, NET_DVR_PREVIEWINFO, REALDATACALLBACK, Pointer)}</li>
 *       <li>{@link #NET_DVR_StopRealPlay(NativeLong)}</li>
 *       <li><s>NET_DVR_GetRealPlayerIndex</s></li>
 *       <li>NET_DVR_ChangeWndResolution in ({@link HikvisionOnLinux})</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>强制I帧</b>
 *     <ul>
 *       <li>{@link #NET_DVR_MakeKeyFrame(NativeLong, int)}</li>
 *       <li>{@link #NET_DVR_MakeKeyFrameSub(NativeLong, int)}</li>
 *       <li>NET_DVR_RemoteControl in {@link Configuration}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>强制刷新帧(Smart264)</b>
 *     <ul>
 *       <li><s>NET_DVR_STDControl</s></li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>视频参数配置</b>
 *     <ul>
 *       <li>{@link #NET_DVR_ClientGetVideoEffect(NativeLong, IntByReference, IntByReference, IntByReference, IntByReference)}</li>
 *       <li>{@link #NET_DVR_ClientSetVideoEffect(NativeLong, int, int, int, int)}</li>
 *       <li>{@link #NET_DVR_GetVideoEffect(NativeLong, NativeLong, IntByReference, IntByReference, IntByReference, IntByReference)}</li>
 *       <li>{@link #NET_DVR_SetVideoEffect(NativeLong, NativeLong, int, int, int, int)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>画图回调</b>
 *     <ul>
 *       <li><s>NET_DVR_RigisterDrawFun</s></li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>播放声音控制</b>
 *     <ul>
 *       <li>{@link #NET_DVR_SetAudioMode(int)}</li>
 *       <li>{@link #NET_DVR_OpenSound(NativeLong)}</li>
 *       <li>{@link #NET_DVR_CloseSound()}</li>
 *       <li>{@link #NET_DVR_OpenSoundShare(NativeLong)}</li>
 *       <li>{@link #NET_DVR_CloseSoundShare(NativeLong)}</li>
 *       <li>{@link #NET_DVR_Volume(NativeLong, int)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>实时数据回调和录像</b>
 *     <ul>
 *       <li>{@link #NET_DVR_SetRealDataCallBack(NativeLong, FRealDataCallBack, int)}</li>
 *       <li>{@link #NET_DVR_SetStandardDataCallBackEx(NativeLong, FStdDataCallBack, Pointer)}</li>
 *       <li><s>NET_DVR_SetESRealPlayCallBack</s></li>
 *       <li><s>NET_DVR_SaveRealData</s></li>
 *       <li>{@link #NET_DVR_SaveRealData_V30(NativeLong, int, String)}</li>
 *       <li>{@link #NET_DVR_StopSaveRealData(NativeLong)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>预览抓图</b>
 *     <ul>
 *       <li>{@link #NET_DVR_SetCapturePictureMode(int)}</li>
 *       <li>{@link #NET_DVR_CapturePictureBlock_New(NativeLong, String, int, IntByReference)}</li>
 *       <li>{@link #NET_DVR_CapturePictureBlock(NativeLong, String, int)} k}</li>
 *       <li>{@link #NET_DVR_CapturePicture(NativeLong, String)}</li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>设备抓图</b>
 *     <ul>
 *       <li>{@link #NET_DVR_CaptureJPEGPicture(NativeLong, NativeLong, NET_DVR_JPEGPARA, String)}</li>
 *       <li>{@link #NET_DVR_CaptureJPEGPicture_NEW(NativeLong, NativeLong, NET_DVR_JPEGPARA, Pointer, int, IntByReference)}</li>
 *     </ul>
 *   </li>
 * </ul>
 */
public interface Preview {

  /**
   * 4.1 - [实时预览]： 实时预览（支持多码流）
   * <p/>
   * <ul>
   *   <li>fRealDataCallBack_V30回调函数中不能执行可能会占用时间较长的接口或操作，
   *   不建议调用该SDK（HCNetSDK.dll）本身的接口。 </li>
   *   <li>该接口中的回调函数可以置为空，这样该函数将不回调码流数据给用户，不过用户仍可以通过接口
   *   NET_DVR_SetRealDataCallBack或NET_DVR_SetStandardDataCallBack注册捕获码流数据的回调函数以捕获码流数据。 </li>
   *   TODO NET_DVR_SetRealDataCallBack
   *   <li>客户端异常离线时，设备端对取流连接的保持时间为10秒。 </li>
   *   <li>Linux版本SDK开发，预览接口直接传入有效窗口句柄，在预览过程中，改变窗口大小时，
   *   需要调用NET_DVR_ChangeWndResolution通知底层播放库去获取窗口大小。Windows系统下开发不需要调用相关接口，
   *   可以自适应。 </li>
   * </ul>
   *
   * @param lUserID               [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpPreviewInfo         [in] 预览参数
   * @param fRealDataCallBack_V30 [in] 码流数据回调函数
   * @param pUser                 [in] 用户数据
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopRealPlay(NativeLong)}等函数的句柄参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_RealPlay_V40(int lUserID,
                                  NET_DVR_PREVIEWINFO lpPreviewInfo,
                                  REALDATACALLBACK fRealDataCallBack_V30,
                                  Pointer pUser);

  /**
   * 4.1 - [实时预览]： 停止预览
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADDSSDKPROC_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   * </ul>
   *
   * @param lRealHandle [in] 预览句柄，NET_DVR_RealPlay或者NET_DVR_RealPlay_V30的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopRealPlay(NativeLong lRealHandle);

  // 5.1 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 实时预览 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_GetRealPlayerIndex 接口暂不实现!!!!!!!!
  // NET_DVR_ChangeWndResolution 接口查看 HikvisionOnLinux
  // 5.1 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 实时预览 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

  /**
   * 4.2 - [强制I帧]： 主码流动态产生一个关键帧
   * <p/>
   * <ul>
   *   <li>根据设置的预览参数({@link NET_DVR_PREVIEWINFO})为主码流、子码流或者其他码流，
   *   调用不同的接口或命令强制设备生成I帧，该接口控制主码流强制I帧。
   *   子码流强制I帧通过接口{@link #NET_DVR_MakeKeyFrameSub(NativeLong, int)}实现。 </li>
   *   <li>其他码流（比如第三码流、虚拟码流）强制I帧通过接口NET_DVR_RemoteControl(命令：NET_DVR_MAKE_I_FRAME)实现，
   *   主码流、子码流强制I帧也可以通过该接口和命令来实现。</li>
   * </ul>
   *
   * @param lUserID  [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lChannel [in] 通道号
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_MakeKeyFrame(NativeLong lUserID, int lChannel);

  /**
   * 4.2 - [强制I帧]： 子码流动态产生一个关键帧
   * <p/>
   * <ul>
   *   <li>根据设置的预览参数({@link NET_DVR_PREVIEWINFO})为主码流、子码流或者其他码流，
   *   调用不同的接口或命令强制设备生成I帧，该接口控制子码流强制I帧。
   *   主码流强制I帧通过接口{@link #NET_DVR_MakeKeyFrame(NativeLong, int)}实现。 </li>
   *   <li>其他码流（比如第三码流、虚拟码流）强制I帧通过接口NET_DVR_RemoteControl(命令：NET_DVR_MAKE_I_FRAME)实现，
   *   主码流、子码流强制I帧也可以通过该接口和命令来实现。 </li>
   * </ul>
   *
   * @param lUserID  [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lChannel [in] 通道号
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_MakeKeyFrameSub(NativeLong lUserID, int lChannel);

  // 5.3 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 强制刷新帧(Smart264)  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_STDControl 接口暂不实现!!!!!!!!
  // 5.3 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 强制刷新帧(Smart264)  ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

  /**
   * 4.4 - [视频参数配置]： 获取预览视频显示参数
   * <p/>
   * 该接口需要在预览的前提下才能调用，但是获取的视频参数均为设备返回，是当前预览所对应通道的亮度、对比度等参数
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_ERRORDATA}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   * </ul>
   *
   * @param lRealHandle      [in] NET_DVR_RealPlay或者NET_DVR_RealPlay_V30的返回值
   * @param pBrightValue     [out] 亮度指针，取值范围[1,10]
   * @param pContrastValue   [out] 对比度指针，取值范围[1,10]
   * @param pSaturationValue [out] 饱和度指针，取值范围[1,10]
   * @param pHueValue        [out] 色度指针，取值范围[1,10]
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_ClientGetVideoEffect(NativeLong lRealHandle,
                                       IntByReference pBrightValue,
                                       IntByReference pContrastValue,
                                       IntByReference pSaturationValue,
                                       IntByReference pHueValue);

  /**
   * 4.4 - [视频参数配置]： 设置预览视频显示参数
   * <p/>
   * 该接口需要在预览的前提下才能调用，设置设备上对应通道的视频参数(远程配置设备上的参数，其他客户端相同通道的预览图像也会随之变化)。
   * <br/>
   * SDK4.0及以后版本中，当设置的亮度、对比度等的值超过或低于限制值时接口不返回失败，将取最接近的上下限限制值作为实际的参数值。
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_VERSIONNOMATCH}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_ERRORDATA}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   * </ul>
   *
   * @param lRealHandle       [in] NET_DVR_RealPlay或者NET_DVR_RealPlay_V30的返回值
   * @param dwBrightValue     [in] 亮度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @param dwContrastValue   [in] 对比度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @param dwSaturationValue [in] 饱和度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @param dwHueValue        [in] 色度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_ClientSetVideoEffect(NativeLong lRealHandle,
                                       int dwBrightValue,
                                       int dwContrastValue,
                                       int dwSaturationValue,
                                       int dwHueValue);

  /**
   * 4.4 - [视频参数配置]： 获取预览视频显示参数
   *
   * @param lUserID          [in] NET_DVR_Login或者NET_DVR_Login_V30的返回值
   * @param lChannel         [in] 通道号，起始通道号为1
   * @param pBrightValue     [out] 亮度指针，取值范围[1,10]
   * @param pContrastValue   [out] 对比度指针，取值范围[1,10]
   * @param pSaturationValue [out] 饱和度指针，取值范围[1,10]
   * @param pHueValue        [out] 色度指针，取值范围[1,10]
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetVideoEffect(NativeLong lUserID,
                                 NativeLong lChannel,
                                 IntByReference pBrightValue,
                                 IntByReference pContrastValue,
                                 IntByReference pSaturationValue,
                                 IntByReference pHueValue);

  /**
   * 4.4 - [视频参数配置]： 设置预览视频显示参数
   *
   * @param lUserID           [in] NET_DVR_Login或者NET_DVR_Login_V30的返回值
   * @param lChannel          [in] 通道号，起始通道号为1
   * @param dwBrightValue     [in] 亮度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @param dwContrastValue   [in] 对比度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @param dwSaturationValue [in] 饱和度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @param dwHueValue        [in] 色度，取值范围[1,10]，小于1的值默认为1，大于10的值默认为10
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetVideoEffect(NativeLong lUserID,
                                 NativeLong lChannel,
                                 int dwBrightValue,
                                 int dwContrastValue,
                                 int dwSaturationValue,
                                 int dwHueValue);

  // 5.5 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 画图回调 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_RigisterDrawFun 接口暂不实现!!!!!!!!
  // 5.5 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 画图回调 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

  /**
   * 4.6 - [播放声音控制]： 设置声音播放模式
   * <p/>
   * 不调用该接口设置声音播放模式，默认为独占播放
   *
   * @param dwMode [in] 声音播放模式：1－独占声卡，单路音频模式；2－共享声卡，多路音频模式
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetAudioMode(int dwMode);

  /**
   * 4.6 - [播放声音控制]： 独占声卡模式下开启声音
   * <p/>
   * 如果当前是共享模式播放，调用该接口将返回失败。以独占方式只能打开一路通道播放，即依次打开多个通道时仅打开最后一路
   *
   * @param lRealHandle [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_OpenSound(NativeLong lRealHandle);

  /**
   * 4.6 - [播放声音控制]： 独占声卡模式下关闭声音
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_AUDIO_MODE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PLAYERFAILED}</li>
   * </ul>
   *
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CloseSound();

  /**
   * 4.6 - [播放声音控制]： 共享声卡模式下开启声音
   *
   * @param lRealHandle [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_OpenSoundShare(NativeLong lRealHandle);

  /**
   * 4.6 - [播放声音控制]： 共享声卡模式下关闭声音
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_AUDIO_MODE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   * </ul>
   *
   * @param lRealHandle [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CloseSoundShare(NativeLong lRealHandle);

  /**
   * 4.6 - [播放声音控制]： 调节播放音量
   *
   * @param lRealHandle [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @param wVolume     [in] 音量，取值范围[0,0xffff]
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_Volume(NativeLong lRealHandle, int wVolume);

  /**
   * 4.7 - [实时数据回调和录像]： 注册回调函数，捕获实时码流数据
   * <p/>
   * <ul>
   *   <li>cbRealDataCallBack回调函数中不能执行可能会占用时间较长的接口或操作，不建议调用该SDK（HCNetSDK.dll）本身的接口。 </li>
   *   <li>此函数包括开始和停止用户处理SDK捕获的数据，当回调函数cbRealDataCallBack设为非NULL值时，表示回调和处理数据；
   *   当设为NULL时表示停止回调和处理数据。回调的第一个包是40个字节的文件头，供后续解码使用，之后回调的是压缩的码流。
   *   回调数据最大为256K字节。 </li>
   * </ul>
   *
   * @param lRealHandle        [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @param cbRealDataCallBack [in] 码流数据回调函数
   * @param dwUser             [in] 用户数据
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetRealDataCallBack(NativeLong lRealHandle, FRealDataCallBack cbRealDataCallBack, int dwUser);

  /**
   * 4.7 - [实时数据回调和录像]： 注册回调函数，捕获实时码流数据（标准码流）
   * <p/>
   * <ul>
   *   <li>cbStdDataCallBack回调函数中不能执行可能会占用时间较长的接口或操作，不建议调用该SDK（HCNetSDK.dll）本身的接口。 </li>
   *   <li>此函数包括开始和停止用户处理SDK捕获的数据，当回调函数cbStdDataCallBack设为非NULL值时，表示回调和处理数据；
   *   当设为NULL时表示停止回调和处理数据。回调的第一个包是40个字节的文件头，供后续解码使用，之后回调的是标准码流
   *   （含12字节的RTP头）。 </li>
   *   <li>标准码流回调需要设备支持。 </li>
   * </ul>
   *
   * @param lRealHandle       [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @param cbStdDataCallBack [in] 标准码流回调函数
   * @param dwUser            [in] 用户数据
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetStandardDataCallBackEx(NativeLong lRealHandle, FStdDataCallBack cbStdDataCallBack, Pointer dwUser);

  /**
   * 4.7 - [实时数据回调和录像]： 按指定的目标封装格式捕获数据并存放到指定的文件中
   * <p/>
   * <ul>
   *   <li>该接口目前仅对支持RTSP协议取流的设备有效。 </li>
   *   <li>V5.0.3.2或以后版本，通过该接口保存录像，保存的录像文件数据超过文件最大限制字节数（默认为1024MB），
   *   SDK会自动切片，即新建文件进行保存，文件名命名规则为“在接口传入的文件名基础上增加数字标识(例如：*_1.mp4、*_2.mp4)”。
   *   可以调用NET_DVR_GetSDKLocalCfg、NET_DVR_SetSDKLocalCfg(配置类型：NET_DVR_LOCAL_CFG_TYPE_GENERAL)获取和设置切片模式和
   *   文件最大限制字节数。 </li>
   * </ul>
   * TODO NET_DVR_GetSDKLocalCfg
   *
   * @param lRealHandle [in] NET_DVR_RealPlay_V40等接口的返回值
   * @param dwTransType [in] 存储的码流封装格式，1 - PS文件层，主要用于存储，也可用于传输， 2 - 3GPP文件层，用于存储
   * @param sFileName   [in] 文件路径指针，绝对路径，包括文件名
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SaveRealData_V30(NativeLong lRealHandle, int dwTransType, String sFileName);

  /**
   * 4.7 - [实时数据回调和录像]： 停止数据捕获
   *
   * @param lRealHandle [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopSaveRealData(NativeLong lRealHandle);

  // 5.7 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 实时数据回调和录像 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_SetESRealPlayCallBack 接口暂不实现!!!!!!!!
  // NET_DVR_SaveRealData 接口暂不实现!!!!!!!!
  // 5.7 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 实时数据回调和录像 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

  /**
   * 4.8 - [预览抓图]： 设置抓图模式
   * <p/>
   * 调用该接口设置抓图模式后，调用预览或者回放抓图接口可抓取相应格式的图片。如果抓图模式为JPEG模式，抓取的是JPEG图片，保存路径后缀应为.jpg，例如：sPicFileName="D:\\test
   * .jpg"；如果抓图模式为BMP模式，抓取的是BMP图片，保存路径后缀应为.bmp，例如：sPicFileName="D:\\test.bmp"。
   *
   * @param dwCaptureMode [in] 抓图模式，0 - BMP模式， 1 - JPEG模式
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetCapturePictureMode(int dwCaptureMode);

  /**
   * 4.8 - [预览抓图]： 预览时抓图并保存在指定内存中
   * <p/>
   * 该接口为预览阻塞模式抓图，预览接口必须传入有效的窗口句柄，正常解码显示的时候才能调用该接口进行抓图。
   * 图片数据格式支持BMP和JPEG两种，通过{@link #NET_DVR_SetCapturePictureMode(int)}可以设置数据格式
   *
   * @param iRealHandle    [in] 预览句柄，NET_DVR_RealPlay_V40的返回值
   * @param pPicBuf        [in] 保存图片数据的缓冲区
   * @param dwPicSize      [in] 缓冲区大小，分配的缓冲区内存必须大于等于图片数据的大小
   * @param lpSizeReturned [out] 返回图片数据的实际大小
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CapturePictureBlock_New(NativeLong iRealHandle,
                                          String pPicBuf,
                                          int dwPicSize,
                                          IntByReference lpSizeReturned);

  /**
   * 4.8 - [预览抓图]： 预览时抓图并保存成图片文件
   * <p/>
   * 该接口为预览阻塞模式抓图，预览接口必须传入有效的窗口句柄，正常解码显示的时候才能调用该接口进行抓图。图片数据格式支持BMP和JPEG两种，
   * 通过{@link #NET_DVR_SetCapturePictureMode(int)}可以设置数据格式，不同的格式保存文件名使用不同的后缀（.bmp或者.jpg）。
   *
   * @param iRealHandle  [in] 预览句柄，NET_DVR_RealPlay_V40的返回值
   * @param sPicFileName [in] 保存图片的文件路径，包含文件名，比如："D:/test.bmp"或"D:/test.jpg"
   * @param dwTimeOut    [in] 超时时间，目前无效
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CapturePictureBlock(NativeLong iRealHandle, String sPicFileName, int dwTimeOut);

  /**
   * 4.8 - [预览抓图]： 预览时，单帧数据捕获并保存成图片
   * <p/>
   * <ul>
   *   <li>在调用该接口之前可以调用{@link #NET_DVR_SetCapturePictureMode(int)}设置抓图模式，默认为BMP模式。</li>
   *   <li>如果抓图模式为BMP模式，抓取的是BMP图片，保存路径后缀应为.bmp，例如：sPicFileName="D:\\test.bmp"；
   *   如果抓图模式为JPEG模式，抓取的是JPEG图片，保存路径后缀应为.jpg，例如：sPicFileName="D:\\test.jpg"。 </li>
   *   <li>若设备的当前分辨率为2CIF，播放库做了相关处理，抓取的图像为4CIF。 </li>
   * </ul>
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   * </ul>
   *
   * @param iRealHandle  [in] NET_DVR_RealPlay或NET_DVR_RealPlay_V30的返回值
   * @param sPicFileName [in] 保存图象的文件路径（包括文件名）。路径长度和操作系统有关，sdk不做限制，windows默认路径长度小于等于256字节（包括文件名在内）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CapturePicture(NativeLong iRealHandle, String sPicFileName);

  /**
   * 4.9 - [设备抓图]： 单帧数据捕获并保存成JPEG图
   * <p/>
   * <ul>
   *   <li>该接口用于设备的单帧数据捕获，并保存成JPEG图片文件。JPEG抓图功能或者抓图分辨率需要设备支持，如果不支持接口返回失败，错误号23或者29。 </li>
   *   <li>对于DVR、NVR设备，参数wPicQuality支持的分辨率值可通过NET_DVR_GetDeviceAbility获取能力集类型PIC_CAPTURE_ABILITY获取(NET_DVR_COMPRESSIONCFG_ABILITY)得到。 </li>
   *   <li>对接网络摄像机、门禁主机等设备，设备是否支持JPEG抓图功能或者支持的参数能力，可以通过设备能力集进行判断，
   *   对应设备JPEG抓图能力集(JpegCaptureAbility)，相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_JPEG_CAP_ABILITY，节点：<ManualCapture>。 </li>
   *   <li>wPicSize设为2抓取的图片分辨率是4CIF还是D1由设备决定，一般为4CIF(P制:704*576/N制:704*480)。 </li>
   * </ul>
   * TODO NET_DVR_GetDeviceAbility
   *
   * @param lUserID      [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lChannel     [in] 通道号
   * @param lpJpegPara   [in] JPEG图像参数
   * @param sPicFileName [in] 保存JPEG图的文件路径（包括文件名）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CaptureJPEGPicture(NativeLong lUserID,
                                     NativeLong lChannel,
                                     NET_DVR_JPEGPARA lpJpegPara,
                                     String sPicFileName);

  /**
   * 4.9 - [设备抓图]： 单帧数据捕获并保存成JPEG存放在指定的内存空间中
   * <p/>
   * <ul>
   *   <li>该接口用于设备的单帧数据捕获，并保存到内存中。JPEG抓图功能或者抓图分辨率需要设备支持，如果不支持接口返回失败，错误号23或者29。 </li>
   *   <li>对于DVR、NVR设备，参数wPicQuality支持的分辨率值可通过NET_DVR_GetDeviceAbility获取能力集类型PIC_CAPTURE_ABILITY获取(NET_DVR_COMPRESSIONCFG_ABILITY)得到。 </li>
   *   <li>对接网络摄像机、门禁主机等设备，设备是否支持JPEG抓图功能或者支持的参数能力，可以通过设备能力集进行判断，
   *   对应设备JPEG抓图能力集(JpegCaptureAbility)，相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_JPEG_CAP_ABILITY，节点：<ManualCapture>。 </li>
   *   <li>wPicSize设为2抓取的图片分辨率是4CIF还是D1由设备决定，一般为4CIF(P制:704*576/N制:704*480)。 </li>
   * </ul>
   * TODO NET_DVR_GetDeviceAbility
   *
   * @param lUserID        [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lChannel       [in] 通道号
   * @param lpJpegPara     [in] JPEG图像参数
   * @param sJpegPicBuffer [in] 保存JPEG数据的缓冲区
   * @param dwPicSize      [in] 输入缓冲区大小
   * @param lpSizeReturned [out] 返回图片数据的大小
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CaptureJPEGPicture_NEW(NativeLong lUserID,
                                         NativeLong lChannel,
                                         NET_DVR_JPEGPARA lpJpegPara,
                                         Pointer sJpegPicBuffer,
                                         int dwPicSize,
                                         IntByReference lpSizeReturned);

}
