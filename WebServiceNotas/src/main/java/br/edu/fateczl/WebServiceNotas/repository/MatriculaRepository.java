package br.edu.fateczl.WebServiceNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.model.entity.AlunoComFalta;
import br.edu.fateczl.WebServiceNotas.model.entity.AlunoComNota;
import br.edu.fateczl.WebServiceNotas.model.entity.Disciplina;
import br.edu.fateczl.WebServiceNotas.model.entity.Matricula;
import br.edu.fateczl.WebServiceNotas.model.id.MatriculaId;

public interface MatriculaRepository extends JpaRepository<Matricula, MatriculaId> {
	
	List<Aluno> listAlunoByCodigoDisciplina(int codigoDisciplina);
	List<Disciplina> listDisciplinaByRaAluno(int raAlino);
	List<AlunoComNota> listAlunoComNota(int codigoDisciplina);
	List<AlunoComFalta> listAlunoComFalta(int codigoDisciplina, String data);
	
	
	

}
