package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.ExternalDeviceStatus;
import cn.labzen.hikvision.jna.definition.ExternalDeviceType;
import com.sun.jna.Structure;
import com.sun.jna.Union;

import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 出入口控制机报警数据结构体
 */
@Structure.FieldOrder({"dwSize",
                       "byAlarmType",
                       "byExternalDevType",
                       "byExternalDevStatus",
                       "byRes",
                       "struAlarmTime",
                       "uAlarmInfo",
                       "byRes2"})
public class NET_DVR_GATE_ALARMINFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 0x1车辆非法侵入报警 , 0x2道闸超时未关报警 , 0x3车辆压线圈超时报警 , 0x4发卡报警（无卡） , 0x5发卡报警（少卡） , 0x6发卡报警（发卡异常）
   */
  public byte byAlarmType;
  /**
   * 外接设备类型，参考{@link ExternalDeviceType}
   */
  public byte byExternalDevType;
  /**
   * 外接设备类型，参考{@link ExternalDeviceStatus}
   */
  public byte byExternalDevStatus;
  /**
   * 保留
   */
  public byte byRes;
  /**
   * 报警时间
   */
  public NET_DVR_TIME_V30 struAlarmTime;
  /**
   * 报警信息联合体
   */
  public uAlarmInfo uAlarmInfo;
  /**
   * 预留
   */
  public byte[] byRes2 = new byte[64];

  @FieldOrder({"uLen",
               "struVehicleInfo"})
  public static class uAlarmInfo extends Union {

    /**
     * 联合体长度，128字节
     */
    public byte[] uLen = new byte[128];
    /**
     * 为车辆报警信息结构体(byAlarmType为0x1时有效)
     */
    public struVehicleInfo struVehicleInfo;
  }

  @FieldOrder({"sLicense",
               "byVehicleType",
               "byRes1"})
  public static class struVehicleInfo extends Structure {

    /**
     * 车牌号码
     */
    public byte[] sLicense = new byte[MAX_LICENSE_LEN];
    /**
     * 车辆类型0-保留 1-固定车，2-临时车，3-预订车，4-联检车，5-授权车
     */
    public byte byVehicleType;
    /**
     * 保留
     */
    public byte[] byRes1 = new byte[111];
  }
}
