package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.SdkInitConfigurationMaximum;
import com.sun.jna.Structure;

/**
 * 初始化能力参数结构体
 * <p/>
 * SDK默认支持路数为2048路，路数能力增加，对PC性能、网络带宽要求则更高。
 *
 * @see SdkInitConfigurationMaximum
 */
@Structure.FieldOrder({"enumMaxLoginUsersNum",
                       "enumMaxAlarmNum",
                       "byRes"})
public class NET_DVR_INIT_CFG_ABILITY extends Structure {

  /**
   * 最大注册用户个数
   *
   * @see SdkInitConfigurationMaximum
   */
  public int enumMaxLoginUsersNum;
  /**
   * 最大报警布防路数
   *
   * @see SdkInitConfigurationMaximum
   */
  public int enumMaxAlarmNum;
  /**
   * 保留
   */
  public byte[] byRes = new byte[64];
}
