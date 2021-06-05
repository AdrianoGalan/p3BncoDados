package br.edu.fateczl.WebServiceNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.Nota;
import br.edu.fateczl.WebServiceNotas.model.id.NotaId;

public interface NotaRepository  extends JpaRepository<Nota, NotaId> {

}
