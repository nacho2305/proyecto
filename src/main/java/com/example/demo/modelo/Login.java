package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LOGIN")
	
public class Login {
		@Id
		@Column(name="id")
		private Long id;
		
		@Column(name = "correo", length = 50, nullable = false)
		private Integer correo;
		
		@Column(name = "contraseña", length = 80, nullable = false)
		private String contraseña;
	
	
}
