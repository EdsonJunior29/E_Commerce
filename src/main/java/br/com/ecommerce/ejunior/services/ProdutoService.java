package br.com.ecommerce.ejunior.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ejunior.domain.Produto;
import br.com.ecommerce.ejunior.repositories.ProdutoRepository;
import br.com.ecommerce.ejunior.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public List<Produto> find() {
		List<Produto> list = repo.findAll();
		return list;
	}

	public Produto findById(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " ,Tipo:" 
		+  Produto.class.getName()));
	}
	
}
