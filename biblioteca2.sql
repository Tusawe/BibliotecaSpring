-- Adminer 4.7.3 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `libro`;
CREATE TABLE `libro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  `isbn` varchar(13) DEFAULT NULL,
  `titulo` varchar(50) NOT NULL,
  `editorial` varchar(35) NOT NULL,
  `n_paginas` int(11) NOT NULL,
  `usuario` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `libro_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `libro` (`id`, `id_usuario`, `isbn`, `titulo`, `editorial`, `n_paginas`, `usuario`) VALUES
(1,	2,	'123456789',	'Introduccion a React',	'Anaya',	200,	2),
(2,	3,	'987654321',	'Aprendiendo Spring',	'Edelvives',	150,	3),
(3,	1,	'12345678910',	'Mi primera App',	'Punto Rojo',	300,	1);

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dni` varchar(9) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `usuario` (`id`, `username`, `password`, `dni`, `nombre`, `apellido`, `email`) VALUES
(1,	'pepe',	'pepe123',	'11111111H',	'José',	'Gómez',	'pepe@gmail.com'),
(2,	'paco',	'paco123',	'22222222Y',	'Francisco',	'Pérez',	'paco@gmail.com'),
(3,	'juan',	'juan123',	'33333333J',	'Juan',	'López',	'juan@gmail.com');

-- 2020-02-21 11:54:38
