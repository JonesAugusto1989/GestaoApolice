package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.clients.ApiJonesClient;
import br.edu.infnet.AppJones.model.domain.Apolice;
import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Carro;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.ApoliceService;
import br.edu.infnet.AppJones.model.service.CarroService;

@Component
public class ApoliceLoader implements ApplicationRunner{

	@Autowired
	ApoliceService apoliceService;
	@Autowired
	private ApiJonesClient apiJonesClient;
	@Autowired
	private CarroService carroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		
		FileReader file = new FileReader("files/ApolicesTodas.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		Float valor = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			
			switch(campos[0].toUpperCase()) {
			
			 case "A":
				 
				 DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 ApoliceAuto apoliceAuto = new ApoliceAuto();
				 apoliceAuto.setTipoSeguro(campos[0]);
				 apoliceAuto.setBeneficiario(campos[1]);
				 apoliceAuto.setNumeroDaApolice(campos[2]);
					
				 apoliceAuto.setSeguradoraContratada(campos[3]);
				 //Carro carro = apiJonesClient.obterModelo(campos[0]);
				 //apoliceAuto.setCarro(carro);
				 
				 apoliceAuto.setVigenciaInicial(campos[4]);
				
				 apoliceAuto.setVigenciaFinal(campos[5]);
				 apoliceAuto.setValor(Float.valueOf(campos[6]));
				 //apoliceAuto.setMarcaDoCarro(campos[7]);
				 apoliceAuto.setPlaca(campos[8]);
				 apoliceAuto.setBonusApolice(Integer.valueOf(campos[9]));
				 apoliceAuto.setSegurado(new Seguradora(Integer.valueOf(campos[10])));
				
				 
				 
				 apoliceService.incluir(apoliceAuto);
				 
				 break;
			
			 case "V":
				 DateTimeFormatter formatadorVida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 ApoliceVida apoliceVida = new ApoliceVida();
				 apoliceVida.setTipoSeguro(campos[0]);
				 apoliceVida.setBeneficiario(campos[1]);
				 apoliceVida.setNumeroDaApolice(campos[2]);
					
				 apoliceVida.setSeguradoraContratada(campos[3]);
				 
				 apoliceVida.setVigenciaInicial(campos[4]);
				 apoliceVida.setVigenciaFinal(campos[5]);
				 apoliceVida.setValor(Float.valueOf(campos[6]));
				 apoliceVida.setInternacional(Boolean.parseBoolean(campos[7]));
				 apoliceVida.setCobertura(campos[8]);
				 apoliceVida.setSegurado(new Seguradora(Integer.valueOf(campos[9])));
				 
				
				 String cobertura = campos[8];
			
				 apoliceVida.setCobertura(cobertura);
				 
				 apoliceService.incluir(apoliceVida);
				 break;
			
			}
			
			linha = leitura.readLine();
		}
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("|=|=|=|=|=|=|Banco com todas as Apolices:|=|=|=|=|=|=|");
		//for(Apolice bancoApolice: ApoliceService.bancoApolices.values()) {
			//System.out.println("terere"+bancoApolice);
	//	}
		//System.out.println(apoliceService.exibir());
		System.out.println();
		System.out.println("|=|=|=|=|=|=|=|=|=|=|=|=||=|=|=|=|=|=||=|=|=|=|=|=|=|=|");
		
		System.out.println();
		System.out.println();
		leitura.close();
		
	}

}
