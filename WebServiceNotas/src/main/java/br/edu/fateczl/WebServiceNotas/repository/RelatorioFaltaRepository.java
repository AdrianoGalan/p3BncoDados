package br.edu.fateczl.WebServiceNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.RelatorioFalta;

public interface RelatorioFaltaRepository extends JpaRepository<RelatorioFalta, Integer> {
	
	List<RelatorioFalta> listRelatorioFaltaCodigoDisciplina(int codigo);



}
