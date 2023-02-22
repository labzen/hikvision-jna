package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.*;

/**
 * 违章取证报警信息结构体
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
                       "dwIllegalType",
                       "dwIllegalDuration",
                       "byMonitoringSiteID",
                       "byDeviceID",
                       "struDevInfo",
                       "struSceneInfo",
                       "struBeginRecTime",
                       "struEndRecTime",
                       "struAIDInfo",
                       "struPlateInfo",
                       "struVehicleInfo",
                       "dwPicNum",
                       "struPicInfo",
                       "bySpecificVehicleType",
                       "byLaneNo",
                       "byRes1",
                       "struTime",
                       "dwSerialNo",
                       "byVehicleAttribute",
                       "byPilotSafebelt",
                       "byCopilotSafebelt",
                       "byPilotSunVisor",
                       "byCopilotSunVisor",
                       "byPilotCall",
                       "byRes2",
                       "byIllegalCode",
                       "wCountry",
                       "byRegion",
                       "byCrossLine",
                       "byParkingSerialNO",
                       "byCrossSpaces",
                       "byAngledParking",
                       "byAlarmValidity",
                       "byDoorsStatus",
                       "byRes"})
public class NET_DVR_TFS_ALARM extends Structure {

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
   * 违章类型，采用国标定义，当dwIllegalType值为0xffffffff时使用byIllegalCode
   */
  public int dwIllegalType;
  /**
   * 违法持续时间（单位：秒） = 抓拍最后一张图片的时间 - 抓拍第一张图片的时间
   */
  public int dwIllegalDuration;
  /**
   * 监测点编号（路口编号、内部编号）
   */
  public byte[] byMonitoringSiteID = new byte[MONITORSITE_ID_LEN];
  /**
   * 设备编号
   */
  public byte[] byDeviceID = new byte[DEVICE_ID_LEN];
  /**
   * 前端设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 场景信息
   */
  public NET_DVR_SCENE_INFO struSceneInfo;
  /**
   * 录像开始时间
   */
  public NET_DVR_TIME_EX struBeginRecTime;
  /**
   * 录像结束时间
   */
  public NET_DVR_TIME_EX struEndRecTime;
  /**
   * 交通事件信息
   */
  public NET_DVR_AID_INFO struAIDInfo;
  /**
   * 车牌信息
   */
  public NET_DVR_PLATE_INFO struPlateInfo;
  /**
   * 车辆信息
   */
  public NET_DVR_VEHICLE_INFO struVehicleInfo;
  /**
   * 图片数量
   */
  public int dwPicNum;
  /**
   * 图片信息，最多8张
   */
  public NET_ITS_PICTURE_INFO[] struPicInfo = new NET_ITS_PICTURE_INFO[8];
  /**
   * 具体车辆种类  参考识别结果类型VTR_RESULT
   */
  public byte bySpecificVehicleType;
  /**
   * 关联车道号
   */
  public byte byLaneNo;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 手动跟踪定位，当前时间。
   */
  public NET_DVR_TIME_V30 struTime;
  /**
   * 序号；
   */
  public int dwSerialNo;
  /**
   * 车辆属性，按位表示，0- 无附加属性(普通车)，bit1- 黄标车(类似年检的标志)，bit2- 危险品车辆，值：0- 否，1- 是
   */
  public byte byVehicleAttribute;
  /**
   * 0-表示未知,1-系安全带,2-不系安全带
   */
  public byte byPilotSafebelt;
  /**
   * 0-表示未知,1-系安全带,2-不系安全带
   */
  public byte byCopilotSafebelt;
  /**
   * 0-表示未知,1-不打开遮阳板,2-打开遮阳板
   */
  public byte byPilotSunVisor;
  /**
   * 0-表示未知, 1-不打开遮阳板,2-打开遮阳板
   */
  public byte byCopilotSunVisor;
  /**
   * 0-表示未知, 1-不打电话,2-打电话
   */
  public byte byPilotCall;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[2];
  /**
   * 违法代码扩展，当dwIllegalType值为0xffffffff；使用这个值
   */
  public byte[] byIllegalCode = new byte[ILLEGAL_LEN];
  /**
   * 国家索引值,参照枚举COUNTRY_INDEX
   */
  public short wCountry;
  /**
   * 区域索引值,0-保留，1-欧洲(Europe Region)，2-俄语区域(Russian Region)，3-欧洲&俄罗斯(EU&CIS) , 4-中东（Middle East），0xff-所有
   */
  public byte byRegion;
  /**
   * 是否压线停车（侧方停车），0-表示未知，1-不压线，2-压线
   */
  public byte byCrossLine;
  /**
   * 泊车位编号
   */
  public byte[] byParkingSerialNO = new byte[SERIAL_NO_LEN];
  /**
   * 是否跨泊车位停车（侧方停车），0-表示未知，1-未跨泊车位停车，2-跨泊车位停车
   */
  public byte byCrossSpaces;
  /**
   * 是否倾斜停车（侧方停车）, 0-表示未知，1-未倾斜停车，2-倾斜停车
   */
  public byte byAngledParking;
  /**
   * 报警置信度，可以输出驶入驶出的置信度，范围0-100；置信度越高，事件真实性越高
   */
  public byte byAlarmValidity;
  /**
   * 车门状态 0-车门关闭 1-车门开启
   */
  public byte byDoorsStatus;
  /**
   * 保留
   */
  public byte[] byRes = new byte[44];
}
