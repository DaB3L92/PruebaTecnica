package com.veterinaria.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.modelo.Veterinario;

@Repository
public interface IVeterinarioRepository extends JpaRepository<Veterinario, Integer> {

}
