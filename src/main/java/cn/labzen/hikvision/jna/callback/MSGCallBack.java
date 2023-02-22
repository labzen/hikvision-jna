package cn.labzen.hikvision.jna.callback;

import cn.labzen.hikvision.jna.definition.MessageCallbackCommand;
import cn.labzen.hikvision.jna.struct.NET_DVR_ALARMER;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface MSGCallBack extends StdCallLibrary.StdCallCallback {

  /**
   * 回调函数的第一个参数（lCommand）和第三个参数（pAlarmInfo）是密切关联的
   *
   * @param lCommand   [out] 上传的消息类型，不同的报警信息对应不同的类型，通过类型区分是什么报警信息，参考{@link MessageCallbackCommand}
   * @param pAlarmer   [out] 报警设备信息，包括设备序列号、IP地址、登录IUserID句柄等
   * @param pAlarmInfo [out] 报警信息，通过lCommand值判断pAlarmer对应的结构体，具体参考{@link MessageCallbackCommand}对应的取值
   * @param dwBufLen   [out] 报警信息缓存大小
   * @param pUser      [out] 用户数据
   */
  void invoke(NativeLong lCommand, NET_DVR_ALARMER pAlarmer, Pointer pAlarmInfo, int dwBufLen, Pointer pUser);
}
