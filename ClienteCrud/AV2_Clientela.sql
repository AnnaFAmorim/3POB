-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 04/07/2024 às 14:47
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `Clientela`
--
CREATE DATABASE IF NOT EXISTS `Clientela` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `Clientela`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Clientes`
--

CREATE TABLE `Clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cep` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `Clientes`
--
ALTER TABLE `Clientes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `Clientes`
--
ALTER TABLE `Clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

INSERT INTO `Clientes` (`nome`, `cpf`, `email`, `endereco`, `cep`) VALUES
('Abraão Sarmiento', '123456', 'asarmiento@gmail.com', 'rua clarimundo de melo', '20000000'),
('Alcides Soeiro', '789456', 'soeiro@gmail.com', 'rua clarimundo de melo', '20000000'),
('Adosindo Cascais', '456125', 'cascais@gmail.com', 'rua clarimundo de melo', '20000000'),
('Adriano Semedo', '124578', 'semedo@gmail.com', 'rua clarimundo de melo', '20000000')

SELECT `id`, `nome`, `cpf`, `email`, `endereco`, `cep`
FROM `Clientes`

SELECT `id`, `nome`, `cpf`, `email`, `endereco`, `cep`
FROM `Clientes`
where `id` = 5

UPDATE `Clientes` SET `endereco` = 'rua clarimundo de melo 857' where `id`= 3

DELETE `Clientes` where ìd`= 4


