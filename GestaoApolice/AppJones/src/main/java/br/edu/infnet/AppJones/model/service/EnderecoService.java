package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.clients.ApiJonesClient;

import br.edu.infnet.AppJones.model.domain.Endereco;
import br.edu.infnet.AppJones.model.repository.EnderecoRepository;



@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ApiJonesClient ApiJonesClient;
	
	
	public Collection<Endereco> exibir(){
		
		Collection<Endereco> findAll = (Collection<Endereco>)enderecoRepository.findAll();
		return findAll;
	}

	public long contador() {
		return enderecoRepository.count();
	}

}
