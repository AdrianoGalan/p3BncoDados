package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(name = "RelatorioNota.listRelatorioNotaCodigoDisciplina", 
							query = "SELECT ID, RA_ALUNO, NOME_ALUNO, P1, P2, P3, T,MEDIA_FINAL, NUM_FALTA, SITUACAO from FN_NOTASTUMA(?1)", 
							resultClass = RelatorioNota.class)
public class RelatorioNota {

	@Id
	@Column
	private int id;
	@Column(name = "RA_ALUNO")
	private int ra;
	@Column(name = "NOME_ALUNO")
	private String nome;
	@Column
	private Double p1;
	@Column
	private Double p2;
	@Column
	private Double p3;
	@Column
	private Double t;
	@Column(name = "MEDIA_FINAL")
	private Double mediaFinal;
	@Column(name = "NUM_FALTA")
	private Integer numFaltas;
	@Column
	private String situacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {

		if (p1.equals(null)) {
			this.p1 = 0.0;
		} else {
			this.p1 = p1;
		}

	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		if (p2.equals(null)) {
			this.p2 = 0.0;
		} else {
			this.p2 = p2;
		}
	}

	public Double getP3() {
		return p3;
	}

	public void setP3(Double p3) {
		if (p3.equals(null)) {
			this.p3 = 0.0;
		} else {
			this.p3 = p3;
		}
	}

	public Double getT() {
		return t;
	}

	public void setT(Double t) {
		if (t.equals(null)) {
			this.t = 0.0;
		} else {
			this.t = t;
		}
	}

	public Double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(Double mediaFinal) {
		if (mediaFinal.equals(null)) {
			this.mediaFinal = 0.0;
		} else {
			this.mediaFinal = mediaFinal;
		}
	}

	public Integer getNumFaltas() {
		return numFaltas;
	}

	public void setNumFaltas(Integer numFaltas) {
		if (numFaltas.equals(null)) {
			this.numFaltas = 0;
		} else {
			this.numFaltas = numFaltas;
		}
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "RelatorioNota [id=" + id + ", ra=" + ra + ", nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3
				+ ", t=" + t + ", mediaFinal=" + mediaFinal + ", numFaltas=" + numFaltas + ", situacao=" + situacao
				+ "]";
	}

}
