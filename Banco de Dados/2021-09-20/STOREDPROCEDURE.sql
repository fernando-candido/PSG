CREATE PROCEDURE PR_ProdutosPorCategoriaESubategoria
AS
SELECT 
	PRO.CategoriaID, 
	CAT.Descricao AS CategoriaDescricao, 
	PRO.SubCategoriaID, 
	SUB.Descricao AS SubCategoriaDescricao,
	PRO.ProdutoID, 
	PRO.Descricao AS ProdutoDescricao
FROM PRODUTO AS PRO
	INNER JOIN Categoria AS CAT ON PRO.CategoriaID = CAT.CategoriaID
	INNER JOIN SubCategoria AS SUB ON PRO.SubCategoriaID = SUB.SubCategoriaID
--WHERE (PRO.CategoriaID = 10 AND PRO.SubCategoriaID = 65)
GO


--Executando uma storedprocesdure.
EXECUTE [dbo].[PR_ProdutosPorCategoriaESubategoria];



----- RASCUNHO CRIANDO PROCEDURE COM PESQUISA (COMPLETO)

--CREATE PROCEDURE dbo.PR_ProdutosPorCategoria
--  @CategoriaID INT,
--  @SubCategoriaID INT

--AS
--SELECT 
--	PRO.CategoriaID, 
--	CAT.Descricao AS CategoriaDescricao, 
--	PRO.SubCategoriaID, 
--	SUB.Descricao AS SubCategoriaDescricao,
--	PRO.ProdutoID, 
--	PRO.Descricao AS ProdutoDescricao
--FROM PRODUTO AS PRO
--	INNER JOIN Categoria AS CAT ON PRO.CategoriaID = CAT.CategoriaID
--	INNER JOIN SubCategoria AS SUB ON PRO.SubCategoriaID = SUB.SubCategoriaID
--	WHERE (PRO.CategoriaID = @CategoriaID) AND (PRO.SubCategoriaID = @SubCategoriaID)

--GO

--EXECUTE dbo.PR_ProdutosPorCategoria  8, 54