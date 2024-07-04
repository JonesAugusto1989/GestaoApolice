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
import br.edu.infnet.JonesAPI.model.domain.Estado;
import br.edu.infnet.JonesAPI.model.domain.Municipio;
import br.edu.infnet.JonesAPI.service.CarrosService;
import br.edu.infnet.JonesAPI.service.EnderecoService;
import br.edu.infnet.JonesAPI.service.LocalidadeService;

@RestController
public class ApiController {
	
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private CarrosService carrosService;
	
	@Autowired
	private LocalidadeService localidadeService;

	@GetMapping("/cep/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		
		return enderecoService.obterPorCep(cep);
	}
	

	@GetMapping("/carro/{carro}")
	public Carro obterModelo(@PathVariable String carro) {

		
		Carro modelo = carrosService.obterModelo(carro);
	
		return modelo;
	}
	
	
	
	@GetMapping("/estados")
	public Collection<Estado> obterEstados(){
		return localidadeService.obterEstados();
	}
	
	@GetMapping("/{uf}/municipios")
	public Collection<Municipio> obterMunicipios(@PathVariable Integer uf){
		return localidadeService.obterMunicipios(uf);
	}
	
	
	
}
