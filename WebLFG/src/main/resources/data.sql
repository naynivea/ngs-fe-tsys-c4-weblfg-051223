-- Web LFG Prueba técnica 
-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    UNIQUE (username),
    UNIQUE (email) 
);

-- Creación de la tabla Partidas
CREATE TABLE Partidas (
    partida_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_videojuego VARCHAR(100) NOT NULL
);

-- Creación de la tabla Mensajes
CREATE TABLE Mensajes (
    mensaje_id INT AUTO_INCREMENT PRIMARY KEY,
    contenido VARCHAR(255) NOT NULL,
    usuario_id INT,
    partida_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(user_id),
    FOREIGN KEY (partida_id) REFERENCES Partidas(partida_id)
);
