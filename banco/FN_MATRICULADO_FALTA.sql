USE SIGA
GO

CREATE FUNCTION FN_MATRICULADO_FALTA(@CODIGO_DISCIPLINA INT, @DATA DATE)
RETURNS @table TABLE (

    ID INT IDENTITY,
    RA INT,
    NOME VARCHAR(MAX),
    FALTA INT
)
AS
BEGIN
    INSERT INTO @table
        (RA, NOME)
    SELECT RA, NOME
    FROM FN_MATRICULADO_NOTA(@CODIGO_DISCIPLINA)
    ORDER BY NOME

    DECLARE @I AS INT,
        @SIZE AS INT,
        @RA_ALUNO AS INT,
        @FALTA AS INT

    SET @I = 1
    SET @SIZE = (SELECT count(*)
    FROM @table)

    WHILE(@I <= @SIZE)
    BEGIN

        SET @RA_ALUNO = (SELECT RA
        FROM @table
        WHERE ID = @I)

        SET @FALTA = ( SELECT F.FALTA
        FROM AULAS A
            INNER JOIN FALTAS F
            ON F.ID_AULA = A.ID
            INNER JOIN DISCIPLINA D
            ON D.CODIGO = A.CODIGO_DISCIPLINA
            INNER JOIN ALUNO AL
            ON AL.RA = F.RA_ALUNO
        WHERE D.CODIGO = @CODIGO_DISCIPLINA AND AL.RA = @RA_ALUNO AND A.[DATA] = @DATA)

        UPDATE  @table 
        SET FALTA = @FALTA
        WHERE RA = @RA_ALUNO


        SET @I = @I + 1

    END


    RETURN
END