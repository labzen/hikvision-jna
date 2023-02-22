package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 时间信息结构体
 */
@Structure.FieldOrder({"wYear",
                       "wMonth",
                       "wDay",
                       "wHour",
                       "wMinute",
                       "wSecond",
                       "wMilliSec",
                       "byRes"})
public class NET_DVR_SYSTEM_TIME extends Structure {

  public short wYear;
  public short wMonth;
  public short wDay;
  public short wHour;
  public short wMinute;
  public short wSecond;
  public short wMilliSec;
  public byte[] byRes = new byte[2];
}
