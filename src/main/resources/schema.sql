DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `is_enabled` tinyint(4) NOT NULL,
  `register_date` datetime NOT NULL,
  `name` varchar(40) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idusers_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users` (`id`,`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES (1,'abariviera','1234',1,'2017-05-21 03:16:53','Ana Caroline','Bariviera','ana.bariviera@gmail.com','(45)9922-2488');
INSERT INTO `users` (`id`,`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES (2,'lguarezzi','1234',0,'2017-05-21 03:16:54','Luiz Ricardo','Guarezzi','lguarezzi@gmail.com','(48)9999-9999');