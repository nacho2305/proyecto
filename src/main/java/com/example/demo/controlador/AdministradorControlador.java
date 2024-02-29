package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repositorio.RepositorioAdministrador;

@RestController
	@RequestMapping("/ver/e1/")
public class AdministradorControlador {
	@Autowired
	private RepositorioAdministrador repositorio;
}
