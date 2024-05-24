package br.edu.infnet.AppJones;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.service.ApoliceAutoService;

//@Component
public class ApoliceAutoLoader implements ApplicationRunner {
	
	@Autowired
	private ApoliceAutoService apoliceAutoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		
		FileReader file = new FileReader("ApoliceAuto.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
		
			ApoliceAuto apoliceAuto = new ApoliceAuto();
			apoliceAuto.setApoliceContratante(campos[0]);
		
			apoliceAuto.setSeguradoraContratada(campos[1]);
			
			apoliceAuto.setValor(Float.valueOf(campos[2]));
			
			apoliceAuto.setNumero(campos[3]);
			
			apoliceAuto.setPlaca(campos[4]);
			
			apoliceAuto.setBeneficiario(campos[5]);
			apoliceAutoService.incluir(apoliceAuto);
			
			System.out.println(apoliceAuto);
			linha = leitura.readLine();
		}
		
		
		for(ApoliceAuto apolice: apoliceAutoService.exibir()) {
			System.out.println("Banco Apolice: "+ apolice);
		}
		
		leitura.close();
	}

}
