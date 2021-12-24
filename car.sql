/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2021-12-24 16:05:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_cararea
-- ----------------------------
DROP TABLE IF EXISTS `t_cararea`;
CREATE TABLE `t_cararea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `areaName` varchar(32) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `xx` (`areaName`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cararea
-- ----------------------------
INSERT INTO `t_cararea` VALUES ('1', 'A区', '80');
INSERT INTO `t_cararea` VALUES ('2', 'B区', '6');
INSERT INTO `t_cararea` VALUES ('7', 'C区', '20');
INSERT INTO `t_cararea` VALUES ('9', 'D区', '15');

-- ----------------------------
-- Table structure for t_carposition
-- ----------------------------
DROP TABLE IF EXISTS `t_carposition`;
CREATE TABLE `t_carposition` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `areaId` int(11) DEFAULT NULL,
  `positionNo` varchar(32) DEFAULT NULL,
  `addTime` datetime DEFAULT NULL,
  `isactive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`pid`),
  KEY `fk_areaId` (`areaId`),
  CONSTRAINT `fk_areaId` FOREIGN KEY (`areaId`) REFERENCES `t_cararea` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carposition
-- ----------------------------
INSERT INTO `t_carposition` VALUES ('1', '1', 'A区101', '2019-11-16 04:49:20', '\0');
INSERT INTO `t_carposition` VALUES ('2', '2', 'B区101', '2019-12-08 21:25:43', '\0');
INSERT INTO `t_carposition` VALUES ('5', '1', 'A区5', '2019-12-08 21:25:46', '\0');
INSERT INTO `t_carposition` VALUES ('8', '7', 'C区10', '2019-12-27 04:51:11', '\0');
INSERT INTO `t_carposition` VALUES ('11', '7', 'CCC', '2021-12-24 15:56:14', '\0');
INSERT INTO `t_carposition` VALUES ('12', '2', 'BBBB', '2021-12-24 15:56:26', '');

-- ----------------------------
-- Table structure for t_carstop
-- ----------------------------
DROP TABLE IF EXISTS `t_carstop`;
CREATE TABLE `t_carstop` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `carNumber` varchar(32) DEFAULT NULL,
  `carTypeId` int(11) DEFAULT NULL,
  `carPositionNo` varchar(32) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `stopDuration` float DEFAULT NULL,
  `stopCoat` float DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `fk_carstop1` (`carTypeId`),
  CONSTRAINT `fk_carstop1` FOREIGN KEY (`carTypeId`) REFERENCES `t_cartype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carstop
-- ----------------------------
INSERT INTO `t_carstop` VALUES ('4', '浙B666666', '1', 'A区5', '2019-12-07 05:21:20', '2019-12-21 18:05:00', '348.73', '3487.3', '10');
INSERT INTO `t_carstop` VALUES ('6', '湘N88888', '1', 'C区10', '2019-12-08 03:59:17', '2019-12-09 17:57:00', '37.97', '759.4', '20');

-- ----------------------------
-- Table structure for t_cartype
-- ----------------------------
DROP TABLE IF EXISTS `t_cartype`;
CREATE TABLE `t_cartype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `carTypeName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cartype
-- ----------------------------
INSERT INTO `t_cartype` VALUES ('1', '小汽车');
INSERT INTO `t_cartype` VALUES ('2', '面包车');
INSERT INTO `t_cartype` VALUES ('4', '坦克');
INSERT INTO `t_cartype` VALUES ('6', '单车');
INSERT INTO `t_cartype` VALUES ('7', '宝宝车');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `trueName` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('12', 'user1', '7363a0d0604902af7b70b271a0b96480', 'user1');
INSERT INTO `t_user` VALUES ('13', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin');
INSERT INTO `t_user` VALUES ('15', 'aa', '4124bc0a9335c27f086f24ba207a4912', 'aa');
