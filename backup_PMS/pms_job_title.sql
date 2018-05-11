DROP TABLE IF EXISTS `job_title`;
CREATE TABLE `job_title` (
  `job_id` varchar(10) NOT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  `job_desc` varchar(45) DEFAULT NULL,
  `emp_id_job` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`job_id`),
  KEY `emp_id_idx` (`emp_id_job`),
  CONSTRAINT `emp_id_job` FOREIGN KEY (`emp_id_job`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `job_title` WRITE;
INSERT INTO `job_title` VALUES ('jt1001','S/W Dev','Good','1001'),('jt1002','S/W Dev','Good	','1002'),('jt1003','S/W Dev','Good	','1003'),('jt1004','S/W Dev','Good	','1004'),('jt1005','S/W Dev','Good	','1005');
UNLOCK TABLES;