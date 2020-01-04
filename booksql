/*
 Navicat Premium Data Transfer

 Source Server         : localhostmysql
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : bookuu

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 03/01/2020 22:22:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author`  (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `authorName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `authorBrief` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `authorHeat` int(255) NOT NULL,
  PRIMARY KEY (`aid`) USING BTREE,
  INDEX `authorName`(`authorName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES (1, '截晓坚', '123', 50);
INSERT INTO `author` VALUES (2, '吴为善', '吴为善，江苏南京人，1950年1月出生。1985年毕业于上海师范大学，师从语言学家张斌先生，获硕士学位 。1993年赴澳大利亚昆士兰大学讲学，为澳籍研究生讲授中国语言的文化。', 500);
INSERT INTO `author` VALUES (3, '张伯江', '张伯江，男，著名语言学家。现任中国社会科学院文学研究所党委书记、副所长，《文学评论》执行主编，中国社会科学院大学特聘讲座教授，博士生导师。曾任中国社会科学院语言研究所研究员，中国社会科学院语言研究所副所长。曾挂职甘肃省酒泉市委副书记。', 70);
INSERT INTO `author` VALUES (4, '贾志梁', '作家', 80);
INSERT INTO `author` VALUES (5, '毛佳樑', '作家', 90);
INSERT INTO `author` VALUES (6, '季彩君', '作家', 100);

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookPrice` decimal(10, 2) NOT NULL,
  `bookModel` int(255) NOT NULL,
  `bookBrief` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookAuthor` int(11) NOT NULL,
  `bookType` int(255) NOT NULL,
  `bookPress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookDiscount` double(10, 0) NOT NULL,
  `bookImage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookDay` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6),
  `bookHeat` int(255) NOT NULL,
  PRIMARY KEY (`bid`) USING BTREE,
  INDEX `tid`(`bookType`) USING BTREE,
  INDEX `mid`(`bookModel`) USING BTREE,
  INDEX `aid`(`bookAuthor`) USING BTREE,
  CONSTRAINT `aid` FOREIGN KEY (`bookAuthor`) REFERENCES `author` (`aid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `mid` FOREIGN KEY (`bookModel`) REFERENCES `model` (`mid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tid` FOREIGN KEY (`bookType`) REFERENCES `type` (`tid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '浦东国际机场港湾机坪及飞行区综合体工程', 84.24, 1, '《浦东国际机场港湾机坪及飞行区综合体工程》一书共分７章，内容主要包括飞行区工程地基处理施工技术与应用、飞行区道面滑模施工技术与应用、盾构穿越施工技术控制管理、飞行区桥梁工程施工技术与管理、飞行区综合管廊工程施工技术与管理、飞行区工程禁区不停航施工管理和受机场既有条件限制下的下穿通道施工', 2, 1, '上海科技', 1, 'http://www.ewen.com.cn/images/fenmian/9787547845424.jpg', '2019-12-30 14:18:08.235962', 10);
INSERT INTO `book` VALUES (2, '汉语言学新视界2019', 68.00, 1, '《汉语言学新视界 2019》根据中国人民大学复印报刊资料《语言文字学》和中国知网“CNKI期刊数据库”等语言学资料库，精选2017—2018年度重要的、具有代表性的语言学论文18篇。在选录18篇论文的基础上，增加1篇卷首语，统摄全书。本书专注汉语言学研究，遴选上一年度业界重要优秀论文。本书所具有的特点主要有四。（一）学术性：具有较高的学术含金量；（二）前瞻性：引领当前汉语言学界研究主流；（三）原创性：开拓汉语言学研究领域，探索研究创新点；（四）本土化：立足汉语事实，彰显汉语特点。', 2, 2, '学林', 1, 'http://www.ewen.com.cn/images/fenmian/9787548615576.jpg', '2019-12-30 14:19:51.909028', 800);
INSERT INTO `book` VALUES (3, '说把字句', 35.00, 1, '本书系统评述汉语“把”字句研究中的种种句法和语义问题。全书分两大部分展开，上篇：把字句的组成和句法结构问题；下篇：把字句的语义和语用问题。上篇分别讨论了把字句各个组成成分的特点、成分之间的制约关系、把字句的句法变换、把字句的生成方式；下篇分别讨论了主语的意志性、宾语的有定性、动作的结果性、句式的处置义、把字句的语用特点。', 3, 1, '学林', 1, 'http://www.ewen.com.cn/images/fenmian/9787548615569.jpg', '2019-12-15 04:04:53.575512', 600);
INSERT INTO `book` VALUES (4, '云间山人稻花集——贾志梁诗词选', 36.00, 1, '《云间山人稻花集》是作者几十年来创作的古诗词精选，共收录作者原创古诗词作品260余首，主要按照体裁和内容进行编排，分别是近体诗、古风、诗余、对联、咏叹调。题材涵盖日常生活、交游、感怀、咏史、咏景、纪念节日，以及作者在农村插队期间对农事工作的描述。用语平白晓畅，充满感情，读来朗朗上口。', 4, 4, '学林', 1, 'http://www.ewen.com.cn/images/fenmian/9787548615675.jpg', '2019-12-30 14:19:54.987424', 50);
INSERT INTO `book` VALUES (5, '上海优秀城乡规划设计获奖作品集2017年度', 380.00, 1, ' 2017年度上海优秀城乡规划设计奖评选，充分体现了五大发展理念，全面展现了近年上海城乡规划编制在理念、技术、方法上的探索与创新。', 5, 1, '上海科技', 1, 'http://www.ewen.com.cn/images/fenmian/9787547844830.jpg', '2019-12-15 04:04:57.366054', 400);
INSERT INTO `book` VALUES (6, '学会关爱学会成长——基于实证调查的留守儿童教育支持研究', 53.04, 1, '围绕留守儿童教育这一主题，本书遵循“提出问题——揭示问题——确认问题——解决问题”的思路展开。在文献述评的基础上，探究了留守儿童现象的产生背景与社会根源，阐述了伦理学、教育学等相关理论基础。在实证调查的基础上，深入剖析留守儿童教育支持的制约因素，遵循从治标到治本、失调到协调、外在到内在的基本思路，从宏观、中观和微观三个层面，着手构建留守儿童教育支持体系，并阐述其运行模式与实施策略。', 6, 3, '学林', 1, 'http://www.ewen.com.cn/images/fenmian/9787548615767.jpg', '2020-01-03 15:22:38.512826', 20);
INSERT INTO `book` VALUES (7, '汉语学习', 55.50, 1, '1980年，延边大学汉语言专业的学者为了适应朝鲜族学校第二语言（汉语）教学的需要，以东北三省朝鲜族学校的汉语教师为主要对象，创办了辅导汉语刊物《汉语学习》，共内部发行了6期', 4, 1, '双月刊', 1, 'https://gss3.bdstatic.com/7Po3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=3fec802cb2315c60579863bdecd8a076/b8014a90f603738d7665201bbd1bb051f819ecd8.jpg', '2019-12-30 14:18:15.253024', 50);
INSERT INTO `book` VALUES (8, '沟通无极限:广告语言的全方位透视', 3.00, 1, '在商业传播中，一切传播作品的终端形式只有两种：一类是图形，另一类是语言。图形在传播中固然具有重要作用，但我们要充分认识到这样一个事实，真正支撑整个商业传播的是语言形式的符号。近些年来，一系列语言符号的概念、理念引导着整个市场：“绿色”是环保的象征，“宏餐饮”是都市大规模餐饮集团的经营理念，“以内养外”代表了标本兼治的美容观念，“顾客就是上帝”，成了服务行业的信条。这些语言符号有的是一个词，有的是一个短语，有的是一句句子。', 2, 6, '上海辞书出版社', 1, 'http://www.kfzimg.com/sw/kfzimg/49/027e36c668a7c063_n.jpg', '2019-12-30 14:20:04.982140', 50);
INSERT INTO `book` VALUES (9, '语言学论丛', 500.00, 1, '《语言学论丛》是中国国家教育部所属文科重点研究基地——北京大学中国语言文学系汉语语言学研究中心主办的定期性系列学术集刊（以书代刊），刊登海内外有关语言学与应用语言学、现代汉语、汉语史、汉语方言和文字学方面的学术论文，以及上述领域的严肃的学术评论。', 2, 2, '北京大学汉语语言学研究中心', 1, 'https://gss1.bdstatic.com/9vo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268%3Bg%3D0/sign=6a6b975762d9f2d3201123e991d7ed2e/810a19d8bc3eb13522651f0da61ea8d3fc1f44e1.jpg', '2020-01-02 23:11:43.078952', 60);

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model`  (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `modelName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of model
-- ----------------------------
INSERT INTO `model` VALUES (1, '图书');
INSERT INTO `model` VALUES (2, '有声读物');

-- ----------------------------
-- Table structure for odertype
-- ----------------------------
DROP TABLE IF EXISTS `odertype`;
CREATE TABLE `odertype`  (
  `otid` int(11) NOT NULL AUTO_INCREMENT,
  `otName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`otid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of odertype
-- ----------------------------
INSERT INTO `odertype` VALUES (1, '未付款');
INSERT INTO `odertype` VALUES (2, '正在送货');
INSERT INTO `odertype` VALUES (3, '已送达');
INSERT INTO `odertype` VALUES (4, '待接收');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `orderName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `orderType` int(255) NOT NULL,
  PRIMARY KEY (`oid`) USING BTREE,
  INDEX `uid`(`uid`) USING BTREE,
  INDEX `otid`(`orderType`) USING BTREE,
  CONSTRAINT `uid` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `otid` FOREIGN KEY (`orderType`) REFERENCES `odertype` (`otid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 1, '123', 1);
INSERT INTO `order` VALUES (2, 1, 'd358ff9c-edca-450f-99ae-e0f0127a33061578059333282', 2);

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (1, '儿童');
INSERT INTO `type` VALUES (2, '古文');
INSERT INTO `type` VALUES (3, '欧美');
INSERT INTO `type` VALUES (4, '建设');
INSERT INTO `type` VALUES (5, '现代');
INSERT INTO `type` VALUES (6, '诗歌');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userEmail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userCompany` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '111', 'wobuzhidao', 'admin@qq.c', '111', '阿里巴巴', '北京市');
INSERT INTO `user` VALUES (2, '112', 'sss', 'admin@aa.com', '111', '腾讯', '深圳');
INSERT INTO `user` VALUES (3, '1', '1', '1', '1', '1', '1');
INSERT INTO `user` VALUES (4, '546546', '是我', '123@qq.com', '123', '爱我的', '中国北京市海淀区我不知道');

SET FOREIGN_KEY_CHECKS = 1;
