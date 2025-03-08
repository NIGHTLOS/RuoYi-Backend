/*
 Navicat Premium Dump SQL

 Source Server         : 202.118.208.42
 Source Server Type    : MySQL
 Source Server Version : 50744 (5.7.44)
 Source Host           : 202.118.208.42:3306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 50744 (5.7.44)
 File Encoding         : 65001

 Date: 27/02/2025 12:35:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept`  (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `parent_id` bigint(20) NULL DEFAULT 0 COMMENT '父部门id',
  `ancestors` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '祖级列表',
  `dept_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '部门名称',
  `order_num` int(4) NULL DEFAULT 0 COMMENT '显示顺序',
  `seal_path` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leader` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '部门状态（0正常 1停用）',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 109 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
-- 插入江西省（根部门）
INSERT INTO sys_dept (dept_id, parent_id, ancestors, dept_name, order_num, status, del_flag)
VALUES (100, 0, '', '江西省', 1, '0', '0');

-- 插入江西省的8个市
INSERT INTO sys_dept (dept_id, parent_id, ancestors, dept_name, order_num, status, del_flag)
VALUES
    (101, 100, '100', '南昌市', 1, '0', '0'),
    (102, 100, '100', '九江市', 2, '0', '0'),
    (103, 100, '100', '赣州市', 3, '0', '0'),
    (104, 100, '100', '宜春市', 4, '0', '0'),
    (105, 100, '100', '上饶市', 5, '0', '0'),
    (106, 100, '100', '吉安市', 6, '0', '0'),
    (107, 100, '100', '抚州市', 7, '0', '0'),
    (108, 100, '100', '景德镇市', 8, '0', '0');

-- 为每个市插入2-3个医院
INSERT INTO sys_dept (dept_id, parent_id, ancestors, dept_name, order_num, status, del_flag)
VALUES
-- 南昌市的医院
(109, 101, '100,101', '南昌市A医院', 1, '0', '0'),
(110, 101, '100,101', '南昌市B医院', 2, '0', '0'),
(111, 101, '100,101', '南昌市C医院', 3, '0', '0'),

-- 九江市的医院
(112, 102, '100,102', '九江市A医院', 1, '0', '0'),
(113, 102, '100,102', '九江市B医院', 2, '0', '0'),

-- 赣州市的医院
(114, 103, '100,103', '赣州市A医院', 1, '0', '0'),
(115, 103, '100,103', '赣州市B医院', 2, '0', '0'),
(116, 103, '100,103', '赣州市C医院', 3, '0', '0'),

-- 宜春市的医院
(117, 104, '100,104', '宜春市A医院', 1, '0', '0'),
(118, 104, '100,104', '宜春市B医院', 2, '0', '0'),

-- 上饶市的医院
(119, 105, '100,105', '上饶市A医院', 1, '0', '0'),
(120, 105, '100,105', '上饶市B医院', 2, '0', '0'),
(121, 105, '100,105', '上饶市C医院', 3, '0', '0'),

-- 吉安市的医院
(122, 106, '100,106', '吉安市A医院', 1, '0', '0'),
(123, 106, '100,106', '吉安市B医院', 2, '0', '0'),

-- 抚州市的医院
(124, 107, '100,107', '抚州市A医院', 1, '0', '0'),
(125, 107, '100,107', '抚州市B医院', 2, '0', '0'),

-- 景德镇市的医院
(126, 108, '100,108', '景德镇市A医院', 1, '0', '0'),
(127, 108, '100,108', '景德镇市B医院', 2, '0', '0');

SET FOREIGN_KEY_CHECKS = 1;
