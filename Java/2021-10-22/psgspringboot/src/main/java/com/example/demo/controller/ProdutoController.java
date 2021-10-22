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
import com.example.demo.model.Produto;
import com.example.demo.repository.IProdutoRepository;


@RestController
@RequestMapping(path = "/api")
public class ProdutoController {
	
	@Autowired
	private IProdutoRepository repo;
	
	@GetMapping(path = "/produtos")
	public List<Produto> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping(path = "/produtos/{id}")
	public Produto getById(@PathVariable int id){
		return this.repo.findById(id).orElse(null);
		
	}
	
	
	@PostMapping("/produtos")
	public Produto post(@RequestBody Produto Produto) {
		return this.repo.save(Produto);
	}
	
	
	@DeleteMapping("/produtos/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
			
		}
	}
	
	@PutMapping("/produtos")
	public Produto put(@RequestBody Produto novaProduto) {
		return this.repo.findById(novaProduto.getProdutoID())
				.map(pro -> {
					pro.setProdutoID(novaProduto.getProdutoID());
					pro.setSubCategoriaID(novaProduto.getSubCategoriaID());
					pro.setCategoriaID(novaProduto.getCategoriaID());
					pro.setDescricao(novaProduto.getDescricao());
					pro.setDataDeInsercao(novaProduto.getDataDeInsercao());
					return this.repo.save(pro);
				})
				.orElse(null);
		
	}
	

}