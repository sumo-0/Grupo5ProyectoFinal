-- Crear base de datos
CREATE DATABASE IF NOT EXISTS concesionario;
USE concesionario;

-- Crear tabla de clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(255) NOT NULL
);

-- Insertar cliente de prueba
INSERT INTO clientes (usuario, contrasena)
VALUES ('cliente1', '1234');

-- Crear tabla de autos
CREATE TABLE IF NOT EXISTS autos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL
);

-- Insertar autos de ejemplo
INSERT INTO autos (marca, modelo, precio) VALUES
('Ford', 'Focus', 15000.00),
('BMW', 'Serie 3', 30000.00),
('Toyota', 'Corolla', 18000.00);