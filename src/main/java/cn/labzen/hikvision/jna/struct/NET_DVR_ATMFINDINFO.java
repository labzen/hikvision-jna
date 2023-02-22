package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * ATM文件查找条件结构体
 */
@Structure.FieldOrder({"byTransactionType",
                       "byRes",
                       "dwTransationAmount"})
public class NET_DVR_ATMFINDINFO extends Structure {

  /**
   * 交易类型 0-全部，1-查询， 2-取款， 3-存款， 4-修改密码，5-转账， 6-无卡查询 7-无卡存款， 8-吞钞 9-吞卡 10-自定义
   */
  public byte byTransactionType;
  /**
   * 保留
   */
  public byte[] byRes = new byte[3];
  /**
   * 交易金额 ;
   */
  public int dwTransationAmount;

}
