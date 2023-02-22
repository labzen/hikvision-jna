package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 本地TCP端口绑定配置结构体
 * <p/>
 * <ul>
 *   <li>端口绑定的策略是：给一个端口段，可以保证使用的端口都是在这个段里（多播除外），但不能保证每一个段内的端口都用到，因为是循环利用的；端口池中取出的端口会去尝试绑定，如果被占用了，将取下一个，如果段内每一个都绑定不了，则连接操作返回失败。建议最好不要设置系统预留的端口（1-1024），比如80等。</li>
 *   <li>设置的最大端口应该大于等于最小端口，[0, 0]表示清除绑定，[0, 非0]将设置失败，因为0不能进行绑定。</li>
 * </ul>
 */
@Structure.FieldOrder({"wLocalBindTcpMinPort",
                       "wLocalBindTcpMaxPort",
                       "byRes"})
public class NET_DVR_LOCAL_TCP_PORT_BIND_CFG extends Structure {

  /**
   * 本地绑定TCP最小端口
   */
  public short wLocalBindTcpMinPort;
  /**
   * 本地绑定TCP最大端口
   */
  public short wLocalBindTcpMaxPort;
  /**
   * 保留
   */
  public byte[] byRes = new byte[60];

}
