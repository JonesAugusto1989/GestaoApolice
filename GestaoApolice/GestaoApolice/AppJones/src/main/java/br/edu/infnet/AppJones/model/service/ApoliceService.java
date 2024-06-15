package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.Apolice;
import br.edu.infnet.AppJones.model.repository.ApoliceRepository;

@Service
public class ApoliceService {
	
	private ApoliceRepository apoliceRepository;
	
	public ApoliceService(ApoliceRepository apoliceRepository) {
		this.apoliceRepository = apoliceRepository;
	}

	
	public void incluir(Apolice apolice) {

		apoliceRepository.save(apolice);	
	}
	
	
	public Collection<Apolice> exibir(){
		
		Collection<Apolice> findAll = (Collection<Apolice>)apoliceRepository.findAll();
		return findAll;
	}
	
	public Apolice obterPorId(Integer id) {
		return apoliceRepository.findById(id).orElse(null);
	}
	
	public void excluir(Integer id) {
		apoliceRepository.deleteById(id);
	}
	
	public long contador() {
		return apoliceRepository.count();
	}


}
