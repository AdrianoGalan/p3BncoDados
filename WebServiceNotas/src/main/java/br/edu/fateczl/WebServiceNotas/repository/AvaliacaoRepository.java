package br.edu.fateczl.WebServiceNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer>  {

}
