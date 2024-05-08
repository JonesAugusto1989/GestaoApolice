package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;

@Component
public class ApoliceVidaLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<Integer, ApoliceVida> BancoVida = new HashMap<Integer, ApoliceVida>();
		Integer id=0;
		
		
		FileReader file = new FileReader("ApoliceVida.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
		
			ApoliceVida apolice = new ApoliceVida();
			apolice.setApoliceContratante((campos[0]));
			apolice.setSeguradoraContratada((campos[1]));
			apolice.setId(++id);
			valor.parseFloat(campos[2]);
			apolice.setValor(Float.valueOf(campos[2]));
			
			BancoVida.put(id, apolice);
			System.out.println(apolice);
			linha = leitura.readLine();
		}
		for(ApoliceVida apolice: BancoVida.values()) {
			System.out.println("Banco Vida: "+ apolice);
		}
		
		
		leitura.close();
	}

}
