package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.RecordFileType;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.CARDNUM_LEN_OUT;
import static cn.labzen.hikvision.jna.Constants.GUID_LEN;

/**
 * 文件查找条件结构体
 */
@Structure.FieldOrder({"lChannel",
                       "dwFileType",
                       "dwIsLocked",
                       "dwUseCardNo",
                       "sCardNumber",
                       "struStartTime",
                       "struStopTime",
                       "byDrawFrame",
                       "byFindType",
                       "byQuickSearch",
                       "bySpecialFindInfoType",
                       "dwVolumeNum",
                       "byWorkingDeviceGUID",
                       "uSpecialFindInfo",
                       "byStreamType",
                       "byAudioFile",
                       "byRes2"})
public class NET_DVR_FILECOND_V40 extends Structure {

  /**
   * 通道号
   */
  public NativeLong lChannel;
  /**
   * 录象文件类型（根据dwUseCardNo参数是否带卡号查找分为两类）
   * <p/>
   * 参考{@link RecordFileType}
   */
  public int dwFileType;
  /**
   * 是否锁定：0-未锁定文件，1-锁定文件，0xff表示所有文件（包括锁定和未锁定）
   */
  public int dwIsLocked;
  /**
   * 是否带ATM信息进行查询：0-不带ATM信息，1-按交易卡号查询，2-按交易类型查询，3-按交易金额查询，
   * 4-按卡号、交易类型及交易金额的组合查询，5-按课程名称查找，此时卡号表示课程名称
   */
  public int dwUseCardNo;
  /**
   * dwUseCardNo为1、4时表示卡号，有效字符个数为20；dwUseCardNo为5时表示课程名称
   */
  public byte[] sCardNumber = new byte[CARDNUM_LEN_OUT];
  /**
   * 开始时间
   */
  public NET_DVR_TIME struStartTime;
  /**
   * 结束时间
   */
  public NET_DVR_TIME struStopTime;
  /**
   * 是否抽帧：0:不抽帧，1：抽帧
   */
  public byte byDrawFrame;
  /**
   * 0- 查询普通卷，1- 查询存档卷(适用于CVR设备，普通卷用于通道录像，存档卷用于备份录像)，2- 查询N+1录像文件
   */
  public byte byFindType;
  /**
   * 0- 普通查询，1- 快速（日历）查询，快速查询速度快于普通查询但是相关的录像信息减少（比如没有文件名、文件类型等）
   */
  public byte byQuickSearch;
  /**
   * 专有查询类型：0-无效，1-带ATM信息的查询
   */
  public byte bySpecialFindInfoType;
  /**
   * 存档卷号，适用于CVR设备
   */
  public int dwVolumeNum;
  /**
   * 工作机GUID，通过获取N+1设备信息（NET_DVR_WORKING_DEVICE_INFO）得到，byFindType为2时有效。
   * TODO NET_DVR_WORKING_DEVICE_INFO
   */
  public byte[] byWorkingDeviceGUID = new byte[GUID_LEN];
  /**
   * 专有查询条件联合体
   */
  public NET_DVR_SPECIAL_FINDINFO_UNION uSpecialFindInfo;
  /**
   * 码流类型：0- 主码流优先（同一个时间段只返回一种录像，优先级顺序为：主码流、子码流、三码流），1- 子码流，2- 三码流，
   * 3- 只搜索返回主码流录像，254- 双码流搜索(优先返回主码流录像，没有主码流录像时返回子码流录像)，0xff- 全部
   */
  public byte byStreamType;
  /**
   * 查找音频文件：0- 不搜索音频文件，1- 搜索音频文件，该功能需要设备支持，启动音频搜索后只搜索音频文件
   */
  public byte byAudioFile;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[30];
}
