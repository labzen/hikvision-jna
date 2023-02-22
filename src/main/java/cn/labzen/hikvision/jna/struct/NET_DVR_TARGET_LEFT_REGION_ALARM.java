package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 目标离开区域报警结构体
 * <p/>
 * 相对时标暂未使用。从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 * #define GET_YEAR(_time_)          (((_time_)>>26) + 2000) <br>
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
                       "byTargetType",
                       "byLeftDirection",
                       "byTargetStatus",
                       "byRes"})
public class NET_DVR_TARGET_LEFT_REGION_ALARM extends Structure {

  /**
   * 结构大小
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
   * 检测目标类型 0-无效目标，1-教师 2-学生
   */
  public byte byTargetType;
  /**
   * 检测目标离开方向类型0-保留,1-上,2-下,3-左,4-右
   */
  public byte byLeftDirection;
  /**
   * 0-保留(不做处理)
   */
  public byte byTargetStatus;
  /**
   * 保留
   */
  public byte[] byRes = new byte[125];
}
