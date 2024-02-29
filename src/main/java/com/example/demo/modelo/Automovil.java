package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AUTOMOVIL")

public class Automovil {

	@Id
	@Column(name="numero_placa")
	private Long id;
	

	@Column(name = "CantidadDePuestos", length = 80, nullable = false)
	private Integer CantidadDePuestos;
	
	@Column(name = "Puestos_Disponibles", length = 100, nullable = false, unique = true)
	private Integer Disponibilidad ;

	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(Long id, Integer cantidadDePuestos, Integer disponibilidad) {
		super();
		this.id = id;
		CantidadDePuestos = cantidadDePuestos;
		Disponibilidad = disponibilidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidadDePuestos() {
		return CantidadDePuestos;
	}

	public void setCantidadDePuestos(Integer cantidadDePuestos) {
		CantidadDePuestos = cantidadDePuestos;
	}

	public Integer getDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(Integer disponibilidad) {
		Disponibilidad = disponibilidad;
	}

	
}