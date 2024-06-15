package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

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
		
		try {
			apoliceRepository.save(apolice);
		}catch(Exception e) {
			System.err.println("[ERROR]" + e.getMessage());
		}

			
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
	
	public Collection<Apolice> findByApoliceContratante(String apoliceContratante) {
		System.out.println(apoliceRepository.findByApoliceContratante(apoliceContratante));
		return apoliceRepository.findByApoliceContratante(apoliceContratante);
	}


}
