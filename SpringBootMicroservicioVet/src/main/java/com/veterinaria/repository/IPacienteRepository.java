package com.veterinaria.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.veterinaria.modelo.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {
	
}
