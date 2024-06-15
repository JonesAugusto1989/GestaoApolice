package br.edu.infnet.AppJones;

import java.io.BufferedReader;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.ApoliceAutoService;

@Order(2)
@Component
public class ApoliceAutoLoader implements ApplicationRunner {
	
	@Autowired
	private ApoliceAutoService apoliceAutoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		
		FileReader file = new FileReader("files/ApoliceAuto.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
		
			ApoliceAuto apoliceAuto = new ApoliceAuto();
			apoliceAuto.setTipoSeguro("a");
			apoliceAuto.setApoliceContratante(campos[0]);	
			apoliceAuto.setSeguradoraContratada(campos[1]);	
			apoliceAuto.setValor(Float.valueOf(campos[2]));
			apoliceAuto.setBonusApolice(Integer.valueOf(campos[3]));
			apoliceAuto.setNumeroDaApolice(campos[4]);
			apoliceAuto.setPlaca(campos[5]);
			apoliceAuto.setBeneficiario(campos[6]);
			apoliceAuto.setVigenciaInicial(campos[7]);	
			apoliceAuto.setVigenciaFinal(campos[8]);
			apoliceAuto.setSegurado(new Seguradora(Integer.valueOf(campos[9])));
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
