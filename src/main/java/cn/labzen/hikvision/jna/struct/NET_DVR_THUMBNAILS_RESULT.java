package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 按时间段获取缩略图结果信息结构体
 * <p/>
 * <ul>
 *   <li>设备是否支持按时间段获取缩略图或者支持的参数能力，可以通过设备能力集进行判断，对应设备软硬件能力集(BasicCapability)，
 *   相关接口：NET_DVR_GetDeviceAbility，能力集类型：DEVICE_SOFTHARDWARE_ABILITY，节点：<isSupportGetThumbnails>。</li>
 *   <li>如果查找类型选择的是“I帧数据”，查询结果会先返回40字节系统头数据，然后再返回I帧数据，需要调用播放库SDK接口解码获取解码后的YUV数据，
 *   然后转换成图片格式。具体接口调用流程如下图所示，播放库接口参数说明请参考播放库SDK里面的编程指南。 </li>
 * </ul>
 */
@Structure.FieldOrder({"byResultDataType",
                       "byIFrameType",
                       "byRes1",
                       "struTime",
                       "byRes",
                       "dwFileSize",
                       "pBuffer"})
public class NET_DVR_THUMBNAILS_RESULT extends Structure {

  /**
   * 查找结果数据类型0-I帧数据（CVR 一路的情况下，1s最多28个I帧），1-系统头数据， 2-图片数据
   */
  public byte byResultDataType;
  /**
   * I帧类型，0-数据帧，1-参考帧（本数据只需送入播放库，但是不需要转为图片显示）
   */
  public byte byIFrameType;
  /**
   * 保留字节
   */
  public byte[] byRes1 = new byte[2];
  /**
   * 数据时间
   */
  public NET_DVR_TIME_SEARCH struTime;
  /**
   * 保留字节
   */
  public byte[] byRes = new byte[252];
  /**
   * 数据大小
   */
  public int dwFileSize;
  /**
   * 数据信息(数据类型和条件结构体中NET_DVR_THUMBNAILS_RESULT 的字段 byResultDataType 值相关)
   */
  public String pBuffer;
}
