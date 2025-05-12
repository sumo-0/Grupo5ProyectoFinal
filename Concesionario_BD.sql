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
select * from coche;

INSERT INTO Coche (marca, modelo, matricula, kilometraje, ano_fabricacion, precio, cv, color)
VALUES
('Bugatti', 'Chiron', '1234ABC', 1200.0, 2023, 3000000.00, 1500, 'Azul'),
('Audi', 'R8', '5678DEF', 8500.0, 2022, 170000.00, 620, 'Rojo'),
('Lamborghini', 'SVJ Rds', '9012GHI', 3000.0, 2021, 550000.00, 770, 'Amarillo'),
('Mercedes-Benz', 'AMG VGT', '3456JKL', 150.0, 2020, 1200000.00, 577, 'Plateado'),
('Porsche', '911 Turbo S', '7890MNO', 6700.0, 2023, 230000.00, 650, 'Negro'),
('Ferrari', '296 GTS', '2345PQR', 2200.0, 2023, 350000.00, 830, 'Rojo');

INSERT INTO Concesionario (Nombre_concesionario, direccion_concesionario, telefono_concesionario, cantidad_coches)
VALUES ('Concesionario Central', 'Av. del Motor 123, Madrid', '911223344', 50);

INSERT INTO Puestos (nombre_puesto)
VALUES ('Vendedor'), ('Mecánico'), ('Gerente');

INSERT INTO Empleado (Nombre_empleado, Direccion_empleado, telefono_empleado, ID_concesionario, ID_puesto)
VALUES
('Lucía Martínez', 'Calle Real 12, Madrid', '611223344', 1, 1),  -- Vendedor
('Carlos Pérez', 'Av. Norte 77, Madrid', '622334455', 1, 2),     -- Mecánico
('María Gómez', 'Calle Sur 33, Madrid', '633445566', 1, 3);      -- Gerente

INSERT INTO Cliente (DNI, Nombre_cliente, telefono_cliente, Direccion_cliente)
VALUES
('12345678A', 'Juan Torres', '644556677', 'Calle Luna 5, Madrid'),
('23456789B', 'Elena Ruiz', '655667788', 'Av. Sol 22, Madrid'),
('34567890C', 'Pedro Sánchez', '666778899', 'Paseo del Prado 18, Madrid');

INSERT INTO cuenta_empleado (usuario, contrasena, ID_empleado)
VALUES
('lucia.m', 'lucia123', 1),
('carlos.p', 'carlos123', 2),
('maria.g', 'maria123', 3);

INSERT INTO cuenta_cliente (usuario, contrasena, ID_cliente)
VALUES
('juan.t', 'juan123', 1),
('elena.r', 'elena123', 2),
('pedro.s', 'pedro123', 3);

INSERT INTO Registro (ID_concesionario, ID_coche)
VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6);

select * from Recibo_de_compra;
