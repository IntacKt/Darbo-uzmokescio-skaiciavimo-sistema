DROP TABLE IF EXISTS `leave_convantion`;
CREATE TABLE `leave_convantion` (
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
  KEY `emp-id_con_idx` (`emp_id_con`),
  CONSTRAINT `emp-id_con` FOREIGN KEY (`emp_id_con`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `leave_convantion` WRITE;
INSERT INTO `leave_convantion` VALUES ('1001','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1002','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1003','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1004','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1005','0','0','0','0','0','0','0','0','0','0','0','0','0');
UNLOCK TABLES;