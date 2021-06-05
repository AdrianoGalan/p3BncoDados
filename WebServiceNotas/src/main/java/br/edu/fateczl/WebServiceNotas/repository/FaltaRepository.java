package br.edu.fateczl.WebServiceNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.Falta;
import br.edu.fateczl.WebServiceNotas.model.id.FaltaId;

public interface FaltaRepository extends JpaRepository<Falta, FaltaId>{

}
