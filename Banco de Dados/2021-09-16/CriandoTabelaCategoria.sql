CREATE TABLE SubCategoria (
	SubCategoriaID INT NOT NULL IDENTITY(1,1),
	CategoriaID INT NOT NULL,
	descricao VARCHAR(MAX) NOT NULL,
	datainsert DATETIME NOT NULL DEFAULT GETDATE(),
	CONSTRAINT PK_SubCategoria PRIMARY KEY (SubCategoriaID),
	CONSTRAINT FK_SubCategoria_Categoria FOREIGN KEY (CategoriaID) REFERENCES Categoria(CategoriaID)
)
GO