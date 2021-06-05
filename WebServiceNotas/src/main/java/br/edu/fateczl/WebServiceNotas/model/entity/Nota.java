package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.fateczl.WebServiceNotas.model.id.NotaId;

@Entity
@Table(name = "NOTAS")
@IdClass(NotaId.class)
public class Nota {

	@Id
	@OneToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "ra_aluno")
	private Aluno aluno;

	@Id
	@OneToOne(targetEntity = Disciplina.class)
	@JoinColumn(name = "codigo_disciplina")
	private Disciplina disciplina;

	@Id
	@OneToOne(targetEntity = Avaliacao.class)
	@JoinColumn(name = "codigo_avaliacao")
	private Avaliacao avaliacao;

	@Column
	private float nota;

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

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Nota [aluno=" + aluno + ", disciplina=" + disciplina + ", avaliacao=" + avaliacao + ", nota=" + nota
				+ "]";
	}

}
