package br.edu.infnet.AppJones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppJones.clients.ApiJonesClient;
import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Endereco;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.ApoliceAutoService;
import br.edu.infnet.AppJones.model.service.ApoliceVidaService;
import br.edu.infnet.AppJones.model.service.CarroService;
import br.edu.infnet.AppJones.model.service.EnderecoService;
import br.edu.infnet.AppJones.model.service.SeguradoraService;

@Order(1)
@Component
public class SeguradoraLoader implements ApplicationRunner{

	@Autowired
	private SeguradoraService seguradoraService;
	@Autowired
	private ApoliceVidaService apoliceVidaService;
	@Autowired
	private ApoliceAutoService apoliceAutoService;
	@Autowired
	private EnderecoService enderecoService;
	@Autowired
	private CarroService carroService;
	
	@Autowired
	private ApiJonesClient apiJonesClient;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/Seguradora.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		
		Seguradora segurador = null;
		while(linha!=null) {
			
			campos = linha.split(";");
			
			switch (campos[0].toUpperCase()) {
			
				case "S": 
					
					Endereco endereco = apiJonesClient.obterPorCep(campos[4]);
					segurador = new Seguradora();
					segurador.setCpf_cnpj(campos[1]);
					segurador.setNome(campos[2]);
					segurador.setEmail(campos[3]);
					segurador.setEndereco(endereco);
					
					seguradoraService.incluir(segurador);
					
					break;
					
				 case "A":
					 
					 ApoliceAuto apoliceAuto = new ApoliceAuto();
					 DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					 apoliceAuto.setTipoSeguro(campos[0]);
					 apoliceAuto.setBeneficiario(campos[1]);
					 apoliceAuto.setNumeroDaApolice(campos[2]);
						
					 apoliceAuto.setSeguradoraContratada(campos[3]);
					 
					
					 apoliceAuto.setVigenciaInicial(campos[4]);
				
					 apoliceAuto.setVigenciaFinal(campos[5]);
					 apoliceAuto.setValor(Float.valueOf(campos[6]));
					 //apoliceAuto.setMarcaDoCarro(campos[7]);
					 //Carro carro = carroService.obterModelo(campos[7]);
					 apoliceAuto.setCarro(apiJonesClient.obterModelo(campos[7]));

					 //Carro carro = new Carro();
					 //carro.setModelo("carro");
					
					 //apoliceAuto.setCarro(carro);
					 System.out.println("get carro: "+ apoliceAuto.getCarro());
					 apoliceAuto.setPlaca(campos[8]);
					 apoliceAuto.setBonusApolice(Integer.valueOf(campos[9]));
					 
					 segurador.getApolices().add(apoliceAuto);		
					 apoliceAuto.setSegurado(segurador);
					 
					 apoliceAutoService.incluir(apoliceAuto);
					 
					break;
					
				 case "V":
					 ApoliceVida apoliceVida = new ApoliceVida();
					 DateTimeFormatter formatadorVida = DateTimeFormatter.ofPattern("dd/MM/yyyy");					
					 apoliceVida.setTipoSeguro(campos[0]);
					 apoliceVida.setBeneficiario(campos[1]);
					 apoliceVida.setNumeroDaApolice(campos[2]);
						
					 apoliceVida.setSeguradoraContratada(campos[3]);
					 
					
					 apoliceVida.setVigenciaInicial(campos[4]);
					 
					 apoliceVida.setVigenciaFinal(campos[5]);
					 apoliceVida.setValor(Float.valueOf(campos[6]));
					 apoliceVida.setInternacional(Boolean.parseBoolean(campos[7]));
					 
					 
					 apoliceVida.setSegurado(segurador);
					 String cobertura = campos[8];
					 
					
				
					 apoliceVida.setCobertura(cobertura);
					 apoliceVida.setSegurado(segurador);
					 apoliceVidaService.incluir(apoliceVida);
					 segurador.getApolices().add(apoliceVida);

			 break;
				
			
			default:
				System.err.println("Linhas: " + Arrays.asList(campos));
			}
				
			
			linha = leitura.readLine();
			
			
		}
		leitura.close();
		System.out.println("=====================================");
		System.out.println("Iniciando o processamento de Seguradora: ");
		
		for(Seguradora seguradora : seguradoraService.exibir()) {
			
			System.out.println("Banco Seguradora Service: "+seguradora);
		}
		
		System.out.println("Processamento finalizado com sucesso.");
		System.out.println("=====================================");
	}
	
}
