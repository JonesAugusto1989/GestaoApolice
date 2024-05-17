package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.ApoliceVidaService;

@Component
public class ApoliceVidaLoader implements ApplicationRunner{

	@Autowired
	private ApoliceVidaService apoliceVidaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Integer id=0;
		
		
		FileReader file = new FileReader("ApoliceVida.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
		
			ApoliceVida apoliceVida = new ApoliceVida();
			apoliceVida.setApoliceContratante((campos[0]));
			apoliceVida.setSeguradoraContratada((campos[1]));
			apoliceVida.setId(++id);
			valor.parseFloat(campos[2]);
			apoliceVida.setValor(Float.valueOf(campos[2]));
			
			
			apoliceVidaService.incluir(apoliceVida);
		
			linha = leitura.readLine();
		}
		
	
		
		for(ApoliceVida apolice: apoliceVidaService.exibir()) {
			
			System.out.println("Banco Vida: "+ apolice);
		}
		
		
		
		leitura.close();
	}

}
