package br.edu.infnet.AppJones.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.clients.LocalidadeClient;
import br.edu.infnet.AppJones.model.domain.Estado;
import br.edu.infnet.AppJones.model.domain.Municipio;

@Service
public class LocalidadeService {
	
	@Autowired
	private LocalidadeClient localidadeClient;
	
	public Collection<Estado> obterLista(){
	
		return localidadeClient.obterEstados();
	}
	
	public Collection<Municipio> obterMunicipiosPorUF(Integer uf){ 
		return localidadeClient.obterMunicipios(uf);
	}
	
	

}
