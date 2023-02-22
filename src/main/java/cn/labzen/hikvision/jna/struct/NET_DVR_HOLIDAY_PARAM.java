package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 假日参数结构体
 */
@Structure.FieldOrder({"byEnable",
                       "byDateMode",
                       "byRes1",
                       "uHolidate",
                       "byName",
                       "byRes2"})
public class NET_DVR_HOLIDAY_PARAM extends Structure {

  /**
   * 是否启用
   */
  public byte byEnable;
  /**
   * 日期模式 0-模式A 1-模式B 2-模式C
   */
  public byte byDateMode;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 假日日期
   */
  public NET_DVR_HOLIDATE_UNION uHolidate;
  /**
   * 假日名称
   */
  public byte[] byName = new byte[NAME_LEN];
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[20];
}
