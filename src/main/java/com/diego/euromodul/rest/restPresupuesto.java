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

import com.diego.euromodul.interfaces.IPresupuesto;
import com.diego.euromodul.model.presupuesto;

@RestController
@RequestMapping("/rest_presupuesto")
public class restPresupuesto {

	@Autowired
	private IPresupuesto dataPresupuesto;
	
	@GetMapping
	public List<presupuesto> listar(){
		return (List<presupuesto>)dataPresupuesto.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody presupuesto pre) {
		dataPresupuesto.save(pre);
	}
	
	@PutMapping
	public void modificar(@RequestBody presupuesto pre) {
		dataPresupuesto.save(pre);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		dataPresupuesto.deleteById(id);
	}
}
