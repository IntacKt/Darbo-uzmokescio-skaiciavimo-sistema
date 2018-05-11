DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `uname` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='			';
LOCK TABLES `login` WRITE;
INSERT INTO `login` VALUES ('123','123'),('admin','admin');
UNLOCK TABLES;