DROP TABLE IF EXISTS `deduction`;
CREATE TABLE `deduction` (
  `deduct_id` varchar(10) NOT NULL,
  `emp_id_deduct` varchar(45) DEFAULT NULL,
  `amount` int(10) DEFAULT '0',
  `pf` varchar(45) DEFAULT '0',
  `gpf` varchar(45) DEFAULT '0',
  `it` varchar(45) DEFAULT '0',
  `loan` varchar(45) DEFAULT '0',
  `insurance` varchar(45) DEFAULT '0',
  PRIMARY KEY (`deduct_id`),
  KEY `emp_id_deduct_idx` (`emp_id_deduct`),
  CONSTRAINT `emp_id_deduct` FOREIGN KEY (`emp_id_deduct`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `deduction` WRITE;
INSERT INTO `deduction` VALUES ('d1001','1001',10050,'2500','1400','2850','1500','1800'),('d1002','1002',6600,'1500','100','500','2000','2500'),('d1003','1003',19702,'1900','6500','4800','1400','5102'),('d1004','1004',11650,'4500','1450','2500','1400','1800'),('d1005','1005',18300,'7800','4500','2500','1500','2000');
UNLOCK TABLES;