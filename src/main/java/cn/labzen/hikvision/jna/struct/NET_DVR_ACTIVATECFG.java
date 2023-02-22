package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.PASSWD_LEN;

/**
 * 设备激活参数结构体
 * <p/>
 * <ul>
 *   <li>出厂设备需要先激活，然后再使用激活使用的初始密码登录设备</li>
 *   <li>将密码输入分为数字(0~9)、小写字母(a~z)、大写字母(A~Z)、特殊符号（:\"除外）4类，等级分为4个等级，如下所示：
 *     <ul>
 *       <li>等级0（风险密码）：密码长度小于8位，或者只包含4类字符中的任意一类，或者密码与用户名一样，或者密码是用户名的倒写。例如：12345、abcdef。</li>
 *       <li>等级1（弱密码）：包含两类字符，且组合为（数字+小写字母）或（数字+大写字母），且长度大于等于8位。例如：abc12345、123ABCDEF</li>
 *       <li>等级2（中密码）：包含两类字符，且组合不能为（数字+小写字母）和（数字+大写字母），且长度大于等于8位。例如：12345***++、ABCDabcd。</li>
 *       <li>等级3（强密码）：包含三类字符及以上，且长度大于等于8位。例如：Abc12345、abc12345++。 </li>
 *     </ul>
 *   </li>
 * </ul>
 */
@Structure.FieldOrder({"dwSize",
                       "sPassword",
                       "byRes"})
public class NET_DVR_ACTIVATECFG extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 初始密码，密码等级弱或者以上
   */
  public byte[] sPassword = new byte[PASSWD_LEN];
  /**
   * 保留
   */
  public byte[] byRes = new byte[108];
}
