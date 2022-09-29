/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50621
Source Host           : 127.0.0.1:3306
Source Database       : pss1

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-09-13 11:28:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `cusid` int(11) NOT NULL AUTO_INCREMENT,
  `cusname` varchar(255) NOT NULL,
  `custel` varchar(255) NOT NULL,
  `cusmobile` varchar(255) DEFAULT NULL,
  `cusaddr` varchar(255) DEFAULT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`cusid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', '王明浩', '17833328909', '0551-2768776', '上海浦东', '1');
INSERT INTO `t_customer` VALUES ('2', '孙田芳', '13966632879', '0552-6638909', '广州高新区', '1');
INSERT INTO `t_customer` VALUES ('3', '胡思陈', '13256078976', '0551-3478776', '青岛李沧', '1');
INSERT INTO `t_customer` VALUES ('4', '陈玉梅', '13837866578', '0552-22679876', '济宁', '1');
INSERT INTO `t_customer` VALUES ('6', '肖奈啊', '13856066578', '0552-4469876', '济宁', '1');
INSERT INTO `t_customer` VALUES ('7', '赵二喜', '12343567787', '0551-1235467', '河南', '1');
INSERT INTO `t_customer` VALUES ('8', '孟婉琪', '16787650098', '0552-1876998', '北京', '1');
INSERT INTO `t_customer` VALUES ('9', '赵艾迪', '12879087578', '0550-1398767', '云南', '1');
INSERT INTO `t_customer` VALUES ('10', '赵启平', '1302537898', '0551-0989776', '山东', '1');
INSERT INTO `t_customer` VALUES ('11', '安世月', '1354378977', '0552-1097778', '深圳', '1');
INSERT INTO `t_customer` VALUES ('12', '王倩倩', '1320989776', '0559-1098767', '广州', '1');
INSERT INTO `t_customer` VALUES ('13', '刘奇', '1321276776', '0550-1098767', '上海', '1');
INSERT INTO `t_customer` VALUES ('14', '周杰', '1320602776', '0554-1012097', '山东', '1');
INSERT INTO `t_customer` VALUES ('15', '齐奇', '1310989776', '0557-10198787', '深圳', '1');
INSERT INTO `t_customer` VALUES ('16', '张毅', '1564564687', '1231544864', '南京', '1');

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `proid` int(11) NOT NULL AUTO_INCREMENT,
  `proname` varchar(60) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `safeamount` int(11) DEFAULT NULL,
  `sugpurchase` decimal(10,0) NOT NULL,
  `sugsell` decimal(10,0) NOT NULL,
  `storecount` int(11) NOT NULL DEFAULT '0',
  `lastpurchase` date DEFAULT NULL,
  `lastsale` date DEFAULT NULL,
  `state` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`proid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1', 'vivo', 'XP', '500', '3000', '3698', '100', '2016-08-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('2', '乐视', 'Max2', '600', '1600', '2099', '56', '2016-06-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('3', '红米', 'Note3', '1500', '800', '1099', '12', '2016-06-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('4', '华为', 'V8', '5000', '1800', '2299', '4000', '2016-06-18', '2016-09-07', '0');
INSERT INTO `t_product` VALUES ('5', 'OPPO', 'A37', '500', '800', '1299', '152', '2016-06-18', '2016-09-07', '0');
INSERT INTO `t_product` VALUES ('6', 'vivo', 'V3Max', '500', '1399', '1798', '7', '2017-06-18', '2016-07-07', '0');
INSERT INTO `t_product` VALUES ('7', '小米', 'Note4', '5000', '700', '1199', '-2000', '2016-07-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('8', '诺基亚', '130DS', '1000', '100', '199', '11', '2016-07-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('9', '三星', 'note7', '700', '4999', '5998', '300', '2016-04-18', '2016-08-07', '1');
INSERT INTO `t_product` VALUES ('10', '魅族', '3S', '5000', '599', '798', '-3000', '2016-04-18', '2016-08-07', '1');
INSERT INTO `t_product` VALUES ('11', '小米', '4S', '5000', '1000', '1398', '2001', '2016-08-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('12', 'OPPO', 'A59', '800', '1399', '1799', '297', '2016-06-18', '2016-07-07', '1');
INSERT INTO `t_product` VALUES ('13', 'vivo', 'X7', '4000', '1899', '2499', '1000', '2016-03-18', '2016-08-07', '1');
INSERT INTO `t_product` VALUES ('14', 'iPhone', '6S', '4000', '3399', '3869', '1000', '2016-03-18', '2016-06-07', '1');
INSERT INTO `t_product` VALUES ('15', '魅族', 'Note3', '1000', '700', '999', '300', '2016-03-18', '2016-06-07', '1');
INSERT INTO `t_product` VALUES ('16', '小米', '4S', '5000', '1000', '1398', '2000', '2016-08-18', '2016-09-07', '1');
INSERT INTO `t_product` VALUES ('17', '小辣椒', 'A3', '10', '500', '650', '1', '2016-01-01', '2016-05-01', '1');

-- ----------------------------
-- Table structure for t_purchase
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase`;
CREATE TABLE `t_purchase` (
  `purid` int(11) NOT NULL AUTO_INCREMENT,
  `proid` int(11) NOT NULL,
  `purcount` int(11) DEFAULT NULL,
  `purunitprice` decimal(10,0) DEFAULT NULL,
  `supid` int(11) DEFAULT NULL,
  `purdate` date DEFAULT NULL,
  `retamount` int(11) DEFAULT '0',
  `rettime` date DEFAULT NULL,
  `retreason` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`purid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase
-- ----------------------------
INSERT INTO `t_purchase` VALUES ('1', '12', '2', '998', '7', '2015-08-17', '0', null, null);
INSERT INTO `t_purchase` VALUES ('2', '12', '2', '998', '5', '2015-08-17', '2', '2016-09-08', '频繁死机');
INSERT INTO `t_purchase` VALUES ('3', '8', '3', '1280', '9', '2014-07-18', '0', null, null);
INSERT INTO `t_purchase` VALUES ('4', '2', '2', '788', '9', '2015-10-30', '1', '2016-09-13', '');
INSERT INTO `t_purchase` VALUES ('5', '6', '1', '6200', '10', '2013-11-21', '0', null, null);
INSERT INTO `t_purchase` VALUES ('6', '9', '2', '3000', '1', '2012-05-01', '0', null, null);
INSERT INTO `t_purchase` VALUES ('7', '1', '3', '1500', '9', '2014-08-11', '1', '2016-02-10', '主板烧坏');
INSERT INTO `t_purchase` VALUES ('8', '3', '3', '1024', '9', '2012-07-10', '0', null, null);
INSERT INTO `t_purchase` VALUES ('9', '2', '5', '360', '5', '2015-06-13', '1', '2016-09-09', null);
INSERT INTO `t_purchase` VALUES ('10', '17', '4', '720', '7', '2014-02-12', '0', null, null);
INSERT INTO `t_purchase` VALUES ('11', '10', '2', '330', '4', '2014-04-14', '1', '2016-09-08', '以旧换新');
INSERT INTO `t_purchase` VALUES ('17', '8', '10', '56', '8', '2016-09-08', '0', null, null);
INSERT INTO `t_purchase` VALUES ('18', '3', '9', '570', '3', '2016-09-08', '0', null, null);
INSERT INTO `t_purchase` VALUES ('19', '6', '7', '600', '6', '2016-09-08', '1', '2016-09-12', '坏了');
INSERT INTO `t_purchase` VALUES ('20', '2', '40', '1000', '5', '2016-09-08', '50', '2016-09-11', '过时了');
INSERT INTO `t_purchase` VALUES ('21', '2', '1', '1', '2', '2016-09-09', '0', null, null);
INSERT INTO `t_purchase` VALUES ('22', '3', '2', '13', '5', '2016-09-09', '0', null, null);
INSERT INTO `t_purchase` VALUES ('23', '3', '1', '2', '2', '2016-09-09', '0', null, null);
INSERT INTO `t_purchase` VALUES ('24', '2', '23', '12', '3', '2016-09-09', '0', null, null);
INSERT INTO `t_purchase` VALUES ('25', '8', '1', '100', '6', '2016-09-13', '0', null, null);

-- ----------------------------
-- Table structure for t_return
-- ----------------------------
DROP TABLE IF EXISTS `t_return`;
CREATE TABLE `t_return` (
  `retid` int(11) NOT NULL AUTO_INCREMENT,
  `proid` int(11) NOT NULL,
  `proname` varchar(255) NOT NULL,
  `returnamount` int(11) DEFAULT NULL,
  `returndate` date NOT NULL,
  `cusname` varchar(50) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`retid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_return
-- ----------------------------
INSERT INTO `t_return` VALUES ('1', '3', '红米Note3', '1', '2016-01-21', '赵二喜', '1');
INSERT INTO `t_return` VALUES ('2', '6', 'vivoV3Max', '1', '2016-06-28', '黄丽', '1');
INSERT INTO `t_return` VALUES ('3', '2', '乐视MAX2', '1', '2016-05-23', '赵启平', '1');
INSERT INTO `t_return` VALUES ('4', '9', '三星Note7', '1', '2016-01-21', '于洋', '1');
INSERT INTO `t_return` VALUES ('5', '13', 'vivoX7', '2', '2016-03-11', '肖奈', '1');
INSERT INTO `t_return` VALUES ('6', '8', '诺基亚', '1', '2016-09-21', '于半珊', '1');
INSERT INTO `t_return` VALUES ('7', '1', 'vivoXplay5', '1', '2016-02-18', '贝微微', '1');
INSERT INTO `t_return` VALUES ('8', '11', '小米4s', '1', '2016-07-25', '王怡然', '1');
INSERT INTO `t_return` VALUES ('9', '15', '魅族Note3', '1', '2016-05-27', '曹光', '1');
INSERT INTO `t_return` VALUES ('10', '7', '小米Note4', '1', '2016-06-30', '王璇', '1');
INSERT INTO `t_return` VALUES ('11', '5', 'OPPOA37', '1', '2016-04-21', '李念', '1');
INSERT INTO `t_return` VALUES ('12', '10', '魅族3S', '1', '2016-03-25', '黄怡', '1');
INSERT INTO `t_return` VALUES ('13', '11', '小米4s', '1', '2014-03-02', '王怡然', '1');
INSERT INTO `t_return` VALUES ('14', '5', 'OPPOA37', '1', '2013-06-09', '李念', '1');
INSERT INTO `t_return` VALUES ('15', '5', 'OPPOA37', '1', '2013-06-09', '李念', '1');

-- ----------------------------
-- Table structure for t_sellmanager
-- ----------------------------
DROP TABLE IF EXISTS `t_sellmanager`;
CREATE TABLE `t_sellmanager` (
  `selid` int(11) NOT NULL AUTO_INCREMENT,
  `proid` int(11) NOT NULL,
  `proname` varchar(20) NOT NULL,
  `procount` int(11) NOT NULL,
  `proprice` decimal(10,0) NOT NULL,
  `cusname` varchar(20) NOT NULL,
  `state` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`selid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sellmanager
-- ----------------------------
INSERT INTO `t_sellmanager` VALUES ('1', '1', 'vivo', '1', '3698', '王明浩', '1');
INSERT INTO `t_sellmanager` VALUES ('2', '14', 'iPhone', '1', '3898', '肖奈', '1');
INSERT INTO `t_sellmanager` VALUES ('3', '9', '三星', '1', '4698', '贝微微', '1');
INSERT INTO `t_sellmanager` VALUES ('4', '7', '小米', '1', '1200', '陈玉梅', '1');
INSERT INTO `t_sellmanager` VALUES ('5', '4', '华为', '1', '2398', '肖奈', '1');
INSERT INTO `t_sellmanager` VALUES ('6', '7', '小米', '1', '2', '贝微微', '1');
INSERT INTO `t_sellmanager` VALUES ('7', '10', '魅族', '2', '3', '陈玉梅', '1');

-- ----------------------------
-- Table structure for t_sells
-- ----------------------------
DROP TABLE IF EXISTS `t_sells`;
CREATE TABLE `t_sells` (
  `selid` int(11) NOT NULL AUTO_INCREMENT,
  `proid` int(11) NOT NULL,
  `proname` varchar(20) NOT NULL,
  `seldate` date NOT NULL,
  `selcount` int(11) NOT NULL,
  `selprice` decimal(10,0) NOT NULL,
  `cusname` varchar(20) DEFAULT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY (`selid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sells
-- ----------------------------
INSERT INTO `t_sells` VALUES ('1', '1', 'vivo', '2016-09-07', '2', '3698', '王明浩', '1');
INSERT INTO `t_sells` VALUES ('2', '9', '三星', '2016-07-08', '4', '4698', '贝微微', '1');
INSERT INTO `t_sells` VALUES ('3', '14', 'iPhone', '2016-06-07', '2', '3869', '肖奈', '1');
INSERT INTO `t_sells` VALUES ('4', '4', '华为', '2016-08-17', '2', '2378', '肖奈', '1');
INSERT INTO `t_sells` VALUES ('5', '7', '小米', '2016-05-17', '1', '1200', '陈玉梅', '1');
INSERT INTO `t_sells` VALUES ('6', '3', '红米Note3', '2016-09-23', '2', '1099', '王怡', '1');
INSERT INTO `t_sells` VALUES ('7', '5', 'OPPOA37', '2016-04-10', '1', '2299', '刘贤', '1');
INSERT INTO `t_sells` VALUES ('8', '8', '诺基亚130DS', '2016-06-18', '1', '199', '杨丽华', '1');
INSERT INTO `t_sells` VALUES ('9', '1', 'vivoV3MAX', '2016-08-23', '3', '3698', '于娜', '1');
INSERT INTO `t_sells` VALUES ('10', '9', '三星Note7', '2016-07-25', '2', '5998', '杨莉', '1');
INSERT INTO `t_sells` VALUES ('11', '13', 'vivoX7', '2016-08-12', '2', '2499', '黄余', '1');
INSERT INTO `t_sells` VALUES ('12', '16', '魅族note3', '2016-06-12', '2', '1555', '樊锦', '1');
INSERT INTO `t_sells` VALUES ('13', '7', '小米Note4', '2016-05-23', '1', '1199', '古今', '1');
INSERT INTO `t_sells` VALUES ('14', '2', '乐视Max2', '2016-07-10', '2', '2099', '黄怡', '1');
INSERT INTO `t_sells` VALUES ('15', '11', '小米4S', '2016-09-23', '2', '1099', '韩以晴', '1');

-- ----------------------------
-- Table structure for t_supplier
-- ----------------------------
DROP TABLE IF EXISTS `t_supplier`;
CREATE TABLE `t_supplier` (
  `supid` int(11) NOT NULL AUTO_INCREMENT,
  `supname` varchar(255) NOT NULL,
  `owner` varchar(255) NOT NULL,
  `job` varchar(255) DEFAULT NULL,
  `suptel` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `supaddr` varchar(255) DEFAULT NULL,
  `lastpurchase` date DEFAULT NULL,
  `state` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`supid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_supplier
-- ----------------------------
INSERT INTO `t_supplier` VALUES ('1', '苹果手机生产商', '乔布斯', 'CEO', '0551-4657338', '13677789087', '上海', '2016-08-18', '0');
INSERT INTO `t_supplier` VALUES ('2', '华为手机生产商', '王世杰', 'CEO', '0551-46573772', '18977789087', '上海', '2016-08-18', '1');
INSERT INTO `t_supplier` VALUES ('3', '魅族手机生产商', '黄章', 'CEO', '0551-1347338', '15567789087', '北京', '2016-08-18', '1');
INSERT INTO `t_supplier` VALUES ('4', 'VIVO手机生产商', '沈伟', 'CEO', '0551-398338', '13097789087', '天津', '2016-06-18', '1');
INSERT INTO `t_supplier` VALUES ('5', '小米手机生产商', '雷军', 'CEO', '0551-4567338', '17866789087', '广州', '2016-06-18', '1');
INSERT INTO `t_supplier` VALUES ('6', '乐视手机生产商', '贾跃亭', 'CEO', '0551-9877338', '13956789087', '安徽', '2016-06-18', '1');
INSERT INTO `t_supplier` VALUES ('7', 'OPPO手机生产商', '陈明永', 'CDEO', '0551-6777338', '14787789087', '浙江', '2016-07-18', '1');
INSERT INTO `t_supplier` VALUES ('8', '诺基亚手机生产商', '董佳明', 'CDEO', '0551-3427338', '18977778908', '深圳', '2016-07-18', '1');
INSERT INTO `t_supplier` VALUES ('9', '三星手机生产商', '李秉哲', 'CDEO', '0551-46568658', '13685689087', '深圳', '2016-07-18', '1');
INSERT INTO `t_supplier` VALUES ('11', '手机大卖场', '余罪', '经理', '0550-128876', '13767899453', '山东省青岛市', '2016-09-11', '1');
INSERT INTO `t_supplier` VALUES ('12', '手机品牌直销店', '袁平', '销售经理', '0551-879960', '13931908767', '福建省漳州市', '2016-08-21', '1');
INSERT INTO `t_supplier` VALUES ('13', 'VIVO专卖店', '王倩', '销售总监', '0552-1789653', '137896790923', '河北省石家', '2016-09-02', '1');
INSERT INTO `t_supplier` VALUES ('14', 'OPPLE专卖', '刘迪', '经理', '0552-1285686', '13965477800', '河南省郑州市', '2016-08-21', '1');
INSERT INTO `t_supplier` VALUES ('15', '各类品牌手机大卖场', '王怡然', '经理', '0550-1244566', '13767234353', '山东省青岛市', '2016-05-16', '1');
INSERT INTO `t_supplier` VALUES ('16', '华为手机专卖', '杨乐', '经理', '0550-126676', '13769807453', '山东省济宁市', '2016-03-11', '1');
INSERT INTO `t_supplier` VALUES ('17', '三星专卖', '周福南', '经理', '0550-120076', '137609768453', '山东省青岛市', '2016-08-11', '0');
INSERT INTO `t_supplier` VALUES ('18', 'apple', '小米', '大米', '1564894897', '1561564846', '北京', '2016-05-04', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'supplier1', 'admin', '供应商', '1');
INSERT INTO `t_user` VALUES ('2', 'supplier2', 'admin', '供应商', '1');
INSERT INTO `t_user` VALUES ('3', 'customer1', 'admin', '顾客', '1');
INSERT INTO `t_user` VALUES ('4', 'customer2', 'admin', '顾客', '1');
INSERT INTO `t_user` VALUES ('5', 'admin', 'admin', '店主', '1');

-- ----------------------------
-- View structure for t_custrade3
-- ----------------------------
DROP VIEW IF EXISTS `t_custrade3`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `t_custrade3` AS select cusid ,t_customer.cusname,selcount*selprice as sellmon,seldate
from t_customer,t_sells
where t_customer.cusname = t_sells.cusname ;

-- ----------------------------
-- View structure for view_purchase
-- ----------------------------
DROP VIEW IF EXISTS `view_purchase`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost`  VIEW `view_purchase` AS select purid,t_product.proid,proname,purcount,purunitprice,t_purchase.supid,supname,purdate
from t_product,t_purchase,t_supplier 
where t_product.proid=t_purchase.proid 
and t_supplier.supid=t_purchase.supid ;

-- ----------------------------
-- View structure for view_purchase_detail
-- ----------------------------
DROP VIEW IF EXISTS `view_purchase_detail`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost`  VIEW `view_purchase_detail` AS select purid,t_purchase.proid,proname,purcount,purunitprice,supname,purdate
from t_purchase,t_product,t_supplier
where t_purchase.proid = t_product.proid
and t_purchase.supid = t_supplier.supid ;
