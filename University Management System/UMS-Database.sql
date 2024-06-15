CREATE DATABASE  IF NOT EXISTS `universitymanagementsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `universitymanagementsystem`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: universitymanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `collegefee`
--

DROP TABLE IF EXISTS `collegefee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `collegefee` (
  `rollno` varchar(20) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `branch` varchar(20) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `total` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collegefee`
--

LOCK TABLES `collegefee` WRITE;
/*!40000 ALTER TABLE `collegefee` DISABLE KEYS */;
INSERT INTO `collegefee` VALUES ('12108526','BTech','Computer Science','Semester1','84000'),('12103024','BTech','Computer Science','Semester1','84000'),('12108526','BTech','Computer Science','Semester2',''),('12103024','BTech','Computer Science','Semester1','84000');
/*!40000 ALTER TABLE `collegefee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee`
--

DROP TABLE IF EXISTS `fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fee` (
  `course` varchar(20) DEFAULT NULL,
  `semester1` varchar(20) DEFAULT NULL,
  `semester2` varchar(20) DEFAULT NULL,
  `semester3` varchar(20) DEFAULT NULL,
  `semester4` varchar(20) DEFAULT NULL,
  `semester5` varchar(20) DEFAULT NULL,
  `semester6` varchar(20) DEFAULT NULL,
  `semester7` varchar(20) DEFAULT NULL,
  `semester8` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee`
--

LOCK TABLES `fee` WRITE;
/*!40000 ALTER TABLE `fee` DISABLE KEYS */;
INSERT INTO `fee` VALUES ('BTech','84000','84000','84000','84000','84000','84000','84000','84000'),('BSc','40000','40000','40000','40000','40000','40000','',''),('BBA','34000','34000','34000','34000','34000','34000','',''),('MTech','55000','55000','55000','55000','','','',''),('MSc','47500','47500','47500','47500','','','',''),('BCA','42000','42000','42000','42000','','','',''),('Bcom','22000','22000','22000','22000','22000','22000','',''),('Mcom','32000','32000','32000','32000','','','',''),('MBA','72000','72000','72000','72000','72000','72000','','');
/*!40000 ALTER TABLE `fee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('admin','12345'),('admin','12345');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `rollno` varchar(20) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `marks1` varchar(50) DEFAULT NULL,
  `marks2` varchar(50) DEFAULT NULL,
  `marks3` varchar(50) DEFAULT NULL,
  `marks4` varchar(50) DEFAULT NULL,
  `marks5` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES ('12108526','1st Semester','58','87','91','75','78');
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `name` varchar(40) DEFAULT NULL,
  `fname` varchar(40) DEFAULT NULL,
  `rollno` varchar(20) DEFAULT NULL,
  `dob` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `class_x` varchar(20) DEFAULT NULL,
  `class_xii` varchar(20) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `course` varchar(40) DEFAULT NULL,
  `branch` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('Aditya','Prahlad','12108526','31-Aug-2003','Patna','6205950894','myself.adityaanand@gmail.com','80','80','999999999999','B.Tech','Computer Science'),('Anand','Prasad','12103024','26-Feb-2000','Kankarbagh, Patna','6205950894','myself.adityaananxkcvsd@gmail.com','90','90','879423647238','B.Tech','Computer Science');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentleave`
--

DROP TABLE IF EXISTS `studentleave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentleave` (
  `rollno` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `duration` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentleave`
--

LOCK TABLES `studentleave` WRITE;
/*!40000 ALTER TABLE `studentleave` DISABLE KEYS */;
INSERT INTO `studentleave` VALUES ('12108526','23-Jun-2023','Half Day');
/*!40000 ALTER TABLE `studentleave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `rollno` varchar(20) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `subject1` varchar(50) DEFAULT NULL,
  `subject2` varchar(50) DEFAULT NULL,
  `subject3` varchar(50) DEFAULT NULL,
  `subject4` varchar(50) DEFAULT NULL,
  `subject5` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('12108526','1st Semester','CSE211','CSE408','CSE325','INT404','PEA305');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `name` varchar(40) DEFAULT NULL,
  `fname` varchar(40) DEFAULT NULL,
  `empId` varchar(20) DEFAULT NULL,
  `dob` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `class_x` varchar(20) DEFAULT NULL,
  `class_xii` varchar(20) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `education` varchar(40) DEFAULT NULL,
  `department` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('Aman Sharma','Sharma','16338','01-Jun-2023','Jalandhar Punjab','1234567875','aman@gmail.com','90','90','999999999999','B.Tech','Computer Science'),('pal','singh','17257','08-Jun-2023','jalandhar','9733278322','sd@gmail.comsdjvjv','98','92','987654321023','B.Tech','Civil'),('aditya','aannd','13100','12-Sept-2023','sjdjs','2345678901','kgzvc@gmail.com','23','90123456789009','123456789098','B.Tech','Computer Science'),('','','19898','','','','','','','','B.Tech','Computer Science');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherleave`
--

DROP TABLE IF EXISTS `teacherleave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacherleave` (
  `empid` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `duration` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherleave`
--

LOCK TABLES `teacherleave` WRITE;
/*!40000 ALTER TABLE `teacherleave` DISABLE KEYS */;
INSERT INTO `teacherleave` VALUES ('16338','13-Jun-2023','Full Day'),('16338','17-Sept-2023','Full Day');
/*!40000 ALTER TABLE `teacherleave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-16  0:58:07
