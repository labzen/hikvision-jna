package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 时间点参数结构体
 */
@Structure.FieldOrder({"dwMonth",
                       "dwWeekNo",
                       "dwWeekDate",
                       "dwHour",
                       "dwMin"})
public class NET_DVR_TIMEPOINT extends Structure {

  /**
   * 月：[0,11]取值分别表示第1个月到第12个月
   */
  public int dwMonth;
  /**
   * 周：0－第1周，1－第2周，2－第3周，3－第4周，4－最后一周
   */
  public int dwWeekNo;
  /**
   * 星期：0－星期日，1－星期一，2－星期二，3－星期三，4－星期四，5－星期五，6－星期六
   */
  public int dwWeekDate;
  /**
   * 小时：开始时间0－23，结束时间1－23
   */
  public int dwHour;
  /**
   * 分：0－59
   */
  public int dwMin;
}
