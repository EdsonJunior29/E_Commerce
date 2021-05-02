package br.com.ecommerce.ejunior.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ejunior.domain.Pedido;
import br.com.ecommerce.ejunior.repositories.PedidoRepository;
import br.com.ecommerce.ejunior.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
				", Tipo: " + Pedido.class.getName()));
	}

	public Pedido insert(Pedido obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Pedido update(Pedido obj) {
		findById(obj.getId());
		return repo.save(obj);
	}

	public void deleteById(Integer id) {
		findById(id);
		repo.deleteById(id);
	}

	
}
