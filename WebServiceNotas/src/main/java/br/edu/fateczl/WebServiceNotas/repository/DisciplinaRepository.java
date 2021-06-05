package br.edu.fateczl.WebServiceNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer > {
	
	Disciplina disciplinaByCodigo(int codigo);

}
