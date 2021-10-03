--SELECT * FROM [Dados-Municipios-IBGE7]
--SELECT COUNT(*) FROM[dbo].[Lista_Municipios_IBGE_Brasil]


INSERT INTO Novo_Conjunto_Municipio_IBGE
(MunicipioID, Descricao, IBGE, IBGE7, UFID, SiglaUF, Regiao, Populacao_2010, Porte, Capital)
SELECT
Dados.MunicipioID,
Dados.Nome,
Lista.IBGE,
Dados.IBGE7,
Dados.UFID,
Dados.UF,
Lista.Regiao,
CAST(Lista.[Populacao_2010] AS INT) AS Populacao2010,
Lista.Porte,
	CASE Lista.Capital
		WHEN 'NULL' THEN 0
		ELSE 1
	END AS CapitalBit
FROM   [dbo].[Dados-Municipios-IBGE7] AS Dados
INNER JOIN [dbo].[Lista_Municipios_IBGE_Brasil] AS Lista ON Dados.IBGE7 = Lista.IBGE7
ORDER BY Dados.MunicipioID

SELECT * FROM Novo_Conjunto_Municipio_IBGE

--------------------------------------------------------------------------------------------------

CREATE TABLE Novo_Conjunto_Municipio_IBGE(
	MunicipioID INT NOT NULL,
	Descricao VARCHAR (MAX) NOT NULL,
	IBGE INT NOT NULL,
	IBGE7 INT NOT NULL,
	UFID INT NOT NULL,
	SiglaUF CHAR(2) NOT NULL,
	Regiao VARCHAR(50) NOT NULL,
	Populacao_2010 INT NOT NULL,
	Porte VARCHAR(50) NOT NULL,
	Capital BIT NOT NULL,
)

DROP TABLE Novo_Conjunto_Municipio_IBGE

--INSERT INTO Novo_Conjunto_Municipio_IBGE
--(MunicipioID, Descricao, IBGE, IBGE7, UFID, SilgaUF, Regiao, Populacao2010, Porte, Capital)

/*
NA POSIÇÃO DO SELECT O TIPO TEM QUE ESTAR CERTO COMO NA TABELA.

*/


--SELECT [Populacao_2010] FROM [dbo].[Lista_Municipios_IBGE_Brasil]
--WHERE [Populacao_2010] IS NULL

--SELECT IBGE7, UF, Municipio, CAST(Populacao_2010 AS INT) AS Populacao
--FROM [dbo].[Lista_Municipios_IBGE_Brasil]


--WHERE (Populacao_2010 )


--UPDATE [dbo].[Lista_Municipios_IBGE_Brasil]
--SET Populacao_2010 = '0'
--WHERE (Populacao_2010 = 'NULL')


SELECT 
IBGE7,
UF, Municipio,
CASE Capital
		WHEN 'NULL' THEN 0
		ELSE 1
	END AS CapitalBit
FROM [dbo].[Lista_Municipios_IBGE_Brasil]


SELECT Capital FROM [dbo].[Lista_Municipios_IBGE_Brasil]
WHERE Capital = 1
