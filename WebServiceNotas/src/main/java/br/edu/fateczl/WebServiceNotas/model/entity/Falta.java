package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.fateczl.WebServiceNotas.model.id.FaltaId;

@Entity
@Table(name = "FALTAS")
@IdClass(FaltaId.class)
public class Falta {

	@Id
	@OneToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "ra_aluno")
	private Aluno aluno;

	@Id
	@OneToOne(targetEntity = Aula.class)
	@JoinColumn(name = "ID_AULA")
	private Aula aula;

	@Column
	private int falta;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		this.falta = falta;
	}

	@Override
	public String toString() {
		return "Falta [aluno=" + aluno + ", aula=" + aula + ", falta=" + falta + "]";
	}

}
