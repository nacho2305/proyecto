package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Reserva;

public interface RepositorioReserva {

	@Repository
	public interface RepositorioEmpleado extends JpaRepository<Reserva, Long>{

		public List<Reserva> findByNumeroDePuesto(String numeroDePuesto);
		public List<Reserva> findByTotalAPagar(String totalAPagar);
		public List<Reserva> findByPlaca(String placa);
		public List<Reserva> findByFecha(String fecha);
		public List<Reserva> findByDestino(String destino);
		public List<Reserva> findByHoraDeSalida(String horaDeSalida);
	}
}
