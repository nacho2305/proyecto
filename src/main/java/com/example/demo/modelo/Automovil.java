package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AUTOMOVIL")

public class Automovil {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "placa", length = 50, nullable = false)
	private Integer Placa;
	

	@Column(name = "cantidadDePuestos", length = 80, nullable = false)
	private Integer cantidadDePuestos;
	
	@Column(name = "disponibilidad", length = 100, nullable = false, unique = true)
	private String disponibilidad;
	
}

