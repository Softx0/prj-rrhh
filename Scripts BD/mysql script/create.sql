CREATE DATABASE  IF NOT EXISTS `rrhhbd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rrhhbd`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: rrhhbd
-- ------------------------------------------------------
-- Server version	5.7.21

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
-- Table structure for table `candidatos`
--

DROP TABLE IF EXISTS `candidatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `candidatos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Cedula` varchar(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Salario_Aspira` double DEFAULT NULL,
  `Fecha_Nacimiento` date DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Telefono` varchar(100) DEFAULT NULL,
  `Resumen` varchar(400) DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  `EstadoCivil` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  KEY `EstadoCivil` (`EstadoCivil`),
  CONSTRAINT `candidatos_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado_candidato` (`Id`),
  CONSTRAINT `candidatos_ibfk_2` FOREIGN KEY (`EstadoCivil`) REFERENCES `estado_civil` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidatos`
--

LOCK TABLES `candidatos` WRITE;
/*!40000 ALTER TABLE `candidatos` DISABLE KEYS */;
INSERT INTO `candidatos` VALUES (1,'40215563657','Eduardo Valenzuela',60000,'2018-01-29','enmanuel54sk8@gmail.com','8292911225','Hola',1,1);
/*!40000 ALTER TABLE `candidatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capacitacion_candidato`
--

DROP TABLE IF EXISTS `capacitacion_candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `capacitacion_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Capacitacion` int(11) DEFAULT NULL,
  `Candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Capacitacion` (`Capacitacion`),
  KEY `Candidato` (`Candidato`),
  CONSTRAINT `capacitacion_candidato_ibfk_1` FOREIGN KEY (`Capacitacion`) REFERENCES `capacitaciones` (`Id`),
  CONSTRAINT `capacitacion_candidato_ibfk_2` FOREIGN KEY (`Candidato`) REFERENCES `candidatos` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacitacion_candidato`
--

LOCK TABLES `capacitacion_candidato` WRITE;
/*!40000 ALTER TABLE `capacitacion_candidato` DISABLE KEYS */;
/*!40000 ALTER TABLE `capacitacion_candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capacitaciones`
--

DROP TABLE IF EXISTS `capacitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `capacitaciones` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(100) NOT NULL,
  `Nivel` int(11) DEFAULT NULL,
  `Fecha_Desde` date DEFAULT NULL,
  `Fecha_Hasta` date DEFAULT NULL,
  `Institucion` varchar(100) DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  `Nivel_Academico` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  KEY `Nivel_Academico` (`Nivel_Academico`),
  CONSTRAINT `capacitaciones_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`),
  CONSTRAINT `capacitaciones_ibfk_2` FOREIGN KEY (`Nivel_Academico`) REFERENCES `nivel_academico` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacitaciones`
--

LOCK TABLES `capacitaciones` WRITE;
/*!40000 ALTER TABLE `capacitaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `capacitaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competencia_candidato`
--

DROP TABLE IF EXISTS `competencia_candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `competencia_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Competencia` int(11) DEFAULT NULL,
  `Candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Competencia` (`Competencia`),
  KEY `Candidato` (`Candidato`),
  CONSTRAINT `competencia_candidato_ibfk_1` FOREIGN KEY (`Competencia`) REFERENCES `competencias` (`Id`),
  CONSTRAINT `competencia_candidato_ibfk_2` FOREIGN KEY (`Candidato`) REFERENCES `candidatos` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competencia_candidato`
--

LOCK TABLES `competencia_candidato` WRITE;
/*!40000 ALTER TABLE `competencia_candidato` DISABLE KEYS */;
/*!40000 ALTER TABLE `competencia_candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competencias`
--

DROP TABLE IF EXISTS `competencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `competencias` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Competencia` varchar(100) NOT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `competencias_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competencias`
--

LOCK TABLES `competencias` WRITE;
/*!40000 ALTER TABLE `competencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `competencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamentos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) NOT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'TI',2);
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleado` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) DEFAULT NULL,
  `Cedula` varchar(11) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Fecha_Ingreso` date DEFAULT NULL,
  `Salario` double DEFAULT NULL,
  `Departamento` int(11) DEFAULT NULL,
  `Puesto` int(11) DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Departamento` (`Departamento`),
  KEY `Puesto` (`Puesto`),
  KEY `Estado` (`Estado`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escrito`
--

DROP TABLE IF EXISTS `escrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `escrito` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escrito`
--

LOCK TABLES `escrito` WRITE;
/*!40000 ALTER TABLE `escrito` DISABLE KEYS */;
/*!40000 ALTER TABLE `escrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,0),(2,1);
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_candidato`
--

DROP TABLE IF EXISTS `estado_candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_candidato`
--

LOCK TABLES `estado_candidato` WRITE;
/*!40000 ALTER TABLE `estado_candidato` DISABLE KEYS */;
INSERT INTO `estado_candidato` VALUES (1,1),(2,0);
/*!40000 ALTER TABLE `estado_candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_civil`
--

DROP TABLE IF EXISTS `estado_civil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_civil` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_civil`
--

LOCK TABLES `estado_civil` WRITE;
/*!40000 ALTER TABLE `estado_civil` DISABLE KEYS */;
INSERT INTO `estado_civil` VALUES (1,'Soltero'),(3,'Casado'),(4,'Viudo');
/*!40000 ALTER TABLE `estado_civil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experiencia_laboral`
--

DROP TABLE IF EXISTS `experiencia_laboral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experiencia_laboral` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Empresa` varchar(100) NOT NULL,
  `Puesto_Ocupado` varchar(100) DEFAULT NULL,
  `Fecha_Desde` date DEFAULT NULL,
  `Fecha_Hasta` date DEFAULT NULL,
  `Salario` double DEFAULT NULL,
  `Pais` varchar(50) DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `experiencia_laboral_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiencia_laboral`
--

LOCK TABLES `experiencia_laboral` WRITE;
/*!40000 ALTER TABLE `experiencia_laboral` DISABLE KEYS */;
/*!40000 ALTER TABLE `experiencia_laboral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `explaboral_candidato`
--

DROP TABLE IF EXISTS `explaboral_candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `explaboral_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `experiencia_laboral` int(11) DEFAULT NULL,
  `candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `experiencia_laboral` (`experiencia_laboral`),
  KEY `candidato` (`candidato`),
  CONSTRAINT `explaboral_candidato_ibfk_1` FOREIGN KEY (`experiencia_laboral`) REFERENCES `experiencia_laboral` (`Id`),
  CONSTRAINT `explaboral_candidato_ibfk_2` FOREIGN KEY (`candidato`) REFERENCES `candidatos` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `explaboral_candidato`
--

LOCK TABLES `explaboral_candidato` WRITE;
/*!40000 ALTER TABLE `explaboral_candidato` DISABLE KEYS */;
/*!40000 ALTER TABLE `explaboral_candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hablado`
--

DROP TABLE IF EXISTS `hablado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hablado` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hablado`
--

LOCK TABLES `hablado` WRITE;
/*!40000 ALTER TABLE `hablado` DISABLE KEYS */;
/*!40000 ALTER TABLE `hablado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma_candidato`
--

DROP TABLE IF EXISTS `idioma_candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `idioma_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Idioma` int(11) DEFAULT NULL,
  `Candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Idioma` (`Idioma`),
  KEY `Candidato` (`Candidato`),
  CONSTRAINT `idioma_candidato_ibfk_1` FOREIGN KEY (`Idioma`) REFERENCES `idiomas` (`Id`),
  CONSTRAINT `idioma_candidato_ibfk_2` FOREIGN KEY (`Candidato`) REFERENCES `candidatos` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma_candidato`
--

LOCK TABLES `idioma_candidato` WRITE;
/*!40000 ALTER TABLE `idioma_candidato` DISABLE KEYS */;
/*!40000 ALTER TABLE `idioma_candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idiomas`
--

DROP TABLE IF EXISTS `idiomas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `idiomas` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Idioma` varchar(100) NOT NULL,
  `Escrito` int(11) DEFAULT NULL,
  `Hablado` int(11) DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Escrito` (`Escrito`),
  KEY `Hablado` (`Hablado`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `idiomas_ibfk_1` FOREIGN KEY (`Escrito`) REFERENCES `escrito` (`Id`),
  CONSTRAINT `idiomas_ibfk_2` FOREIGN KEY (`Hablado`) REFERENCES `hablado` (`Id`),
  CONSTRAINT `idiomas_ibfk_3` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idiomas`
--

LOCK TABLES `idiomas` WRITE;
/*!40000 ALTER TABLE `idiomas` DISABLE KEYS */;
/*!40000 ALTER TABLE `idiomas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel_academico`
--

DROP TABLE IF EXISTS `nivel_academico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nivel_academico` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel_academico`
--

LOCK TABLES `nivel_academico` WRITE;
/*!40000 ALTER TABLE `nivel_academico` DISABLE KEYS */;
/*!40000 ALTER TABLE `nivel_academico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel_riesgo`
--

DROP TABLE IF EXISTS `nivel_riesgo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nivel_riesgo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel_riesgo`
--

LOCK TABLES `nivel_riesgo` WRITE;
/*!40000 ALTER TABLE `nivel_riesgo` DISABLE KEYS */;
/*!40000 ALTER TABLE `nivel_riesgo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puestos`
--

DROP TABLE IF EXISTS `puestos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `puestos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) NOT NULL,
  `Salario_Minimo` double DEFAULT NULL,
  `Salario_Maximo` double DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  `Departamento` int(11) DEFAULT NULL,
  `Nivel_Riesgo` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  KEY `Departamento` (`Departamento`),
  KEY `Nivel_Riesgo` (`Nivel_Riesgo`),
  CONSTRAINT `puestos_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`),
  CONSTRAINT `puestos_ibfk_2` FOREIGN KEY (`Departamento`) REFERENCES `departamentos` (`Id`),
  CONSTRAINT `puestos_ibfk_3` FOREIGN KEY (`Nivel_Riesgo`) REFERENCES `nivel_riesgo` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puestos`
--

LOCK TABLES `puestos` WRITE;
/*!40000 ALTER TABLE `puestos` DISABLE KEYS */;
/*!40000 ALTER TABLE `puestos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recomendacion`
--

DROP TABLE IF EXISTS `recomendacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recomendacion` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Empresa` varchar(100) DEFAULT NULL,
  `Puesto` varchar(100) DEFAULT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `recomendacion_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recomendacion`
--

LOCK TABLES `recomendacion` WRITE;
/*!40000 ALTER TABLE `recomendacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `recomendacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recomendacion_candidato`
--

DROP TABLE IF EXISTS `recomendacion_candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recomendacion_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Recomendacion` int(11) DEFAULT NULL,
  `Candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Recomendacion` (`Recomendacion`),
  KEY `Candidato` (`Candidato`),
  CONSTRAINT `recomendacion_candidato_ibfk_1` FOREIGN KEY (`Recomendacion`) REFERENCES `recomendacion` (`Id`),
  CONSTRAINT `recomendacion_candidato_ibfk_2` FOREIGN KEY (`Candidato`) REFERENCES `candidatos` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recomendacion_candidato`
--

LOCK TABLES `recomendacion_candidato` WRITE;
/*!40000 ALTER TABLE `recomendacion_candidato` DISABLE KEYS */;
/*!40000 ALTER TABLE `recomendacion_candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_usuario` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(100) DEFAULT NULL,
  `Password` varchar(200) DEFAULT NULL,
  `Tipo_Usuario` int(11) DEFAULT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Tipo_Usuario` (`Tipo_Usuario`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`Tipo_Usuario`) REFERENCES `tipo_usuario` (`Id`),
  CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-30  0:58:12
