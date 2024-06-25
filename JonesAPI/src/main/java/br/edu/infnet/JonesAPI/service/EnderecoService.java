package br.edu.infnet.JonesAPI.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.JonesAPI.clients.EnderecoClient;
import br.edu.infnet.JonesAPI.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}

}
