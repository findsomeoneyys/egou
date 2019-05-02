drop database if exists egou_test;
drop user if exists 'egou'@'localhost';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database egou_test default character set utf8mb4 collate utf8mb4_unicode_ci;
use egou_test;
create user 'egou'@'localhost' identified by 'egou123456';
grant all privileges on egou_test.* to 'egou'@'localhost';
flush privileges;