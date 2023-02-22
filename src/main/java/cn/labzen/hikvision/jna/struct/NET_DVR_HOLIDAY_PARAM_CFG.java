package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_HOLIDAY_NUM;

/**
 * 假日参数配置结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struHolidayParam",
                       "byRes"})
public class NET_DVR_HOLIDAY_PARAM_CFG extends Structure {

  /**
   * 结构体大小
   */
  int dwSize;
  /**
   * 假日参数
   */
  NET_DVR_HOLIDAY_PARAM[] struHolidayParam = new NET_DVR_HOLIDAY_PARAM[MAX_HOLIDAY_NUM];
  /**
   * 保留
   */
  int[] byRes = new int[40];
}
