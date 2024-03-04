package com.example.demo.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/ver/e1/")
@CrossOrigin(origins = "http://localhost:4200/")

public class UsuarioControlador {

	@Autowired
	private RepositorioUsuario repositorio;
	
	@GetMapping("/guardar")
	public List<Usuario> guardarUsuario(){
		Usuario e = new Usuario(123L, "jose","hernandez", 1054542366 , "3218593244" , "02/03/2005");
		this.repositorio.save(e);
		
		return this.repositorio.findAll();
	}
	
	@PostMapping("/guardarUsuario")
	public Usuario guardarUsuario(@RequestBody Usuario e){
		
		return this.repositorio.save(e);
	}
	
	@GetMapping("/cancelar")
	public String cancelarReserva() {
		this.repositorio.deleteById(123L);
		
		return "Reserva Cancelada";
	}
	
	@GetMapping("/consultar")
	public List<Usuario>verTodosUsuarios(){
		return repositorio.findAll();
	}
	
}