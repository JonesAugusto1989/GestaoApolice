package br.edu.infnet.AppJones.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.Apolice;

@Repository
public interface ApoliceRepository extends CrudRepository<Apolice, Integer>{
	
	Apolice findByNumeroDaApolice(String numeroDaApolice);
	
	Collection<Apolice> findAll(Sort by);
	
	

}
