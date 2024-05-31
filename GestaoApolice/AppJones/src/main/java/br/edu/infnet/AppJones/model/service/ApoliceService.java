package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.Apolice;

@Service
public class ApoliceService {
	
	private static Map<Integer, Apolice> bancoApolices = new HashMap<Integer, Apolice>();
	private static Integer idApolice=0;
	
	public void incluir(Apolice apolice) {
		apolice.setId(++idApolice);
		bancoApolices.put(apolice.getId(), apolice);
		
	}
	
	
	public Collection<Apolice> exibir(){
		
		return bancoApolices.values();
	}
	
	public Apolice obterPorId(Integer id) {
		return bancoApolices.get(id);
	}
	
	public void excluir(Integer id) {
		bancoApolices.remove(id);
	}

}
