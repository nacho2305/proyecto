package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USUARIO")

public class Usuario {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "apellidos", length = 80, nullable = false)
	private String apellidos;
	
	@Column(name = "cedula", length = 100, nullable = false, unique = true)
	private Integer cedula;
	
	@Column(name = "telefono", length = 100, nullable = false, unique = true)
	private Integer telefono;
	
	@Column(name = "fechaNacimiento", length = 100, nullable = false, unique = true)
	private String fechaNacimiento;
}
