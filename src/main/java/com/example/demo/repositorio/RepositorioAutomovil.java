package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Automovil;

public interface RepositorioAutomovil extends JpaRepository<Automovil, Long>{


}