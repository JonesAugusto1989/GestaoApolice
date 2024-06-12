package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.repository.ApoliceVidaRepository;

@Service
public class ApoliceVidaService {
	
	private ApoliceVidaRepository apoliceVidaRepository;
	
	public ApoliceVidaService( ApoliceVidaRepository apoliceVidaRepository) {
		this.apoliceVidaRepository = apoliceVidaRepository;
	}
	
	
	public void incluir(ApoliceVida apoliceVida) {
		apoliceVidaRepository.save(apoliceVida);
	}
	
	public Collection<ApoliceVida> exibir() {
		return (Collection<ApoliceVida>) apoliceVidaRepository.findAll();
	}
	
	public ApoliceVida obterPorId(Integer id) {
		return apoliceVidaRepository.findById(id).orElse(null);
		
	}

	public void exluir(Integer id) {
		apoliceVidaRepository.deleteById(id);
		
	}
	

}
