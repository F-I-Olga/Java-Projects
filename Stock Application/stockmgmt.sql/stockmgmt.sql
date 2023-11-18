-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2023 at 12:20 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


--
-- Database: `stockmgmt`
--

CREATE DATABASE `stockmgmt`; 

-- --------------------------------------------------------

--
-- Table structure for table `acthistory`
--

CREATE TABLE `acthistory` (
  `PrdtID` int(25) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `ProductID` int(25) NOT NULL,
  `PrdtName` varchar(255) NOT NULL,
  `PrdtPrice` int(30) NOT NULL,
  `QtyEntered` int(200) NOT NULL,
  `QtyIn` int(200) DEFAULT NULL,
  `QtyOut` int(200) DEFAULT NULL,
  `Notes` text DEFAULT NULL,
  `TimeStamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acthistory`
--

INSERT INTO `acthistory` (`PrdtID`, `Status`, `ProductID`, `PrdtName`, `PrdtPrice`, `QtyEntered`, `QtyIn`, `QtyOut`, `Notes`, `TimeStamp`) VALUES
(56, 'New Product', 2, 'Testing', 1500, 50, 50, NULL, 'New product created!', '2023-11-09 03:06:56'),
(57, 'New Product', 3, 'Testing1', 350, 23, 23, NULL, 'New product created!', '2023-11-09 03:16:28'),
(58, 'Product Update', 3, 'Testing10', 350, 23, NULL, NULL, 'Testing10 Updated!', '2023-11-09 03:45:22'),
(59, 'Product Update', 3, 'Testing1', 350, 23, NULL, NULL, 'Testing1 Updated!', '2023-11-09 03:46:04'),
(60, 'Product Update', 2, 'Testing', 1500, 50, NULL, NULL, 'Testing Updated!', '2023-11-09 04:02:27'),
(61, 'New Product', 4, 'Testing2', 5700, 44, 44, NULL, 'New product created!', '2023-11-10 02:39:05'),
(62, 'New Product', 5, 'Testing3', 680, 254, 254, NULL, 'New product created!', '2023-11-10 02:39:20'),
(63, 'New Product', 6, 'Testing4', 10000, 70, 70, NULL, 'New product created!', '2023-11-10 02:39:53'),
(64, 'Product Update', 1, 'Test', 0, 0, NULL, NULL, 'Test Updated!', '2023-11-10 02:40:16'),
(65, 'Sale', 3, 'Testing1', 890, 13, NULL, 10, 'Testing function Previous Total Stock = 23, New Stock Total = 10', '2023-11-11 22:48:29'),
(66, 'Purchase', 2, 'Testing', 1500, 100, NULL, 150, 'Purchase Test Previous Total Stock = 50, New Stock Total = 150', '2023-11-11 23:44:58'),
(67, 'New Product', 7, 'Bic', 100, 5480, 5480, NULL, 'New product created!', '2023-11-12 00:09:55'),
(68, 'New Product', 8, 'Pencil', 50, 873, 873, NULL, 'New product created!', '2023-11-12 00:10:17'),
(69, 'New Product', 9, 'Gomme', 50, 44, 44, NULL, 'New product created!', '2023-11-12 00:10:35'),
(70, 'New Product', 10, 'School Bag', 5000, 16, 16, NULL, 'New product created!', '2023-11-12 00:11:07'),
(71, 'New Product', 11, 'A3 Paper', 100, 500, 500, NULL, 'New product created!', '2023-11-12 00:35:51'),
(72, 'New Product', 12, 'A4 Ream', 3000, 54, 54, NULL, 'New product created!', '2023-11-12 01:43:11'),
(73, 'Product Update', 3, 'Envelope A4', 350, 10, NULL, NULL, 'Envelope A4 Updated!', '2023-11-12 01:45:51'),
(74, 'New Product', 13, 'Cartouche ', 10000, 89, 89, NULL, 'New product created!', '2023-11-12 23:08:12'),
(75, 'Purchase', 12, 'A4 Ream', 10000, 100, NULL, 154, ' Previous Total Stock = 54, New Stock Total = 154', '2023-11-12 23:08:50'),
(76, 'New Product', 14, 'Toner', 18000, 60, 60, NULL, 'New product created!', '2023-11-12 23:12:36'),
(77, 'Sale', 14, 'Toner', 18000, 5, NULL, 55, ' Previous Total Stock = 60, New Stock Total = 55', '2023-11-12 23:13:08');

-- --------------------------------------------------------

--
-- Table structure for table `prdtline`
--

CREATE TABLE `prdtline` (
  `ProductID` int(25) NOT NULL,
  `ProductName` varchar(255) NOT NULL,
  `CurrentStock` int(200) NOT NULL,
  `Price` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prdtline`
--

INSERT INTO `prdtline` (`ProductID`, `ProductName`, `CurrentStock`, `Price`) VALUES
(1, 'Test', 0, 0),
(2, 'Testing', 150, 1500),
(3, 'Envelope A4', 10, 350),
(4, 'Testing2', 44, 5700),
(5, 'Testing3', 254, 680),
(6, 'Testing4', 70, 10000),
(7, 'Bic', 5480, 100),
(8, 'Pencil', 873, 50),
(9, 'Gomme', 44, 50),
(10, 'School Bag', 16, 5000),
(11, 'A3 Paper', 500, 100),
(12, 'A4 Ream', 154, 3000),
(13, 'Cartouche ', 89, 10000),
(14, 'Toner', 55, 18000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acthistory`
--
ALTER TABLE `acthistory`
  ADD PRIMARY KEY (`PrdtID`),
  ADD KEY `PrdtIDForeign` (`ProductID`);

--
-- Indexes for table `prdtline`
--
ALTER TABLE `prdtline`
  ADD PRIMARY KEY (`ProductID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acthistory`
--
ALTER TABLE `acthistory`
  MODIFY `PrdtID` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `acthistory`
--
ALTER TABLE `acthistory`
  ADD CONSTRAINT `PrdtIDForeign` FOREIGN KEY (`ProductID`) REFERENCES `prdtline` (`ProductID`);
COMMIT;

