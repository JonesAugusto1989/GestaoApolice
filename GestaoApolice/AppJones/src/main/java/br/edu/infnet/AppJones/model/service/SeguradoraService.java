package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;

@Service
public class SeguradoraService {

	private static Map<Integer, Seguradora> bancoSeguradora = new HashMap<Integer, Seguradora>();
	private static Integer id=0;
	
	public void incluir(Seguradora segurador) {
		segurador.setId(++id);
		bancoSeguradora.put(segurador.getId(),segurador);
	}
	
	public Collection<Seguradora> exibir() {
		return bancoSeguradora.values();
	}
	
	public Seguradora obterPorId(Integer id) {
		return bancoSeguradora.get(id);
		
	}

	public void exluir(Integer id) {
		bancoSeguradora.remove(id);
		
	}
	
	
}
