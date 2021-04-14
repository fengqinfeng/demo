/*
Navicat MySQL Data Transfer

Source Server         : MYSQL57
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-04-14 20:21:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `x_a`
-- ----------------------------
DROP TABLE IF EXISTS `x_a`;
CREATE TABLE `x_a` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(10) DEFAULT NULL COMMENT '用户ID',
  `test1` varchar(50) DEFAULT NULL,
  `test2` varchar(50) DEFAULT NULL,
  `test3` varchar(50) DEFAULT NULL,
  `test4` varchar(50) DEFAULT NULL,
  `test5` varchar(50) DEFAULT NULL,
  `test6` varchar(50) DEFAULT NULL,
  `test7` varchar(50) DEFAULT NULL,
  `test8` varchar(50) DEFAULT NULL,
  `is_del` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of x_a
-- ----------------------------
INSERT INTO `x_a` VALUES ('23', '1', '1', '2', '2', '2', '2', '1', '1', '1', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('24', '2', '2', '1', '2', '2', '1', '2', '2', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('25', '3', '2', '2', '1', '1', '2', '1', '1', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('26', '4', '2', '2', '1', '1', '1', '1', '1', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('27', '5', '2', '2', '1', '1', '2', '2', '1', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('28', '6', '2', '1', '1', '2', '1', '1', '1', '1', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('29', '7', '1', '2', '2', '2', '1', '1', '2', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('30', '8', '1', '2', '2', '1', '2', '2', '2', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('31', '9', '1', '1', '1', '2', '2', '1', '2', '1', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');
INSERT INTO `x_a` VALUES ('32', '10', '1', '2', '2', '2', '2', '2', '2', '2', '', '2021-04-14 16:12:44', '2021-04-14 16:12:44');

-- ----------------------------
-- Table structure for `x_b`
-- ----------------------------
DROP TABLE IF EXISTS `x_b`;
CREATE TABLE `x_b` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(10) DEFAULT NULL COMMENT '用户ID',
  `test1` varchar(50) DEFAULT NULL,
  `test2` varchar(50) DEFAULT NULL,
  `test3` varchar(50) DEFAULT NULL,
  `test4` varchar(50) DEFAULT NULL,
  `test5` varchar(50) DEFAULT NULL,
  `test6` varchar(50) DEFAULT NULL,
  `test7` varchar(50) DEFAULT NULL,
  `test8` varchar(50) DEFAULT NULL,
  `is_del` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of x_b
-- ----------------------------
INSERT INTO `x_b` VALUES ('21', '1', '2', '1', '2', '2', '1', '1', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('22', '2', '1', '2', '1', '2', '2', '2', '1', '1', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('23', '3', '2', '1', '1', '1', '2', '2', '2', '1', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('24', '4', '1', '1', '2', '1', '2', '2', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('25', '5', '1', '2', '1', '1', '1', '1', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('26', '6', '1', '1', '2', '2', '1', '2', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('27', '7', '2', '2', '2', '1', '2', '2', '2', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('28', '8', '2', '2', '2', '2', '1', '2', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('29', '9', '2', '1', '2', '1', '2', '1', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');
INSERT INTO `x_b` VALUES ('30', '10', '2', '1', '2', '2', '1', '1', '1', '2', '', '2021-04-14 16:16:49', '2021-04-14 16:16:49');

-- ----------------------------
-- Table structure for `x_c`
-- ----------------------------
DROP TABLE IF EXISTS `x_c`;
CREATE TABLE `x_c` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(10) DEFAULT NULL COMMENT '用户ID',
  `test1` varchar(50) DEFAULT NULL,
  `test2` varchar(50) DEFAULT NULL,
  `test3` varchar(50) DEFAULT NULL,
  `test4` varchar(50) DEFAULT NULL,
  `test5` varchar(50) DEFAULT NULL,
  `test6` varchar(50) DEFAULT NULL,
  `test7` varchar(50) DEFAULT NULL,
  `test8` varchar(50) DEFAULT NULL,
  `is_del` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of x_c
-- ----------------------------
INSERT INTO `x_c` VALUES ('17', '2', '2', '1', '2', '2', '1', '2', '2', '2', '', '2021-04-14 18:09:09', '2021-04-14 18:09:09');
INSERT INTO `x_c` VALUES ('18', '5', '2', '2', '1', '1', '2', '2', '1', '2', '', '2021-04-14 18:09:09', '2021-04-14 18:09:09');
INSERT INTO `x_c` VALUES ('19', '9', '1', '1', '1', '2', '2', '1', '2', '1', '', '2021-04-14 18:09:09', '2021-04-14 18:09:09');
INSERT INTO `x_c` VALUES ('20', '10', '1', '2', '2', '2', '2', '2', '2', '2', '', '2021-04-14 18:09:09', '2021-04-14 18:09:09');
INSERT INTO `x_c` VALUES ('21', '5', '2', '2', '1', '1', '2', '2', '1', '2', '', '2021-04-14 20:13:24', '2021-04-14 20:13:24');
