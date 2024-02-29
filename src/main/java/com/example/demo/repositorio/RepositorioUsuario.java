package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Usuario;

public interface RepositorioUsuario {

	@Repository
	public interface RepositorioEmpleado extends JpaRepository<Usuario, Long>{

		public List<Usuario> findByNombre(String nombre);
		public List<Usuario> findByApellidos(String apellidos);
		public List<Usuario> findByCedula(String cedula);
		public List<Usuario> findByTelefono(String telefono);
		public List<Usuario> findByFechaNacimiento(String fechaNacimiento);
	}
}
