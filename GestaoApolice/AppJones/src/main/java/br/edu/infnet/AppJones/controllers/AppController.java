package br.edu.infnet.AppJones.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import antlr.collections.List;
import br.edu.infnet.AppJones.model.domain.Apolice;
import br.edu.infnet.AppJones.model.domain.Estado;
import br.edu.infnet.AppJones.model.domain.Seguradora;
import br.edu.infnet.AppJones.model.service.ApiService;
import br.edu.infnet.AppJones.model.service.ApoliceAutoService;
import br.edu.infnet.AppJones.model.service.ApoliceService;
import br.edu.infnet.AppJones.model.service.ApoliceVidaService;
import br.edu.infnet.AppJones.model.service.EnderecoService;

import br.edu.infnet.AppJones.model.service.SeguradoraService;

@Controller
public class AppController {
	
	@Autowired
	private SeguradoraService seguradoraService;
	
	@Autowired
	private ApoliceService apoliceService;
	
	@Autowired
	private ApoliceAutoService apoliceAutoService;
	
	@Autowired
	private ApoliceVidaService apoliceVidaService;
	
	@Autowired
	private EnderecoService enderecoService;
		
	@Autowired
	private ApiService apiService;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		
	
		model.addAttribute("estados",apiService.obterEstados());
		
		return "home";
	}
	
	@GetMapping("/seguradora/listagem")
	public String listaSeguradora(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		model.addAttribute("listagem",seguradoraService.exibir());
		
		return "home";
	}
	
	@GetMapping("/apolice/listagem")
	public String listaApolice(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		model.addAttribute("listagem",apoliceService.exibir());
		
		return "home";
	}
	
	@GetMapping("/apoliceAuto/listagem")
	public String listaApoliceAuto(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		model.addAttribute("listagem",apoliceAutoService.exibir());
		
		return "home";
	}
	
	@GetMapping("/apoliceVida/listagem")
	public String listaApoliceVida(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		model.addAttribute("listagem",apoliceVidaService.exibir());
		
		return "home";
	}
	
	
	@GetMapping("/endereco/listagem")
	public String listaEnderecos(Model model) {
		
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("listagem",enderecoService.exibir());
		model.addAttribute("Titulo","Listagem de endereços");
		
		return "home";
	}
	@GetMapping(value = "/estado/listagem")
	public String listaEstados(Model model){
		
		model.addAttribute("titulo", "Listagem de Estados");
		model.addAttribute("listagem", apiService.obterEstados());
		
		return home(model);
	}

	
	@GetMapping("/municipio/listagem")
	public String listaMunicipios(Model model, @RequestParam Integer uf) {
		
		model.addAttribute("qtdeEndereco",enderecoService.contador());
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		
		
		model.addAttribute("Titulo","Listagem de municipios");
		model.addAttribute("listagem",apiService.obterMunicipios(uf));
		return "home";
	}
	
	

	
}
