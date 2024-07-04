package br.edu.infnet.AppJones.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppJones.model.domain.Carro;
import br.edu.infnet.AppJones.model.domain.Endereco;
import br.edu.infnet.AppJones.model.domain.Estado;
import br.edu.infnet.AppJones.model.domain.Municipio;



@FeignClient(url = "http://localhost:8081" ,name = "apiJones")
public interface ApiJonesClient {

	@GetMapping("/listagem")
	Collection<String> obterLista();
	
	@GetMapping("/cep/{cep}")
	public Endereco obterPorCep(@PathVariable String cep);

	@GetMapping("/carro/{carro}")
	public Carro obterModelo(@PathVariable String carro);
	
	@GetMapping("/estados")
	public Collection<Estado> obterEstados();
	
	@GetMapping("/{uf}/municipios")
	public Collection<Municipio> obterMunicipios(@PathVariable Integer uf);
	
	
}
