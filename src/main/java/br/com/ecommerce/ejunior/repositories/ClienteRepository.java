package br.com.ecommerce.ejunior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ejunior.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
