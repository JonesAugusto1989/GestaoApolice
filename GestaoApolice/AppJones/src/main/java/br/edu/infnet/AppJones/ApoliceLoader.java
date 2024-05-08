package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;

//@Component
public class ApoliceLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		
		FileReader file = new FileReader("Apolice.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
//			switch(campos[0].equalsIgnoreCase(linha)) {
//			
//			 case "A":
//				 
//				 break;
//			
//			 case "V":
//				 
//				 break;
//			
//			}
			
			
			linha = leitura.readLine();
		}
		leitura.close();
		
	}

}
