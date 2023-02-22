package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * VQD诊断信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struVQDDiagnoseExceptionInfo"})
public class NET_DVR_VQD_DIAGNOSE_INFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 诊断异常信息结构体
   */
  public NET_DVR_VQD_DIAGNOSE_EXCEPTION_INFO struVQDDiagnoseExceptionInfo;
}
