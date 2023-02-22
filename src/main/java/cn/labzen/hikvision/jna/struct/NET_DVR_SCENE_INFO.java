package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 场景信息结构体
 */
@Structure.FieldOrder({"dwSceneID",
                       "bySceneName",
                       "byDirection",
                       "byRes1",
                       "struPtzPos",
                       "byRes2"})
public class NET_DVR_SCENE_INFO extends Structure {

  /**
   * 场景ID, 0 - 表示该场景无效
   */
  public int dwSceneID;
  /**
   * 场景名称
   */
  public byte[] bySceneName = new byte[NAME_LEN];
  /**
   * 监测方向 1-上行，2-下行，3-双向，4-由东向西，5-由南向北，6-由西向东，7-由北向南，8-其它
   */
  public byte byDirection;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[3];
  /**
   * Ptz 坐标
   */
  public NET_DVR_PTZPOS struPtzPos;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[64];
}
