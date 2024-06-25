package br.edu.infnet.JonesAPI.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.JonesAPI.model.domain.Endereco;
import br.edu.infnet.JonesAPI.service.EnderecoService;

@RestController

public class ApiController {
	
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping("/listagem")
	public Collection<String> obterLista(){
		return new ArrayList<String>(Arrays.asList("Jones","Augusto", "Paranhos"));
	}

	@GetMapping("/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		
		return enderecoService.obterPorCep(cep);
	}
	
}
