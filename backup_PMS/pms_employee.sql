DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
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
LOCK TABLES `employee` WRITE;
INSERT INTO `employee` VALUES ('1001','dt1001','jt1001','et1001','Shah','Vimox','1995-09-17','Male','India','Gujarat','Surat','Majuragate','395001','vmox@gmail.com','8866263371'),('1002','dt1002','jt1002','et1002','shah','Jay','1991-05-07','Male','India','Gujarat','Surat','Majuragate','395001','jay@gmail.com','9033228796'),('1003','dt1003','jt1003','et1003','skeet','jon','1987-01-12','Male','U.S','NY','NYC','palo alto','012456','jon@yahoo.com','5588964725'),('1004','dt1004','jt1004','et1004','sunder','pichai','1971-09-14','MAle','U.S','D.C','washington','Gplex','445566','picha@gmail.com','1324567890'),('1005','dt1005','jt1005','et1005','zuckerberg','mark','1984-05-14','Male','U.S ','D.C','palo alto','HQ,FB','889966','zuck@fb.com','2012458950');
UNLOCK TABLES;