package com.lalibreria.librosdelmes.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalibreria.librosdelmes.domain.Libro;
import com.lalibreria.librosdelmes.service.LibroService;

@Controller
public class ListaController {
	
	//creo un atributo final + constructor, que tiene un controlador. 
	//Cuando spring quiera utilizar el controller va instanciar e inyectar automáticamente el libroservice mediante el constructor/inyeccion de dependencias
	private final LibroService libroService;
	
	public ListaController(LibroService libroService) {
		super();
		this.libroService = libroService;
	}

	//informar a la vista(llamando al service)
	@RequestMapping("/")
	public String listarLibros(Model model) {
		List<Libro> recomendados = libroService.buscarRecomendados();
		model.addAttribute("libros", recomendados);
		return "lista";
	}
	

}
