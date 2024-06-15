package br.edu.infnet.AppJones.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;
import br.edu.infnet.AppJones.model.service.ApoliceVidaService;

@RestController
public class ApoliceVidaController {

	@Autowired
	private ApoliceVidaService apoliceVidaService;
	
	@GetMapping("/ApoliceVida/exibir")
	public Collection<ApoliceVida> exibir(){
		return apoliceVidaService.exibir();
	}
	
	@PostMapping("/ApoliceVida/incluir")
	public void incluir(@RequestBody ApoliceVida apoliceVida) {
		
		apoliceVidaService.incluir(apoliceVida);
	}
	
	@GetMapping("/ApoliceVida/{id}")
	public ApoliceVida obterPorId(@PathVariable("id") Integer id) {
		return apoliceVidaService.obterPorId(id);		
	}
	
	@DeleteMapping("/ApoliceVida/{id}/exluir")
	public void exluir(@PathVariable("id")Integer id) {
		apoliceVidaService.exluir(id);
		
	}

}
