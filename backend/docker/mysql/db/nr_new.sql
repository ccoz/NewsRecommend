/*
 Navicat Premium Data Transfer

 Source Server         : docker
 Source Server Type    : MySQL
 Source Server Version : 80027 (8.0.27)
 Source Host           : localhost:3306
 Source Schema         : nr_new

 Target Server Type    : MySQL
 Target Server Version : 80027 (8.0.27)
 File Encoding         : 65001

 Date: 16/01/2025 11:30:42
*/
CREATE DATABASE IF NOT EXISTS nr_new CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE nr_new;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for new
-- ----------------------------
DROP TABLE IF EXISTS `new`;
CREATE TABLE `new`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `category` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '新闻类别',
  `cover` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新闻封面链接',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '新闻标题',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL,
  `status` int NULL DEFAULT 1 COMMENT '使用状态（1正常 2冻结）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 83 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '新闻表' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of new
-- ----------------------------
INSERT INTO `new` VALUES (1, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题1', '科技新闻内容1', 'https://www.example.com/tech1', '2024-12-01 10:00:00', '2024-12-01 10:00:00', 1);
INSERT INTO `new` VALUES (2, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题2', '科技新闻内容2', 'https://www.example.com/tech2', '2024-12-02 11:00:00', '2024-12-02 11:00:00', 1);
INSERT INTO `new` VALUES (3, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题3', '科技新闻内容3', 'https://www.example.com/tech3', '2024-12-03 12:00:00', '2024-12-03 12:00:00', 1);
INSERT INTO `new` VALUES (4, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题1', '娱乐新闻内容1', 'https://www.example.com/ent1', '2024-12-04 13:00:00', '2024-12-04 13:00:00', 1);
INSERT INTO `new` VALUES (5, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题2', '娱乐新闻内容2', 'https://www.example.com/ent2', '2024-12-05 14:00:00', '2024-12-05 14:00:00', 1);
INSERT INTO `new` VALUES (6, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题3', '娱乐新闻内容3', 'https://www.example.com/ent3', '2024-12-06 15:00:00', '2024-12-06 15:00:00', 1);
INSERT INTO `new` VALUES (7, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题1', '体育新闻内容1', 'https://www.example.com/sport1', '2024-12-07 16:00:00', '2024-12-07 16:00:00', 1);
INSERT INTO `new` VALUES (8, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题2', '体育新闻内容2', 'https://www.example.com/sport2', '2024-12-08 17:00:00', '2024-12-08 17:00:00', 1);
INSERT INTO `new` VALUES (9, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题3', '体育新闻内容3', 'https://www.example.com/sport3', '2024-12-09 18:00:00', '2024-12-09 18:00:00', 1);
INSERT INTO `new` VALUES (10, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题1', '政治新闻内容1', 'https://www.example.com/pol1', '2024-12-10 19:00:00', '2024-12-10 19:00:00', 1);
INSERT INTO `new` VALUES (11, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题2', '政治新闻内容2', 'https://www.example.com/pol2', '2024-12-11 20:00:00', '2024-12-11 20:00:00', 1);
INSERT INTO `new` VALUES (12, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题3', '政治新闻内容3', 'https://www.example.com/pol3', '2024-12-12 21:00:00', '2024-12-12 21:00:00', 1);
INSERT INTO `new` VALUES (13, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题1', '经济新闻内容1', 'https://www.example.com/eco1', '2024-12-13 22:00:00', '2024-12-13 22:00:00', 1);
INSERT INTO `new` VALUES (14, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题2', '经济新闻内容2', 'https://www.example.com/eco2', '2024-12-14 23:00:00', '2024-12-14 23:00:00', 1);
INSERT INTO `new` VALUES (15, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题3', '经济新闻内容3', 'https://www.example.com/eco3', '2024-12-15 00:00:00', '2024-12-15 00:00:00', 1);
INSERT INTO `new` VALUES (16, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题1', '社会新闻内容1', 'https://www.example.com/soc1', '2024-12-16 01:00:00', '2024-12-16 01:00:00', 1);
INSERT INTO `new` VALUES (17, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题2', '社会新闻内容2', 'https://www.example.com/soc2', '2024-12-17 02:00:00', '2024-12-17 02:00:00', 1);
INSERT INTO `new` VALUES (18, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题3', '社会新闻内容3', 'https://www.example.com/soc3', '2024-12-18 03:00:00', '2024-12-18 03:00:00', 1);
INSERT INTO `new` VALUES (19, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题1', '国际新闻内容1', 'https://www.example.com/int1', '2024-12-19 04:00:00', '2024-12-19 04:00:00', 1);
INSERT INTO `new` VALUES (20, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题2', '国际新闻内容2', 'https://www.example.com/int2', '2024-12-20 05:00:00', '2024-12-20 05:00:00', 1);
INSERT INTO `new` VALUES (21, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题3', '国际新闻内容3', 'https://www.example.com/int3', '2024-12-21 06:00:00', '2024-12-21 06:00:00', 1);
INSERT INTO `new` VALUES (22, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题1', '文化新闻内容1', 'https://www.example.com/cul1', '2024-12-22 07:00:00', '2024-12-22 07:00:00', 1);
INSERT INTO `new` VALUES (23, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题2', '文化新闻内容2', 'https://www.example.com/cul2', '2024-12-23 08:00:00', '2024-12-23 08:00:00', 1);
INSERT INTO `new` VALUES (24, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题3', '文化新闻内容3', 'https://www.example.com/cul3', '2024-12-24 09:00:00', '2024-12-24 09:00:00', 1);
INSERT INTO `new` VALUES (25, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题1', '教育新闻内容1', 'https://www.example.com/edu1', '2024-12-25 10:00:00', '2024-12-25 10:00:00', 1);
INSERT INTO `new` VALUES (26, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题2', '教育新闻内容2', 'https://www.example.com/edu2', '2024-12-26 11:00:00', '2024-12-26 11:00:00', 1);
INSERT INTO `new` VALUES (27, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题3', '教育新闻内容3', 'https://www.example.com/edu3', '2024-12-27 12:00:00', '2024-12-27 12:00:00', 1);
INSERT INTO `new` VALUES (28, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题1', '科技新闻内容1', 'https://www.example.com/tech1', '2024-12-01 10:00:00', '2024-12-01 10:00:00', 1);
INSERT INTO `new` VALUES (29, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题2', '科技新闻内容2', 'https://www.example.com/tech2', '2024-12-02 11:00:00', '2024-12-02 11:00:00', 1);
INSERT INTO `new` VALUES (30, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题3', '科技新闻内容3', 'https://www.example.com/tech3', '2024-12-03 12:00:00', '2024-12-03 12:00:00', 1);
INSERT INTO `new` VALUES (31, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题1', '娱乐新闻内容1', 'https://www.example.com/ent1', '2024-12-04 13:00:00', '2024-12-04 13:00:00', 1);
INSERT INTO `new` VALUES (32, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题2', '娱乐新闻内容2', 'https://www.example.com/ent2', '2024-12-05 14:00:00', '2024-12-05 14:00:00', 1);
INSERT INTO `new` VALUES (33, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题3', '娱乐新闻内容3', 'https://www.example.com/ent3', '2024-12-06 15:00:00', '2024-12-06 15:00:00', 1);
INSERT INTO `new` VALUES (34, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题1', '体育新闻内容1', 'https://www.example.com/sport1', '2024-12-07 16:00:00', '2024-12-07 16:00:00', 1);
INSERT INTO `new` VALUES (35, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题2', '体育新闻内容2', 'https://www.example.com/sport2', '2024-12-08 17:00:00', '2024-12-08 17:00:00', 1);
INSERT INTO `new` VALUES (36, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题3', '体育新闻内容3', 'https://www.example.com/sport3', '2024-12-09 18:00:00', '2024-12-09 18:00:00', 1);
INSERT INTO `new` VALUES (37, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题1', '政治新闻内容1', 'https://www.example.com/pol1', '2024-12-10 19:00:00', '2024-12-10 19:00:00', 1);
INSERT INTO `new` VALUES (38, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题2', '政治新闻内容2', 'https://www.example.com/pol2', '2024-12-11 20:00:00', '2024-12-11 20:00:00', 1);
INSERT INTO `new` VALUES (39, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题3', '政治新闻内容3', 'https://www.example.com/pol3', '2024-12-12 21:00:00', '2024-12-12 21:00:00', 1);
INSERT INTO `new` VALUES (40, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题1', '经济新闻内容1', 'https://www.example.com/eco1', '2024-12-13 22:00:00', '2024-12-13 22:00:00', 1);
INSERT INTO `new` VALUES (41, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题2', '经济新闻内容2', 'https://www.example.com/eco2', '2024-12-14 23:00:00', '2024-12-14 23:00:00', 1);
INSERT INTO `new` VALUES (42, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题3', '经济新闻内容3', 'https://www.example.com/eco3', '2024-12-15 00:00:00', '2024-12-15 00:00:00', 1);
INSERT INTO `new` VALUES (43, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题1', '社会新闻内容1', 'https://www.example.com/soc1', '2024-12-16 01:00:00', '2024-12-16 01:00:00', 1);
INSERT INTO `new` VALUES (44, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题2', '社会新闻内容2', 'https://www.example.com/soc2', '2024-12-17 02:00:00', '2024-12-17 02:00:00', 1);
INSERT INTO `new` VALUES (45, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题3', '社会新闻内容3', 'https://www.example.com/soc3', '2024-12-18 03:00:00', '2024-12-18 03:00:00', 1);
INSERT INTO `new` VALUES (46, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题1', '国际新闻内容1', 'https://www.example.com/int1', '2024-12-19 04:00:00', '2024-12-19 04:00:00', 1);
INSERT INTO `new` VALUES (47, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题2', '国际新闻内容2', 'https://www.example.com/int2', '2024-12-20 05:00:00', '2024-12-20 05:00:00', 1);
INSERT INTO `new` VALUES (48, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题3', '国际新闻内容3', 'https://www.example.com/int3', '2024-12-21 06:00:00', '2024-12-21 06:00:00', 1);
INSERT INTO `new` VALUES (49, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题1', '文化新闻内容1', 'https://www.example.com/cul1', '2024-12-22 07:00:00', '2024-12-22 07:00:00', 1);
INSERT INTO `new` VALUES (50, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题2', '文化新闻内容2', 'https://www.example.com/cul2', '2024-12-23 08:00:00', '2024-12-23 08:00:00', 1);
INSERT INTO `new` VALUES (51, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题3', '文化新闻内容3', 'https://www.example.com/cul3', '2024-12-24 09:00:00', '2024-12-24 09:00:00', 1);
INSERT INTO `new` VALUES (52, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题1', '教育新闻内容1', 'https://www.example.com/edu1', '2024-12-25 10:00:00', '2024-12-25 10:00:00', 1);
INSERT INTO `new` VALUES (53, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题2', '教育新闻内容2', 'https://www.example.com/edu2', '2024-12-26 11:00:00', '2024-12-26 11:00:00', 1);
INSERT INTO `new` VALUES (54, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题3', '教育新闻内容3', 'https://www.example.com/edu3', '2024-12-27 12:00:00', '2024-12-27 12:00:00', 1);
INSERT INTO `new` VALUES (55, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题1', '科技新闻内容1', 'https://www.example.com/tech1', '2024-12-01 10:00:00', '2024-12-01 10:00:00', 1);
INSERT INTO `new` VALUES (56, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题1', '科技新闻内容1', 'https://www.example.com/tech1', '2024-12-01 10:00:00', '2024-12-01 10:00:00', 1);
INSERT INTO `new` VALUES (57, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题2', '科技新闻内容2', 'https://www.example.com/tech2', '2024-12-02 11:00:00', '2024-12-02 11:00:00', 1);
INSERT INTO `new` VALUES (58, '科技', 'https://source.unsplash.com/random/300x200?technology', '科技新闻标题3', '科技新闻内容3', 'https://www.example.com/tech3', '2024-12-03 12:00:00', '2024-12-03 12:00:00', 1);
INSERT INTO `new` VALUES (59, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题1', '娱乐新闻内容1', 'https://www.example.com/ent1', '2024-12-04 13:00:00', '2024-12-04 13:00:00', 1);
INSERT INTO `new` VALUES (60, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题2', '娱乐新闻内容2', 'https://www.example.com/ent2', '2024-12-05 14:00:00', '2024-12-05 14:00:00', 1);
INSERT INTO `new` VALUES (61, '娱乐', 'https://source.unsplash.com/random/300x200?entertainment', '娱乐新闻标题3', '娱乐新闻内容3', 'https://www.example.com/ent3', '2024-12-06 15:00:00', '2024-12-06 15:00:00', 1);
INSERT INTO `new` VALUES (62, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题1', '体育新闻内容1', 'https://www.example.com/sport1', '2024-12-07 16:00:00', '2024-12-07 16:00:00', 1);
INSERT INTO `new` VALUES (63, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题2', '体育新闻内容2', 'https://www.example.com/sport2', '2024-12-08 17:00:00', '2024-12-08 17:00:00', 1);
INSERT INTO `new` VALUES (64, '体育', 'https://source.unsplash.com/random/300x200?sports', '体育新闻标题3', '体育新闻内容3', 'https://www.example.com/sport3', '2024-12-09 18:00:00', '2024-12-09 18:00:00', 1);
INSERT INTO `new` VALUES (65, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题1', '政治新闻内容1', 'https://www.example.com/pol1', '2024-12-10 19:00:00', '2024-12-10 19:00:00', 1);
INSERT INTO `new` VALUES (66, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题2', '政治新闻内容2', 'https://www.example.com/pol2', '2024-12-11 20:00:00', '2024-12-11 20:00:00', 1);
INSERT INTO `new` VALUES (67, '政治', 'https://source.unsplash.com/random/300x200?politics', '政治新闻标题3', '政治新闻内容3', 'https://www.example.com/pol3', '2024-12-12 21:00:00', '2024-12-12 21:00:00', 1);
INSERT INTO `new` VALUES (68, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题1', '经济新闻内容1', 'https://www.example.com/eco1', '2024-12-13 22:00:00', '2024-12-13 22:00:00', 1);
INSERT INTO `new` VALUES (69, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题2', '经济新闻内容2', 'https://www.example.com/eco2', '2024-12-14 23:00:00', '2024-12-14 23:00:00', 1);
INSERT INTO `new` VALUES (70, '经济', 'https://source.unsplash.com/random/300x200?economy', '经济新闻标题3', '经济新闻内容3', 'https://www.example.com/eco3', '2024-12-15 00:00:00', '2024-12-15 00:00:00', 1);
INSERT INTO `new` VALUES (71, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题1', '社会新闻内容1', 'https://www.example.com/soc1', '2024-12-16 01:00:00', '2024-12-16 01:00:00', 1);
INSERT INTO `new` VALUES (72, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题2', '社会新闻内容2', 'https://www.example.com/soc2', '2024-12-17 02:00:00', '2024-12-17 02:00:00', 1);
INSERT INTO `new` VALUES (73, '社会', 'https://source.unsplash.com/random/300x200?society', '社会新闻标题3', '社会新闻内容3', 'https://www.example.com/soc3', '2024-12-18 03:00:00', '2024-12-18 03:00:00', 1);
INSERT INTO `new` VALUES (74, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题1', '国际新闻内容1', 'https://www.example.com/int1', '2024-12-19 04:00:00', '2024-12-19 04:00:00', 1);
INSERT INTO `new` VALUES (75, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题2', '国际新闻内容2', 'https://www.example.com/int2', '2024-12-20 05:00:00', '2024-12-20 05:00:00', 1);
INSERT INTO `new` VALUES (76, '国际', 'https://source.unsplash.com/random/300x200?international', '国际新闻标题3', '国际新闻内容3', 'https://www.example.com/int3', '2024-12-21 06:00:00', '2024-12-21 06:00:00', 1);
INSERT INTO `new` VALUES (77, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题1', '文化新闻内容1', 'https://www.example.com/cul1', '2024-12-22 07:00:00', '2024-12-22 07:00:00', 1);
INSERT INTO `new` VALUES (78, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题2', '文化新闻内容2', 'https://www.example.com/cul2', '2024-12-23 08:00:00', '2024-12-23 08:00:00', 1);
INSERT INTO `new` VALUES (79, '文化', 'https://source.unsplash.com/random/300x200?culture', '文化新闻标题3', '文化新闻内容3', 'https://www.example.com/cul3', '2024-12-24 09:00:00', '2024-12-24 09:00:00', 1);
INSERT INTO `new` VALUES (80, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题1', '教育新闻内容1', 'https://www.example.com/edu1', '2024-12-25 10:00:00', '2024-12-25 10:00:00', 1);
INSERT INTO `new` VALUES (81, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题2', '教育新闻内容2', 'https://www.example.com/edu2', '2024-12-26 11:00:00', '2024-12-26 11:00:00', 1);
INSERT INTO `new` VALUES (82, '教育', 'https://source.unsplash.com/random/300x200?education', '教育新闻标题3', '教育新闻内容3', 'https://www.example.com/edu3', '2024-12-27 12:00:00', '2024-12-27 12:00:00', 1);

SET FOREIGN_KEY_CHECKS = 1;
