DROP TABLE IF EXISTS `payroll`;
CREATE TABLE `payroll` (
  `payroll_id` varchar(10) NOT NULL DEFAULT '1001',
  `emp_id` varchar(45) DEFAULT NULL,
  `hrs_worked` varchar(45) DEFAULT NULL,
  `deductions` varchar(45) DEFAULT NULL,
  `netpay` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`payroll_id`),
  KEY `emp_id_idx` (`emp_id`),
  CONSTRAINT `emp_id` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `payroll` WRITE;
INSERT INTO `payroll` VALUES ('p1001','1001','208','10050.0','94950.0'),('p1002','1002','208','6600.0','99900.0'),('p1003','1003','208','19702.0','185898.0'),('p1004','1004','208','11650.0','2492850.0'),('p1005','1005','208','18300.0','304700.0');
UNLOCK TABLES;