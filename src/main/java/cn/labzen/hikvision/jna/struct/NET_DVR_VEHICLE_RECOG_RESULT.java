package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.DATA_INDEX_LEN;
import static cn.labzen.hikvision.jna.Constants.MAX_LICENSE_LEN;

/**
 * 车辆二次识别结果信息结构体
 * <ul>
 *   <li>车辆主品牌对应的子品牌取值，需要相应设备提供品牌对应关系列表。 </li>
 *   <li>设备是否支持车辆二次识别能力（包括是否支持Json数据上传），可以通过设备能力集进行判断，对应车辆二次识别检测能
 *   力集(VehicleRecogAbility)，相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_ABILITY_INFO。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "sDataIndex",
                       "wTaskNo",
                       "byRes",
                       "struPlateRect",
                       "sLicense",
                       "byVehicleType",
                       "byColorDepth",
                       "byColor",
                       "byVehicleLogoRecog",
                       "byVehicleSubLogoRecog",
                       "byPilotSafebelt",
                       "byCopilotSafebelt",
                       "byPilotSunVisor",
                       "byCopilotSunVisor",
                       "byVehicleModel",
                       "wVehicleLogoRecog",
                       "byRes1",
                       "byDataType",
                       "dwPicType",
                       "pVehicleBuffer",
                       "dwVehicleBufferLen",
                       "pPlateBuffer",
                       "dwPlateBufferLen",
                       "pPilotFaceBuffer",
                       "dwPilotFaceBufferLen",
                       "pCopilotFaceBuffer",
                       "dwCopilotFaceBufferLen",
                       "pPilotSafebeltBuffer",
                       "dwPilotSafebeltBufferLen",
                       "pCopilotSafebeltBuffer",
                       "dwCopilotSafebeltBufferLen",
                       "struVehicleRect",
                       "struPilotRect",
                       "struCopilotRect",
                       "pJsonBuffer",
                       "dwJsonBufferLen",
                       "dwPostID",
                       "struPostTime",
                       "byRes2"})
public class NET_DVR_VEHICLE_RECOG_RESULT extends Structure {

  /**
   * 结构大小
   */
  public int dwSize;
  /**
   * 数据流水号 和（任务提交NET_DVR_VEHICLE_RECOG_CFG中的字段sDataIndex对应）
   */
  public byte[] sDataIndex = new byte[DATA_INDEX_LEN];
  /**
   * 任务处理号，与布防连接(NET_DVR_SETUPALARM_PARAM)和车辆二次识别任务提交(NET_DVR_VEHICLE_RECOG_CFG)里面的wTaskNo都是对应的
   */
  public short wTaskNo;
  /**
   * 保留
   */
  public byte[] byRes = new byte[2];
  /**
   * 车牌位置
   */
  public NET_VCA_RECT struPlateRect;
  /**
   * 车牌号码
   */
  public byte[] sLicense = new byte[MAX_LICENSE_LEN];
  /**
   * 车辆类型，参考VTR_RESULT
   */
  public byte byVehicleType;
  /**
   * 车身颜色深浅，参考 0-深色，1-浅色
   */
  public byte byColorDepth;
  /**
   * 车身颜色,  参考VCR_CLR_CLASS
   */
  public byte byColor;
  /**
   * 车辆主品牌
   */
  public byte byVehicleLogoRecog;
  /**
   * 车辆子品牌
   */
  public byte byVehicleSubLogoRecog;
  /**
   * 0-表示未知,1-不系安全带,2-系安全带
   */
  public byte byPilotSafebelt;
  /**
   * 0-表示未知,1-不系安全带,2-系安全带
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
   * 参考文档  车辆子品牌年款
   */
  public byte byVehicleModel;
  /**
   * 车辆主品牌，参考"车辆主品牌.xlsx"
   */
  public short wVehicleLogoRecog;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[251];
  /**
   * 数据上传方式：0-数据直接上传；1-云存储服务器URL（原先的图片数据变成URL数据，图片长度变成URL长度）
   */
  public byte byDataType;
  /**
   * 上传图片类型信息，0表示无图片信息，其他取值按位表示：bit0-车辆图：0-不上传，1-上传；  bit1-车牌图：0-不上传，1-上传；  bit2-人脸子图(主驾驶)：0-不上传，1-上传；  bit3-人脸子图(副驾驶)：0-不上传，1-上传；  bit4-安全带识别(主驾驶)：0-不上传，1-上传；  bit5-安全带识别(副驾驶)：0-不上传，1-上传；
   */
  public int dwPicType;
  /**
   * 车辆图片数据指针
   */
  public ByteByReference pVehicleBuffer;
  /**
   * 车辆图片数据长度
   */
  public int dwVehicleBufferLen;
  /**
   * 车牌图片数据指针
   */
  public ByteByReference pPlateBuffer;
  /**
   * 车牌图片数据长度
   */
  public int dwPlateBufferLen;
  /**
   * 人脸子图(主驾驶)图片数据指针
   */
  public ByteByReference pPilotFaceBuffer;
  /**
   * 人脸子图(主驾驶)图片数据长度
   */
  public int dwPilotFaceBufferLen;
  /**
   * 人脸子图(副驾驶)图片数据指针
   */
  public ByteByReference pCopilotFaceBuffer;
  /**
   * 人脸子图(副驾驶)图片数据长度
   */
  public int dwCopilotFaceBufferLen;
  /**
   * 安全带识别(主驾驶)图片数据指针
   */
  public ByteByReference pPilotSafebeltBuffer;
  /**
   * 安全带识别(主驾驶)图片数据长度
   */
  public int dwPilotSafebeltBufferLen;
  /**
   * 安全带识别(副驾驶)图片数据指针
   */
  public ByteByReference pCopilotSafebeltBuffer;
  /**
   * 安全带识别(副驾驶)图片数据长度
   */
  public int dwCopilotSafebeltBufferLen;
  /**
   * 车身矩形坐标
   */
  public NET_VCA_RECT struVehicleRect;
  /**
   * 主驾驶矩形坐标
   */
  public NET_VCA_RECT struPilotRect;
  /**
   * 副驾驶矩形坐标
   */
  public NET_VCA_RECT struCopilotRect;
  /**
   * Json数据指针,参考JSON数据格式
   */
  public ByteByReference pJsonBuffer;
  /**
   * Json数据长度
   */
  public int dwJsonBufferLen;
  /**
   * 卡口ID
   */
  public int dwPostID;
  /**
   * 过车时间
   */
  public NET_DVR_TIME_V30 struPostTime;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[56];
}
