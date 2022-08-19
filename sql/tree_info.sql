/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : 127.0.0.1:3306
 Source Schema         : tree_info

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 19/08/2022 17:00:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for service_classification
-- ----------------------------
DROP TABLE IF EXISTS `service_classification`;
CREATE TABLE `service_classification`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '业务名称',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '业务分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of service_classification
-- ----------------------------
INSERT INTO `service_classification` VALUES (1, '1001', NULL, NULL);
INSERT INTO `service_classification` VALUES (2, '1002', NULL, NULL);
INSERT INTO `service_classification` VALUES (3, '1003', NULL, NULL);
INSERT INTO `service_classification` VALUES (4, '2001', NULL, NULL);
INSERT INTO `service_classification` VALUES (5, '2002', NULL, NULL);
INSERT INTO `service_classification` VALUES (6, '2003', NULL, NULL);
INSERT INTO `service_classification` VALUES (7, '3001', NULL, NULL);

-- ----------------------------
-- Table structure for service_path_info
-- ----------------------------
DROP TABLE IF EXISTS `service_path_info`;
CREATE TABLE `service_path_info`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `ancestor` bigint(0) NULL DEFAULT NULL COMMENT '祖先Id',
  `descendant` bigint(0) NULL DEFAULT NULL COMMENT '后代Id',
  `depth` int(0) NULL DEFAULT NULL COMMENT '层级深度',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '业务路径信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of service_path_info
-- ----------------------------
INSERT INTO `service_path_info` VALUES (1, 1, 1, 1, NULL, NULL);
INSERT INTO `service_path_info` VALUES (2, 2, 2, 1, NULL, NULL);
INSERT INTO `service_path_info` VALUES (3, 3, 3, 1, NULL, NULL);
INSERT INTO `service_path_info` VALUES (4, 1, 4, 2, NULL, NULL);
INSERT INTO `service_path_info` VALUES (5, 4, 4, 1, NULL, NULL);
INSERT INTO `service_path_info` VALUES (6, 1, 5, 2, NULL, NULL);
INSERT INTO `service_path_info` VALUES (7, 5, 5, 1, NULL, NULL);
INSERT INTO `service_path_info` VALUES (8, 1, 6, 2, NULL, NULL);
INSERT INTO `service_path_info` VALUES (9, 6, 6, 1, NULL, NULL);
INSERT INTO `service_path_info` VALUES (10, 1, 7, 3, NULL, NULL);
INSERT INTO `service_path_info` VALUES (11, 4, 7, 2, NULL, NULL);
INSERT INTO `service_path_info` VALUES (12, 7, 7, 1, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
