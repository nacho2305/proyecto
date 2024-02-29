package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="RESERVA")
	
	public class Reserva {

		@Id
		@Column(name="id")
		private Long id;
		
		@Column(name = "numeroDePuesto", length = 50, nullable = false)
		private Integer numeroDePuesto;
		

		@Column(name = "totalAPagar", length = 80, nullable = false)
		private Integer totalAPagar;
		
		@Column(name = "placa", length = 100, nullable = false, unique = true)
		private Integer placa;
		
		@Column(name = "fecha", length = 100, nullable = false, unique = true)
		private Integer fecha;
		
		@Column(name = "destino", length = 100, nullable = false, unique = true)
		private String destino;
		
		@Column(name = "horaDeSalida", length = 100, nullable = false, unique = true)
		private String horaDeSalida ;
		
		
	}
