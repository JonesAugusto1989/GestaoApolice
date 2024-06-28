package br.edu.infnet.JonesAPI.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.JonesAPI.model.domain.Carro;
import br.edu.infnet.JonesAPI.model.domain.Endereco;
import br.edu.infnet.JonesAPI.service.CarrosService;
import br.edu.infnet.JonesAPI.service.EnderecoService;

@RestController
public class ApiController {
	
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private CarrosService carrosService;
	
	@GetMapping("/listagem")
	public Collection<String> obterLista(){
		return new ArrayList<String>(Arrays.asList("Jones","Augusto", "Paranhos"));
	}

	@GetMapping("/cep/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		
		return enderecoService.obterPorCep(cep);
	}
	

	@GetMapping("/carro/{carro}")
	public Carro obterModelo(@PathVariable String carro) {

		
		Carro modelo = carrosService.obterModelo(carro);
	
		return modelo;
	}
	/*
	//estados/* 
	@GetMapping("/estados")
	public Collection<EStados> obterEstados(){
		return null;
	}
	*/
	//municipios/*
	
	/*
	 @GetMapping("{uf}/municipios")
	 public Collection<EStados> obterMunicipios(@PathVariable Integer uf){
		return null;
	}*/
}
