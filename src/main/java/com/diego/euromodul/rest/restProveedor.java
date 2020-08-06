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

import com.diego.euromodul.interfaces.IProveedor;
import com.diego.euromodul.model.proveedor;

@RestController
@RequestMapping("/rest_proveedor")
public class restProveedor {

	@Autowired
	private IProveedor dataProoveedor;
	
	@GetMapping
	public List<proveedor> listar(){
		return (List<proveedor>)dataProoveedor.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody proveedor pro) {
		dataProoveedor.save(pro);
	}
	
	@PutMapping
	public void modificar(@RequestBody proveedor pro) {
		dataProoveedor.save(pro);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		dataProoveedor.deleteById(id);
	}
}
