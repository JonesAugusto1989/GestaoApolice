package br.edu.infnet.AppJones.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.clients.LocalidadeClient;
import br.edu.infnet.AppJones.model.domain.Estado;

@Service
public class EstadoService {
	
	@Autowired
	private LocalidadeClient localidadeClient;
	
	public Collection<Estado> obterLista(){
		/*
		List<Estado> lista = new ArrayList<Estado>(
				Arrays.asList(new Estado("RO","Rondônia"),new Estado("AC", "Acre"))			
				);
				return (Collection<Estado>) lista;
		*/
		return localidadeClient.obterEstados();
	}
	
	

}
