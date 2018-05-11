DROP TABLE IF EXISTS `leave_details`;
CREATE TABLE `leave_details` (
  `leave_id` varchar(45) NOT NULL,
  `emp_id_leave` varchar(45) DEFAULT NULL,
  `leave_type` varchar(45) DEFAULT NULL,
  `starting_leave` date DEFAULT NULL,
  `ending_leave` date DEFAULT NULL,
  `balance_leave` varchar(45) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `total_leave` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`leave_id`),
  KEY `emp_id_leave_idx` (`emp_id_leave`),
  CONSTRAINT `emp_id_leave` FOREIGN KEY (`emp_id_leave`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `leave_details` WRITE;
INSERT INTO `leave_details` VALUES ('l1001','1001','Sick Leave','2015-10-21','2015-10-22','50','please Grant Leave','2'),('l1002','1002','Sick Leave','2015-10-21','2015-10-22','50','please Grant Leave','2'),('l1003','1003','Sick Leave','2015-10-21','2015-10-22','50','please Grant Leave','2'),('l1004','1004','Sick Leave','2015-10-21','2015-10-22','50','please Grant Leave','2'),('l1005','1005','Sick Leave','2015-10-21','2015-10-22','50','please Grant Leave','2');
UNLOCK TABLES;