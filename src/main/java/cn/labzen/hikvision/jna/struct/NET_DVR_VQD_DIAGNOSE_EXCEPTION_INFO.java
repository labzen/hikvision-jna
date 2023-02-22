package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.VqdType;
import com.sun.jna.Structure;

/**
 * VQD诊断信息结构体
 */
@Structure.FieldOrder({"dwChannelNO",
                       "dwVQDType",
                       "struDiagnoseTime",
                       "byScoreValue",
                       "byRes"})
public class NET_DVR_VQD_DIAGNOSE_EXCEPTION_INFO extends Structure {

  /**
   * 通道号
   */
  public int dwChannelNO;
  /**
   * VQD诊断类型，参考{@link VqdType}
   */
  public int dwVQDType;
  /**
   * 诊断时间
   */
  public NET_DVR_TIME struDiagnoseTime;
  /**
   * 分数值 ，百分制
   */
  public byte byScoreValue;
  /**
   * 保留
   */
  public byte[] byRes = new byte[27];
}
