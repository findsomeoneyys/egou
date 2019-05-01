drop database if exists egou;
drop user if exists 'egou'@'localhost';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database egou default character set utf8mb4 collate utf8mb4_unicode_ci;
use egou;
create user 'egou'@'localhost' identified by 'egou123456';
grant all privileges on egou.* to 'egou'@'localhost';
flush privileges;