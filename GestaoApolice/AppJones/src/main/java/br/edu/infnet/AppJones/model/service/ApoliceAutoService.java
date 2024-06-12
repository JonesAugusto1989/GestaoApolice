package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.repository.ApoliceAutoRepository;

@Service
public class ApoliceAutoService {
	
	
	private ApoliceAutoRepository apoliceAutoRepository;
	
	public ApoliceAutoService(ApoliceAutoRepository apoliceAutoRepository) {
		this.apoliceAutoRepository = apoliceAutoRepository;
	}
	
	
	public void incluir(ApoliceAuto apoliceAuto) {
		apoliceAutoRepository.save(apoliceAuto);
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
	

}
