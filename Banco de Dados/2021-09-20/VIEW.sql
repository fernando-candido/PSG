
---- Criando uma View.
---- 
--CREATE VIEW dbo.VW_ProdutosPorCategoriaESubategoria
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
----WHERE (PRO.CategoriaID = 10 AND PRO.SubCategoriaID = 65)
--GO

----- PrimeiraVIEW
----SELECT CategoriaID,
----CategoriaDescricao,
----SubCategoriaID,
----SubCategoriaDescricao,
----ProdutoID,
----ProdutoDescricao
----FROM  VW_ProdutosPorCategoriaESubategoria 
----WHERE CategoriaID = 10 AND SubCategoriaID = 65
----GO



--SELECT VW.CategoriaID,
--VW.CategoriaDescricao,
--VW.SubCategoriaID,
--VW.SubCategoriaDescricao,
--VW.ProdutoID,
--VW.ProdutoDescricao,
--PRO.DateInsert
--FROM  VW_ProdutosPorCategoriaESubategoria  AS VW -- dando apelido para view
--INNER JOIN Produto AS PRO ON VW.ProdutoID = PRO.ProdutoID
--WHERE (VW.CategoriaID = 10)  AND (VW.SubCategoriaID = 65)
--GO



-- ctrl + shift + u --> deixar tudo maiusculo

--SELECT COUNT(*)  as teste
--FROM  VW_ProdutosPorCategoriaESubategoria
--WHERE (CategoriaID = 10)  AND (SubCategoriaID = 65)


