-- phpMyAdmin SQL Dump
-- version phpStudy 2014
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2017 年 10 月 26 日 07:35
-- 服务器版本: 5.5.47
-- PHP 版本: 5.3.29

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `a_detail`
--

CREATE TABLE IF NOT EXISTS `a_detail` (
  `DETAIL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `REALNAME` varchar(20) NOT NULL,
  `BIRTHDAY` date NOT NULL,
  `BALANCE` double NOT NULL,
  PRIMARY KEY (`DETAIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `a_detail`
--

INSERT INTO `a_detail` (`DETAIL_ID`, `REALNAME`, `BIRTHDAY`, `BALANCE`) VALUES
(1, 'ROOT', '2017-01-01', 20000),
(2, 'ADMIN', '2017-01-17', 20000),
(3, 'SCOTT', '2017-01-28', 20000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
