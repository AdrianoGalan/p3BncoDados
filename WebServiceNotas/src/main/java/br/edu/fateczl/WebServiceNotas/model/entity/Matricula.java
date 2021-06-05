package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import br.edu.fateczl.WebServiceNotas.model.id.MatriculaId;

@Entity
@Table(name = "MATRICULA")
@IdClass(MatriculaId.class)
@NamedNativeQuery(
		name = "Matricula.listAlunoByCodigoDisciplina",
		query = "SELECT ra, nome from fn_matriculado(?1) ",
		resultClass = Aluno.class)
@NamedNativeQuery(
		name = "Matricula.listDisciplinaByRaAluno",
		query = "SELECT CODIGO ,NOME, SIGLA, TURNO, NUM_AULAS from FN_DISCIPLINA_ALUNO(?1) ",
		resultClass = Disciplina.class)
@NamedNativeQuery(
		name = "Matricula.listAlunoComNota",
		query = "SELECT id, ra, nome, p1, p2, p3, t, pp from FN_MATRICULADO_NOTA(?1) ",
		resultClass = AlunoComNota.class)
@NamedNativeQuery(
		name = "Matricula.listAlunoComFalta",
		query = "SELECT id, ra, nome, falta FROM FN_MATRICULADO_FALTA(?1, ?2) ",
		resultClass = AlunoComFalta.class)
public class Matricula {

	@Id
	@ManyToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "ra_aluno", referencedColumnName = "ra")
	private Aluno aluno;

	@Id
	@ManyToOne(targetEntity = Disciplina.class)
	@JoinColumn(name = "CODIGO_DISCIPLINA", referencedColumnName = "codigo")
	private Disciplina disciplina;

	@Id
	@Column(name = "ANO_SEMESTRE")
	private int anoSemestre;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public int getAnoSemestre() {
		return anoSemestre;
	}

	public void setAnoSemestre(int anoSemestre) {
		this.anoSemestre = anoSemestre;
	}

	@Override
	public String toString() {
		return "Matricula [aluno=" + aluno + ", disciplina=" + disciplina + ", anoSemestre=" + anoSemestre + "]";
	}

}
