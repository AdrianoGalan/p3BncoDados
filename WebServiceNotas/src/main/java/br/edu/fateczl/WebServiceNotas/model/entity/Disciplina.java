package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DISCIPLINA")
@NamedNativeQuery(name = "Disciplina.disciplinaByCodigo", query = "SELECT CODIGO, NOME, SIGLA, TURNO, NUM_AULAS "
		+ "FROM DISCIPLINA " + "WHERE CODIGO = (?1)", resultClass = Disciplina.class)
public class Disciplina {

	@Id
	@Column
	private Integer codigo;
	@Column
	private String nome;
	@Column
	private String sigla;
	@Column
	private String turno;
	@Column(name = "NUM_AULAS")
	private Integer numAulas;

	public Disciplina() {
		super();
	}

	public Disciplina(Integer codigo, String nome, String sigla, String turno, Integer numAulas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
		this.turno = turno;
		this.numAulas = numAulas;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Integer getNumAulas() {
		return numAulas;
	}

	public void setNumAulas(Integer numAulas) {
		this.numAulas = numAulas;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + ", turno=" + turno
				+ ", numAulas=" + numAulas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numAulas == null) ? 0 : numAulas.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		return result;
	}
	
	

}
