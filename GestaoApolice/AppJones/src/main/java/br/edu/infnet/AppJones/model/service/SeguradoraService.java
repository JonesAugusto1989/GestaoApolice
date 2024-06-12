package br.edu.infnet.AppJones.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.repository.SeguradoraRepository;

@Service
public class SeguradoraService {

	private SeguradoraRepository seguradoraRepository;
	
	public SeguradoraService(SeguradoraRepository seguradoraRepository) {
		this.seguradoraRepository = seguradoraRepository;
	}
	
	public void incluir(Seguradora segurador) {
		seguradoraRepository.save(segurador);
	}
	
	public Collection<Seguradora> exibir() {
		return (Collection<Seguradora>) seguradoraRepository.findAll();
	}
	
	public Seguradora obterPorId(Integer id) {
		return seguradoraRepository.findById(id).orElse(null);
		
	}

	public void exluir(Integer id) {
		seguradoraRepository.deleteById(id);
		
	}
	
	
}
