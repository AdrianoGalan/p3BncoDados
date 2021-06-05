
package br.edu.fateczl.WebServiceNotas.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.service.JasperService;

import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

@CrossOrigin
@RestController
@RequestMapping("/")
public class RelatorioJasperController {
	

	@Autowired
	private JasperService service;
	
	
	@GetMapping("/relatorio/jasper/{nome}/{codigo}")
	public void generateRelatorio(HttpServletResponse response, @PathVariable(value = "codigo") int codigo, @PathVariable(value = "nome") String nome) throws IOException{
	
		service.addParams("DISCIPLINA", codigo);
		
		byte[] bytes = service.exportarPdf(nome);
		response.setContentType(MediaType.APPLICATION_PDF_VALUE);
		response.setHeader("Content-disposition", "inline; filename=relatorio.pdf");
		response.getOutputStream().write(bytes);
		
	
	}
	
	


}
