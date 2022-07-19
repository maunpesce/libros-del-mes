package com.lalibreria.librosdelmes.service;
import java.util.*;

import org.springframework.stereotype.Service;
import com.lalibreria.librosdelmes.domain.Libro;
import com.lalibreria.librosdelmes.repository.LibroRepository;

@Service
public class LibroService {
	
	//damos acceso al repository a través de la inyeccion de dependencias
	private final LibroRepository libroRepository;
	
	
	public LibroService(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}


	public List<Libro> buscarRecomendados() {
		return libroRepository.findAll();
		
		
	}

}
