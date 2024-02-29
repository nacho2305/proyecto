package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ADMINISTRADOR")

public class Administrador {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "usuario", length = 50, nullable = false)
	private Integer usuario;
	
	@Column(name = "contraseña", length = 80, nullable = false)
	private String contraseña;
	
	@Column(name = "listaReservaPorDia", length = 100, nullable = false, unique = true)
	private Integer listaReservaPorDia;
	
	@Column(name = "listaReservaAuto", length = 100, nullable = false, unique = true)
	private Integer listaReservaAuto;
	 
	@Column(name = "reservasCanceladas", length = 100, nullable = false, unique = true)
	private Integer reservasCanceladas;
	
	@Column(name = "registrarPagos", length = 100, nullable = false, unique = true)
	private Integer registrarPagos;
	
	@Column(name = "reserva", length = 100, nullable = false, unique = true)
	private Integer reserva;
	
	@Column(name = "modificarReserva", length = 100, nullable = false, unique = true)
	private Integer modificarReserva;
	
}	
