package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LOGIN")
	
public class Login {
		@Id
		@Column(name="login")
		private Long id;
		
		
		@Column(name = "Contraseña", length = 80, nullable = false)
		private String Contraseña;


		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Login(Long id, String contraseña) {
			super();
			this.id = id;
			Contraseña = contraseña;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getContraseña() {
			return Contraseña;
		}


		public void setContraseña(String contraseña) {
			Contraseña = contraseña;
		}
		
		
	
	
}
