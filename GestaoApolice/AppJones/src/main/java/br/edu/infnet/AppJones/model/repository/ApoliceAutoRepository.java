package br.edu.infnet.AppJones.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.ApoliceAuto;

@Repository
public interface ApoliceAutoRepository extends CrudRepository<ApoliceAuto, Integer> {

}
