package br.com.ecommerce.ejunior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ejunior.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
