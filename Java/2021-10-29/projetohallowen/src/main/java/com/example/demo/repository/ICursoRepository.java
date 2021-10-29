package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Curso;

public interface ICursoRepository extends JpaRepository<Curso, Integer>{

}
