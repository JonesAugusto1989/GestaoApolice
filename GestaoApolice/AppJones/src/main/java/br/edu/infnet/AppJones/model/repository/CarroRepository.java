package br.edu.infnet.AppJones.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer>{
	
	//Carro findByCarro(Carro carro);

}
