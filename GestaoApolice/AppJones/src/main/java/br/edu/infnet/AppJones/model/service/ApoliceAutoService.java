package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.repository.ApoliceAutoRepository;

@Service
public class ApoliceAutoService {
	
	
	private ApoliceAutoRepository apoliceAutoRepository;
	
	public ApoliceAutoService(ApoliceAutoRepository apoliceAutoRepository) {
		
			this.apoliceAutoRepository = apoliceAutoRepository;
	}
	
	
	public void incluir(ApoliceAuto apoliceAuto) {
		apoliceAutoRepository.save(apoliceAuto);
		//System.out.println("Salvando A "+ apoliceAuto.getCarro().getAnoDeFabricacao());
	}
	
	public Collection<ApoliceAuto> exibir() {
		return (Collection<ApoliceAuto>) apoliceAutoRepository.findAll();
	}
	
	public ApoliceAuto obterPorId(Integer id) {
		return apoliceAutoRepository.findById(id).orElse(null);
		
	}

	public void exluir(Integer id) {
		apoliceAutoRepository.deleteById(id);
		
	}
	
	public long contador() {
		return apoliceAutoRepository.count();
	}
	
	public ApoliceAuto findByPlaca(String placa){
		return apoliceAutoRepository.findByPlaca(placa);
	}

}
