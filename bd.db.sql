-- --------------------------------------------------
-- MI SCRIPT ÚNICO DE APRENDIZAJE DE SQLITE 3
-- --------------------------------------------------

-- Habilitar la restricción de llaves foráneas (Importante)
PRAGMA foreign_keys = ON;

-- --------------------------------------------------
-- PUNTO 2 y 3: CREAR TABLAS (con Primary y Foreign Keys)
-- --------------------------------------------------

-- Usamos 'IF EXISTS' para poder ejecutar el script múltiples veces sin error.
DROP TABLE IF EXISTS Publicaciones;
DROP TABLE IF EXISTS Usuarios;

-- Creación de la tabla 'Usuarios'
CREATE TABLE Usuarios (
    UsuarioID INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre TEXT NOTNULL,
    Email TEXT NOT NULL UNIQUE,
    Edad INTEGER
);

-- Creación de la tabla 'Publicaciones'
CREATE TABLE Publicaciones (
    PublicacionID INTEGER PRIMARY KEY AUTOINCREMENT,
    Titulo TEXT NOT NULL,
    Texto TEXT,
    Vistas INTEGER DEFAULT 0,
    -- Esta es la Foreign Key que se conecta con Usuarios.UsuarioID
    Autor_FK INTEGER,
    
    CONSTRAINT FK_Autor
    FOREIGN KEY (Autor_FK) 
    REFERENCES Usuarios(UsuarioID)
    -- Si un usuario es borrado, sus publicaciones se borran (CASCADE)
    ON DELETE CASCADE 
);


-- --------------------------------------------------
-- PUNTO 4 (Parte 1): INSERT (Insertar datos)
-- --------------------------------------------------
INSERT INTO Usuarios (Nombre, Email, Edad) VALUES
('Juan Pérez', 'juan@correo.com', 30),
('Ana Gómez', 'ana.gomez@correo.com', 25),
('Luis Martínez', 'luis@dominio.com', 42),
('Maria Solano', 'maria.s@correo.com', 35);

-- Insertamos publicaciones asociadas a los usuarios por su ID
INSERT INTO Publicaciones (Titulo, Texto, Vistas, Autor_FK) VALUES
('Introducción a SQLite', 'El motor de base de datos...', 150, 1), -- Autor: Juan (ID 1)
('¿Qué es SQL?', 'SQL significa...', 75, 1),                     -- Autor: Juan (ID 1)
('Diseño Web Moderno', 'Hablemos de CSS Grid...', 300, 2),        -- Autor: Ana (ID 2)
('Introducción a Python', 'Python es un lenguaje...', 1200, 2),   -- Autor: Ana (ID 2)
('Bases de Datos Relacionales', 'Una base de datos relacional...', 20, 3); -- Autor: Luis (ID 3)


-- --------------------------------------------------
-- PUNTO 4 (Parte 2): SELECT (Consultar datos)
-- --------------------------------------------------
SELECT * FROM Usuarios;
SELECT Titulo, Vistas FROM Publicaciones;


-- --------------------------------------------------
-- PUNTO 5, 6, 7: WHERE y OPERADORES (Relacionales y Lógicos)
-- --------------------------------------------------

-- (Punto 6) Operadores Relacionales (>, =, !=)
SELECT * FROM Usuarios WHERE Edad > 30; -- Luis y Maria
SELECT * FROM Publicaciones WHERE Vistas = 300; -- Diseño Web Moderno

-- (Punto 7) Operadores Lógicos (AND, OR, NOT)
-- AND: Usuarios mayores de 30 Y que se llamen 'Luis Martínez'
SELECT * FROM Usuarios WHERE Edad > 30 AND Nombre = 'Luis Martínez';

-- OR: Publicaciones con menos de 100 vistas O más de 1000 vistas
SELECT * FROM Publicaciones WHERE Vistas < 100 OR Vistas > 1000;

-- NOT: Todos los usuarios que NO sean 'Ana Gómez'
SELECT * FROM Usuarios WHERE NOT Nombre = 'Ana Gómez';


-- --------------------------------------------------
-- PUNTO 8: Operador BETWEEN
-- --------------------------------------------------
-- Usuarios que tienen entre 20 y 35 años (inclusive)
SELECT * FROM Usuarios WHERE Edad BETWEEN 20 AND 35;

-- Publicaciones que tienen entre 100 y 500 vistas
SELECT * FROM Publicaciones WHERE Vistas BETWEEN 100 AND 500;


-- --------------------------------------------------
-- PUNTO 9: Operador IN
-- --------------------------------------------------
-- Usuarios que se llaman 'Juan Pérez' o 'Maria Solano'
SELECT * FROM Usuarios WHERE Nombre IN ('Juan Pérez', 'Maria Solano');


-- --------------------------------------------------
-- PUNTO 10: Operador LIKE
-- --------------------------------------------------
-- Usuarios cuyo email termina en '@correo.com'
SELECT * FROM Usuarios WHERE Email LIKE '%@correo.com';

-- Usuarios cuyo nombre empieza con 'A'
SELECT * FROM Usuarios WHERE Nombre LIKE 'A%';

-- Publicaciones que tienen la palabra 'SQL' en cualquier parte del título
SELECT * FROM Publicaciones WHERE Titulo LIKE '%SQL%';


-- --------------------------------------------------
-- PUNTO 4 (Parte 3): UPDATE y DELETE
-- --------------------------------------------------

-- UPDATE: Actualizar datos
UPDATE Usuarios
SET Edad = 26
WHERE Nombre = 'Ana Gómez';

-- (Comprobamos el UPDATE)
SELECT * FROM Usuarios WHERE Nombre = 'Ana Gómez';


-- DELETE: Borrar datos
DELETE FROM Publicaciones
WHERE Titulo = '¿Qué es SQL?';

-- (Comprobamos el DELETE)
SELECT * FROM Publicaciones WHERE Autor_FK = 1;
