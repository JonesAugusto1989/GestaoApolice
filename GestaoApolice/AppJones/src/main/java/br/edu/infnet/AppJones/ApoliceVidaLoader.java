package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.ApoliceVidaService;

@Order(3)
@Component
public class ApoliceVidaLoader implements ApplicationRunner{

	@Autowired
	private ApoliceVidaService apoliceVidaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Integer id=0;
		
		
		FileReader file = new FileReader("files/ApoliceVida.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
		
			ApoliceVida apoliceVida = new ApoliceVida();
			apoliceVida.setTipoSeguro("v");
			apoliceVida.setApoliceContratante((campos[0]));
			apoliceVida.setSeguradoraContratada((campos[1]));
			valor.parseFloat(campos[2]);
			apoliceVida.setValor(Float.valueOf(campos[2]));
			apoliceVida.setCobertura(List.of(campos[3]));
			apoliceVida.setBeneficiario(campos[4]);
			apoliceVida.setVigenciaInicial(campos[5]);	
			apoliceVida.setVigenciaFinal(campos[6]);
			apoliceVida.setSegurado(new Seguradora(Integer.valueOf(campos[7])));
			apoliceVidaService.incluir(apoliceVida);
		
			linha = leitura.readLine();
		}
		
	
		
		for(ApoliceVida apolice: apoliceVidaService.exibir()) {
			
			System.out.println("Banco Vida: "+ apolice);
		}
		
		
		
		leitura.close();
	}

}
