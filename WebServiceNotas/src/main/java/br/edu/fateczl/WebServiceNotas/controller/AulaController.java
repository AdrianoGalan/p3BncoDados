package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.fateczl.WebServiceNotas.model.entity.Aula;
import br.edu.fateczl.WebServiceNotas.model.entity.RelatorioDataAula;
import br.edu.fateczl.WebServiceNotas.repository.AulaRepository;
import br.edu.fateczl.WebServiceNotas.util.Convert;

@RestController
@RequestMapping("/")
public class AulaController {

	@Autowired
	private AulaRepository aRep;

	public AulaController() {
		super();
	}

	@CrossOrigin
	@GetMapping("/aula")
	public List<Aula> getAllAulas() {

		List<Aula> listaAula = aRep.findAll();
		return listaAula;

	}
	
	@CrossOrigin
	@GetMapping("/disciplina/aula/falta/{codigo}")
	public List<Aula> getDataAulaByCodigoDisciplina(@PathVariable(value = "codigo") int codigo) {
		
		List<Aula> listaAula = aRep.aulasDataByCodigoDisciplina(codigo);
		return listaAula;
		
	}
	
	@CrossOrigin
	@GetMapping("/disciplina/aula/data/{codigo}")
	public RelatorioDataAula getData(@PathVariable(value = "codigo") int codigo) {
		
		
		Convert con = new Convert();		
		List<Aula> listaAula = aRep.aulasDataByCodigoDisciplina(codigo);
		RelatorioDataAula rDa = con.convertDatasEmData(listaAula);
		
		return rDa;
		
	}
	

}
