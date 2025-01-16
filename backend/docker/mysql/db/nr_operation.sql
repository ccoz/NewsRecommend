/*
 Navicat Premium Data Transfer

 Source Server         : docker
 Source Server Type    : MySQL
 Source Server Version : 80027 (8.0.27)
 Source Host           : localhost:3306
 Source Schema         : nr_operation

 Target Server Type    : MySQL
 Target Server Version : 80027 (8.0.27)
 File Encoding         : 65001

 Date: 16/01/2025 11:31:05
*/
CREATE DATABASE IF NOT EXISTS nr_operation CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE nr_operation;
    
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for operation
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `new_id` int NOT NULL COMMENT '新闻名',
  `operation_type` int NULL DEFAULT 1 COMMENT '行为类型（1浏览 2喜欢 3转发 4收藏）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户行为表' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of operation
-- ----------------------------
INSERT INTO `operation` VALUES (1, 1, 1, 1);
INSERT INTO `operation` VALUES (2, 1, 1, 2);
INSERT INTO `operation` VALUES (3, 1, 1, 3);

SET FOREIGN_KEY_CHECKS = 1;
