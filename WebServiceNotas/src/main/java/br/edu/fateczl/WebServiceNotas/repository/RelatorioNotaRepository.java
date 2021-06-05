package br.edu.fateczl.WebServiceNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.RelatorioNota;

public interface RelatorioNotaRepository extends JpaRepository<RelatorioNota, Integer> {
	
	List<RelatorioNota> listRelatorioNotaCodigoDisciplina(int codigo);

}
