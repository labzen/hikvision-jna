package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 能力集解析库配置结构体
 * <p/>
 * 模拟能力集默认禁用，调用该接口可以启用模拟能力集，支持获取设备各种能力。
 * 如果需要获取能力集（NET_DVR_GetDeviceAbility），可以调用此接口来启用模拟能力集，
 * 并且需要加载LocalXml.zip（要求和SDK库文件放在同一个目录下）。
 * TODO NET_DVR_GetDeviceAbility
 */
@Structure.FieldOrder({"byEnableAbilityParse",
                       "byRes"})
public class NET_DVR_LOCAL_ABILITY_PARSE_CFG extends Structure {

  /**
   * 使用能力集解析库：0-不使用，1-使用，默认不使用
   */
  public byte byEnableAbilityParse;
  /**
   * 保留
   */
  public byte[] byRes = new byte[127];

}
