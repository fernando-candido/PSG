package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.model.Funcionario;
import com.example.demo.repository.IFuncionarioRepository;

@RestController
@RequestMapping(path = "/api")
public class FuncionarioController {
	
	@Autowired
	private IFuncionarioRepository repo;
	
	// Select em todos
	@GetMapping(path = "/funcionarios" )
	public List<Funcionario> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping(path = "/funcionarios/{id}")
	public Funcionario getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	} 
	
	@GetMapping(path = "/funcionario/min")
	public Integer getMIN() {
		return this.repo.findByFuncionarioIDMIN();
	}
	
	// /{pagina}/{quantidade}
	
	//Pageable firtsPageWithTwoElementsPageable = PageRequest.of(pagina, quantidade);
	//Page<Funcionario> todos = repo.findAll(page);
	

	
	
	@GetMapping(path = "/funcionario/paginado")
	public Page<Funcionario> getAll(
			@RequestParam(value = "page", defaultValue= "0") Integer page,
			@RequestParam(value = "size", defaultValue= "10") Integer size
			){
		
		PageRequest pr = PageRequest.of(page, size, Sort.by("Nome"));
		Page<Funcionario> lista = this.repo.findAll(pr);
		return lista;		
	}
	

	
	@GetMapping(path = "/funcionario/max")
	public Integer getMAX() {
		return this.repo.findByFuncionarioIDMAX();
	}
	
	@PostMapping(path = "/funcionarios")
	public Funcionario post(@RequestBody Funcionario funcionario) {
		funcionario.setFuncionarioID(repo.findByFuncionarioIDMAX() + 1);
		return this.repo.save(funcionario);
	}
	
	@DeleteMapping ("/funcionarios/{id}")
	public String delete(@PathVariable int id) {
			if (this.repo.findById(id).orElse(null) != null) {
				this.repo.deleteById(id);
				return "Deletado";
			}
			else {
				return "Não possui registro";
			}
		
	}
	
	@PutMapping("/funcionarios")
	public Funcionario put(@RequestBody Funcionario novoFuncionario) {
		return this.repo.findById(novoFuncionario.getFuncionarioID())
				.map(fun -> {
					fun.setFuncionarioID(novoFuncionario.getFuncionarioID());
					fun.setChave(novoFuncionario.getChave());
					fun.setNome(novoFuncionario.getNome());
					fun.setSobreNome(novoFuncionario.getSobreNome());
					fun.setDataAdmissao(novoFuncionario.getDataAdmissao());
					fun.setSexo(novoFuncionario.getSexo());
					fun.setNascimento(novoFuncionario.getNascimento());
					fun.setEmail(novoFuncionario.getEmail());
					fun.setPaisID(novoFuncionario.getPaisID());
					fun.setCtps(novoFuncionario.getCtps());
					fun.setCtpsnum(novoFuncionario.getCtpsnum());
					fun.setCtpsserie(novoFuncionario.getCtpsserie());
					fun.setDataDeInsercao(novoFuncionario.getDataDeInsercao());


					
					return this.repo.save(fun);
				})
				.orElse(null);
		
	}		

}



//@GetMapping(path = "/funcionario/teste")
//public List<String> findByFuncionarioID() {
//	return this.repo.findByFuncionarioID();
//}
//
