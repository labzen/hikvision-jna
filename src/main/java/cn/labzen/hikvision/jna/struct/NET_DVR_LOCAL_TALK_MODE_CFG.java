package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 对讲模式配置结构体
 * <p/>
 * V4.2.2.5及以前版本SDK均采用windows API实现相关功能。之后版本默认使用语音对讲库的方式，
 * 语音对讲库模式下必须加载AudioIntercom.dll和OpenAL32.dll。
 */
@Structure.FieldOrder({"byTalkMode",
                       "byRes"})
public class NET_DVR_LOCAL_TALK_MODE_CFG extends Structure {

  /**
   * 对讲模式，0-使用对讲库（默认），1-使用windows api模式
   */
  public byte byTalkMode;
  /**
   * 保留
   */
  public byte[] byRes = new byte[127];

}
