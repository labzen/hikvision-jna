package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 日志类型
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum LogType implements HikvisionEnum {

  MAJOR_ALARM(0x1, "报警"),
  MAJOR_EXCEPTION(0x2, "异常"),
  MAJOR_OPERATION(0x3, "操作"),
  MAJOR_INFORMATION(0x4, "日志附加信息");

  private int code;
  private String description;

  public static Optional<LogType> byCode(int code) {
    return EnumSet.allOf(LogType.class).stream().filter(in -> in.code == code).findFirst();
  }

  /**
   * 报警日志次类型
   */
  @Getter
  @AllArgsConstructor
  public enum Alarm implements HikvisionEnum {

    /**
     * 报警输入
     */
    MINOR_ALARM_IN(0x1, "报警输入"),
    /**
     * 报警输出
     */
    MINOR_ALARM_OUT(0x2, "报警输出"),
    /**
     * 移动侦测报警开始
     */
    MINOR_MOTDET_START(0x3, "移动侦测报警开始"),
    /**
     * 移动侦测报警结束
     */
    MINOR_MOTDET_STOP(0x4, "移动侦测报警结束"),
    /**
     * 遮挡报警开始
     */
    MINOR_HIDE_ALARM_START(0x5, "遮挡报警开始"),
    /**
     * 遮挡报警结束
     */
    MINOR_HIDE_ALARM_STOP(0x6, "遮挡报警结束"),
    /**
     * 智能报警开始
     */
    MINOR_VCA_ALARM_START(0x7, "智能报警开始"),
    /**
     * 智能报警结束
     */
    MINOR_VCA_ALARM_STOP(0x8, "智能报警结束"),
    /**
     * 交通事件报警开始
     */
    MINOR_ITS_ALARM_START(0x09, "交通事件报警开始"),
    /**
     * 交通事件报警结束
     */
    MINOR_ITS_ALARM_STOP(0x0a, "交通事件报警结束"),
    /**
     * 网络报警开始
     */
    MINOR_NETALARM_START(0x0b, "网络报警开始"),
    /**
     * 网络报警结束
     */
    MINOR_NETALARM_STOP(0x0c, "网络报警结束"),
    /**
     * 网络报警恢复
     */
    MINOR_NETALARM_RESUME(0x0d, "网络报警恢复");

    private int code;
    private String description;

    public static Optional<Alarm> byCode(int code) {
      return EnumSet.allOf(Alarm.class).stream().filter(in -> in.code == code).findFirst();
    }
  }

  /**
   * 异常日志次类型
   */
  @Getter
  @AllArgsConstructor
  public enum Exception implements HikvisionEnum {

    /**
     * 阵列异常
     */
    MINOR_RAID_ERROR(0x20, "阵列异常"),
    /**
     * 视频信号丢失
     */
    MINOR_VI_LOST(0x21, "视频信号丢失"),
    /**
     * 非法访问
     */
    MINOR_ILLEGAL_ACCESS(0x22, "非法访问"),
    /**
     * 硬盘满
     */
    MINOR_HD_FULL(0x23, "硬盘满"),
    /**
     * 硬盘错误
     */
    MINOR_HD_ERROR(0x24, "硬盘错误"),
    /**
     * MODEM 掉线(保留)
     */
    MINOR_DCD_LOST(0x25, "MODEM 掉线(保留)"),
    /**
     * IP 地址冲突
     */
    MINOR_IP_CONFLICT(0x26, "IP 地址冲突"),
    /**
     * 网络断开
     */
    MINOR_NET_BROKEN(0x27, "网络断开"),
    /**
     * 录像出错
     */
    MINOR_REC_ERROR(0x28, "录像出错"),
    /**
     * IPC 连接异常
     */
    MINOR_IPC_NO_LINK(0x29, "IPC 连接异常"),
    /**
     * 视频输入异常(只针对模拟通道)
     */
    MINOR_VI_EXCEPTION(0x2a, "视频输入异常(只针对模拟通道)"),
    /**
     * IPC 的 IP 地址冲突
     */
    MINOR_IPC_IP_CONFLICT(0x2b, "IPC 的 IP 地址冲突"),
    /**
     * 场景异常
     */
    MINOR_SENCE_EXCEPTION(0x2c, "场景异常"),
    /**
     * 抓图出错,获取图片文件失败
     */
    MINOR_PIC_REC_ERROR(0x2d, "抓图出错,获取图片文件失败"),
    /**
     * 视频制式不匹配
     */
    MINOR_VI_MISMATCH(0x2e, "视频制式不匹配"),
    /**
     * 缓冲区溢出
     */
    MINOR_RECORD_OVERFLOW(0x41, "缓冲区溢出"),
    /**
     * DSP 异常
     */
    MINOR_DSP_ABNORMAL(0x42, "DSP 异常"),
    /**
     * ANR 录像失败
     */
    MINOR_ANR_RECORD_FAIED(0x43, "ANR 录像失败"),
    /**
     * 热备设备工作机异常
     */
    MINOR_SPARE_WORK_DEVICE_EXCEPT(0x44, "热备设备工作机异常"),
    /**
     * 开启 IPC MAS 失败
     */
    MINOR_START_IPC_MAS_FAILED(0x45, "开启 IPC MAS 失败"),
    /**
     * IPCM 异常重启
     */
    MINOR_IPCM_CRASH(0x46, "IPCM 异常重启"),
    /**
     * POE 供电异常
     */
    MINOR_POE_POWER_EXCEPTION(0x47, "POE 供电异常"),
    /**
     * 云存储数据上传失败
     */
    MINOR_UPLOAD_DATA_CS_EXCEPTION(0x48, "云存储数据上传失败"),
    /**
     * 同步 IPC 密码异常
     */
    MINOR_SYNC_IPC_PASSWD(0x53, "同步 IPC 密码异常"),
    /**
     * 萤石下线异常
     */
    MINOR_EZVIZ_OFFLINE(0x54, "萤石下线异常"),
    /**
     * 配件板异常
     */
    MINOR_ACCESSORIES_PLATE(0x57, "配件板异常");

    private int code;
    private String description;

    public static Optional<Exception> byCode(int code) {
      return EnumSet.allOf(Exception.class).stream().filter(in -> in.code == code).findFirst();
    }
  }

  /**
   * 操作日志次类型
   */
  @Getter
  @AllArgsConstructor
  public enum Operation implements HikvisionEnum {

    /**
     * 开机
     */
    MINOR_START_DVR(0x41, "开机"),
    /**
     * 关机
     */
    MINOR_STOP_DVR(0x42, "关机"),
    /**
     * 异常关机
     */
    MINOR_STOP_ABNORMAL(0x43, "异常关机"),
    /**
     * 本地重启设备
     */
    MINOR_REBOOT_DVR(0x44, "本地重启设备"),
    /**
     * 本地登陆
     */
    MINOR_LOCAL_LOGIN(0x50, "本地登陆"),
    /**
     * 本地注销登陆
     */
    MINOR_LOCAL_LOGOUT(0x51, "本地注销登陆"),
    /**
     * 本地配置参数
     */
    MINOR_LOCAL_CFG_PARM(0x52, "本地配置参数"),
    /**
     * 本地按文件回放或下载
     */
    MINOR_LOCAL_PLAYBYFILE(0x53, "本地按文件回放或下载"),
    /**
     * 本地按时间回放或下载
     */
    MINOR_LOCAL_PLAYBYTIME(0x54, "本地按时间回放或下载"),
    /**
     * 本地开始录像
     */
    MINOR_LOCAL_START_REC(0x55, "本地开始录像"),
    /**
     * 本地停止录像
     */
    MINOR_LOCAL_STOP_REC(0x56, "本地停止录像"),
    /**
     * 本地云台控制
     */
    MINOR_LOCAL_PTZCTRL(0x57, "本地云台控制"),
    /**
     * 本地预览(保留不使用)
     */
    MINOR_LOCAL_PREVIEW(0x58, "本地预览(保留不使用)"),
    /**
     * 本地修改时间(保留不使用)
     */
    MINOR_LOCAL_MODIFY_TIME(0x59, "本地修改时间(保留不使用)"),
    /**
     * 本地升级
     */
    MINOR_LOCAL_UPGRADE(0x5a, "本地升级"),
    /**
     * 本地备份录象文件
     */
    MINOR_LOCAL_RECFILE_OUTPUT(0x5b, "本地备份录象文件"),
    /**
     * 本地初始化硬盘
     */
    MINOR_LOCAL_FORMAT_HDD(0x5c, "本地初始化硬盘"),
    /**
     * 导出本地配置文件
     */
    MINOR_LOCAL_CFGFILE_OUTPUT(0x5d, "导出本地配置文件"),
    /**
     * 导入本地配置文件
     */
    MINOR_LOCAL_CFGFILE_INPUT(0x5e, "导入本地配置文件"),
    /**
     * 本地备份文件
     */
    MINOR_LOCAL_COPYFILE(0x5f, "本地备份文件"),
    /**
     * 本地锁定录像文件
     */
    MINOR_LOCAL_LOCKFILE(0x60, "本地锁定录像文件"),
    /**
     * 本地解锁录像文件
     */
    MINOR_LOCAL_UNLOCKFILE(0x61, "本地解锁录像文件"),
    /**
     * 本地手动清除和触发报警
     */
    MINOR_LOCAL_DVR_ALARM(0x62, "本地手动清除和触发报警"),
    /**
     * 本地添加 IPC
     */
    MINOR_IPC_ADD(0x63, "本地添加 IPC"),
    /**
     * 本地删除 IPC
     */
    MINOR_IPC_DEL(0x64, "本地删除 IPC"),
    /**
     * 本地设置 IPC
     */
    MINOR_IPC_SET(0x65, "本地设置 IPC"),
    /**
     * 本地开始备份
     */
    MINOR_LOCAL_START_BACKUP(0x66, "本地开始备份"),
    /**
     * 本地停止备份
     */
    MINOR_LOCAL_STOP_BACKUP(0x67, "本地停止备份"),
    /**
     * 本地备份开始时间
     */
    MINOR_LOCAL_COPYFILE_START_TIME(0x68, "本地备份开始时间"),
    /**
     * 本地备份结束时间
     */
    MINOR_LOCAL_COPYFILE_END_TIME(0x69, "本地备份结束时间"),
    /**
     * 本地添加网络硬盘
     */
    MINOR_LOCAL_ADD_NAS(0x6a, "本地添加网络硬盘"),
    /**
     * 本地删除 NAS 盘
     */
    MINOR_LOCAL_DEL_NAS(0x6b, "本地删除 NAS 盘"),
    /**
     * 本地设置 NAS 盘
     */
    MINOR_LOCAL_SET_NAS(0x6c, "本地设置 NAS 盘"),
    /**
     * 远程登录
     */
    MINOR_REMOTE_LOGIN(0x70, "远程登录"),
    /**
     * 远程注销登陆
     */
    MINOR_REMOTE_LOGOUT(0x71, "远程注销登陆"),
    /**
     * 远程开始录像
     */
    MINOR_REMOTE_START_REC(0x72, "远程开始录像"),
    /**
     * 远程停止录像
     */
    MINOR_REMOTE_STOP_REC(0x73, "远程停止录像"),
    /**
     * 开始透明传输
     */
    MINOR_START_TRANS_CHAN(0x74, "开始透明传输"),
    /**
     * 停止透明传输
     */
    MINOR_STOP_TRANS_CHAN(0x75, "停止透明传输"),
    /**
     * 远程获取参数
     */
    MINOR_REMOTE_GET_PARM(0x76, "远程获取参数"),
    /**
     * 远程配置参数
     */
    MINOR_REMOTE_CFG_PARM(0x77, "远程配置参数"),
    /**
     * 远程获取状态
     */
    MINOR_REMOTE_GET_STATUS(0x78, "远程获取状态"),
    /**
     * 远程布防
     */
    MINOR_REMOTE_ARM(0x79, "远程布防"),
    /**
     * 远程撤防
     */
    MINOR_REMOTE_DISARM(0x7a, "远程撤防"),
    /**
     * 远程重启
     */
    MINOR_REMOTE_REBOOT(0x7b, "远程重启"),
    /**
     * 开始语音对讲
     */
    MINOR_START_VT(0x7c, "开始语音对讲"),
    /**
     * 停止语音对讲
     */
    MINOR_STOP_VT(0x7d, "停止语音对讲"),
    /**
     * 远程升级
     */
    MINOR_REMOTE_UPGRADE(0x7e, "远程升级"),
    /**
     * 远程按文件回放
     */
    MINOR_REMOTE_PLAYBYFILE(0x7f, "远程按文件回放"),
    /**
     * 远程按时间回放
     */
    MINOR_REMOTE_PLAYBYTIME(0x80, "远程按时间回放"),
    /**
     * 远程云台控制
     */
    MINOR_REMOTE_PTZCTRL(0x81, "远程云台控制"),
    /**
     * 远程格式化硬盘
     */
    MINOR_REMOTE_FORMAT_HDD(0x82, "远程格式化硬盘"),
    /**
     * 远程关机
     */
    MINOR_REMOTE_STOP(0x83, "远程关机"),
    /**
     * 远程锁定文件
     */
    MINOR_REMOTE_LOCKFILE(0x84, "远程锁定文件"),
    /**
     * 远程解锁文件
     */
    MINOR_REMOTE_UNLOCKFILE(0x85, "远程解锁文件"),
    /**
     * 远程导出配置文件
     */
    MINOR_REMOTE_CFGFILE_OUTPUT(0x86, "远程导出配置文件"),
    /**
     * 远程导入配置文件
     */
    MINOR_REMOTE_CFGFILE_INTPUT(0x87, "远程导入配置文件"),
    /**
     * 远程导出录象文件
     */
    MINOR_REMOTE_RECFILE_OUTPUT(0x88, "远程导出录象文件"),
    /**
     * 远程手动清除和触发报警
     */
    MINOR_REMOTE_DVR_ALARM(0x89, "远程手动清除和触发报警"),
    /**
     * 远程添加 IPC
     */
    MINOR_REMOTE_IPC_ADD(0x8a, "远程添加 IPC"),
    /**
     * 远程删除 IPC
     */
    MINOR_REMOTE_IPC_DEL(0x8b, "远程删除 IPC"),
    /**
     * 远程设置 IPC
     */
    MINOR_REMOTE_IPC_SET(0x8c, "远程设置 IPC"),
    /**
     * 重启智能库
     */
    MINOR_REBOOT_VCA_LIB(0x8d, "重启智能库"),
    /**
     * 远程添加 NAS 盘
     */
    MINOR_REMOTE_ADD_NAS(0x8e, "远程添加 NAS 盘"),
    /**
     * 远程删除 NAS 盘
     */
    MINOR_REMOTE_DEL_NAS(0x8f, "远程删除 NAS 盘"),
    /**
     * 远程设置 NAS 盘
     */
    MINOR_REMOTE_SET_NAS(0x90, "远程设置 NAS 盘"),
    /**
     * 本地开始刻录
     */
    MINOR_LOCAL_START_REC_CDRW(0x91, "本地开始刻录"),
    /**
     * 本地停止刻录
     */
    MINOR_LOCAL_STOP_REC_CDRW(0x92, "本地停止刻录"),
    /**
     * 远程开始刻录
     */
    MINOR_REMOTE_START_REC_CDRW(0x93, "远程开始刻录"),
    /**
     * 远程停止刻录
     */
    MINOR_REMOTE_STOP_REC_CDRW(0x94, "远程停止刻录"),
    /**
     * 本地备份图片文件
     */
    MINOR_LOCAL_PIC_OUTPUT(0x95, "本地备份图片文件"),
    /**
     * 远程备份图片文件
     */
    MINOR_REMOTE_PIC_OUTPUT(0x96, "远程备份图片文件"),
    /**
     * 本地恢复审讯事件
     */
    MINOR_LOCAL_INQUEST_RESUME(0x97, "本地恢复审讯事件"),
    /**
     * 远程恢复审讯事件
     */
    MINOR_REMOTE_INQUEST_RESUME(0x98, "远程恢复审讯事件"),
    /**
     * 本地导入文件
     */
    MINOR_LOCAL_ADD_FILE(0x99, "本地导入文件"),
    /**
     * 远程删除异常不存在的硬盘
     */
    MINOR_REMOTE_DELETE_HDISK(0x9a, "远程删除异常不存在的硬盘"),
    /**
     * 远程加载硬盘
     */
    MINOR_REMOTE_LOAD_HDISK(0x9b, "远程加载硬盘"),
    /**
     * 远程卸载硬盘
     */
    MINOR_REMOTE_UNLOAD_HDISK(0x9c, "远程卸载硬盘"),
    /**
     * 本地操作锁定
     */
    MINOR_LOCAL_OPERATE_LOCK(0x9d, "本地操作锁定"),
    /**
     * 本地操作解除锁定
     */
    MINOR_LOCAL_OPERATE_UNLOCK(0x9e, "本地操作解除锁定"),
    /**
     * 远程旁路
     */
    MINOR_REMOTE_BYPASS(0xd0, "远程旁路"),
    /**
     * 远程旁路恢复
     */
    MINOR_REMOTE_UNBYPASS(0xd1, "远程旁路恢复"),
    /**
     * 远程设置报警输入参数
     */
    MINOR_REMOTE_SET_ALARMIN_CFG(0xd2, "远程设置报警输入参数"),
    /**
     * 远程获取报警输入参数
     */
    MINOR_REMOTE_GET_ALARMIN_CFG(0xd3, "远程获取报警输入参数"),
    /**
     * 远程设置报警输出参数
     */
    MINOR_REMOTE_SET_ALARMOUT_CFG(0xd4, "远程设置报警输出参数"),
    /**
     * 远程获取报警输出参数
     */
    MINOR_REMOTE_GET_ALARMOUT_CFG(0xd5, "远程获取报警输出参数"),
    /**
     * 远程手动开启报警输出
     */
    MINOR_REMOTE_ALARMOUT_OPEN_MAN(0xd6, "远程手动开启报警输出"),
    /**
     * 远程手动关闭报警输出
     */
    MINOR_REMOTE_ALARMOUT_CLOSE_MAN(0xd7, "远程手动关闭报警输出"),
    /**
     * 远程设置报警主机的 RS485 串口使能状态
     */
    MINOR_REMOTE_ALARM_ENABLE_CFG(0xd8, "远程设置报警主机的 RS485 串口使能状态"),
    /**
     * 导出数据库记录
     */
    MINOR_DBDATA_OUTPUT(0xd9, "导出数据库记录"),
    /**
     * 导入数据库记录
     */
    MINOR_DBDATA_INPUT(0xda, "导入数据库记录"),
    /**
     * 级联切换
     */
    MINOR_MU_SWITCH(0xdb, "级联切换"),
    /**
     * 级联 PTZ 控制
     */
    MINOR_MU_PTZ(0xdc, "级联 PTZ 控制"),
    /**
     * 本地配置自动重建
     */
    MINOR_LOCAL_CONF_REB_RAID(0x101, "本地配置自动重建"),
    /**
     * 本地配置热备
     */
    MINOR_LOCAL_CONF_SPARE(0x102, "本地配置热备"),
    /**
     * 本地创建阵列
     */
    MINOR_LOCAL_ADD_RAID(0x103, "本地创建阵列"),
    /**
     * 本地删除阵列
     */
    MINOR_LOCAL_DEL_RAID(0x104, "本地删除阵列"),
    /**
     * 本地迁移阵列
     */
    MINOR_LOCAL_MIG_RAID(0x105, "本地迁移阵列"),
    /**
     * 本地手动重建阵列
     */
    MINOR_LOCAL_REB_RAID(0x106, "本地手动重建阵列"),
    /**
     * 本地一键配置
     */
    MINOR_LOCAL_QUICK_CONF_RAID(0x107, "本地一键配置"),
    /**
     * 本地创建虚拟磁盘
     */
    MINOR_LOCAL_ADD_VD(0x108, "本地创建虚拟磁盘"),
    /**
     * 本地删除虚拟磁盘
     */
    MINOR_LOCAL_DEL_VD(0x109, "本地删除虚拟磁盘"),
    /**
     * 本地修复虚拟磁盘
     */
    MINOR_LOCAL_RP_VD(0x10a, "本地修复虚拟磁盘"),
    /**
     * 本地扩展虚拟磁盘扩容
     */
    MINOR_LOCAL_FORMAT_EXPANDVD(0x10b, "本地扩展虚拟磁盘扩容"),
    /**
     * 本地 raid 卡升级
     */
    MINOR_LOCAL_RAID_UPGRADE(0x10c, "本地 raid 卡升级"),
    /**
     * 本地暂停 RAID 操作(即安全拔盘)
     */
    MINOR_LOCAL_STOP_RAID(0x10d, "本地暂停 RAID 操作(即安全拔盘)"),
    /**
     * 远程配置自动重建
     */
    MINOR_REMOTE_CONF_REB_RAID(0x111, "远程配置自动重建"),
    /**
     * 远程配置热备
     */
    MINOR_REMOTE_CONF_SPARE(0x112, "远程配置热备"),
    /**
     * 远程创建阵列
     */
    MINOR_REMOTE_ADD_RAID(0x113, "远程创建阵列"),
    /**
     * 远程删除阵列
     */
    MINOR_REMOTE_DEL_RAID(0x114, "远程删除阵列"),
    /**
     * 远程迁移阵列
     */
    MINOR_REMOTE_MIG_RAID(0x115, "远程迁移阵列"),
    /**
     * 远程手动重建阵列
     */
    MINOR_REMOTE_REB_RAID(0x116, "远程手动重建阵列"),
    /**
     * 远程一键配置
     */
    MINOR_REMOTE_QUICK_CONF_RAID(0x117, "远程一键配置"),
    /**
     * 远程创建虚拟磁盘
     */
    MINOR_REMOTE_ADD_VD(0x118, "远程创建虚拟磁盘"),
    /**
     * 远程删除虚拟磁盘
     */
    MINOR_REMOTE_DEL_VD(0x119, "远程删除虚拟磁盘"),
    /**
     * 远程修复虚拟磁盘
     */
    MINOR_REMOTE_RP_VD(0x11a, "远程修复虚拟磁盘"),
    /**
     * 远程虚拟磁盘扩容
     */
    MINOR_REMOTE_FORMAT_EXPANDVD(0x11b, "远程虚拟磁盘扩容"),
    /**
     * 远程 raid 卡升级
     */
    MINOR_REMOTE_RAID_UPGRADE(0x11c, "远程 raid 卡升级"),
    /**
     * 远程暂停 RAID 操作(即安全拔盘)
     */
    MINOR_REMOTE_STOP_RAID(0x11d, "远程暂停 RAID 操作(即安全拔盘)"),
    /**
     * 本地开始抓图
     */
    MINOR_LOCAL_START_PIC_REC(0x121, "本地开始抓图"),
    /**
     * 本地停止抓图
     */
    MINOR_LOCAL_STOP_PIC_REC(0x122, "本地停止抓图"),
    /**
     * 本地配置 SNMP
     */
    MINOR_LOCAL_SET_SNMP(0x125, "本地配置 SNMP"),
    /**
     * 本地标签操作
     */
    MINOR_LOCAL_TAG_OPT(0x126, "本地标签操作"),
    /**
     * 远程开始抓图
     */
    MINOR_REMOTE_START_PIC_REC(0x131, "远程开始抓图"),
    /**
     * 远程停止抓图
     */
    MINOR_REMOTE_STOP_PIC_REC(0x132, "远程停止抓图"),
    /**
     * 远程配置 SNMP
     */
    MINOR_REMOTE_SET_SNMP(0x135, "远程配置 SNMP"),
    /**
     * 远程标签操作
     */
    MINOR_REMOTE_TAG_OPT(0x136, "远程标签操作"),
    /**
     * 本地输出口切换操作
     */
    MINOR_LOCAL_VOUT_SWITCH(0x140, "本地输出口切换操作"),
    /**
     * 码流压缩性能选项配置操作
     */
    MINOR_STREAM_CABAC(0x141, "码流压缩性能选项配置操作"),
    /**
     * 本地 N+1 热备相关操作
     */
    MINOR_LOCAL_SPARE_OPT(0x142, "本地 N+1 热备相关操作"),
    /**
     * 远程 N+1 热备相关操作
     */
    MINOR_REMOTE_SPARE_OPT(0x143, "远程 N+1 热备相关操作"),
    /**
     * 本地导出 ipc 配置文件
     */
    MINOR_LOCAL_IPCCFGFILE_OUTPUT(0x144, "本地导出 ipc 配置文件"),
    /**
     * 本地导入 ipc 配置文件
     */
    MINOR_LOCAL_IPCCFGFILE_INPUT(0x145, "本地导入 ipc 配置文件"),
    /**
     * 本地升级 IPC
     */
    MINOR_LOCAL_IPC_UPGRADE(0x146, "本地升级 IPC"),
    /**
     * 远程导出 ipc 配置文件
     */
    MINOR_REMOTE_IPCCFGFILE_OUTPUT(0x147, "远程导出 ipc 配置文件"),
    /**
     * 远程导入 ipc 配置文件
     */
    MINOR_REMOTE_IPCCFGFILE_INPUT(0x148, "远程导入 ipc 配置文件"),
    /**
     * 远程升级 IPC
     */
    MINOR_REMOTE_IPC_UPGRADE(0x149, "远程升级 IPC"),
    /**
     * 本地加载硬盘
     */
    MINOR_LOCAL_LOAD_HDISK(0x300, "本地加载硬盘"),
    /**
     * 本地删除异常不存在的硬盘
     */
    MINOR_LOCAL_DELETE_HDISK(0x301, "本地删除异常不存在的硬盘"),
    /**
     * 远程添加存储池
     */
    MINOR_REMOTE_CREATE_STORAGE_POOL(0x211c, "远程添加存储池"),
    /**
     * 远程删除存储池
     */
    MINOR_REMOTE_DEL_STORAGE_POOL(0x211d, "远程删除存储池"),
    /**
     * 远程删除图片数据
     */
    MINOR_REMOTE_DEL_PIC(0x2120, "远程删除图片数据"),
    /**
     * 远程删除录像数据
     */
    MINOR_REMOTE_DEL_RECORD(0x2121, "远程删除录像数据"),
    /**
     * 远程设置云存储启用
     */
    MINOR_REMOTE_CLOUD_ENABLE(0x2123, "远程设置云存储启用"),
    /**
     * 远程设置云存储禁用
     */
    MINOR_REMOTE_CLOUD_DISABLE(0x2124, "远程设置云存储禁用"),
    /**
     * 远程修改云存储池参数
     */
    MINOR_REMOTE_CLOUD_MODIFY_PARAM(0x2125, "远程修改云存储池参数"),
    /**
     * 远程修改云存储池容量
     */
    MINOR_REMOTE_CLOUD_MODIFY_VOLUME(0x2126, "远程修改云存储池容量");

    private int code;
    private String description;

    public static Optional<Operation> byCode(int code) {
      return EnumSet.allOf(Operation.class).stream().filter(in -> in.code == code).findFirst();
    }
  }

  /**
   * 附加日志次类型
   */
  @Getter
  @AllArgsConstructor
  public enum Information implements HikvisionEnum {

    /**
     * 硬盘信息
     */
    MINOR_HDD_INFO(0xa1, "硬盘信息"),
    /**
     * S.M.A.R.T 信息
     */
    MINOR_SMART_INFO(0xa2, "S.M.A.R.T 信息"),
    /**
     * 开始录像
     */
    MINOR_REC_START(0xa3, "开始录像"),
    /**
     * 停止录像
     */
    MINOR_REC_STOP(0xa4, "停止录像"),
    /**
     * 过期录像删除
     */
    MINOR_REC_OVERDUE(0xa5, "过期录像删除"),
    /**
     * 连接前端设备
     */
    MINOR_LINK_START(0xa6, "连接前端设备"),
    /**
     * 断开前端设备
     */
    MINOR_LINK_STOP(0xa7, "断开前端设备"),
    /**
     * 网络硬盘信息
     */
    MINOR_NET_DISK_INFO(0xa8, "网络硬盘信息"),
    /**
     * raid 相关信息
     */
    MINOR_RAID_INFO(0xa9, "raid 相关信息"),
    /**
     * 系统运行状态信息
     */
    MINOR_RUN_STATUS_INFO(0xaa, "系统运行状态信息"),
    /**
     * 开始抓图
     */
    MINOR_PIC_REC_START(0xb3, "开始抓图"),
    /**
     * 停止抓图
     */
    MINOR_PIC_REC_STOP(0xb4, "停止抓图"),
    /**
     * 过期图片文件删除
     */
    MINOR_PIC_REC_OVERDUE(0xb5, "过期图片文件删除"),
    /**
     * 登录服务器成功
     */
    MINOR_CLIENT_LOGIN(0xb6, "登录服务器成功"),
    /**
     * 重新登录服务器
     */
    MINOR_CLIENT_RELOGIN(0xb7, "重新登录服务器"),
    /**
     * 退出服务器成功
     */
    MINOR_CLIENT_LOGOUT(0xb8, "退出服务器成功"),
    /**
     * 录像同步开始
     */
    MINOR_CLIENT_SYNC_START(0xb9, "录像同步开始"),
    /**
     * 录像同步终止
     */
    MINOR_CLIENT_SYNC_STOP(0xba, "录像同步终止"),
    /**
     * 录像同步成功
     */
    MINOR_CLIENT_SYNC_SUCC(0xbb, "录像同步成功"),
    /**
     * 录像同步异常
     */
    MINOR_CLIENT_SYNC_EXCP(0xbc, "录像同步异常"),
    /**
     * 全局错误记录信息
     */
    MINOR_GLOBAL_RECORD_ERR_INFO(0xbd, "全局错误记录信息"),
    /**
     * 缓冲区状态日志记录
     */
    MINOR_BUFFER_STATE(0xbe, "缓冲区状态日志记录"),
    /**
     * 硬盘错误详细信息 V2
     */
    MINOR_DISK_ERRORINFO_V2(0xbf, "硬盘错误详细信息 V2"),
    /**
     * 配件板信息
     */
    MINOR_ACCESSORIES_MESSAGE(0xc6, "配件板信息"),
    /**
     * 萤石运行状态
     */
    MINOR_EZVIZ_OPERATION(0xcc, "萤石运行状态");

    private int code;
    private String description;

    public static Optional<Information> byCode(int code) {
      return EnumSet.allOf(Information.class).stream().filter(in -> in.code == code).findFirst();
    }
  }
}
