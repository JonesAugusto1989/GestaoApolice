package br.edu.infnet.AppJones.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.SeguradoraService;

@RestController
public class SeguradoraController {
	
	@Autowired
	private SeguradoraService seguradoraService;
	
	
	
	@GetMapping("/Seguradora/exibir")
	public Collection<Seguradora> exibir() {
		return seguradoraService.exibir();
	}
	
	@PostMapping("/Seguradora/incluir")
	public void incluir(@RequestBody Seguradora segurador) {
		seguradoraService.incluir(segurador);
		
	}
	
	@DeleteMapping("/Seguradora/{id}/excluir")
	public void exluir(@PathVariable("id") Integer id) {	
		seguradoraService.exluir(id);
	}
	
	@GetMapping("/Seguradora/{id}")
	public Seguradora obterPorId(@PathVariable("id") Integer id) {
		return seguradoraService.obterPorId(id);
	}
	
	
	
	@GetMapping("/Seguradora/{cpfcnpj}/cpfcnpj")
	public Seguradora BuscarPorCpfSegurador(@PathVariable String cpfcnpj) {
		
		
		return seguradoraService.obterPorCpfCnpj(cpfcnpj);
		
	}
	
	@GetMapping("/Seguradora/{nome}/buscaTodosPeloNomeAsc")
	public Collection<Seguradora> buscarTodosPeloNome(@PathVariable String nome){
		return seguradoraService.buscarTodosPeloNome(nome);
	}

}
