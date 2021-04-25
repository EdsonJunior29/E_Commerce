package br.com.ecommerce.ejunior.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ejunior.domain.Categoria;
import br.com.ecommerce.ejunior.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> find() {
		List<Categoria> list = repo.findAll();
		return list;
	}
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		findById(obj.getId());
		return repo.save(obj);
	}

	public void deleteById(Integer id) {
		findById(id);
		repo.deleteById(id);
	}

	
}
