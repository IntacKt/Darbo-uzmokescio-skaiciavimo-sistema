DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `salary_id` varchar(10) NOT NULL,
  `emp_id_salary` varchar(45) DEFAULT NULL,
  `salary` varchar(45) DEFAULT NULL,
  `baseryr` year(4) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`salary_id`),
  KEY `emp_id_idx` (`emp_id_salary`),
  CONSTRAINT `emp_id_salary` FOREIGN KEY (`emp_id_salary`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `salary` WRITE;
INSERT INTO `salary` VALUES ('s1001','1001','100000',2015,'Nice'),('s1002','1002','105000',2015,'Nice'),('s1003','1003','200000',2012,'Nice'),('s1004','1004','2500000',2011,'Nice'),('s1005','1005','315000',2008,'Nice');
UNLOCK TABLES;