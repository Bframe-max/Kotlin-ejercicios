BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS Publicaciones (
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
COMMIT;
