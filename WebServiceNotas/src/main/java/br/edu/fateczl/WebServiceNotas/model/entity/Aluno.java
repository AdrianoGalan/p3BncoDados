package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNO")
@NamedNativeQuery(name = "Aluno.alunoByRa", query = "SELECT RA, NOME " + "FROM ALUNO "
		+ "WHERE RA = (?1) ORDER BY NOME", resultClass = Aluno.class)
public class Aluno {

	@Id
	@Column
	private Integer ra;

	@Column
	private String nome;

	public Aluno() {
		super();
	}

	public Aluno(Integer ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}

	public Integer getRa() {
		return ra;
	}

	public void setRa(Integer ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + "]";
	}

}
