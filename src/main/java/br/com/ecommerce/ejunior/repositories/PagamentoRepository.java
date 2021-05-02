package br.com.ecommerce.ejunior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ejunior.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
