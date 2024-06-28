package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.clients.ApiJonesClient;
import br.edu.infnet.AppJones.model.domain.Carro;
import br.edu.infnet.AppJones.model.repository.CarroRepository;


@Service
public class CarroService {
	
	private CarroRepository carroRepository;
	
	@Autowired
	private ApiJonesClient apiJonesClient;
	
	public CarroService(CarroRepository carroRepository) {
		this.carroRepository = carroRepository;
	}

	
	public Carro obterModelo(String carro) {
		Carro carroModelo = apiJonesClient.obterModelo(carro);
		return carroModelo;
		
	}
	

	public Collection<Carro> exibirCarros(){
		Collection<Carro> listaCarros = (Collection<Carro>) carroRepository.findAll();
		return listaCarros;
	}
	
	public Carro incluir(Carro carro) {
		return carroRepository.save(carro);
	}
	

}
