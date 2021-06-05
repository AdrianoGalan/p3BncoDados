package br.edu.fateczl.WebServiceNotas.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Service
public class JasperService {

	private static final String JASPER_DIRETORIO = "classpath:jasper/";
	private static final String JASPER_SUFIXO = ".jasper";

	@Autowired
	private Connection connection;

	private Map<String, Object> params = new HashMap<String, Object>();

	public void addParams(String key, Object value) {

		this.params.put(key, value);

	}

	public byte[] exportarPdf(String nomeRelatorio) {
		

		byte[] bytes = null;
		try {
			File file = ResourceUtils.getFile(JASPER_DIRETORIO.concat(nomeRelatorio).concat(JASPER_SUFIXO));
			JasperPrint print = JasperFillManager.fillReport(file.getAbsolutePath(), params, connection);
			bytes = JasperExportManager.exportReportToPdf(print);
			
		} catch (FileNotFoundException | JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bytes;
	}

}