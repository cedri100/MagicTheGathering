-- MySQL dump 10.13  Distrib 5.7.19, for macos10.12 (x86_64)
--
-- Host: localhost    Database: magicthegathering
-- ------------------------------------------------------
-- Server version 5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Lands`
--


DROP TABLE IF EXISTS `Lands`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Lands` (
  `name` char(50) DEFAULT NULL,
  `set` char(50) DEFAULT NULL,
  `subtype` char(30) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lands`
--

LOCK TABLES `Lands` WRITE;
/*!40000 ALTER TABLE `Lands` DISABLE KEYS */;
INSERT INTO `Lands` VALUES ('Choked Estuary', 'Shadows over Innistrad', 'Island Swamp', 'Rare');
/*!40000 ALTER TABLE `Lands` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Artifacts`
--

DROP TABLE IF EXISTS `Artifacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Artifacts` (
  `name` char(20) DEFAULT NULL,
  `set` char(20) DEFAULT NULL,
  `cost` int(20) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Artifacts`
--

LOCK TABLES `Artifacts` WRITE;
/*!40000 ALTER TABLE `Artifacts` DISABLE KEYS */;
INSERT INTO `Artifacts` VALUES ('Brain in a Jar', 'Shadows over Innistrad', 2, 'Rare');
/*!40000 ALTER TABLE `Artifacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Creatures`
--

DROP TABLE IF EXISTS `Creatures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Creatures` (
  `name` char(20) DEFAULT NULL,
  `set` char(50) DEFAULT NULL,
  `subtype` char(20) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `power` int(11) DEFAULT NULL,
  `toughness` int(11) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Creatures`
--

LOCK TABLES `Creatures` WRITE;
/*!40000 ALTER TABLE `Creatures` DISABLE KEYS */;
INSERT INTO `Creatures` VALUES ('Abberant Researcher', 'Shadows over Innistrad', 'Human Insect', 4, 3, 2, 'Uncommon'), ('Accursed Witch', 'Shadows over Innistrad', 'Human Shaman', 4, 4, 2, 'Uncommon'), ('Altered Ego', 'Shadows over Innistrad', 'Shapeshifter', 4, 0, 0, 'Rare'), ('Angel of Deliverance', 'Shadows over Innistrad', 'Angel', 8, 6, 6, 'Rare'), ('Apothecary Geist', 'Shadows over Innistrad', 'Spirit', 4, 2, 3, 'Common'), ('Asylum Visitor', 'Shadows over Innistrad', 'Vampire Wizard', 2, 3, 1, 'Rare'), ('Bloodmad Vampire', 'Shadows over Innistrad', 'Vampire Beserker', 3, 4, 1, 'Common'), ('Briarbridge Patrol', 'Shadows over Innistrad', 'Human Warrior', 4, 3, 3, 'Uncommon') ;
/*!40000 ALTER TABLE `Creatures` ENABLE KEYS */;
UNLOCK TABLES;

-- Table structure for table `Enchantments`
--

DROP TABLE IF EXISTS `Enchantments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Enchantments` (
  `name` char(20) DEFAULT NULL,
  `set` char(20) DEFAULT NULL,
  `subtype` char(20) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Enchantments`
--

LOCK TABLES `Enchantments` WRITE;
/*!40000 ALTER TABLE `Enchantments` DISABLE KEYS */;
INSERT INTO `Enchantments` VALUES ('Always Watching', 'Shadows over Innistrad', NULL, 3, 'Rare'), ('Behind the Scenes', 'Shadows over Innistrad', NULL, 3, 'Uncommon'), ('Bound by Moonsilver', 'Shadows over Innistrad', 'Aura', 3, 'Uncommon');
/*!40000 ALTER TABLE `Enchantments` ENABLE KEYS */;
UNLOCK TABLES;


-- Table structure for table `Sorceries`
--

DROP TABLE IF EXISTS `Sorceries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sorceries` (
  `name` char(20) DEFAULT NULL,
  `set` char(20) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sorceries`
--

LOCK TABLES `Sorceries` WRITE;
/*!40000 ALTER TABLE `Sorceries` DISABLE KEYS */;
INSERT INTO `Sorceries` VALUES ('Alms of the Vein', 'Shadows over Innistrad', 3, 'Common'), ('Angelic Purge', 'Shadows over Innistrad', 3, 'Common'), ('Avacyns Judgment', 'Shadows over Innistrad', 2, 'Rare'), ('Behold the Beyond', 'Shadows over Innistrad', 7, 'Mythic Rare'), ('Biting Rain', 'Shadows over Innistrad', 4, 'Uncommon');
/*!40000 ALTER TABLE `Sorceries` ENABLE KEYS */;
UNLOCK TABLES;

-- Table structure for table `Instants`
--

DROP TABLE IF EXISTS `Instants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Instants` (
  `name` char(20) DEFAULT NULL,
  `set` char(20) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Instants`
--

LOCK TABLES `Instants` WRITE;
/*!40000 ALTER TABLE `Instants` DISABLE KEYS */;
INSERT INTO `Instants` VALUES ('Aim High', 'Shadows over Innistrad', 2, 'Common'), ('Anguished Unmaking', 'Shadows over Innistrad', 3, 'Rare');
/*!40000 ALTER TABLE `Instants` ENABLE KEYS */;
UNLOCK TABLES;

-- Table structure for table `Artifacts`
--

DROP TABLE IF EXISTS `Planeswalker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Planeswalker` (
  `name` char(20) DEFAULT NULL,
  `set` char(20) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `loyalty` int(11) DEFAULT NULL,
  `rarity` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Planeswalker`
--

LOCK TABLES `Planeswalker` WRITE;
/*!40000 ALTER TABLE `Planeswalker` DISABLE KEYS */;
INSERT INTO `Planeswalker` VALUES ('Arlinn Kord', 'Shadows over Innistrad', 4, 3, 'Mythic Rare');
/*!40000 ALTER TABLE `Planeswalker` ENABLE KEYS */;
UNLOCK TABLES;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-13 21:20:58

-- procedures

CREATE PROCEDURE SearchAllByNameAndCost(IN inputName Char(50), IN inputCost INT)
SELECT name
FROM Lands, Planeswalker, Artifacts, Creatures, Sorceries, Enchantments, Instants
WHERE (name like ('%' + inputName + '%') OR inputName is NULL) AND (inputCost = cost OR inputCost IS NULL);

CREATE PROCEDURE SearchEnchantments(IN inputName CHAR(50), IN inputCost INT, IN inputSubtype CHAR(50))
SELECT name
FROM Enchantments
WHERE (inputName IS NULL OR name = inputName) AND (inputCost IS NULL OR cost = inputCost) AND (inputSubtype IS NULL OR subtype like ('%' + inputSubtype + '%'));

CREATE PROCEDURE CreatureSearch(IN inputName CHAR(50),IN inputSubtype CHAR(50), IN inputCost INT, inputPower INT, IN inputToughness INT)
SELECT name
FROM Creature
WHERE (inputName IS NULL OR name like ('%' + inputName + '%')) AND (inputSubtype IS NULL OR subtype like ('%' + inputSubtype + '%')) AND (inputPower IS NULL OR power = inputPower) AND (inputToughness IS NULL OR toughness = inputToughness) AND (inputCost IS NULL OR costs = inputCost);

CREATE PROCEDURE ArtifactSearch(IN inputName CHAR(50),IN inputSubtype CHAR(50), IN inputCost INT)
SELECT name
FROM Artifact
WHERE (inputName IS NULL OR name like ('%' + inputName + '%')) AND (inputSubtype IS NULL OR subtype like ('%' + inputSubtype + '%')) AND (inputCost IS NULL OR costs = inputCost);

CREATE PROCEDURE LandSearch(IN inputName CHAR(50),IN inputSubtype CHAR(50))
SELECT name
FROM Land
WHERE (inputName IS NULL OR name like ('%' + inputName + '%')) AND (inputSubtype IS NULL OR subtype like ('%' + inputSubtype + '%'));

CREATE PROCEDURE PlaneswalkerSearch(IN inputName CHAR(50),IN inputCost INT, IN inputLoyalty INT)
SELECT name
FROM Planeswalker
WHERE (inputName IS NULL OR name like ('%' + inputName + '%')) AND (inputCost IS NULL OR cost = inputCost) AND (inputLoyalty IS NULL OR loyalty = inputLoyalty);

CREATE PROCEDURE SorcerySearch(IN inputName CHAR(50), IN inputCost INT)
SELECT name
FROM Sorceries
WHERE (inputName IS NULL OR name like ('%' + inputName + '%'))  AND (inputCost IS NULL OR costs = inputCost);

CREATE PROCEDURE InstantSearch(IN inputName CHAR(50), IN inputCost INT)
SELECT imagepath
FROM Instant
WHERE (inputName IS NULL OR name like ('%' + inputName + '%'))  AND (inputCost IS NULL OR costs = inputCost);



