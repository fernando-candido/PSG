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
import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@RestController
@RequestMapping(path = "/api")
public class UsuarioController {

	@Autowired
	private IUsuarioRepository repo;

	@GetMapping(path = "/Usuario")
	public List<Usuario> getAll() {
		return this.repo.findAll();
	}

	@GetMapping(path = "/Usuario/{id}")
	public Usuario getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}

	@PostMapping(path = "/Usuario")
	public Usuario post(@RequestBody Usuario Usuario) {
		return this.repo.save(Usuario);
	}

	@DeleteMapping("/Usuario/{id}")
	public String delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
			return "Deletado";
		} else {
			return "Não possui registro";
		}

	}

	@PutMapping("/Usuario")
	public Usuario put(@RequestBody Usuario novoUsuario) {
		return this.repo.findById(novoUsuario.getId()).map(n -> {
			n.setId(novoUsuario.getId());
			n.setNome(novoUsuario.getNome());
			n.setCep(novoUsuario.getCep());
			n.setIdade(novoUsuario.getIdade());
			n.setCidade(novoUsuario.getCidade());
			n.setEstado(novoUsuario.getEstado());
			n.setLogradouro(novoUsuario.getLogradouro());
			n.setBairro(novoUsuario.getBairro());
			n.setNumero(novoUsuario.getNumero());

			return this.repo.save(n);
		}).orElse(null);

	}

}
