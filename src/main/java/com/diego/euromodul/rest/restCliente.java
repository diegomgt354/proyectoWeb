package com.diego.euromodul.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.euromodul.interfaces.ICliente;
import com.diego.euromodul.model.cliente;

@RestController
@RequestMapping("/rest_cliente")
public class restCliente {
	
	@Autowired
	private ICliente dataCliente;
	
	@GetMapping
	public List<cliente> listar(){
		return (List<cliente>)dataCliente.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody cliente cli) {
		dataCliente.save(cli);
	}
	
	@PutMapping
	public void modificar(@RequestBody cliente cli) {
		dataCliente.save(cli);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		dataCliente.deleteById(id);
	}
}
