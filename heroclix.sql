-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-09-2016 a las 18:41:45
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `heroclix`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `figura`
--

CREATE TABLE `figura` (
  `id` int(3) NOT NULL,
  `expansion` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `figura`
--

INSERT INTO `figura` (`id`, `expansion`, `nombre`, `estado`, `username`) VALUES
(1, 'Superman vs Batman', 'Batman', 'No la tengo', 'Israel'),
(2, 'Superman vs Batman', 'Superman', 'No la tengo', 'Israel'),
(3, 'Superman vs Batman', 'Wonderwoman', 'No la tengo', 'Israel'),
(4, 'Superman vs Batman', 'Aquaman', 'No la tengo', 'Israel'),
(5, 'Superman vs Batman', 'Mercy Graves', 'No la tengo', 'Israel'),
(6, 'Superman vs Batman', 'Lex Luthor', 'No la tengo', 'Israel'),
(7, 'X-Men Age of Apocalypse', 'Cyclops', 'No la tengo', 'David'),
(8, 'X-Men Age of Apocalypse', 'Jean Grey', 'No la tengo', 'David'),
(9, 'X-Men Age of Apocalypse', 'Angel', 'No la tengo', 'David'),
(10, 'X-Men Age of Apocalypse', 'Beast', 'No la tengo', 'David'),
(11, 'X-Men Age of Apocalypse', 'Ice-man', 'No la tengo', 'David'),
(12, 'X-Men Age of Apocalypse', 'X-23', 'No la tengo', 'David');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `person`
--

INSERT INTO `person` (`id`, `email`, `username`, `password`) VALUES
(1, 'israel@clix.com', 'Israel', 'Israel'),
(2, 'david@clix.com', 'David', 'David'),
(1, 'israel@clix.com', 'Israel', 'Israel'),
(2, 'david@clix.com', 'David', 'David');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `figura`
--
ALTER TABLE `figura`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
