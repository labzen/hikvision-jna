package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

/**
 * 行为分析结果上报结构
 * <p/>
 * <ul>
 *   <li>如当前报警通道存在关联通道时，针对同一报警事件，会对关联通道进行抓图并上传，这些图片数据分多次上传，
 *   其中报警事件信息一致。可通过字段dwAlarmID对这些报警进行区分组合，由byRelAlarmPicNum获取关联通道的抓拍图片数量，
 *   其中报警图片总数量为byRelAlarmPicNum + 1，从而得到当前报警事件的多张图片。 </li>
 *   <li>相对时标暂未使用。从绝对时标dwAbsTime解析得到“年月日时分秒”的算法如下所示： <br/>
 *      #define GET_YEAR(_time_)          (((_time_)>>26) + 2000)  <br/>
 *      #define GET_MONTH(_time_)       (((_time_)>>22) & 15) <br/>
 *      #define GET_DAY(_time_)           (((_time_)>>17) & 31) <br/>
 *      #define GET_HOUR(_time_)         (((_time_)>>12) & 31) <br/>
 *      #define GET_MINUTE(_time_)      (((_time_)>>6) & 63) <br/>
 *      #define GET_SECOND(_time_)     (((_time_)>>0) & 63) </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "struRuleInfo",
                       "struTargetInfo",
                       "struDevInfo",
                       "dwPicDataLen",
                       "byPicType",
                       "byRelAlarmPicNum",
                       "bySmart",
                       "byPicTransType",
                       "dwAlarmID",
                       "wDevInfoIvmsChannelEx",
                       "byRelativeTimeFlag",
                       "byAppendInfoUploadEnabled",
                       "pAppendInfo",
                       "pImage"})
public class NET_VCA_RULE_ALARM extends Structure {

  /**
   * 结构长度
   */
  public int dwSize;
  /**
   * 相对时标,历史原因，实际没用，本版本用起来当byRelativeTimeFlag为1时，表示为UTC的时间
   */
  public int dwRelativeTime;
  /**
   * 绝对时标,历史原因，这里实际为OSD时间
   */
  public int dwAbsTime;
  /**
   * 事件规则信息
   */
  public NET_VCA_RULE_INFO struRuleInfo;
  /**
   * 报警目标信息
   */
  public NET_VCA_TARGET_INFO struTargetInfo;
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 返回图片的长度 为0表示没有图片，大于0表示该结构后面紧跟图片数据
   */
  public int dwPicDataLen;
  /**
   * 0-触发抓拍图片 1-对比图片
   */
  public byte byPicType;
  /**
   * 关联通道报警图片数量
   */
  public byte byRelAlarmPicNum;
  /**
   * IDS设备返回0(默认值)，Smart Functiom Return 1
   */
  public byte bySmart;
  /**
   * 图片数据传输方式: 0-二进制；1-url
   */
  public byte byPicTransType;
  /**
   * 报警ID，用以标识通道间关联产生的组合报警，0表示无效
   */
  public int dwAlarmID;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * dwRelativeTime字段是否有效  0-无效， 1-有效，dwRelativeTime表示UTC时间
   */
  public byte byRelativeTimeFlag;
  /**
   * 附加信息上传使能 0-不上传 1-上传
   */
  public byte byAppendInfoUploadEnabled;
  /**
   * 指向附加信息NET_VCA_APPEND_INFO的指针，byAppendInfoUploadEnabled为1时或者byTimeDiffFlag为1时有效
   */
  public ByteByReference pAppendInfo;
  /**
   * 指向图片的指针
   */
  public ByteByReference pImage;
}
