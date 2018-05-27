-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 27, 2018 at 05:03 PM
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
-- Table structure for table `archived_records`
--

DROP TABLE IF EXISTS `archived_records`;
CREATE TABLE IF NOT EXISTS `archived_records` (
  `emp_id` varchar(10) CHARACTER SET utf8 NOT NULL,
  `dept_id_emp` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `last_name` text CHARACTER SET utf8,
  `first_name` text CHARACTER SET utf8,
  `dob` date DEFAULT NULL,
  `gender` text CHARACTER SET utf8,
  `country` text CHARACTER SET utf8,
  `state` text CHARACTER SET utf8,
  `city` text CHARACTER SET utf8,
  `address` text CHARACTER SET utf8,
  `pincode` int(6) DEFAULT NULL,
  `email` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `mobile_no` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bonus`
--

DROP TABLE IF EXISTS `bonus`;
CREATE TABLE IF NOT EXISTS `bonus` (
  `emp_id_bonus` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `bonus_payment` int(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `bonus_type` varchar(45) DEFAULT NULL,
  KEY `emp_id_bonus_idx` (`emp_id_bonus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bonus`
--

INSERT INTO `bonus` (`emp_id_bonus`, `date`, `bonus_payment`, `note`, `bonus_type`) VALUES
('102', '2017-06-09', 400, 'nice job', 'Special'),
('103', '2017-03-10', 50, 'for working hard', 'annual'),
('104', '2018-01-01', 88, 'good', 'special'),
('105', '2018-02-02', 99, 'nice', 'special'),
('106', '2018-03-03', 77, 'perfect', 'annual'),
('107', '2017-05-04', 100, 'very good job', 'special'),
('108', '2017-05-05', 150, 'nice job', 'special'),
('109', '2017-03-11', 50, 'for working hard', 'annual'),
('110', '2018-01-02', 88, 'good', 'special'),
('111', '2018-02-03', 99, 'nice', 'special'),
('112', '2018-03-04', 77, 'perfect', 'annual'),
('1002', '2015-10-08', 1500, 'nice', 'special'),
('1003', '2015-08-15', 5600, 'Very Good', 'annual'),
('1004', '2014-09-15', 4500, 'nice', 'diwali'),
('1005', '2015-10-16', 8000, 'superb', 'diwali');

-- --------------------------------------------------------

--
-- Table structure for table `deduction`
--

DROP TABLE IF EXISTS `deduction`;
CREATE TABLE IF NOT EXISTS `deduction` (
  `emp_id_deduct` varchar(45) DEFAULT NULL,
  `amount` int(10) DEFAULT '0',
  `pf` varchar(45) DEFAULT '0',
  `gpf` varchar(45) DEFAULT '0',
  `it` varchar(45) DEFAULT '0',
  `loan` varchar(45) DEFAULT '0',
  `insurance` varchar(45) DEFAULT '0',
  KEY `emp_id_deduct_idx` (`emp_id_deduct`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `deduction`
--

INSERT INTO `deduction` (`emp_id_deduct`, `amount`, `pf`, `gpf`, `it`, `loan`, `insurance`) VALUES
('102', 285, '100', '100', '50', '30', '5'),
('103d', 115, '20', '30', '50', '10', '5'),
('104', 180, '50', '50', '50', '20', '10'),
('105', 160, '50', '50', '50', '5', '5'),
('106', 214, '100', '50', '50', '10', '4'),
('107', 285, '100', '100', '50', '30', '5'),
('108d', 115, '20', '30', '50', '10', '5'),
('109', 180, '50', '50', '50', '20', '10'),
('110', 160, '50', '50', '50', '5', '5'),
('111', 180, '50', '50', '50', '20', '10'),
('112', 160, '50', '50', '50', '5', '5'),
('1001', 10050, '2500', '1400', '2850', '1500', '1800'),
('1002', 6600, '1500', '100', '500', '2000', '2500'),
('1003', 19702, '1900', '6500', '4800', '1400', '5102'),
('1004', 11650, '4500', '1450', '2500', '1400', '1800'),
('1005', 18300, '7800', '4500', '2500', '1500', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` varchar(10) NOT NULL,
  `dept_id_emp` varchar(45) DEFAULT NULL,
  `last_name` text,
  `first_name` text,
  `dob` date DEFAULT NULL,
  `gender` text,
  `country` text,
  `state` text,
  `city` text,
  `address` text,
  `pincode` int(6) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `dept_id_emp`, `last_name`, `first_name`, `dob`, `gender`, `country`, `state`, `city`, `address`, `pincode`, `email`, `mobile_no`) VALUES
('1002', 'dt1002', 'shah', 'Jay', '1991-05-07', 'Male', 'India', 'Gujarat', 'Surat', 'Majuragate', 395001, 'jay@gmail.com', '9033228796'),
('1003', 'dt1003', 'skeet', 'jon', '1987-01-12', 'Male', 'U.S', 'NY', 'NYC', 'palo alto', 12456, 'jon@yahoo.com', '5588964725'),
('1004', 'dt1004', 'sunder', 'pichai', '1971-09-14', 'MAle', 'U.S', 'D.C', 'washington', 'Gplex', 445566, 'picha@gmail.com', '1324567890'),
('1005', 'dt1005', 'zuckerberg', 'mark', '1984-05-14', 'Male', 'U.S ', 'D.C', 'palo alto', 'HQ,FB', 889966, 'zuck@fb.com', '2012458950'),
('102', '34KC', 'asd', 'qwer', '1991-05-07', 'Male', 'U.S', 'California', 'Los Angeles', 'asd', 395001, 'asd@gmail.com', '9033228796'),
('103', '28KU', 'asd', 'qwe', '1987-01-12', 'Male', 'U.S', 'Alabama', 'Chicago', 'palo alto', 12456, 'asd@yahoo.com', '5588964725'),
('104', '25KE', 'asd', 'qwe', '1971-09-14', 'Female', 'U.S', 'D.C', 'washington', 'Gplex', 445566, 'asd@gmail.com', '1324567890'),
('105', '34KC', 'asd', 'qwe', '1984-05-14', 'Female', 'U.S', 'Wisconsin', 'New York', 'HQ,FB', 889966, 'asd@fb.com', '2012458950'),
('106', '28KU', 'asd', 'qwe', '1995-09-17', 'Male', 'Lithuania', 'Vilnius City Municipality', 'Vilnius', 'asd', 395001, 'asd@gmail.com', '8866263371'),
('107', '107dt', 'asd', 'qwe', '1991-05-07', 'Male', 'U.S', 'Alabama', 'Auburn', 'asd', 395001, 'asd@gmail.com', '9033228796'),
('108', '108dt', 'asd', 'qwe', '1987-01-12', 'Male', 'U.S', 'NY', 'NYC', 'palo alto', 12456, 'asd@yahoo.com', '5588964725'),
('109', '30KA', 'asd', 'qwe', '1971-09-14', 'Female', 'U.S', 'Virginia', 'Las Vegas', 'Gplex', 445566, 'asd@gmail.com', '1324567890'),
('110', '25KE', 'asd', 'qwe', '1984-05-14', 'Female', 'India', 'Jharkhand', 'Raleigh', 'HQ,FB', 889966, 'asd@fb.com', '2012458950'),
('111', '111dt', 'asd', 'qwe', '1971-09-14', 'MAle', 'U.S', 'D.C', 'washington', 'Gplex', 445566, 'asd@gmail.com', '1324567890'),
('112', '112dt', 'asd', 'qwe', '1984-05-14', 'Female', 'U.S ', 'D.C', 'palo alto', 'HQ,FB', 889966, 'asd@fb.com', '2012458950');

-- --------------------------------------------------------

--
-- Table structure for table `hourly`
--

DROP TABLE IF EXISTS `hourly`;
CREATE TABLE IF NOT EXISTS `hourly` (
  `emp_id_hr` varchar(45) DEFAULT NULL,
  `hr_rate` int(10) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  KEY `emp_id_hr_idx` (`emp_id_hr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hourly`
--

INSERT INTO `hourly` (`emp_id_hr`, `hr_rate`, `note`) VALUES
('102', 8, 'Good'),
('103', 15, 'Good'),
('104', 7, 'Good'),
('105', 4, 'Good'),
('106', 5, 'Good'),
('107', 8, 'Good'),
('108', 15, 'Good'),
('109', 7, 'Good'),
('110', 4, 'Good'),
('111', 7, 'Good'),
('112', 4, 'Good'),
('1002', 1250, 'Good'),
('1003', 750, 'Good'),
('1004', 1500, 'Good'),
('1005', 1650, 'Good');

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
('112', '2400.0', '600.0', '600.0', '600.0', '600.0', '4800.0'),
('102', '0.0', '0.0', '0.0', '0.0', '0.0', '0.0'),
('102', '34.25', '68.5', '102.75', '137.0', '13.7', '356.2');

-- --------------------------------------------------------

--
-- Table structure for table `job_title`
--

DROP TABLE IF EXISTS `job_title`;
CREATE TABLE IF NOT EXISTS `job_title` (
  `job_title` varchar(45) DEFAULT NULL,
  `job_desc` varchar(45) DEFAULT NULL,
  `emp_id_job` varchar(45) DEFAULT NULL,
  KEY `emp_id_idx` (`emp_id_job`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `job_title`
--

INSERT INTO `job_title` (`job_title`, `job_desc`, `emp_id_job`) VALUES
('IT Service Desk', 'Good	', '102'),
('C# Developer', 'Good', '103'),
('Frontend Developer', 'Good', '104'),
('Embedded Developer', 'Good', '105'),
('rpa', 'Good', '106'),
('IT Service Desk', 'Good', '107'),
('C# Developer', 'Good', '108'),
('Frontend Developer', 'Good', '109'),
('Embedded Developer', 'Good', '110'),
('Frontend Developer', 'Good', '111'),
('Embedded Developer', 'Good', '112'),
('S/W Dev', 'Good', '1001'),
('S/W Dev', 'Good	', '1002'),
('S/W Dev', 'Good	', '1003'),
('S/W Dev', 'Good	', '1004'),
('S/W Dev', 'Good	', '1005');

-- --------------------------------------------------------

--
-- Table structure for table `leave_cassual`
--

DROP TABLE IF EXISTS `leave_cassual`;
CREATE TABLE IF NOT EXISTS `leave_cassual` (
  `emp_id_cas` varchar(45) NOT NULL,
  `jan` int(45) NOT NULL DEFAULT '0',
  `feb` int(45) NOT NULL DEFAULT '0',
  `mar` int(45) NOT NULL DEFAULT '0',
  `apr` int(45) NOT NULL DEFAULT '0',
  `may` int(45) NOT NULL DEFAULT '0',
  `june` int(45) NOT NULL DEFAULT '0',
  `july` int(45) NOT NULL DEFAULT '0',
  `aug` int(45) NOT NULL DEFAULT '0',
  `sept` int(45) NOT NULL DEFAULT '0',
  `oct` int(45) NOT NULL DEFAULT '0',
  `nov` int(45) NOT NULL DEFAULT '0',
  `decm` int(45) NOT NULL DEFAULT '0',
  `total_cas` int(45) NOT NULL DEFAULT '0',
  KEY `emp_id_cas_idx` (`emp_id_cas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_cassual`
--

INSERT INTO `leave_cassual` (`emp_id_cas`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_cas`) VALUES
('1001', 1, 1, 1, 1, 1, 1, 11, 0, 1, 1, 1, 1, 22),
('1002', 5, 5, 5, 5, 5, 5, 5, 5, 0, 5, 5, 5, 55),
('1003', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1004', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1005', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('102', 5, 5, 5, 5, 5, 5, 5, 5, 0, 5, 5, 5, 55),
('103', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('104', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('105', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('106', 1, 1, 1, 1, 1, 1, 11, 0, 1, 1, 1, 1, 22),
('107', 5, 5, 5, 5, 5, 5, 5, 5, 0, 5, 5, 5, 55),
('108', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('109', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('110', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('111', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('112', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `leave_convantion`
--

DROP TABLE IF EXISTS `leave_convantion`;
CREATE TABLE IF NOT EXISTS `leave_convantion` (
  `emp_id_con` varchar(45) NOT NULL,
  `jan` int(45) DEFAULT '0',
  `feb` int(45) DEFAULT '0',
  `mar` int(45) DEFAULT '0',
  `apr` int(45) DEFAULT '0',
  `may` int(45) DEFAULT '0',
  `june` int(45) DEFAULT '0',
  `july` int(45) DEFAULT '0',
  `aug` int(45) DEFAULT '0',
  `sept` int(45) DEFAULT '0',
  `oct` int(45) DEFAULT '0',
  `nov` int(45) DEFAULT '0',
  `decm` int(45) DEFAULT '0',
  `total_con` int(45) DEFAULT '0',
  KEY `emp-id_con_idx` (`emp_id_con`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_convantion`
--

INSERT INTO `leave_convantion` (`emp_id_con`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_con`) VALUES
('1001', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1002', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1003', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1004', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1005', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('102', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('103', 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('104', 0, 0, 0, 11, 0, 0, 0, 0, 2, 0, 0, 0, 0),
('105', 0, 0, 0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0),
('106', 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('107', 0, 0, 0, 0, 0, 0, 0, 7, 0, 1, 0, 0, 0),
('108', 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('109', 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0),
('110', 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0),
('111', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
('112', 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `leave_details`
--

DROP TABLE IF EXISTS `leave_details`;
CREATE TABLE IF NOT EXISTS `leave_details` (
  `emp_id_leave` varchar(45) DEFAULT NULL,
  `leave_type` varchar(45) DEFAULT NULL,
  `starting_leave` date DEFAULT NULL,
  `ending_leave` date DEFAULT NULL,
  `balance_leave` varchar(45) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `total_leave` varchar(45) DEFAULT NULL,
  KEY `emp_id_leave_idx` (`emp_id_leave`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_details`
--

INSERT INTO `leave_details` (`emp_id_leave`, `leave_type`, `starting_leave`, `ending_leave`, `balance_leave`, `note`, `total_leave`) VALUES
('102', 'Sick Leave', '2018-01-02', '2018-10-03', '50', 'please Grant Leave', '2'),
('103', 'Sick Leave', '2018-01-03', '2018-10-04', '50', 'please Grant Leave', '2'),
('104', 'Sick Leave', '2018-01-04', '2018-10-05', '50', 'please Grant Leave', '2'),
('105', 'Sick Leave', '2018-01-05', '2018-10-06', '50', 'please Grant Leave', '2'),
('106', 'Sick Leave', '2018-01-01', '2018-01-02', '50', 'please Grant Leave', '2'),
('107', 'Vacation Leave', '2018-01-02', '2018-10-03', '50', 'please Grant Leave', '2'),
('108', 'Sick Leave', '2018-01-03', '2018-10-04', '50', 'please Grant Leave', '2'),
('109', 'Sick Leave', '2018-01-04', '2018-10-05', '50', 'please Grant Leave', '2'),
('110', 'Sick Leave', '2018-01-05', '2018-10-06', '50', 'please Grant Leave', '2'),
('111', 'Sick Leave', '2018-01-04', '2018-10-05', '50', 'please Grant Leave', '2'),
('112', 'Sick Leave', '2018-01-05', '2018-10-06', '50', 'please Grant Leave', '2'),
('1001', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('1002', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('1003', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('1004', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2'),
('1005', 'Sick Leave', '2015-10-21', '2015-10-22', '50', 'please Grant Leave', '2');

-- --------------------------------------------------------

--
-- Table structure for table `leave_sick`
--

DROP TABLE IF EXISTS `leave_sick`;
CREATE TABLE IF NOT EXISTS `leave_sick` (
  `emp_id_sick` varchar(45) NOT NULL,
  `jan` int(45) DEFAULT '0',
  `feb` int(45) DEFAULT '0',
  `mar` int(45) DEFAULT '0',
  `april` int(45) DEFAULT '0',
  `may` int(45) DEFAULT '0',
  `june` int(45) DEFAULT '0',
  `july` int(45) DEFAULT '0',
  `aug` int(45) DEFAULT '0',
  `sept` int(45) DEFAULT '0',
  `oct` int(45) DEFAULT '0',
  `nov` int(45) DEFAULT '0',
  `decm` int(45) DEFAULT '0',
  `total_sick` int(45) NOT NULL DEFAULT '0',
  KEY `emp_id_sick_idx` (`emp_id_sick`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_sick`
--

INSERT INTO `leave_sick` (`emp_id_sick`, `jan`, `feb`, `mar`, `april`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_sick`) VALUES
('1001', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1002', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1003', 1, 1, 11, 1, 3, 3, 1, 11, 1, 13, 3, 2, 51),
('1004', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1005', 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 60),
('102', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('103', 1, 1, 11, 1, 3, 3, 1, 11, 1, 13, 3, 2, 51),
('104', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('105', 5, 3, 3, 3, 0, 1, 1, 2, 3, 2, 12, 1, 36),
('106', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('107', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('108', 1, 1, 11, 1, 3, 3, 1, 11, 1, 13, 3, 2, 51),
('109', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('110', 5, 3, 3, 3, 0, 1, 1, 2, 3, 2, 12, 1, 36),
('111', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('112', 5, 3, 3, 3, 0, 1, 1, 2, 3, 2, 12, 1, 36);

-- --------------------------------------------------------

--
-- Table structure for table `leave_total`
--

DROP TABLE IF EXISTS `leave_total`;
CREATE TABLE IF NOT EXISTS `leave_total` (
  `leave_type` varchar(45) NOT NULL,
  `jan` int(45) NOT NULL DEFAULT '0',
  `feb` int(45) NOT NULL DEFAULT '0',
  `mar` int(45) NOT NULL DEFAULT '0',
  `apr` int(45) NOT NULL DEFAULT '0',
  `may` int(45) NOT NULL DEFAULT '0',
  `june` int(45) NOT NULL DEFAULT '0',
  `july` int(45) NOT NULL DEFAULT '0',
  `aug` int(45) NOT NULL DEFAULT '0',
  `sept` int(45) NOT NULL DEFAULT '0',
  `oct` int(45) NOT NULL DEFAULT '0',
  `nov` int(45) NOT NULL DEFAULT '0',
  `decm` int(45) NOT NULL DEFAULT '0',
  UNIQUE KEY `leave_type_UNIQUE` (`leave_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_total`
--

INSERT INTO `leave_total` (`leave_type`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`) VALUES
('Cassual Leave', 8, 8, 8, 5, 15, 4, 8, 8, 6, 6, 15, 6),
('Convention Leave', 7, 4, 6, 61, 6, 3, 8, 5, 12, 5, 12, 4),
('Sick Leave', 15, 51, 6, 32, 2, 1, 14, 33, 11, 5, 3, 5),
('Vacation Leave', 2, 2, 21, 12, 16, 8, 2, 2, 4, 6, 10, 8);

-- --------------------------------------------------------

--
-- Table structure for table `leave_vacation`
--

DROP TABLE IF EXISTS `leave_vacation`;
CREATE TABLE IF NOT EXISTS `leave_vacation` (
  `emp_id_vac` varchar(45) NOT NULL,
  `jan` int(45) DEFAULT '0',
  `feb` int(45) DEFAULT '0',
  `mar` int(45) DEFAULT '0',
  `apr` int(45) DEFAULT '0',
  `may` int(45) DEFAULT '0',
  `june` int(45) DEFAULT '0',
  `july` int(45) DEFAULT '0',
  `aug` int(45) DEFAULT '0',
  `sept` int(45) DEFAULT '0',
  `oct` int(45) DEFAULT '0',
  `nov` int(45) DEFAULT '0',
  `decm` int(45) DEFAULT '0',
  `total_vac` int(45) DEFAULT '0',
  KEY `emp_id_vac_idx` (`emp_id_vac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leave_vacation`
--

INSERT INTO `leave_vacation` (`emp_id_vac`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `oct`, `nov`, `decm`, `total_vac`) VALUES
('1001', 1, 1, 5, 3, 5, 4, 1, 1, 2, 3, 5, 4, 35),
('1002', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1003', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1004', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('1005', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('102', 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('103', 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0),
('104', 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('105', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('106', 1, 1, 5, 3, 5, 4, 1, 1, 2, 3, 5, 4, 35),
('107', 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('108', 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0),
('109', 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('110', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('111', 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('112', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

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
  `emp_id` varchar(45) DEFAULT NULL,
  `hrs_worked` varchar(45) DEFAULT NULL,
  `deductions` varchar(45) DEFAULT NULL,
  `netpay` varchar(45) DEFAULT NULL,
  KEY `emp_id_idx` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `payroll`
--

INSERT INTO `payroll` (`emp_id`, `hrs_worked`, `deductions`, `netpay`) VALUES
('102', '170', '100.0', '400.0'),
('103', '170', '150.0', '600.0'),
('104', '170', '250.0', '4600.0'),
('105', '170', '180.0', '5450.0'),
('106', '170', '214.0', '4800.0'),
('107', '170', '100.0', '5900.0'),
('108', '170', '150.0', '6100.0'),
('109', '170', '250.0', '4600.0'),
('110', '170', '180.0', '5450.0'),
('111', '170', '250.0', '4600.0'),
('105', '170', '180.0', '4960.0'),
('1001', '208', '10050.0', '94950.0'),
('1002', '208', '6600.0', '99900.0'),
('1003', '208', '19702.0', '185898.0'),
('1004', '208', '11650.0', '2492850.0'),
('1005', '208', '18300.0', '304700.0');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE IF NOT EXISTS `salary` (
  `emp_id_salary` varchar(45) DEFAULT NULL,
  `salary` varchar(45) DEFAULT NULL,
  `baseryr` year(4) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  KEY `emp_id_idx` (`emp_id_salary`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`emp_id_salary`, `salary`, `baseryr`, `note`) VALUES
('102', '685', 2018, 'Nice'),
('103', '600', 2018, 'Nice'),
('104', '180', 2017, 'Nice'),
('105', '320', 2017, 'Nice'),
('106', '1014', 2018, 'Nice'),
('107', '685', 2018, 'Nice'),
('108', '600', 2018, 'Nice'),
('109', '180', 2017, 'Nice'),
('110', '320', 2017, 'Nice'),
('111', '685', 2018, 'Nice'),
('112', '600', 2018, 'Nice'),
('1001', '100000', 2015, 'Nice'),
('1002', '105000', 2015, 'Nice'),
('1003', '200000', 2012, 'Nice'),
('1004', '2500000', 2011, 'Nice'),
('1005', '315000', 2008, 'Nice');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bonus`
--
ALTER TABLE `bonus`
  ADD CONSTRAINT `emp_id_bonus` FOREIGN KEY (`emp_id_bonus`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hourly`
--
ALTER TABLE `hourly`
  ADD CONSTRAINT `emp_id_hr` FOREIGN KEY (`emp_id_hr`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
