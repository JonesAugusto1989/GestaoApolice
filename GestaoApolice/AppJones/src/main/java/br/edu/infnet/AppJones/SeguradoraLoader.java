package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.SeguradoraService;

@Component
public class SeguradoraLoader implements ApplicationRunner{

	@Autowired
	private SeguradoraService seguradoraService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("Seguradora.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		
		
		while(linha!=null) {
			campos = linha.split(";");
		
			Seguradora segurador = new Seguradora();
			segurador.setCpf_cnpj(campos[0]);
			segurador.setNome(campos[1]);
			segurador.setEmail(campos[2]);
			seguradoraService.incluir(segurador);
			
			linha = leitura.readLine();
			
			
		}
		leitura.close();
		System.out.println("=====================================");
		System.out.println("Iniciando o processamento: ");
		
		for(Seguradora seguradora : seguradoraService.exibir()) {
			System.out.println("entrou");
			System.out.println("Banco Service: "+seguradora);
		}
		
		System.out.println("Processamento finalizado com sucesso.");
		System.out.println("=====================================");
	}
	
}
