package br.com.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cliente.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
