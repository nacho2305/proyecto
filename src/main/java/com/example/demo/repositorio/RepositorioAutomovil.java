package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Automovil;

public interface RepositorioAutomovil {
	@Repository
	public interface RepositorioEmpleado extends JpaRepository<Automovil, Long>{

		public List<Automovil> findByPlaca(String placa);
		public List<Automovil> findByCantidadDePuestos(String cantidadDePuestos);
		public List<Automovil> findByDisponibilidad(String disponibilidad);
	}
}
