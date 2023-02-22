package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 声强陡升侦测参数结构体
 * <p/>
 * 声强陡升侦测功能的参数取值范围具体可以通过能力集获取：NET_DVR_GetDeviceAbility（报警事件处理能力EventAbility）。
 */
@Structure.FieldOrder({"wDecibel",
                       "bySensitivity",
                       "byAudioMode",
                       "byEnable",
                       "byThreshold",
                       "byRes"})
public class NET_VCA_AUDIO_ABNORMAL extends Structure {

  /**
   * 声音强度
   */
  public short wDecibel;
  /**
   * 灵敏度参数，范围[1,100]
   */
  public byte bySensitivity;
  /**
   * 声音检测模式，0-灵敏度检测，1-分贝阈值检测，2-灵敏度与分贝阈值检测
   */
  public byte byAudioMode;
  /**
   * 使能，是否开启(声强突变，陡升)
   */
  public byte byEnable;
  /**
   * 声音阈值[1,100]
   */
  public byte byThreshold;
  /**
   * 保留
   */
  public byte[] byRes = new byte[54];
}
