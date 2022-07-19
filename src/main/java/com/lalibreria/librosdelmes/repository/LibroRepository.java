package com.lalibreria.librosdelmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lalibreria.librosdelmes.domain.Libro;

//extendemos JPARepository
//primer parámetro: clase con la que trabaja, segundo: tipo de dato
public interface LibroRepository extends JpaRepository <Libro , Integer> {

}
