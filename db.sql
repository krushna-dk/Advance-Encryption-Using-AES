CREATE DATABASE  IF NOT EXISTS `advance_file_security_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `advance_file_security_system`;
-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: advance_file_security_system
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `decryption_info`
--

DROP TABLE IF EXISTS `decryption_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `decryption_info` (
  `username` varchar(45) DEFAULT NULL,
  `date_time` varchar(45) NOT NULL,
  `dec_filename` varchar(45) DEFAULT NULL,
  `fkey` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`date_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `decryption_info`
--

LOCK TABLES `decryption_info` WRITE;
/*!40000 ALTER TABLE `decryption_info` DISABLE KEYS */;
INSERT INTO `decryption_info` VALUES ('krish','09:12:2025 03:21:03','dec_notes.pdf','1234'),('krish','09:12:2025 03:29:00','dec_song.m4a','1212'),('krish','09:12:2025 03:32:11','dec_song.m4a','1212'),('krish','09:12:2025 03:33:12','dec_notes.pdf','1234'),('krish','09:12:2025 03:43:21','dec_textFile.txt','1234');
/*!40000 ALTER TABLE `decryption_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encryption_info`
--

DROP TABLE IF EXISTS `encryption_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encryption_info` (
  `username` varchar(45) DEFAULT NULL,
  `date_time` varchar(45) NOT NULL,
  `enc_filename` varchar(100) DEFAULT NULL,
  `fkey` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`date_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encryption_info`
--

LOCK TABLES `encryption_info` WRITE;
/*!40000 ALTER TABLE `encryption_info` DISABLE KEYS */;
INSERT INTO `encryption_info` VALUES ('krish','09:12:2025 03:24:54','enc_song.m4a','1212'),('krish','09:12:2025 03:40:51','enc_textFile.txt','1234'),('krish','09:12:2025 11:57:41','enc_notes.pdf','1234');
/*!40000 ALTER TABLE `encryption_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_info` (
  `name` varchar(45) DEFAULT NULL,
  `mobile_no` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES ('Krishna Govind Dahiphale','9823611815','krishnadahiphale@gmail.com','krish','12345678');
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-09 17:02:44
