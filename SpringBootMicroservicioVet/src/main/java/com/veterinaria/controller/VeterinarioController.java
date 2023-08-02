package com.veterinaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.modelo.Veterinario;
import com.veterinaria.repository.IVeterinarioRepository;



@RestController
@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RequestMapping({"veterinarios"})
public class VeterinarioController {
	@Autowired
	private IVeterinarioRepository repository;
	
	@GetMapping("listar")
	public List<Veterinario> listaVeterinarios(){
		List<Veterinario> veterinarios = (List<Veterinario>) repository.findAll();
		return veterinarios;
	}
	
	@PostMapping
	public Veterinario agregarVeterinario(@RequestBody Veterinario veterinario) {
		return repository.save(veterinario);
	}
	
	@GetMapping("/{id}")
	public Optional<Veterinario> getVeterinarioById(@PathVariable int id){
		return repository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Veterinario modificarVeterinario(@RequestBody Veterinario veterinario, @PathVariable int id) {
		veterinario.setId(id);
		return repository.save(veterinario);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarVeterinario(@PathVariable int id) {
		repository.deleteById(id);
	}
}
