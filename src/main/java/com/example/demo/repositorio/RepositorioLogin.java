package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Login;

public interface RepositorioLogin {

	@Repository
	public interface RepositorioEmpleado extends JpaRepository<Login, Long>{

		public List<Login> findByCorreo(String correo);
		public List<Login> findBycontraseña(String contraseña);
	}
}
