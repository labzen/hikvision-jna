package cn.labzen.hikvision.jna.library.internal;

/**
 * Access Control - 门禁主机功能接口（基本接口定义之外的扩展）
 */
public interface ProductAccessControl {

  /**
   * 远程门禁控制或梯控控制。
   *
   * @param lUserID       [in] NET_DVR_Login_V40等登录接口的返回值
   * @param lGatewayIndex [in] 门禁序号（楼层编号、锁ID），从1开始，-1表示对所有门（或者梯控的所有楼层）进行操作
   * @param dwStaic       [in] 命令值：0- 关闭（对于梯控，表示受控），1- 打开（对于梯控，表示开门），2- 常开（对于梯控，表示自由、通道状态），3- 常关（对于梯控，表示禁用），4- 恢复（梯控，普通状态），5- 访客呼梯（梯控），6- 住户呼梯（梯控）
   * @return TRUE表示成功，FALSE表示失败。接口返回失败请调用NET_DVR_GetLastError获取错误码，通过错误码判断出错原因。
   */
  boolean NET_DVR_ControlGateway(int lUserID, int lGatewayIndex, int dwStaic);
}
