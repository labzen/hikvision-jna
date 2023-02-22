package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.EventMajorType;
import com.sun.jna.Structure;
import com.sun.jna.Union;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 按事件搜索的条件参数结构体
 */
@Structure.FieldOrder({"wMajorType",
                       "wMinorType",
                       "struStartTime",
                       "struEndTime",
                       "byLockType",
                       "byQuickSearch",
                       "byRes",
                       "uSeniorParam"})
public class NET_DVR_SEARCH_EVENT_PARAM_V50 extends Structure {

  /**
   * 搜索主类型，参考{@link EventMajorType}
   */
  public short wMajorType;
  /**
   * 搜索次类型，根据主类型变化，0xffff表示全部。移动侦测、报警输入和POS录像没有次类型，直接设置为0xffff
   */
  public short wMinorType;
  /**
   * 搜索的开始时间: 同时为(0, 0) 表示从最早的时间开始，到最后，最前面的4000个事件
   */
  public NET_DVR_TIME_SEARCH_COND struStartTime;
  /**
   * 搜索的停止时间: 同时为(0, 0) 表示从最早的时间开始，到最后，最前面的4000个事件
   */
  public NET_DVR_TIME_SEARCH_COND struEndTime;
  /**
   * 是否锁定：0xff-全部，0-未锁，1-锁定
   */
  public byte byLockType;
  /**
   * 是否启用快速查询，0-不启用，1-启用（快速查询不会返回文件大小，仅对设备数据库进行查询，避免频繁唤醒硬盘）
   */
  public byte byQuickSearch;
  /**
   * 保留
   */
  public byte[] byRes = new byte[254];
  /**
   * 事件搜索参数联合体
   */
  public USeniorParam uSeniorParam;

  /**
   * 事件搜索参数联合体
   */
  @FieldOrder({"byLen",
               "struAlarmParam",
               "struMotionParam",
               "struVcaParam",
               "struInquestParam",
               "struVCADetect",
               "struStreamIDParam",
               "struTrialParam",
               "struPosAlarm",
               "struACSAlarm",
               "struIOTAlarm"})
  public static class USeniorParam extends Union {

    /**
     * 联合体大小，800字节
     */
    public byte[] byLen = new byte[SEARCH_EVENT_INFO_LEN_V40];
    /**
     * 报警输入参数
     */
    public StruAlarmParam struAlarmParam;
    /**
     * 移动侦测参数
     */
    public StruMotionParam struMotionParam;
    /**
     * 行为分析参数
     */
    public StruVcaParam struVcaParam;
    /**
     * 审讯事件参数
     */
    public StruInquestParam struInquestParam;
    /**
     * 智能侦测参数
     */
    public StruVCADetect struVCADetect;
    /**
     * 流ID参数
     */
    public StruStreamIDParam struStreamIDParam;
    /**
     * 庭审信息查询条件
     */
    public StruTrialParam struTrialParam;
    /**
     * POS录像查询条件
     */
    public StruPosAlarm struPosAlarm;
    /**
     * 门禁事件搜索条件
     */
    public StruACSAlarm struACSAlarm;
    /**
     * 非视频联动事件搜索条件
     */
    public StruIOTAlarm struIOTAlarm;
  }

  /**
   * 报警输入参数
   */
  @FieldOrder({"wAlarmInNo",
               "byRes"})
  public static class StruAlarmParam extends Structure {

    /**
     * 报警输入号，按值表示，采用紧凑型排列，0xffff表示后续无效，
     * 例如wAlarmInNo[0]==1&&wAlarmInNo[1]==2表示查找由报警输入1和报警输入2触发的事件
     */
    public short[] wAlarmInNo = new short[128];
    /**
     * 保留
     */
    public byte[] byRes = new byte[544];
  }

  /**
   * 移动侦测参数
   */
  @FieldOrder({"wMotDetChanNo",
               "byRes"})
  public static class StruMotionParam extends Structure {

    /**
     * 设备通道号，按值表示，采用紧凑型排列，0xffff表示后续无效，
     * 例如wMotDetChanNo[0]==1&&wMotDetChanNo[1]==2表示查找通道1和通道2发生移动侦测触发的事件
     */
    public short[] wMotDetChanNo = new short[MAX_CHANNUM_V30];
    /**
     * 保留
     */
    public byte[] byRes = new byte[672];
  }

  /**
   * 行为分析参数
   */
  @FieldOrder({"wChanNo",
               "byRuleID",
               "byRes"})
  public static class StruVcaParam extends Structure {

    /**
     * 行为分析对应的通道，按值表示，采用紧凑型排列，0xffff表示后续无效，
     * 例如wChanNo[0]==1&&wChanNo[1]==2表示查找通道1和通道2发生行为分析触发的事件
     */
    public short[] wChanNo = new short[MAX_CHANNUM_V30];
    /**
     * 规则ID，0xff表示全部
     */
    public byte byRuleID;
    /**
     * 保留
     */
    public byte[] byRes = new byte[671];
  }

  /**
   * 审讯事件参数
   */
  @FieldOrder({"byRoomIndex",
               "byRes"})
  public static class StruInquestParam extends Structure {

    /**
     * 审讯室编号,从1开始
     */
    public byte byRoomIndex;
    /**
     * 保留
     */
    public byte[] byRes = new byte[799];
  }

  /**
   * 智能侦测参数
   */
  @FieldOrder({"byAll",
               "byRes1",
               "wChanNo",
               "byRes"})
  public static class StruVCADetect extends Structure {

    /**
     * 0- 按具体给出的通道号查找，1- 查找全部通道，此时dwChanNo参数无效
     */
    public byte byAll;
    /**
     * 保留
     */
    public byte[] byRes1 = new byte[3];
    /**
     * 智能侦测对应的通道，按值表示，采用紧凑型排列，0xffff表示后续无效，
     * wChanNo[0]==1&&wChanNo[1]==2表示查找通道1和通道2的智能侦测事件
     */
    public short[] wChanNo = new short[MAX_CHANNUM_V30];
    /**
     * 保留
     */
    public byte[] byRes = new byte[668];
  }

  /**
   * 流ID参数
   */
  @FieldOrder({"struIDInfo",
               "dwCmdType",
               "byBackupVolumeNum",
               "byRes1",
               "byArchiveLabel",
               "byRes"})
  public static class StruStreamIDParam extends Structure {

    /**
     * 流id信息，72字节长
     */
    public NET_DVR_STREAM_INFO struIDInfo;
    /**
     * 外部触发类型，NVR接入云存储使用
     */
    public int dwCmdType;
    /**
     * 存档卷号，CVR使用
     */
    public byte byBackupVolumeNum;
    /**
     * 保留
     */
    public byte[] byRes1 = new byte[3];
    /**
     * 存档标签，CVR使用
     */
    public byte[] byArchiveLabel = new byte[64];
    /**
     * 保留
     */
    public byte[] byRes = new byte[656];
  }

  /**
   * 庭审信息查询条件
   */
  @FieldOrder({"byCaseNo",
               "byCaseName",
               "byLitigant1",
               "byLitigant2",
               "byChiefJudge",
               "byCaseType",
               "byRes"})
  public static class StruTrialParam extends Structure {

    /**
     * 案件编号
     */
    public byte[] byCaseNo = new byte[SEARCH_CASE_NO_LEN];
    /**
     * 案件名称
     */
    public byte[] byCaseName = new byte[SEARCH_CASE_NAME_LEN];
    /**
     * 当事人1
     */
    public byte[] byLitigant1 = new byte[SEARCH_LITIGANT_LEN];
    /**
     * 当事人2
     */
    public byte[] byLitigant2 = new byte[SEARCH_LITIGANT_LEN];
    /**
     * 审判长
     */
    public byte[] byChiefJudge = new byte[SEARCH_CHIEF_JUDGE_LEN];
    /**
     * 案件类型：0- 全部，1- 刑事案件，2- 民事案件
     */
    public byte[] byCaseType;
    /**
     * 保留
     */
    public byte[] byRes = new byte[547];
  }

  /**
   * POS录像查询条件
   */
  @FieldOrder({"wChannel",
               "byAllChan",
               "byCaseSensitive",
               "byCombinateMode",
               "byRes1",
               "sKeyWord",
               "byRes"})
  public static class StruPosAlarm extends Structure {

    /**
     * 通道号，按值表示，采用紧凑型排列，0xffff表示后续无效，wChannel[0]==1&&wChannel[1]==2表示查找通道1和通道2的POS录像
     */
    public short[] wChannel = new short[MAX_CHANNUM_V30];
    /**
     * 是否查找全部通道，0-否，此时wChannel有效，1-全部通道，此时wChannel无效
     */
    public byte byAllChan;
    /**
     * 是否区分大小写：0-不区分大小写， 1-区分大小写
     */
    public byte byCaseSensitive;
    /**
     * 关键字组合方式，0-或，1-与
     */
    public byte byCombinateMode;
    /**
     * 保留
     */
    public byte byRes1;
    /**
     * 关键字查找时的条件
     */
    public byte[] sKeyWord = new byte[MAX_POS_KEYWORDS_NUM * MAX_POS_KEYWORD_LEN];
    /**
     * 保留
     */
    public byte[] byRes = new byte[284];
  }

  /**
   * 门禁事件搜索条件
   */
  @FieldOrder({"dwMajor",
               "dwMinor",
               "byCardNo",
               "byName",
               "byMACAddr",
               "byRes"})
  public static class StruACSAlarm extends Structure {

    /**
     * 报警主类型（与事件上传主类型一致，0代表全部）
     */
    public int dwMajor;
    /**
     * 报警次类型（与事件上传主类型一致，0代表全部）
     */
    public int dwMinor;
    /**
     * 卡号
     */
    public byte[] byCardNo = new byte[ACS_CARD_NO_LEN];
    /**
     * 姓名
     */
    public byte[] byName = new byte[NAME_LEN];
    /**
     * 物理MAC地址
     */
    public byte[] byMACAddr = new byte[MACADDR_LEN];
    /**
     * 保留
     */
    public byte[] byRes = new byte[722];
  }

  /**
   * 非视频联动事件搜索条件
   */
  @FieldOrder({"wDeviceType",
               "wEventType",
               "wChannel",
               "byAllChan",
               "byCaseSensitive",
               "byCombinateMode",
               "bySearchType",
               "sKeyWord",
               "wZoneNo",
               "byRes"})
  public static class StruIOTAlarm {

    /**
     * 设备类型,0-海康门禁主机，1-海康可视对讲设备, 2-海康报警主机（预留） 3-GJD报警主机 4-Luminite报警主机,
     * 5-OPTEX报警主机,6-cameraDetector模拟相机传感器设备
     */
    public short wDeviceType;
    /**
     * 搜索次类型- 根据主类型变化，0xffff表示全部
     */
    public short wEventType;
    /**
     * 通道号，按值表示,紧凑型排列，遇到0xffff时表示数组后续值无效
     */
    public short[] wChannel = new short[MAX_CHANNUM_V30];
    /**
     * 是否查找全部通道，0-否，此时wChannel有效，1-全部通道，此时wChannel无效
     */
    public byte byAllChan;
    /**
     * 0-不区分大小写， 1-区分大小写
     */
    public byte byCaseSensitive;
    /**
     * 关键字组合方式，0-或，1-与
     */
    public byte byCombinateMode;
    /**
     * 搜索方式：0-按视频源搜索（此时通道号为视频通道号）
     */
    public byte bySearchType;
    /**
     * 关键字查找时的条件
     */
    public byte[] sKeyWord = new byte[MAX_POS_KEYWORDS_NUM * MAX_POS_KEYWORD_LEN];
    /**
     * 防区号，仅当设备类型为海康报警主机，次类型为防区（wEventType为1）时有效
     */
    public short wZoneNo;
    /**
     * 保留
     */
    public byte[] byRes = new byte[278];
  }
}
