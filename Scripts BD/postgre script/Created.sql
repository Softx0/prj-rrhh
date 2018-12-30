CREATE TABLE Estado_Candidato (
  Id SERIAL PRIMARY KEY,
  Descripcion BOOLEAN
);

CREATE TABLE Estado (
  Descripcion BOOLEAN PRIMARY KEY,
  Descripcion BOOLEAN
);

DROP TABLE Estado_Candidato;

CREATE TABLE Nivel_Academico (
  Id SERIAL PRIMARY KEY,
  Descripcion varchar(100)
);

CREATE TABLE Nivel_Riesgo (
    Id SERIAL PRIMARY KEY,
    Descripcion varchar(100)
);

CREATE TABLE Tipo_Usuario(
    Id SERIAL PRIMARY KEY,
    Descripcion varchar(50)
);

CREATE TABLE Estado_Civil(
    Id SERIAL PRIMARY KEY,
    Descripcion varchar(50)
);

CREATE TABLE Escrito(
    Id SERIAL PRIMARY KEY,
    Descripcion varchar(50)
);

CREATE TABLE Hablado(
    Id SERIAL PRIMARY KEY,
    Descripcion varchar(50)
);

CREATE TABLE Candidatos (
  Id SERIAL PRIMARY KEY,
  Cedula varchar(11) NOT NULL,
  Nombre varchar(100) NOT NULL,
  Salario_Aspira real,
  Fecha_Nacimiento date,
  Email varchar(100),
  Telefono varchar(100),
  Resumen varchar(400),
  Estado BOOLEAN,
  EstadoCivilId INTEGER REFERENCES Estado_Civil(id)
);

CREATE TABLE Recomendacion (
    Id SERIAL PRIMARY KEY,
    Nombre varchar(100) NOT NULL,
    Empresa varchar(100),
    Puesto varchar(100),
    Telefono varchar(50) NOT NULL,
    EstadoId BOOLEAN
);

CREATE TABLE Recomendacion_Candidato(
    Id SERIAL PRIMARY KEY,
    recomendacionId INTEGER REFERENCES Recomendacion(id),
    candidatoId INTEGER REFERENCES Candidatos(id)
);

CREATE TABLE Experiencia_Laboral (
  Id SERIAL PRIMARY KEY,
  Empresa varchar(100) NOT NULL,
  Puesto_Ocupado varchar(100),
  Fecha_Desde date,
  Fecha_Hasta date,
  Salario real,
  Pais varchar(50),
  EstadoId BOOLEAN
);


CREATE TABLE ExpLaboral_Candidato(
    Id SERIAL PRIMARY KEY,
    experiencia_laboralId INTEGER REFERENCES Experiencia_Laboral(id),
    candidatoId INTEGER REFERENCES Candidatos(id)
);

CREATE TABLE Capacitaciones (
  Id SERIAL PRIMARY KEY,
  Titulo varchar(100) NOT NULL,
  Nivel integer,
  Fecha_Desde date,
  Fecha_Hasta date,
  Institucion varchar(100),
  EstadoId BOOLEAN,
  Nivel_AcademicoId INTEGER REFERENCES Nivel_Academico(id)
);

CREATE TABLE Capacitacion_Candidato(
    Id SERIAL PRIMARY KEY,
    capacitacionId INTEGER REFERENCES Capacitaciones(id),
    candidatoId INTEGER REFERENCES Candidatos(id)
);

CREATE TABLE Competencias (
  Id SERIAL PRIMARY KEY,
  Competencia varchar(100) NOT NULL,
  EstadoId BOOLEAN
);

CREATE TABLE Competencia_Candidato (
    Id SERIAL PRIMARY KEY,
    competenciaId INTEGER REFERENCES Competencias(id),
    candidatoId INTEGER REFERENCES Candidatos(id)
);

CREATE TABLE Idiomas (
  Id SERIAL PRIMARY KEY,
  Idioma varchar(100) NOT NULL,
  EscritoId INTEGER REFERENCES Escrito(id),
  HabladoId INTEGER REFERENCES Hablado(id),
  EstadoId BOOLEAN 
);

CREATE TABLE Idioma_Candidato (
    Id SERIAL PRIMARY KEY,
    IdiomaId INTEGER REFERENCES Idiomas(id),
    candidatoId INTEGER REFERENCES Candidatos(id)
);

CREATE TABLE Departamentos(
    Id SERIAL PRIMARY KEY,
    Descripcion varchar(100) NOT NULL,
    EstadoId BOOLEAN
);

CREATE TABLE Puestos (
  Id SERIAL PRIMARY KEY,
  Descripcion varchar(100) NOT NULL,
  Salario_Minimo real,
  Salario_Maximo real,
  EstadoId BOOLEAN,
  DepartamentoId INTEGER REFERENCES Departamentos(Id),
  Nivel_RiesgoId INTEGER REFERENCES Nivel_Riesgo(Id)
);

CREATE TABLE Usuario(
    Id SERIAL PRIMARY KEY,
    Email varchar(100),
    Password varchar(200),
    Tipo_UsuarioId INTEGER REFERENCES Tipo_Usuario(Id),
    EstadoId BOOLEAN
);













