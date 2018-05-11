DROP TABLE IF EXISTS `bonus`;
CREATE TABLE `bonus` (
  `bonus_id` varchar(45) NOT NULL,
  `emp_id_bonus` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `bonus_payment` varchar(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `bonus_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bonus_id`),
  KEY `emp_id_bonus_idx` (`emp_id_bonus`),
  CONSTRAINT `emp_id_bonus` FOREIGN KEY (`emp_id_bonus`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
LOCK TABLES `bonus` WRITE;
INSERT INTO `bonus` VALUES INSERT INTO `bonus` VALUES ('101b','101','2017-05-05','100','very good job','special'),('102b','102',
'2017-06-09','150','nice job','special'),('103b','103','2017-03-10','50','for working hard','annual'),
('104b','104','2018-01-01','88','good','special'),('105b','105','2018-02-02','99','nice','special'),
('106b', '106', '2018-03-03', '77', 'perfect', 'annual'), ('107b','107','2017-05-04','100','very good job','special'),
('108b','108','2017-05-05','150','nice job','special'),('109b','109','2017-03-11','50','for working hard','annual'),
('110b','110','2018-01-02','88','good','special'),('111b','111','2018-02-03','99','nice','special'),
('112b','112','2018-03-04','77','perfect','annual');
UNLOCK TABLES;