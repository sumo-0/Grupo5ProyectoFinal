-- Eliminamos la base de datos si ya existe
DROP DATABASE IF EXISTS concesionario_grupo5;
CREATE DATABASE concesionario_grupo5;
USE concesionario_grupo5;

-- Creación de tablas sin claves foráneas primero
CREATE TABLE Concesionario (
	ID_concesionario INT PRIMARY KEY AUTO_INCREMENT,
	Nombre_concesionario VARCHAR(50) NOT NULL,
	direccion_concesionario VARCHAR(100) NOT NULL,
	telefono_concesionario VARCHAR(15) NOT NULL,
	cantidad_coches INT
);

CREATE TABLE Puestos (
	ID_puesto INT PRIMARY KEY AUTO_INCREMENT,
	nombre_puesto VARCHAR(20) NOT NULL
);

CREATE TABLE Cliente (
	ID_cliente INT PRIMARY KEY AUTO_INCREMENT,
	DNI VARCHAR(9) UNIQUE NOT NULL,
	Nombre_cliente VARCHAR(40) NOT NULL,
	telefono_cliente VARCHAR(15),
	Direccion_cliente VARCHAR(50)
);

CREATE TABLE Coche (
	ID_coche INT PRIMARY KEY AUTO_INCREMENT,
	marca VARCHAR(20) NOT NULL,
	modelo VARCHAR(20) NOT NULL,
	matricula VARCHAR(7) NOT NULL UNIQUE,
	kilometraje DECIMAL(10,1),
	ano_fabricacion INT NOT NULL,
	precio DECIMAL(20,2),
	cv INT NOT NULL,
	color VARCHAR(20) NOT NULL
);

CREATE TABLE Empleado (
	ID_empleado INT PRIMARY KEY AUTO_INCREMENT,
	Nombre_empleado VARCHAR(40) NOT NULL,
	Direccion_empleado VARCHAR(50),
	telefono_empleado VARCHAR(15),
	ID_concesionario INT,
	ID_puesto INT,
	FOREIGN KEY (ID_concesionario) REFERENCES Concesionario(ID_concesionario),
	FOREIGN KEY (ID_puesto) REFERENCES Puestos(ID_puesto)
);

CREATE TABLE Registro (
	ID_registro INT PRIMARY KEY AUTO_INCREMENT,
	ID_concesionario INT,
	ID_coche INT,
	FOREIGN KEY (ID_concesionario) REFERENCES Concesionario(ID_concesionario),
	FOREIGN KEY (ID_coche) REFERENCES Coche(ID_coche)
);

CREATE TABLE Recibo_de_compra (
	ID_compra INT PRIMARY KEY AUTO_INCREMENT,
	ID_cliente INT,
	ID_coche INT,
	FOREIGN KEY (ID_cliente) REFERENCES Cliente(ID_cliente),
	FOREIGN KEY (ID_coche) REFERENCES Coche(ID_coche)
);

CREATE TABLE cuenta_empleado (
	ID_cuenta_empleado INT PRIMARY KEY AUTO_INCREMENT,
	usuario VARCHAR(40) NOT NULL,
	contrasena VARCHAR(50) NOT NULL,
	ID_empleado INT,
	FOREIGN KEY (ID_empleado) REFERENCES Empleado(ID_empleado)
);

CREATE TABLE cuenta_cliente (
	ID_cuenta_cliente INT PRIMARY KEY AUTO_INCREMENT,
	usuario VARCHAR(40) NOT NULL,
	contrasena VARCHAR(50) NOT NULL,
	ID_cliente INT,
	FOREIGN KEY (ID_cliente) REFERENCES Cliente(ID_cliente)
);