DROP TABLE IF EXISTS `leave_total`;
CREATE TABLE `leave_total` (
  `leave_type` varchar(45) NOT NULL,
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
  UNIQUE KEY `leave_type_UNIQUE` (`leave_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `leave_total` WRITE;
INSERT INTO `leave_total` VALUES ('Cassual Leave','8','8','8','5','15','4','8','8','6','6','15','6'),('Convention Leave','7','4','6','61','6','3','8','5','12','5','12','4'),('Sick Leave','15','51','6','32','2','1','14','33','11','5','3','5'),('Vacation Leave','3','3','2','4','6','5','3','3','1','4','46','9');
UNLOCK TABLES;