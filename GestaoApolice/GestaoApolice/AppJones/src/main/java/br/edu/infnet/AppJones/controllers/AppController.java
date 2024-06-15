package br.edu.infnet.AppJones.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.AppJones.model.service.ApoliceAutoService;
import br.edu.infnet.AppJones.model.service.ApoliceService;
import br.edu.infnet.AppJones.model.service.ApoliceVidaService;
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
	
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		
		return "home";
	}
	
	@GetMapping("/seguradora/listagem")
	public String listaSeguradora(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("listagem",seguradoraService.exibir());
		
		return "home";
	}
	
	@GetMapping("/apolice/listagem")
	public String listaApolice(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("listagem",apoliceService.exibir());
		
		return "home";
	}
	
	@GetMapping("/apoliceAuto/listagem")
	public String listaApoliceAuto(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("listagem",apoliceAutoService.exibir());
		
		return "home";
	}
	
	@GetMapping("/apoliceVida/listagem")
	public String listaApoliceVida(Model model) {
		
		model.addAttribute("qtdeSegurado",seguradoraService.contador());
		model.addAttribute("qtdeApolice",apoliceService.contador());
		model.addAttribute("qtdeApoliceAuto",apoliceAutoService.contador());
		model.addAttribute("qtdeApoliceVida",apoliceVidaService.contador());
		model.addAttribute("listagem",apoliceVidaService.exibir());
		
		return "home";
	}
	
	
	
}
