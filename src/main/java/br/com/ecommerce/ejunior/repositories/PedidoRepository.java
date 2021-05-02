package br.com.ecommerce.ejunior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.ejunior.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
