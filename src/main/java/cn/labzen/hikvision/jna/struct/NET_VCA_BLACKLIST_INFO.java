package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import static cn.labzen.hikvision.jna.Constants.NAME_LEN;

/**
 * 黑名单信息结构体
 * <p/>
 * 注册黑名单时分组号有效：指定黑名单注册到哪个分组，多个分组可以有相同的黑名单。<br>
 * 修改黑名单时分组号无效，修改当前黑名单时会把所有分组中的该黑名单修改。<br>
 * 删除黑名单时分组号有效，删除该分组下的全部黑名单。<br>
 * <p>
 * byLevel参数越高越容易报警。
 */
@Structure.FieldOrder({"dwSize",
                       "dwRegisterID",
                       "dwGroupNo",
                       "byType",
                       "byLevel",
                       "byRes1",
                       "struAttribute",
                       "byRemark",
                       "dwFDDescriptionLen",
                       "pFDDescriptionBuffer",
                       "dwFCAdditionInfoLen",
                       "pFCAdditionInfoBuffer",
                       "byRes2"})
public class NET_VCA_BLACKLIST_INFO extends Structure {

  /**
   * 结构大小
   */
  public int dwSize;
  /**
   * 名单注册ID号（只读）
   */
  public int dwRegisterID;
  /**
   * 分组号
   */
  public int dwGroupNo;
  /**
   * 黑白名单标志：0-全部，1-白名单，2-黑名单
   */
  public byte byType;
  /**
   * 黑名单等级，0-全部，1-低，2-中，3-高
   */
  public byte byLevel;
  /**
   * 保留
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 人员信息
   */
  public NET_VCA_HUMAN_ATTRIBUTE struAttribute;
  /**
   * 备注信息
   */
  public byte[] byRemark = new byte[NAME_LEN];
  /**
   * 人脸库描述数据长度
   */
  public int dwFDDescriptionLen;
  /**
   * 人脸库描述数据指针
   */
  public ByteByReference pFDDescriptionBuffer;
  /**
   * 抓拍库附加信息长度
   */
  public int dwFCAdditionInfoLen;
  /**
   * 抓拍库附加信息数据指针（FCAdditionInfo中包含相机PTZ坐标）
   */
  public ByteByReference pFCAdditionInfoBuffer;
  /**
   * 保留
   */
  public byte[] byRes2 = new byte[4];
}
