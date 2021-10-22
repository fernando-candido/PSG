package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Categoria;
import com.example.demo.repository.ICategoriaRepository;


@RestController
@RequestMapping(path = "/api")
public class CategoriaController {
	
	@Autowired
	private ICategoriaRepository repo;
	
	@GetMapping(path = "/categorias")
	public List<Categoria> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping(path = "/categorias/{id}")
	public Categoria getById(@PathVariable int id){
		return this.repo.findById(id).orElse(null);
		
	}
	
	
	@PostMapping(path = "/categorias")
	public Categoria post(@RequestBody Categoria categoria) {
		return this.repo.save(categoria);
	}
	
	@DeleteMapping("/categorias/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
			
		}
	}
	
	@PutMapping("/categorias")
	public Categoria put(@RequestBody Categoria novaCategoria) {
		return this.repo.findById(novaCategoria.getCategoriaID())
				.map(cat -> {
					cat.setCategoriaID(novaCategoria.getCategoriaID());
					cat.setDescricao(novaCategoria.getDescricao());
					cat.setDataDeInsercao(novaCategoria.getDataDeInsercao());
					return this.repo.save(cat);
				})
				.orElse(null);
		
	}
	

}
