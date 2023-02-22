package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_PEOPLE_DETECTION_NUM;

/**
 * 人员侦测结果信息结构体
 * <p/>
 * 从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 * #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br>
 * #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 * #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 * #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 * #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 * #define GET_SECOND(_time_)     (((_time_)>>0) & 63)
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "struDevInfo",
                       "struPeopleRegion",
                       "byPeopleAlarmType",
                       "byRes"})
public class NET_DVR_PEOPLE_DETECTION_RESULT extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 人员侦测区域信息，每位数组表示一个区域，最大支持8个侦测区域
   */
  public NET_DVR_PEOPLE_REGION[] struPeopleRegion = new NET_DVR_PEOPLE_REGION[MAX_PEOPLE_DETECTION_NUM];
  /**
   * 人员检测报警类型 0- 未知， 1- 审讯室内打架斗殴报警 2- 审讯人员瞌睡检测报警 3- 被审讯人员起身检测报警 4- 审判人员检测
   */
  public byte byPeopleAlarmType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[255];
}
