package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum SdkInitConfigurationType implements HikvisionEnum {

  /**
   * 增加对必须库的检查
   */
  NET_SDK_INIT_CFG_TYPE_CHECK_MODULE_COM(0, "增加对必须库的检查"),
  /**
   * sdk支持的业务的能力集
   */
  NET_SDK_INIT_CFG_ABILITY(1, "sdk支持的业务的能力集"),
  /**
   * 设置组件库加载路径
   */
  NET_SDK_INIT_CFG_SDK_PATH(2, "设置组件库加载路径"),
  /**
   * 设置OpenSSL的libeay32.dll/libcrypto.so/libcrypto.dylib所在路径
   */
  NET_SDK_INIT_CFG_LIBEAY_PATH(3, "设置OpenSSL的libeay32.dll/libcrypto.so/libcrypto.dylib所在路径"),
  /**
   * 设置OpenSSL的ssleay32.dll/libssl.so/libssl.dylib所在路径
   */
  NET_SDK_INIT_CFG_SSLEAY_PATH(4, "设置OpenSSL的ssleay32.dll/libssl.so/libssl.dylib所在路径");

  private int code;
  private String description;

  public static Optional<SdkInitConfigurationType> byCode(int code) {
    return EnumSet.allOf(SdkInitConfigurationType.class).stream().filter(in -> in.code == code).findFirst();
  }
}
