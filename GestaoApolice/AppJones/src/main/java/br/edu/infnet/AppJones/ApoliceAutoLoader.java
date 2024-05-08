package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;

@Component
public class ApoliceAutoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Map<Integer, ApoliceAuto> BancoAuto = new HashMap<Integer, ApoliceAuto>();
		Integer id=0;
		
		FileReader file = new FileReader("ApoliceAuto.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
		
			ApoliceAuto ApoliceAuto = new ApoliceAuto();
			ApoliceAuto.setApoliceContratante(campos[0]);
		
			ApoliceAuto.setSeguradoraContratada(campos[1]);
			
			ApoliceAuto.setValor(Float.valueOf(campos[2]));
			
			ApoliceAuto.setNumero(campos[3]);
			
			ApoliceAuto.setPlaca(campos[4]);
			
			ApoliceAuto.setBeneficiario(campos[5]);
			ApoliceAuto.setId(++id);
			BancoAuto.put(id, ApoliceAuto);
			System.out.println(ApoliceAuto);
			linha = leitura.readLine();
		}
		for(ApoliceAuto apolice: BancoAuto.values()) {
			System.out.println("Banco Auto: "+ apolice);
		}
		
		leitura.close();
	}

}
