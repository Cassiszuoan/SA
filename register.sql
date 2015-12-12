-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- 主機: localhost
-- 產生時間： 2015 年 12 月 12 日 16:13
-- 伺服器版本: 5.6.26
-- PHP 版本： 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `register`
--

-- --------------------------------------------------------

--
-- 資料表結構 `ASTScore`
--

CREATE TABLE IF NOT EXISTS `ASTScore` (
  `Score_ID` varchar(9) NOT NULL,
  `Test_Num` varchar(9) NOT NULL,
  `Chinese` int(11) NOT NULL,
  `English` int(11) NOT NULL,
  `Math` int(11) NOT NULL,
  `Society` int(11) NOT NULL,
  `Science` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 資料表結構 `ELScore`
--

CREATE TABLE IF NOT EXISTS `ELScore` (
  `Score_ID` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 資料表結構 `Examinee`
--

CREATE TABLE IF NOT EXISTS `Examinee` (
  `ID` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT 'TESTEST',
  `EMAIL` varchar(40) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `TEST_NUM` bigint(9) unsigned NOT NULL,
  `NAME` varchar(20) CHARACTER SET utf8 NOT NULL,
  `GENDER` varchar(10) CHARACTER SET utf8 NOT NULL DEFAULT 'F',
  `BIRTH` varchar(20) NOT NULL DEFAULT '2014-12-10',
  `PHONE` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ADDRESS` varchar(20) CHARACTER SET utf8 NOT NULL,
  `EMER_NAME` varchar(20) CHARACTER SET utf8 NOT NULL,
  `EMER_RELA` varchar(20) CHARACTER SET utf8 NOT NULL,
  `EMER_MOBILE` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `LOW_INCOME` tinyint(1) NOT NULL DEFAULT '0',
  `GSATscore` tinyint(9) NOT NULL,
  `ASTscore` tinyint(9) NOT NULL,
  `ELScore` tinyint(4) NOT NULL,
  `testroom` smallint(6) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=232903828 DEFAULT CHARSET=latin1;

--
-- 資料表的匯出資料 `Examinee`
--

INSERT INTO `Examinee` (`ID`, `EMAIL`, `PASSWORD`, `TEST_NUM`, `NAME`, `GENDER`, `BIRTH`, `PHONE`, `ADDRESS`, `EMER_NAME`, `EMER_RELA`, `EMER_MOBILE`, `LOW_INCOME`, `GSATscore`, `ASTscore`, `ELScore`, `testroom`) VALUES
('F123456789', 'jerry831210@gmail.com', '123456789', 232903827, '王小明', '男', '1994/12/10', '0977654321', '台北市', '哈哈哈', '哈哈哈', '0955444321', 0, 127, 127, 0, 1);

-- --------------------------------------------------------

--
-- 資料表結構 `GSATscore`
--

CREATE TABLE IF NOT EXISTS `GSATscore` (
  `Score_ID` varchar(9) NOT NULL,
  `TEST_NUM` varchar(9) NOT NULL,
  `Chinese` int(11) NOT NULL,
  `English` int(11) NOT NULL,
  `MathA` int(11) DEFAULT NULL,
  `MathB` int(11) DEFAULT NULL,
  `History` int(11) DEFAULT NULL,
  `Geography` int(11) DEFAULT NULL,
  `Civics` int(11) DEFAULT NULL,
  `Physics` int(11) DEFAULT NULL,
  `Chemistry` int(11) DEFAULT NULL,
  `Biology` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 資料表的匯出資料 `GSATscore`
--

INSERT INTO `GSATscore` (`Score_ID`, `TEST_NUM`, `Chinese`, `English`, `MathA`, `MathB`, `History`, `Geography`, `Civics`, `Physics`, `Chemistry`, `Biology`) VALUES
('100000000', '100000001', 60, 60, 60, 60, 60, 60, 60, 60, 60, 60);

-- --------------------------------------------------------

--
-- 資料表結構 `Subject`
--

CREATE TABLE IF NOT EXISTS `Subject` (
  `SubjectNum` varchar(15) NOT NULL,
  `Chinese` tinyint(1) NOT NULL DEFAULT '0',
  `English` tinyint(1) NOT NULL DEFAULT '0',
  `Math` tinyint(1) NOT NULL DEFAULT '0',
  `MathA` tinyint(1) NOT NULL DEFAULT '0',
  `MathB` tinyint(1) NOT NULL DEFAULT '0',
  `Society` tinyint(1) NOT NULL DEFAULT '0',
  `Physics` tinyint(1) NOT NULL DEFAULT '0',
  `Chemistry` tinyint(1) NOT NULL DEFAULT '0',
  `Biology` tinyint(1) NOT NULL DEFAULT '0',
  `Science` tinyint(1) NOT NULL DEFAULT '0',
  `History` tinyint(1) NOT NULL DEFAULT '0',
  `Geography` tinyint(1) NOT NULL DEFAULT '0',
  `Civics` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 資料表的匯出資料 `Subject`
--

INSERT INTO `Subject` (`SubjectNum`, `Chinese`, `English`, `Math`, `MathA`, `MathB`, `Society`, `Physics`, `Chemistry`, `Biology`, `Science`, `History`, `Geography`, `Civics`) VALUES
('12345', 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0);

-- --------------------------------------------------------

--
-- 資料表結構 `Testroom`
--

CREATE TABLE IF NOT EXISTS `Testroom` (
  `testroomID` tinyint(20) NOT NULL,
  `testroomName` varchar(20) CHARACTER SET utf8 NOT NULL,
  `testroomAddress` varchar(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 資料表的匯出資料 `Testroom`
--

INSERT INTO `Testroom` (`testroomID`, `testroomName`, `testroomAddress`) VALUES
(1, '台北考場', '台北市'),
(2, '台中考場', '台中市');

--
-- 已匯出資料表的索引
--

--
-- 資料表索引 `ASTScore`
--
ALTER TABLE `ASTScore`
  ADD PRIMARY KEY (`Score_ID`),
  ADD UNIQUE KEY `Score_ID` (`Score_ID`),
  ADD UNIQUE KEY `Test_Num` (`Test_Num`);

--
-- 資料表索引 `Examinee`
--
ALTER TABLE `Examinee`
  ADD PRIMARY KEY (`TEST_NUM`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`);

--
-- 資料表索引 `GSATscore`
--
ALTER TABLE `GSATscore`
  ADD PRIMARY KEY (`Score_ID`);

--
-- 資料表索引 `Subject`
--
ALTER TABLE `Subject`
  ADD PRIMARY KEY (`SubjectNum`);

--
-- 資料表索引 `Testroom`
--
ALTER TABLE `Testroom`
  ADD PRIMARY KEY (`testroomID`);

--
-- 在匯出的資料表使用 AUTO_INCREMENT
--

--
-- 使用資料表 AUTO_INCREMENT `Examinee`
--
ALTER TABLE `Examinee`
  MODIFY `TEST_NUM` bigint(9) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=232903828;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
