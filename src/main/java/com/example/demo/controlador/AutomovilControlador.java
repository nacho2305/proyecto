package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Automovil;
import com.example.demo.repositorio.RepositorioAutomovil;


@RestController
@RequestMapping("/ver/e3/")
public class AutomovilControlador {
	
	@Autowired
	private RepositorioAutomovil repositorio;
	
	
	@GetMapping("/guardar")
	public List<Automovil> guardarAutomovil(){
		Automovil e = new Automovil(012L,20,5);
		this.repositorio.save(e);
		
		return this.repositorio.findAll();
	}
	
	@GetMapping("/borrar")
	public String borrarAutomovil() {
		this.repositorio.deleteById(123L);
		
		return "Automovil Borrado";
	}
	
	@GetMapping("/consultar")
	public List<Automovil>verTodosCarros(){
		return repositorio.findAll();
	}
		
	@GetMapping("/actualizar")
	public Automovil actualizarCarro() {
	Automovil e= this.repositorio.findById(123L).get();
	e.setDisponibilidad(5);
	this.repositorio.save(e);
	return this.repositorio.findById(123L).get();
}

}