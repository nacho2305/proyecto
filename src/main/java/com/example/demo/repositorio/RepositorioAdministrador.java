package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Administrador;

public interface RepositorioAdministrador {

	@Repository
	public interface RepositorioEmpleado extends JpaRepository<Administrador, Long>{

		public List<Administrador> findByUsuario(String usuario);
		public List<Administrador> findByContraseña(String contraseña);
		public List<Administrador> findByListaReservaPorDia(String listaReservaPorDia);
		public List<Administrador> findByListaReservaAuto(String listaReservaAuto);
		public List<Administrador> findByReservasCanceladas(String reservasCanceladas);
		public List<Administrador> findByRegistrarPagos(String registrarPagos);
		public List<Administrador> findByReserva(String reserva);
		public List<Administrador> findByModificarReserva(String modificarReserva);
	}
}
