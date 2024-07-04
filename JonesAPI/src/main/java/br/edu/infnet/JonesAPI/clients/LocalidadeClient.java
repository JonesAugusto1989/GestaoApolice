package br.edu.infnet.JonesAPI.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.JonesAPI.model.domain.Estado;
import br.edu.infnet.JonesAPI.model.domain.Municipio;


@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/",name = "ibge" )
public interface LocalidadeClient {

	@GetMapping("/estados?orderBy=nome")
	Collection<Estado> obterEstados();
	
	@GetMapping("/estados/{uf}/municipios")
	Collection<Municipio> obterMunicipios(@PathVariable("uf") Integer uf);
	
	
}
