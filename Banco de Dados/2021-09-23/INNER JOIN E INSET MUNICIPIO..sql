SET IDENTITY_INSERT Municipio ON
INSERT INTO Municipio (MunicipioID, Descricao, IBGE, IBGE7, UFID,
SiglaUF, Regiao, MesoregiaoID, MicroregiaoID, Populacao_2010, Porte, Capital)
SELECT
NovoConjunto.MunicipioID,
NovoConjunto.Descricao,
NovoConjunto.IBGE,
NovoConjunto.IBGE7,
Complementar.UFID,
NovoConjunto.SiglaUF,
NovoConjunto.Regiao,
Complementar.MesoregiaoID,
Complementar.MicroregiaoID,
NovoConjunto.Populacao_2010,
NovoConjunto.Porte,
NovoConjunto.Capital
FROM [dbo].[Novo_Conjunto_Municipio_IBGE] AS NovoConjunto
INNER JOIN [dbo].[Lista_Municipios_Complementar_IBGE] AS Complementar
ON NovoConjunto.MunicipioID = Complementar.MunicipioID
ORDER BY NovoConjunto.MunicipioID
SET IDENTITY_INSERT Municipio OFF


SELECT * FROM Municipio

CREATE TABLE Municipio(
	MunicipioID INT NOT NULL IDENTITY(1,1),
	Descricao VARCHAR (MAX) NOT NULL,
	IBGE INT NOT NULL,
	IBGE7 INT NOT NULL,
	UFID INT NOT NULL,
	SiglaUF CHAR(2) NOT NULL,
	Regiao VARCHAR(50) NOT NULL,
	MesoregiaoID INT NOT NULL,
	MicroregiaoID INT NOT NULL,
	Populacao_2010 INT NOT NULL,
	Porte VARCHAR(50) NOT NULL,
	Capital BIT NOT NULL,
	DataInsert DATETIME NULL DEFAULT GETDATE(),
	CONSTRAINT PK_Municipio PRIMARY KEY (MunicipioID)
)

drop table municipio
SELECT * FROM Municipio




SELECT
NovoConjunto.MunicipioID,
NovoConjunto.Descricao,
NovoConjunto.IBGE,
NovoConjunto.IBGE7,
Complementar.UFID,
NovoConjunto.SiglaUF,
NovoConjunto.Regiao,
Complementar.MesoregiaoID,
Complementar.MicroregiaoID,
NovoConjunto.Populacao_2010,
NovoConjunto.Porte,
NovoConjunto.Capital
FROM [dbo].[Novo_Conjunto_Municipio_IBGE] AS NovoConjunto
INNER JOIN [dbo].[Lista_Municipios_Complementar_IBGE] AS Complementar
ON NovoConjunto.MunicipioID = Complementar.MunicipioID



