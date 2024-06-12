package br.edu.infnet.AppJones.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.ApoliceVida;

@Repository
public interface ApoliceVidaRepository extends CrudRepository<ApoliceVida, Integer>{

}
