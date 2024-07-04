package br.edu.infnet.JonesAPI.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import br.edu.infnet.JonesAPI.clients.LocalidadeClient;
import br.edu.infnet.JonesAPI.model.domain.Estado;
import br.edu.infnet.JonesAPI.model.domain.Municipio;


@Service
public class LocalidadeService {
	
	private LocalidadeClient localidadeClient;
	
	public LocalidadeService(LocalidadeClient localidadeClient) {
		this.localidadeClient = localidadeClient;
		
	}
	
	
	public Collection<Estado> obterEstados(){
		return localidadeClient.obterEstados();
	}
	
	
	public Collection<Municipio> obterMunicipios(Integer uf){
		return localidadeClient.obterMunicipios(uf);
	}
	
	

}
