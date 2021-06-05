package br.com.ecommerce.ejunior.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;

import br.com.ecommerce.ejunior.domain.Categoria;
import br.com.ecommerce.ejunior.dto.CategoriaDTO;
import br.com.ecommerce.ejunior.repositories.CategoriaRepository;
import br.com.ecommerce.ejunior.services.exceptions.ObjectNotFoundException;

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
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
				", Tipo: " + Categoria.class.getName()));
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		Categoria newObj = findById(obj.getId());
		updateData(newObj , obj);
		return repo.save(newObj);
	}

	public void deleteById(Integer id) {
		findById(id);
		repo.deleteById(id);
	}

	public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy , String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage , Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	//Método auxiliar que instancia categoria através do CategoriaDTO
	public Categoria fromDTO(CategoriaDTO objDto) {
		return new Categoria (objDto.getId() ,objDto.getNome());
	}
	
	private void updateData(Categoria newObj , Categoria obj) {
		newObj.setNome(obj.getNome());
	}
}
