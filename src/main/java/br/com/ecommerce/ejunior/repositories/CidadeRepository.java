package br.com.ecommerce.ejunior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ejunior.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
