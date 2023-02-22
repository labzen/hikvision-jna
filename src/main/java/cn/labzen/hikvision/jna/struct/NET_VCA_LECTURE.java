package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 授课参数结构体
 */
@Structure.FieldOrder({"struRegion",
                       "wDuration",
                       "bySensitivity",
                       "byAlarmState",
                       "byTrackingMode",
                       "byZoomMode",
                       "byZoomOver",
                       "byTrackStatus"})
public class NET_VCA_LECTURE extends Structure {

  /**
   * 区域范围
   */
  public NET_VCA_POLYGON struRegion;
  /**
   * 行为事件触发时间阈值: 1-10秒，建议1秒，判断是有效报警的时间
   */
  public short wDuration;
  /**
   * 灵敏度参数，范围[1-100]
   */
  public byte bySensitivity;
  /**
   * 只读字段界面不显示；0-保留,1-报警开始,2-报警结束
   */
  public byte byAlarmState;
  /**
   * 跟踪模式，0-自动(默认) , 1-水平, 2-垂直
   */
  public byte byTrackingMode;
  /**
   * 变倍模式, 0-固定(默认), 1-自动
   */
  public byte byZoomMode;
  /**
   * 0-保留,1-变倍到位(报警上传录播主机，作为切换画面判断依据)
   */
  public byte byZoomOver;
  /**
   * 跟踪状态 0-保留，1-开始授课（A，全景） 2-正在跟踪（2,特写），3 -跟踪丢失（2,全景）
   */
  public byte byTrackStatus;
}
