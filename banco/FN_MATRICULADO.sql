USE SIGA
GO

CREATE FUNCTION FN_MATRICULADO(@CODIGO_DISCIPLINA INT)
RETURNS @table TABLE (

RA		INT,
NOME		VARCHAR(MAX)
)
AS
BEGIN

INSERT INTO @table(RA, NOME)
SELECT A.RA, A.NOME FROM ALUNO A
INNER JOIN MATRICULA M
ON M.RA_ALUNO = A.RA
INNER JOIN DISCIPLINA D
ON D.CODIGO = M.CODIGO_DISCIPLINA
WHERE D.CODIGO = @CODIGO_DISCIPLINA

    RETURN

END
