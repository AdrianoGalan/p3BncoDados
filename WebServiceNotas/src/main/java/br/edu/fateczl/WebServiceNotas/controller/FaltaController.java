package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.fateczl.WebServiceNotas.model.entity.Falta;
import br.edu.fateczl.WebServiceNotas.repository.FaltaRepository;

@RestController
@RequestMapping("/")
public class FaltaController {
	
	@Autowired
	private FaltaRepository fRep;
	
	@CrossOrigin
	@GetMapping("/falta")
	public List<Falta> getAllFalta(){
		List<Falta> listaFaltas = fRep.findAll();
		return listaFaltas;
	}
	
	@CrossOrigin
	@PostMapping("/disciplina/add/falta")
	public ResponseEntity<String> insertFalta(@Valid @RequestBody Falta f) {
		fRep.save(f);
		return ResponseEntity.ok("falta adicionado");

	}
	
	@CrossOrigin
	@PutMapping("/disciplina/add/falta")
	public ResponseEntity<String> atualizaFalta(@Valid @RequestBody Falta f) {
		fRep.save(f);
		return ResponseEntity.ok("falta Atualizado");

	}
	
	
}
