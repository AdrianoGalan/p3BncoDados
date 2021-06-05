package br.edu.fateczl.WebServiceNotas.model.id;

import java.io.Serializable;



public class MatriculaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int aluno;
	private int disciplina;
	private int anoSemestre;

	public MatriculaId() {
		super();
	}

	public MatriculaId(int aluno, int disciplina, int anoSemestre) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.anoSemestre = anoSemestre;
	}

	public int getAluno() {
		return aluno;
	}

	public void setAluno(int aluno) {
		this.aluno = aluno;
	}

	public int getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(int disciplina) {
		this.disciplina = disciplina;
	}

	public int getAnoSemestre() {
		return anoSemestre;
	}

	public void setAnoSemestre(int anoSemestre) {
		this.anoSemestre = anoSemestre;
	}

}
