package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Idioma;

public interface IIdiomaRepository extends JpaRepository<Idioma, Integer>{
	
	
	List<Idioma> findByIDBetween(Integer comeco, Integer fim);
	

}
