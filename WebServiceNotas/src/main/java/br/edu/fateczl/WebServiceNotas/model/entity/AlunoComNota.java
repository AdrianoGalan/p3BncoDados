package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlunoComNota {

	@Id
	@Column
	private Integer id;
	@Column
	private Integer ra;
	@Column
	private String nome;
	@Column
	private Integer p1;
	@Column
	private Integer p2;
	@Column
	private Integer p3;
	@Column
	private Integer t;
	@Column
	private Integer pp;

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

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {

		if (p1.equals(null)) {
			this.p1 = 0;
		} else {
			this.p1 = p1;
		}

	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		if (p2.equals(null)) {
			this.p2 = 0;
		} else {
			this.p2 = p2;
		}
	}

	public Integer getP3() {
		return p3;
	}

	public void setP3(Integer p3) {
		if (p3.equals(null)) {
			this.p3 = 0;
		} else {
			this.p3 = p3;
		}
	}

	public Integer getT() {
		return t;
	}

	public void setT(Integer t) {
		if (t.equals(null)) {
			this.t = 0;
		} else {
			this.t = t;
		}
	}

	public Integer getPp() {
		return pp;
	}

	public void setPp(Integer pp) {
		if (pp.equals(null)) {
			this.pp = 0;
		} else {
			this.pp = pp;
		}
	}

	@Override
	public String toString() {
		return "AlunoComNota [id=" + id + ", ra=" + ra + ", nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3
				+ ", t=" + t + ", pp=" + pp + "]";
	}

}
