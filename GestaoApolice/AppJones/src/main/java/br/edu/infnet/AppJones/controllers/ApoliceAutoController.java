package br.edu.infnet.AppJones.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;
import br.edu.infnet.AppJones.model.service.ApoliceAutoService;

@RestController
public class ApoliceAutoController {

	@Autowired
	private ApoliceAutoService apoliceAutoService;
	
	@GetMapping("/ApoliceAuto/exibir")
	public Collection<ApoliceAuto> exibir() {
		return apoliceAutoService.exibir();
	}
	
	@GetMapping("/ApoliceAuto/{id}")
	public ApoliceAuto obterPorId(@PathVariable Integer id) {
		return apoliceAutoService.obterPorId(id);
		
	}
	
	@PostMapping(value = "/ApoliceAuto/incluir")
	public void incluir(@RequestBody ApoliceAuto apoliceAuto) {
		System.out.println("####ApoliceAuto: " + apoliceAuto);
		apoliceAutoService.incluir(apoliceAuto);
	}
	
	@DeleteMapping("/ApoliceAuto/{id}/exluir")
	public void excluir(Integer id) {
		apoliceAutoService.exluir(id);
	}
	
}