USE SIGA
GO

CREATE FUNCTION FN_MATRICULADO_NOTA(@CODIGO_DISCIPLINA INT)
RETURNS @table TABLE (

ID          INT IDENTITY,
RA		    INT,
NOME		VARCHAR(MAX),
P1          DECIMAL(4,2),
P2          DECIMAL(4,2),
P3          DECIMAL(4,2),
T           DECIMAL(4,2),
PP          DECIMAL(4,2)
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

DECLARE @I AS INT,
        @SIZE AS INT,
        @RA_ALUNO AS INT

SET @I = 1
SET @SIZE = (SELECT count(*) FROM  @table)

WHILE(@I <= @SIZE)
BEGIN

    SET @RA_ALUNO = (SELECT RA FROM @table WHERE ID = @I)

    UPDATE  @table 
    SET P1 = (SELECT NOTA FROM FN_NOTA_ALUNO(@CODIGO_DISCIPLINA, 'P1', @RA_ALUNO))
    WHERE RA = @RA_ALUNO

    UPDATE @table
    SET P2 = (SELECT NOTA FROM FN_NOTA_ALUNO(@CODIGO_DISCIPLINA, 'P2', @RA_ALUNO))
    WHERE RA = @RA_ALUNO

    UPDATE @table
    SET P3 = (SELECT NOTA FROM FN_NOTA_ALUNO(@CODIGO_DISCIPLINA, 'P3', @RA_ALUNO))
    WHERE RA = @RA_ALUNO

    UPDATE @table
    SET T = (SELECT NOTA FROM FN_NOTA_ALUNO(@CODIGO_DISCIPLINA, 'T', @RA_ALUNO))
    WHERE RA = @RA_ALUNO

    UPDATE @table
    SET PP = (SELECT NOTA FROM FN_NOTA_ALUNO(@CODIGO_DISCIPLINA, 'PP', @RA_ALUNO))
    WHERE RA = @RA_ALUNO
    


    SET @I = @I + 1
END

    RETURN

END
