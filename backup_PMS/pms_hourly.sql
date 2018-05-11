DROP TABLE IF EXISTS `hourly`;
CREATE TABLE `hourly` (
  `hr_id` varchar(10) NOT NULL,
  `emp_id_hr` varchar(45) DEFAULT NULL,
  `hr_rate` int(10) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`hr_id`),
  KEY `emp_id_hr_idx` (`emp_id_hr`),
  CONSTRAINT `emp_id_hr` FOREIGN KEY (`emp_id_hr`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `hourly` WRITE;
INSERT INTO `hourly` VALUES ('hr1001','1001',1000,'Good'),('hr1002','1002',1250,'Good'),('hr1003','1003',750,'Good'),('hr1004','1004',1500,'Good'),('hr1005','1005',1650,'Good');
UNLOCK TABLES;