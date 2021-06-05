package br.edu.fateczl.WebServiceNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	Aluno alunoByRa(int ra);
	

}
