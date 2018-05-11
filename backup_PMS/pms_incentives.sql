DROP TABLE IF EXISTS `incentives`;
CREATE TABLE `incentives` (
  `emp_id_ins` varchar(45) NOT NULL,
  `hra` varchar(45) DEFAULT '0',
  `da` varchar(45) DEFAULT '0',
  `cca` varchar(45) DEFAULT '0',
  `ta` varchar(45) DEFAULT '0',
  `medical` varchar(45) DEFAULT '0',
  `total` varchar(45) DEFAULT NULL,
  KEY `emp_id_ins_idx` (`emp_id_ins`),
  CONSTRAINT `emp_id_ins` FOREIGN KEY (`emp_id_ins`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `incentives` WRITE;
INSERT INTO `incentives` VALUES ('1001','5000.0','1000.0','1000.0','1000.0','1000.0','9000.0'),('1002','5250.0','1050.0','1050.0','1050.0','1050.0','9450.0'),('1003','8000.0','14000.0','2000.0','2000.0','2000.0','28000.0'),('1004','100000.0','175000.0','100000.0','25000.0','25000.0','425000.0'),('1005','12600.0','3150.0','3150.0','3150.0','3150.0','25200.0');
UNLOCK TABLES;