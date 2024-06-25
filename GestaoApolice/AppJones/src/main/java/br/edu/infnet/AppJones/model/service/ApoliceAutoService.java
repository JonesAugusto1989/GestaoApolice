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
		
		try {
			this.apoliceAutoRepository = apoliceAutoRepository;
		}catch(Exception e) {
			System.err.println("[ERROR]" + e.getMessage());
		}
		
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
	
	public long contador() {
		return apoliceAutoRepository.count();
	}
	
	public ApoliceAuto findByPlaca(String placa){
		return apoliceAutoRepository.findByPlaca(placa);
	}
	
	public Collection <ApoliceAuto> findAllByMarca(String marcaDoCarro){
		
		return apoliceAutoRepository.findAllByMarcaDoCarro(Sort.by(Sort.Direction.DESC,"placa"),marcaDoCarro);
		
	}

}
