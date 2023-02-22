package cn.labzen.hikvision.jna.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

/**
 * 汽车品牌，参考VLR_VEHICLE_CLASS
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@AllArgsConstructor
public enum VehicleBrand implements HikvisionEnum {

  /**
   * 其它
   */
  VLR_OTHER(0, "其它"),
  /**
   * 大众
   */
  VLR_VOLKSWAGEN(1, "大众"),
  /**
   * 别克
   */
  VLR_BUICK(2, "别克"),
  /**
   * 宝马
   */
  VLR_BMW(3, "宝马"),
  /**
   * 本田
   */
  VLR_HONDA(4, "本田"),
  /**
   * 标致
   */
  VLR_PEUGEOT(5, "标致"),
  /**
   * 丰田
   */
  VLR_TOYOTA(6, "丰田"),
  /**
   * 福特
   */
  VLR_FORD(7, "福特"),
  /**
   * 日产
   */
  VLR_NISSAN(8, "日产"),
  /**
   * 奥迪
   */
  VLR_AUDI(9, "奥迪"),
  /**
   * 马自达
   */
  VLR_MAZDA(10, "马自达"),
  /**
   * 雪佛兰
   */
  VLR_CHEVROLET(11, "雪佛兰"),
  /**
   * 雪铁龙
   */
  VLR_CITROEN(12, "雪铁龙"),
  /**
   * 现代
   */
  VLR_HYUNDAI(13, "现代"),
  /**
   * 奇瑞
   */
  VLR_CHERY(14, "奇瑞"),
  /**
   * 起亚
   */
  VLR_KIA(15, "起亚"),
  /**
   * 荣威
   */
  VLR_ROEWE(16, "荣威"),
  /**
   * 三菱
   */
  VLR_MITSUBISHI(17, "三菱"),
  /**
   * 斯柯达
   */
  VLR_SKODA(18, "斯柯达"),
  /**
   * 吉利
   */
  VLR_GEELY(19, "吉利"),
  /**
   * 中华
   */
  VLR_ZHONGHUA(20, "中华"),
  /**
   * 沃尔沃
   */
  VLR_VOLVO(21, "沃尔沃"),
  /**
   * 雷克萨斯
   */
  VLR_LEXUS(22, "雷克萨斯"),
  /**
   * 菲亚特
   */
  VLR_FIAT(23, "菲亚特"),
  /**
   * 帝豪(吉利)
   */
  VLR_EMGRAND(24, "帝豪(吉利)"),
  /**
   * 东风
   */
  VLR_DONGFENG(25, "东风"),
  /**
   * 比亚迪
   */
  VLR_BYD(26, "比亚迪"),
  /**
   * 铃木
   */
  VLR_SUZUKI(27, "铃木"),
  /**
   * 金杯
   */
  VLR_JINBEI(28, "金杯"),
  /**
   * 海马
   */
  VLR_HAIMA(29, "海马"),
  /**
   * 五菱
   */
  VLR_SGMW(30, "五菱"),
  /**
   * 江淮
   */
  VLR_JAC(31, "江淮"),
  /**
   * 斯巴鲁
   */
  VLR_SUBARU(32, "斯巴鲁"),
  /**
   * 英伦(吉利)
   */
  VLR_ENGLON(33, "英伦(吉利)"),
  /**
   * 长城
   */
  VLR_GREATWALL(34, "长城"),
  /**
   * 哈飞
   */
  VLR_HAFEI(35, "哈飞"),
  /**
   * 五十铃(庆铃)
   */
  VLR_ISUZU(36, "五十铃(庆铃)"),
  /**
   * 东南
   */
  VLR_SOUEAST(37, "东南"),
  /**
   * 长安
   */
  VLR_CHANA(38, "长安"),
  /**
   * 福田
   */
  VLR_FOTON(39, "福田"),
  /**
   * 夏利(一汽)
   */
  VLR_XIALI(40, "夏利(一汽)"),
  /**
   * 奔驰
   */
  VLR_BENZ(41, "奔驰"),
  /**
   * 一汽
   */
  VLR_FAW(42, "一汽"),
  /**
   * 依维柯
   */
  VLR_NAVECO(43, "依维柯"),
  /**
   * 力帆
   */
  VLR_LIFAN(44, "力帆"),
  /**
   * 一汽奔腾(一汽)
   */
  VLR_BESTURN(45, "一汽奔腾(一汽)"),
  /**
   * 皇冠(丰田)
   */
  VLR_CROWN(46, "皇冠(丰田)"),
  /**
   * 雷诺
   */
  VLR_RENAULT(47, "雷诺"),
  /**
   * JMC(江铃)
   */
  VLR_JMC(48, "JMC(江铃)"),
  /**
   * MG名爵
   */
  VLR_MG(49, "MG名爵"),
  /**
   * 凯马
   */
  VLR_KAMA(50, "凯马"),
  /**
   * 众泰
   */
  VLR_ZOTYE(51, "众泰"),
  /**
   * 昌河
   */
  VLR_CHANGHE(52, "昌河"),
  /**
   * 厦门金龙(金旅)
   */
  VLR_XMKINGLONG(53, "厦门金龙(金旅)"),
  /**
   * 上海汇众(上汽集团)
   */
  VLR_HUIZHONG(54, "上海汇众(上汽集团)"),
  /**
   * 苏州金龙
   */
  VLR_SZKINGLONG(55, "苏州金龙"),
  /**
   * 海格
   */
  VLR_HIGER(56, "海格"),
  /**
   * 宇通
   */
  VLR_YUTONG(57, "宇通"),
  /**
   * 中国重汽
   */
  VLR_CNHTC(58, "中国重汽"),
  /**
   * 北奔重卡
   */
  VLR_BEIBEN(59, "北奔重卡"),
  /**
   * 华菱星马
   */
  VLR_XINGMA(60, "华菱星马"),
  /**
   * 跃进
   */
  VLR_YUEJIN(61, "跃进"),
  /**
   * 黄海
   */
  VLR_HUANGHAI(62, "黄海"),
  /**
   * 老款长城
   */
  VLR_OLDWALL(63, "老款长城"),
  /**
   * 长安商用
   */
  VLR_CHANACOMMERCIAL(64, "长安商用"),
  /**
   * 保时捷
   */
  VLR_PORSCHE(65, " 保时捷"),
  /**
   * 凯迪拉克
   */
  VLR_CADILLAC(66, " 凯迪拉克"),
  /**
   * 英菲尼迪
   */
  VLR_INFINITI(67, " 英菲尼迪"),
  /**
   * 吉利全球鹰(吉利)
   */
  VLR_GLEAGLE(68, " 吉利全球鹰(吉利)"),
  /**
   * JEEP(吉普)
   */
  VLR_JEEP(69, " JEEP(吉普)"),
  /**
   * 路虎
   */
  VLR_LANDROVER(70, " 路虎"),
  /**
   * 长丰
   */
  VLR_CHANGFENG(71, " 长丰"),
  /**
   * 长安奔奔(长安)
   */
  VLR_BENNI(72, " 长安奔奔(长安)"),
  /**
   * 福田时代(时代)
   */
  VLR_ERA(73, " 福田时代(时代)"),
  /**
   * 长安金牛星(长安商用)
   */
  VLR_TAURUS(74, " 长安金牛星(长安商用)"),
  /**
   * 长安逸动
   */
  VLR_EADO(75, " 长安逸动"),
  /**
   * 陕汽
   */
  VLR_SHANQI(76, " 陕汽"),
  /**
   * 红岩汽车(上汽依维柯红岩)
   */
  VLR_HONGYAN(77, " 红岩汽车(上汽依维柯红岩)"),
  /**
   * 霸龙汽车(东风柳汽)
   */
  VLR_DRAGON(78, " 霸龙汽车(东风柳汽)"),
  /**
   * 江淮JAC (江淮)
   */
  VLR_JACTEXT(79, " 江淮JAC (江淮)"),
  /**
   * 江淮现代客车 (江淮)
   */
  VLR_JACBUS(80, " 江淮现代客车 (江淮)"),
  /**
   * 安凯客车
   */
  VLR_ANKAI(81, " 安凯客车"),
  /**
   * 申龙客车
   */
  VLR_SHENLONG(82, " 申龙客车"),
  /**
   * 大宇客车
   */
  VLR_DAEWOO(83, " 大宇客车"),
  /**
   * 五征汽车
   */
  VLR_WUZHENG(84, " 五征汽车"),
  /**
   * MAN汽车
   */
  VLR_MAN(85, " MAN汽车"),
  /**
   * 中通客车
   */
  VLR_ZHONGTONG(86, " 中通客车"),
  /**
   * 宝骏
   */
  VLR_BAOJUN(87, " 宝骏"),
  /**
   * 北汽威旺
   */
  VLR_BQWEIWANG(88, " 北汽威旺"),
  /**
   * 传祺
   */
  VLR_TRUMPCHE(89, " 传祺"),
  /**
   * 陆风
   */
  VLR_LUFENG(90, " 陆风"),
  /**
   * 海马郑州
   */
  VLR_HMZHENGZHOU(91, " 海马郑州"),
  /**
   * 北京汽车
   */
  VLR_BEIJING(92, " 北京汽车"),
  /**
   * 中顺
   */
  VLR_ZHONGSHUN(93, " 中顺"),
  /**
   * 威麟汽车
   */
  VLR_WEILIN(94, " 威麟汽车"),
  /**
   * 欧宝
   */
  VLR_OPEL(95, " 欧宝"),
  /**
   * 开瑞
   */
  VLR_KARRY(96, " 开瑞"),
  /**
   * 华普汽车
   */
  VLR_SMA(97, " 华普汽车"),
  /**
   * 华普汽车文字SMA
   */
  VLR_SMATEXT(98, " 华普汽车文字SMA"),
  /**
   * 江铃驭胜
   */
  VLR_YUWIN(99, " 江铃驭胜"),
  /**
   * 宝马MINI
   */
  VLR_MINI(100, " 宝马MINI"),
  /**
   * 丰田MARKX
   */
  VLR_MARK(101, " 丰田MARKX"),
  /**
   * 哈弗HAVAL
   */
  VLR_HAVAL(102, " 哈弗HAVAL"),
  /**
   * 讴歌
   */
  VLR_OGA(103, " 讴歌"),
  /**
   * 启辰
   */
  VLR_VENUCIA(104, " 启辰"),
  /**
   * 比亚迪样式2 (比亚迪)
   */
  VLR_BYD2(105, " 比亚迪样式2 (比亚迪)"),
  /**
   * 奔驰SMART
   */
  VLR_SMART(106, " 奔驰SMART"),
  /**
   * 北京汽车制造厂BAW
   */
  VLR_BAW(107, " 北京汽车制造厂BAW"),
  /**
   * 纳智捷
   */
  VLR_LUXGEN(108, " 纳智捷"),
  /**
   * 野马
   */
  VLR_YEMA(109, " 野马"),
  /**
   * 中兴
   */
  VLR_ZTE(110, " 中兴"),
  /**
   * 理念
   */
  VLR_EVERUS(111, " 理念"),
  /**
   * 克莱斯勒
   */
  VLR_CHRYSLER(112, " 克莱斯勒"),
  /**
   * 吉奥汽车
   */
  VLR_GONOW(113, " 吉奥汽车"),
  /**
   * 松花江
   */
  VLR_SHJIANG(114, " 松花江"),
  /**
   * 瑞麟
   */
  VLR_RUILIN(115, " 瑞麟"),
  /**
   * 福达
   */
  VLR_FORTA(116, " 福达"),
  /**
   * 捷豹
   */
  VLR_GAGUAR(117, " 捷豹"),
  /**
   * 黑豹
   */
  VLR_HEIBAO(118, " 黑豹"),
  /**
   * 唐骏
   */
  VLR_TKING(119, " 唐骏"),
  /**
   * 唐骏文字
   */
  VLR_TKINGTEXT(120, " 唐骏文字"),
  /**
   * 福迪
   */
  VLR_FODAY(121, " 福迪"),
  /**
   * 莲花汽车
   */
  VLR_LOTUS(122, " 莲花汽车"),
  /**
   * 南骏
   */
  VLR_NANJUN(123, " 南骏"),
  /**
   * 双环汽车
   */
  VLR_SHUANGHUAN(124, " 双环汽车"),
  /**
   * 哈飞赛豹
   */
  VLR_SAIBAO(125, " 哈飞赛豹"),
  /**
   * 华泰
   */
  VLR_HAWTAI(126, " 华泰"),
  /**
   * 永源飞碟
   */
  VLR_LIFO(127, " 永源飞碟"),
  /**
   * 永源汽车
   */
  VLR_JONWAY(128, " 永源汽车"),
  /**
   * 福龙马
   */
  VLR_FULONGMA(129, " 福龙马"),
  /**
   * 潍力
   */
  VLR_WEILI(130, " 潍力"),
  /**
   * 江淮安驰
   */
  VLR_ANCHI(131, " 江淮安驰"),
  /**
   * 派喜
   */
  VLR_PAIXI(132, " 派喜"),
  /**
   * 海格HIGER文字
   */
  VLR_HIGERTEXT(133, " 海格HIGER文字"),
  /**
   * 广汽日野轻卡
   */
  VLR_RIYECAR(134, " 广汽日野轻卡"),
  /**
   * 广汽日野重卡
   */
  VLR_RIYETRUCK(135, " 广汽日野重卡"),
  /**
   * 江南
   */
  VLR_JIANGNAN(136, " 江南"),
  /**
   * 老款众泰
   */
  VLR_OLDZOTYE(137, " 老款众泰"),
  /**
   * 老款夏利
   */
  VLR_OLDXIALI(138, " 老款夏利"),
  /**
   * 新奥驰
   */
  VLR_NEWAOCHI(139, " 新奥驰"),
  /**
   * 王牌重汽
   */
  VLR_CDW(140, " 王牌重汽"),
  /**
   * 王牌重汽文字
   */
  VLR_CDWTEXT(141, " 王牌重汽文字"),
  /**
   * 本田思铭
   */
  VLR_CIIMO(142, " 本田思铭"),
  /**
   * 长安谛艾仕
   */
  VLR_CHANADS(143, " 长安谛艾仕"),
  /**
   * 道奇
   */
  VLR_DS(144, " 道奇"),
  /**
   * 现代劳恩斯酷派
   */
  VLR_ROHENS(145, " 现代劳恩斯酷派"),
  /**
   * 燕台
   */
  VLR_YANTAI(146, " 燕台"),
  /**
   * 双龙
   */
  VLR_SHUANGLONG(147, " 双龙"),
  /**
   * 时代风菱
   */
  VLR_FENGLING(148, " 时代风菱"),
  /**
   * 新凯
   */
  VLR_XINKAI(149, " 新凯"),
  /**
   * GMC
   */
  VLR_GMC(150, " GMC"),
  /**
   * 上汽大通
   */
  VLR_DATONG(151, " 上汽大通"),
  /**
   * 北汽银翔
   */
  VLR_BQYINXIANG(152, " 北汽银翔"),
  /**
   * 新奇瑞
   */
  VLR_NEWCHERY(153, " 新奇瑞"),
  /**
   * 牡丹
   */
  VLR_MUDAN(154, " 牡丹"),
  /**
   * 大运汽车
   */
  VLR_DAYUN(155, " 大运汽车"),
  /**
   * 东沃汽车
   */
  VLR_DONGWO(156, " 东沃汽车"),
  /**
   * 联合汽车
   */
  VLR_UNION(157, " 联合汽车"),
  /**
   * 春洲客车
   */
  VLR_CHUNZHOU(158, " 春洲客车"),
  /**
   * 三一重工
   */
  VLR_SANY(159, " 三一重工"),
  /**
   * 亚星客车
   */
  VLR_YAXING(160, " 亚星客车"),
  /**
   * 恒通客车
   */
  VLR_HENGTONG(161, " 恒通客车"),
  /**
   * 少林客车
   */
  VLR_SHAOLIN(162, " 少林客车"),
  /**
   * 青年客车
   */
  VLR_YOUNG(163, " 青年客车"),
  /**
   * 十通
   */
  VLR_STOM(164, " 十通"),
  /**
   * 三环
   */
  VLR_SANHUAN(165, " 三环"),
  /**
   * 徐工
   */
  VLR_XUGONG(166, " 徐工"),
  /**
   * 北方汽车
   */
  VLR_BEIFANG(167, " 北方汽车"),
  /**
   * 江环货车
   */
  VLR_JIANGHUAN(168, " 江环货车"),
  /**
   * 北京农用
   */
  VLR_BJFARM(169, " 北京农用"),
  /**
   * 新大地汽车
   */
  VLR_NEWDADI(170, " 新大地汽车"),
  /**
   * 申沃客车
   */
  VLR_SUNWIN(171, " 申沃客车"),
  /**
   * 英田
   */
  VLR_YINGTIAN(172, " 英田"),
  /**
   * 轻骑
   */
  VLR_QINGQI(173, " 轻骑"),
  /**
   * 楚风汽车
   */
  VLR_CHUFENG(174, " 楚风汽车"),
  /**
   * 斯堪尼亚
   */
  VLR_SCANIA(175, " 斯堪尼亚"),
  /**
   * 九龙客车
   */
  VLR_JIULONG(176, " 九龙客车"),
  /**
   * 友谊客车
   */
  VLR_YOUYI(177, " 友谊客车"),
  /**
   * 上饶客车
   */
  VLR_SHANGRAO(178, " 上饶客车"),
  /**
   * 吉江
   */
  VLR_JIJIANG(179, " 吉江"),
  /**
   * 扬子客车
   */
  VLR_YANGZI(180, " 扬子客车"),
  /**
   * 西沃客车
   */
  VLR_XIWO(181, " 西沃客车"),
  /**
   * 长江客车
   */
  VLR_CHANGJIANG(182, " 长江客车"),
  /**
   * 武夷
   */
  VLR_WUYI(183, " 武夷"),
  /**
   * 成都客车
   */
  VLR_CHENGDU(184, " 成都客车"),
  /**
   * 天马
   */
  VLR_TIANMA(185, " 天马"),
  /**
   * 宝龙
   */
  VLR_BAOLONG(186, " 宝龙"),
  /**
   * 新雅途
   */
  VLR_NEWYATU(187, " 新雅途"),
  /**
   * 起亚霸锐
   */
  VLR_BARUI(188, " 起亚霸锐"),
  /**
   * 观致
   */
  VLR_GUANZHI(189, " 观致"),
  /**
   * 西雅特
   */
  VLR_XIYATE(190, " 西雅特"),
  /**
   * 宾利
   */
  VLR_BINLI(191, " 宾利"),
  /**
   * 大迪
   */
  VLR_DADI(192, " 大迪"),
  /**
   * 富奇
   */
  VLR_FUQI(193, " 富奇"),
  /**
   * 航天汽车
   */
  VLR_HANGTIAN(194, " 航天汽车"),
  /**
   * 恒天汽车
   */
  VLR_HENGTIAN(195, " 恒天汽车"),
  /**
   * 江铃轻汽
   */
  VLR_JMCCAR(196, " 江铃轻汽"),
  /**
   * 卡尔森汽车
   */
  VLR_KAERSEN(197, " 卡尔森汽车"),
  /**
   * 卡威汽车
   */
  VLR_KAWEI(198, " 卡威汽车"),
  /**
   * 兰博基尼
   */
  VLR_LANBOJINI(199, " 兰博基尼"),
  /**
   * 玛莎拉蒂
   */
  VLR_MASHALADI(200, " 玛莎拉蒂"),
  /**
   * 舒驰客车
   */
  VLR_SHUCHI(201, " 舒驰客车"),
  /**
   * 实力客车
   */
  VLR_SHILI(202, " 实力客车"),
  /**
   * 中客华北
   */
  VLR_HUABEI(203, " 中客华北"),
  /**
   * 上汽仪征
   */
  VLR_YIZHENG(204, " 上汽仪征"),
  /**
   * 春兰汽车
   */
  VLR_CHUNLAN(205, " 春兰汽车"),
  /**
   * 大发汽车
   */
  VLR_DAFA(206, " 大发汽车"),
  /**
   * 神野汽车
   */
  VLR_SHENYE(207, " 神野汽车"),
  /**
   * 法拉利汽车
   */
  VLR_FALALI(208, " 法拉利汽车"),
  /**
   * 福星汽车
   */
  VLR_FUXING(209, " 福星汽车"),
  /**
   * 安源客车
   */
  VLR_ANYUAN(210, " 安源客车"),
  /**
   * 京华客车
   */
  VLR_JINGHUA(211, " 京华客车"),
  /**
   * 太湖客车
   */
  VLR_TAIHU(212, " 太湖客车"),
  /**
   * 五洲龙
   */
  VLR_WUZHOULONG(213, " 五洲龙"),
  /**
   * 常隆客车
   */
  VLR_CHANGLONG(214, " 常隆客车"),
  /**
   * 悦西客车
   */
  VLR_YUEXI(215, " 悦西客车"),
  /**
   * 神马客车
   */
  VLR_SHENMA(216, " 神马客车"),
  /**
   * 庐山牌
   */
  VLR_LUSHAN(217, " 庐山牌"),
  /**
   * 万丰牌
   */
  VLR_WANFENG(218, " 万丰牌"),
  /**
   * 广州云豹
   */
  VLR_GZYUNBAO(219, " 广州云豹"),
  /**
   * 中大汽车
   */
  VLR_ZHONGDA(220, " 中大汽车"),
  /**
   * 三轮车
   */
  VLR_THREEWHEEL(221, " 三轮车"),
  /**
   * 二轮车
   */
  VLR_TWOWHEEL(222, " 二轮车"),
  /**
   * 金杯JBC
   */
  VLR_JBC(223, " 金杯JBC"),
  /**
   * 扬子江客车
   */
  VLR_YZJIANG(224, " 扬子江客车"),
  /**
   * 南骏CNJ
   */
  VLR_CNJ(225, " 南骏CNJ"),
  /**
   * 福田时代文字
   */
  VLR_FORLAND(226, " 福田时代文字"),
  /**
   * 农用车
   */
  VLR_FARMCAR(227, " 农用车"),
  /**
   * 东方红
   */
  VLR_DONGFANGHONG(228, " 东方红"),
  /**
   * 斯太尔汽车
   */
  VLR_STEYR(229, " 斯太尔汽车"),
  /**
   * 红旗
   */
  VLR_HONGQI(230, " 红旗"),
  /**
   * 用户1
   */
  VLR_USER1(231, "用户1"),
  /**
   * 用户2
   */
  VLR_USER2(232, "用户2"),
  /**
   * 用户3
   */
  VLR_USER3(233, "用户3"),
  /**
   * 用户4
   */
  VLR_USER4(234, "用户4"),
  /**
   * 用户5
   */
  VLR_USER5(235, "用户5"),
  /**
   * 用户6
   */
  VLR_USER6(236, "用户6"),
  /**
   * 用户7
   */
  VLR_USER7(237, "用户7"),
  /**
   * 用户8
   */
  VLR_USER8(238, "用户8");

  private int code;
  private String description;

  public static Optional<VehicleBrand> byCode(int code) {
    return EnumSet.allOf(VehicleBrand.class).stream().filter(in -> in.code == code).findFirst();
  }
}
