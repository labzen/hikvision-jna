package cn.labzen.hikvision.jna.library.internal;

import cn.labzen.hikvision.jna.callback.FPlayDataCallBack;
import cn.labzen.hikvision.jna.callback.FPlayESCallBack;
import cn.labzen.hikvision.jna.definition.NetworkErrorCode;
import cn.labzen.hikvision.jna.definition.RecordBackupStatus;
import cn.labzen.hikvision.jna.definition.RecordFileType;
import cn.labzen.hikvision.jna.definition.RecordPlayCommand;
import cn.labzen.hikvision.jna.struct.*;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;

/**
 * 6 - 远程回放
 * <ul>
 *   <li>
 *     <b>远程录像回放、下载、锁定及备份</b>
 *     <ul>
 *       <li>
 *         <b>即时刷新录像索引</b>
 *         <ul>
 *           <li>{@link #NET_DVR_UpdateRecordIndex(NativeLong, int)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>通道录像起止时间查询</b>
 *         <ul>
 *           <li>{@link #NET_DVR_InquiryRecordTimeSpan(NativeLong, int, NET_DVR_RECORD_TIME_SPAN_INQUIRY, NET_DVR_RECORD_TIME_SPAN)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>月历录像查询</b>
 *         <ul>
 *           <li>NET_DVR_GetDeviceConfig in {@link Configuration}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>录像文件的查找</b>
 *         <ul>
 *           <li>{@link #NET_DVR_FindFile_V50(NativeLong, NET_DVR_FILECOND_V50)}</li>
 *           <li>{@link #NET_DVR_FindNextFile_V50(NativeLong, NET_DVR_FINDDATA_V50)}</li>
 *           <li>{@link #NET_DVR_FindClose_V30(NativeLong)}</li>
 *           <li>{@link #NET_DVR_FindFileByCard(NativeLong, NativeLong, int, int, ByteByReference, NET_DVR_TIME, NET_DVR_TIME)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>事件录像查找</b>
 *         <ul>
 *           <li>{@link #NET_DVR_FindFileByEvent_V50(NativeLong, NET_DVR_SEARCH_EVENT_PARAM_V50)}</li>
 *           <li>{@link #NET_DVR_FindNextEvent_V50(NativeLong, NET_DVR_SEARCH_EVENT_RET_V50)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>区域移动侦测智能搜索（后检索）</b>
 *         <ul>
 *           <li>{@link #NET_DVR_SmartSearch_V40(NativeLong, NET_DVR_SMART_SEARCH_PARAM_V40)}</li>
 *           <li>{@link #NET_DVR_SearchNextInfo(NativeLong, NET_DVR_SMART_SEARCH_RET)}</li>
 *           <li>{@link #NET_DVR_StopSearch(NativeLong)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>回放录像文件</b>
 *         <ul>
 *           <li>{@link #NET_DVR_PlayBackByName(NativeLong, String, WinDef.HWND)}</li>
 *           <li>{@link #NET_DVR_PlayBackByName_V50(NativeLong, NET_DVR_PLAY_BY_NAME_PARA)}</li>
 *           <li>{@link #NET_DVR_PlayBackByTime_V40(NativeLong, NET_DVR_VOD_PARA)}</li>
 *           <li>{@link #NET_DVR_PlayBackByTime_V50(NativeLong, NET_DVR_VOD_PARA_V50)}</li>
 *           <li>{@link #NET_DVR_PlayBackReverseByName(NativeLong, String, WinDef.HWND)}</li>
 *           <li>{@link #NET_DVR_PlayBackReverseByName_V50(NativeLong, NET_DVR_PLAY_BY_NAME_PARA)}</li>
 *           <li>{@link #NET_DVR_PlayBackReverseByTime_V40(NativeLong, WinDef.HWND, NET_DVR_PLAYCOND)}</li>
 *           <li>{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}</li>
 *           <li>{@link #NET_DVR_StopPlayBack(NativeLong)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>回放数据回调和录像</b>
 *         <ul>
 *           <li>{@link #NET_DVR_PlayBackSaveData(NativeLong, String)}</li>
 *           <li>{@link #NET_DVR_StopPlayBackSave(NativeLong)}</li>
 *           <li>{@link #NET_DVR_SetPlayDataCallBack_V40(NativeLong, FPlayDataCallBack, Pointer)}</li>
 *           <li>{@link #NET_DVR_SetPlayBackESCallBack(NativeLong, FPlayESCallBack, Pointer)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>录像标签查找</b>
 *         <ul>
 *           <li>{@link #NET_DVR_FindRecordLabel(NativeLong, NET_DVR_FIND_LABEL)}</li>
 *           <li>{@link #NET_DVR_FindNextLabel(NativeLong, NET_DVR_FINDLABEL_DATA)}</li>
 *           <li>{@link #NET_DVR_StopFindLabel(NativeLong)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>回放录像标签操作</b>
 *         <ul>
 *           <li>{@link #NET_DVR_InsertRecordLabel(NativeLong, NET_DVR_RECORD_LABEL, NET_DVR_LABEL_IDENTIFY)}</li>
 *           <li>{@link #NET_DVR_ModifyRecordLabel(NativeLong, NET_DVR_MOD_LABEL_PARAM)}</li>
 *           <li>{@link #NET_DVR_DelRecordLabel(NativeLong, NET_DVR_DEL_LABEL_PARAM)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>回放抓图、OSD获取等其他操作</b>
 *         <ul>
 *           <li>{@link #NET_DVR_SetCapturePictureMode(int)}</li>
 *           <li>{@link #NET_DVR_CapturePlaybackPictureBlock_New(NativeLong, String, int, IntByReference)}</li>
 *           <li>{@link #NET_DVR_PlayBackCaptureFile(NativeLong, String)}</li>
 *           <li>{@link #NET_DVR_GetPlayBackOsdTime(NativeLong, NET_DVR_TIME)}</li>
 *           <li>{@link #NET_DVR_RefreshPlay(NativeLong)}</li>
 *           <li>{@link #NET_DVR_GetPlayBackPlayerIndex(NativeLong)}</li>
 *           <li><s>NET_DVR_RigisterPlayBackDrawFun</s></li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>下载录像文件</b>
 *         <ul>
 *           <li>{@link #NET_DVR_GetFileByName(NativeLong, String, String)}</li>
 *           <li>{@link #NET_DVR_GetFileByTime_V40(NativeLong, String, NET_DVR_PLAYCOND)}</li>
 *           <li>NET_DVR_PlayBackControl_V40 in 7.1.7</li>
 *           <li>{@link #NET_DVR_StopGetFile(NativeLong)}</li>
 *           <li>{@link #NET_DVR_GetDownloadPos(NativeLong)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>录像锁定和解锁</b>
 *         <ul>
 *           <li>{@link #NET_DVR_LockFileByName(NativeLong, String)}</li>
 *           <li>{@link #NET_DVR_UnlockFileByName(NativeLong, String)}</li>
 *           <li>{@link #NET_DVR_LockFileByTime(NativeLong, NET_DVR_TIME_LOCK, NET_DVR_LOCK_RETURN)}</li>
 *           <li>{@link #NET_DVR_UnLockFileByTime(NativeLong, NET_DVR_TIME_LOCK, NET_DVR_LOCK_RETURN)}</li>
 *           <li>{@link #NET_DVR_LockStreamFileByTime(NativeLong, NET_DVR_STREAM_TIME_LOCK, NET_DVR_LOCK_RETURN)}</li>
 *           <li>{@link #NET_DVR_UnlockStreamFileByTime(NativeLong, NET_DVR_STREAM_TIME_LOCK, NET_DVR_LOCK_RETURN)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>远程控制录像备份</b>
 *         <ul>
 *           <li>{@link #NET_DVR_GetDiskList(NativeLong, NET_DVR_DISKABILITY_LIST)}</li>
 *           <li>{@link #NET_DVR_BackupByName(NativeLong, NET_DVR_BACKUP_NAME_PARAM)}</li>
 *           <li>{@link #NET_DVR_BackupByTime(NativeLong, NET_DVR_BACKUP_TIME_PARAM)}</li>
 *           <li>{@link #NET_DVR_GetBackupProgress(NativeLong, IntByReference)}</li>
 *           <li>{@link #NET_DVR_StopBackup(NativeLong)}</li>
 *         </ul>
 *       </li>
 *     </ul>
 *   </li>
 *   <li>
 *     <b>远程图片查找、回放及备份</b>
 *     <ul>
 *       <li>
 *         <b>图片查找</b>
 *         <ul>
 *           <li>{@link #NET_DVR_FindPicture(NativeLong, NET_DVR_FIND_PICTURE_PARAM)}</li>
 *           <li>{@link #NET_DVR_FindNextPicture_V50(NativeLong, NET_DVR_FIND_PICTURE_V50)}</li>
 *           <li>{@link #NET_DVR_CloseFindPicture(NativeLong)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>图片智能搜索(后检索)</b>
 *         <ul>
 *           <li>{@link #NET_DVR_SmartSearchPicture(NativeLong, NET_DVR_SMART_SEARCH_PIC_PARA)}</li>
 *           <li>{@link #NET_DVR_FindNextSmartPicture(NativeLong, NET_DVR_SMART_SEARCH_PIC_RET)}</li>
 *           <li>{@link #NET_DVR_CloseSmartSearchPicture(NativeLong)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>图片回放下载</b>
 *         <ul>
 *           <li>{@link #NET_DVR_GetPicture_V50(NativeLong, NET_DVR_PIC_PARAM)}</li>
 *           <li>{@link #NET_DVR_GetPicture(NativeLong, String, String)}</li>
 *         </ul>
 *       </li>
 *       <li>
 *         <b>远程控制图片备份</b>
 *         <ul>
 *           <li>NET_DVR_GetDiskList at 7.1.14</li>
 *           <li>{@link #NET_DVR_BackupPicture(NativeLong, NET_DVR_BACKUP_PICTURE_PARAM)}</li>
 *           <li>NET_DVR_GetBackupProgress at 7.1.14</li>
 *           <li>NET_DVR_StopBackup at 7.1.14</li>
 *         </ul>
 *       </li>
 *     </ul>
 *   </li>
 * </ul>
 */
public interface RemotePlayback {

  /**
   * 6.1.1 - [远程录像回放、下载、锁定及备份 -> 即时刷新录像索引]： 即时刷新录像索引
   * <p/>
   * 和通道相关，需要设备支持，设备默认每2分钟刷新一次
   *
   * @param lUserID   [in]NET_DVR_Login_V40等登录接口的返回值
   * @param dwChannel [in]通道号
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_UpdateRecordIndex(NativeLong lUserID, int dwChannel);

  /**
   * 6.1.2 - [远程录像回放、下载、锁定及备份 -> 通道录像起止时间查询]： 获取通道录像起止时间
   *
   * @param lUserID   [in]NET_DVR_Login_V40等登录接口的返回值
   * @param dwChannel [in]通道号
   * @param lpInquiry [in]通道录像起止时间查询条件
   * @param lpResult  [out]通道录像起止时间查询结果
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_InquiryRecordTimeSpan(NativeLong lUserID,
                                        int dwChannel,
                                        NET_DVR_RECORD_TIME_SPAN_INQUIRY lpInquiry,
                                        NET_DVR_RECORD_TIME_SPAN lpResult);

  // 7.1.3 ↓↓↓↓↓↓↓↓↓ 远程录像回放、下载、锁定及备份 -> 月历录像查询 ↓↓↓↓↓↓↓↓↓↓↓
  // NET_DVR_GetDeviceConfig 接口查看 Configuration
  // 7.1.3 ↑↑↑↑↑↑↑↑↑ 远程录像回放、下载、锁定及备份 -> 月历录像查询 ↑↑↑↑↑↑↑↑↑↑↑

  /**
   * 6.1.4 - [远程录像回放、下载、锁定及备份 -> 录像文件的查找]： 根据文件类型、时间查找设备录像文件
   * <p/>
   * 该接口指定了要查找的录像文件的信息，调用成功后，就可以调用NET_DVR_FindNextFile_V40接口来获取文件信息
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGHPRI}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CHANNEL_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NODISK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID   [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pFindCond [in] 欲查找的文件信息结构
   * @return -1表示失败，其他值作为{@link #NET_DVR_FindClose_V30(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_FindFile_V50(NativeLong lUserID, NET_DVR_FILECOND_V50 pFindCond);

  /**
   * 6.1.4 - [远程录像回放、下载、锁定及备份 -> 录像文件的查找]： 逐个获取查找到的文件信息
   * <p/>
   * 在调用该接口获取查找文件之前，必须先调用NET_DVR_FindFile_V40得到当前的查找句柄。此接口用于获取一条已查找到的文件信息，若要获取全部的已查找到的文件信息，需要循环调用此接口。通过此接口可以同时获取到与当前录像文件相关的卡号信息和文件是否被锁定的信息。
   * <p/>
   * <b>每次可查询文件最大个数为4000</b>
   *
   * @param lFindHandle [in] 文件查找句柄，{@link #NET_DVR_FindFile_V50(NativeLong, NET_DVR_FILECOND_V50)}或者NET_DVR_FindFile_V30的返回值
   * @param lpFindData  [out] 保存文件信息的指针
   * @return -1表示失败，其他值表示当前的获取状态等信息，详见下表。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_DVR_FILE_SUCCESS = 1000  // 获取文件信息成功 </li>
   *   <li>NET_DVR_FILE_NOFIND = 1001  // 未查找到文件 </li>
   *   <li>NET_DVR_ISFINDING = 1002  // 正在查找请等待 </li>
   *   <li>NET_DVR_NOMOREFILE = 1003  // 没有更多的文件，查找结束 </li>
   *   <li>NET_DVR_FILE_EXCEPTION = 1004  // 查找文件时异常 </li>
   * </ul>
   */
  NativeLong NET_DVR_FindNextFile_V50(NativeLong lFindHandle, NET_DVR_FINDDATA_V50 lpFindData);

  /**
   * 6.1.4 - [远程录像回放、下载、锁定及备份 -> 录像文件的查找]： 关闭文件查找，释放资源
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   * </ul>
   *
   * @param lFindHandle [in] 文件查找句柄，{@link #NET_DVR_FindFile_V50(NativeLong, NET_DVR_FILECOND_V50)}、
   *                    NET_DVR_FindFileByEvent或者NET_DVR_FindFile_V30的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_FindClose_V30(NativeLong lFindHandle);

  /**
   * 6.1.4 - [远程录像回放、下载、锁定及备份 -> 录像文件的查找]： 根据文件类型、时间和卡号查找设备录像文件
   * <p/>
   * 该接口指定了要查找的录像文件的类型、查找时间范围和卡号，调用成功后，
   * 就可以调用{@link #NET_DVR_FindNextFile_V50(NativeLong, NET_DVR_FINDDATA_V50)}接口来获取文件信息
   *
   * @param lUserID     [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lChannel    [in] 通道号
   * @param dwFileType  录像文件类型，参考{@link RecordFileType}
   * @param nFindType   [in] 查找类型：0-表示不使用卡号<br/>
   *                    1-表示按卡号查询，sCardNumber为卡号信息<br/>
   *                    2-表示按交易类型查询，sCardNumber的第一个字节为下述值：<br/>
   *                    - 查询:0x31<br/>
   *                    - 取款:0x32<br/>
   *                    - 改密:0x33<br/>
   *                    - 转帐:0x34<br/>
   *                    - 存款:0x35<br/>
   *                    - 未知:0x36<br/>
   *                    3-表示按交易金额,sCardNumber中为交易金额
   * @param sCardNumber [in] 卡号信息
   * @param lpStartTime [in] 文件的开始时间
   * @param lpStopTime  [in] 文件的结束时间
   * @return -1表示失败，其他值作为{@link #NET_DVR_FindClose_V30(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  NativeLong NET_DVR_FindFileByCard(NativeLong lUserID,
                                    NativeLong lChannel,
                                    int dwFileType,
                                    int nFindType,
                                    ByteByReference sCardNumber,
                                    NET_DVR_TIME lpStartTime,
                                    NET_DVR_TIME lpStopTime);

  /**
   * 6.1.5 - [远程录像回放、下载、锁定及备份 -> 事件录像查找]： 根据事件查找录像文件
   * <p/>
   * 该接口指定了要查找的录像文件(按事件)的信息，调用成功后，就可以调用{@link #NET_DVR_FindNextEvent_V50(NativeLong, NET_DVR_SEARCH_EVENT_RET_V50)}
   * 接口来获取文件信息。按事件查找出的录像文件针对开始时间和停止时间，因此只支持按时间回放NET_DVR_PlayBackByTime()。
   * todo NET_DVR_PlayBackByTime
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGHPRI}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CHANNEL_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NODISK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID            [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpSearchEventParam [in] 欲查找的文件信息结构
   * @return -1表示失败，其他值作为{@link #NET_DVR_FindNextEvent_V50(NativeLong, NET_DVR_SEARCH_EVENT_RET_V50)}等函数的参数。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  NativeLong NET_DVR_FindFileByEvent_V50(NativeLong lUserID, NET_DVR_SEARCH_EVENT_PARAM_V50 lpSearchEventParam);

  /**
   * 6.1.5 - [远程录像回放、下载、锁定及备份 -> 事件录像查找]： 逐个获取查找到的文件信息
   * <p/>
   * 在调用该接口获取查找文件之前，必须先调用{@link #NET_DVR_FindFileByEvent_V50(NativeLong, NET_DVR_SEARCH_EVENT_PARAM_V50)}
   * 得到当前的查找句柄。按事件查找出的录像文件针对开始时间和停止时间，因此只支持按时间回放NET_DVR_PlayBackByTime()。
   * todo NET_DVR_PlayBackByTime
   *
   * @param lFindHandle      [in] 文件查找句柄，{@link #NET_DVR_FindFileByEvent_V50(NativeLong, NET_DVR_SEARCH_EVENT_PARAM_V50)}的返回值
   * @param lpSearchEventRet [out] 保存文件信息的指针
   * @return -1表示失败，其他值表示当前的获取状态等信息，详见下表。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_DVR_FILE_SUCCESS = 1000  // 获取文件信息成功 </li>
   *   <li>NET_DVR_FILE_NOFIND = 1001  // 未查找到文件 </li>
   *   <li>NET_DVR_ISFINDING = 1002  // 正在查找请等待 </li>
   *   <li>NET_DVR_NOMOREFILE = 1003  // 没有更多的文件，查找结束 </li>
   *   <li>NET_DVR_FILE_EXCEPTION = 1004  // 查找文件时异常 </li>
   * </ul>
   */
  NativeLong NET_DVR_FindNextEvent_V50(NativeLong lFindHandle, NET_DVR_SEARCH_EVENT_RET_V50 lpSearchEventRet);

  /**
   * 6.1.6 - [远程录像回放、下载、锁定及备份 -> 区域移动侦测智能搜索（后检索）]： 开始智能搜索
   * <p/>
   * 该接口指定了要搜索条件信息，调用成功后，就可以调用{@link #NET_DVR_SearchNextInfo(NativeLong, NET_DVR_SMART_SEARCH_RET)}接口来获取搜索结果。
   * 搜索出的录像文件针对开始时间和停止时间，因此只支持按时间回放(NET_DVR_PlayBackByTime_V40)。
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGHPRI}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CHANNEL_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NODISK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID            [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpSmartSearchParam [in] 智能搜索参数结构
   * @return -1表示失败，其他值作为{@link #NET_DVR_SearchNextInfo(NativeLong, NET_DVR_SMART_SEARCH_RET)}、
   * {@link #NET_DVR_StopSearch(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_SmartSearch_V40(NativeLong lUserID, NET_DVR_SMART_SEARCH_PARAM_V40 lpSmartSearchParam);

  /**
   * 6.1.6 - [远程录像回放、下载、锁定及备份 -> 区域移动侦测智能搜索（后检索）]： 逐个获取搜索到的智能录像信息
   * <p/>
   * 在调用该接口前，必须先调用{@link #NET_DVR_SmartSearch_V40(NativeLong, NET_DVR_SMART_SEARCH_PARAM_V40)}得到当前的搜索句柄。
   * 按搜索出的录像文件针对开始时间和停止时间，因此只支持按时间回放NET_DVR_PlayBackByTime()。
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   * </ul>
   *
   * @param lSearchHandle    [in] 搜索句柄，NET_DVR_SmartSearch的返回值
   * @param lpSmartSearchRet [out] 保存搜索结果信息的指针
   * @return -1表示失败，其他值表示当前的获取状态等信息，详见下表。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_DVR_FILE_SUCCESS = 1000  // 获取文件信息成功 </li>
   *   <li>NET_DVR_FILE_NOFIND = 1001  // 未查找到文件 </li>
   *   <li>NET_DVR_ISFINDING = 1002  // 正在查找请等待 </li>
   *   <li>NET_DVR_NOMOREFILE = 1003  // 没有更多的文件，查找结束 </li>
   *   <li>NET_DVR_FILE_EXCEPTION = 1004  // 查找文件时异常 </li>
   * </ul>
   */
  NativeLong NET_DVR_SearchNextInfo(NativeLong lSearchHandle, NET_DVR_SMART_SEARCH_RET lpSmartSearchRet);

  /**
   * 6.1.6 - [远程录像回放、下载、锁定及备份 -> 区域移动侦测智能搜索（后检索）]： 停止智能搜索
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   * </ul>
   *
   * @param lSearchHandle [in] 搜索句柄，NET_DVR_SmartSearch的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopSearch(NativeLong lSearchHandle);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按文件名回放录像文件
   * <p/>
   * 该接口指定了当前要播放的录像文件，调用成功后，还必须调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}
   * 接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现回放。
   * 在调用该接口成功后，可以通过接口NET_DVR_SetPlayDataCallBack_V40注册回调函数，捕获录像的码流数据并自行处理
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PASSWORD_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_OVER_MAXLINK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_COMMANDTIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSPECFILE}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKFAILED}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADDSSDKFAILED}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID           [in] NET_DVR_Login_V40等登录接口的返回值
   * @param sPlayBackFileName [in] 回放的文件名，长度不能超过100字节
   * @param hWnd              [in] 回放的窗口句柄，若置为空，SDK仍能收到码流数据，但不解码显示
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackByName(NativeLong lUserID, String sPlayBackFileName, WinDef.HWND hWnd);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按文件名回放集群录像文件
   * <p/>
   * 该接口指定了当前要播放的录像文件，调用成功后，还必须调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}
   * 接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现回放。在调用该接口成功后，
   * 可以通过接口NET_DVR_SetPlayDataCallBack_V40注册回调函数，捕获录像的码流数据并自行处理
   * TODO NET_DVR_SetPlayDataCallBack_V40
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PASSWORD_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_OVER_MAXLINK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_COMMANDTIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSPECFILE}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKFAILED}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADDSSDKFAILED}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pParam  [in] 回放参数
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackByName_V50(NativeLong lUserID, NET_DVR_PLAY_BY_NAME_PARA pParam);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按流ID和时间回放录像文件
   * <p/>
   * <ul>
   *   <li>该接口指定了当前要播放的录像文件，调用成功后，还必须调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}
   *        接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现回放。
   *        当回放的是按事件搜索出的录像文件时，由于每个文件都会有预录和延迟的部分，因此在设置本接口的开始和结束时间参数时可以适当提前开始时间和延长结束时间。建议值：最多10分钟，最少5秒。
   *        在调用该接口成功后，可以通过接口NET_DVR_SetPlayDataCallBack_V40注册回调函数，捕获录像的码流数据并自行处理。 </li>
   *   <li>该接口如果传入了播放句柄而加载播放库失败，实际上失败的，但是接口会返回成功。错误会通过异常方式进行回调(NET_DVR_SetExceptionCallBack_V30)，异常消息类型为：EXCEPTION_PLAYBACK，具体错误需要在异常消息回调函数中调用NET_DVR_GetLastError获取</li>
   *   <li>Linux版本SDK开发，回放接口直接传入有效窗口句柄，在回放过程中，改变窗口大小时，需要调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}(命令:NET_DVR_CHANGEWNDRESOLUTION)通知底层播放库去获取窗口大小。Windows系统下开发不需要调用相关接口，可以自适应</li>
   *   <li>ISAPI协议下，并不完全支持私有协议的相关功能，目前ISAPI协议下，该接口支持的回放控制命令如下：开始播放（NET_DVR_PLAYSTART）、暂停播放（NET_DVR_PLAYPAUSE）、恢复播放（NET_DVR_PLAYRESTART）、快放（NET_DVR_PLAYFAST）、慢放（NET_DVR_PLAYSLOW）、正常速度播放（NET_DVR_PLAYNORMAL）。其他不支持 </li>
   * </ul>
   *
   * @param lUserID  [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pVodPara [in] 查找条件
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackByTime_V40(NativeLong lUserID, NET_DVR_VOD_PARA pVodPara);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按流ID和时间回放录像文件
   * <p/>
   * 参考{@link #NET_DVR_PlayBackByTime_V40(NativeLong, NET_DVR_VOD_PARA)}
   *
   * @param lUserID  [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pVodPara [in] 查找条件
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackByTime_V50(NativeLong lUserID, NET_DVR_VOD_PARA_V50 pVodPara);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按文件名倒放录像文件
   * <p/>
   * <ul>
   *   <li>该接口指定了当前要播放的录像文件，调用成功后，还必须调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现回放。在调用该接口成功后，可以通过接口NET_DVR_SetPlayDataCallBack_V40注册回调函数，捕获录像的码流数据并自行处理。 </li>
   *   <li>Linux 32/64位系统均不支持倒放软解码功能，因此需要将窗口句柄传空，设置回调函数，只取流不解码显示。 </li>
   * </ul>
   *
   * @param lUserID           [in] NET_DVR_Login_V40等登录接口的返回值
   * @param sPlayBackFileName [in] 回放的文件名，长度不能超过100字节
   * @param hWnd              [in] 回放的窗口句柄，若置为空，SDK仍能收到码流数据，但不解码显示
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackReverseByName(NativeLong lUserID, String sPlayBackFileName, WinDef.HWND hWnd);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按文件名倒放录像文件
   * <p/>
   * <ul>
   *   <li>该接口指定了当前要播放的录像文件，调用成功后，还必须调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现回放。在调用该接口成功后，可以通过接口NET_DVR_SetPlayDataCallBack_V40注册回调函数，捕获录像的码流数据并自行处理。 </li>
   *   <li>Linux 32/64位系统均不支持倒放软解码功能，因此需要将窗口句柄传空，设置回调函数，只取流不解码显示。 </li>
   * </ul>
   *
   * @param lUserID [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pParam  [in] 回放参数
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackReverseByName_V50(NativeLong lUserID, NET_DVR_PLAY_BY_NAME_PARA pParam);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 按时间倒放录像文件
   * <p/>
   * 该接口指定了当前要播放的录像文件，调用成功后，还必须调用{@link #NET_DVR_PlayBackControl_V40(NativeLong, int, Pointer, int, Pointer, IntByReference)}接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现回放。<br>
   * 当回放的是按事件搜索出的录像文件时，由于每个文件都会有预录和延迟的部分，因此在设置本接口的开始和结束时间参数时可以适当提前开始时间和延长结束时间。建议值：最多10分钟，最少5秒。
   * 在调用该接口成功后，可以通过接口NET_DVR_SetPlayDataCallBack_V40注册回调函数，捕获录像的码流数据并自行处理。
   *
   * @param lUserID   [in] NET_DVR_Login_V40等登录接口的返回值
   * @param hWnd      [in] 回放的窗口句柄。若置为空，SDK仍能收到码流数据，但不解码显示。Linux系统下不支持倒放解码显示功能，该窗口句柄传空
   * @param pPlayCond [in] 回放条件
   * @return -1表示失败，其他值作为{@link #NET_DVR_StopPlayBack(NativeLong)}等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_PlayBackReverseByTime_V40(NativeLong lUserID, WinDef.HWND hWnd, NET_DVR_PLAYCOND pPlayCond);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 控制录像回放的状态
   * <p/>
   * 该接口中的第三个参数是否需要输入数值与控制命令有关，详见下表所示。<br>
   * 当控制命令是开始播放（即NET_DVR_PLAYSTART）时，第三个参数的值表示播放当前文件的偏移量，若该值为0表示从文件的起始位置播放，
   * 若该值不为0则表示断网续传的文件位置（Byte）。<br>
   * <font style="color: yellow; font-weight: bold;">详细内容参考对应文档</font>
   * <p/>
   * <ul>
   *   <li>NET_DVR_START_DRAWFRAME、NET_DVR_STOP_DRAWFRAME回放时控制开始和停止抽帧，需要发送当前
   *   回放OSD时间给设备。回放接口如果没有传窗口句柄，回调取流解码，建议调用相关接口清空播放库缓存数据，
   *   避免出现延时现象。抽帧回放控制时dwInLen必须输入正确的长度，当dwInLen为NET_DVR_TIME_EX结构体大小时，
   *   按NET_DVR_TIME_EX处理；当dwInLen为NET_DVR_VOD_DRAWFRAME_PARA结构体大小时，按
   *   NET_DVR_VOD_DRAWFRAME_PARA处理。</li>
   *   <li>Linux版本SDK开发，回放接口直接传入有效窗口句柄，在回放过程中，改变窗口大小时，需要调用该
   *   接口和NET_DVR_CHANGEWNDRESOLUTION命令通知底层播放库去获取窗口大小。Windows系统下开发不需要
   *   调用相关接口，可以自适应</li>
   *   <li>回放快放速度和网络环境以及回放路数以及回放码流分辨率有关系的，NET_DVR_PLAYFAST调用一次，
   *   则速度 * 2，具体数据和PC机解码性能是有关系的，可能因为PC解码性能或者网络速度达不到设定的速度。
   *   NET_DVR_PLAYSLOW调用一次，则速度/ 2</li>
   *   <li>ISAPI协议下，并不完全支持私有协议的相关功能，目前ISAPI协议下，该接口支持的回放控制命令如下：
   *   开始播放（NET_DVR_PLAYSTART）、暂停播放（NET_DVR_PLAYPAUSE）、恢复播放（NET_DVR_PLAYRESTART）、
   *   快放（NET_DVR_PLAYFAST）、慢放（NET_DVR_PLAYSLOW）、正常速度播放（NET_DVR_PLAYNORMAL）。
   *   其他不支持</li>
   *   <li>鼠标按下，调用NET_DVR_VOD_DRAG_ING命令，设备开始给客户回传这个时间点的一帧可以独立播放的数据。
   *   这个时候，客户端清空播放缓冲区，SDK收到命令以后也会清空接收缓冲区，直到收到拖动数据时，才继续给客户端回调数据。 </li>
   *   <li>鼠标拖动中，客户端持续调用NET_DVR_VOD_DRAG_ING命令，设备持续给客户端回传制定时间点的一帧数据即可。</li>
   *   <li>鼠标松开时，客户端调用NET_DVR_VOD_DRAG_END命令，设备发完这个时间点的一帧数据后，会接着这个时间点给客户端继续发送码流数据</li>
   * </ul>
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PASSWORD_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_OVER_MAXLINK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_COMMANDTIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSPECFILE}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKFAILED}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADDSSDKFAILED}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle   [in] 播放句柄，NET_DVR_PlayBackByName、NET_DVR_PlayBackReverseByName或
   *                      NET_DVR_PlayBackByTime_V40、NET_DVR_PlayBackReverseByTime_V40的返回值
   * @param dwControlCode 参考{@link RecordPlayCommand}
   * @param lpInBuffer    [in] 指向输入参数的指针
   * @param dwInLen       [in] 输入参数的长度（抽帧回放控制时必须输入正确的长度，当dwInLen为NET_DVR_TIME_EX结构体大小时，按NET_DVR_TIME_EX处理；当dwInLen为NET_DVR_VOD_DRAWFRAME_PARA结构体大小时，按NET_DVR_VOD_DRAWFRAME_PARA处理）
   * @param lpOutBuffer   [out] 指向输出参数的指针
   * @param lpOutLen      [out] 输出参数的长度
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_PlayBackControl_V40(NativeLong lPlayHandle,
                                      int dwControlCode,
                                      Pointer lpInBuffer,
                                      int dwInLen,
                                      Pointer lpOutBuffer,
                                      IntByReference lpOutLen);

  /**
   * 6.1.7 - [远程录像回放、下载、锁定及备份 -> 回放录像文件]： 停止回放录像文件
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
   * @param lPlayHandle [in] 回放句柄，NET_DVR_PlayBackByName、NET_DVR_PlayBackByTime_V40或者
   *                    NET_DVR_PlayBackReverseByName、NET_DVR_PlayBackReverseByTime_V40的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopPlayBack(NativeLong lPlayHandle);

  /**
   * 6.1.8 - [远程录像回放、下载、锁定及备份 -> 回放数据回调和录像]： 捕获回放的录像数据，并保存成文件
   * <p/>
   * V5.0.3.2或以后版本，通过该接口保存录像，保存的录像文件数据超过文件最大限制字节数（默认为1024MB），
   * SDK会自动切片，即新建文件进行保存，文件名命名规则为“在接口传入的文件名基础上增加数字标识(例如：*_1.mp4、*_2.mp4)”。
   * 可以调用NET_DVR_GetSDKLocalCfg、NET_DVR_SetSDKLocalCfg(配置类型：NET_DVR_LOCAL_CFG_TYPE_GENERAL)获取和
   * 设置切片模式和文件最大限制字节数
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATEFILE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle [in] 播放句柄，NET_DVR_PlayBackByName、NET_DVR_PlayBackByTime_V40
   *                    或者NET_DVR_PlayBackByTime的返回值
   * @param sFileName   [in] 保存数据的文件路径（包括文件名）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_PlayBackSaveData(NativeLong lPlayHandle, String sFileName);

  /**
   * 6.1.8 - [远程录像回放、下载、锁定及备份 -> 回放数据回调和录像]： 停止保存录象数据
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle [in] 播放句柄，NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopPlayBackSave(NativeLong lPlayHandle);

  /**
   * 6.1.8 - [远程录像回放、下载、锁定及备份 -> 回放数据回调和录像]： 注册回调函数，捕获录像数据
   * <p/>
   * <ul>
   *   <li>cbPlayDataCallBack回调函数中不能执行可能会占用时间较长的接口或操作，不建议调用该SDK（HCNetSDK.dll）本身的接口。 </li>
   *   <li>此函数包括开始和停止用户处理SDK捕获的数据，当回调函数cbPlayDataCallBack设为非NULL值时，表示回调和处理数据；
   *   当设为NULL时表示停止回调和处理数据。回调的第一个包是40个字节的文件头，供后续解码使用，之后回调的是压缩的码流。 </li>
   * </ul>
   *
   * @param lPlayHandle        [in] 播放句柄，NET_DVR_PlayBackByName、NET_DVR_PlayBackByTime_V40
   *                           或NET_DVR_PlayBackReverseByName、NET_DVR_PlayBackReverseByTime_V40的返回值
   * @param cbPlayDataCallBack [in] 录像数据回调函数
   * @param pUser              [in] 用户数据
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_SetPlayDataCallBack_V40(NativeLong lPlayHandle, FPlayDataCallBack cbPlayDataCallBack, Pointer pUser);

  /**
   * 6.1.8 - [远程录像回放、下载、锁定及备份 -> 回放数据回调和录像]： 注册回放裸码流数据回调函数
   * <p/>
   * <ul>
   *   <li>回调函数中不能执行可能会占用时间较长的接口或操作，不建议调用该SDK（HCNetSDK.dll）本身的接口。 </li>
   *   <li>通过该接口可以获取录像码流数据，然后进行帧分析，将分析之后的帧数据在回调函数里面返回，每次回调返回一帧裸码流
   *   数据（不带封装），包括帧数据、帧类型、时间戳等信息。注意，如果是私有编码的码流或者加密之后的码流，不支持通过该
   *   接口设置回调获取裸码流数据。 </li>
   * </ul>
   *
   * @param lPlayHandle          [in] 播放句柄，NET_DVR_PlayBackByName、NET_DVR_PlayBackByTime_V40
   *                             或NET_DVR_PlayBackReverseByName、NET_DVR_PlayBackReverseByTime_V40的返回值
   * @param cbPlayESDataCallBack [in] 回放裸码流数据回调函数，回调获取每一帧裸码流数据
   * @param pUser                [in] 用户数据
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetPlayBackESCallBack(NativeLong lPlayHandle, FPlayESCallBack cbPlayESDataCallBack, Pointer pUser);

  /**
   * 6.1.9 - [远程录像回放、下载、锁定及备份 -> 录像标签查找 ]： 搜索录像标签
   * <p/>
   * 回放时，可根据查找到的标签（时间）信息通过NET_DVR_PlayBackControl_V40实现定位操作。
   * 每次最多搜索4000条标签条。
   *
   * @param lUserID     [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpFindLabel [in] 欲查找的标签信息结构
   * @return -1表示失败，其他值作为NET_DVR_FindNextLabel等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_FindRecordLabel(NativeLong lUserID, NET_DVR_FIND_LABEL lpFindLabel);

  /**
   * 6.1.9 - [远程录像回放、下载、锁定及备份 -> 录像标签查找 ]： 逐个获取搜索到的录像标签
   * <p/>
   * 在调用该接口获取查找录像标签之前，必须先调用NET_DVR_FindRecordLabel得到当前的查找句柄。此接口用于获取一条已查找到的标签信息，
   * 若要获取全部的已查找到的标签信息，需要循环调用此接口。
   *
   * @param lFindHandle [in] NET_DVR_FindRecordLabel的返回值
   * @param lpFindData  [in] 标签信息
   * @return -1表示失败，其他值表示当前的获取状态等信息。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_DVR_FILE_SUCCESS = 1000  // 获取文件信息成功 </li>
   *   <li>NET_DVR_FILE_NOFIND = 1001  // 未查找到文件 </li>
   *   <li>NET_DVR_ISFINDING = 1002  // 正在查找请等待 </li>
   *   <li>NET_DVR_NOMOREFILE = 1003  // 没有更多的文件，查找结束 </li>
   *   <li>NET_DVR_FILE_EXCEPTION = 1004  // 查找文件时异常 </li>
   * </ul>
   */
  NativeLong NET_DVR_FindNextLabel(NativeLong lFindHandle, NET_DVR_FINDLABEL_DATA lpFindData);

  /**
   * 6.1.9 - [远程录像回放、下载、锁定及备份 -> 录像标签查找 ]： 停止搜索录像标签
   *
   * @param lFindHandle [in] NET_DVR_FindRecordLabel的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopFindLabel(NativeLong lFindHandle);

  /**
   * 6.1.10 - [远程录像回放、下载、锁定及备份 -> 回放录像标签操作]： 添加录像标签
   * <p/>
   * 录像标签功能可帮助用户在回放录像时记录下某一时间点的相关人员或现场等信息，以便后续随时根据标签信息，进行搜索和定位录像资料
   *
   * @param lFindHandle     [in] NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime的返回值
   * @param lpRecordLabel   [in] 录像标签
   * @param lpLableIdentify [out] 添加录像标签后的标识
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_InsertRecordLabel(NativeLong lFindHandle,
                                    NET_DVR_RECORD_LABEL lpRecordLabel,
                                    NET_DVR_LABEL_IDENTIFY lpLableIdentify);

  /**
   * 6.1.10 - [远程录像回放、下载、锁定及备份 -> 回放录像标签操作]： 修改录像标签
   *
   * @param lUserID         [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpModLabelParam [in] 标签修改结构体
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_ModifyRecordLabel(NativeLong lUserID, NET_DVR_MOD_LABEL_PARAM lpModLabelParam);

  /**
   * 6.1.10 - [远程录像回放、下载、锁定及备份 -> 回放录像标签操作]： 修改录像标签
   *
   * @param lUserID         [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpDelLabelParam [in] 要删除的标签信息
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_DelRecordLabel(NativeLong lUserID, NET_DVR_DEL_LABEL_PARAM lpDelLabelParam);

  /**
   * 6.1.11 - [远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作]： 设置抓图模式
   * <p/>
   * 调用该接口设置抓图模式后，调用预览或者回放抓图接口可抓取相应格式的图片。如果抓图模式为JPEG模式，抓取的是JPEG图片，
   * 保存路径后缀应为.jpg，例如：sPicFileName="D:\\test.jpg"；如果抓图模式为BMP模式，抓取的是BMP图片，保存路径后缀应为.bmp，例如：sPicFileName="D:\\test.bmp"。
   *
   * @param dwCaptureMode [in] 抓图模式 0 BMP模式 , 1 JPEG模式
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_SetCapturePictureMode(int dwCaptureMode);

  /**
   * 6.1.11 - [远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作]： 录像回放时抓图并保存在指定内存中
   * <p/>
   * 该接口为回放阻塞模式抓图，回放接口必须传入有效的窗口句柄，正常回放解码的时候才能调用该接口进行抓图。图片数据格式支持BMP和JPEG两种
   * （通过NET_DVR_SetCapturePictureMode设置数据格式），并且支持在回放暂停状态下抓取图片数据。
   *
   * @param lPlayHandle    [in] 播放句柄，NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime_V40的返回值
   * @param pPicBuf        [in] 保存图片数据的缓冲区
   * @param dwPicSize      [in] 缓冲区大小，分配的缓冲区内存必须大于等于图片数据的大小
   * @param lpSizeReturned [out] 返回图片数据的实际大小
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CapturePlaybackPictureBlock_New(NativeLong lPlayHandle,
                                                  String pPicBuf,
                                                  int dwPicSize,
                                                  IntByReference lpSizeReturned);

  /**
   * 6.1.11 - [远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作]： 录像回放时抓图，并保存在文件中
   * <p/>
   * 回放时抓下来的图片时间要比抓图时间延后，这是因为预览画面上的OSD时间是解码完成的显示时间，而解码缓冲区会有将近1M左右的数据还没有解出来，
   * 要抓取的图片数据是网络缓冲里面的。目前解码库没有直接从解码缓冲区中取出数据的接口。
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle [in] 播放句柄，NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime_V40的返回值
   * @param sFileName   [in] 保存图片数据的文件路径（包括文件名）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_PlayBackCaptureFile(NativeLong lPlayHandle, String sFileName);

  /**
   * 6.1.11 - [远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作]： 获取录像回放时显示的OSD时间
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle [in] 播放句柄，NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime_V40的返回值
   * @param lpOsdTime   [out] 获取的OSD时间的指针
   */
  boolean NET_DVR_GetPlayBackOsdTime(NativeLong lPlayHandle, NET_DVR_TIME lpOsdTime);

  /**
   * 6.1.11 - [远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作]： 刷新显示回放窗口
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_LOADPLAYERSDKPROC_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle [in] 回放句柄，NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime_V40的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_RefreshPlay(NativeLong lPlayHandle);

  /**
   * 6.1.11 - [远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作]： 获取回放时用来解码显示的播放库句柄
   * <p/>
   * 用户可以通过返回的句柄自行实现播放库SDK提供的其他功能，详见播放库SDK开发包里面的《播放器SDK编程指南》。
   * <p/>
   * <ul>
   *   <li>例如,使用PlayM4_GetBMP(LONG nPort,……)、PlayM4_GetJPEG(LONG nPort,……)这两个接口即可实现将当前回放图像
   *   以BMP或JPEG格式抓图保存到内存中： PlayM4_GetBMP(NET_DVR_GetRealPlayerIndex(),……) PlayM4_GetJPEG(NET_DVR_GetRealPlayerIndex(),……) </li>
   *   <li>例如，调用PlayM4_RenderPrivateData(NET_DVR_GetRealPlayerIndex(), ……)可以显示或者关闭回放画面上的智能叠加信息</li>
   * </ul>
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   * </ul>
   *
   * @param lPlayHandle [in] 回放句柄，NET_DVR_PlayBackByName或NET_DVR_PlayBackByTime_V40的返回值
   * @return -1表示失败，其他值表示播放句柄。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  int NET_DVR_GetPlayBackPlayerIndex(NativeLong lPlayHandle);

  // 7.1.11 ↓↓↓ 远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作 ↓↓↓
  // NET_DVR_RigisterPlayBackDrawFun 接口暂不实现!!!!!!!!
  // 7.1.11 ↑↑↑ 远程录像回放、下载、锁定及备份 -> 回放抓图、OSD获取等其他操作 ↑↑↑

  /**
   * 6.1.12 - [远程录像回放、下载、锁定及备份 -> 下载录像文件]： 按文件名下载录像文件
   * <p/>
   * 在使用该接口下载录像文件前，可以先调用录像文件查找的接口获取文件名。该接口指定了当前要下载的录像文件，调用成功后，
   * 还需要调用NET_DVR_PlayBackControl_V40接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现下载。
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PASSWORD_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGHPRI}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CHANNEL_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_OVER_MAXLINK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_VERSIONNOMATCH}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_COMMANDTIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSPECFILE}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATEFILE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PROGRAM_EXCEPTION}</li>
   * </ul>
   *
   * @param lUserID        [in] NET_DVR_Login或者NET_DVR_Login_V30的返回值
   * @param sDVRFileName   [in] 要下载的录像文件名，文件名长度需小于100字节
   * @param sSavedFileName [in] 下载后保存到PC机的文件路径，需为绝对路径（包括文件名）
   * @return -1表示失败，其他值作为NET_DVR_StopGetFile等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_GetFileByName(NativeLong lUserID, String sDVRFileName, String sSavedFileName);

  /**
   * 6.1.12 - [远程录像回放、下载、锁定及备份 -> 下载录像文件]： 按时间下载录像文件
   * <p/>
   * <ul>
   *   <li>该接口指定了当前要下载的录像文件，调用成功后，还需要调用NET_DVR_PlayBackControl_V40
   *   接口的开始播放控制命令（NET_DVR_PLAYSTART）才能实现下载。 </li>
   *   <li>V5.0.3.2或以后版本，通过该接口保存录像，保存的录像文件数据超过文件最大限制字节数（默认为1024MB），
   *   SDK会自动切片，即新建文件进行保存，文件名命名规则为“在接口传入的文件名基础上增加数字标识(例如：*_1.mp4、*_2.mp4)”。
   *   可以调用NET_DVR_GetSDKLocalCfg、NET_DVR_SetSDKLocalCfg(配置类型：NET_DVR_LOCAL_CFG_TYPE_GENERAL)
   *   获取和设置切片模式和文件最大限制字节数。 </li>
   * </ul>
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PASSWORD_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_OVER_MAXLINK}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_COMMANDTIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATEFILE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID        [in] NET_DVR_Login或者NET_DVR_Login_V30的返回值
   * @param sSavedFileName [in] 下载后保存到PC机的文件路径，需为绝对路径（包括文件名）
   * @param pDownloadCond  [in] 下载条件
   * @return -1表示失败，其他值作为NET_DVR_StopGetFile等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  NativeLong NET_DVR_GetFileByTime_V40(NativeLong lUserID, String sSavedFileName, NET_DVR_PLAYCOND pDownloadCond);

  // 7.1.12 ↓↓↓↓↓↓↓↓↓ 远程录像回放、下载、锁定及备份 -> 下载录像文件 ↓↓↓↓↓↓↓↓↓
  // NET_DVR_PlayBackControl_V40 参考 7.1.7
  // 7.1.12 ↑↑↑↑↑↑↑↑↑ 远程录像回放、下载、锁定及备份 -> 下载录像文件 ↑↑↑↑↑↑↑↑↑

  /**
   * 6.1.12 - [远程录像回放、下载、锁定及备份 -> 下载录像文件]： 停止下载录像文件
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   * </ul>
   *
   * @param lFileHandle [in] 下载句柄，NET_DVR_GetFileByName、NET_DVR_GetFileByTime_V40
   *                    或NET_DVR_GetFileByTime的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopGetFile(NativeLong lFileHandle);

  /**
   * 6.1.12 - [远程录像回放、下载、锁定及备份 -> 下载录像文件]： 获取当前下载录像文件的进度
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   * </ul>
   *
   * @param lFileHandle [in] 下载句柄，NET_DVR_GetFileByName、NET_DVR_GetFileByTime_V40
   *                    或NET_DVR_GetFileByTime的返回值
   * @return -1表示失败；0～100表示下载的进度；100表示下载结束；正常范围0-100，如返回200表明出现网络异常。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  int NET_DVR_GetDownloadPos(NativeLong lFileHandle);

  /**
   * 6.1.13 - [远程录像回放、下载、锁定及备份 -> 录像锁定和解锁]： 按文件名锁定录像文件
   * <p/>
   * 在使用该接口锁定录像文件前，可以先调用录像文件查找的接口获取文件名。当文件被锁定后，将不会被覆盖
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID       [in] NET_DVR_Login_V40等登录接口的返回值
   * @param sLockFileName [in] 要锁定的录像文件名，文件名长度需小于100字节
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_LockFileByName(NativeLong lUserID, String sLockFileName);

  /**
   * 6.1.13 - [远程录像回放、下载、锁定及备份 -> 录像锁定和解锁]： 按文件名解锁录像文件
   * <p/>
   * 在使用该接口锁定录像文件前，可以先调用录像文件查找的接口获取文件名
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOINIT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOENOUGH_BUF}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_CREATESOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_BINDSOCKET_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_SOCKETCLOSE_ERROR}</li>
   * </ul>
   *
   * @param lUserID         [in] NET_DVR_Login_V40等登录接口的返回值
   * @param sUnlockFileName [in] 要解锁的录像文件名
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_UnlockFileByName(NativeLong lUserID, String sUnlockFileName);

  /**
   * 6.1.13 - [远程录像回放、下载、锁定及备份 -> 录像锁定和解锁]： 对某一时间段录像文件进行加锁
   *
   * @param lUserID      [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpLockPara   [in] 录像加锁参数
   * @param lpLockReturn [out] 录像加锁结果
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_LockFileByTime(NativeLong lUserID, NET_DVR_TIME_LOCK lpLockPara, NET_DVR_LOCK_RETURN lpLockReturn);

  /**
   * 6.1.13 - [远程录像回放、下载、锁定及备份 -> 录像锁定和解锁]： 对某一时间段录像文件进行解锁
   *
   * @param lUserID      [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpLockPara   [in] 录像解锁参数
   * @param lpLockReturn [out] 录像解锁结果
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_UnLockFileByTime(NativeLong lUserID, NET_DVR_TIME_LOCK lpLockPara, NET_DVR_LOCK_RETURN lpLockReturn);

  /**
   * 6.1.13 - [远程录像回放、下载、锁定及备份 -> 录像锁定和解锁]： 按流ID对某一时间段录像文件进行加锁
   *
   * @param lUserID      [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpLockPara   [in] 录像加锁参数
   * @param lpLockReturn [out] 录像加锁结果
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_LockStreamFileByTime(NativeLong lUserID,
                                       NET_DVR_STREAM_TIME_LOCK lpLockPara,
                                       NET_DVR_LOCK_RETURN lpLockReturn);

  /**
   * 6.1.13 - [远程录像回放、下载、锁定及备份 -> 录像锁定和解锁]： 按流id对某一时间段录像文件进行解锁
   *
   * @param lUserID      [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpLockPara   [in] 录像加锁参数
   * @param lpLockReturn [out] 录像加锁结果
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_UnlockStreamFileByTime(NativeLong lUserID,
                                         NET_DVR_STREAM_TIME_LOCK lpLockPara,
                                         NET_DVR_LOCK_RETURN lpLockReturn);

  /**
   * 6.1.14 - [远程录像回放、下载、锁定及备份 -> 远程控制录像备份]： 获取设备磁盘列表
   * <p/>
   * 该接口用于获取设备可用备份文件的磁盘资源信息，在备份文件功能接口的输入参数中需要用到
   *
   * @param lUserID    [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpDiskList [out] 设备可用备份磁盘信息结构
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetDiskList(NativeLong lUserID, NET_DVR_DISKABILITY_LIST lpDiskList);

  /**
   * 6.1.14 - [远程录像回放、下载、锁定及备份 -> 远程控制录像备份]： 按文件名备份录像文件
   * <p/>
   * 在调用该接口开始文件备份前必须调用接口NET_DVR_GetDiskList获取当前设备可用的磁盘列表信息，
   * 返回的磁盘描述字段用于指定此接口中lpBackupByName参数中的备份磁盘描述字段
   * <p/>
   * 以下是该接口可能返回的错误值
   * <ul>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_FAIL_CONNECT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_SEND_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NETWORK_RECV_TIMEOUT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   * </ul>
   *
   * @param lUserID        [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpBackupByName [in] 备份文件参数结构
   * @return -1表示失败，其他值作为NET_DVR_GetBackupProgress，NET_DVR_StopBackup等函数的参数。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_BackupByName(NativeLong lUserID, NET_DVR_BACKUP_NAME_PARAM lpBackupByName);

  /**
   * 6.1.14 - [远程录像回放、下载、锁定及备份 -> 远程控制录像备份]： 按时间段备份录像文件
   * <p/>
   * 在调用该接口开始文件备份前必须调用接口NET_DVR_GetDiskList获取当前设备可用的磁盘列表信息，
   * 返回的磁盘描述字段用于指定此接口中lpBackupByTime参数中的备份磁盘描述字段
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
   *   <li>{@link NetworkErrorCode#NET_DVR_ORDER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_PARAMETER_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_NOSUPPORT}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_ALLOC_RESOURCE_ERROR}</li>
   *   <li>{@link NetworkErrorCode#NET_DVR_USERNOTEXIST}</li>
   * </ul>
   *
   * @param lUserID        [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpBackupByTime [in] 备份文件参数结构
   * @return -1表示失败，其他值作为NET_DVR_GetBackupProgress，NET_DVR_StopBackup等函数的参数。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  NativeLong NET_DVR_BackupByTime(NativeLong lUserID, NET_DVR_BACKUP_TIME_PARAM lpBackupByTime);

  /**
   * 6.1.14 - [远程录像回放、下载、锁定及备份 -> 远程控制录像备份]： 获取备份的进度
   * <p/>
   * 在进度为100或者备份出错时, 需调用NET_DVR_StopBackup()停止备份
   *
   * @param lHandle [in] NET_DVR_BackupByName或NET_DVR_BackupByTime的返回值
   * @param pState  [out] 当前备份的进度，进度值的取值范围为[0,100]，其他值参考{@link RecordBackupStatus}
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_GetBackupProgress(NativeLong lHandle, IntByReference pState);

  /**
   * 6.1.14 - [远程录像回放、下载、锁定及备份 -> 远程控制录像备份]： 停止备份
   *
   * @param lHandle [in] NET_DVR_BackupByName或NET_DVR_BackupByTime的返回值，或者NET_DVR_BackupPicture的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_StopBackup(NativeLong lHandle);

  /**
   * 6.2.1 - [远程图片查找、回放及备份 -> 图片查找]： 根据类型和时间查找图片
   * <p/>
   * 该接口指定了要查找的图片的类型和查找时间范围，调用成功后，就可以调用NET_DVR_FindNextPicture接口来获取图片信息。<br>
   * 注：该接口查找的是设备本地的图片，可通过NET_DVR_SetDVRConfig配置设备的抓图计划（NET_DVR_SCHED_CAPTURECFG）。
   *
   * @param lUserID    [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pFindParam [in] 图片查找条件信息
   * @return -1表示失败，其他值作为NET_DVR_CloseFindPicture等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因.
   */
  NativeLong NET_DVR_FindPicture(NativeLong lUserID, NET_DVR_FIND_PICTURE_PARAM pFindParam);

  /**
   * 6.2.1 - [远程图片查找、回放及备份 -> 图片查找]： 逐个获取查找到的图片信息
   * <p/>
   * 在调用该接口获取查找图片之前，必须先调用NET_DVR_FindPicture得到当前的查找句柄。此接口用于获取一条已查找到的图片信息，
   * 若要获取全部的已查找到的图片信息，需要循环调用此接口
   *
   * @param lFindHandle [in] 图片查找句柄，NET_DVR_FindPicture的返回值
   * @param lpFindData  [out] 保存图片信息的指针
   * @return -1表示失败，其他值表示当前的获取状态等信息。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_DVR_FILE_SUCCESS = 1000  // 获取文件信息成功 </li>
   *   <li>NET_DVR_FILE_NOFIND = 1001  // 未查找到文件 </li>
   *   <li>NET_DVR_ISFINDING = 1002  // 正在查找请等待 </li>
   *   <li>NET_DVR_NOMOREFILE = 1003  // 没有更多的文件，查找结束 </li>
   *   <li>NET_DVR_FILE_EXCEPTION = 1004  // 查找文件时异常 </li>
   * </ul>
   */
  NativeLong NET_DVR_FindNextPicture_V50(NativeLong lFindHandle, NET_DVR_FIND_PICTURE_V50 lpFindData);

  /**
   * 6.2.1 - [远程图片查找、回放及备份 -> 图片查找]： 关闭图片查找，释放资源
   *
   * @param lFindHandle [in] 图片查找句柄，NET_DVR_FindPicture的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   */
  boolean NET_DVR_CloseFindPicture(NativeLong lFindHandle);

  /**
   * 6.2.2 - [远程图片查找、回放及备份 -> 图片智能搜索（后检索）]： 开始智能图片搜索
   * <p/>
   * <ul>
   *   <li>该接口指定了要搜索条件信息，调用成功后，就可以调用{@link #NET_DVR_FindNextSmartPicture(NativeLong, NET_DVR_SMART_SEARCH_PIC_RET)}接口来获取搜索结果。 </li>
   *   <li>设备是否支持智能图片搜索或者支持的参数能力，对应设备JPEG抓图能力集(JpegCaptureAbility)中节点<SmartPicSearchInfo>，
   *   接口：NET_DVR_GetDeviceAbility(能力集类型：DEVICE_JPEG_CAP_ABILITY)。 </li>
   * </ul>
   *
   * @param lUserID    [in] NET_DVR_Login_V40等登录接口的返回值
   * @param pFindParam [in] 智能图片搜索条件
   * @return -1表示失败，其他值作为NET_DVR_FindNextSmartPicture、NET_DVR_CloseSmartSearchPicture等函数的参数。
   * 接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  NativeLong NET_DVR_SmartSearchPicture(NativeLong lUserID, NET_DVR_SMART_SEARCH_PIC_PARA pFindParam);

  /**
   * 6.2.2 - [远程图片查找、回放及备份 -> 图片智能搜索（后检索）]： 逐个获取搜索到的智能图片信息
   * <p/>
   * 在调用该接口前，必须先调用{@link #NET_DVR_SmartSearchPicture(NativeLong, NET_DVR_SMART_SEARCH_PIC_PARA)}得到当前的搜索句柄
   *
   * @param lFindHandle [in] 智能图片查找句柄，NET_DVR_SmartSearchPicture的返回值
   * @param lpFindData  [out] 查找到的图片信息
   * @return -1表示失败，其他值表示当前的获取状态等信息，详见下表。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因
   * <ul>
   *   <li>NET_DVR_FILE_SUCCESS = 1000  // 获取文件信息成功 </li>
   *   <li>NET_DVR_FILE_NOFIND = 1001  // 未查找到文件 </li>
   *   <li>NET_DVR_ISFINDING = 1002  // 正在查找请等待 </li>
   *   <li>NET_DVR_NOMOREFILE = 1003  // 没有更多的文件，查找结束 </li>
   *   <li>NET_DVR_FILE_EXCEPTION = 1004  // 查找文件时异常 </li>
   * </ul>
   */
  NativeLong NET_DVR_FindNextSmartPicture(NativeLong lFindHandle, NET_DVR_SMART_SEARCH_PIC_RET lpFindData);

  /**
   * 6.2.2 - [远程图片查找、回放及备份 -> 图片智能搜索（后检索）]： 停止智能图片查找，释放资源
   *
   * @param lFindHandle [in] 智能图片查找句柄，NET_DVR_SmartSearchPicture的返回值
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_CloseSmartSearchPicture(NativeLong lFindHandle);

  /**
   * 6.2.3 - [远程图片查找、回放及备份 -> 图片回放下载]： 获取图片数据并存放在指定的内存空间中
   * <p/>
   * 集群中CS的地址可以从图片查找中获取，SDK根据struAddr对CS建立连接，下载图片。
   *
   * @param lUserID    [in] 用户ID号，NET_DVR_Login_V40等登录接口的返回值
   * @param lpPicParam [in] 图片参数
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_GetPicture_V50(NativeLong lUserID, NET_DVR_PIC_PARAM lpPicParam);

  /**
   * 6.2.3 - [远程图片查找、回放及备份 -> 图片回放下载]： 图片下载
   * <p/>
   * 图片为JPEG格式，文件名后缀为.jpg。
   *
   * @param lUserID        [in] 用户ID号，NET_DVR_Login_V40等登录接口的返回值
   * @param sDVRFileName   [in] 要下载的图片名称
   * @param sSavedFileName [in] 下载图片的保存路径（包括文件名）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_GetPicture(NativeLong lUserID, String sDVRFileName, String sSavedFileName);

  /**
   * 6.2.4 - [远程图片查找、回放及备份 -> 远程控制图片备份]： 备份图片
   *
   * @param lUserID         [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lpBackupPicture [in] 图片备份参数
   * @return -1表示失败，其他值作为NET_DVR_StopBackup等函数的参数。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因.
   */
  NativeLong NET_DVR_BackupPicture(NativeLong lUserID, NET_DVR_BACKUP_PICTURE_PARAM lpBackupPicture);
}
