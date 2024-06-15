package br.edu.infnet.AppJones.model.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.Apolice;

@Repository
public interface ApoliceRepository extends CrudRepository<Apolice, Integer>{
	
	Collection<Apolice> findByApoliceContratante(String apoliceContratante);

}
