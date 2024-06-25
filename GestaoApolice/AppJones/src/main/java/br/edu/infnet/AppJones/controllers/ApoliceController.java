package br.edu.infnet.AppJones.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.AppJones.model.domain.Apolice;
import br.edu.infnet.AppJones.model.service.ApoliceService;

@RestController
@RequestMapping("Apolice")
public class ApoliceController {
	
	@Autowired
	private ApoliceService apoliceService;
	
	
	@GetMapping("/exibir")
	public Collection<Apolice> exibir(){
		return apoliceService.exibir();
		
	}
	
	@GetMapping("/obterPorId/{id}")
	public Apolice obterPorId(@PathVariable Integer id) {
		return apoliceService.obterPorId(id);
	}

	@DeleteMapping("/{id}/excluir")
	public void excluirPorId(@PathVariable("id") Integer id) {
		apoliceService.excluir(id);
	}
	
	@GetMapping("/{apolice}/numeroDaApolice")
	public Apolice BuscarNumeroDaApolice(@PathVariable String apolice) {
	System.out.println(apoliceService.findByNumeroDaApolice(apolice));
		return apoliceService.findByNumeroDaApolice(apolice);
		
	}
	
	
	@GetMapping("/buscarTodosPorTipoSeguroDesc")
	public Collection<Apolice> buscarTodosPorTipoSeguroDesc(){
		
		return apoliceService.buscarTodosPorTipoSeguroDesc();
	}
	
	
}
