package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.model.domain.Apolice;
import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;

//@Component
public class ApoliceLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<Integer, Apolice> bancoApolices = new HashMap<Integer, Apolice>();
		Integer id=0;
		
		FileReader file = new FileReader("ApolicesTodas.txt");
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
				 apoliceAuto.setApoliceContratante(campos[2]);
					
				 apoliceAuto.setSeguradoraContratada(campos[3]);
				 
				 LocalDate dataInicial = LocalDate.parse(campos[4],formatador);
				 apoliceAuto.setVigenciaInicial(dataInicial);
				 LocalDate dataFinal = LocalDate.parse(campos[5],formatador);
				 apoliceAuto.setVigenciaFinal(dataFinal);
				 apoliceAuto.setValor(Float.valueOf(campos[6]));
				 apoliceAuto.setNumero(campos[7]);
				 apoliceAuto.setPlaca(campos[8]);
				 apoliceAuto.setBonusApolice(Integer.valueOf(campos[9]));
				
			
				 apoliceAuto.setId(++id);
				 bancoApolices.put(id, apoliceAuto);
				 break;
			
			 case "V":
				 DateTimeFormatter formatadorVida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 ApoliceVida apoliceVida = new ApoliceVida();
				 apoliceVida.setTipoSeguro(campos[0]);
				 apoliceVida.setBeneficiario(campos[1]);
				 apoliceVida.setApoliceContratante(campos[2]);
					
				 apoliceVida.setSeguradoraContratada(campos[3]);
				 
				 LocalDate dataInicialVida = LocalDate.parse(campos[4],formatadorVida); 
				 apoliceVida.setVigenciaInicial(dataInicialVida);
				 LocalDate dataFinalVida = LocalDate.parse(campos[5],formatadorVida);
				 apoliceVida.setVigenciaFinal(dataFinalVida);
				 apoliceVida.setValor(Float.valueOf(campos[6]));
				 apoliceVida.setInternacional(Boolean.parseBoolean(campos[7]));
				 
				 String linhaSub = campos[8];
				 int i=0;
				 
				 List<String> cobertura = new ArrayList<String>();
				 String[] subcampos;
				 subcampos = linhaSub.split(",");
				 while(linhaSub!=null) {
					 
					 
					
					if(i >= subcampos.length-1) {
						linhaSub = null;
					}else {
						cobertura.add(subcampos[i]);
					}
					 i++;		 
					
					 
				 }
			
				 apoliceVida.setCobertura(cobertura);
				 bancoApolices.put(id, apoliceVida);
				 break;
			
			}
			
			linha = leitura.readLine();
		}
		System.out.println();
		System.out.println();
		
		System.out.println("|=|=|=|=|=|=|Banco com todas as Apolices:|=|=|=|=|=|=|");
		System.out.println();
		for(Apolice apolice: bancoApolices.values()) {
			System.out.println("Banco com todas as Apolices: "+ apolice);
		}
		System.out.println();
		System.out.println("|=|=|=|=|=|=|=|=|=|=|=|=||=|=|=|=|=|=||=|=|=|=|=|=|=|=|");
		
		System.out.println();
		System.out.println();
		leitura.close();
		
	}

}
