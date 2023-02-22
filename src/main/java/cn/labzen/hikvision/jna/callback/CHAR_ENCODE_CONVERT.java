package cn.labzen.hikvision.jna.callback;

import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface CHAR_ENCODE_CONVERT extends StdCallLibrary.StdCallCallback {

  /**
   * @param pInput          输入字符串，内存由SDK申请，字符串数据也由SDK提供
   * @param dwInputLen      输入字符串缓冲区大小
   * @param dwInEncodeType  输入的字符编码格式：0- 无字符编码信息(老设备)，1- GB2312(简体中文)，2- GBK，3- BIG5(繁体中文)，4- Shift_JIS(日文)，5- EUC-KR(韩文)，6- UTF-8，7- ISO8859-1，8- ISO8859-2，9- ISO8859-3，…，依次类推，21- ISO8859-15(西欧)
   * @param pOutput         输出字符串，内存由SDK申请，存放使用用户字符编码接口转换之后的字符串
   * @param dwOutputLen     输出字符串缓冲区大小
   * @param dwOutEncodeType 输出字符编码格式：0- 无字符编码信息(老设备)，1- GB2312(简体中文)，2- GBK，3- BIG5(繁体中文)，4- Shift_JIS(日文)，5- EUC-KR(韩文)，6- UTF-8，7- ISO8859-1，8- ISO8859-2，9- ISO8859-3，…，依次类推，21- ISO8859-15(西欧)
   */
  void invoke(String pInput, int dwInputLen, int dwInEncodeType, Pointer pOutput, int dwOutputLen, int dwOutEncodeType);
}
