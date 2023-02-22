package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.EventMajorType;
import cn.labzen.hikvision.jna.definition.RecordFileType;
import com.sun.jna.Structure;
import com.sun.jna.Union;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 按事件搜索到的录像文件的信息结构体
 */
@Structure.FieldOrder({"wMajorType",
                       "wMinorType",
                       "struStartTime",
                       "struEndTime",
                       "struAddr",
                       "wChan",
                       "byRes",
                       "uSeniorRet"})
public class NET_DVR_SEARCH_EVENT_RET_V50 extends Structure {

  /**
   * 主类型，参考{@link EventMajorType}
   */
  public short wMajorType;
  /**
   * 次类型
   */
  public short wMinorType;
  /**
   * 事件开始的时间
   */
  public NET_DVR_TIME_SEARCH struStartTime;
  /**
   * 事件停止的时间，脉冲事件时和开始时间一样
   */
  public NET_DVR_TIME_SEARCH struEndTime;
  /**
   * 片段所在的地址信息，集群回放时用到
   */
  public NET_DVR_ADDRESS struAddr;
  /**
   * 事件触发的通道号，0xffff表示后续无效
   */
  public short[] wChan = new short[MAX_CHANNUM_V40];
  /**
   * 保留
   */
  public byte[] byRes = new byte[256];
  /**
   * 事件搜索结果联合体
   */
  public USeniorRet uSeniorRet;

  /**
   * 事件搜索结果联合体
   */
  @FieldOrder({"byLen",
               "struAlarmRet",
               "struMotionRet",
               "struVcaRet",
               "struInquestRet",
               "struStreamIDRet",
               "struPosRet",
               "struTrialRet",
               "struIOTRet"})
  public static class USeniorRet extends Union {

    /**
     * 联合体大小，800字节
     */
    public byte[] byLen = new byte[800];
    /**
     * 报警输入结果
     */
    public StruAlarmRet struAlarmRet;
    /**
     * 移动侦测结果
     */
    public StruMotionRet struMotionRet;
    /**
     * 行为分析结果
     */
    public StruVcaRet struVcaRet;
    /**
     * 审讯事件结果
     */
    public StruInquestRet struInquestRet;
    /**
     * 流id录像查询结果
     */
    public StruStreamIDRet struStreamIDRet;
    /**
     * POS录像查询结果
     */
    public StruPosRet struPosRet;
    /**
     * 庭审信息查询结果
     */
    public StruTrialRet struTrialRet;
    /**
     * 非视频通道查询结果
     */
    public StruIOTRet struIOTRet;
  }

  /**
   * 报警输入结果
   */
  @FieldOrder({"dwAlarmInNo",
               "byRes"})
  public static class StruAlarmRet extends Structure {

    /**
     * 报警输入号
     */
    public int dwAlarmInNo;
    /**
     * 保留
     */
    public byte[] byRes = new byte[796];
  }

  /**
   * 移动侦测结果
   */
  @FieldOrder({"dwMotDetNo",
               "byRes"})
  public static class StruMotionRet extends Structure {

    /**
     * 移动侦测通道
     */
    public int dwMotDetNo;
    /**
     * 保留
     */
    public byte[] byRes = new byte[796];
  }

  /**
   * 行为分析结果
   */
  @FieldOrder({"dwChanNo",
               "byRuleID",
               "byRes1",
               "byRuleName",
               "uEvent",
               "byRes"})
  public static class StruVcaRet extends Structure {

    /**
     * 触发事件的通道号
     */
    public int dwChanNo;
    /**
     * 规则ID
     */
    public byte byRuleID;
    /**
     * 保留
     */
    public byte[] byRes1 = new byte[3];
    /**
     * 规则名称
     */
    public byte[] byRuleName = new byte[NAME_LEN];
    /**
     * 行为事件参数
     */
    public NET_VCA_EVENT_UNION uEvent;
    /**
     * 保留
     */
    public byte[] byRes = new byte[668];
  }

  /**
   * 审讯事件结果
   */
  @FieldOrder({"byRoomIndex",
               "byDriveIndex",
               "byRes1",
               "dwSegmentNo",
               "wSegmetSize",
               "wSegmentState",
               "byRes2"})
  public static class StruInquestRet extends Structure {

    /**
     * 审讯室编号,从1开始
     */
    public byte byRoomIndex;
    /**
     * 刻录机编号,从1开始
     */
    public byte byDriveIndex;
    /**
     * 保留
     */
    public byte[] byRes1 = new byte[6];
    /**
     * 本片断在本次审讯中的序号,从1开始
     */
    public int dwSegmentNo;
    /**
     * 本片断的大小, 单位M
     */
    public short wSegmetSize;
    /**
     * 本片断状态 0 刻录正常，1 刻录异常，2 不刻录审讯
     */
    public short wSegmentState;
    /**
     * 保留
     */
    public byte[] byRes2 = new byte[784];
  }

  /**
   * 流id录像查询结果
   */
  @FieldOrder({"dwRecordType",
               "dwRecordLength",
               "byLockFlag",
               "byDrawFrameType",
               "byPosition",
               "byRes1",
               "byFileName",
               "dwFileIndex",
               "byTapeIndex",
               "byFileNameEx",
               "byRes"})
  public static class StruStreamIDRet extends Structure {

    /**
     * 录像类型，参考{@link RecordFileType}
     */
    public int dwRecordType;
    /**
     * 录像大小
     */
    public int dwRecordLength;
    /**
     * 锁定标志 0：没锁定 1：锁定
     */
    public byte byLockFlag;
    /**
     * 0：非抽帧录像 1：抽帧录像
     */
    public byte byDrawFrameType;
    /**
     * 文件所在存储位置：0-阵列上，1-带库机位上，可以直接下载，2-磁带库内，需要把磁盘切换到机位上，3-不在磁带库中，需要把磁盘插到磁带库中
     */
    public byte byPosition;
    /**
     * 保留
     */
    public byte byRes1;
    /**
     * 文件名
     */
    public byte[] byFileName = new byte[NAME_LEN];
    /**
     * 存档卷上的文件索引
     */
    public int dwFileIndex;
    /**
     * 文件所在磁带编号
     */
    public byte[] byTapeIndex = new byte[NET_SDK_MAX_TAPE_INDEX_LEN];
    /**
     * 文件名扩展
     */
    public byte[] byFileNameEx = new byte[NET_SDK_MAX_FILE_LEN];
    /**
     * 保留
     */
    public byte[] byRes = new byte[464];
  }

  /**
   * POS录像查询结果
   */
  @FieldOrder({"dwChanNo",
               "byRes"})
  public static class StruPosRet extends Structure {

    /**
     * 触发产生pos事件的通道
     */
    public int dwChanNo;
    /**
     * 保留
     */
    public byte[] byRes = new byte[796];
  }

  /**
   * 庭审信息查询结果
   */
  @FieldOrder({"byRoomIndex",
               "byDriveIndex",
               "wSegmetSize",
               "dwSegmentNo",
               "bySegmentState",
               "byCaseType",
               "byRes",
               "byCaseNo",
               "byCaseName",
               "byLitigant1",
               "byLitigant2",
               "byChiefJudge",
               "byRes1"})
  public static class StruTrialRet extends Structure {

    /**
     * 审讯室编号,从1开始
     */
    public byte byRoomIndex;
    /**
     * 刻录机编号,从1开始
     */
    public byte byDriveIndex;
    /**
     * 本片断的大小, 单位M
     */
    public short wSegmetSize;
    /**
     * 本片断在本次审讯中的序号,从1开始
     */
    public int dwSegmentNo;
    /**
     * 本片断状态，0-刻录正常，1-刻录异常，2-不刻录审讯
     */
    public byte bySegmentState;
    /**
     * 案件类型；0-全部、1-刑事案件、2-民事案件
     */
    public byte byCaseType;
    /**
     * 保留
     */
    public byte[] byRes = new byte[2];
    /**
     * 案件编号
     */
    public byte[] byCaseNo = new byte[CASE_NO_RET_LEN];
    /**
     * 案件名称；
     */
    public byte[] byCaseName = new byte[CASE_NAME_RET_LEN];
    /**
     * 当事人1；
     */
    public byte[] byLitigant1 = new byte[LITIGANT_RET_LEN];
    /**
     * 当事人2；
     */
    public byte[] byLitigant2 = new byte[LITIGANT_RET_LEN];
    /**
     * 审判长
     */
    public byte[] byChiefJudge = new byte[CHIEF_JUDGE_RET_LEN];
    /**
     * 保留
     */
    public byte[] byRes1 = new byte[600];
  }

  /**
   * 非视频通道查询结果
   */
  @FieldOrder({"dwChanNo",
               "byRes"})
  public static class StruIOTRet extends Structure {

    /**
     * 触发产生事件的通道号（事件源通道）
     */
    public int dwChanNo;
    /**
     * 保留
     */
    public byte[] byRes = new byte[796];

  }
}
