DROP TABLE IF EXISTS card;

CREATE TABLE `card` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `type` varchar(10) NOT NULL
);

INSERT INTO `card` (`id`,`type`) VALUES (1,'MASTER');
INSERT INTO `card` (`id`,`type`) VALUES (2,'VISA');
INSERT INTO `card` (`id`,`type`) VALUES (3,'RUPAY');