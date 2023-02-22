package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.Union;

/**
 * 客流量统计结果参数结构体
 * <ul>
 *   <li>客流量数据上传有两种不同类型的数据：<br>
 *      1）实时统计结果（byMode为0）：自上次清零动作（包括设备重启、手动清零或每天零点自动清零）后开始计算的实时数量，计数发生变化时上传。<br>
 *      2）周期统计结果（byMode为1）：设定统计周期内增加的数量，更新频率即为设定的统计周期（默认15分钟，最小1分钟，最大60分钟）。 </li>
 *   <li>从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br>
 *      #define GET_YEAR(_time_)          (((_time_)>>26) + 2000) <br>
 *      #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br>
 *      #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br>
 *      #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br>
 *      #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br>
 *      #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "byMode",
                       "byChannel",
                       "bySmart",
                       "byRes1",
                       "struDevInfo",
                       "uStatModeParam",
                       "dwLeaveNum",
                       "dwEnterNum",
                       "byBrokenNetHttp",
                       "byRes3",
                       "wDevInfoIvmsChannelEx",
                       "dwPassingNum",
                       "byRes2"})
public class NET_DVR_PDC_ALRAM_INFO extends Structure {

  /**
   * PDC人流量报警上传结构体大小
   */
  public int dwSize;
  /**
   * 0 单帧统计结果 1最小时间段统计结果 2 信号量触发（结果存在“统计起始时间”&&“统计结束时间”）
   */
  public byte byMode;
  /**
   * 报警上传通道号
   */
  public byte byChannel;
  /**
   * 专业智能返回0，Smart 返回 1
   */
  public byte bySmart;
  /**
   * 保留字节
   */
  public byte byRes1;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 作为一个联合体 单帧的时候才有帧内目标信息 最小时间段统计结果需要统计时间 参数
   */
  public uStatModeParam uStatModeParam;
  /**
   * 离开人数
   */
  public int dwLeaveNum;
  /**
   * 进入人数
   */
  public int dwEnterNum;
  /**
   * 断网续传标志位，0-不是重传数据，1-重传数据
   */
  public byte byBrokenNetHttp;
  /**
   * 保留字节
   */
  public byte byRes3;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 经过人数（进入区域后徘徊没有触发进入、离开的人数）
   */
  public int dwPassingNum;
  /**
   * 保留字节
   */
  public byte[] byRes2 = new byte[32];

  public static class uStatModeParam extends Union {

    /**
     * 结构为实时统计结果参数
     */
    public struStatFrame struStatFrame;
    /**
     * 结构为周期统计或者信号量触发结果参数
     */
    public struStatTime struStatTime;
  }

  @FieldOrder({"dwRelativeTime",
               "dwAbsTime",
               "byTimeDiffFlag",
               "cTimeDifferenceH",
               "cTimeDifferenceM",
               "byRes"})
  public static class struStatFrame extends Structure {

    /**
     * 相对时标
     */
    public int dwRelativeTime;
    /**
     * 绝对时标
     */
    public int dwAbsTime;
    /**
     * 时差字段是否有效  0-时差无效， 1-时差有效
     */
    public byte byTimeDiffFlag;
    /**
     * 与UTC的时差（小时），-12 ... +14， +表示东区,，byTimeDiffFlag为1时有效
     */
    public byte cTimeDifferenceH;
    /**
     * 与UTC的时差（分钟），-30, 30, 45， +表示东区，byTimeDiffFlag为1时有效
     */
    public byte cTimeDifferenceM;
    /**
     * 保留
     */
    public byte[] byRes = new byte[89];
  }

  @FieldOrder({"tmStart",
               "tmEnd",
               "byTimeDifferenceFlag",
               "cStartTimeDifferenceH",
               "cStartTimeDifferenceM",
               "cStopTimeDifferenceH",
               "cStopTimeDifferenceM",
               "byRes"})
  public static class struStatTime extends Structure {

    /**
     * 统计起始时间
     */
    public NET_DVR_TIME tmStart;
    /**
     * 统计结束时间
     */
    public NET_DVR_TIME tmEnd;
    /**
     * 0-默认行为，cStartTimeDifferenceH,等时差信息无效，1-时差信息有效
     */
    public byte byTimeDifferenceFlag;
    /**
     * 开始时间与UTC的时差（小时），-12 ... +14，+表示东区
     */
    public byte cStartTimeDifferenceH;
    /**
     * 开始时间与UTC的时差（分钟），-30, 30, 45，+表示东区
     */
    public byte cStartTimeDifferenceM;
    /**
     * 结束时间与UTC的时差（小时），-12 ... +14，+表示东区
     */
    public byte cStopTimeDifferenceH;
    /**
     * 结束时间与UTC的时差（分钟），-30, 30, 45，+表示东区
     */
    public byte cStopTimeDifferenceM;
    /**
     * 保留
     */
    public byte[] byRes = new byte[87];
  }

}
