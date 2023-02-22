package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.STREAM_ID_LEN;

/**
 * 流ID信息结构体
 * <p/>
 * <ul>
 *   <li>如果设备不支持流ID标识功能，例如DVR设备，byID值设为0。 </li>
 *   <li>对于转码器设备来说，配置流来源时，流ID（byID）和转码通道（dwChannel）有且只能有一个参数有效，
 *   同时有效或同时无效都将返回失败；被动转码的时候，流ID和通道号可以同时无效，转码通道或者流ID由设备自动分配。 </li>
 *   <li>对于其他设备（CVR等），当该结构体参数作为SDK接口的输入条件时，如果byID和dwChannel都无效时，
 *   网络SDK将返回参数错误（错误代码一般为17）；如果两个都有效，而输入的byID和dwChannel不匹配，则设备可能会返回失败，
 *   因此，建议只输入byID（dwChannel=0xffffffff）或者dwChannel（byID=0）。 </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "byID",
                       "dwChannel",
                       "byRes"})
public class NET_DVR_STREAM_INFO extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 流ID，为字母、数字和"_"的组合。全部为0时，无效
   */
  public byte[] byID = new byte[STREAM_ID_LEN];
  /**
   * 关联的设备通道。等于0xffffffff时，如果是设置流的来源信息(NET_DVR_SET_STREAM_SRC_INFO)，表示不关联；
   * 如果是作为其他如NET_DVR_SET_STREAM_RECORD_INFO、NET_DVR_SET_STREAM_RECORD_STATUS、
   * NET_DVR_SET_MONITOR_VQDCFG等配置时的输入条件参数时，表示无效。
   */
  public int dwChannel;
  /**
   * 保留
   */
  public byte[] byRes = new byte[32];
}
