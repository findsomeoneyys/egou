DROP TABLE IF EXISTS `egou_user`;
CREATE TABLE `egou_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(63) NOT NULL COMMENT '用户名称',
  `password` varchar(63) NOT NULL DEFAULT '' COMMENT '用户密码',
  `gender` varchar(16) NOT NULL DEFAULT 'OTHER' COMMENT '性别：OTHER 其他， MALE男， FEMALE 女',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `nickname` varchar(63) NOT NULL DEFAULT '' COMMENT '用户昵称或网络名称',
  `mobile` varchar(20) NOT NULL DEFAULT '' COMMENT '用户手机号码',
  `email` varchar(63) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `avatar` varchar(255) DEFAULT '' COMMENT '用户头像图片',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '逻辑删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';