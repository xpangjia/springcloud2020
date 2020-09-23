use `cloud2020`;

DROP TABLE IF EXISTS `payment`;


CREATE TABLE `payment` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`serial` VARCHAR(200) DEFAULT '',
	PRIMARY KEY (`id`)
) ENGINE=INNODB	AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT into `payment`(`id`, `serial`) VALUES(1,'Lee'),(2,'alibaba'),(3,'JD');