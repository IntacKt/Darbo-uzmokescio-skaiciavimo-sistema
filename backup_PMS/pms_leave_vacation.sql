DROP TABLE IF EXISTS `leave_vacation`;
CREATE TABLE `leave_vacation` (
  `emp_id_vac` varchar(45) NOT NULL,
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
  `total_vac` varchar(45) DEFAULT '0',
  KEY `emp_id_vac_idx` (`emp_id_vac`),
  CONSTRAINT `emp_id_vac` FOREIGN KEY (`emp_id_vac`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `leave_vacation` WRITE;
INSERT INTO `leave_vacation` VALUES ('1001','1','01','05','03','05','04','01','01','02','03','05','04','35'),('1002','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1003','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1004','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1005','0','0','0','0','0','0','0','0','0','0','0','0','0');
UNLOCK TABLES;