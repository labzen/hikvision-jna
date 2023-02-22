package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 模块服务配置结构体
 * <p/>
 * <ul>
 *   <li>只允许admin用户设置telnet配置。 </li>
 *   <li>ABF：自动后焦距，实现Sensor传感器调焦，而普通的调焦模式是镜头的电子或者手动的调焦。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "byIrLampServer",
                       "bytelnetServer",
                       "byABFServer",
                       "byEnableLEDStatus",
                       "byEnableAutoDefog",
                       "byEnableSupplementLight",
                       "byEnableDeicing",
                       "byEnableVisibleMovementPower",
                       "byEnableThermalMovementPower",
                       "byEnablePtzPower",
                       "byPowerSavingControl"})
public class NET_DVR_DEVSERVER_CFG extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 红外灯设置 0～禁用，1～启用
   */
  public byte byIrLampServer;
  /**
   * telnet设置 0～禁用，1～启用
   */
  public byte bytelnetServer;
  /**
   * ABF设置 0～启用，1～禁用
   */
  public byte byABFServer;
  /**
   * 状态指示灯控制 0～禁用，1～启用
   */
  public byte byEnableLEDStatus;
  /**
   * 自动除雾控制 0～启用，1～禁用
   */
  public byte byEnableAutoDefog;
  /**
   * 补光灯控制0-启用，1-禁用
   */
  public byte byEnableSupplementLight;
  /**
   * 除冰功能 0-关闭，1-开启
   */
  public byte byEnableDeicing;
  /**
   * 可见光机芯电源开关 0-关闭，1-开启
   */
  public byte byEnableVisibleMovementPower;
  /**
   * 热成像机芯电源开关 0-关闭，1-开启
   */
  public byte byEnableThermalMovementPower;
  /**
   * 云台电源开关 0-关闭，1-开启
   */
  public byte byEnablePtzPower;
  /**
   * 低功耗策略 0-保留 1-休眠模式 2-低功耗模式 低功耗模式下 可见光机芯电源、热成像机芯电源、云台电源控制生效
   */
  public byte byPowerSavingControl;
  /**
   * 保留
   */
  public byte[] byRes = new byte[245];

}
