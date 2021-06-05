package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.model.entity.AlunoComFalta;
import br.edu.fateczl.WebServiceNotas.model.entity.AlunoComNota;
import br.edu.fateczl.WebServiceNotas.model.entity.Disciplina;
import br.edu.fateczl.WebServiceNotas.model.entity.Matricula;
import br.edu.fateczl.WebServiceNotas.repository.MatriculaRepository;

@RestController
@RequestMapping("/")
public class MatriculaController {

	@Autowired
	private MatriculaRepository mRep;

	@CrossOrigin
	@GetMapping("/matricula")
	public List<Matricula> getAllFalta() {
		List<Matricula> listaMatricula = mRep.findAll();
		return listaMatricula;
	}

	@CrossOrigin
	@GetMapping("/disciplina/aluno/{codigoDisciplina}")
	public List<Aluno> getAlunosByRa(@PathVariable(value = "codigoDisciplina") int codigoDisciplina) {

		List<Aluno> listAluno = mRep.listAlunoByCodigoDisciplina(codigoDisciplina);
		return listAluno;

	}
	
	@CrossOrigin
	@GetMapping("/disciplina/aluno/nota/{codigoDisciplina}")
	public List<AlunoComNota> getAlunosComNotaByCodigo(@PathVariable(value = "codigoDisciplina") int codigoDisciplina) {
		
		List<AlunoComNota> listAluno = mRep.listAlunoComNota(codigoDisciplina);
		return listAluno;
		
	}
	
	@CrossOrigin
	@GetMapping("/disciplina/aluno/falta/{codigoDisciplina}/{data}")
	public List<AlunoComFalta> getAlunosComFaltaByCodigo(@PathVariable(value = "codigoDisciplina") int codigoDisciplina, @PathVariable(value = "data") String data) {
		
		System.out.println(codigoDisciplina);
		System.out.println(data);
		
		List<AlunoComFalta> listAluno = mRep.listAlunoComFalta(codigoDisciplina, data);
		return listAluno;
		
	}

	@CrossOrigin
	@GetMapping("/disciplina/list/{raAluno}")
	public List<Disciplina> getDisciplinaByRa(@PathVariable(value = "raAluno") int raAluno) {

		List<Disciplina> lisDisciplina = mRep.listDisciplinaByRaAluno(raAluno);
		return lisDisciplina;

	}
	
	@CrossOrigin
	@DeleteMapping("/disciplina/matricula/del")
	public ResponseEntity<String> deleleDisciplinaByRa(@Valid @RequestBody Matricula m) {

		mRep.delete(m);
		return ResponseEntity.ok("matricula cancelada");

	}

	@CrossOrigin
	@PostMapping("/disciplina/add")
	public ResponseEntity<String> insertMatricula(@Valid @RequestBody Matricula m) {
	
		mRep.save(m);

		return ResponseEntity.ok("Aluno matriculado");

	}

}
