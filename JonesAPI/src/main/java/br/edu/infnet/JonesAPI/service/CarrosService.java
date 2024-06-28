package br.edu.infnet.JonesAPI.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.JonesAPI.Exception.CarroNaoEncontradoException;
import br.edu.infnet.JonesAPI.clients.CarrosClient;
import br.edu.infnet.JonesAPI.model.domain.Carro;
import ch.qos.logback.core.status.StatusListenerAsList;

@Service
public class CarrosService {
	
	
	
	@Autowired
	private CarrosClient carrosClient;
	
	private int limit = 1;
	
	
	public Carro obterModelo(String model) {
		
		List<Carro> listaDeCarros = carrosClient.obterModelo("3Q56cB4YGiIMqYhfAiI6yQ==89lOw9epmqEoxb9S",limit,model);

		Carro carro = null;
		 

		 carro = listaDeCarros.get(0);
		
		 return carro;
		
//		 try {
//			 if(listaDeCarros.size()>0) {
//				 System.out.println("ENTROU NO CARROS LISTA CLIENTES");
//				 carro = listaDeCarros.get(0);
//				 System.out.println("IMPRESSAO DO CARRO "+ carro + " RETORNANDO");
//				 return carro;
//				 
//				 
//			 }else {
//				 throw new CarroNaoEncontradoException("Carro invalido");
//			 }
//			 	 
//		 }catch(CarroNaoEncontradoException e) {
//			 System.out.println("ENTROU NO CARROS CLIENTSSSSSSSSSSSSSS VAI RETORNAR carro padrão");
//			 carro.setModelo("carro padrao");
//			 carro.setFabricante("fabricante padrao");
//			 return null;
//		 }
		 
		
		 
		
	}

}
