package cn.labzen.hikvision.jna.struct;

import cn.labzen.hikvision.jna.definition.AgeGroup;
import cn.labzen.hikvision.jna.definition.FaceExpression;
import com.sun.jna.Structure;

/**
 * 人体属性参数结构体
 */
@Structure.FieldOrder({"byAgeGroup",
                       "bySex",
                       "byEyeGlass",
                       "byAge",
                       "byAgeDeviation",
                       "byEthnic",
                       "byMask",
                       "bySmile",
                       "byFaceExpression",
                       "byBeard",
                       "byRace",
                       "byHat",
                       "byRes"})
public class NET_VCA_HUMAN_FEATURE extends Structure {

  /**
   * 年龄段,参考{@link AgeGroup}
   */
  public byte byAgeGroup;
  /**
   * 性别, 0-表示“未知”（算法不支持）,1 – 男 , 2 – 女, 0xff-算法支持，但是没有识别出来
   */
  public byte bySex;
  /**
   * 是否戴眼镜 0-表示“未知”（算法不支持）,1 – 不戴, 2 – 戴,0xff-算法支持，但是没有识别出来抓拍图片人脸年龄的使用方式，如byAge为15,byAgeDeviation为1,表示，实际人脸图片年龄的为14-16之间
   */
  public byte byEyeGlass;
  /**
   * 年龄 0-表示“未知”（算法不支持）,0xff-算法支持，但是没有识别出来
   */
  public byte byAge;
  /**
   * 年龄误差值，如byAge为15、byAgeDeviation为1，表示实际人脸图片年龄的为14~16之间
   */
  public byte byAgeDeviation;
  /**
   * 字段预留,暂不开放
   */
  public byte byEthnic;
  /**
   * 是否戴口罩 0-表示“未知”（算法不支持）,1 – 不戴, 2 –戴普通眼镜, 3 –戴墨镜,0xff-算法支持，但是没有识别出来
   */
  public byte byMask;
  /**
   * 是否微笑 0-表示“未知”（算法不支持）,1 – 不微笑, 2 – 微笑, 0xff-算法支持，但是没有识别出来
   */
  public byte bySmile;
  /**
   * 表情,参考{@link FaceExpression}
   */
  public byte byFaceExpression;
  /**
   * 胡子, 0-不支持，1-没有胡子，2-有胡子，0xff-unknow表示未知,算法支持未检出
   */
  public byte byBeard;
  /**
   * 人种, 0-不支持，1-亚洲人，2-黑人，3-白人,0xff-unknow表示未知,算法支持未检出
   */
  public byte byRace;
  /**
   * 帽子, 0-不支持,1-不戴帽子,2-戴帽子,0xff-unknow表示未知,算法支持未检出
   */
  public byte byHat;
  /**
   * 保留
   */
  public byte[] byRes = new byte[4];
}
