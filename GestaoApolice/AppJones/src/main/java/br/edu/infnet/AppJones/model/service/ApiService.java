package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.clients.ApiJonesClient;

@Service
public class ApiService {
	
	@Autowired
	private ApiJonesClient apiJonesClient;
	
	public Collection<String> obterLista() {
		return apiJonesClient.obterLista();
	//	return apiJonesClient.obterPorCep(cep);
	}

}
