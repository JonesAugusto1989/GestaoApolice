package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.domain.Seguradora;


@Service
public class ApoliceAutoService {
	
	private static Map<Integer, ApoliceAuto> bancoAuto = new HashMap<Integer, ApoliceAuto>();
	private static Integer id=0;
	
	public void incluir(ApoliceAuto apoliceAuto) {
		apoliceAuto.setId(++id);
		bancoAuto.put(id,apoliceAuto);
	}
	
	public Collection<ApoliceAuto> exibir() {
		return bancoAuto.values();
	}
	

}
