package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppJones.clients.ApiJonesClient;
import br.edu.infnet.AppJones.model.domain.Endereco;
import br.edu.infnet.AppJones.model.domain.Estado;
import br.edu.infnet.AppJones.model.domain.Municipio;

@Service
public class ApiService {
	
	@Autowired
	private ApiJonesClient apiJonesClient;
	
	
	
	public Endereco obterPorCep(String cep) {
		return apiJonesClient.obterPorCep(cep);
	}
	
	@GetMapping("/estados")
	public Collection<Estado> obterEstados() {
		return apiJonesClient.obterEstados();
	}
	
	@GetMapping("/{uf}/municipios")
	public Collection<Municipio> obterMunicipios(@PathVariable Integer uf) {
		return apiJonesClient.obterMunicipios(uf);
	}
	

}
