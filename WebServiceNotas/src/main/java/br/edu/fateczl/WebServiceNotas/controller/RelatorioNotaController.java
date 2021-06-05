package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.RelatorioNota;
import br.edu.fateczl.WebServiceNotas.repository.RelatorioNotaRepository;

@RestController
@RequestMapping("/")
public class RelatorioNotaController {

	@Autowired
	private RelatorioNotaRepository rRep;

	@CrossOrigin
	@GetMapping("/relatorio/{codigo}")
	public List<RelatorioNota> getRelatorioNotaCodigo(@PathVariable(value = "codigo") int codigo) {

		List<RelatorioNota> relatorioNota = rRep.listRelatorioNotaCodigoDisciplina(codigo);
		return relatorioNota;

	}

}
