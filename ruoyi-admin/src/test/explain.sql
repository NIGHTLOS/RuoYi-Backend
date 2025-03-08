-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('仓库信息', '2000', '1', 'manage', 'storage/manage/index', 1, 0, 'C', '0', '0', 'storage:manage:list', '#', 'admin', sysdate(), '', null, '仓库信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('仓库信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'storage:manage:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('仓库信息新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'storage:manage:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('仓库信息修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'storage:manage:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('仓库信息删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'storage:manage:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('仓库信息导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'storage:manage:export',       '#', 'admin', sysdate(), '', null, '');

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

 Date: 15/01/2025 20:42:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bs_sample
-- ----------------------------
DROP TABLE IF EXISTS `bs_sample`;
CREATE TABLE `bs_sample`  (
  `sample_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '样本的自增主键',
  `sample_uuid` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '通用唯一识别码',
  `sample_mrid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '样本编号，外显',
  `sample_type` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '样本检测类型',
  `scan_device_type` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '扫描设备类型',
  `patient_id_card` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '患者身份证号',
  `dept_id` bigint(20) NOT NULL COMMENT '送检机构id',
  `sample_sample_date` datetime NULL DEFAULT NULL COMMENT '标本的采样时间',
  `sample_send_date` datetime NULL DEFAULT NULL COMMENT '标本的送检时间',
  `sample_pathology_type` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '样本组织类型',
  `report_type` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '标本将要出具的报告类型，如tct报告',
  `sample_status` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '样本状态标志位',
  `upload_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '上传者id（同创建者）',
  `diagnose_id` bigint(20) NULL DEFAULT NULL COMMENT '诊断者id',
  `review_id` bigint(20) NULL DEFAULT NULL COMMENT '复核者id',
  `sample_img_path` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '样本图像的路径',
  `wsi_classification_recommend` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'AI推荐诊断结果, 0-阴性, 1-阳性',
  `wsi_classification_path` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'AI推荐诊断结果路径（.json）',
  `diagnose_path` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医生诊断结果路径（.json）',
  `report_path` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '报告路径',
  `remark` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '创建者账号',
  `create_time` datetime NOT NULL COMMENT '创建本条记录的时间',
  `update_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者账号',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新本条记录的时间',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  PRIMARY KEY (`sample_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45106 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '标本信息，用来存储标本信息的表' ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标本信息，用来存储标本信息的', '2007', '1', 'sampleManage', 'sample/sampleManage/index', 1, 0, 'C', '0', '0', 'sample:sampleManage:list', '#', 'admin', sysdate(), '', null, '标本信息，用来存储标本信息的菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标本信息，用来存储标本信息的查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'sample:sampleManage:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标本信息，用来存储标本信息的新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'sample:sampleManage:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标本信息，用来存储标本信息的修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'sample:sampleManage:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标本信息，用来存储标本信息的删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'sample:sampleManage:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标本信息，用来存储标本信息的导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'sample:sampleManage:export',       '#', 'admin', sysdate(), '', null, '');