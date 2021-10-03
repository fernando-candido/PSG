CREATE TABLE Produto (
	ProdutoID INT NOT NULL IDENTITY(1,1),
	SubCategoriaID INT NOT NULL,
	CategoriaID INT NOT NULL,
	descricao VARCHAR(MAX) NOT NULL,
	CONSTRAINT PK_Produto PRIMARY KEY (ProdutoID),
	CONSTRAINT FK_Produto_SubCategoria FOREIGN KEY (SubcategoriaID) REFERENCES SubCategoria(SubCategoriaID)
)
GO