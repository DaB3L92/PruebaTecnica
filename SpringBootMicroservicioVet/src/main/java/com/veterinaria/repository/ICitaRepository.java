package com.veterinaria.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.modelo.Cita;

public interface ICitaRepository extends JpaRepository<Cita, Integer> {

}
