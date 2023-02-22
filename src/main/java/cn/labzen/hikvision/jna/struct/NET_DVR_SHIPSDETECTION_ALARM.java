package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.MAX_SHIPS_NUM;

/**
 * 船只检测报警信息结构体
 */
@Structure.FieldOrder({"dwSize",
                       "struDevInfo",
                       "dwRelativeTime",
                       "dwAbsTime",
                       "byShipsNum",
                       "byShipsNumHead",
                       "byShipsNumEnd",
                       "byPicTransType",
                       "struShipInfo",
                       "dwPicLen",
                       "dwThermalPicLen",
                       "pPicBuffer",
                       "pThermalPicBuffer",
                       "wDevInfoIvmsChannelEx",
                       "byTimeDiffFlag",
                       "cTimeDifferenceH",
                       "cTimeDifferenceM",
                       "byRes"})
public class NET_DVR_SHIPSDETECTION_ALARM extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 设备信息
   */
  public NET_VCA_DEV_INFO struDevInfo;
  /**
   * 相对时标
   */
  public int dwRelativeTime;
  /**
   * 绝对时标
   */
  public int dwAbsTime;
  /**
   * 船只数；(正跨越检测线的船只数)
   */
  public byte byShipsNum;
  /**
   * 船只数；(船头检测船只数)
   */
  public byte byShipsNumHead;
  /**
   * 船只数；(船尾检测船只数)
   */
  public byte byShipsNumEnd;
  /**
   * 图片数据传输方式: 0-二进制；1-url
   */
  public byte byPicTransType;
  /**
   * 船只信息；最大支持20艘
   */
  public NET_DVR_SHIPSINFO[] struShipInfo = new NET_DVR_SHIPSINFO[MAX_SHIPS_NUM];
  /**
   * 可见光图片长度
   */
  public int dwPicLen;
  /**
   * 热成像图片长度
   */
  public int dwThermalPicLen;
  /**
   * 可见光图片数据指针
   */
  public ByteByReference pPicBuffer;
  /**
   * 热成像图片数据指针
   */
  public ByteByReference pThermalPicBuffer;
  /**
   * 与NET_VCA_DEV_INFO里的byIvmsChannel含义相同，能表示更大的值。老客户端用byIvmsChannel能继续兼容，但是最大到255。新客户端版本请使用wDevInfoIvmsChannelEx。
   */
  public short wDevInfoIvmsChannelEx;
  /**
   * 时差字段是否有效  0-时差无效， 1-时差有效
   */
  public byte byTimeDiffFlag;
  /**
   * 与UTC的时差（小时），-12 ... +14， +表示东区,，byTimeDiffFlag为1时有效
   */
  public char cTimeDifferenceH;
  /**
   * 与UTC的时差（分钟），-30, 30, 45， +表示东区，byTimeDiffFlag为1时有效
   */
  public char cTimeDifferenceM;
  /**
   * 保留
   */
  public byte[] byRes = new byte[251];
}
