package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Avaliacao;
import br.edu.fateczl.WebServiceNotas.repository.AvaliacaoRepository;

@RestController
@RequestMapping("/")
public class AvaliacaoController {
	
	@Autowired
	private AvaliacaoRepository avRep;
	
	@GetMapping("/avaliacao")
	public List<Avaliacao> getAllAvaliacao(){
		List<Avaliacao> listaAvaliacoes = avRep.findAll();
		return listaAvaliacoes;
	}

}
