package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlunoComFalta {

	@Id
	@Column
	private Integer id;
	@Column
	private Integer ra;
	@Column
	private String nome;
	@Column
	private Integer falta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getFalta() {
		return falta;
	}

	public void setFalta(Integer falta) {
		this.falta = falta;
	}

	@Override
	public String toString() {
		return "AlunoComFalta [id=" + id + ", ra=" + ra + ", nome=" + nome + ", falta=" + falta + "]";
	}

}
