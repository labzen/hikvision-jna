package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 船只信息结构体
 */
@Structure.FieldOrder({"fShipsLength",
                       "fShipsHeight",
                       "fShipsWidth",
                       "fShipsSpeed",
                       "byShipsDirection",
                       "byShipsDetState",
                       "byTriggerLineID",
                       "byRes",
                       "struShipsRect"})
public class NET_DVR_SHIPSINFO extends Structure {

  /**
   * 船只长度；1~1000.0m，精确到小数点后一位
   */
  public float fShipsLength;
  /**
   * 船只高度；1~1000.0m，精确到小数点后一位
   */
  public float fShipsHeight;
  /**
   * 船只宽度；1~1000.0m，精确到小数点后一位
   */
  public float fShipsWidth;
  /**
   * 船只速度；1~1000.0m/s，精确到小数点后一位
   */
  public float fShipsSpeed;
  /**
   * 船只方向；0~up,1~down,2~left,3~right
   */
  public byte byShipsDirection;
  /**
   * 船只检测状态；0~正跨越检测线，1~船头检测，2~船尾检测
   */
  public byte byShipsDetState;
  /**
   * 检测线ID
   */
  public byte byTriggerLineID;
  /**
   * 保留
   */
  public byte[] byRes = new byte[61];
  /**
   * 船只区域，归一化值，相对于大图（可见光图、热成像图)的分辨率
   */
  public NET_VCA_POLYGON struShipsRect;
}
