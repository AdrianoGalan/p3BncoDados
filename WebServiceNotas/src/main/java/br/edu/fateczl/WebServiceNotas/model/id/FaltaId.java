package br.edu.fateczl.WebServiceNotas.model.id;

import java.io.Serializable;

public class FaltaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int aluno;
	private int aula;

	public FaltaId() {
	}

	public FaltaId(int aluno, int aula) {
		super();
		this.aluno = aluno;
		this.aula = aula;

	}

	public int getAluno() {
		return aluno;
	}

	public void setAluno(int aluno) {
		this.aluno = aluno;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

}
