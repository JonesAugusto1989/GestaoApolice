package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;

@Service
public class ApoliceVidaService {
	
	private static Map<Integer, ApoliceVida> bancoVida = new HashMap<Integer, ApoliceVida>();
	private static Integer id=0;
	
	public void incluir(ApoliceVida apoliceVida) {
		apoliceVida.setId(++id);
		bancoVida.put(id,apoliceVida);
	}
	
	public Collection<ApoliceVida> exibir() {
		return bancoVida.values();
	}
	

}
