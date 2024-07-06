package br.edu.infnet.JonesAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.JonesAPI.clients.CarrosClient;
import br.edu.infnet.JonesAPI.model.domain.Carro;

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
			
	}

}
