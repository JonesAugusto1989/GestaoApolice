package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.repository.ApoliceVidaRepository;

@Service
public class ApoliceVidaService {
	
	private ApoliceVidaRepository apoliceVidaRepository;
	
	public ApoliceVidaService( ApoliceVidaRepository apoliceVidaRepository) {
		this.apoliceVidaRepository = apoliceVidaRepository;
	}
	
	
	public void incluir(ApoliceVida apoliceVida) {
		
		try {
			apoliceVidaRepository.save(apoliceVida);
		}catch(Exception e) {
			System.err.println("[ERROR]" + e.getMessage());
		}
		
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
	
	public long contador() {
		return apoliceVidaRepository.count();
	}
	
	Collection<ApoliceVida> obterlista(){
		
		return apoliceVidaRepository.findAll(Sort.by(Sort.Direction.DESC,"cobertura"));
	}


}
