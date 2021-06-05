package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Aulas")
@NamedNativeQuery(name = "Aula.aulasDataByCodigoDisciplina", 
				 query = "SELECT ID, CODIGO_DISCIPLINA, DATA, HORARIO"
						+ " FROM FN_DATA_AULAS(?1)", resultClass = Aula.class)
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@OneToOne(targetEntity = Disciplina.class)
	@JoinColumn(name = "CODIGO_DISCIPLINA")
	private Disciplina disciplina;

	@Column
	private String data;

	@Column
	private String horario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", disciplina=" + disciplina + ", data=" + data + ", horario=" + horario + "]";
	}

}
