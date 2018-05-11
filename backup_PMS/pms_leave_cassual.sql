DROP TABLE IF EXISTS `leave_cassual`;
CREATE TABLE `leave_cassual` (
  `emp_id_cas` varchar(45) NOT NULL,
  `jan` varchar(45) NOT NULL DEFAULT '0',
  `feb` varchar(45) NOT NULL DEFAULT '0',
  `mar` varchar(45) NOT NULL DEFAULT '0',
  `apr` varchar(45) NOT NULL DEFAULT '0',
  `may` varchar(45) NOT NULL DEFAULT '0',
  `june` varchar(45) NOT NULL DEFAULT '0',
  `july` varchar(45) NOT NULL DEFAULT '0',
  `aug` varchar(45) NOT NULL DEFAULT '0',
  `sept` varchar(45) NOT NULL DEFAULT '0',
  `oct` varchar(45) NOT NULL DEFAULT '0',
  `nov` varchar(45) NOT NULL DEFAULT '0',
  `decm` varchar(45) NOT NULL DEFAULT '0',
  `total_cas` varchar(45) NOT NULL DEFAULT '0',
  KEY `emp_id_cas_idx` (`emp_id_cas`),
  CONSTRAINT `emp_id_cas` FOREIGN KEY (`emp_id_cas`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `leave_cassual` WRITE;
INSERT INTO `leave_cassual` VALUES ('1001','1','1','1','1','1','1','11','0','1','1','1','1','22'),('1002','5','5','5','5','5','5','5','5','0','5','5','5','55'),('1003','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1004','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1005','0','0','0','0','0','0','0','0','0','0','0','0','0');
UNLOCK TABLES;