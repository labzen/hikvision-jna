package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

import static cn.labzen.hikvision.jna.Constants.MAX_EXCEPTIONNUM_V30;

/**
 * 异常参数配置（扩展）结构体
 */
@Structure.FieldOrder({"dwSize",
                       "dwMaxGroupNum",
                       "byRes"})
public class NET_DVR_EXCEPTION_V40 extends Structure {

  /**
   * 结构体大小
   */
  public int dwSize;
  /**
   * 设备支持的异常类型最大组数（只读）
   */
  public int dwMaxGroupNum;
  /**
   * 异常信息处理方式，数组的每个元素都表示一种异常类型：<br/>
   * 数组0－硬盘满<br/>
   * 数组1－硬盘出错<br/>
   * 数组2－网线断<br/>
   * 数组3－IP 地址冲突<br/>
   * 数组4－非法访问<br/>
   * 数组5－输入/输出视频制式不匹配<br/>
   * 数组6－视频信号异常<br/>
   * 数组7－录像异常<br/>
   * 数组8－阵列异常<br/>
   * 数组9－前端/录像分辨率不匹配异常<br/>
   * 数组10-行车超速（车载专用）<br/>
   * 数组11-热备异常（N+1使用）<br/>
   * 数组12-温度异常<br/>
   * 数组13-子系统异常<br/>
   * 数组14-风扇异常<br/>
   * 数组15-POE供电异常
   */
  public NET_DVR_HANDLEEXCEPTION_V41[] struExceptionHandle = new NET_DVR_HANDLEEXCEPTION_V41[MAX_EXCEPTIONNUM_V30];
  /**
   * 保留
   */
  public byte[] byRes = new byte[128];

}
