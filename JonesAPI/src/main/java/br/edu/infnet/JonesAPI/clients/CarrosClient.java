package br.edu.infnet.JonesAPI.clients;

import java.util.Collection;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.JonesAPI.model.domain.Carro;

@FeignClient(url="https://api.api-ninjas.com/v1/cars",name="api-ninjas-car")
public interface CarrosClient {
	
	
	@GetMapping
	List<Carro> obterModelo(@RequestHeader("X-Api-Key") String chaveApi,@RequestParam int limit,@RequestParam("model") String modelo);
	
}
