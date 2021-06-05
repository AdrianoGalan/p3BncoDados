package br.edu.fateczl.WebServiceNotas.model.id;

import java.io.Serializable;


public class NotaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int aluno;
	private int disciplina;
	private int avaliacao;

	public NotaId() {
		super();
	}

	public NotaId(int aluno, int disciplina, int avaliacao) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.avaliacao = avaliacao;
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

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

}
