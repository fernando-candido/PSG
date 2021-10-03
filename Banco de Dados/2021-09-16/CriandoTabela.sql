CREATE TABLE Categoria (
	Codigo INT NOT NULL IDENTITY(1,1),
	Descricao VARCHAR(MAX) NOT NULL,
	DataInsert DATETIME NOT NULL DEFAULT GETDATE(),
	CONSTRAINT PK_Categoria PRIMARY KEY (Codigo)
)
GO
