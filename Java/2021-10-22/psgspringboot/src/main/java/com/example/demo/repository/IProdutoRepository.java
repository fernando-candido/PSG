package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Produto;



public interface IProdutoRepository extends JpaRepository<Produto, Integer>{

}