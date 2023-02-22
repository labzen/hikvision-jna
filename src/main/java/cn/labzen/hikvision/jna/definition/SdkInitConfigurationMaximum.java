package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum SdkInitConfigurationMaximum implements HikvisionEnum {

  /**
   * 2048
   */
  INIT_CFG_NUM_2048(2048, "2048"),
  /**
   * 5120
   */
  INIT_CFG_NUM_5120(5120, "5120"),
  /**
   * 10240
   */
  INIT_CFG_NUM_10240(10240, "10240"),
  /**
   * 15360
   */
  INIT_CFG_NUM_15360(15360, "15360"),
  /**
   * 20480
   */
  INIT_CFG_NUM_20480(20480, "20480");

  private int code;
  private String description;

  public static Optional<SdkInitConfigurationMaximum> byCode(int code) {
    return EnumSet.allOf(SdkInitConfigurationMaximum.class).stream().filter(in -> in.code == code).findFirst();
  }
}
