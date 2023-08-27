-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: fkart
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `ek_product`
--

DROP TABLE IF EXISTS `ek_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ek_product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `vendor_id` int DEFAULT NULL,
  `estimated_time` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `vendor_id` (`vendor_id`),
  CONSTRAINT `ek_product_ibfk_1` FOREIGN KEY (`vendor_id`) REFERENCES `ek_vendor` (`vendor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ek_product`
--

LOCK TABLES `ek_product` WRITE;
/*!40000 ALTER TABLE `ek_product` DISABLE KEYS */;
INSERT INTO `ek_product` VALUES (1,'Khasta Kachori','With Red & Green Chutney',1e21,100,'../assets/foodimages/kachori.jpg',1,'2023-08-10 00:15:00.000000'),(2,'Tasty Poha','Hot and Spicy Masala Poha',25,10,'../assets/foodimages/poha.webp',1,'2023-08-10 00:10:00.000000'),(3,'South Style Idli','With Sambhar & Chutney',35,50,'../assets/foodimages/idli.jpg',1,'2023-08-10 00:20:00.000000'),(4,'Gujarat Famous Dhokla','With green Chilli & Chutney',30,20,'../assets/foodimages/dhokla.jpg',1,'2023-08-10 00:30:00.000000'),(5,'South-Indian Dosa','With Sambhar & Chutney',55,100,'../assets/foodimages/dosa.webp',1,'2023-08-10 00:30:00.000000'),(6,'Mendu Wada','With Sambhar',40,25,'../assets/foodimages/wada.jpg',1,'2023-08-10 00:10:00.000000'),(7,'Mini Thali','Roti, Rice, Two Sabzi',55,100,'../assets/foodimages/thali.webp',1,'2023-08-10 00:15:00.000000'),(8,'Thali','Roti,Rice,Paneer,1 Sabzi',75,100,'../assets/foodimages/thalibig.webp',1,'2023-08-10 00:15:00.000000'),(9,'Chawmein','Hot and Spicy',50,50,'../assets/foodimages/chawmein.jpg',1,'2023-08-10 00:10:00.000000'),(10,'Pasta','Yummy Italian Pasta',50,70,'../assets/foodimages/pasta.jpg',1,'2023-08-10 00:10:00.000000'),(11,'Aloo paratha','with achar & chutney',45,50,'../assets/foodimages/tms-aloo-paratha.jpg',2,'2023-08-10 00:20:00.000000'),(12,'poha','special peanut poha',28,50,'../assets/foodimages/tms-poha.jpg',2,'2023-08-10 00:05:00.000000'),(13,'Idli Sambhar','special south-indian Idli',40,100,'../assets/foodimages/tms-idli.jpg',2,'2023-08-10 00:10:00.000000'),(14,'Mini Thali','Roti, Rice, One Sabzi',58,100,'../assets/foodimages/tms-thali.jpg',2,'2023-08-10 00:10:00.000000'),(15,'Chicken Biryani','Tasty and spicy',110,100,'../assets/foodimages/tms-chicken-biryani.jpg',2,'2023-08-10 00:10:00.000000');
/*!40000 ALTER TABLE `ek_product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-27 23:31:33
