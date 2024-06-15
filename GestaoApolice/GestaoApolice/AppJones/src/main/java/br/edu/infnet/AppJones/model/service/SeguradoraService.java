package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.repository.SeguradoraRepository;

@Service
public class SeguradoraService {

	private SeguradoraRepository seguradoraRepository;
	
	public SeguradoraService(SeguradoraRepository seguradoraRepository) {
		this.seguradoraRepository = seguradoraRepository;
	}
	
	public void incluir(Seguradora segurador) {
		
		try {
		
			seguradoraRepository.save(segurador);
		}catch(Exception e) {
			System.err.println("[ERROR]" + e.getMessage());
		}
		
	}
	
	public Collection<Seguradora> exibir() {
		return (Collection<Seguradora>) seguradoraRepository.findAll();
	}
	
	public Seguradora obterPorId(Integer id) {
		return seguradoraRepository.findById(id).orElse(null);
		
	}
	
	public Seguradora obterPorCpfCnpj(String cpfCnpj) {
		return seguradoraRepository.findByCpfCnpj(cpfCnpj);
		
	}

	public void exluir(Integer id) {
		seguradoraRepository.deleteById(id);
		
	}
	
	public long contador() {
		return seguradoraRepository.count();
	}

}
