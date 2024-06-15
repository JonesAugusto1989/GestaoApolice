package br.edu.infnet.AppJones.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppJones.model.domain.Seguradora;

@Repository
public interface SeguradoraRepository extends CrudRepository<Seguradora, Integer>{

}
