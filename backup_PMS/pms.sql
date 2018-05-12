-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 12, 2018 at 04:12 AM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pms`
--

-- --------------------------------------------------------

--
-- Table structure for table `bonus`
--

DROP TABLE IF EXISTS `bonus`;
CREATE TABLE IF NOT EXISTS `bonus` (
  `bonus_id` varchar(45) NOT NULL,
  `emp_id_bonus` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `bonus_payment` varchar(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `bonus_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bonus_id`),
  KEY `emp_id_bonus_idx` (`emp_id_bonus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bonus`
--

INSERT INTO `bonus` (`bonus_id`, `emp_id_bonus`, `date`, `bonus_payment`, `note`, `bonus_type`) VALUES
('101b', '101', '2017-05-11', '50', 'very good job', 'Annual'),
('102b', '102', '2017-06-09', '150', 'nice job', 'special'),
('103b', '103', '2017-03-10', '50', 'for working hard', 'annual'),
('104b', '104', '2018-01-01', '88', 'good', 'special'),
('105b', '105', '2018-02-02', '99', 'nice', 'special'),
('106b', '106', '2018-03-03', '77', 'perfect', 'annual'),
('107b', '107', '2017-05-04', '100', 'very good job', 'special'),
('108b', '108', '2017-05-05', '150', 'nice job', 'special'),
('109b', '109', '2017-03-11', '50', 'for working hard', 'annual'),
('110b', '110', '2018-01-02', '88', 'good', 'special'),
('111b', '111', '2018-02-03', '99', 'nice', 'special'),
('112b', '112', '2018-03-04', '77', 'perfect', 'annual'),
('b1001', '1001', '2015-10-15', '5000', 'good', 'diwali'),
('b1002', '1002', '2015-10-08', '1500', 'nice', 'special'),
('b1003', '1003', '2015-08-15', '5600', 'Very Good', 'annual'),
('b1004', '1004', '2014-09-15', '4500', 'nice', 'diwali'),
('b1005', '1005', '2015-10-16', '8000', 'superb', 'diwali');

-- --------------------------------------------------------

--
-- Table structure for table `deduction`
--

DROP TABLE IF EXISTS `deduction`;
CREATE TABLE IF NOT EXISTS `deduction` (
  `deduct_id` varchar(10) NOT NULL,
  `emp_id_deduct` varchar(45) DEFAULT NULL,
  `amount` int(10) DEFAULT '0',
  `pf` varchar(45) DEFAULT '0',
  `gpf` varchar(45) DEFAULT '0',
  `it` varchar(45) DEFAULT '0',
  `loan` varchar(45) DEFAULT '0',
  `insurance` varchar(45) DEFAULT '0',
  PRIMARY KEY (`deduct_id`),
  KEY `emp_id_deduct_idx` (`emp_id_deduct`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `deduction`
--

INSERT INTO `deduction` (`deduct_id`, `emp_id_deduct`, `amount`, `pf`, `gpf`, `it`, `loan`, `insurance`) VALUES
('101d', '101', 214, '100', '50', '50', '10', '4'),
('102d', '102', 285, '100', '100', '50', '30', '5'),
('103d', '103d', 115, '20', '30', '50', '10', '5'),
('104d', '104', 180, '50', '50', '50', '20', '10'),
('105d', '105', 160, '50', '50', '50', '5', '5'),
('106d', '106', 214, '100', '50', '50', '10', '4'),
('107d', '107', 285, '100', '100', '50', '30', '5'),
('108d', '108d', 115, '20', '30', '50', '10', '5'),
('109d', '109', 180, '50', '50', '50', '20', '10'),
('110d', '110', 160, '50', '50', '50', '5', '5'),
('111d', '111', 180, '50', '50', '50', '20', '10'),
('112d', '112', 160, '50', '50', '50', '5', '5'),
('d1001', '1001', 10050, '2500', '1400', '2850', '1500', '1800'),
('d1002', '1002', 6600, '1500', '100', '500', '2000', '2500'),
('d1003', '1003', 19702, '1900', '6500', '4800', '1400', '5102'),
('d1004', '1004', 11650, '4500', '1450', '2500', '1400', '1800'),
('d1005', '1005', 18300, '7800', '4500', '2500', '1500', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` varchar(10) NOT NULL,
  `dept_id_emp` varchar(45) DEFAULT NULL,
  `job_id_emp` varchar(45) DEFAULT NULL,
  `type_id_emp` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `pincode` varchar(6) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `job_id_idx` (`job_id_emp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `dept_id_emp`, `job_id_emp`, `type_id_emp`, `last_name`, `first_name`, `dob`, `gender`, `country`, `state`, `city`, `address`, `pincode`, `email`, `mobile_no`) VALUES
('1001', 'dt1001', 'jt1001', 'et1001', 'Shah', 'Vimox', '1995-09-17', 'Male', 'India', 'Gujarat', 'Surat', 'Majuragate', '395001', 'vmox@gmail.com', '8866263371'),
('1002', 'dt1002', 'jt1002', 'et1002', 'shah', 'Jay', '1991-05-07', 'Male', 'India', 'Gujarat', 'Surat', 'Majuragate', '395001', 'jay@gmail.com', '9033228796'),
('1003', 'dt1003', 'jt1003', 'et1003', 'skeet', 'jon', '1987-01-12', 'Male', 'U.S', 'NY', 'NYC', 'palo alto', '012456', 'jon@yahoo.com', '5588964725'),
('1004', 'dt1004', 'jt1004', 'et1004', 'sunder', 'pichai', '1971-09-14', 'MAle', 'U.S', 'D.C', 'washington', 'Gplex', '445566', 'picha@gmail.com', '1324567890'),
('1005', 'dt1005', 'jt1005', 'et1005', 'zuckerberg', 'mark', '1984-05-14', 'Male', 'U.S ', 'D.C', 'palo alto', 'HQ,FB', '889966', 'zuck@fb.com', '2012458950'),
('101', '101dt', '101jt', '101et', 'asd', 'qwe', '1995-09-17', 'Male', 'Lithuania', 'asd', 'Vilnius', 'asd', '395001', 'asd@gmail.com', '8866263371'),
('102', '102dt', '102jt', '102et', 'asd', 'qwe', '1991-05-07', 'Male', 'U.S', 'Alabama', 'Auburn', 'asd', '395001', 'asd@gmail.com', '9033228796'),
('103', '103dt', '103jt', '103et', 'asd', 'qwe', '1987-01-12', 'Male', 'U.S', 'NY', 'NYC', 'palo alto', '012456', 'asd@yahoo.com', '5588964725'),
('104', '104dt', '104jt', '104et', 'asd', 'qwe', '1971-09-14', 'MAle', 'U.S', 'D.C', 'washington', 'Gplex', '445566', 'asd@gmail.com', '1324567890'),
('105', '105dt', '105jt', '105et', 'asd', 'qwe', '1984-05-14', 'Female', 'U.S ', 'D.C', 'palo alto', 'HQ,FB', '889966', 'asd@fb.com', '2012458950'),
('106', '106dt', '106jt', '106et', 'asd', 'qwe', '1995-09-17', 'Male', 'Lithuania', 'asd', 'Vilnius', 'asd', '395001', 'asd@gmail.com', '8866263371'),
('107', '107dt', '107jt', '107et', 'asd', 'qwe', '1991-05-07', 'Male', 'U.S', 'Alabama', 'Auburn', 'asd', '395001', 'asd@gmail.com', '9033228796'),
('108', '108dt', '108jt', '108et', 'asd', 'qwe', '1987-01-12', 'Male', 'U.S', 'NY', 'NYC', 'palo alto', '012456', 'asd@yahoo.com', '5588964725'),
('109', '109dt', '109jt', '109et', 'asd', 'qwe', '1971-09-14', 'MAle', 'U.S', 'D.C', 'washington', 'Gplex', '445566', 'asd@gmail.com', '1324567890'),
('110', '110dt', '110jt', '110et', 'asd', 'qwe', '1984-05-14', 'Female', 'U.S ', 'D.C', 'palo alto', 'HQ,FB', '889966', 'asd@fb.com', '2012458950'),
('111', '111dt', '111jt', '111et', 'asd', 'qwe', '1971-09-14', 'MAle', 'U.S', 'D.C', 'washington', 'Gplex', '445566', 'asd@gmail.com', '1324567890'),
('112', '112dt', '112jt', '112et', 'asd', 'qwe', '1984-05-14', 'Female', 'U.S ', 'D.C', 'palo alto', 'HQ,FB', '889966', 'asd@fb.com', '2012458950');

-- --------------------------------------------------------

--
-- Table structure for table `hourly`
--

DROP TABLE IF EXISTS `hourly`;
CREATE TABLE IF NOT EXISTS `hourly` (
  `hr_id` varchar(10) NOT NULL,
  `emp_id_hr` varchar(45) DEFAULT NULL,
  `hr_rate` int(10) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`hr_id`),
  KEY `emp_id_hr_idx` (`emp_id_hr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hourly`
--

INSERT INTO `hourly` (`hr_id`, `emp_id_hr`, `hr_rate`, `note`) VALUES
('101hr', '101', 5, 'Good'),
('102hr', '102', 8, 'Good'),
('103hr', '103', 15, 'Good'),
('104hr', '104', 7, 'Good'),
('105hr', '105', 4, 'Good'),
('106hr', '106', 5, 'Good'),
('107hr', '107', 8, 'Good'),
('108hr', '108', 15, 'Good'),
('109hr', '109', 7, 'Good'),
('110hr', '110', 4, 'Good'),
('111hr', '111', 7, 'Good'),
('112hr', '112', 4, 'Good'),
('hr1001', '1001', 1000, 'Good'),
('hr1002', '1002', 1250, 'Good'),
('hr1003', '1003', 750, 'Good'),
('hr1004', '1004', 1500, 'Good'),
('hr1005', '1005', 1650, 'Good');

-- --------------------------------------------------------

--
-- Table structure for table `incentives`
--

DROP TABLE IF EXISTS `incentives`;
CREATE TABLE IF NOT EXISTS `incentives` (
  `emp_id_ins` varchar(45) NOT NULL,
  `hra` varchar(45) DEFAULT '0',
  `da` varchar(45) DEFAULT '0',
  `cca` varchar(45) DEFAULT '0',
  `ta` varchar(45) DEFAULT '0',
  `medical` varchar(45) DEFAULT '0',
  `total` varchar(45) DEFAULT NULL,
  KEY `emp_id_ins_idx` (`emp_id_ins`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `incentives`
--

INSERT INTO `incentives` (`emp_id_ins`, `hra`, `da`, `cca`, `ta`, `medical`, `total`) VALUES
('1001', '5000.0', '1000.0', '1000.0', '1000.0', '1000.0', '9000.0'),
('1002', '5250.0', '1050.0', '1050.0', '1050.0', '1050.0', '9450.0'),
('1003', '8000.0', '14000.0', '2000.0', '2000.0', '2000.0', '28000.0'),
('1004', '100000.0', '175000.0', '100000.0', '25000.0', '25000.0', '425000.0'),
('1005', '12600.0', '3150.0', '3150.0', '3150.0', '3150.0', '25200.0'),
('101', '2000.0', '500.0', '500.0', '500.0', '500.0', '4000.0'),
('102', '2500.0', '750.0', '750.0', '750.0', '750.0', '5500.0'),
('103', '1800.0', '400.0', '400.0', '400.0', '400.0', '3400.0'),
('104', '1900.0', '450.0', '450.0', '450.0', '450.0', '3700.0'),
('105', '2400.0', '600.0', '600.0', '600.0', '600.0', '4800.0'),
('106', '2000.0', '500.0', '500.0', '500.0', '500.0', '4000.0'),
('107', '2500.0', '750.0', '750.0', '750.0', '750.0', '5500.0'),
('108', '1800.0', '400.0', '400.0', '400.0', '400.0', '3400.0'),
('109', '1900.0', '450.0', '450.0', '450.0', '450.0', '3700.0'),
('110', '2400.0', '600.0', '600.0', '600.0', '600.0', '4800.0'),
('111', '1900.0', '450.0', '450.0', '450.0', '450.0', '3700.0'),
('112', '2400.0', '600.0', '600.0', '600.0', '600.0', '4800.0');

-- --------------------------------------------------------

--
-- Table structure for table `job_title`
--

DROP TABLE IF EXISTS `job_title`;
CREATE TABLE IF NOT EXISTS `job_title` (
  `job_id` varchar(10) NOT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  `job_desc` varchar(45) DEFAULT NULL,
  `emp_id_job` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`job_id`),
  KEY `emp_id_idx` (`emp_id_job`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `job_title`
--

INSERT INTO `job_title` (`job_id`, `job_title`, `job_desc`, `emp_id_job`) VALUES
('101jt', 'rpa', 'Good', '101'),
('102jt', 'IT Service Desk', 'Good	', '102'),
('103jt', 'C# Developer', 'Good', '103'),
('104jt', 'Frontend Developer', 'Good', '104'),
('105jt', 'Embedded Developer', 'Good', '105'),
('106jt', 'rpa', 'Good', '106'),
('107jt', 'IT Service Desk', 'Good', '107'),
('108jt', 'C# Developer', 'Good', '108'),
('109jt', 'Frontend Developer', 'Good', '109'),
('110jt', 'Embedded Developer', 'Good', '110'),
('111jt', 'Frontend Developer', 'Good', '111'),
('112jt', 'Embedded Developer', 'Good', '112'),
('jt1001', 'S/W Dev', 'Good', '1001'),
('jt1002', 'S/W Dev', 'Good	', '1002'),
('jt1003', 'S/W Dev', 'Good	', '1003'),
('jt1004', 'S/W Dev', 'Good	', '1004'),
('jt1005', 'S/W Dev', 'Good	', '1005');

-- --------------------------------------------------------

--
-- Table structure for table `leave_cassual`
--

DROP TABLE IF EXISTS `leave_cassual`;
CREATE TABLE IF NOT EXISTS `leave_cassual` (
  `emp_id_cas` varchar(45) NOT NULL,
  `jan` varchar(45) NOT NULL DEFAULT '0',
  `feb` varchar(45) NOT NULL DEFAULT '0',
  `mar` varchar(45) NOT NULL DEFAULT '0',
  `apr` varchar(45) NOT NULL DEFAULT '0',
  `may` varchar(45) NOT NULL DEFAULT '0',
  `june` varchar(45) NOT NULL DEFAULT '0',
  `july` varchar(45) NOT NULL DEFAULT '0',
  `aug` varchar(45) NOT NULL DEFAULT '0',
  `sept` varchar(45) NOT NULL DEFAULT '0',
  `oct` varchar(45) NOT NULL DEFAULT '0',
  `nov` varchar(45) NOT NULL DEFAULT '0',
  `decm` varchar(45) NOT NULL DEFAULT '0',
  `total_cas` varchar(45) NOT NULL DEFAULT '0',
  KEY `emp_id_cas_idx` (`emp_id_cas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_cassual`
--

INSERT INTO `leave_cassual` (`emp_id_cas`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_cas`) VALUES
('1001', '1', '1', '1', '1', '1', '1', '11', '0', '1', '1', '1', '1', '22'),
('1002', '5', '5', '5', '5', '5', '5', '5', '5', '0', '5', '5', '5', '55'),
('1003', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1004', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1005', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('101', '1', '1', '1', '1', '1', '1', '11', '0', '1', '1', '1', '1', '22'),
('102', '5', '5', '5', '5', '5', '5', '5', '5', '0', '5', '5', '5', '55'),
('103', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('104', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('105', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('106', '1', '1', '1', '1', '1', '1', '11', '0', '1', '1', '1', '1', '22'),
('107', '5', '5', '5', '5', '5', '5', '5', '5', '0', '5', '5', '5', '55'),
('108', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('109', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('110', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('111', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('112', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `leave_convantion`
--

DROP TABLE IF EXISTS `leave_convantion`;
CREATE TABLE IF NOT EXISTS `leave_convantion` (
  `emp_id_con` varchar(45) NOT NULL,
  `jan` varchar(45) DEFAULT '0',
  `feb` varchar(45) DEFAULT '0',
  `mar` varchar(45) DEFAULT '0',
  `apr` varchar(45) DEFAULT '0',
  `may` varchar(45) DEFAULT '0',
  `june` varchar(45) DEFAULT '0',
  `july` varchar(45) DEFAULT '0',
  `aug` varchar(45) DEFAULT '0',
  `sept` varchar(45) DEFAULT '0',
  `oct` varchar(45) DEFAULT '0',
  `nov` varchar(45) DEFAULT '0',
  `decm` varchar(45) DEFAULT '0',
  `total_con` varchar(45) DEFAULT '0',
  KEY `emp-id_con_idx` (`emp_id_con`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_convantion`
--

INSERT INTO `leave_convantion` (`emp_id_con`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_con`) VALUES
('1001', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1002', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1003', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1004', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1005', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('101', '1', '2', '3', '4', '5', '0', '0', '0', '0', '0', '0', '0', '0'),
('102', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('103', '0', '0', '0', '5', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('104', '0', '0', '0', '11', '0', '0', '0', '0', '2', '0', '0', '0', '0'),
('105', '0', '0', '0', '5', '0', '6', '0', '0', '0', '0', '0', '0', '0'),
('106', '0', '0', '0', '6', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('107', '0', '0', '0', '0', '0', '0', '0', '7', '0', '1', '0', '0', '0'),
('108', '0', '0', '15', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('109', '0', '0', '0', '0', '3', '0', '0', '0', '0', '0', '0', '0', '0'),
('110', '0', '0', '0', '0', '14', '0', '0', '0', '0', '0', '0', '0', '0'),
('111', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0'),
('112', '0', '0', '0', '0', '4', '0', '0', '0', '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `leave_details`
--

DROP TABLE IF EXISTS `leave_details`;
CREATE TABLE IF NOT EXISTS `leave_details` (
  `leave_id` varchar(45) NOT NULL,
  `emp_id_leave` varchar(45) DEFAULT NULL,
  `leave_type` varchar(45) DEFAULT NULL,
  `starting_leave` date DEFAULT NULL,
  `ending_leave` date DEFAULT NULL,
  `balance_leave` varchar(45) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `total_leave` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`leave_id`),
  KEY `emp_id_leave_idx` (`emp_id_leave`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_details`
--

INSERT INTO `leave_details` (`leave_id`, `emp_id_leave`, `leave_type`, `starting_leave`, `ending_leave`, `balance_leave`, `note`, `total_leave`) VALUES
('101l', '101', 'Sick Leave', '2018-01-01', '2018-01-02', '50', 'please Grant Leave', '2'),
('102l', '102', 'Sick Leave', '2018-01-02', '2018-10-03', '50', 'please Grant Leave', '2'),
('103l', '103', 'Sick Leave', '2018-01-03', '2018-10-04', '50', 'please Grant Leave', '2'),
('104l', '104', 'Sick Leave', '2018-01-04', '2018-10-05', '50', 'please Grant Leave', '2'),
('105l', '105', 'Sick Leave', '2018-01-05', '2018-10-06', '50', 'please Grant Leave', '2'),
('106l', '106', 'Sick Leave', '2018-01-01', '2018-01-02', '50', 'please Grant Leave', '2'),
('107l', '107', 'Sick Leave', '2018-01-02', '2018-10-03', '50', 'please Grant Leave', '2'),
('108l', '108', 'Sick Leave', '2018-01-03', '2018-10-04', '50', 'please Grant Leave', '2'),
('109l', '109', 'Sick Leave', '2018-01-04', '2018-10-05', '50', 'please Grant Leave', '2'),
('110l', '110', 'Sick Leave', '2018-01-05', '2018-10-06', '50', 'please Grant Leave', '2'),
('111l', '111', 'Sick Leave', '2018-01-04', '2018-10-05', '50', 'please Grant Leave', '2'),
('112l', '112', 'Sick Leave', '2018-01-05', '2018-10-06', '50', 'please Grant Leave', '2'),
('l1001', '1001', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('l1002', '1002', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('l1003', '1003', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('l1004', '1004', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('l1005', '1005', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2');

-- --------------------------------------------------------

--
-- Table structure for table `leave_sick`
--

DROP TABLE IF EXISTS `leave_sick`;
CREATE TABLE IF NOT EXISTS `leave_sick` (
  `emp_id_sick` varchar(45) NOT NULL,
  `jan` varchar(45) DEFAULT '0',
  `feb` varchar(45) DEFAULT '0',
  `mar` varchar(45) DEFAULT '0',
  `april` varchar(45) DEFAULT '0',
  `may` varchar(45) DEFAULT '0',
  `june` varchar(45) DEFAULT '0',
  `july` varchar(45) DEFAULT '0',
  `aug` varchar(45) DEFAULT '0',
  `sept` varchar(45) DEFAULT '0',
  `oct` varchar(45) DEFAULT '0',
  `nov` varchar(45) DEFAULT '0',
  `decm` varchar(45) DEFAULT '0',
  `total_sick` varchar(45) NOT NULL DEFAULT '0',
  KEY `emp_id_sick_idx` (`emp_id_sick`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_sick`
--

INSERT INTO `leave_sick` (`emp_id_sick`, `jan`, `feb`, `mar`, `april`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_sick`) VALUES
('1001', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1002', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1003', '1', '1', '11', '1', '3', '3', '1', '11', '1', '13', '3', '2', '51'),
('1004', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1005', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '60'),
('101', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('102', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('103', '1', '1', '11', '1', '3', '3', '1', '11', '1', '13', '3', '2', '51'),
('104', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('105', '5', '3', '3', '3', '0', '1', '1', '2', '3', '2', '12', '1', '36'),
('106', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('107', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('108', '1', '1', '11', '1', '3', '3', '1', '11', '1', '13', '3', '2', '51'),
('109', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('110', '5', '3', '3', '3', '0', '1', '1', '2', '3', '2', '12', '1', '36'),
('111', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('112', '5', '3', '3', '3', '0', '1', '1', '2', '3', '2', '12', '1', '36');

-- --------------------------------------------------------

--
-- Table structure for table `leave_total`
--

DROP TABLE IF EXISTS `leave_total`;
CREATE TABLE IF NOT EXISTS `leave_total` (
  `leave_type` varchar(45) NOT NULL,
  `jan` varchar(45) NOT NULL DEFAULT '0',
  `feb` varchar(45) NOT NULL DEFAULT '0',
  `mar` varchar(45) NOT NULL DEFAULT '0',
  `apr` varchar(45) NOT NULL DEFAULT '0',
  `may` varchar(45) NOT NULL DEFAULT '0',
  `june` varchar(45) NOT NULL DEFAULT '0',
  `july` varchar(45) NOT NULL DEFAULT '0',
  `aug` varchar(45) NOT NULL DEFAULT '0',
  `sept` varchar(45) NOT NULL DEFAULT '0',
  `oct` varchar(45) NOT NULL DEFAULT '0',
  `nov` varchar(45) NOT NULL DEFAULT '0',
  `decm` varchar(45) NOT NULL DEFAULT '0',
  UNIQUE KEY `leave_type_UNIQUE` (`leave_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_total`
--

INSERT INTO `leave_total` (`leave_type`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`) VALUES
('Cassual Leave', '8', '8', '8', '5', '15', '4', '8', '8', '6', '6', '15', '6'),
('Convention Leave', '7', '4', '6', '61', '6', '3', '8', '5', '12', '5', '12', '4'),
('Sick Leave', '15', '51', '6', '32', '2', '1', '14', '33', '11', '5', '3', '5'),
('Vacation Leave', '3', '3', '2', '4', '6', '5', '3', '3', '1', '4', '46', '9');

-- --------------------------------------------------------

--
-- Table structure for table `leave_vacation`
--

DROP TABLE IF EXISTS `leave_vacation`;
CREATE TABLE IF NOT EXISTS `leave_vacation` (
  `emp_id_vac` varchar(45) NOT NULL,
  `jan` varchar(45) DEFAULT '0',
  `feb` varchar(45) DEFAULT '0',
  `mar` varchar(45) DEFAULT '0',
  `apr` varchar(45) DEFAULT '0',
  `may` varchar(45) DEFAULT '0',
  `june` varchar(45) DEFAULT '0',
  `july` varchar(45) DEFAULT '0',
  `aug` varchar(45) DEFAULT '0',
  `sept` varchar(45) DEFAULT '0',
  `oct` varchar(45) DEFAULT '0',
  `nov` varchar(45) DEFAULT '0',
  `decm` varchar(45) DEFAULT '0',
  `total_vac` varchar(45) DEFAULT '0',
  KEY `emp_id_vac_idx` (`emp_id_vac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_vacation`
--

INSERT INTO `leave_vacation` (`emp_id_vac`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_vac`) VALUES
('1001', '1', '01', '05', '03', '05', '04', '01', '01', '02', '03', '05', '04', '35'),
('1002', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1003', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1004', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1005', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('101', '1', '01', '05', '03', '05', '04', '01', '01', '02', '03', '05', '04', '35'),
('102', '0', '0', '04', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('103', '0', '0', '0', '0', '03', '0', '0', '0', '0', '0', '0', '0', '0'),
('104', '0', '0', '0', '02', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('105', '0', '0', '01', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('106', '1', '01', '05', '03', '05', '04', '01', '01', '02', '03', '05', '04', '35'),
('107', '0', '0', '04', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('108', '0', '0', '0', '0', '03', '0', '0', '0', '0', '0', '0', '0', '0'),
('109', '0', '0', '0', '02', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('110', '0', '0', '01', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('111', '0', '0', '0', '02', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('112', '0', '0', '01', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `uname` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='			';

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`uname`, `password`) VALUES
('123', '123'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `payroll`
--

DROP TABLE IF EXISTS `payroll`;
CREATE TABLE IF NOT EXISTS `payroll` (
  `payroll_id` varchar(10) NOT NULL DEFAULT '1001',
  `emp_id` varchar(45) DEFAULT NULL,
  `hrs_worked` varchar(45) DEFAULT NULL,
  `deductions` varchar(45) DEFAULT NULL,
  `netpay` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`payroll_id`),
  KEY `emp_id_idx` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `payroll`
--

INSERT INTO `payroll` (`payroll_id`, `emp_id`, `hrs_worked`, `deductions`, `netpay`) VALUES
('101p', '101', '170', '214.0', '4800.0'),
('102p', '102', '170', '100.0', '5900.0'),
('103p', '103', '170', '150.0', '600.0'),
('104p', '104', '170', '250.0', '4600.0'),
('105p', '105', '170', '180.0', '5450.0'),
('106p', '106', '170', '214.0', '4800.0'),
('107p', '107', '170', '100.0', '5900.0'),
('108p', '108', '170', '150.0', '6100.0'),
('109p', '109', '170', '250.0', '4600.0'),
('110p', '110', '170', '180.0', '5450.0'),
('111p', '111', '170', '250.0', '4600.0'),
('112p', '105', '170', '180.0', '4960.0'),
('p1001', '1001', '208', '10050.0', '94950.0'),
('p1002', '1002', '208', '6600.0', '99900.0'),
('p1003', '1003', '208', '19702.0', '185898.0'),
('p1004', '1004', '208', '11650.0', '2492850.0'),
('p1005', '1005', '208', '18300.0', '304700.0');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE IF NOT EXISTS `salary` (
  `salary_id` varchar(10) NOT NULL,
  `emp_id_salary` varchar(45) DEFAULT NULL,
  `salary` varchar(45) DEFAULT NULL,
  `baseryr` year(4) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`salary_id`),
  KEY `emp_id_idx` (`emp_id_salary`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`salary_id`, `emp_id_salary`, `salary`, `baseryr`, `note`) VALUES
('101s', '101', '1014', 2018, 'Nice'),
('102s', '102', '685', 2018, 'Nice'),
('103s', '103', '600', 2018, 'Nice'),
('104s', '104', '180', 2017, 'Nice'),
('105s', '105', '320', 2017, 'Nice'),
('106s', '106', '1014', 2018, 'Nice'),
('107s', '107', '685', 2018, 'Nice'),
('108s', '108', '600', 2018, 'Nice'),
('109s', '109', '180', 2017, 'Nice'),
('110s', '110', '320', 2017, 'Nice'),
('111s', '111', '685', 2018, 'Nice'),
('112s', '112', '600', 2018, 'Nice'),
('s1001', '1001', '100000', 2015, 'Nice'),
('s1002', '1002', '105000', 2015, 'Nice'),
('s1003', '1003', '200000', 2012, 'Nice'),
('s1004', '1004', '2500000', 2011, 'Nice'),
('s1005', '1005', '315000', 2008, 'Nice');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bonus`
--
ALTER TABLE `bonus`
  ADD CONSTRAINT `emp_id_bonus` FOREIGN KEY (`emp_id_bonus`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `deduction`
--
ALTER TABLE `deduction`
  ADD CONSTRAINT `emp_id_deduct` FOREIGN KEY (`emp_id_deduct`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hourly`
--
ALTER TABLE `hourly`
  ADD CONSTRAINT `emp_id_hr` FOREIGN KEY (`emp_id_hr`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `incentives`
--
ALTER TABLE `incentives`
  ADD CONSTRAINT `emp_id_ins` FOREIGN KEY (`emp_id_ins`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `job_title`
--
ALTER TABLE `job_title`
  ADD CONSTRAINT `emp_id_job` FOREIGN KEY (`emp_id_job`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `leave_cassual`
--
ALTER TABLE `leave_cassual`
  ADD CONSTRAINT `emp_id_cas` FOREIGN KEY (`emp_id_cas`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `leave_convantion`
--
ALTER TABLE `leave_convantion`
  ADD CONSTRAINT `emp-id_con` FOREIGN KEY (`emp_id_con`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `leave_details`
--
ALTER TABLE `leave_details`
  ADD CONSTRAINT `emp_id_leave` FOREIGN KEY (`emp_id_leave`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `leave_sick`
--
ALTER TABLE `leave_sick`
  ADD CONSTRAINT `emp_id_sick` FOREIGN KEY (`emp_id_sick`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `leave_vacation`
--
ALTER TABLE `leave_vacation`
  ADD CONSTRAINT `emp_id_vac` FOREIGN KEY (`emp_id_vac`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payroll`
--
ALTER TABLE `payroll`
  ADD CONSTRAINT `emp_id` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `salary`
--
ALTER TABLE `salary`
  ADD CONSTRAINT `emp_id_salary` FOREIGN KEY (`emp_id_salary`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
