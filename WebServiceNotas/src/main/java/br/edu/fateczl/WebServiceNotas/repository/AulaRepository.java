package br.edu.fateczl.WebServiceNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fateczl.WebServiceNotas.model.entity.Aula;

public interface AulaRepository extends JpaRepository<Aula, Integer> {

	List<Aula> aulasDataByCodigoDisciplina(int codigoDisciplina);

}
