package cn.labzen.hikvision.jna.struct;

import com.sun.jna.Structure;

/**
 * 行为分析搜索条件结构体
 * <p/>
 * 区域入侵侦测、越界侦测、进入区域侦测、离开区域侦测等功能，如果开启人体去误报过滤功能，则设备将会把认为是误报的报警过滤掉，
 * 不进行实时上传，但会在本地存储以供查询。调用NET_DVR_SmartSearchPicture查询的时候可以选择是否只查询误报信息，即该结构体里面byHumanMisinfo参数设置为1。
 */
@Structure.FieldOrder({"dwSearchType",
                       "byHumanMisinfo",
                       "byRes"})
public class NET_DVR_BEHAVIOUR_COND extends Structure {

  /**
   * 搜索类型，按位表示，值：0- 否，1- 是
   * dwSearchType&0x1 - 穿越警戒线(越界侦测)
   * dwSearchType&0x2 - 区域入侵
   * dwSearchType&0x4 - 物品遗留
   * dwSearchType&0x8 - 物品拿取
   * dwSearchType&0x10 - 进入区域
   * dwSearchType&0x20 - 离开区域
   * dwSearchType&0x40 - 非法停车
   * dwSearchType&0x80 - 徘徊
   * dwSearchType&0x100 - 人员聚集
   * dwSearchType&0x200 - 快速移动
   */
  public int dwSearchType;
  /**
   * 是否只获取人体误报信息：0- 否，1- 是
   */
  public byte byHumanMisinfo;
  /**
   * 保留
   */
  public byte[] byRes = new byte[251];
}
