package br.edu.infnet.AppJones.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppJones.model.domain.Endereco;
import br.edu.infnet.AppJones.model.domain.Estado;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/",name = "ibge" )
public interface LocalidadeClient {

	@GetMapping("/estados?orderBy=nome")
	Collection<Estado> obterEstados();
	
	
	
}
