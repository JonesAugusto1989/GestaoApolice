package br.edu.infnet.AppJones.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppJones.model.domain.Endereco;

@FeignClient(url = "http://localhost:8081" ,name = "apiJones")
public interface ApiJonesClient {

	@GetMapping("/listagem")
	Collection<String> obterLista();
	
	@GetMapping("/{cep}")
	public Endereco obterPorCep(@PathVariable String cep);
	
}
