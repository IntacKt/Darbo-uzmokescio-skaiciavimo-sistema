DROP TABLE IF EXISTS `leave_sick`;
CREATE TABLE `leave_sick` (
  `emp_id_sick` varchar(45) NOT NULL,
  `jan` varchar(45) DEFAULT '0',
  `feb` varchar(45) DEFAULT '0',
  `mar` varchar(45) DEFAULT '0',
  `april` varchar(45) DEFAULT '0',
  `may` varchar(45) DEFAULT '0',
  `june` varchar(45) DEFAULT '0',
  `july` varchar(45) DEFAULT '0',
  `aug` varchar(45) DEFAULT '0',
  `sept` varchar(45) DEFAULT '0',
  `oct` varchar(45) DEFAULT '0',
  `nov` varchar(45) DEFAULT '0',
  `decm` varchar(45) DEFAULT '0',
  `total_sick` varchar(45) NOT NULL DEFAULT '0',
  KEY `emp_id_sick_idx` (`emp_id_sick`),
  CONSTRAINT `emp_id_sick` FOREIGN KEY (`emp_id_sick`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `leave_sick` WRITE;
INSERT INTO `leave_sick` VALUES ('1001','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1002','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1003','1','1','11','1','3','3','1','11','1','13','3','2','51'),('1004','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1005','5','3','3','3','0','1','1','2','3','2','12','1','36');
UNLOCK TABLES;