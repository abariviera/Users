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

INSERT INTO `users` (`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES ('abariviera','1234',1, NOW(),'Ana Caroline','Bariviera','ana.bariviera@gmail.com','(45)9922-2488');
INSERT INTO `users` (`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES ('lguarezzi','1234',0, NOW(),'Luiz Ricardo','Guarezzi','lguarezzi@gmail.com','(48)9999-9999');
INSERT INTO `users` (`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES ('smaria','1234',1,NOW(),'Maria','Souza','maria@gmail.com','(48)9999-9999');
INSERT INTO `users` (`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES ('sjose','1234',0,NOW(),'José','Silva','jose@gmail.com','(48)9999-9999');
INSERT INTO `users` (`username`,`password`,`is_enabled`,`register_date`,`name`,`surname`,`email`,`phone`) VALUES ('spaulo','1234',1,NOW(),'Paulo','Da Silva','paulo@gmail.com','(48)9999-9999');
