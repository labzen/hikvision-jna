package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 节目信息结构体
 */
@Structure.FieldOrder({"dwProgramNo",
                       "sProgramName",
                       "byRes"})
public class NET_DVR_PROGRAM_INFO extends Structure {

  /**
   * 节目编号
   */
  public int dwProgramNo;
  /**
   * 节目名称
   */
  public byte[] sProgramName = new byte[NAME_LEN];
  /**
   * 保留
   */
  public byte[] byRes = new byte[16];
}
