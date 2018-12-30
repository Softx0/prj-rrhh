
--
-- Table structure for table `candidatos`
--

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

--
-- Dumping data for table `candidatos`
--

INSERT INTO `candidatos` VALUES (1,'40215563657','Eduardo Valenzuela',60000,'2018-01-29','enmanuel54sk8@gmail.com','8292911225','Hola',1,1);


--
-- Table structure for table `capacitacion_candidato`
--

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

--
-- Dumping data for table `capacitacion_candidato`
--


--
-- Table structure for table `capacitaciones`
--

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

--
-- Dumping data for table `capacitaciones`
--


--
-- Table structure for table `competencia_candidato`
--

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
--
-- Dumping data for table `competencia_candidato`
--


--
-- Table structure for table `competencias`
--

CREATE TABLE `competencias` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Competencia` varchar(100) NOT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `competencias_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `competencias`
--


--
-- Table structure for table `departamentos`
--

CREATE TABLE `departamentos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) NOT NULL,
  `Estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Estado` (`Estado`),
  CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`Estado`) REFERENCES `estado` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `departamentos`
--

INSERT INTO `departamentos` VALUES (1,'TI',2);

--
-- Table structure for table `empleado`
--

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

--
-- Dumping data for table `empleado`
--

--
-- Table structure for table `escrito`
--

CREATE TABLE `escrito` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `escrito`
--


--
-- Table structure for table `estado`
--

CREATE TABLE `estado` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `estado`
--

INSERT INTO `estado` VALUES (1,0),(2,1);

--
-- Table structure for table `estado_candidato`
--

CREATE TABLE `estado_candidato` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_candidato`
--

INSERT INTO `estado_candidato` VALUES (1,1),(2,0);

--
-- Table structure for table `estado_civil`
--

CREATE TABLE `estado_civil` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `estado_civil`
--

INSERT INTO `estado_civil` VALUES (1,'Soltero'),(3,'Casado'),(4,'Viudo');

--
-- Table structure for table `experiencia_laboral`
--

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

--
-- Dumping data for table `experiencia_laboral`
--


--
-- Table structure for table `explaboral_candidato`
--

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

--
-- Dumping data for table `explaboral_candidato`
--


--
-- Table structure for table `hablado`
--
CREATE TABLE `hablado` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hablado`
--


--
-- Table structure for table `idioma_candidato`
--
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

--
-- Dumping data for table `idioma_candidato`
--


--
-- Table structure for table `idiomas`
--

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

--
-- Dumping data for table `idiomas`
--

--
-- Table structure for table `nivel_academico`
--

CREATE TABLE `nivel_academico` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nivel_academico`
--


--
-- Table structure for table `nivel_riesgo`
--

CREATE TABLE `nivel_riesgo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nivel_riesgo`
--


--
-- Table structure for table `puestos`
--

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

--
-- Dumping data for table `puestos`
--

--
-- Table structure for table `recomendacion`
--

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

--
-- Dumping data for table `recomendacion`
--

--
-- Table structure for table `recomendacion_candidato`
--
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

--
-- Dumping data for table `recomendacion_candidato`
--

--
-- Table structure for table `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipo_usuario`
--


--
-- Table structure for table `usuario`
--


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

--
-- Dumping data for table `usuario`
--