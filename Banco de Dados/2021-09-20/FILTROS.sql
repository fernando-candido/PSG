SELECT  ProdutoID, SubCategoriaID, CategoriaID , Descricao, DateInsert
FROM   Produto
WHERE (Descricao LIKE '%Carne%')
--ORDER BY CategoriaID 
-- LIKE, USAMOS O % PARA DEFINIR O FILTRO EXEMPLOS:
/*
Carne% = Tudo que tem carne no começo.
%Carne = Tudo que tem carne no final da frase.
%Carne% = Tudo que tem carne no meio da palavra.
*/

--SELECT @@VERSION -- VERSÃO DO BANCO QUE ESTAMOS.
