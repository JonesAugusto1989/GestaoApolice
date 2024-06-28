package br.edu.infnet.AppJones.model.service;

import java.util.Collection;

import org.springframework.data.domain.Sort;
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

			seguradoraRepository.save(segurador);
	
		
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
	
	public Collection<Seguradora> buscarTodosPeloNome(String nome){
		return seguradoraRepository.findByNomeContaining(Sort.by(Sort.Direction.ASC, "nome"), nome);
	}

}
