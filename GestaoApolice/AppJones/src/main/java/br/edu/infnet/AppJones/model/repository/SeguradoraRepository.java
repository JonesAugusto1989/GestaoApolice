package br.edu.infnet.AppJones.model.repository;


import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.Seguradora;

@Repository
public interface SeguradoraRepository extends CrudRepository<Seguradora, Integer>{

	Seguradora findByCpfCnpj(String cpfCnpj);
	
	Collection<Seguradora> findByNomeContaining(Sort by,String nome);
	
}
