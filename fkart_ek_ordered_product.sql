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
-- Table structure for table `ek_ordered_product`
--

DROP TABLE IF EXISTS `ek_ordered_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ek_ordered_product` (
  `ordered_product_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  PRIMARY KEY (`ordered_product_id`),
  KEY `FK8rv1valrstl0f4g299qlu05x4` (`order_id`),
  CONSTRAINT `FK8rv1valrstl0f4g299qlu05x4` FOREIGN KEY (`order_id`) REFERENCES `ek_order` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=185 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ek_ordered_product`
--

LOCK TABLES `ek_ordered_product` WRITE;
/*!40000 ALTER TABLE `ek_ordered_product` DISABLE KEYS */;
INSERT INTO `ek_ordered_product` VALUES (1,10,'Poha',1,52),(2,20,'Burger',2,52),(3,10,'Biscuit',2,52),(4,10,'Poha',1,53),(5,20,'Burger',2,53),(6,10,'Biscuit',2,53),(7,12,'Pasta-2',1,54),(8,13,'Thali-2',1,54),(9,3,'South Style Idli',1,55),(10,4,'Gujarat Famous Dhokla',1,55),(11,5,'South-Indian Dosa',1,55),(12,3,'South Style Idli',1,56),(13,4,'Gujarat Famous Dhokla',1,56),(14,3,'South Style Idli',1,57),(15,4,'Gujarat Famous Dhokla',1,57),(16,3,'South Style Idli',1,58),(17,4,'Gujarat Famous Dhokla',1,58),(18,10,'Poha',1,59),(19,20,'Burger',2,59),(20,10,'Biscuit',2,59),(21,3,'South Style Idli',1,60),(22,4,'Gujarat Famous Dhokla',1,60),(23,3,'South Style Idli',1,61),(24,4,'Gujarat Famous Dhokla',1,61),(25,3,'South Style Idli',1,62),(26,4,'Gujarat Famous Dhokla',1,62),(27,2,'Tasty Poha',1,63),(28,3,'South Style Idli',1,63),(29,4,'Gujarat Famous Dhokla',1,63),(30,10,'Poha',1,64),(31,20,'Burger',2,64),(32,10,'Biscuit',2,64),(33,2,'Tasty Poha',1,65),(34,3,'South Style Idli',1,65),(35,4,'Gujarat Famous Dhokla',1,65),(36,3,'South Style Idli',1,66),(37,4,'Gujarat Famous Dhokla',1,66),(38,3,'South Style Idli',1,67),(39,4,'Gujarat Famous Dhokla',1,67),(40,3,'South Style Idli',1,68),(41,4,'Gujarat Famous Dhokla',1,68),(42,3,'South Style Idli',1,69),(43,4,'Gujarat Famous Dhokla',1,69),(44,3,'South Style Idli',1,70),(45,4,'Gujarat Famous Dhokla',1,70),(46,3,'South Style Idli',1,71),(47,4,'Gujarat Famous Dhokla',1,71),(48,3,'South Style Idli',1,72),(49,4,'Gujarat Famous Dhokla',1,72),(50,3,'South Style Idli',1,73),(51,4,'Gujarat Famous Dhokla',1,73),(52,3,'South Style Idli',1,74),(53,4,'Gujarat Famous Dhokla',1,74),(54,2,'Tasty Poha',1,75),(55,3,'South Style Idli',1,75),(56,2,'Tasty Poha',1,76),(57,3,'South Style Idli',1,76),(58,3,'South Style Idli',1,77),(59,4,'Gujarat Famous Dhokla',1,77),(60,3,'South Style Idli',1,78),(61,4,'Gujarat Famous Dhokla',1,78),(62,3,'South Style Idli',1,79),(63,4,'Gujarat Famous Dhokla',1,79),(64,3,'South Style Idli',1,80),(65,4,'Gujarat Famous Dhokla',1,80),(66,5,'South-Indian Dosa',1,80),(67,3,'South Style Idli',1,81),(68,4,'Gujarat Famous Dhokla',1,81),(69,5,'South-Indian Dosa',1,81),(70,3,'South Style Idli',1,82),(71,4,'Gujarat Famous Dhokla',1,82),(72,5,'South-Indian Dosa',1,82),(73,2,'Tasty Poha',1,83),(74,3,'South Style Idli',1,83),(75,2,'Tasty Poha',1,84),(76,3,'South Style Idli',1,84),(77,10,'Poha',1,85),(78,20,'Burger',2,85),(79,10,'Biscuit',2,85),(80,2,'Tasty Poha',1,86),(81,3,'South Style Idli',1,86),(82,2,'Tasty Poha',1,87),(83,3,'South Style Idli',1,87),(84,13,'Idli Sambhar',1,88),(85,14,'Mini Thali',1,88),(86,4,'Gujarat Famous Dhokla',1,89),(87,5,'South-Indian Dosa',1,89),(88,13,'Idli Sambhar',1,90),(89,14,'Mini Thali',1,90),(90,13,'Idli Sambhar',1,91),(91,14,'Mini Thali',1,91),(92,3,'South Style Idli',1,92),(93,4,'Gujarat Famous Dhokla',1,92),(94,3,'South Style Idli',1,93),(95,4,'Gujarat Famous Dhokla',2,93),(96,5,'South-Indian Dosa',1,93),(97,3,'South Style Idli',1,94),(98,4,'Gujarat Famous Dhokla',2,94),(99,5,'South-Indian Dosa',1,94),(100,2,'Tasty Poha',1,95),(101,3,'South Style Idli',2,95),(102,2,'Tasty Poha',2,96),(103,3,'South Style Idli',2,96),(104,3,'South Style Idli',1,97),(105,4,'Gujarat Famous Dhokla',1,97),(106,2,'Tasty Poha',1,98),(107,3,'South Style Idli',1,98),(108,8,'Thali',1,98),(109,3,'South Style Idli',1,99),(110,4,'Gujarat Famous Dhokla',1,99),(111,9,'Chawmein',1,100),(112,10,'Pasta',1,100),(113,2,'Tasty Poha',1,101),(114,3,'South Style Idli',1,101),(115,2,'Tasty Poha',1,102),(116,3,'South Style Idli',1,102),(117,2,'Tasty Poha',1,103),(118,3,'South Style Idli',1,103),(119,2,'Tasty Poha',1,104),(120,3,'South Style Idli',1,104),(121,2,'Tasty Poha',1,105),(122,3,'South Style Idli',1,105),(123,2,'Tasty Poha',1,106),(124,3,'South Style Idli',1,106),(125,2,'Tasty Poha',1,107),(126,3,'South Style Idli',1,107),(127,2,'Tasty Poha',1,108),(128,3,'South Style Idli',1,108),(129,2,'Tasty Poha',1,109),(130,3,'South Style Idli',1,109),(131,2,'Tasty Poha',1,110),(132,3,'South Style Idli',1,110),(133,2,'Tasty Poha',1,111),(134,3,'South Style Idli',1,111),(135,3,'South Style Idli',1,112),(136,4,'Gujarat Famous Dhokla',1,112),(137,4,'Gujarat Famous Dhokla',1,113),(138,5,'South-Indian Dosa',1,113),(139,4,'Gujarat Famous Dhokla',1,114),(140,5,'South-Indian Dosa',1,114),(141,9,'Chawmein',1,115),(142,10,'Pasta',1,115),(143,3,'South Style Idli',1,116),(144,4,'Gujarat Famous Dhokla',1,116),(145,3,'South Style Idli',1,117),(146,4,'Gujarat Famous Dhokla',1,117),(147,3,'South Style Idli',1,118),(148,4,'Gujarat Famous Dhokla',1,118),(149,2,'Tasty Poha',1,119),(150,3,'South Style Idli',1,120),(151,3,'South Style Idli',1,121),(152,3,'South Style Idli',1,122),(153,3,'South Style Idli',1,123),(154,4,'Gujarat Famous Dhokla',2,123),(155,12,'poha',0,124),(156,13,'Idli Sambhar',0,124),(157,12,'poha',1,125),(158,13,'Idli Sambhar',2,125),(159,13,'Idli Sambhar',1,126),(160,14,'Mini Thali',1,126),(161,1,'Khasta Kachori',1,127),(162,13,'Idli Sambhar',1,128),(163,4,'Gujarat Famous Dhokla',3,129),(164,3,'South Style Idli',2,130),(165,4,'Gujarat Famous Dhokla',1,130),(166,3,'South Style Idli',2,131),(167,4,'Gujarat Famous Dhokla',1,131),(168,13,'Idli Sambhar',0,132),(169,14,'Mini Thali',0,132),(170,4,'Gujarat Famous Dhokla',1,133),(171,3,'South Style Idli',1,133),(172,2,'Tasty Poha',1,134),(173,3,'South Style Idli',2,134),(174,4,'Gujarat Famous Dhokla',1,135),(175,5,'South-Indian Dosa',1,135),(176,1,'Khasta Kachori',1,136),(177,2,'Tasty Poha',1,136),(178,1,'Khasta Kachori',1,137),(179,2,'Tasty Poha',1,137),(180,1,'Khasta Kachori',1,138),(181,2,'Tasty Poha',2,138),(182,2,'Tasty Poha',2,139),(183,3,'South Style Idli',1,139),(184,4,'Gujarat Famous Dhokla',1,139);
/*!40000 ALTER TABLE `ek_ordered_product` ENABLE KEYS */;
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
